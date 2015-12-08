// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gls
    implements glg
{

    gls()
    {
    }

    public final int a(List list, Object obj)
    {
        int i = list.indexOf((glq)obj);
        if (i == -1)
        {
            return -1;
        } else
        {
            return i;
        }
    }
}
