// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class iqo
{

    final int a;
    final String b;
    final List c;

    iqo(iqm iqm)
    {
        a = 1;
        b = null;
        c = new ArrayList();
        c.add(iqm);
    }

    iqo(String s)
    {
        a = 0;
        b = s;
        c = null;
    }

    iqo(List list)
    {
        a = 2;
        b = null;
        c = list;
    }
}
