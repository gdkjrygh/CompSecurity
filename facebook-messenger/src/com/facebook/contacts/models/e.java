// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.models;

import com.facebook.contacts.f.a;
import com.facebook.contacts.f.b;
import com.facebook.user.PicCropInfo;

// Referenced classes of package com.facebook.contacts.models:
//            Contact

public final class e
{

    private a a;

    public e(a a1)
    {
        a = a1;
    }

    private PicCropInfo a(String s, b b1)
    {
        return PicCropInfo.a(s, a.a(b1));
    }

    public PicCropInfo a(Contact contact)
    {
        return a(contact.getSmallPictureUrl(), b.SMALL);
    }

    public PicCropInfo b(Contact contact)
    {
        return a(contact.getBigPictureUrl(), b.BIG);
    }
}
