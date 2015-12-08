// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.material.butterfly.ButterflyView;
import java.util.HashMap;

public final class giz extends omp
    implements fpl
{

    private View a;

    public giz()
    {
        (new msi(pww.l)).a(ae);
        new fpk(af, this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater.inflate(b.rT, null);
        layoutinflater = (ewz)ae.a(ewz);
        viewgroup = a(b.sA);
        bundle = new HashMap();
        bundle.put("oob_tutorial_date_01", layoutinflater.a(0x14fd1e32728L, exa.d));
        bundle.put("oob_tutorial_date_02", layoutinflater.a(0x14fb2fcff28L, exa.d));
        bundle.put("oob_tutorial_date_03", layoutinflater.a(0x1509abb2b28L, exa.d));
        bundle.put("oob_tutorial_date_04", layoutinflater.a(0x15076aea728L, exa.d));
        bundle.put("oob_tutorial_header_places", a(b.sD));
        bundle.put("oob_tutorial_header_things", a(b.sF));
        bundle.put("oob_tutorial_title_search", a(b.sE));
        bundle.put("oob_tutorial_title_dog", a(b.sB));
        bundle.put("menu_title_photos", a(b.sC));
        k().a(0, null, new ghr(this, af, "search.btfy", (ButterflyView)a.findViewById(s.N), viewgroup, bundle));
        return a;
    }

    public final void a(fpj fpj, Rect rect)
    {
        a.setPadding(0, rect.top, 0, rect.bottom + g().getDimensionPixelSize(b.rC));
    }
}
