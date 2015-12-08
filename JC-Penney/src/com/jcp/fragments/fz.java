// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.os.Bundle;
import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import com.jcp.JCP;
import com.jcp.adapters.CustomSavedItemAdapter;
import com.jcp.b.a;
import com.jcp.c.aa;
import com.jcp.e.ai;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.util.bo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.fragments:
//            s, ah, t

public class fz extends s
    implements android.view.View.OnClickListener, ai
{

    private Button a;
    private aa b;
    private ListView c;
    private ImageView d;
    private boolean e;
    private String f;
    private String g;
    private int h;

    public fz()
    {
    }

    private void W()
    {
        Object obj = i();
        if (obj != null)
        {
            obj = a(((ac) (obj)));
            if (obj != null)
            {
                ((t) (obj)).c(new ah(), "DepartmentFragment");
            }
        }
    }

    public void U()
    {
        d.setVisibility(0);
        a.setVisibility(0);
    }

    public void V()
    {
        d.setVisibility(8);
        a.setVisibility(8);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        i().findViewById(0x7f0e0164).setVisibility(8);
        bundle = h();
        if (bundle != null)
        {
            if (bundle.containsKey("isUpdatingSavedItems"))
            {
                e = bundle.getBoolean("isUpdatingSavedItems");
            }
            if (bundle.containsKey("ItemID"))
            {
                f = bundle.getString("ItemID");
            }
            if (bundle.containsKey("id"))
            {
                g = bundle.getString("id");
            }
            if (bundle.containsKey("quantity"))
            {
                h = bundle.getInt("quantity");
            }
        }
        b = new aa(i());
        if (e)
        {
            bundle = new JSONObject();
            try
            {
                bundle.put("id", f);
                bundle.put("quantity", h);
            }
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
            b.a(this);
            b.c(bundle, g);
        } else
        {
            b.a(this);
            b.d();
        }
        layoutinflater = layoutinflater.inflate(0x7f03007d, viewgroup, false);
        c = (ListView)layoutinflater.findViewById(0x7f0e02e7);
        a = (Button)layoutinflater.findViewById(0x7f0e02e9);
        a.setOnClickListener(this);
        d = (ImageView)layoutinflater.findViewById(0x7f0e02e8);
        b();
        return layoutinflater;
    }

    protected String a()
    {
        return "SAVEDITEM";
    }

    public void a(int i, int j)
    {
    }

    public void a(int i, String s1, int j)
    {
        ac ac1 = i();
        if (ac1 == null) goto _L2; else goto _L1
_L1:
        if (j != 40 || i != 200) goto _L4; else goto _L3
_L3:
        if (s1 == null || s1.isEmpty()) goto _L6; else goto _L5
_L5:
        V();
        s1 = (com.jcp.pojo.SavedItems[])com.jcp.util.aa.a(s1, [Lcom/jcp/pojo/SavedItems;);
        JCP.b().a(s1);
        if (s1 != null)
        {
            c.setAdapter(new CustomSavedItemAdapter(this, ac1, s1));
        }
_L2:
        return;
_L6:
        U();
        JCP.b().a(null);
        return;
_L4:
        if (j == 42 && i == 200)
        {
            b = new aa(ac1);
            b.a(this);
            b.d();
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void b()
    {
        a(a(0x7f0703a3));
        super.b();
        if (JCP.b().a())
        {
            c.setAdapter(null);
            b.d();
        }
    }

    public void c(int i, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        U();
        JCP.b().a(null);
    }

    public void d(int i, ErrorMessageEntityContainer errormessageentitycontainer)
    {
    }

    public void f_()
    {
        super.f_();
        if (com.jcp.b.a.f())
        {
            com.jcp.b.a.g(false);
            b = new aa(i());
            b.a(this);
            b.d();
        }
        P();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624681: 
            W();
            break;
        }
    }
}
