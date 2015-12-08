// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import com.kik.cards.web.usermedia.i;
import com.kik.g.p;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.util.DeviceUtils;

// Referenced classes of package com.kik.cards.usermedia:
//            i, j

public final class h
    implements i
{

    KikScopedDialogFragment a;

    public h(KikScopedDialogFragment kikscopeddialogfragment)
    {
        a = kikscopeddialogfragment;
    }

    public final p a()
    {
        kik.android.chat.fragment.KikDialogFragment.a a1 = new kik.android.chat.fragment.KikDialogFragment.a(a.getResources());
        p p1 = new p();
        a1.b(true);
        a1.a(0x7f090307);
        a1.a(new com.kik.cards.usermedia.i(this, p1));
        CharSequence acharsequence[];
        if (DeviceUtils.e(a.getActivity()))
        {
            acharsequence = new CharSequence[2];
            acharsequence[0] = a.getString(0x7f09030f);
            acharsequence[1] = a.getString(0x7f09029e);
        } else
        {
            acharsequence = new CharSequence[1];
            acharsequence[0] = a.getString(0x7f09029e);
        }
        a1.a(acharsequence, new j(this, acharsequence, p1));
        a.a(a1.a());
        return p1;
    }
}
