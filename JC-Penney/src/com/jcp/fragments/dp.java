// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.jcp.c.a;
import com.jcp.productentity.ProductEntityContainer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class dp
    implements android.view.View.OnClickListener
{

    final EditText a;
    final EditText b;
    final Dialog c;
    final ProductEntityContainer d;
    final ProductDetailFragment e;

    dp(ProductDetailFragment productdetailfragment, EditText edittext, EditText edittext1, Dialog dialog, ProductEntityContainer productentitycontainer)
    {
        e = productdetailfragment;
        a = edittext;
        b = edittext1;
        c = dialog;
        d = productentitycontainer;
        super();
    }

    public void onClick(View view)
    {
        Object obj;
        Object obj1;
        obj = a.getText().toString().trim();
        obj1 = b.getText().toString().trim();
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        Toast.makeText(e.i(), e.j().getString(0x7f0701b2), 0).show();
_L4:
        return;
_L2:
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            Toast.makeText(e.i(), e.j().getString(0x7f0701b2), 0).show();
            return;
        }
        com.jcp.fragments.ProductDetailFragment.a(e, c);
        c.dismiss();
        String s;
        Object obj2;
        JSONObject jsonobject;
        if (ProductDetailFragment.C(e))
        {
            view = ProductDetailFragment.O(e);
        } else
        {
            view = d.getItemId();
        }
        s = d.getId();
        obj2 = d.getType();
        if (TextUtils.isEmpty(((CharSequence) (obj2))) || !"GIFTCARD".equalsIgnoreCase(((String) (obj2)))) goto _L4; else goto _L3
_L3:
        try
        {
            obj2 = new JSONObject();
            jsonobject = new JSONObject();
            jsonobject.put("type", "TO");
            jsonobject.put("value", obj);
            ((JSONObject) (obj2)).put("type", "from");
            ((JSONObject) (obj2)).put("value", obj1);
            obj = new JSONArray();
            ((JSONArray) (obj)).put(jsonobject);
            ((JSONArray) (obj)).put(obj2);
            obj1 = new JSONObject();
            ((JSONObject) (obj1)).put("attributes", obj);
            ((JSONObject) (obj1)).put("id", d.getItemId());
            ((JSONObject) (obj1)).put("PPID", s);
            ((JSONObject) (obj1)).put("quantity", ProductDetailFragment.d(e));
            obj = new JSONArray();
            ((JSONArray) (obj)).put(obj1);
            obj1 = new JSONObject();
            ((JSONObject) (obj1)).put("items", obj);
            if (ProductDetailFragment.C(e))
            {
                ProductDetailFragment.P(e).a(((JSONObject) (obj1)), view, false);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
            return;
        }
        ProductDetailFragment.P(e).a(((JSONObject) (obj1)));
        return;
    }
}
