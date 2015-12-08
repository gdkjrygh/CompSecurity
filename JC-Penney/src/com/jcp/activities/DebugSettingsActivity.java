// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import com.jcp.b.b;
import com.jcp.util.au;
import java.lang.ref.WeakReference;

// Referenced classes of package com.jcp.activities:
//            an, m, n

public class DebugSettingsActivity extends an
{

    private static WeakReference b = new WeakReference(null);
    private static final String c = com/jcp/activities/DebugSettingsActivity.getSimpleName();
    private static final String e[] = {
        "DPCluster", "dpAlpha"
    };
    private Handler a;
    protected CheckBox alphaCheckbox;
    protected EditText alphaValue;
    protected Spinner apiVersionValue;
    protected CheckBox clusterCheckbox;
    protected EditText clusterValue;
    private int d;
    protected EditText domainView;
    protected EditText dpAkaMaiOneView;
    protected EditText dpAkaMaiView;
    protected CheckBox enableFutureDate;
    protected CheckBox qaView;
    protected RadioGroup radioView;
    protected EditText secureUrlView;
    protected EditText urlView;

    public DebugSettingsActivity()
    {
        a = new Handler();
        d = -1;
    }

    private void a(String s, CheckBox checkbox, EditText edittext)
    {
        android.content.SharedPreferences.Editor editor = getSharedPreferences("com.jcp.activities", 0).edit();
        edittext = edittext.getText().toString();
        if (checkbox.isChecked() && !TextUtils.isEmpty(edittext))
        {
            editor.putString(s, edittext.trim());
        } else
        {
            editor.remove(s);
        }
        editor.commit();
    }

    static WeakReference c()
    {
        return b;
    }

    private void g()
    {
        a("DPCluster", clusterCheckbox, clusterValue);
    }

    private void h()
    {
        a("dpAlpha", alphaCheckbox, alphaValue);
    }

    protected String a()
    {
        return null;
    }

    protected boolean b()
    {
        return false;
    }

    void onAlphaCheckbox()
    {
        alphaValue.setEnabled(alphaCheckbox.isChecked());
        alphaValue.setText("");
    }

    void onCancel()
    {
        finish();
    }

    void onClusterCheckbox()
    {
        clusterValue.setEnabled(clusterCheckbox.isChecked());
        clusterValue.setText("");
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030022);
        a.post(new m(this));
    }

    public void onDestroy()
    {
        b = null;
        super.onDestroy();
    }

    void onEnableFutureDate()
    {
        b.j = enableFutureDate.isChecked();
        android.content.SharedPreferences.Editor editor = getSharedPreferences("com.jcp.activities", 0).edit();
        if (b.j)
        {
            editor.putBoolean("com.jcp.enable_future_date", true);
        } else
        {
            editor.remove("com.jcp.enable_future_date");
        }
        editor.apply();
    }

    void onOk()
    {
        b.b = domainView.getText().toString();
        b.d = urlView.getText().toString();
        b.f = secureUrlView.getText().toString();
        b.g = dpAkaMaiView.getText().toString();
        b.h = dpAkaMaiOneView.getText().toString();
        b.i = qaView.isChecked();
        b.j = enableFutureDate.isChecked();
        g();
        h();
        if (d <= 0) goto _L2; else goto _L1
_L1:
        android.content.SharedPreferences.Editor editor = getSharedPreferences("com.jcp.activities", 0).edit();
        editor.putInt("com.jcp.endpoint_index", d - 1);
        editor.putString("com.jcp.version_index", getResources().getStringArray(0x7f0c0001)[apiVersionValue.getSelectedItemPosition()]);
        editor.commit();
_L4:
        au.a(this, " Please restart the application to change the end points", "OK", null, new n(this), null);
        return;
_L2:
        if (d == 0)
        {
            Toast.makeText(this, "Custom settings will not persist!", 1).show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
