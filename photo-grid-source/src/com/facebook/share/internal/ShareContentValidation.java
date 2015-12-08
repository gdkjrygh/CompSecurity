// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class ShareContentValidation
{

    private static Validator DefaultValidator;
    private static Validator WebShareValidator;

    public ShareContentValidation()
    {
    }

    private static Validator getDefaultValidator()
    {
        if (DefaultValidator == null)
        {
            DefaultValidator = new Validator(null);
        }
        return DefaultValidator;
    }

    private static Validator getWebShareValidator()
    {
        if (WebShareValidator == null)
        {
            WebShareValidator = new WebShareValidator(null);
        }
        return WebShareValidator;
    }

    private static void validate(ShareContent sharecontent, Validator validator)
    {
        if (sharecontent == null)
        {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (sharecontent instanceof ShareLinkContent)
        {
            validator.validate((ShareLinkContent)sharecontent);
        } else
        {
            if (sharecontent instanceof SharePhotoContent)
            {
                validator.validate((SharePhotoContent)sharecontent);
                return;
            }
            if (sharecontent instanceof ShareVideoContent)
            {
                validator.validate((ShareVideoContent)sharecontent);
                return;
            }
            if (sharecontent instanceof ShareOpenGraphContent)
            {
                validator.validate((ShareOpenGraphContent)sharecontent);
                return;
            }
        }
    }

    public static void validateForApiShare(ShareContent sharecontent)
    {
        validate(sharecontent, getDefaultValidator());
    }

    public static void validateForMessage(ShareContent sharecontent)
    {
        validate(sharecontent, getDefaultValidator());
    }

    public static void validateForNativeShare(ShareContent sharecontent)
    {
        validate(sharecontent, getDefaultValidator());
    }

    public static void validateForWebShare(ShareContent sharecontent)
    {
        validate(sharecontent, getWebShareValidator());
    }

    private static void validateLinkContent(ShareLinkContent sharelinkcontent, Validator validator)
    {
        sharelinkcontent = sharelinkcontent.getImageUrl();
        if (sharelinkcontent != null && !Utility.isWebUri(sharelinkcontent))
        {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        } else
        {
            return;
        }
    }

    private static void validateOpenGraphAction(ShareOpenGraphAction shareopengraphaction, Validator validator)
    {
        if (shareopengraphaction == null)
        {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        }
        if (Utility.isNullOrEmpty(shareopengraphaction.getActionType()))
        {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        } else
        {
            validator.validate(shareopengraphaction, false);
            return;
        }
    }

    private static void validateOpenGraphContent(ShareOpenGraphContent shareopengraphcontent, Validator validator)
    {
        validator.validate(shareopengraphcontent.getAction());
        validator = shareopengraphcontent.getPreviewPropertyName();
        if (Utility.isNullOrEmpty(validator))
        {
            throw new FacebookException("Must specify a previewPropertyName.");
        }
        if (shareopengraphcontent.getAction().get(validator) == null)
        {
            throw new FacebookException((new StringBuilder("Property \"")).append(validator).append("\" was not found on the action. The name of the preview property must match the name of an action property.").toString());
        } else
        {
            return;
        }
    }

    private static void validateOpenGraphKey(String s, boolean flag)
    {
        if (flag)
        {
            String as[] = s.split(":");
            if (as.length < 2)
            {
                throw new FacebookException("Open Graph keys must be namespaced: %s", new Object[] {
                    s
                });
            }
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (as[i].isEmpty())
                {
                    throw new FacebookException("Invalid key found in Open Graph dictionary: %s", new Object[] {
                        s
                    });
                }
                i++;
            }
        }
    }

    private static void validateOpenGraphObject(ShareOpenGraphObject shareopengraphobject, Validator validator)
    {
        if (shareopengraphobject == null)
        {
            throw new FacebookException("Cannot share a null ShareOpenGraphObject");
        } else
        {
            validator.validate(shareopengraphobject, true);
            return;
        }
    }

    private static void validateOpenGraphValueContainer(ShareOpenGraphValueContainer shareopengraphvaluecontainer, Validator validator, boolean flag)
    {
        for (Iterator iterator = shareopengraphvaluecontainer.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            validateOpenGraphKey(((String) (obj)), flag);
            obj = shareopengraphvaluecontainer.get(((String) (obj)));
            if (obj instanceof List)
            {
                obj = ((List)obj).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Object obj1 = ((Iterator) (obj)).next();
                    if (obj1 == null)
                    {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                    validateOpenGraphValueContainerObject(obj1, validator);
                }
            } else
            {
                validateOpenGraphValueContainerObject(obj, validator);
            }
        }

    }

    private static void validateOpenGraphValueContainerObject(Object obj, Validator validator)
    {
        if (obj instanceof ShareOpenGraphObject)
        {
            validator.validate((ShareOpenGraphObject)obj);
        } else
        if (obj instanceof SharePhoto)
        {
            validator.validate((SharePhoto)obj);
            return;
        }
    }

    private static void validatePhotoContent(SharePhotoContent sharephotocontent, Validator validator)
    {
        sharephotocontent = sharephotocontent.getPhotos();
        if (sharephotocontent == null || sharephotocontent.isEmpty())
        {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        }
        if (sharephotocontent.size() > 6)
        {
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[] {
                Integer.valueOf(6)
            }));
        }
        for (sharephotocontent = sharephotocontent.iterator(); sharephotocontent.hasNext(); validator.validate((SharePhoto)sharephotocontent.next())) { }
    }

    private static void validatePhotoForNativeDialog(SharePhoto sharephoto, Validator validator)
    {
        if (sharephoto == null)
        {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        android.graphics.Bitmap bitmap = sharephoto.getBitmap();
        sharephoto = sharephoto.getImageUrl();
        if (bitmap == null)
        {
            if (sharephoto == null)
            {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            if (Utility.isWebUri(sharephoto) && !validator.isOpenGraphContent())
            {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }
    }

    private static void validatePhotoForWebDialog(SharePhoto sharephoto, Validator validator)
    {
        if (sharephoto == null)
        {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        sharephoto = sharephoto.getImageUrl();
        if (sharephoto == null || !Utility.isWebUri(sharephoto))
        {
            throw new FacebookException("SharePhoto must have a non-null imageUrl set to the Uri of an image on the web");
        } else
        {
            return;
        }
    }

    private static void validateVideo(ShareVideo sharevideo, Validator validator)
    {
        if (sharevideo == null)
        {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        if (sharevideo.getLocalUrl() == null)
        {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        } else
        {
            return;
        }
    }

    private static void validateVideoContent(ShareVideoContent sharevideocontent, Validator validator)
    {
        validator.validate(sharevideocontent.getVideo());
        sharevideocontent = sharevideocontent.getPreviewPhoto();
        if (sharevideocontent != null)
        {
            validator.validate(sharevideocontent);
        }
    }











    private class Validator
    {

        private boolean isOpenGraphContent;

        public boolean isOpenGraphContent()
        {
            return isOpenGraphContent;
        }

        public void validate(ShareLinkContent sharelinkcontent)
        {
            ShareContentValidation.validateLinkContent(sharelinkcontent, this);
        }

        public void validate(ShareOpenGraphAction shareopengraphaction)
        {
            ShareContentValidation.validateOpenGraphAction(shareopengraphaction, this);
        }

        public void validate(ShareOpenGraphContent shareopengraphcontent)
        {
            isOpenGraphContent = true;
            ShareContentValidation.validateOpenGraphContent(shareopengraphcontent, this);
        }

        public void validate(ShareOpenGraphObject shareopengraphobject)
        {
            ShareContentValidation.validateOpenGraphObject(shareopengraphobject, this);
        }

        public void validate(ShareOpenGraphValueContainer shareopengraphvaluecontainer, boolean flag)
        {
            ShareContentValidation.validateOpenGraphValueContainer(shareopengraphvaluecontainer, this, flag);
        }

        public void validate(SharePhoto sharephoto)
        {
            ShareContentValidation.validatePhotoForNativeDialog(sharephoto, this);
        }

        public void validate(SharePhotoContent sharephotocontent)
        {
            ShareContentValidation.validatePhotoContent(sharephotocontent, this);
        }

        public void validate(ShareVideo sharevideo)
        {
            ShareContentValidation.validateVideo(sharevideo, this);
        }

        public void validate(ShareVideoContent sharevideocontent)
        {
            ShareContentValidation.validateVideoContent(sharevideocontent, this);
        }

        private Validator()
        {
            isOpenGraphContent = false;
        }

        Validator(_cls1 _pcls1)
        {
            this();
        }
    }


    private class WebShareValidator extends Validator
    {

        public void validate(SharePhoto sharephoto)
        {
            ShareContentValidation.validatePhotoForWebDialog(sharephoto, this);
        }

        public void validate(SharePhotoContent sharephotocontent)
        {
            throw new FacebookException("Cannot share SharePhotoContent via web sharing dialogs");
        }

        public void validate(ShareVideoContent sharevideocontent)
        {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        private WebShareValidator()
        {
            super(null);
        }

        WebShareValidator(_cls1 _pcls1)
        {
            this();
        }
    }

}
