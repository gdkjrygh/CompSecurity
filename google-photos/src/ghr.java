// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.os.Bundle;
import com.google.android.libraries.material.butterfly.ButterflyView;
import java.io.File;
import java.util.Map;

final class ghr
    implements ca
{

    private final am a;
    private final opd b;
    private final String c;
    private final ButterflyView d;
    private final String e;
    private final Map f;
    private final mli g;

    ghr(am am1, opd opd, String s, ButterflyView butterflyview, String s1, Map map)
    {
        b = opd;
        a = am1;
        c = s;
        d = butterflyview;
        e = s1;
        f = map;
        g = new ghq(am1.O_(), (new File(c)).getParent());
    }

    public final ei a(int i, Bundle bundle)
    {
        return new ghp(a.O_(), c, new mla(f));
    }

    public final void a(ei ei, Object obj)
    {
        ei = (mlc)obj;
        d.a(ei, g);
        ghj.a(d, b);
        if (a.U)
        {
            d.b.start();
        }
        d.setContentDescription(e);
    }
}
