// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.PortPackageParser;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.b.q;
import java.io.File;

public class AppDetailActivity extends BaseActivity
{

    private View A;
    private LocaleTextView B;
    private View C;
    private MaliciousInfo D;
    private View E;
    private ImageView y;
    private LocaleTextView z;

    public AppDetailActivity()
    {
    }

    static MaliciousInfo a(AppDetailActivity appdetailactivity)
    {
        return appdetailactivity.D;
    }

    private void o()
    {
        y = (ImageView)findViewById(0x7f0b0086);
        z = (LocaleTextView)findViewById(0x7f0b0088);
        A = findViewById(0x7f0b0087);
        B = (LocaleTextView)findViewById(0x7f0b0089);
        C = findViewById(0x7f0b008b);
        E = findViewById(0x7f0b008a);
    }

    private void p()
    {
        E.setOnClickListener(new android.view.View.OnClickListener() {

            final AppDetailActivity a;

            public void onClick(View view)
            {
                if (com.qihoo.security.ui.antivirus.AppDetailActivity.a(a).isUninstall(a))
                {
                    a.finish();
                    return;
                }
                if (!com.qihoo.security.ui.antivirus.AppDetailActivity.a(a).isInstalled)
                {
                    break MISSING_BLOCK_LABEL_123;
                }
                Intent intent;
                try
                {
                    intent = a.getPackageManager().getLaunchIntentForPackage(com.qihoo.security.ui.antivirus.AppDetailActivity.a(a).packageName);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    q.a().a(0x7f0c0110);
                    return;
                }
                view = intent;
                if (intent != null)
                {
                    break MISSING_BLOCK_LABEL_97;
                }
                view = new Intent("android.intent.action.MAIN");
                view.addCategory("android.intent.category.LAUNCHER");
                view.setPackage(com.qihoo.security.ui.antivirus.AppDetailActivity.a(a).packageName);
                view.addFlags(0x10000000);
                a.startActivity(view);
                return;
                q.a().a(0x7f0c010f);
                return;
            }

            
            {
                a = AppDetailActivity.this;
                super();
            }
        });
        Object obj;
        Object obj1;
        if (D.isInstalled)
        {
            A.setVisibility(8);
            E.setVisibility(0);
        } else
        {
            A.setVisibility(0);
            E.setVisibility(8);
        }
        obj = com.qihoo360.mobilesafe.b.a.c(p, D.packageName, D.filePath, D.isInstalled);
        if (obj != null)
        {
            y.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        }
        obj1 = D.getLabel(p);
        obj = obj1;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = D.packageName;
        }
        if (!D.isInstalled)
        {
            obj = D.getLabel(p);
        }
        z.setLocalText(((CharSequence) (obj)));
        B.setLocalText(o.a(0x7f0c010e, new Object[] {
            com.qihoo360.mobilesafe.b.a.b(p, D.packageName, D.filePath, D.isInstalled)
        }));
        obj = (LinearLayout)findViewById(0x7f0b008e);
        if (D.isInstalled)
        {
            obj1 = new com.qihoo.security.ui.a.a(this, D.packageName);
            if (((com.qihoo.security.ui.a.a) (obj1)).a() > 0)
            {
                C.setVisibility(0);
                ((LinearLayout) (obj)).addView(((com.qihoo.security.ui.a.a) (obj1)).b());
                return;
            } else
            {
                C.setVisibility(8);
                return;
            }
        }
        obj1 = new DisplayMetrics();
        ((DisplayMetrics) (obj1)).setToDefaults();
        obj1 = PortPackageParser.parsePackage(new File(D.filePath), null, ((DisplayMetrics) (obj1)), 0);
        if (obj1 == null)
        {
            C.setVisibility(8);
            return;
        }
        obj1 = new com.qihoo.security.ui.a.a(this, ((android.content.pm.PackageParser.Package) (obj1)));
        if (((com.qihoo.security.ui.a.a) (obj1)).a() > 0)
        {
            C.setVisibility(0);
            ((LinearLayout) (obj)).addView(((com.qihoo.security.ui.a.a) (obj1)).b());
            return;
        } else
        {
            C.setVisibility(8);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030027);
        bundle = getIntent();
        if (bundle != null)
        {
            D = (MaliciousInfo)bundle.getParcelableExtra("extra_detail_info");
        }
        if (D == null)
        {
            finish();
            return;
        } else
        {
            b(o.a(0x7f0c010d));
            o();
            p();
            b.c(14005);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (D.isUninstall(this))
        {
            finish();
        }
    }
}
