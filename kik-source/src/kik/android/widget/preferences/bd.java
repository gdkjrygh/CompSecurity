// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.sdkutils.d;
import kik.a.e.w;
import kik.android.util.bf;

// Referenced classes of package kik.android.widget.preferences:
//            PasswordPreference, be, KikPreference

final class bd extends bf
{

    final String a;
    final Preference b;
    final PasswordPreference c;

    bd(PasswordPreference passwordpreference, String s1, Preference preference)
    {
        c = passwordpreference;
        a = s1;
        b = preference;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = c.b.b(a);
        ((p) (aobj)).a(d.a(c.b(), new be(this)));
        KikPreference.a(c.getContext().getString(0x7f090346), s.a(((p) (aobj))), c.b());
        return null;
    }
}
