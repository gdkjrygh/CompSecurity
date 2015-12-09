// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.tracking.ViewLoadTimerMessage;

public final class gje
    implements gja
{

    private Context a;

    public gje(Context context)
    {
        a = context;
    }

    static Bundle a(String s, ViewLoadTimerMessage viewloadtimermessage, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("ARG_ID", s);
        bundle.putBoolean("ARG_DRY_RUN", flag);
        bundle.putParcelable("ARG_MESSAGE", viewloadtimermessage);
        return bundle;
    }

    public final void a()
    {
    }

    public final void a(String s, String s1, Bundle bundle)
    {
        if (TextUtils.equals(s, "TYPE_VIEW_LOADING"))
        {
            Assertion.a(bundle.containsKey("ARG_ID"), (new StringBuilder("Bundle must have id: ")).append(bundle.toString()).toString());
            Assertion.a(bundle.containsKey("ARG_MESSAGE"), (new StringBuilder("Bundle must contain message: ")).append(bundle.toString()).toString());
            boolean flag = bundle.getBoolean("ARG_DRY_RUN");
            s = (ViewLoadTimerMessage)bundle.getParcelable("ARG_MESSAGE");
            s1 = ((ViewLoadTimerMessage) (s)).e;
            s1 = ((ViewLoadTimerMessage) (s)).a;
            s1 = ((ViewLoadTimerMessage) (s)).g;
            if (!flag)
            {
                s1 = a;
                bundle = dvv.a(s1, "com.spotify.mobile.android.service.action.session.VIEW_LOAD_TIMER");
                bundle.putExtra("view_load_timer_message", s);
                s1.startService(bundle);
                return;
            }
        }
    }
}
