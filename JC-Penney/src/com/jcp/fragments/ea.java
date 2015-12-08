// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.jcp.c.a;
import java.io.PrintStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class ea
    implements android.view.View.OnClickListener
{

    final EditText a;
    final EditText b;
    final Dialog c;
    final ProductDetailFragment d;

    ea(ProductDetailFragment productdetailfragment, EditText edittext, EditText edittext1, Dialog dialog)
    {
        d = productdetailfragment;
        a = edittext;
        b = edittext1;
        c = dialog;
        super();
    }

    public void onClick(View view)
    {
        Object obj1 = a.getText().toString().trim();
        String s = b.getText().toString().trim();
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            Toast.makeText(d.i(), d.a(0x7f0701a5), 0).show();
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            Toast.makeText(d.i(), d.a(0x7f07019e), 0).show();
            return;
        }
        com.jcp.fragments.ProductDetailFragment.a(d, c);
        c.dismiss();
        try
        {
            view = new JSONObject();
            Object obj = new JSONObject();
            ((JSONObject) (obj)).put("type", "TO");
            ((JSONObject) (obj)).put("value", obj1);
            view.put("type", "from");
            view.put("value", s);
            obj1 = new JSONArray();
            ((JSONArray) (obj1)).put(obj);
            ((JSONArray) (obj1)).put(view);
            view = new JSONObject();
            view.put("attributes", obj1);
            view.put("id", ProductDetailFragment.V(d));
            view.put("ppId", ProductDetailFragment.W(d));
            view.put("quantity", ProductDetailFragment.X(d));
            obj = new JSONArray();
            ((JSONArray) (obj)).put(view);
            view = new JSONObject();
            view.put("items", obj);
            System.out.println((new StringBuilder()).append("itemObject : ").append(view.toString()).toString());
            ProductDetailFragment.P(d).a(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
    }
}
