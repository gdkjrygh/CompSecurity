// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.b;

import android.os.AsyncTask;
import android.util.Log;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.b;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.oned.z;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class com.fitbit.food.barcode.b.a extends AsyncTask
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(String s);
    }


    private static final String a = "ScanBarcodeTask";
    private a b;
    private j c;

    public com.fitbit.food.barcode.b.a(j j1, a a1)
    {
        c = j1;
        b = a1;
    }

    protected transient k a(b ab[])
    {
        Object obj = null;
        k k1 = obj;
        if (ab != null)
        {
            k1 = obj;
            if (ab.length > 0)
            {
                k1 = obj;
                if (c != null)
                {
                    Map map = a();
                    ab = ab[0];
                    k1 = obj;
                    if (ab != null)
                    {
                        try
                        {
                            Log.i("ScanBarcodeTask", (new StringBuilder()).append("Start decoding bitmap (width: ").append(ab.a()).append(", height: ").append(ab.b()).append(")").toString());
                            k1 = c.a(ab, map);
                        }
                        // Misplaced declaration of an exception variable
                        catch (b ab[])
                        {
                            Log.w("ScanBarcodeTask", ab);
                            return null;
                        }
                        // Misplaced declaration of an exception variable
                        catch (b ab[])
                        {
                            Log.w("ScanBarcodeTask", ab);
                            return null;
                        }
                        // Misplaced declaration of an exception variable
                        catch (b ab[])
                        {
                            Log.w("ScanBarcodeTask", ab);
                            return null;
                        }
                    }
                }
            }
        }
        return k1;
    }

    protected Map a()
    {
        EnumMap enummap = new EnumMap(com/google/zxing/DecodeHintType);
        EnumSet enumset = EnumSet.of(BarcodeFormat.o, BarcodeFormat.p, BarcodeFormat.h, BarcodeFormat.g);
        enummap.put(DecodeHintType.c, enumset);
        enummap.put(DecodeHintType.d, Boolean.TRUE);
        return enummap;
    }

    protected void a(k k1)
    {
        if (b != null)
        {
            if (k1 == null)
            {
                b.a();
            } else
            {
                String s1 = k1.a();
                String s = s1;
                if (BarcodeFormat.p == k1.d())
                {
                    s = z.b(s1);
                }
                b.a(s);
            }
        }
        c = null;
    }

    public boolean b()
    {
        b = null;
        return super.cancel(true);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((b[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((k)obj);
    }
}
