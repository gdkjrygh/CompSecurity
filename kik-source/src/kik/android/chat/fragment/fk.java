// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.widget.Toast;
import com.kik.g.p;
import com.kik.g.r;
import java.util.ArrayList;
import kik.a.d.a.a;
import kik.a.d.k;
import kik.android.b.g;
import kik.android.widget.ImeAwareEditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, fl

final class fk extends r
{

    final a a;
    final KikChatFragment b;

    fk(KikChatFragment kikchatfragment, a a1)
    {
        b = kikchatfragment;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Intent)obj;
        String s = a.u();
        boolean flag;
        if ("com.kik.ext.camera".equals(s))
        {
            b.g.b("Content Message Opened").a("Message Type", "Camera").b();
        } else
        if ("com.kik.ext.gallery".equals(s))
        {
            b.g.b("Content Message Opened").a("Message Type", "Gallery").b();
        } else
        if ("com.kik.ext.video-gallery".equals(s))
        {
            b.g.b("Content Message Opened").a("Message Type", "Video Gallery").b();
        } else
        if ("com.kik.ext.video-camera".equals(s))
        {
            b.g.b("Content Message Opened").a("Message Type", "Video Camera").b();
        } else
        if ("com.kik.cards".equals(s))
        {
            if (a.m().isEmpty())
            {
                b.g.b("Content Message Opened").a("Message Type", "Web").b();
            } else
            {
                b.g.b("Content Message Opened").a("Message Type", "Card").a("Card URL", a.m().get(0)).b();
            }
        } else
        {
            b.g.b("Content Message Opened").a("Message Type", s).b();
        }
        flag = ((Intent) (obj)).hasExtra("CardLauncher.EXTRA_KIK_MESSAGE");
        try
        {
            ((Intent) (obj)).putExtra("CardsWebViewFragment.EXTRA_REFERER_URL", "https://kik.com/");
            if (KikChatFragment.j(b) != null)
            {
                ((Intent) (obj)).putExtra("CardsWebViewFragment.EXTRA_CONVO_ID", KikChatFragment.j(b).b());
            }
            kik.android.chat.activity.k.a(((Intent) (obj)), KikChatFragment.e(b).getContext()).a(new fl(this, flag));
            kik.android.chat.fragment.KikChatFragment.a(b, KikChatFragment.e(b));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Toast.makeText(b.getActivity(), 0x7f090174, 0).show();
        }
    }

    public final void b(Throwable throwable)
    {
        if (throwable != null && throwable.getMessage() != null && throwable.getMessage().equals(g.a))
        {
            b.a(KikChatFragment.aQ(b));
        } else
        if (throwable == null || throwable.getMessage() == null || !throwable.getMessage().equals(g.b))
        {
            Toast.makeText(b.getActivity(), 0x7f090174, 0).show();
            return;
        }
    }
}
