// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import eg;
import java.util.Iterator;
import java.util.Locale;
import jp;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements android.view.eListener
{

    private SignupFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        view = SignupFragment.b(a);
        jp jp1 = new jp();
        ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jp1);
_L4:
        return;
_L2:
        SignupFragment signupfragment;
        String as[];
        String as1[];
        String s1;
        SignupFragment.a(a, false);
        view = SignupFragment.c(a).getText().toString().trim().toLowerCase(Locale.US);
        signupfragment = a;
        as = view.split("@");
        if (as.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        as1 = as[1].split("\\.");
        if (as1.length != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = as1[0];
        if (!TextUtils.isEmpty(s1) && !SignupFragment.a.contains(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        view = null;
_L7:
        if (view != null)
        {
            view = (new StringBuilder()).append(as[0]).append("@").append(view).append(".").append(as1[1]).toString();
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
            String s = signupfragment.getString(0x7f080101, new Object[] {
                view
            });
            int i = s.indexOf(view);
            spannablestringbuilder.append(s);
            spannablestringbuilder.setSpan(new ForegroundColorSpan(0xff0000ff), i, view.length() + i, 0);
            spannablestringbuilder.setSpan(new ForegroundColorSpan(0xff000000), 0, i, 0);
            spannablestringbuilder.setSpan(new ForegroundColorSpan(0xff000000), i + view.length(), s.length(), 0);
            signupfragment.h.setText(spannablestringbuilder);
            signupfragment.h.setVisibility(0);
            signupfragment.b(false);
            signupfragment.h.setLinksClickable(true);
            signupfragment.b = view;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        eG eg1 = SignupFragment.a.a();
_L8:
        if (!eg1.hasNext()) goto _L6; else goto _L5
_L5:
        int j;
        view = (String)eg1.next();
        j = StringUtils.getLevenshteinDistance(view, s1);
        if (j > 2 || j <= 0) goto _L8; else goto _L7
_L6:
        view = null;
          goto _L7
    }

    ogger(SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
