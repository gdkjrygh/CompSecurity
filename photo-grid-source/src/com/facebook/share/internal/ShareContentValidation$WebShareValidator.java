// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;

// Referenced classes of package com.facebook.share.internal:
//            ShareContentValidation

class <init> extends <init>
{

    public void validate(SharePhoto sharephoto)
    {
        ShareContentValidation.access$200(sharephoto, this);
    }

    public void validate(SharePhotoContent sharephotocontent)
    {
        throw new FacebookException("Cannot share SharePhotoContent via web sharing dialogs");
    }

    public void validate(ShareVideoContent sharevideocontent)
    {
        throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
    }

    private ()
    {
        super(null);
    }

    ( )
    {
        this();
    }
}
