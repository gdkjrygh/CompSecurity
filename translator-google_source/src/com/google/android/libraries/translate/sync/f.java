// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.Context;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            i, j, b

final class f extends i
{

    final b a;

    f(b b1, Context context)
    {
        a = b1;
        super(context, null);
    }

    final Object a(String s)
    {
        j j1 = new j((new JSONArray(s)).getLong(4));
        j1.a.addAll(b.a(s, true));
        return j1;
    }
}
