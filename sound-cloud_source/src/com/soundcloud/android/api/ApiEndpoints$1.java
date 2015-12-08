// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.net.Uri;
import com.soundcloud.java.functions.Function;

final class 
    implements Function
{

    public final Object apply(Object obj)
    {
        return Uri.encode(String.valueOf(obj));
    }

    ()
    {
    }
}
