// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;

public class a
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;
    public static final ae f;
    public static final ae g;

    public a()
    {
    }

    static 
    {
        a = (ae)aj.a.c("contacts_upload/");
        b = (ae)a.c("contacts_upload_in_progress");
        c = (ae)a.c("last_upload_succeeded");
        d = (ae)a.c("last_upload_failed");
        e = (ae)a.c("contact_interaction_events_sent");
        f = (ae)aj.b.c("contacts/");
        g = (ae)f.c("upload_contacts_batch_size");
    }
}
