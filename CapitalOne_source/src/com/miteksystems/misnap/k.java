// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.miteksystems.misnap:
//            MitekAnalyzer

final class k
{

    private MitekAnalyzer a;
    private byte b[];
    private int c;
    private int d;
    private int e;
    private double f;
    private double g;
    private String h;

    k(int i, JSONObject jsonobject)
    {
        c = 10;
        try
        {
            h = jsonobject.getString("Name");
            a = new MitekAnalyzer(jsonobject.getInt("CameraViewfinderMinFill"), jsonobject.getInt("CameraDegreesThreshold"), jsonobject.getInt("CameraBrightness"), jsonobject.getInt("CameraSharpness"), jsonobject.getInt("CameraViewfinderMinHorizontalFill"), jsonobject.getString("Name"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
        if (2 != i) goto _L2; else goto _L1
_L1:
        a(R.drawable.test1080p_20);
_L4:
        b();
        b = null;
        return;
_L2:
        if (1 == i)
        {
            a(R.drawable.test720p_20);
        } else
        if (i == 0)
        {
            a(R.drawable.testvga_20);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(int i)
    {
        Object obj;
        android.graphics.BitmapFactory.Options options;
        if (i == R.drawable.test1080p_20)
        {
            obj = "res/drawable/test1080p_20.jpg";
        } else
        if (i == R.drawable.test720p_20)
        {
            obj = "res/drawable/test720p_20.jpg";
        } else
        {
label0:
            {
                if (i != R.drawable.testvga_20)
                {
                    break label0;
                }
                obj = "res/drawable/testvga_20.jpg";
            }
        }
        obj = getClass().getClassLoader().getResourceAsStream(((String) (obj)));
        options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj = BitmapFactory.decodeStream(((java.io.InputStream) (obj)), null, options);
_L2:
        if (obj != null)
        {
            d = ((Bitmap) (obj)).getWidth();
            e = ((Bitmap) (obj)).getHeight();
            b = a.a(((Bitmap) (obj)), d, e);
        }
        return;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b()
    {
        int i = 0;
        double d2 = 0.0D;
        double d1 = 0.0D;
        do
        {
            if (i >= c)
            {
                f = d1 / (double)c / 1000000D;
                g = d2 / (double)c;
                return;
            }
            long l = System.nanoTime();
            a.a(b, d, e);
            Rect rect = a.o();
            double d4 = a.a(b, d, rect.left, rect.top, rect.right - rect.left, rect.bottom - rect.top, h);
            double d3 = System.nanoTime() - l;
            i++;
            d2 += d4;
            d1 += d3;
        } while (true);
    }

    final double a()
    {
        return f;
    }
}
