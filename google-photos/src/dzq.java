// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class dzq
{

    public dzq()
    {
    }

    public static void a(Context context, int i, ekq ekq)
    {
        ifx ifx1 = new ifx(context, i);
        ifx1.b = ekq;
        context.startActivity(ifx1.a());
    }

    public static void a(Context context, int i, List list)
    {
        list = new ArrayList(list);
        ifx ifx1 = new ifx(context, i);
        ifx1.a = list;
        context.startActivity(ifx1.a());
    }
}
