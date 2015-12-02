// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import android.text.TextUtils;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage.opti:
//            b

class a
    implements a
{

    final LocaleTextView a;
    final b b;

    public void a(String s, String s1)
    {
label0:
        {
            String s2 = (String)a.getTag();
            if (!TextUtils.isEmpty(s2) && s2.equals(s1))
            {
                if (!TextUtils.isEmpty(s))
                {
                    break label0;
                }
                a.setLocalText(s1);
            }
            return;
        }
        a.setLocalText(s);
    }

    (b b1, LocaleTextView localetextview)
    {
        b = b1;
        a = localetextview;
        super();
    }
}
