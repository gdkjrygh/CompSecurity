// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.text.Editable;
import android.widget.EditText;
import com.roidapp.cloudlib.upload.ab;
import com.roidapp.cloudlib.upload.x;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad, au

final class aq
    implements ab
{

    final ad a;

    aq(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void a()
    {
        ad.a(a, false);
        while (ad.o(a) == null || !ad.o(a).isAdded() || ad.r(a) == null || ad.s(a).a == ad.r(a).a) 
        {
            return;
        }
        ad.a(a, true);
        ad.o(a).a(ad.r(a).a);
        ad.a(a, ad.r(a));
    }

    public final void a(String s, String s1)
    {
        int j;
        ad.n(a).getSelectionStart();
        j = ad.n(a).getSelectionEnd();
        s = ad.n(a).getEditableText();
        if (j <= 1) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder();
        i = j - 1;
_L5:
        char c;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        c = s.charAt(i);
        if (c == ' ')
        {
            break MISSING_BLOCK_LABEL_240;
        }
        if (c != '@') goto _L4; else goto _L3
_L3:
        i++;
_L7:
        if (i != -1 && stringbuilder.length() > 0)
        {
            s.replace(i, j, (new StringBuilder()).append(s1).append(" ").toString());
        } else
        {
            s.insert(j, (new StringBuilder("@")).append(s1).append(" ").toString());
        }
_L6:
        ad.a(a, false);
        if (ad.o(a) != null)
        {
            ad.p(a);
        }
        return;
_L4:
        stringbuilder.append(c);
        i--;
          goto _L5
_L2:
        s.insert(j, (new StringBuilder("@")).append(s1).append(" ").toString());
          goto _L6
        i = -1;
          goto _L7
    }
}
