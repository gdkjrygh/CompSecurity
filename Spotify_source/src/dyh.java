// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.onboarding.taste.TasteActivity;

public class dyh extends dxx
{

    public dyh()
    {
    }

    public final boolean J()
    {
        return false;
    }

    public final void a(int i, int j, Intent intent)
    {
        if (1 != i)
        {
            return;
        } else
        {
            ((dyi)H().a(this)).a();
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(TasteActivity.a(k()), 1);
    }
}
