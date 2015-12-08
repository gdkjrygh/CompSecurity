// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;

// Referenced classes of package com.facebook.share.internal:
//            ShareContentValidation

class <init>
{

    private boolean isOpenGraphContent;

    public boolean isOpenGraphContent()
    {
        return isOpenGraphContent;
    }

    public void validate(ShareLinkContent sharelinkcontent)
    {
        ShareContentValidation.access$500(sharelinkcontent, this);
    }

    public void validate(ShareOpenGraphAction shareopengraphaction)
    {
        ShareContentValidation.access$900(shareopengraphaction, this);
    }

    public void validate(ShareOpenGraphContent shareopengraphcontent)
    {
        isOpenGraphContent = true;
        ShareContentValidation.access$800(shareopengraphcontent, this);
    }

    public void validate(ShareOpenGraphObject shareopengraphobject)
    {
        ShareContentValidation.access$1000(shareopengraphobject, this);
    }

    public void validate(ShareOpenGraphValueContainer shareopengraphvaluecontainer, boolean flag)
    {
        ShareContentValidation.access$1100(shareopengraphvaluecontainer, this, flag);
    }

    public void validate(SharePhoto sharephoto)
    {
        ShareContentValidation.access$1200(sharephoto, this);
    }

    public void validate(SharePhotoContent sharephotocontent)
    {
        ShareContentValidation.access$600(sharephotocontent, this);
    }

    public void validate(ShareVideo sharevideo)
    {
        ShareContentValidation.access$1300(sharevideo, this);
    }

    public void validate(ShareVideoContent sharevideocontent)
    {
        ShareContentValidation.access$700(sharevideocontent, this);
    }

    private ()
    {
        isOpenGraphContent = false;
    }

    isOpenGraphContent(isOpenGraphContent isopengraphcontent)
    {
        this();
    }
}
