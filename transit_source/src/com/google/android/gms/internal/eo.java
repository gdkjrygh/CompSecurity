// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class eo
{

    public static final Intent c(Intent intent)
    {
        intent.setData(Uri.fromParts("version", Integer.toString(0x3d8024), null));
        return intent;
    }
}
