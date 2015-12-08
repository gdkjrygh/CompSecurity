// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Intent;
import android.widget.Toast;
import com.kik.android.a;
import com.kik.cards.web.bf;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.widget:
//            q, ContentLinkView

final class r extends com.kik.g.r
{

    final q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Intent)obj;
        com.kik.android.a.f f = ContentLinkView.d(a.a).b("Content Link Tapped");
        if ("image".equals(kik.android.widget.ContentLinkView.a(a.a).d()))
        {
            f.a("Content Type", "Image");
        } else
        if (ContentLinkView.e(a.a))
        {
            f.a("Content Type", "Card");
        } else
        if (ContentLinkView.f(a.a))
        {
            f.a("Content Type", "Web");
        } else
        {
            f.a("Content Type", "Native");
        }
        if (kik.android.widget.ContentLinkView.a(a.a).e() != null)
        {
            f.a("Has Byline", true);
        } else
        {
            f.a("Has Byline", false);
        }
        f.a("URL", kik.android.widget.ContentLinkView.a(a.a).f()).b();
        if (ContentLinkView.e(a.a) || ContentLinkView.f(a.a))
        {
            ContentLinkView.d(a.a).b("Browser Screen Opened").a("Reason", "Brand Chat").a("URL", kik.android.widget.ContentLinkView.a(a.a).f()).a("Domain", bf.i(kik.android.widget.ContentLinkView.a(a.a).f())).a("Depth", k.e()).b();
        }
        ((Intent) (obj)).hasExtra("CardLauncher.EXTRA_KIK_MESSAGE");
        try
        {
            ((Intent) (obj)).putExtra("CardsWebViewFragment.EXTRA_REFERER_URL", "https://kik.com/");
            k.a(((Intent) (obj)), a.a.getContext());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Toast.makeText(a.a.getContext(), 0x7f090174, 0).show();
        }
    }

    public final void b(Throwable throwable)
    {
        Toast.makeText(a.a.getContext(), 0x7f090174, 0).show();
    }
}
