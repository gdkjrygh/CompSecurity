// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

final class bkt
{

    public final long a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private boolean g;
    private int h;
    private int i;

    private bkt(long l, long l1, long l2, long l3, long l4, long l5, boolean flag, int j, 
            int k)
    {
        a = l;
        b = l1;
        c = l2;
        d = l3;
        e = l4;
        f = l5;
        g = flag;
        h = j;
        i = k;
    }

    public static bkt a(Context context)
    {
        String as[] = a(b("stat"));
        String as1[] = a(b("statm"));
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int j = context.getIntExtra("status", -1);
        int k;
        int l;
        boolean flag;
        if (j == 2 || j == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = context.getIntExtra("level", -1);
        k = context.getIntExtra("scale", -1);
        l = context.getIntExtra("temperature", -1);
        context = new bku(flag, (j * 100) / k, l / 10);
        if (as.length <= 15 || as1.length < 6)
        {
            return null;
        } else
        {
            return new bkt(System.currentTimeMillis(), Integer.parseInt(as[13]), Integer.parseInt(as[14]), Integer.parseInt(as1[0]), Integer.parseInt(as1[1]), Integer.parseInt(as1[5]), ((bku) (context)).a, ((bku) (context)).b, ((bku) (context)).c);
        }
    }

    private static String[] a(String s)
    {
        s = new StringTokenizer(s, " ");
        int k = s.countTokens();
        String as[] = new String[k];
        for (int j = 0; j < k; j++)
        {
            as[j] = s.nextToken();
        }

        return as;
    }

    private static String b(String s)
    {
        int j = Process.myPid();
        return c((new StringBuilder(String.valueOf(s).length() + 18)).append("/proc/").append(j).append("/").append(s).toString());
    }

    private static String c(String s)
    {
        Object obj;
        Object obj1;
        Object obj2;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        obj1 = null;
        obj2 = null;
        obj = null;
        s = new BufferedReader(new FileReader(s));
_L3:
        obj = s.readLine();
        if (obj == null) goto _L2; else goto _L1
_L1:
        stringbuilder.append(((String) (obj)));
          goto _L3
        obj;
_L9:
        b.a(s);
        return "";
_L2:
        b.a(s);
        return stringbuilder.toString();
        s;
        s = obj1;
_L7:
        b.a(s);
        return "";
        obj;
        s = obj2;
_L5:
        b.a(s);
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        s;
        s = ((String) (obj));
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            Long.valueOf(a), Long.valueOf(b), Long.valueOf(c), Long.valueOf(d), Long.valueOf(e), Long.valueOf(f), Boolean.valueOf(g), Integer.valueOf(h), Integer.valueOf(i)
        });
    }
}
