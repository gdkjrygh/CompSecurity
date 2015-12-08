// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.SkyLib;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.signin:
//            AuthenticateWithMsaActivity

final class this._cls0
    implements back
{

    final AuthenticateWithMsaActivity this$0;

    public final void microsoftAccounts(String s, String s1, ArrayList arraylist, ArrayList arraylist1)
    {
label0:
        {
            AuthenticateWithMsaActivity.access$002(AuthenticateWithMsaActivity.this, arraylist);
            AuthenticateWithMsaActivity.access$102(AuthenticateWithMsaActivity.this, arraylist1);
            if (AuthenticateWithMsaActivity.access$200(AuthenticateWithMsaActivity.this))
            {
                if (AuthenticateWithMsaActivity.access$300(AuthenticateWithMsaActivity.this) != MSA_SIGN_UP)
                {
                    break label0;
                }
                analytics.a(new SkypeTelemetryEvent(LogEvent.s));
                lib.linkAccountWithPartner(com.skype.OSOFT.OSOFT(), skypeAccessToken, "", "", "", false, false);
            }
            return;
        }
        AuthenticateWithMsaActivity.access$400(AuthenticateWithMsaActivity.this, false);
    }

    public final void onLinkingError(String s)
    {
        AuthenticateWithMsaActivity.access$500(AuthenticateWithMsaActivity.this, new <init>(s));
    }

    back()
    {
        this$0 = AuthenticateWithMsaActivity.this;
        super();
    }
}
