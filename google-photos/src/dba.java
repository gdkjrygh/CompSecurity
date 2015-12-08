// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class dba
{

    public final View a;
    public final long b;
    public final int c;
    public short d;

    public dba(View view, long l, int i)
    {
        a = view;
        b = l;
        c = i;
        d = 0;
    }

    public final String toString()
    {
        String s = String.valueOf("StripViewItem(id=");
        long l1 = b;
        int i = c;
        short word0 = d;
        int j = a.getLeft();
        int k = a.getTop();
        int l = a.getRight();
        int i1 = a.getBottom();
        return (new StringBuilder(String.valueOf(s).length() + 112)).append(s).append(l1).append(" type=").append(i).append(" zOrder=").append(word0).append(" bounds=[").append(j).append(", ").append(k).append(", ").append(l).append(", ").append(i1).append("])").toString();
    }
}
