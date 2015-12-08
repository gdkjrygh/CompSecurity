// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.base;

import ahn;
import ahs;
import aif;
import aig;
import aih;
import ajo;
import ajr;
import aju;
import ajw;
import java.lang.reflect.Array;

public final class ArraySelectFilter extends ahn
{

    private Object mDefaultValue;
    private int mIndex;

    public ArraySelectFilter(ajr ajr, String s)
    {
        super(ajr, s);
        mIndex = 0;
        mDefaultValue = null;
    }

    public final ajw b()
    {
        return (new ajw()).a("array", 2, aif.c()).a("index", 1, aif.a(Integer.TYPE)).a("defaultValue", 1, aif.b()).b("element", 2, aif.b()).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("index"))
        {
            ajo1.a("mIndex");
            ajo1.g = true;
        } else
        if (ajo1.b.equals("defaultValue"))
        {
            ajo1.a("mDefaultValue");
            ajo1.g = true;
            return;
        }
    }

    protected final void e()
    {
        Object obj = a("array");
        aju aju1 = b("element");
        obj = ((ajo) (obj)).a().e().n();
        aig aig1;
        if (Array.getLength(obj) > mIndex)
        {
            obj = Array.get(obj, mIndex);
        } else
        {
            obj = mDefaultValue;
        }
        aig1 = aju1.a(null).d();
        aig1.a(obj);
        aju1.a(aig1);
    }
}
