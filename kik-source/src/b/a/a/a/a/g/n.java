// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.g;

import android.content.Context;
import android.graphics.BitmapFactory;
import b.a.a.a.a.b.j;
import b.a.a.a.d;
import b.a.a.a.o;

public final class n
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private n(String s, int i, int k, int l)
    {
        a = s;
        b = i;
        c = k;
        d = l;
    }

    public static n a(Context context, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        int i = j.l(context);
        b.a.a.a.d.c();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        context = new n(s, i, options.outWidth, options.outHeight);
        return context;
        context;
        b.a.a.a.d.c().b("Fabric", "Failed to load icon", context);
        return null;
    }
}
