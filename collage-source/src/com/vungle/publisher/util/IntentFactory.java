// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.util;

import android.content.Intent;
import android.net.Uri;

public class IntentFactory
{

    IntentFactory()
    {
    }

    public static Intent a(String s, Uri uri)
    {
        return new Intent(s, uri);
    }
}
