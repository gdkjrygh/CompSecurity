// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.view;

import android.net.Uri;
import com.facebook.messages.model.threads.Message;

public class b
{

    private final Uri a;
    private final Message b;
    private final String c;

    public b(Uri uri, Message message, String s)
    {
        a = uri;
        b = message;
        c = s;
    }

    public Uri a()
    {
        return a;
    }

    public Message b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }
}
