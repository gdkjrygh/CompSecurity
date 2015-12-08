// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogByIntentAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.activity.upsell.ShowUpsellAction;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public class frb
    implements dmx
{

    public frb()
    {
    }

    public static ShowDialogAction a(Intent intent)
    {
        return new ShowDialogByIntentAction(intent);
    }

    public static ShowDialogAction a(Flags flags, Reason reason, String s, String s1)
    {
        return new ShowUpsellAction(flags, reason, s, s1);
    }

    public static dna a()
    {
        return new dna() {

            public final Object a()
            {
                return new frb();
            }

        };
    }
}
