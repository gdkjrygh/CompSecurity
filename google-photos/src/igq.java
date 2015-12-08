// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class igq
    implements iwj
{

    private final Resources a;

    public igq(Context context)
    {
        a = context.getResources();
    }

    private igo a(igj igj1, int i, int j, msp msp)
    {
        return new igo(a.getString(i), igj1, a.getDrawable(j), msp);
    }

    public final volatile Object a(Object obj)
    {
        return a((List)obj);
    }

    public final List a(List list)
    {
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList(list.size());
        iterator = list.iterator();
_L7:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_202;
        }
        list = (igj)iterator.next();
        igr.a[list.ordinal()];
        JVM INSTR tableswitch 1 4: default 80
    //                   1 122
    //                   2 148
    //                   3 166
    //                   4 184;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_184;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        list = String.valueOf(list);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(list).length() + 24)).append("Unexpected ShareMethod: ").append(list).toString());
_L2:
        list = a(((igj) (list)), b.zn, b.zh, pwt.J);
_L8:
        arraylist.add(list);
        if (true) goto _L7; else goto _L6
_L6:
        list = a(((igj) (list)), b.zr, b.zj, pwt.M);
          goto _L8
_L4:
        list = a(((igj) (list)), b.zp, b.zi, pwt.L);
          goto _L8
        list = a(((igj) (list)), b.zq, b.zg, pwt.N);
          goto _L8
        return arraylist;
    }
}
