// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.f;


public class b
{

    public com.qihoo.security.adv.AdvDataManager.AdvType a;
    public String b;
    public boolean c;

    public b(com.qihoo.security.adv.AdvDataManager.AdvType advtype, String s, boolean flag)
    {
        a = advtype;
        c = flag;
        b = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FacebookEvent [advType=").append(a).append(", facebookId=").append(b).append(", suc=").append(c).append("]").toString();
    }
}
