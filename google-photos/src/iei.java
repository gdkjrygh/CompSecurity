// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.pm.ResolveInfo;

final class iei
{

    final String a;
    final ResolveInfo b;
    final ifc c;
    int d;

    public iei(String s, ResolveInfo resolveinfo)
    {
        a = s;
        b = resolveinfo;
        c = new ifc(s);
        d = 0;
    }
}
