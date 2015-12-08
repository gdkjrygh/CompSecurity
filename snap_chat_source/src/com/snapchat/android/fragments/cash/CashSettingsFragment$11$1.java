// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.cash;

import Bt;
import IC;
import PG;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.snapchat.android.api2.cash.square.data.ErrorType;

// Referenced classes of package com.snapchat.android.fragments.cash:
//            CashSettingsFragment, SecurityCodeFragment

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        CashSettingsFragment.d(a.a).setEnabled(true);
        CashSettingsFragment.c(a.a).setVisibility(0);
        CashSettingsFragment.e(a.a).setVisibility(8);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/cash/CashSettingsFragment$11

/* anonymous class */
    final class CashSettingsFragment._cls11
        implements oo.b
    {

        final CashSettingsFragment a;
        private boolean b;
        private SecurityCodeFragment c;

        public final void a()
        {
            PG.a(new CashSettingsFragment._cls11._cls1(this));
            Bt.n(b);
            if (c != null)
            {
                c.l();
            }
        }

        public final void a(int i)
        {
            ErrorType errortype;
            String s;
            boolean flag;
            flag = false;
            s = (new StringBuilder()).append(IC.a(null, 0x7f08005d, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
            errortype = ErrorType.UNKNOWN;
            i;
            JVM INSTR lookupswitch 2: default 76
        //                       400: 142
        //                       429: 191;
               goto _L1 _L2 _L3
_L1:
            CheckBox checkbox = CashSettingsFragment.c(a);
            RelativeLayout relativelayout = CashSettingsFragment.d(a);
            ProgressBar progressbar = CashSettingsFragment.e(a);
            if (!b)
            {
                flag = true;
            }
            CashSettingsFragment.a(checkbox, relativelayout, progressbar, flag, s);
            if (c != null)
            {
                c.a(errortype, i);
            }
            return;
_L2:
            s = (new StringBuilder()).append(IC.a(null, 0x7f08015f, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ee, new Object[0])).toString();
            errortype = ErrorType.INVALID_PASSCODE;
            continue; /* Loop/switch isn't completed */
_L3:
            s = (new StringBuilder()).append(IC.a(null, 0x7f0802d7, new Object[0])).append('\n').append(IC.a(null, 0x7f0801ef, new Object[0])).toString();
            errortype = ErrorType.TOO_MANY_ATTEMPTS;
            if (true) goto _L1; else goto _L4
_L4:
        }

            
            {
                a = cashsettingsfragment;
                b = flag;
                c = securitycodefragment;
                super();
            }
    }

}
