// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.i;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad

final class ao
    implements TextWatcher
{

    final ad a;
    private boolean b;

    ao(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        int j;
        int k;
        j = ad.n(a).getSelectionStart();
        k = ad.n(a).getSelectionEnd();
        if (editable.length() <= 250) goto _L2; else goto _L1
_L1:
        a.v().a(a.getActivity().getString(at.r, new Object[] {
            Integer.valueOf(250)
        }));
        a.v().a();
        editable.delete(j - 1, k);
        ad.n(a).setTextKeepState(editable);
_L7:
        return;
_L2:
        StringBuilder stringbuilder;
        if (k <= 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        stringbuilder = new StringBuilder();
        j = k - 1;
_L5:
        char c;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        c = editable.charAt(j);
        if (c == ' ')
        {
            break MISSING_BLOCK_LABEL_243;
        }
        if (c != '@') goto _L4; else goto _L3
_L3:
        j++;
_L9:
        if (j != -1 && stringbuilder.length() > 1)
        {
            ad.a(a, stringbuilder.reverse().toString(), j, k);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(c);
        j--;
          goto _L5
        if (ad.o(a) == null) goto _L7; else goto _L6
_L6:
        ad.p(a);
        return;
        if (ad.o(a) == null) goto _L7; else goto _L8
_L8:
        ad.p(a);
        return;
        j = -1;
          goto _L9
    }

    public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
    {
        if (charsequence.toString().trim().length() > 0)
        {
            if (!b)
            {
                ad.m(a).setImageResource(aq.c);
            }
            b = true;
            return;
        }
        if (b)
        {
            ad.m(a).setImageResource(aq.m);
        }
        b = false;
    }
}
