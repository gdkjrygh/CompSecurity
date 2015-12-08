// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class hbp
{

    public final List a = new ArrayList();
    public final hbq b;
    public final int c;
    public final int d;
    public hbp e;

    public hbp(hbq hbq, int i, int j)
    {
        b = hbq;
        c = i;
        d = j;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(b);
        int i = c;
        int j = d;
        return (new StringBuilder(String.valueOf(s).length() + 44 + String.valueOf(s1).length())).append(s).append("{type=").append(s1).append(", top=").append(i).append(", height=").append(j).append("}").toString();
    }
}
