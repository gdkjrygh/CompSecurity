// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.Uri;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            r

public static final class n
{

    Uri a;
    int b;
    String c;
    int d;
    int e;
    boolean f;
    boolean g;
    boolean h;
    float i;
    float j;
    float k;
    boolean l;
    List m;
    android.graphics.ap.Config n;
    sso.Priority o;

    public final n a(int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }
        if (j1 < 0)
        {
            throw new IllegalArgumentException("Height must be positive number or 0.");
        }
        if (j1 == 0 && i1 == 0)
        {
            throw new IllegalArgumentException("At least one dimension has to be positive number.");
        } else
        {
            d = i1;
            e = j1;
            return this;
        }
    }

    final boolean a()
    {
        return a != null || b != 0;
    }

    g(Uri uri, int i1, android.graphics.ap.Config config)
    {
        a = uri;
        b = i1;
        n = config;
    }
}
