// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.radio.model.RadioStationModel;

public final class gpm extends gqi
{

    public RadioStationModel a;
    public String b;
    private final Verified o;

    public gpm(Context context, Verified verified, ViewGroup viewgroup, boolean flag, FeatureIdentifier featureidentifier, FeatureIdentifier featureidentifier1)
    {
        super(context, verified, viewgroup, gqj.g, gqj.h, gqi.e, gqi.f, flag, featureidentifier, featureidentifier1);
        o = verified;
    }

    protected final void a()
    {
        if (a != null && b != null)
        {
            fos.a(super.j, a, o, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a);
        }
    }

    protected final boolean a(String s)
    {
        return b != null && cty.a(b, s);
    }
}
