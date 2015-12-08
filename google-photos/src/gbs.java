// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;

final class gbs
{

    final Context a;
    final int b;
    final String c;
    final String d;
    final ContentValues e = new ContentValues();
    final noz f;

    public gbs(Context context, int i, int j, int k)
    {
        a = context;
        b = i;
        c = String.valueOf(j);
        d = String.valueOf(k);
        e.put("width", Integer.valueOf(j));
        e.put("height", Integer.valueOf(k));
        f = noz.a(context, 2, "ContentValidator", new String[] {
            "sync"
        });
    }
}
