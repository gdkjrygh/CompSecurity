// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import android.content.Context;
import java.io.File;

final class a
    implements hTransformer
{

    final Context a;

    public final File a(String s)
    {
        return a.getDir(s, 0);
    }

    hTransformer(Context context)
    {
        a = context;
        super();
    }
}
