// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;


// Referenced classes of package com.facebook.orca.login:
//            WildfireRegPhoneNumberViewGroup

class n
    implements Comparable
{

    final String a;
    final String b;
    final String c;
    final WildfireRegPhoneNumberViewGroup d;

    public n(WildfireRegPhoneNumberViewGroup wildfireregphonenumberviewgroup, String s, String s1, String s2)
    {
        d = wildfireregphonenumberviewgroup;
        super();
        a = s;
        b = s1;
        c = s2;
    }

    public int a(n n1)
    {
        return toString().compareTo(n1.toString());
    }

    public int compareTo(Object obj)
    {
        return a((n)obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append(c).append(" (").append(b).append(")").toString();
    }
}
