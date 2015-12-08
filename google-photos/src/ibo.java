// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class ibo extends omp
    implements nzu
{

    private mee a;
    private PreferenceScreen b;

    public ibo()
    {
        new nzt(this, af);
    }

    static olq a(ibo ibo1)
    {
        return ibo1.ad;
    }

    static mee b(ibo ibo1)
    {
        return ibo1.a;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.a(layoutinflater, viewgroup, bundle);
        b = ((oau)ae.a(oau)).b();
        return layoutinflater;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        a = (mee)ae.a(mee);
    }

    public final void r()
    {
        Object obj = new oac(ad);
        PreferenceCategory preferencecategory = (PreferenceCategory)b.c("location_preference_category_key");
        obj = ((oac) (obj)).a(a(p.bg), a(p.bn));
        obj.k = new ibp(this);
        preferencecategory.b(((nzw) (obj)));
    }
}
