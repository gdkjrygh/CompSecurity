// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class evm extends Fragment
    implements fxy
{

    private FeatureIdentifier Y;
    private Flags a;
    private evn b;

    public evm()
    {
    }

    public static evm a(Flags flags)
    {
        ctz.a(flags);
        evm evm1 = new evm();
        fyw.a(evm1, flags);
        return evm1;
    }

    public static boolean b(Flags flags)
    {
        return ((Boolean)flags.a(fys.y)).booleanValue();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "spotify:notifications";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300f7, viewgroup, false);
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08037b);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a = fyw.a(this);
        Y = gnl.a(this);
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        boolean flag = g().getBoolean("select_inbox", false);
        b = new evn(n(), bundle, y(), a, Y, flag);
    }

    public final void e(Bundle bundle)
    {
        if (b != null)
        {
            bundle.putInt("current_tab", b.a);
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.am;
    }
}
