// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import kik.android.KikDataProvider;
import kik.android.chat.activity.k;
import kik.android.util.an;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment

public class KikBlockedContactsFragment extends KikDefaultContactsListFragment
{
    public static final class a extends an
    {

        public a()
        {
        }
    }


    public KikBlockedContactsFragment()
    {
    }

    protected final int K()
    {
        return 0x7f090297;
    }

    protected final String a()
    {
        return getString(0x7f090379);
    }

    protected final void a(String s)
    {
        a(((an) ((new KikChatInfoFragment.a()).d(s).b(1))));
    }

    protected final void a(kik.a.d.k k1)
    {
    }

    protected final void a_(String s, String s1)
    {
        a(s);
    }

    protected final void b(Bundle bundle)
    {
        a(KikDataProvider.d);
        p();
    }

    protected final void b(kik.a.d.k k1)
    {
    }

    protected final String c()
    {
        return getString(0x7f090106);
    }

    protected final boolean d()
    {
        return true;
    }

    protected final void e()
    {
        S();
        kik.android.chat.activity.k.a(new KikAddToBlockFragment.a(), getActivity()).f();
    }

    protected final String f()
    {
        return null;
    }

    protected final boolean g()
    {
        return false;
    }

    protected final boolean i()
    {
        return false;
    }

    protected final boolean j()
    {
        return false;
    }

    protected final boolean k()
    {
        return true;
    }

    protected final Drawable l()
    {
        return getResources().getDrawable(0x7f02020d);
    }

    protected final boolean m()
    {
        return false;
    }
}
