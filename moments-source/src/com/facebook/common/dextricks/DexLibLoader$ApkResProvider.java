// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.InputStream;

final class <init> extends <init>
{

    private final Context a;

    public final InputStream a(String s)
    {
        return a.getAssets().open((new StringBuilder("secondary-program-dex-jars/")).append(s).toString());
    }

    private (Context context)
    {
        super((byte)0);
        a = context;
    }

    a(Context context, byte byte0)
    {
        this(context);
    }
}
