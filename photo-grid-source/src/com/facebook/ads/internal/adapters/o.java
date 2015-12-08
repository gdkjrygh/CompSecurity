// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.ads.MediaView;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            b, p, c

public class o extends b
{

    private final p b;
    private com.facebook.ads.NativeAdView.Type c;
    private boolean d;
    private boolean e;
    private View f;
    private List g;

    public o(Context context, c c1, p p1)
    {
        super(context, c1);
        b = p1;
    }

    private String b(View view)
    {
        try
        {
            view = c(view).toString();
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return "Json exception";
        }
        return view;
    }

    private JSONObject c(View view)
    {
        int i = 0;
        JSONObject jsonobject = new JSONObject();
        jsonobject.putOpt("id", Integer.valueOf(view.getId()));
        jsonobject.putOpt("class", view.getClass());
        jsonobject.putOpt("origin", String.format("{x:%d, y:%d}", new Object[] {
            Integer.valueOf(view.getTop()), Integer.valueOf(view.getLeft())
        }));
        jsonobject.putOpt("size", String.format("{h:%d, w:%d}", new Object[] {
            Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())
        }));
        Object obj;
        boolean flag;
        if (g == null)
        {
            flag = false;
        } else
        {
            flag = g.contains(view);
        }
        jsonobject.putOpt("clickable", Boolean.valueOf(flag));
        obj = "unknown";
        if (view instanceof TextView)
        {
            obj = "text";
        } else
        if (view instanceof Button)
        {
            obj = "button";
        } else
        if (view instanceof ImageView)
        {
            obj = "image";
        } else
        if (view instanceof MediaView)
        {
            obj = "mediaview";
        } else
        if (view instanceof ViewGroup)
        {
            obj = "viewgroup";
        }
        jsonobject.putOpt("type", obj);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            obj = new JSONArray();
            for (; i < view.getChildCount(); i++)
            {
                ((JSONArray) (obj)).put(c(view.getChildAt(i)));
            }

            jsonobject.putOpt("list", obj);
        }
        return jsonobject;
    }

    private String d(View view)
    {
        if (view.getWidth() <= 0 || view.getHeight() <= 0)
        {
            return "";
        }
        try
        {
            Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            bitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new Canvas(bitmap));
            view = new ByteArrayOutputStream();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, b.d(), view);
            view = Base64.encodeToString(view.toByteArray(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return "";
        }
        return view;
    }

    public void a(View view)
    {
        f = view;
    }

    public void a(com.facebook.ads.NativeAdView.Type type)
    {
        c = type;
    }

    public void a(List list)
    {
        g = list;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    protected void b()
    {
        if (b == null)
        {
            return;
        }
        HashMap hashmap = new HashMap();
        if (a != null)
        {
            hashmap.put("mil", Boolean.valueOf(a.a()));
            hashmap.put("eil", Boolean.valueOf(a.b()));
            hashmap.put("eil_source", a.c());
        }
        if (c != null)
        {
            hashmap.put("nti", String.valueOf(c.getValue()));
        }
        if (d)
        {
            hashmap.put("nhs", String.valueOf(d));
        }
        if (e)
        {
            hashmap.put("nmv", String.valueOf(e));
        }
        if (f != null && b.b())
        {
            hashmap.put("view", b(f));
        }
        if (f != null && b.c())
        {
            hashmap.put("snapshot", d(f));
        }
        b.a(hashmap);
    }

    public void b(boolean flag)
    {
        e = flag;
    }
}
