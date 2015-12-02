// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import android.content.res.Resources;
import com.facebook.h;
import com.facebook.messages.model.threads.Message;
import com.facebook.o;

public class s
{

    private final Resources a;

    public s(Resources resources)
    {
        a = resources;
    }

    public int a(String s1)
    {
        if ("mobile".equals(s1) || "messenger".equals(s1) || "sms".equals(s1) || "mms".equals(s1))
        {
            return h.orca_receipt_phone_icon;
        }
        if ("chat".equals(s1) || "web".equals(s1))
        {
            return h.orca_receipt_bubble_icon;
        }
        if ("email".equals(s1))
        {
            return h.orca_receipt_email_icon;
        } else
        {
            return -1;
        }
    }

    public String a(Message message)
    {
        return b(message.z());
    }

    public String b(String s1)
    {
        if ("mobile".equals(s1))
        {
            return a.getString(o.source_from_mobile);
        }
        if ("messenger".equals(s1))
        {
            return a.getString(o.source_from_messenger);
        }
        if ("chat".equals(s1))
        {
            return a.getString(o.source_from_web);
        }
        if ("email".equals(s1))
        {
            return a.getString(o.source_from_email);
        }
        if ("sms".equals(s1))
        {
            return a.getString(o.source_from_sms);
        }
        if ("mms".equals(s1))
        {
            return a.getString(o.source_from_mms);
        } else
        {
            return a.getString(o.source_from_web);
        }
    }
}
