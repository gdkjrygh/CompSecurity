// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.net.Uri;
import com.kik.cards.web.bd;
import com.kik.g.i;

// Referenced classes of package kik.android.chat.fragment:
//            KikCardBrowserFragment

final class bl extends i
{

    final KikCardBrowserFragment a;

    bl(KikCardBrowserFragment kikcardbrowserfragment)
    {
        a = kikcardbrowserfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
label0:
        {
            obj = (com.kik.cards.web.aq.b)obj1;
            obj1 = Uri.parse(((com.kik.cards.web.aq.b) (obj)).a);
            if (((Uri) (obj1)).getScheme().equals("http") || ((Uri) (obj1)).getScheme().equals("https") || ((Uri) (obj1)).getScheme().equals("card") || ((Uri) (obj1)).getScheme().equals("cards"))
            {
                KikCardBrowserFragment.a(a);
                if (!((com.kik.cards.web.aq.b) (obj)).c)
                {
                    break label0;
                }
                a.e(((com.kik.cards.web.aq.b) (obj)).a);
            }
            return;
        }
        a.j().loadUrl((new StringBuilder("javascript:location.href='")).append(((com.kik.cards.web.aq.b) (obj)).a).append("'").toString());
    }
}
