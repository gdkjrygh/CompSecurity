// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.f.a;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.jcp.JCP;
import com.jcp.b.b;
import com.jcp.c.ad;
import com.jcp.c.l;
import com.jcp.c.q;
import com.jcp.e.aa;
import com.jcp.e.ae;
import com.jcp.errorstatus.ErrorMessageEntityContainer;
import com.jcp.fragments.ProductDetailFragment;
import com.jcp.fragments.as;
import com.jcp.fragments.el;
import com.jcp.fragments.fd;
import com.jcp.model.GetAddressResponseModel;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.pojo.Profile;
import com.jcp.pojo.ProfilePojo;
import com.jcp.util.af;
import com.jcp.util.bk;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jcp.activities:
//            an, w, x, y, 
//            z, aa, CartCheckoutActivity

public class JcpCheckoutSignIn extends an
    implements aa, ae
{

    private static final String c = com/jcp/activities/JcpCheckoutSignIn.getSimpleName();
    protected String a;
    protected String b;
    private int d;
    private EditText e;
    private EditText f;
    private ToggleButton g;
    private Button h;
    private Button i;
    private ImageView j;
    private TextView k;
    private SharedPreferences l;
    private Profile m;
    private Bundle n;
    private String o;
    private android.view.View.OnClickListener p;
    private android.view.View.OnClickListener q;
    private android.view.View.OnClickListener r;
    private android.view.View.OnClickListener s;

    public JcpCheckoutSignIn()
    {
        p = new w(this);
        q = new x(this);
        r = new y(this);
        s = new z(this);
    }

    static int a(JcpCheckoutSignIn jcpcheckoutsignin, int i1)
    {
        jcpcheckoutsignin.d = i1;
        return i1;
    }

    static void a(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        jcpcheckoutsignin.j();
    }

    static void a(JcpCheckoutSignIn jcpcheckoutsignin, boolean flag)
    {
        jcpcheckoutsignin.a(flag);
    }

    private void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = l.edit();
        editor.putBoolean("keep_me_signin", flag);
        editor.commit();
    }

    static EditText b(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        return jcpcheckoutsignin.e;
    }

    static EditText c(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        return jcpcheckoutsignin.f;
    }

    private void c()
    {
        l = getApplicationContext().getSharedPreferences("com.jcp.activities", 0);
    }

    static ToggleButton d(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        return jcpcheckoutsignin.g;
    }

    static void e(JcpCheckoutSignIn jcpcheckoutsignin)
    {
        jcpcheckoutsignin.k();
    }

    private void g()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        e = (EditText)findViewById(0x7f0e0100);
        flag = l.getBoolean("keep_me_signin", false);
        if (m == null) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            e.setText(m.getUsername());
        }
_L4:
        f = (EditText)findViewById(0x7f0e0101);
        g = (ToggleButton)findViewById(0x7f0e0105);
        h = (Button)findViewById(0x7f0e0104);
        i = (Button)findViewById(0x7f0e0106);
        k = (TextView)findViewById(0x7f0e0107);
        j = (ImageView)findViewById(0x7f0e0095);
        g.setChecked(flag);
        if (!TextUtils.isEmpty(o) && o.equals(com/jcp/fragments/fd.getName()))
        {
            i.setVisibility(8);
        }
        return;
_L2:
        if (flag)
        {
            a(false);
            flag = flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void h()
    {
        g.setOnClickListener(s);
        h.setOnClickListener(p);
        i.setOnClickListener(q);
        j.setOnClickListener(r);
        k.setOnClickListener(new com.jcp.activities.aa(this));
    }

    private void i()
    {
        JCP.s().a(true, true);
    }

    private void j()
    {
        ((InputMethodManager)getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }

    private void k()
    {
        l l1 = new l(this);
        l1.a(this);
        l1.a(com.jcp.b.b.y(), ad.a(b, a), 1);
    }

    private void l()
    {
        q q1 = new q(this);
        q1.a(this);
        q1.a();
    }

    protected String a()
    {
        return "CHECKOUTSIGNIN";
    }

    public void a(int i1, ErrorMessageEntityContainer errormessageentitycontainer)
    {
        if (!com.jcp.http.b.a(i1))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (TextUtils.isEmpty(o))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (!o.equals(com/jcp/fragments/fd.getName())) goto _L2; else goto _L1
_L1:
        i();
        setResult(-1);
        finish();
_L4:
        return;
_L2:
        if (!o.equals(com/jcp/fragments/el.getName()) && !o.equals(com/jcp/fragments/as.getName()) && !o.equals(com/jcp/fragments/ProductDetailFragment.getName())) goto _L4; else goto _L3
_L3:
        i();
        l();
        return;
        if (d == 1)
        {
            i();
            errormessageentitycontainer = new a();
            errormessageentitycontainer.put("", "");
            JCP.s().b(this, errormessageentitycontainer, this);
            return;
        } else
        {
            errormessageentitycontainer = new Intent(this, com/jcp/activities/CartCheckoutActivity);
            Bundle bundle = new Bundle();
            bundle.putInt("from", 3);
            bundle.putString("url", com.jcp.b.b.j());
            errormessageentitycontainer.putExtras(bundle);
            setResult(2000, errormessageentitycontainer);
            finish();
            return;
        }
        af.a(this, errormessageentitycontainer);
        return;
    }

    public void a(GetAccountResponse getaccountresponse, int i1)
    {
        JCP.s().a(getaccountresponse);
        if (!isFinishing())
        {
            setResult(-1);
            finish();
        }
    }

    public void a(String s1, String s2, int i1)
    {
        if (i1 == 7)
        {
            setResult(0);
            finish();
        }
    }

    public void a(List list, int i1)
    {
    }

    public void a(GetAddressResponseModel agetaddressresponsemodel[], int i1)
    {
    }

    public void a_(String s1, int i1)
    {
    }

    public void a_(ProfilePojo aprofilepojo[], int i1)
    {
    }

    public void b(int i1, String s1)
    {
        if (com.jcp.http.b.a(i1))
        {
            s1 = new Intent(this, com/jcp/activities/CartCheckoutActivity);
            Bundle bundle = new Bundle();
            bundle.putInt("from", 3);
            bundle.putString("url", com.jcp.b.b.h());
            s1.putExtras(bundle);
            setResult(2000, s1);
            l();
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001e);
        c();
        getWindow().setSoftInputMode(32);
        m = bk.a(getApplicationContext());
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
        if (getIntent() != null)
        {
            n = getIntent().getExtras();
        }
        if (n != null && n.containsKey("from"))
        {
            o = n.getString("from");
        }
        g();
        h();
    }

}
