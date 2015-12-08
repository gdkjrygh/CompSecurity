// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gtk
{

    final gtk a[];
    final int b;
    final int c;

    gtk()
    {
        a = new gtk[256];
        b = 0;
        c = 0;
    }

    gtk(int i, int j)
    {
        a = null;
        b = i;
        j &= 7;
        i = j;
        if (j == 0)
        {
            i = 8;
        }
        c = i;
    }
}
