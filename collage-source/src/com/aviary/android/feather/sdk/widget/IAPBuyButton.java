// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.aviary.android.feather.cds.h;

public class IAPBuyButton extends RelativeLayout
{

    TextView a;
    View b;
    com.aviary.android.feather.cds.h.b c;
    long d;
    Runnable e;

    public IAPBuyButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new Runnable() {

            final IAPBuyButton a;

            public void run()
            {
                if (a.d > -1L && a.getContext() != null && a.c != null)
                {
                    Pair pair = h.d(a.getContext(), a.d);
                    if (pair != null && a.getContext() != null)
                    {
                        a.a(new com.aviary.android.feather.cds.h.b((com.aviary.android.feather.cds.h.a)pair.first), a.d);
                    }
                }
            }

            
            {
                a = IAPBuyButton.this;
                super();
            }
        };
    }

    public void a(com.aviary.android.feather.cds.h.b b1, long l)
    {
        if (b1 == null || !b1.equals(c)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        byte byte0;
        int j;
        int k;
        boolean flag1;
        boolean flag3;
        c = b1;
        d = l;
        if (getHandler() != null)
        {
            getHandler().removeCallbacks(e);
        }
        if (b1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag3 = isEnabled();
        flag1 = true;
        j = b.getVisibility();
        k = a.getVisibility();
        byte0 = 4;
        i = 0;
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[com.aviary.android.feather.cds.h.a.values().length];
                try
                {
                    a[com.aviary.android.feather.cds.h.a.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.e.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.f.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.h.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.b.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.c.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.k.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.g.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.aviary.android.feather.cds.h.a.j.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[b1.b.ordinal()];
        JVM INSTR tableswitch 1 11: default 152
    //                   1 198
    //                   2 211
    //                   3 253
    //                   4 269
    //                   5 282
    //                   6 295
    //                   7 308
    //                   8 321
    //                   9 337
    //                   10 404
    //                   11 416;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_416;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L16:
        if (flag3 != flag1)
        {
            setEnabled(flag1);
        }
        if (j != byte0)
        {
            b.setVisibility(byte0);
        }
        if (k != i)
        {
            a.setVisibility(i);
            return;
        }
        if (true) goto _L1; else goto _L15
_L15:
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_restore);
          goto _L16
_L5:
        a.setVisibility(0);
        if (b1.a != null)
        {
            a.setText(b1.a);
        } else
        {
            a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_unavailable);
        }
          goto _L16
_L6:
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_owned);
        flag1 = false;
          goto _L16
_L7:
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_uninstall);
          goto _L16
_L8:
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_retry);
          goto _L16
_L9:
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_download);
          goto _L16
_L10:
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_install);
          goto _L16
_L11:
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_installing);
        flag1 = false;
          goto _L16
_L12:
        boolean flag = false;
        byte byte1 = 4;
        boolean flag2 = false;
        i = byte1;
        byte0 = flag;
        flag1 = flag2;
        if (getHandler() != null)
        {
            getHandler().postDelayed(e, (long)(Math.random() * 100D + 900D));
            i = byte1;
            byte0 = flag;
            flag1 = flag2;
        }
          goto _L16
_L13:
        byte0 = 0;
        i = 4;
        flag1 = false;
          goto _L16
        a.setText(com.aviary.android.feather.sdk.R.string.feather_iap_retry);
          goto _L16
    }

    public long getPackId()
    {
        return d;
    }

    public com.aviary.android.feather.cds.h.b getPackOption()
    {
        return c;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        getHandler().removeCallbacks(e);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(com.aviary.android.feather.sdk.R.id.aviary_buy_button_text);
        b = findViewById(com.aviary.android.feather.sdk.R.id.aviary_buy_button_loader);
    }
}
