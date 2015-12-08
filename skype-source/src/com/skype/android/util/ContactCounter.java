// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.ContactGroup;
import java.util.concurrent.Callable;

public class ContactCounter
    implements Callable
{

    ContactGroup a;

    public Object call()
        throws Exception
    {
        return Integer.valueOf(a.getContacts().m_contactObjectIDList.length);
    }
}
