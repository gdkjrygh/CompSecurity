// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class gnl
{

    public static FeatureIdentifier a(Intent intent)
    {
        ctz.a(intent);
        intent = (FeatureIdentifier)intent.getSerializableExtra("FeatureIdentifier.InternalReferrer");
        if (intent == null)
        {
            throw new IllegalArgumentException("The feature identifier is undeclared. Have you forgotten to set it with ArgumentsHelper?");
        } else
        {
            return intent;
        }
    }

    public static FeatureIdentifier a(Bundle bundle)
    {
        ctz.a(bundle);
        bundle = (FeatureIdentifier)bundle.getSerializable("FeatureIdentifier.InternalReferrer");
        if (bundle == null)
        {
            throw new IllegalArgumentException("The feature identifier is undeclared. Have you forgotten to set it with ArgumentsHelper?");
        } else
        {
            return bundle;
        }
    }

    public static FeatureIdentifier a(fxy fxy1)
    {
        ctz.a(fxy1);
        ctz.a(fxy1.F());
        return a(fxy1.F().g());
    }

    public static void a(Intent intent, FeatureIdentifier featureidentifier)
    {
        ctz.a(intent);
        ctz.a(featureidentifier);
        intent.putExtra("FeatureIdentifier.InternalReferrer", featureidentifier);
    }

    public static void a(Fragment fragment, FeatureIdentifier featureidentifier)
    {
        ctz.a(fragment);
        ctz.a(featureidentifier);
        Bundle bundle1 = fragment.g();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
            fragment.f(bundle);
        }
        bundle.putSerializable("FeatureIdentifier.InternalReferrer", featureidentifier);
    }
}
