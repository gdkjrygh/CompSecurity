// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.javabridge.invoke.mdx.pair.DeletePairing;
import com.netflix.mediaclient.javabridge.invoke.mdx.pair.PairingRequest;
import com.netflix.mediaclient.javabridge.invoke.mdx.pair.RegistrationPairingRequest;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.PairingController;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeMdx

class this._cls0
    implements PairingController
{

    final NativeMdx this$0;

    public void deletePairing(String s)
    {
        NativeMdx.access$000(NativeMdx.this, new DeletePairing(s));
    }

    public void pairingRequest(String s)
    {
        NativeMdx.access$000(NativeMdx.this, new PairingRequest(s));
    }

    public void registrationPairingRequest(String s)
    {
        NativeMdx.access$000(NativeMdx.this, new RegistrationPairingRequest(s, null));
    }

    public void registrationPairingRequest(String s, String s1)
    {
        NativeMdx.access$000(NativeMdx.this, new RegistrationPairingRequest(s, s1));
    }

    ()
    {
        this$0 = NativeMdx.this;
        super();
    }
}
