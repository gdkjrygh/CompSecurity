// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.ui.media.attachments.MediaResource;

class s
{

    final String a;
    final MediaResource b;

    private s(String s1, MediaResource mediaresource)
    {
        a = s1;
        b = mediaresource;
    }

    static s a(MediaResource mediaresource)
    {
        return new s(null, mediaresource);
    }

    static s a(String s1)
    {
        return new s(s1, null);
    }
}
