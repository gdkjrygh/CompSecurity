// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.d;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.InputStream;

// Referenced classes of package com.google.android.libraries.translate.d:
//            c

public final class a extends c
{

    public a(String s)
    {
        super(s);
    }

    public final InputStream a(Context context)
    {
        return context.getAssets().open(a);
    }
}
