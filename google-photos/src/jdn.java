// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.List;

final class jdn
    implements nmt
{

    private jdm a;

    jdn(jdm jdm1)
    {
        a = jdm1;
        super();
    }

    public final void a(Uri uri, long l, long l1)
    {
        int i = a.a.indexOf(a.c);
        int j = a.a.size();
        a.b.a(i, j, l, l1);
    }
}
