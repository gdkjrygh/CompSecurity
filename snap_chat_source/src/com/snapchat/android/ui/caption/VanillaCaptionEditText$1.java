// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import Mf;
import Mo;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.ui.caption:
//            VanillaCaptionEditText, CaptionEditText

final class a
    implements TextWatcher
{

    private VanillaCaptionEditText a;

    public final void afterTextChanged(Editable editable)
    {
        if (!a.g) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        String s1;
        s1 = editable.toString();
        VanillaCaptionEditText vanillacaptionedittext = a;
        s = s1;
        do
        {
label0:
            {
                boolean flag;
                if (vanillacaptionedittext.getPaint().measureText(s) > 0.975F * (float)vanillacaptionedittext.u)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                s = s.substring(0, s.length() - 1);
            }
        } while (true);
        if (!TextUtils.equals(s1, s))
        {
            a.a(s.length());
            a.g = true;
            editable.clear();
            editable.append(s);
            a.m = s.length();
            a.g = false;
        } else
        if (a.m > 0)
        {
            a.m = Math.max(a.m, s1.length());
        }
        if (!a.i) goto _L1; else goto _L3
_L3:
        if (a.l())
        {
            Mf.a().a(new Mo(6));
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (((CaptionEditText) (a)).j) goto _L1; else goto _L4
_L4:
        Mf.a().a(new Mo(-1));
        return;
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (VanillaCaptionEditText vanillacaptionedittext)
    {
        a = vanillacaptionedittext;
        super();
    }
}
