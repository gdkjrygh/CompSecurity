// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.inmobi.commons.a.a;
import com.inmobi.commons.core.utilities.Logger;
import com.inmobi.commons.core.utilities.info.DisplayInfo;
import com.inmobi.commons.core.utilities.info.c;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Referenced classes of package com.inmobi.rendering:
//            RenderView, CustomView, RenderingProperties

public class InMobiAdActivity extends Activity
{
    public static interface a
    {

        public abstract void a(int i1, Intent intent);
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();
    }

    public static interface c
    {

        public abstract void a(int i1, String as[], int ai[]);
    }


    public static Map a = new HashMap();
    public static Map b = new HashMap();
    public static Integer c = Integer.valueOf(0);
    public static Map d = new HashMap();
    public static Integer e = Integer.valueOf(0);
    private static final String f = com/inmobi/rendering/InMobiAdActivity.getSimpleName();
    private static Stack g = new Stack();
    private static RenderView h;
    private RenderView i;
    private RenderView j;
    private CustomView k;
    private CustomView l;
    private int m;
    private boolean n;

    public InMobiAdActivity()
    {
        n = false;
    }

    public static int a(Intent intent, a a1)
    {
        Integer integer = c;
        c = Integer.valueOf(c.intValue() + 1);
        a.put(c, a1);
        b.put(c, intent);
        return c.intValue();
    }

    private static int a(c c1)
    {
        Integer integer = e;
        e = Integer.valueOf(e.intValue() + 1);
        d.put(e, c1);
        return e.intValue();
    }

    public static int a(RenderView renderview)
    {
        g.push(renderview);
        return g.indexOf(renderview);
    }

    public static RenderView a()
    {
        return (RenderView)g.peek();
    }

    static RenderView a(InMobiAdActivity inmobiadactivity)
    {
        return inmobiadactivity.j;
    }

    private void a(ViewGroup viewgroup)
    {
        float f1 = DisplayInfo.a().c();
        LinearLayout linearlayout = new LinearLayout(this);
        Object obj = new android.widget.RelativeLayout.LayoutParams(-1, (int)(48F * f1));
        linearlayout.setOrientation(0);
        linearlayout.setId(65533);
        linearlayout.setWeightSum(100F);
        linearlayout.setBackgroundResource(0x108009a);
        linearlayout.setBackgroundColor(0xff888888);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12);
        viewgroup.addView(linearlayout, ((android.view.ViewGroup.LayoutParams) (obj)));
        viewgroup = new android.widget.LinearLayout.LayoutParams(-1, -1);
        viewgroup.weight = 25F;
        obj = new CustomView(this, f1, CustomView.SwitchIconType.CLOSE_ICON);
        ((CustomView) (obj)).setOnTouchListener(new android.view.View.OnTouchListener() {

            final InMobiAdActivity a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    view.setBackgroundColor(0xff888888);
                    com.inmobi.rendering.InMobiAdActivity.a(a, true);
                    a.finish();
                } else
                if (motionevent.getAction() == 0)
                {
                    view.setBackgroundColor(0xff00ffff);
                    return true;
                }
                return true;
            }

            
            {
                a = InMobiAdActivity.this;
                super();
            }
        });
        linearlayout.addView(((View) (obj)), viewgroup);
        obj = new CustomView(this, f1, CustomView.SwitchIconType.REFRESH);
        ((CustomView) (obj)).setOnTouchListener(new android.view.View.OnTouchListener() {

            final InMobiAdActivity a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    view.setBackgroundColor(0xff888888);
                    com.inmobi.rendering.InMobiAdActivity.a(a).reload();
                } else
                if (motionevent.getAction() == 0)
                {
                    view.setBackgroundColor(0xff00ffff);
                    return true;
                }
                return true;
            }

            
            {
                a = InMobiAdActivity.this;
                super();
            }
        });
        linearlayout.addView(((View) (obj)), viewgroup);
        obj = new CustomView(this, f1, CustomView.SwitchIconType.BACK);
        ((CustomView) (obj)).setOnTouchListener(new android.view.View.OnTouchListener() {

            final InMobiAdActivity a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() != 1) goto _L2; else goto _L1
_L1:
                view.setBackgroundColor(0xff888888);
                if (!com.inmobi.rendering.InMobiAdActivity.a(a).canGoBack()) goto _L4; else goto _L3
_L3:
                com.inmobi.rendering.InMobiAdActivity.a(a).goBack();
_L6:
                return true;
_L4:
                com.inmobi.rendering.InMobiAdActivity.a(a, true);
                a.finish();
                return true;
_L2:
                if (motionevent.getAction() == 0)
                {
                    view.setBackgroundColor(0xff00ffff);
                    return true;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = InMobiAdActivity.this;
                super();
            }
        });
        linearlayout.addView(((View) (obj)), viewgroup);
        obj = new CustomView(this, f1, CustomView.SwitchIconType.FORWARD_INACTIVE);
        ((CustomView) (obj)).setOnTouchListener(new android.view.View.OnTouchListener() {

            final InMobiAdActivity a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    view.setBackgroundColor(0xff888888);
                    if (com.inmobi.rendering.InMobiAdActivity.a(a).canGoForward())
                    {
                        com.inmobi.rendering.InMobiAdActivity.a(a).goForward();
                    }
                } else
                if (motionevent.getAction() == 0)
                {
                    view.setBackgroundColor(0xff00ffff);
                    return true;
                }
                return true;
            }

            
            {
                a = InMobiAdActivity.this;
                super();
            }
        });
        linearlayout.addView(((View) (obj)), viewgroup);
    }

    public static void a(String as[], c c1)
    {
        if (as == null || as.length == 0)
        {
            return;
        } else
        {
            int i1 = a(c1);
            c1 = new Intent(com.inmobi.commons.a.a.b(), com/inmobi/rendering/InMobiAdActivity);
            c1.putExtra("com.inmobi.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 104);
            c1.putExtra("id", i1);
            c1.putExtra("permissions", as);
            c1.addFlags(0x10000000);
            com.inmobi.commons.a.a.b().startActivity(c1);
            return;
        }
    }

    static boolean a(InMobiAdActivity inmobiadactivity, boolean flag)
    {
        inmobiadactivity.n = flag;
        return flag;
    }

    static RenderView b(InMobiAdActivity inmobiadactivity)
    {
        return inmobiadactivity.i;
    }

    private void b()
    {
        RelativeLayout relativelayout = new RelativeLayout(this);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(10);
        layoutparams.addRule(2, 65533);
        relativelayout.setBackgroundColor(-1);
        relativelayout.addView(j, layoutparams);
        a(relativelayout);
        setContentView(relativelayout);
    }

    public static void b(RenderView renderview)
    {
        h = renderview;
    }

    private void c()
    {
        FrameLayout framelayout = (FrameLayout)findViewById(0x1020002);
        RelativeLayout relativelayout = new RelativeLayout(this);
        float f1 = DisplayInfo.a().c();
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutparams.addRule(10);
        if (i.getParent() != null)
        {
            ((ViewGroup)(ViewGroup)i.getParent()).removeView(i);
        }
        android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams((int)(50F * f1), (int)(50F * f1));
        layoutparams1.addRule(11);
        k = new CustomView(this, f1, CustomView.SwitchIconType.CLOSE_BUTTON);
        k.setId(65532);
        k.setOnClickListener(new android.view.View.OnClickListener() {

            final InMobiAdActivity a;

            public void onClick(View view)
            {
                com.inmobi.rendering.InMobiAdActivity.a(a, true);
                InMobiAdActivity.b(a).j();
            }

            
            {
                a = InMobiAdActivity.this;
                super();
            }
        });
        l = new CustomView(this, f1, CustomView.SwitchIconType.CLOSE_TRANSPARENT);
        l.setId(65531);
        l.setOnClickListener(new android.view.View.OnClickListener() {

            final InMobiAdActivity a;

            public void onClick(View view)
            {
                com.inmobi.rendering.InMobiAdActivity.a(a, true);
                InMobiAdActivity.b(a).j();
            }

            
            {
                a = InMobiAdActivity.this;
                super();
            }
        });
        relativelayout.setId(65534);
        relativelayout.addView(i, layoutparams);
        relativelayout.addView(k, layoutparams1);
        relativelayout.addView(l, layoutparams1);
        relativelayout.setBackgroundColor(0);
        framelayout.addView(relativelayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        i.a(i.e());
        i.b(i.d());
    }

    void a(boolean flag)
    {
        n = flag;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        a a1 = (a)a.get(Integer.valueOf(i1));
        a.remove(Integer.valueOf(i1));
        b.remove(Integer.valueOf(i1));
        a1.a(j1, intent);
        n = true;
        finish();
    }

    public void onBackPressed()
    {
        if (m != 102) goto _L2; else goto _L1
_L1:
        i.h();
        if (!i.f()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        n = true;
        i.j();
        return;
_L2:
        if (m == 100)
        {
            n = true;
            finish();
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (j != null)
        {
            j.k();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        m = getIntent().getIntExtra("com.inmobi.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
        if (m != 100) goto _L2; else goto _L1
_L1:
        bundle = getIntent().getStringExtra("com.inmobi.rendering.InMobiAdActivity.IN_APP_BROWSER_URL");
        j = new RenderView(this, new RenderingProperties(RenderingProperties.PlacementType.FULL_SCREEN));
        j.a(h.getListener(), h.getRenderingConfig(), h.getMraidConfig());
        b();
        j.loadUrl(bundle);
        j.getListener().e(j);
        j.setFullScreenActivity(this);
_L4:
        return;
_L2:
        if (m != 102)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = getIntent().getIntExtra("com.inmobi.rendering.InMobiAdActivity.EXTRA_AD_RENDERVIEW_INDEX", -1);
        if (i1 != -1)
        {
            if (getIntent().getBooleanExtra("com.inmobi.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false))
            {
                requestWindowFeature(1);
                getWindow().setFlags(1024, 1024);
            }
            i = (RenderView)g.get(i1);
            c();
            i.setFullScreenActivity(this);
            if (i.getAdScreenEventsListener() != null)
            {
                i.getAdScreenEventsListener().a();
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (m == 103)
        {
            int j1 = getIntent().getIntExtra("id", -1);
            if (j1 == -1)
            {
                Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, f, "Invalid Request Code Supplied for ACTIVITY_TYPE_FOR_RESULT");
                return;
            } else
            {
                startActivityForResult((Intent)b.get(Integer.valueOf(j1)), j1);
                return;
            }
        }
        if (m == 104)
        {
            int k1 = getIntent().getIntExtra("id", -1);
            if (k1 == -1)
            {
                Logger.a(com.inmobi.commons.core.utilities.Logger.InternalLogLevel.INTERNAL, f, "Invalid Request Code Supplied for ACTIVITY_TYPE_PERMISSIONS_DIALOG");
                return;
            }
            bundle = getIntent().getStringArrayExtra("permissions");
            if (bundle != null && bundle.length > 0)
            {
                com.inmobi.commons.core.utilities.a.a();
                com.inmobi.commons.core.utilities.a.b();
                requestPermissions(bundle, k1);
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (n)
        {
            if (m == 100)
            {
                j.getListener().f(j);
                j.destroy();
            } else
            if (m == 102)
            {
                if (i.getAdScreenEventsListener() != null)
                {
                    i.getAdScreenEventsListener().b();
                }
                g.pop();
                return;
            }
        }
    }

    public void onRequestPermissionsResult(int i1, String as[], int ai[])
    {
        super.onRequestPermissionsResult(i1, as, ai);
        com.inmobi.commons.core.utilities.a.a();
        com.inmobi.commons.core.utilities.a.c();
        c c1 = (c)d.get(Integer.valueOf(i1));
        d.remove(Integer.valueOf(i1));
        if (c1 != null)
        {
            c1.a(i1, as, ai);
        }
        finish();
    }

}
