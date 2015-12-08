// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.roidapp.baselib.a.a;
import com.roidapp.cloudlib.al;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            q, r, b, p

public class PushAdActivity extends Activity
{

    public PushAdActivity()
    {
    }

    private void a()
    {
        startActivity(new Intent(this, al.g().a()));
        finish();
    }

    static void a(PushAdActivity pushadactivity)
    {
        pushadactivity.a();
    }

    protected void onCreate(Bundle bundle)
    {
        FrameLayout framelayout;
        super.onCreate(bundle);
        framelayout = new FrameLayout(this);
        setContentView(framelayout);
        if (getIntent() == null) goto _L2; else goto _L1
_L1:
        bundle = q.b();
        Bundle bundle1 = getIntent().getExtras();
        if (bundle1 == null)
        {
            bundle = null;
        } else
        {
            bundle = new r(bundle);
            com.roidapp.cloudlib.ads.r.a(bundle, bundle1.getInt("adType"));
            com.roidapp.cloudlib.ads.r.a(bundle, bundle1.getString("playUrl"));
            r.b(bundle, bundle1.getString("resUrl"));
            r.c(bundle, bundle1.getString("package"));
            r.d(bundle, bundle1.getString("url"));
        }
        if (bundle == null || !q.b(bundle)) goto _L2; else goto _L3
_L3:
        bundle.a();
        JVM INSTR tableswitch 1 1: default 76
    //                   1 148;
           goto _L2 _L4
_L2:
        a();
        return;
_L4:
        com.roidapp.baselib.a.a.a();
        android.graphics.Bitmap bitmap = com.roidapp.baselib.a.a.a(com.roidapp.cloudlib.ads.b.a(bundle.b()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        if (bitmap != null)
        {
            ImageView imageview = new ImageView(this);
            imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            imageview.setImageBitmap(bitmap);
            boolean flag;
            if (r.b(bundle) != null || r.e(bundle) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                imageview.setOnClickListener(new p(this, bundle));
            }
            framelayout.addView(imageview, -1, -1);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            a();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }
}
