// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.util.z;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, bs

class fv extends e
{

    private static final String a = "UnpairDeviceOperation";
    private static final String b = "unpair_device_action";
    private static final String d = "device_encoded_id";
    private final String e;

    public fv(bs bs1, String s)
    {
        super(bs1, true);
        e = s;
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException, CancellationException
    {
        e().a(true);
        e().a().G(e);
        e().a(false);
        a1 = new Intent("unpair_device_action");
        a1.putExtra("device_encoded_id", e);
        z.a(a1);
        return;
        a1;
        e().a(false);
        Intent intent = new Intent("unpair_device_action");
        intent.putExtra("device_encoded_id", e);
        z.a(intent);
        throw a1;
    }

    public String c()
    {
        return "UnpairDeviceOperation";
    }
}
