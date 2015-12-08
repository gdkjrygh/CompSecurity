// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.google;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.c;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.at;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Executor;

// Referenced classes of package com.roidapp.cloudlib.google:
//            d, a, b, c

public class GoogleAuthActivity extends Activity
{

    private boolean a;
    private String b;

    public GoogleAuthActivity()
    {
    }

    static String a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[2048];
        do
        {
            int i = inputstream.read(abyte0, 0, 2048);
            if (i >= 0)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return new String(bytearrayoutputstream.toByteArray(), "UTF-8");
            }
        } while (true);
    }

    private void a()
    {
        if (TextUtils.isEmpty(b))
        {
            an.a(aj.a(), at.i);
            setResult(0, getIntent());
            finish();
            return;
        } else
        {
            c.SINGLE_EXECUTOR.execute(new d(this, b));
            return;
        }
    }

    static boolean a(GoogleAuthActivity googleauthactivity)
    {
        return googleauthactivity.a;
    }

    static boolean b(GoogleAuthActivity googleauthactivity)
    {
        googleauthactivity.a = true;
        return true;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (!isFinishing())
        {
            if (i == 10598)
            {
                if (j == -1)
                {
                    b = intent.getStringExtra("authAccount");
                }
                a();
            } else
            {
                if (i == 21588)
                {
                    a();
                    return;
                }
                if (i == 1)
                {
                    setResult(0, getIntent());
                    finish();
                    return;
                }
            }
        }
    }

    public void onBackPressed()
    {
        setResult(0, getIntent());
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new FrameLayout(this);
        bundle.setBackgroundColor(0);
        setContentView(bundle);
        if (!l.b(this))
        {
            l.a(this, new a(this), new b(this), new com.roidapp.cloudlib.google.c(this));
            return;
        } else
        {
            bundle = new Intent();
            bundle.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
            bundle.setPackage("com.google.android.gms");
            bundle.putExtra("allowableAccounts", null);
            bundle.putExtra("allowableAccountTypes", new String[] {
                "com.google"
            });
            bundle.putExtra("addAccountOptions", null);
            bundle.putExtra("selectedAccount", null);
            bundle.putExtra("alwaysPromptForAccount", false);
            bundle.putExtra("descriptionTextOverride", null);
            bundle.putExtra("authTokenType", null);
            bundle.putExtra("addAccountRequiredFeatures", null);
            bundle.putExtra("setGmsCoreAccount", false);
            bundle.putExtra("overrideTheme", 0);
            bundle.putExtra("overrideCustomTheme", 0);
            startActivityForResult(bundle, 10598);
            return;
        }
    }
}
