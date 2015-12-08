// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class bib
{

    final Context a;
    final String b;
    final VersionInfoParcel c;
    final cbi d;
    final cbk e;
    final cju f = new cju((new cjw()).a("min_1", 4.9406564584124654E-324D, 1.0D).a("1_5", 1.0D, 5D).a("5_10", 5D, 10D).a("10_20", 10D, 20D).a("20_30", 20D, 30D).a("30_max", 30D, 1.7976931348623157E+308D), (byte)0);
    final long g[];
    final String h[];
    cbi i;
    cbi j;
    cbi k;
    cbi l;
    boolean m;
    bhu n;
    boolean o;
    boolean p;
    long q;

    public bib(Context context, VersionInfoParcel versioninfoparcel, String s, cbk cbk, cbi cbi)
    {
        q = -1L;
        a = context;
        c = versioninfoparcel;
        b = s;
        e = cbk;
        d = cbi;
        context = cbb.m;
        context = (String)bkv.n().a(context);
        if (context == null)
        {
            h = new String[0];
            g = new long[0];
        } else
        {
            context = TextUtils.split(context, ",");
            h = new String[context.length];
            g = new long[context.length];
            int i1 = 0;
            while (i1 < context.length) 
            {
                try
                {
                    g[i1] = Long.parseLong(context[i1]);
                }
                // Misplaced declaration of an exception variable
                catch (VersionInfoParcel versioninfoparcel)
                {
                    bka.c("Unable to parse frame hash target time number.", versioninfoparcel);
                    g[i1] = -1L;
                }
                i1++;
            }
        }
    }
}
