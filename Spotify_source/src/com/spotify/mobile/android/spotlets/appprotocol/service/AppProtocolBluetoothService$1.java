// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.service;

import egv;
import ehh;
import ehy;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executors;

// Referenced classes of package com.spotify.mobile.android.spotlets.appprotocol.service:
//            AppProtocolBluetoothService

final class 
    implements ehy
{

    public final egv a(InputStream inputstream, OutputStream outputstream)
    {
        return new ehh(inputstream, outputstream, Executors.newSingleThreadExecutor());
    }

    ()
    {
    }
}
