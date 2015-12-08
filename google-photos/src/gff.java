// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class gff
    implements okn
{

    private int a;
    private Context b;
    private gfe c;

    gff(gfe gfe1, int i, Context context)
    {
        c = gfe1;
        a = i;
        b = context;
        super();
    }

    public final HttpUrlRequest a(String s, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        java.util.Map map = gfe.a(c).a(a);
        return npi.a(b, s, 4, map, writablebytechannel, httpurlrequestlistener);
    }
}
