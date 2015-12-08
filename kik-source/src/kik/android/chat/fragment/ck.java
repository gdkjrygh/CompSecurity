// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.net.Uri;
import com.kik.android.a;
import com.kik.cards.util.b;
import com.kik.cards.web.bf;
import kik.android.chat.activity.k;
import kik.android.util.au;

// Referenced classes of package kik.android.chat.fragment:
//            cj, ci, KikChatFragment

final class ck
    implements Runnable
{

    final Boolean a;
    final cj b;

    ck(cj cj1, Boolean boolean1)
    {
        b = cj1;
        a = boolean1;
        super();
    }

    public final void run()
    {
label0:
        {
            if (a.booleanValue())
            {
                Object obj = b.a.toLowerCase();
                boolean flag;
                if (((String) (obj)).startsWith("card:") || ((String) (obj)).startsWith("cards:"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
                obj = new Intent("android.intent.action.VIEW", Uri.parse(b.a));
                if (!au.a(((Intent) (obj)), b.b.a.getActivity()))
                {
                    break label0;
                }
                b.b.a.startActivity(((Intent) (obj)));
            }
            return;
        }
        b.b.a.g.b("Browser Screen Opened").a("Reason", "Link").a("URL", b.a).a("Domain", bf.i(b.a)).a("Depth", k.e()).b();
        KikCardBrowserFragment.a a1 = new KikCardBrowserFragment.a();
        a1.a(b.a).b(com.kik.cards.util.b.b(b.a)).c("https://kik.com/").a(KikChatFragment.c(b.b.a).h());
        kik.android.chat.fragment.KikChatFragment.a(b.b.a, KikChatFragment.d(b.b.a));
        b.b.a.b(KikChatFragment.e(b.b.a));
        b.b.a.a(a1);
    }
}
