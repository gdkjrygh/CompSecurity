// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.d;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.ae;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.a:
//            d

public class c extends AsyncTask
{

    private static final String a = com/jcp/a/c.getName();
    private List b;
    private Context c;
    private com.google.android.gms.maps.c d;
    private d e;
    private List f;
    private Fragment g;

    public c(List list, Fragment fragment, Context context, com.google.android.gms.maps.c c1)
    {
        g = fragment;
        b = list;
        c = context;
        d = c1;
        e = new d();
        f = new ArrayList();
    }

    static Fragment a(c c1)
    {
        return c1.g;
    }

    public Bitmap a(Context context, int i)
    {
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f03009c, null);
        Object obj = new DisplayMetrics();
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        context.measure(((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels);
        context.layout(0, 0, ((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels);
        context.buildDrawingCache();
        ((TextView)context.findViewById(0x7f0e035b)).setText(String.valueOf(i));
        obj = Bitmap.createBitmap(context.getMeasuredWidth(), context.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        context.draw(new Canvas(((Bitmap) (obj))));
        context.setDrawingCacheEnabled(false);
        return ((Bitmap) (obj));
    }

    protected transient List a(Void avoid[])
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        if (d == null) goto _L4; else goto _L3
_L3:
        int i = 0;
_L9:
        if (i >= b.size()) goto _L2; else goto _L5
_L5:
        String s;
        avoid = ((Stores)b.get(i)).getLatitude();
        s = ((Stores)b.get(i)).getLongitude();
        if (avoid == null || s == null) goto _L7; else goto _L6
_L6:
        if (!avoid.isEmpty() && !s.isEmpty())
        {
            avoid = new LatLng(Double.valueOf(avoid).doubleValue(), Double.valueOf(s).doubleValue());
            e.a(avoid);
            f.add(avoid);
        }
          goto _L7
_L4:
        try
        {
            ae.a(a, "Object of type 'GoogleMap' not completely initialized");
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            ae.a(a, "Latitude and/or Longitude, not intialized in correct format");
            avoid.printStackTrace();
        }
_L2:
        return f;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void a(List list)
    {
        super.onPostExecute(list);
        for (int i = 0; i < list.size(); i++)
        {
            d.a((new MarkerOptions()).a((LatLng)list.get(i)).a(String.valueOf(i)).a(com.google.android.gms.maps.model.b.a(a(c, i + 1))));
        }

        d.a(new com.jcp.a.d(this));
        if (e != null)
        {
            list = com.google.android.gms.maps.b.a(e.a(), 1);
            d.a(list);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }

}
