// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.Contact;

public abstract class OnContactChangedEvent
{

    private Contact contact;

    public OnContactChangedEvent(Contact contact1)
    {
        contact = contact1;
    }

    public Contact getContact()
    {
        return contact;
    }
}
