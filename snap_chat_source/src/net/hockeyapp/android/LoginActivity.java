// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afM;
import agd;
import agg;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import net.hockeyapp.android.views.LoginView;

public class LoginActivity extends Activity
    implements android.view.View.OnClickListener
{

    private String a;
    private String b;
    private int c;
    private agd d;
    private Handler e;

    public LoginActivity()
    {
    }

    private static String a(String s)
    {
        byte abyte0[];
        StringBuilder stringbuilder;
        int i;
        int j;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes());
            abyte0 = messagedigest.digest();
            stringbuilder = new StringBuilder();
            j = abyte0.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        for (s = Integer.toHexString(abyte0[i] & 0xff); s.length() < 2; s = (new StringBuilder("0")).append(s).toString()) { }
        stringbuilder.append(s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_33;
_L1:
        s = stringbuilder.toString();
        return s;
    }

    public void onClick(View view)
    {
        boolean flag = true;
        switch (view.getId())
        {
        default:
            return;

        case 12293: 
            view = ((EditText)findViewById(12291)).getText().toString();
            break;
        }
        String s = ((EditText)findViewById(12292)).getText().toString();
        HashMap hashmap = new HashMap();
        if (c == 1)
        {
            if (!TextUtils.isEmpty(view))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashmap.put("email", view);
            hashmap.put("authcode", a((new StringBuilder()).append(b).append(view).toString()));
        } else
        if (c == 2)
        {
            if (TextUtils.isEmpty(view) || TextUtils.isEmpty(s))
            {
                flag = false;
            }
            hashmap.put("email", view);
            hashmap.put("password", s);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            d = new agd(this, e, a, c, hashmap);
            agg.a(d);
            return;
        } else
        {
            Toast.makeText(this, afM.a(1281), 1000).show();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(new LoginView(this));
        bundle = getIntent().getExtras();
        if (bundle != null)
        {
            a = bundle.getString("url");
            b = bundle.getString("secret");
            c = bundle.getInt("mode");
        }
        if (c == 1)
        {
            ((EditText)findViewById(12292)).setVisibility(4);
        }
        ((Button)findViewById(12293)).setOnClickListener(this);
        e = new Handler() {

            private LoginActivity a;

            public final void handleMessage(Message message)
            {
                if (message.getData().getBoolean("success"))
                {
                    a.finish();
                    return;
                } else
                {
                    Toast.makeText(a, "Login failed. Check your credentials.", 2000).show();
                    return;
                }
            }

            
            {
                a = LoginActivity.this;
                super();
            }
        };
        bundle = ((Bundle) (getLastNonConfigurationInstance()));
        if (bundle != null)
        {
            d = (agd)bundle;
            bundle = d;
            Handler handler = e;
            bundle.a = this;
            bundle.b = handler;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            keyevent = new Intent(this, null);
            keyevent.setFlags(0x4000000);
            keyevent.putExtra("net.hockeyapp.android.EXIT", true);
            startActivity(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (d != null)
        {
            agd agd1 = d;
            agd1.a = null;
            agd1.b = null;
            agd1.c = null;
        }
        return d;
    }
}
