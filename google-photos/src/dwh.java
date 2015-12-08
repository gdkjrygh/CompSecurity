// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class dwh
{

    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f[];
    public int g;
    public int h;
    public int i;
    public List j;
    public dwj k;
    List l;
    List m;
    public ekq n;
    public boolean o;
    public mjw p;

    public dwh()
    {
        l = new ArrayList();
        m = new ArrayList();
    }

    private dwh a(dwi dwi1)
    {
        boolean flag;
        if (l.size() <= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Can at most have two primary actions");
        l.add(dwi1);
        return this;
    }

    public final dwa a()
    {
        return new dwa(this);
    }

    public final dwh a(int i1, dwg dwg, msp msp)
    {
        return a(new dwi(i1, dwg, msp));
    }

    public final dwh a(String s, dwg dwg, msp msp)
    {
        return a(new dwi(s, dwg, msp));
    }

    public final dwh b(int i1, dwg dwg, msp msp)
    {
        m.add(new dwi(i1, dwg, msp));
        return this;
    }
}
