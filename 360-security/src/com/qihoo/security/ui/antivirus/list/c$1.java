// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.text.TextUtils;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.vo.MaliciousInfo;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            c

class b
    implements com.qihoo.security.opti.trashclear.ui.mainpage.opti.
{

    final LocaleTextView a;
    final MaliciousInfo b;
    final c c;

    public void a(String s, String s1)
    {
label0:
        {
            String s2 = (String)a.getTag();
            if (!TextUtils.isEmpty(s2) && s2.equals(s1) && s != null)
            {
                if (!b.isInstalled)
                {
                    break label0;
                }
                a.setLocalText(s);
            }
            return;
        }
        a.setLocalText((new StringBuilder()).append(com.qihoo.security.ui.antivirus.list.c.a(c).a(0x7f0c0102)).append(s).toString());
    }

    fo(c c1, LocaleTextView localetextview, MaliciousInfo maliciousinfo)
    {
        c = c1;
        a = localetextview;
        b = maliciousinfo;
        super();
    }
}
