// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.U;
import com.facebook.internal.Y;
import com.facebook.p;
import com.facebook.s;
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

public final class D
{
    private static class a
    {

        boolean a;

        public final void a(ShareOpenGraphValueContainer shareopengraphvaluecontainer, boolean flag)
        {
            for (Iterator iterator = shareopengraphvaluecontainer.a.keySet().iterator(); iterator.hasNext();)
            {
                Object obj = (String)iterator.next();
                if (flag)
                {
                    String as[] = ((String) (obj)).split(":");
                    if (as.length < 2)
                    {
                        throw new p("Open Graph keys must be namespaced: %s", new Object[] {
                            obj
                        });
                    }
                    int j = as.length;
                    for (int i = 0; i < j; i++)
                    {
                        if (as[i].isEmpty())
                        {
                            throw new p("Invalid key found in Open Graph dictionary: %s", new Object[] {
                                obj
                            });
                        }
                    }

                }
                obj = shareopengraphvaluecontainer.a(((String) (obj)));
                if (obj instanceof List)
                {
                    obj = ((List)obj).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        Object obj1 = ((Iterator) (obj)).next();
                        if (obj1 == null)
                        {
                            throw new p("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                        }
                        D.a(obj1, this);
                    }
                } else
                {
                    D.a(obj, this);
                }
            }

        }

        public void a(SharePhoto sharephoto)
        {
            if (sharephoto == null)
            {
                throw new p("Cannot share a null SharePhoto");
            }
            android.graphics.Bitmap bitmap = sharephoto.b;
            android.net.Uri uri = sharephoto.c;
            if (bitmap == null)
            {
                if (uri == null)
                {
                    throw new p("SharePhoto does not have a Bitmap or ImageUrl specified");
                }
                if (U.b(uri) && !a)
                {
                    throw new p("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
                }
            }
            if (sharephoto.b != null || !U.b(sharephoto.c))
            {
                Y.c(s.f());
            }
        }

        public void a(SharePhotoContent sharephotocontent)
        {
            sharephotocontent = sharephotocontent.a;
            if (sharephotocontent == null || sharephotocontent.isEmpty())
            {
                throw new p("Must specify at least one Photo in SharePhotoContent.");
            }
            if (sharephotocontent.size() > 6)
            {
                throw new p(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[] {
                    Integer.valueOf(6)
                }));
            }
            for (sharephotocontent = sharephotocontent.iterator(); sharephotocontent.hasNext(); a((SharePhoto)sharephotocontent.next())) { }
        }

        public void a(ShareVideoContent sharevideocontent)
        {
            Object obj = sharevideocontent.d;
            if (obj == null)
            {
                throw new p("Cannot share a null ShareVideo");
            }
            obj = ((ShareVideo) (obj)).b;
            if (obj == null)
            {
                throw new p("ShareVideo does not have a LocalUrl specified");
            }
            if (!U.c(((android.net.Uri) (obj))) && !U.d(((android.net.Uri) (obj))))
            {
                throw new p("ShareVideo must reference a video that is on the device");
            }
            sharevideocontent = sharevideocontent.c;
            if (sharevideocontent != null)
            {
                a(((SharePhoto) (sharevideocontent)));
            }
        }

        private a()
        {
            a = false;
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b extends a
    {

        public final void a(SharePhoto sharephoto)
        {
            if (sharephoto == null)
            {
                throw new p("Cannot share a null SharePhoto");
            }
            sharephoto = sharephoto.c;
            if (sharephoto == null || !U.b(sharephoto))
            {
                throw new p("SharePhoto must have a non-null imageUrl set to the Uri of an image on the web");
            } else
            {
                return;
            }
        }

        public final void a(SharePhotoContent sharephotocontent)
        {
            throw new p("Cannot share SharePhotoContent via web sharing dialogs");
        }

        public final void a(ShareVideoContent sharevideocontent)
        {
            throw new p("Cannot share ShareVideoContent via web sharing dialogs");
        }

        private b()
        {
            super((byte)0);
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static a a;
    private static a b;

    public static a a()
    {
        if (b == null)
        {
            b = new a((byte)0);
        }
        return b;
    }

    public static void a(ShareContent sharecontent)
    {
        if (a == null)
        {
            a = new b((byte)0);
        }
        a(sharecontent, a);
    }

    public static void a(ShareContent sharecontent, a a1)
        throws p
    {
        if (sharecontent == null)
        {
            throw new p("Must provide non-null content to share");
        }
        if (sharecontent instanceof ShareLinkContent)
        {
            sharecontent = ((ShareLinkContent)sharecontent).c;
            if (sharecontent != null && !U.b(sharecontent))
            {
                throw new p("Image Url must be an http:// or https:// url");
            }
        } else
        if (sharecontent instanceof SharePhotoContent)
        {
            a1.a((SharePhotoContent)sharecontent);
        } else
        {
            if (sharecontent instanceof ShareVideoContent)
            {
                a1.a((ShareVideoContent)sharecontent);
                return;
            }
            if (sharecontent instanceof ShareOpenGraphContent)
            {
                sharecontent = (ShareOpenGraphContent)sharecontent;
                a1.a = true;
                ShareOpenGraphAction shareopengraphaction = ((ShareOpenGraphContent) (sharecontent)).a;
                if (shareopengraphaction == null)
                {
                    throw new p("Must specify a non-null ShareOpenGraphAction");
                }
                if (U.a(shareopengraphaction.a()))
                {
                    throw new p("ShareOpenGraphAction must have a non-empty actionType");
                }
                a1.a(shareopengraphaction, false);
                a1 = ((ShareOpenGraphContent) (sharecontent)).b;
                if (U.a(a1))
                {
                    throw new p("Must specify a previewPropertyName.");
                }
                if (((ShareOpenGraphContent) (sharecontent)).a.a(a1) == null)
                {
                    throw new p((new StringBuilder("Property \"")).append(a1).append("\" was not found on the action. The name of the preview property must match the name of an action property.").toString());
                }
            }
        }
    }

    static void a(Object obj, a a1)
    {
        if (obj instanceof ShareOpenGraphObject)
        {
            obj = (ShareOpenGraphObject)obj;
            if (obj == null)
            {
                throw new p("Cannot share a null ShareOpenGraphObject");
            }
            a1.a(((ShareOpenGraphValueContainer) (obj)), true);
        } else
        if (obj instanceof SharePhoto)
        {
            a1.a((SharePhoto)obj);
            return;
        }
    }
}
