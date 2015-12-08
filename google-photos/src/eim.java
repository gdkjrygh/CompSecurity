// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class eim
{

    final ConditionVariable a = new ConditionVariable();
    int b;
    long c;
    private final Context d;
    private final Uri e;
    private final String f;
    private final File g;
    private final nal h;
    private final int i;
    private HttpUrlRequest j;
    private final HttpUrlRequestListener k = new ein(this);

    eim(eio eio1)
    {
        d = eio1.a;
        f = eio1.b;
        e = eio1.d;
        g = eio1.c;
        i = eio1.e;
        h = (nal)olm.a(d, nal);
    }

    public final void a()
    {
        WritableByteChannel writablebytechannel;
        WritableByteChannel writablebytechannel1;
        Object obj;
        java.util.Map map;
        map = h.a(i);
        obj = null;
        writablebytechannel1 = null;
        writablebytechannel = obj;
        if (g != null) goto _L2; else goto _L1
_L1:
        writablebytechannel = obj;
        j = npi.a(d, e.toString(), 4, map, k);
_L4:
        writablebytechannel = writablebytechannel1;
        j.a(f);
        writablebytechannel = writablebytechannel1;
        j.g();
        writablebytechannel = writablebytechannel1;
        a.block();
        if (writablebytechannel1 != null)
        {
            writablebytechannel1.close();
        }
        return;
_L2:
        writablebytechannel = obj;
        writablebytechannel1 = Channels.newChannel(new FileOutputStream(g));
        writablebytechannel = writablebytechannel1;
        j = npi.a(d, e.toString(), 4, map, writablebytechannel1, k);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        if (writablebytechannel != null)
        {
            writablebytechannel.close();
        }
        throw exception;
    }

    public final boolean b()
    {
        return j.d() == null && !j.i() && b == 200;
    }
}
