// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.internal.U;
import com.facebook.p;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;

// Referenced classes of package com.facebook.share.internal:
//            D

private static final class <init> extends <init>
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

    private deoContent()
    {
        super((byte)0);
    }

    <init>(byte byte0)
    {
        this();
    }
}
