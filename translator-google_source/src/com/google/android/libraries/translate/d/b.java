// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.d;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.google.android.libraries.translate.d:
//            d

public final class b extends d
{

    public b(String s)
    {
        super(s);
    }

    public final File b(Context context)
    {
        return new File(context.getCacheDir(), a);
    }
}
