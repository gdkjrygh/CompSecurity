// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public class aw
    implements ds
{

    public static final int b = 0x7f0901bf;
    public static final int c = 0x7f09016d;
    public static final int d = 0x7f09004a;
    public static final int e = 0x7f090049;
    public static final int f = 0x7f090472;
    public static final int g = 0x7f09004b;
    public static final int h = 0x7f09004d;
    public static final int i = 0x7f09004c;
    public static final int j = 0x7f090275;
    public static final int k = 0x7f090171;
    public static final int l = 0x7f090389;
    final ax a;

    aw()
    {
    }

    aw(ax ax1)
    {
        a = ax1;
    }

    public final int a()
    {
        java.util.ArrayList arraylist = a.d.b;
        if (arraylist == null)
        {
            return 0;
        } else
        {
            return arraylist.size();
        }
    }

    public final List a(List list)
    {
        if (a.d.b == null)
        {
            return null;
        } else
        {
            list.addAll(a.d.b);
            return list;
        }
    }

    public final boolean c()
    {
        return a.d.i();
    }

    public final void e_()
    {
        a.d.noteStateNotSaved();
    }
}
