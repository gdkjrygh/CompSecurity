// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.g.r;
import com.kik.sdkutils.y;
import java.io.File;
import kik.android.KikFileProvider;
import kik.android.f.a.f;
import kik.android.util.ak;
import kik.android.util.ct;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

final class kf extends r
{

    final KikConversationsFragment a;

    kf(KikConversationsFragment kikconversationsfragment)
    {
        a = kikconversationsfragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (File)obj;
        super.a(obj);
        f.a().a(false);
        if (obj == null)
        {
            KikConversationsFragment.a(a, 0x7f09035a);
            return;
        }
        obj = ((File) (obj)).getPath();
        long l = 0L;
        if (((String) (obj)).endsWith(".mp4") || KikFileProvider.a(((String) (obj))))
        {
            l = ct.c(((String) (obj)));
        }
        if (l < 1L)
        {
            KikConversationsFragment.a(a, 0x7f09035a);
            return;
        }
        boolean flag = y.a(18);
        if (flag && ak.c(((String) (obj))))
        {
            KikConversationsFragment.a(a, 0x7f0900a0);
        }
        if (ct.a(((String) (obj)), l))
        {
            KikConversationsFragment.a(a, l, ((String) (obj)));
        } else
        {
            obj = f.a().a(a.k.getContext(), ((String) (obj)), l, flag, a.q);
            f.a().a(((kik.a.d.a.a) (obj)), true, null);
            KikConversationsFragment.h(a);
        }
        a.h = null;
        a.a(null);
    }
}
