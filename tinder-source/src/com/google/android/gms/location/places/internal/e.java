// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class e
{

    static final String a = com/google/android/gms/location/places/internal/e.getSimpleName();
    static final long b;
    final Handler c;
    final Runnable d;
    final Object e;
    ArrayList f;
    ArrayList g;

    static 
    {
        b = TimeUnit.SECONDS.toMillis(1L);
    }
}
