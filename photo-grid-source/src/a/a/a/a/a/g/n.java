// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.g;

import a.a.a.a.a.b.l;
import a.a.a.a.f;
import a.a.a.a.s;
import android.content.Context;
import android.graphics.BitmapFactory;

public final class n
{

    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private n(String s1, int i, int j, int k)
    {
        a = s1;
        b = i;
        c = j;
        d = k;
    }

    public static n a(Context context, String s1)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        int i = l.k(context);
        f.d();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        context = new n(s1, i, options.outWidth, options.outHeight);
        return context;
        context;
        f.d().b("Fabric", "Failed to load icon", context);
        return null;
    }
}
