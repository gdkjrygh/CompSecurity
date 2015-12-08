// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.creativerepackaging;

import java.util.ArrayList;

class Rule
{

    public ArrayList domains;
    public String find;
    public String replace;

    public Rule(String s, String s1, ArrayList arraylist)
    {
        domains = new ArrayList();
        find = s;
        replace = s1;
        domains = arraylist;
    }
}
