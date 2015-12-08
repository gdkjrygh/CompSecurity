// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;


// Referenced classes of package com.aviary.android.feather.cds:
//            AviaryCdsService

public static class a extends Exception
{

    private int a;

    public int a()
    {
        return a;
    }

    public String getLocalizedMessage()
    {
        String s;
        if (getCause() != null)
        {
            s = getCause().getLocalizedMessage();
        } else
        {
            s = super.getLocalizedMessage();
        }
        return (new StringBuilder()).append(s).append(" (ErrorCode: ").append(a).append(")").toString();
    }

    public (int i, String s)
    {
        super(s);
        a = i;
    }

    a(int i, Throwable throwable)
    {
        super(throwable);
        a = i;
    }
}
