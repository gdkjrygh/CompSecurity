// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import com.jcp.adapters.bg;
import com.jcp.b.b;
import com.jcp.e.w;
import com.jcp.f.a;
import com.jcp.h.g;
import com.jcp.http.c;
import com.jcp.pojo.Response;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.ae;
import com.jcp.util.au;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.fragments:
//            s, bu, ProductDetailFragment, t

public class bt extends s
    implements android.widget.AdapterView.OnItemClickListener, w
{

    private static final String a = com/jcp/fragments/bt.getSimpleName();
    private GridView b;
    private List c;
    private String d;
    private bg e;

    public bt()
    {
        c = new ArrayList();
    }

    public static bt a(String s1, String s2, List list, String s3, List list1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("id", s1);
        bundle.putString("TYPE", s2);
        bundle.putStringArrayList("ProductURL", new ArrayList(list));
        bundle.putString("PageViewName", s3);
        bundle.putStringArrayList("breadcrumbs", (ArrayList)list1);
        s1 = new bt();
        s1.g(bundle);
        return s1;
    }

    private void b(String s1)
    {
        c c1 = new c(i(), this);
        c1.b(com.jcp.b.b.a(s1, false));
        c1.b(0);
        c1.a(57);
        c1.execute(new String[0]);
    }

    private List c(String s1)
    {
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        s1 = new JSONObject(s1);
        if (s1 == null) goto _L2; else goto _L3
_L3:
        if (!s1.has("productUrls")) goto _L2; else goto _L4
_L4:
        ArrayList arraylist;
        JSONArray jsonarray;
        jsonarray = s1.getJSONArray("productUrls");
        arraylist = new ArrayList();
        int i = 0;
_L6:
        s1 = arraylist;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(jsonarray.getString(i));
        i++;
        if (true) goto _L6; else goto _L5
        s1;
        ae.a(a, (new StringBuilder()).append("Exception:").append(s1).toString());
        s1.printStackTrace();
_L2:
        s1 = null;
_L5:
        return s1;
    }

    private boolean c(Bundle bundle)
    {
        if (bundle == null)
        {
            Toast.makeText(i(), "Fragment needs data", 0).show();
            return false;
        }
        if (bundle.containsKey("TYPE"))
        {
            String s1 = bundle.getString("TYPE");
            ae.d(a, (new StringBuilder()).append("Product type is ").append(s1).toString());
        }
        if (bundle.containsKey("id"))
        {
            d = bundle.getString("id");
            ae.d(a, (new StringBuilder()).append("Ensmble ID is ").append(d).toString());
        }
        if (bundle.containsKey("ProductURL") && bundle.getStringArrayList("ProductURL") != null)
        {
            c.addAll(bundle.getStringArrayList("ProductURL"));
        }
        if (c == null || c.isEmpty())
        {
            ae.d(a, "Product urls does not exist.");
            return false;
        } else
        {
            ae.d(a, (new StringBuilder()).append("There are ").append(c.size()).append(" matching items").toString());
            return true;
        }
    }

    protected String T()
    {
        return g.a(h());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03006c, null, false);
    }

    protected String a()
    {
        String s1 = h().getString("PageViewName", "");
        if (!TextUtils.isEmpty(s1))
        {
            return s1;
        } else
        {
            return "MATCHINGITEM";
        }
    }

    public void a(Response response)
    {
        int i = response.getStatusCode();
        response = response.getResponseBody();
        if (i == 200)
        {
            c = c(response);
            if (c != null && !c.isEmpty())
            {
                e = new bg(i(), c);
                b.setAdapter(e);
            }
            return;
        } else
        {
            au.a(i(), com.jcp.f.a.a(i(), response));
            return;
        }
    }

    public void b()
    {
        a(a(0x7f070289));
        super.b();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        i().findViewById(0x7f0e0164).setVisibility(8);
        b = (GridView)r().findViewById(0x7f0e027d);
        bundle = (ImageView)r().findViewById(0x7f0e027c);
        i().getActionBar().hide();
        bundle.setOnClickListener(new bu(this));
        if (c != null)
        {
            c.clear();
        }
        if (!c(h()))
        {
            b(d);
        } else
        {
            e = new bg(i(), c);
            b.setAdapter(e);
        }
        b.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        view = e.a(i).getId();
        adapterview = new Bundle();
        adapterview.putString("PPID", view);
        adapterview.putBoolean("ProductDetails", true);
        adapterview.putString("ProductURL", "");
        if (h().containsKey("breadcrumbs"))
        {
            adapterview.putStringArrayList("breadcrumbs", h().getStringArrayList("breadcrumbs"));
        }
        view = new ProductDetailFragment();
        view.g(adapterview);
        adapterview = a(i());
        if (adapterview != null)
        {
            adapterview.b(view, "ProductDetailFragment");
        }
    }

}
