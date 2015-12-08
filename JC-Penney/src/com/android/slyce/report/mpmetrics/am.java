// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;


// Referenced classes of package com.android.slyce.report.mpmetrics:
//            al

class am extends al
{

    final String b;
    final al c;

    am(al al1, String s)
    {
        c = al1;
        b = s;
        super(al1.a, null);
    }

    public void a(String s)
    {
        throw new RuntimeException("This MixpanelPeople object has a fixed, constant distinctId");
    }

    public String c()
    {
        return b;
    }
}
