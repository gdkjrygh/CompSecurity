// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.pojo.LocalAdProduct;
import com.jcp.pojo.LocalAdPromotion;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.jcp.util.ai;
import com.jcp.util.g;
import com.jcp.util.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.helper:
//            u, w

public final class v extends u
{

    private static final String b = com/jcp/helper/v.getSimpleName();
    private final ai c = ai.a();
    private ExecutorService d;
    private Map e;

    public v()
    {
        e = new a();
    }

    private int a(int i, LocalAdProduct localadproduct)
    {
        String s1 = localadproduct.getFlyerId();
        String s = (new StringBuilder("fly")).append(s1).append(i).toString();
        String s2 = localadproduct.getCategory().trim();
        long l = a(s1, s, s2);
        ae.d(b, (new StringBuilder()).append("Record Inserted Status :").append(l).toString());
        if (-1L != l)
        {
            e.put(s2, s);
            i++;
        } else
        {
            s = (String)e.get(s2);
        }
        ae.c(b, (new StringBuilder()).append("Category :").append(localadproduct.getCategory()).append(" CAT-ID :").append(s).append(" ").toString());
        localadproduct.setCategoryId(s);
        ai.a().a(localadproduct);
        return i;
    }

    static int a(v v1, int i, LocalAdProduct localadproduct)
    {
        return v1.a(i, localadproduct);
    }

    static String a(v v1, String s)
    {
        return v1.e(s);
    }

    private void a(List list)
    {
        Object obj;
        for (list = list.iterator(); list.hasNext(); a.send(3, ((Bundle) (obj))))
        {
            String s = (String)list.next();
            d = Executors.newCachedThreadPool();
            obj = new w(this, s, com.jcp.b.b.I(s));
            d.execute(((Runnable) (obj)));
            obj = new Bundle();
            ((Bundle) (obj)).putString("publicationId", s);
        }

    }

    private void b(String s)
    {
        c(e(com.jcp.b.b.J(s)));
    }

    static LocalAdProduct[] b(v v1, String s)
    {
        return v1.f(s);
    }

    private void c(String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        Object obj = (new JSONArray(s)).getJSONObject(0);
        s = ((JSONObject) (obj)).getString("flyer_id");
        obj = ((JSONObject) (obj)).getString("image_400h_url");
        c.a(s, ((String) (obj)));
        return;
        s;
        Bundle bundle = new Bundle();
        if (s.getMessage() != null)
        {
            s = s.getMessage();
        } else
        {
            s = JCP.d().getString(0x7f0702b7);
        }
        bundle.putString("errorMessage", s);
        a.send(2, bundle);
        return;
    }

    private String e(String s)
    {
        try
        {
            s = d(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s.getMessage() != null)
            {
                s = s.getMessage();
            } else
            {
                s = "";
            }
            ae.a(b, s);
            return null;
        }
        return s;
    }

    private LocalAdProduct[] f(String s)
    {
        return (LocalAdProduct[])aa.a(s, [Lcom/jcp/pojo/LocalAdProduct;);
    }

    public long a(String s, String s1, String s2)
    {
        h h1 = new h();
        h1.a(s1);
        h1.c(s);
        h1.b(s2);
        return g.a().a(h1);
    }

    public void a()
    {
        if (d != null && !d.isShutdown())
        {
            d.shutdown();
        }
    }

    public void a(String s)
    {
        ae.d(b, (new StringBuilder()).append("LocalAd loadPublications for store code :").append(s).toString());
        ArrayList arraylist = new ArrayList();
        String s1 = e(com.jcp.b.b.H(s));
        if (!TextUtils.isEmpty(s1))
        {
            LocalAdPromotion alocaladpromotion[] = (LocalAdPromotion[])aa.a(s1, [Lcom/jcp/pojo/LocalAdPromotion;);
            if (alocaladpromotion != null && alocaladpromotion.length > 0)
            {
                c.a(alocaladpromotion, s);
                int j = alocaladpromotion.length;
                for (int i = 0; i < j; i++)
                {
                    LocalAdPromotion localadpromotion = alocaladpromotion[i];
                    if (!TextUtils.isEmpty(localadpromotion.getExternalDisplayName()))
                    {
                        b(localadpromotion.getId());
                        arraylist.add(localadpromotion.getId());
                    }
                }

                Bundle bundle = new Bundle();
                bundle.putString("storeCode", s);
                a.send(1, bundle);
                a(((List) (arraylist)));
                return;
            } else
            {
                a.send(2, new Bundle());
                return;
            }
        } else
        {
            a.send(2, new Bundle());
            return;
        }
    }

}
