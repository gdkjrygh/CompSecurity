// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.content.Intent;
import android.os.Bundle;

public final class e
{

    public static Bundle a(Intent intent)
    {
        intent = intent.getBundleExtra("al_applink_data");
        if (intent == null)
        {
            return null;
        } else
        {
            return intent.getBundle("extras");
        }
    }
}
