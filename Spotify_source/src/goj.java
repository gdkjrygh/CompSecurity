// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.music.spotlets.networkoperatorpremiumactivation.legacy.NetworkOperatorPremiumActivationFragment;

public final class goj
    implements an
{

    private final String a[] = {
        "product_type", "connected"
    };
    private NetworkOperatorPremiumActivationFragment b;

    public goj(NetworkOperatorPremiumActivationFragment networkoperatorpremiumactivationfragment)
    {
        b = networkoperatorpremiumactivationfragment;
        super();
    }

    public final da a(Bundle bundle)
    {
        return new cu(b.k(), dtw.a, a, null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        boolean flag = true;
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            boolean flag1 = "premium".equals(((Cursor) (obj)).getString(0));
            if (((Cursor) (obj)).getInt(1) == 0)
            {
                flag = false;
            }
            NetworkOperatorPremiumActivationFragment.a(b, flag1, flag);
        }
    }
}
