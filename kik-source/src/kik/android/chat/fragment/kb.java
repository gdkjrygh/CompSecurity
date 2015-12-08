// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import com.kik.android.a;
import com.kik.g.r;
import com.kik.sdkutils.y;
import java.io.File;
import kik.android.KikFileProvider;
import kik.android.f.a.f;
import kik.android.util.by;
import kik.android.util.ct;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kb extends r
{

    final long a;
    final String b;
    final KikConversationsFragment c;

    kb(KikConversationsFragment kikconversationsfragment, long l, String s)
    {
        c = kikconversationsfragment;
        a = l;
        b = s;
        super();
    }

    public final void a()
    {
        if (KikFileProvider.a(b))
        {
            (new File(b)).delete();
        }
    }

    public final void a(Object obj)
    {
        obj = ((Bundle)obj).getString("photoUrl");
        a a1 = c.f;
        long l = a;
        by.b(a1.b("Video Selected").a("From Trimmer", true).a("Video Length", ct.c(((String) (obj)))).a("Video Orginal Length", l).a("Is From Intent", true), ((String) (obj)));
        boolean flag = y.a(18);
        obj = f.a().a(c.getActivity(), ((String) (obj)), a, flag, c.q);
        f.a().a(((kik.a.d.a.a) (obj)), true, null);
        KikConversationsFragment.h(c);
    }
}
