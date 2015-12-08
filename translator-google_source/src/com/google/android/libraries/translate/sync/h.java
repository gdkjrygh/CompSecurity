// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.Context;
import org.json.JSONArray;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            i, b

final class h extends i
{

    final b a;

    h(b b, Context context, Integer integer)
    {
        a = b;
        super(context, integer);
    }

    final Object a(String s)
    {
        return Integer.valueOf((new JSONArray(s)).getInt(0));
    }
}
