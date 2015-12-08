// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.data;


// Referenced classes of package com.phunware.nbc.sochi.data:
//            ListViewAdapter

public static class isHeader
{

    public boolean isHeader;
    public String title;

    public (String s)
    {
        this(s, false);
    }

    public <init>(String s, boolean flag)
    {
        title = s;
        isHeader = flag;
    }
}
