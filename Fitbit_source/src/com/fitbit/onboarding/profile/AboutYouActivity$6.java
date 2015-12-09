// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.profile;

import android.app.AlertDialog;
import android.support.v4.app.FragmentActivity;
import android.util.Pair;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.SignupException;
import com.fitbit.home.ui.f;
import com.fitbit.home.ui.g;
import com.fitbit.ui.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.onboarding.profile:
//            AboutYouActivity

class a extends g
{

    final AboutYouActivity a;

    public void a()
    {
        super.a();
        if (com.fitbit.onboarding.profile.AboutYouActivity.f(a))
        {
            dg.d().c(true);
            an.a().d();
            m().setResult(0);
            m().finish();
            return;
        } else
        {
            m().setResult(-1);
            m().finish();
            return;
        }
    }

    public void a(Exception exception)
    {
        if (com.fitbit.onboarding.profile.AboutYouActivity.f(a)) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        if (!(exception instanceof SignupException))
        {
            break MISSING_BLOCK_LABEL_373;
        }
        i().d();
        SignupException signupexception = (SignupException)exception;
        exception = "";
        iterator = signupexception.a().iterator();
_L10:
        Object obj;
        Pair pair;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        pair = (Pair)iterator.next();
        obj = exception;
        if (!exception.equals(""))
        {
            obj = (new StringBuilder()).append(exception).append("\n").toString();
        }
        ((Integer)pair.first).intValue();
        JVM INSTR tableswitch 1 5: default 140
    //                   1 183
    //                   2 241
    //                   3 271
    //                   4 301
    //                   5 330;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        exception = (new StringBuilder()).append(((String) (obj))).append(((String)pair.second).replace("<em>", "").replace("</em>", "")).toString();
        continue; /* Loop/switch isn't completed */
_L4:
        exception = a.getString(0x7f080187);
        obj = new android.app.(m());
        ((android.app.) (obj)).setPositiveButton(0x7f08042e, null);
        ((android.app.) (obj)).setMessage(exception);
        exception = ((android.app.) (obj)).create();
    /* block-local class not found */
    class _cls1 {}

        exception.setOnDismissListener(new _cls1());
        exception.show();
_L2:
        return;
_L5:
        exception = (new StringBuilder()).append(((String) (obj))).append(a.getString(0x7f08018f)).toString();
        continue; /* Loop/switch isn't completed */
_L6:
        exception = (new StringBuilder()).append(((String) (obj))).append(a.getString(0x7f08018f)).toString();
        continue; /* Loop/switch isn't completed */
_L7:
        exception = (new StringBuilder()).append(((String) (obj))).append((String)pair.second).toString();
        continue; /* Loop/switch isn't completed */
_L8:
        exception = (new StringBuilder()).append(((String) (obj))).append(a.getString(0x7f08018f)).toString();
        if (true) goto _L10; else goto _L9
_L9:
        s.a(m(), exception, 1).i();
        return;
        if (exception instanceof IncorrectTimestampException)
        {
            i().d();
            exception = a.getString(0x7f080286);
            s.a(m(), exception, 1).i();
            return;
        } else
        {
            super.a(exception);
            return;
        }
    }

    xception(AboutYouActivity aboutyouactivity, FragmentActivity fragmentactivity, int i)
    {
        a = aboutyouactivity;
        super(fragmentactivity, i);
    }
}
