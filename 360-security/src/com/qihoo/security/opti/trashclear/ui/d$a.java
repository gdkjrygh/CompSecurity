// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui;


// Referenced classes of package com.qihoo.security.opti.trashclear.ui:
//            d

class d
{

    public int a;
    public int b;
    public int c;
    public long d;
    final d e;

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("clearListLevelOneData [selectedCount=");
        stringbuilder.append(a);
        stringbuilder.append(", lockedCount=");
        stringbuilder.append(b);
        stringbuilder.append(", totalCount=");
        stringbuilder.append(c);
        stringbuilder.append(", totalLength=");
        stringbuilder.append(d);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    (d d1)
    {
        e = d1;
        super();
        a = 0;
        b = 0;
        c = 0;
        d = 0L;
    }
}
