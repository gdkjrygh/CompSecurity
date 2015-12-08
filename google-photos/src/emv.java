// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.Locale;

public final class emv
{

    public final String a;
    private final int b;
    private final int c;
    private final int d;

    public emv(emw emw1)
    {
        double d1;
        double d2;
        double d6;
        double d7;
        Object obj;
        Object obj1;
        byte byte0 = 1;
        double d3;
        ems ems1;
        boolean flag;
        int i;
        int j;
        int k;
        int l;
        if (emw1.e > 1.0F && emw1.e < 4F)
        {
            byte0 = 2;
        } else
        if (emw1.e >= 4F)
        {
            byte0 = 4;
        }
        c = emw1.c;
        d = emw1.d;
        i = c / byte0;
        j = d / byte0;
        k = (c - (emw1.f << 1)) / byte0;
        l = (d - (emw1.f << 1)) / byte0;
        obj1 = emw1.a;
        ems1 = emw1.b;
        d1 = Math.min(((ems) (obj1)).a, ems1.a);
        d2 = Math.max(((ems) (obj1)).a, ems1.a);
        d3 = Math.min(((ems) (obj1)).b, ems1.b);
        d6 = Math.max(((ems) (obj1)).b, ems1.b);
        if (d6 - d3 > 180D)
        {
            obj = new emt(d1, d6, d2, d3);
        } else
        {
            obj = new emt(d1, d3, d2, d6);
        }
        d2 = (ems1.b - ((ems) (obj1)).b) + ems1.b;
        if (d2 > 180D)
        {
            d1 = d2 - 360D;
        } else
        {
            d1 = d2;
            if (d2 < -180D)
            {
                d1 = d2 + 360D;
            }
        }
        obj1 = ems.a(((ems) (obj1)).a, d1);
        d6 = Math.min(((ems) (obj1)).a, ((emt) (obj)).a.a);
        d7 = Math.max(((ems) (obj1)).a, ((emt) (obj)).b.a);
        d2 = Math.min(((ems) (obj1)).b, ((emt) (obj)).a.b);
        d1 = Math.max(((ems) (obj1)).b, ((emt) (obj)).b.b);
        if (((emt) (obj)).a.b > ((emt) (obj)).b.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (Math.abs(((ems) (obj1)).b - ((emt) (obj)).a.b) < 180D)
        {
            d3 = ((emt) (obj)).b.b;
            d1 = d2;
            d2 = d3;
        } else
        {
            double d4 = ((emt) (obj)).a.b;
            d2 = d1;
            d1 = d4;
        }
_L6:
        obj = new emt(d6, d1, d7, d2);
_L4:
        b = emu.a(((emt) (obj)), k, l);
        d1 = (((emt) (obj)).b.a + ((emt) (obj)).a.a) / 2D;
        d2 = (((emt) (obj)).b.b + ((emt) (obj)).a.b) / 2D;
        ems.a(d1, d2);
        obj = String.format(Locale.US, "%.6f,%.6f", new Object[] {
            Double.valueOf(emw1.a.a), Double.valueOf(emw1.a.b)
        });
        emw1 = String.format(Locale.US, "%.6f,%.6f", new Object[] {
            Double.valueOf(emw1.b.a), Double.valueOf(emw1.b.b)
        });
        obj1 = String.format(Locale.US, "%.6f,%.6f", new Object[] {
            Double.valueOf(d1), Double.valueOf(d2)
        });
        a = Uri.parse("https://maps.googleapis.com/maps/api/staticmap").buildUpon().appendQueryParameter("key", "AIzaSyDaQPK_rJmlblF1_zAJfaZrfWK26lsxMwc").appendQueryParameter("size", String.format(Locale.US, "%dx%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        })).appendQueryParameter("scale", String.valueOf(byte0)).appendQueryParameter("style", "element:labels|visibility:off").appendQueryParameter("zoom", String.valueOf(b)).appendQueryParameter("center", ((String) (obj1))).appendQueryParameter("markers", emw1).appendQueryParameter("path", String.format(Locale.US, "color:red|geodesic:true|%s|%s", new Object[] {
            obj, emw1
        })).build().toString();
        return;
_L2:
        if (d1 - d2 <= 180D)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Math.abs(((ems) (obj1)).b - d2) < 180D)
        {
            d1 = ((emt) (obj)).a.b;
        } else
        {
            d2 = ((emt) (obj)).b.b;
        }
        obj = new emt(d6, d1, d7, d2);
        if (true) goto _L4; else goto _L3
_L3:
        double d5 = d1;
        d1 = d2;
        d2 = d5;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
