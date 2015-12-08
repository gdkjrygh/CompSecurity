// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.measurement;


// Referenced classes of package com.comscore.measurement:
//            Label

public class PrivilegedLabel extends Label
{

    private Boolean a;

    public PrivilegedLabel(String s, String s1, Boolean boolean1)
    {
        super(s, s1, boolean1);
        a = Boolean.valueOf(true);
    }

    public Boolean getPrivileged()
    {
        return a;
    }
}
