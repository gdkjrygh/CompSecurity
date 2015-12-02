// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.attachments;

import android.net.Uri;

public class h extends Exception
{

    private final Uri a;

    h(Uri uri)
    {
        super((new StringBuilder()).append("Unknown attachment type: ").append(uri).toString());
        a = uri;
    }
}
