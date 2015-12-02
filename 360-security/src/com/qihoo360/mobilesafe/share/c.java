// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.qihoo.security.dialog.h;
import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo.security.ui.a;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.b.s;

// Referenced classes of package com.qihoo360.mobilesafe.share:
//            SharedPref

public class c
{

    public static void a(Context context)
    {
        com.qihoo360.mobilesafe.share.SharedPref.a(context, "key_rating_lastest_show_time", System.currentTimeMillis());
    }

    public static void a(Context context, String s1, int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        com.qihoo.security.support.b.c(17025);
_L4:
        h h1 = new h(context);
        h1.a(s1);
        h1.b(d.a().a(0x7f0c00cc));
        h1.setButtonText(new CharSequence[] {
            d.a().a(0x7f0c00ce), d.a().a(0x7f0c00cd)
        });
        h1.setCancelable(true);
        h1.setOnShowListener(new android.content.DialogInterface.OnShowListener(h1) {

            final h a;

            public void onShow(DialogInterface dialoginterface)
            {
                a.a();
            }

            
            {
                a = h1;
                super();
            }
        });
        h1.setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener(context, h1, i) {

                final Context a;
                final h b;
                final int c;

                public void onClick(View view)
                {
                    com.qihoo360.mobilesafe.share.SharedPref.a(a, "is_click_rating_dialog", true);
                    com.qihoo.security.ui.a.e(a);
                    b.dismiss();
                    if (c == 0)
                    {
                        com.qihoo.security.support.b.c(17026);
                    } else
                    {
                        if (c == 1)
                        {
                            com.qihoo.security.support.b.c(17003);
                            return;
                        }
                        if (c == 2)
                        {
                            com.qihoo.security.support.b.c(17004);
                            return;
                        }
                    }
                }

            
            {
                a = context;
                b = h1;
                c = i;
                super();
            }
            }, new android.view.View.OnClickListener(h1) {

                final h a;

                public void onClick(View view)
                {
                    a.dismiss();
                }

            
            {
                a = h1;
                super();
            }
            }
        });
        h1.show();
        a(context);
        return;
_L2:
        if (i == 1)
        {
            com.qihoo.security.support.b.c(17001);
        } else
        if (i == 2)
        {
            com.qihoo.security.support.b.c(17002);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(Context context, int i, long l, int j)
    {
        if (!b(context))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (i < 20) goto _L2; else goto _L1
_L1:
        l = com.qihoo360.mobilesafe.share.SharedPref.b(context, "the_last_start_app_time", 0L);
        boolean flag;
        if (System.currentTimeMillis() - Long.valueOf(l).longValue() <= 0x240c8400L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        flag = com.qihoo360.mobilesafe.share.SharedPref.b(context, "the_first_start_app", false);
        if (i == 0 || flag) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (l == 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l < 0x6400000L)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (j >= 1) goto _L3; else goto _L6
_L6:
        return false;
        return false;
    }

    public static boolean b(Context context)
    {
        boolean flag1 = s.a(context, "com.android.vending");
        boolean flag2 = o.d(context);
        boolean flag3 = com.qihoo360.mobilesafe.share.SharedPref.b(context, "is_click_rating_dialog", false);
        long l = com.qihoo360.mobilesafe.share.SharedPref.b(context, "key_rating_lastest_show_time", 0L);
        boolean flag;
        if (System.currentTimeMillis() - l >= 0x48190800L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag1 && flag2 && !flag3 && flag;
    }
}
