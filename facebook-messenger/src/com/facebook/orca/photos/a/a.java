// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.a;

import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.e;
import com.facebook.contacts.models.f;

public class a
{

    public a()
    {
    }

    public static com.facebook.user.tiles.e a(Contact contact, e e1)
    {
        if (contact.getBigPictureUrl() != null)
        {
            return com.facebook.user.tiles.e.a(e1.b(contact));
        }
        if (contact.getSmallPictureUrl() != null)
        {
            return com.facebook.user.tiles.e.a(e1.a(contact));
        } else
        {
            return com.facebook.user.tiles.e.a(f.a(contact));
        }
    }
}
