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

public final class giv extends omp
    implements fpl
{

    private View a;

    public giv()
    {
        (new msi(pww.j)).a(ae);
        new fpk(af, this);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater.inflate(b.rR, null);
        layoutinflater = (ewz)ae.a(ewz);
        viewgroup = a(b.sq);
        bundle = new HashMap();
        bundle.put("oob_tutorial_albumtitle_01", a(b.sr));
        bundle.put("oob_tutorial_albumtitle_02", a(b.ss));
        bundle.put("oob_tutorial_date_01", layoutinflater.a(0x14fd1e32728L, exa.d));
        bundle.put("oob_tutorial_date_02", layoutinflater.a(0x14fb2fcff28L, exa.d));
        bundle.put("oob_tutorial_assistcard_01", a(b.st));
        bundle.put("oob_tutorial_assistcard_02", a(b.su));
        bundle.put("oob_tutorial_assistcard_03", a(b.sv));
        bundle.put("menu_title_collections", a(b.sx));
        bundle.put("menu_title_photos", a(b.sy));
        bundle.put("menu_title_notifications", a(b.sw));
        k().a(0, null, new ghr(this, af, "navigate.btfy", (ButterflyView)a.findViewById(s.N), viewgroup, bundle));
        return a;
    }

    public final void a(fpj fpj, Rect rect)
    {
        a.setPadding(0, rect.top, 0, rect.bottom + g().getDimensionPixelSize(b.rC));
    }
}
