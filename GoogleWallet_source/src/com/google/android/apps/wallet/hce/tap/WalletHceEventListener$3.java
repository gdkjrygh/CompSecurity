// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.android.apps.wallet.logging.WLog;
import java.security.GeneralSecurityException;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHceEventListener

final class this._cls0
    implements com.google.android.apps.wallet.hce.tap.event.Listener
{

    final WalletHceEventListener this$0;

    public final void onCommandApdu()
        throws GeneralSecurityException
    {
        if (!WalletHceEventListener.access$800(WalletHceEventListener.this))
        {
            WalletHceEventListener.access$802(WalletHceEventListener.this, true);
            WalletHceEventListener.access$900(WalletHceEventListener.this);
        }
    }

    public final void onHceReset()
    {
        WLog.dfmt(WalletHceEventListener.access$000(), "HCE reset; paymentSessionInProgress=%s", new Object[] {
            Boolean.valueOf(WalletHceEventListener.access$1000(WalletHceEventListener.this))
        });
        if (WalletHceEventListener.access$1000(WalletHceEventListener.this))
        {
            WalletHceEventListener.access$400(WalletHceEventListener.this, false, null);
        }
        if (WalletHceEventListener.access$800(WalletHceEventListener.this))
        {
            WalletHceEventListener.access$802(WalletHceEventListener.this, false);
            WalletHceEventListener.access$1100(WalletHceEventListener.this);
            return;
        } else
        {
            WLog.e(WalletHceEventListener.access$000(), "received hce reset message, but mApduSessionInProgress is false");
            return;
        }
    }

    essor.Listener()
    {
        this$0 = WalletHceEventListener.this;
        super();
    }
}
