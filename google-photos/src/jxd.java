// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class jxd
{

    public static final jym a;
    public static final jyh b;
    private static jyi d;
    private static jxh e = new jxq();
    public final jxh c;
    private final String f;
    private final int g;
    private String h;
    private int i;
    private String j;
    private String k;
    private final boolean l;
    private int m;
    private final kdh n;
    private jxg o;

    public jxd(Context context, int i1, String s, String s1)
    {
        this(context, -1, null, null, e, kdj.c());
    }

    private jxd(Context context, int i1, String s, String s1, String s2, boolean flag, jxh jxh, 
            kdh kdh)
    {
        flag = false;
        super();
        i = -1;
        m = 0;
        f = context.getPackageName();
        g = a(context);
        i = i1;
        h = s;
        j = s1;
        k = s2;
        l = false;
        c = jxh;
        n = kdh;
        o = new jxg();
        m = 0;
        if (l)
        {
            if (j == null)
            {
                flag = true;
            }
            b.b(flag, "can't be anonymous with an upload account");
        }
    }

    private jxd(Context context, int i1, String s, String s1, jxh jxh, kdh kdh)
    {
        this(context, i1, "", s, s1, false, jxh, kdh);
    }

    private static int a(Context context)
    {
        int i1;
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return 0;
        }
        return i1;
    }

    static int a(jxd jxd1)
    {
        return jxd1.i;
    }

    public static int[] a(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            return null;
        }
        int ai[] = new int[arraylist.size()];
        arraylist = arraylist.iterator();
        for (int i1 = 0; arraylist.hasNext(); i1++)
        {
            ai[i1] = ((Integer)arraylist.next()).intValue();
        }

        return ai;
    }

    static String b(jxd jxd1)
    {
        return jxd1.h;
    }

    static String c(jxd jxd1)
    {
        return jxd1.j;
    }

    static String d(jxd jxd1)
    {
        return jxd1.k;
    }

    static int e(jxd jxd1)
    {
        return 0;
    }

    static kdh f(jxd jxd1)
    {
        return jxd1.n;
    }

    static jxg g(jxd jxd1)
    {
        return jxd1.o;
    }

    public static boolean h(jxd jxd1)
    {
        return jxd1.l;
    }

    public static String i(jxd jxd1)
    {
        return jxd1.f;
    }

    public static int j(jxd jxd1)
    {
        return jxd1.g;
    }

    public static jxh k(jxd jxd1)
    {
        return jxd1.c;
    }

    static 
    {
        a = new jym();
        d = new jxe();
        b = new jyh("ClearcutLogger.API", d, a);
    }
}
