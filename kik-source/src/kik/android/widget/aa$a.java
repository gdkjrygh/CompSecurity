// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import java.util.Comparator;
import java.util.Map;

// Referenced classes of package kik.android.widget:
//            aa

final class a
    implements Comparator
{

    final aa a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (String)obj1;
        int i = ((a)aa.c().get(obj)).c;
        return ((c)aa.c().get(obj1)).c - i;
    }

    (aa aa1)
    {
        a = aa1;
        super();
    }
}
