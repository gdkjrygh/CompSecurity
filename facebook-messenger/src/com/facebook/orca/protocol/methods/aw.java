// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import android.net.Uri;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.server.ModifyThreadParams;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.facebook.ui.media.b.a;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class aw
    implements f
{

    private final d a;
    private final a b;

    public aw(d d1, a a1)
    {
        a = d1;
        b = a1;
    }

    private com.facebook.http.a.a.a.a b(ModifyThreadParams modifythreadparams)
    {
        modifythreadparams = modifythreadparams.e();
        modifythreadparams = MediaResource.a(modifythreadparams, modifythreadparams.d().getPath());
        modifythreadparams = a.b(modifythreadparams);
        if (modifythreadparams == null)
        {
            throw new Exception("Failed to attach image");
        }
        modifythreadparams = b.a(modifythreadparams);
        if (modifythreadparams == null)
        {
            throw new Exception("Failed to attach image");
        } else
        {
            return new com.facebook.http.a.a.a.a("image", modifythreadparams);
        }
    }

    public n a(ModifyThreadParams modifythreadparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        arraylist.add(new BasicNameValuePair("tid", modifythreadparams.a()));
        p p1 = null;
        if (modifythreadparams.e() != null)
        {
            modifythreadparams = b(modifythreadparams);
        } else
        {
            arraylist.add(new BasicNameValuePair("delete", "1"));
            modifythreadparams = p1;
        }
        p1 = n.newBuilder().a("setThreadImage").b("POST").c("method/messaging.setthreadimage").a(arraylist).a(t.STRING);
        if (modifythreadparams != null)
        {
            p1.b(es.a(modifythreadparams));
        }
        return p1.k();
    }

    public volatile n a(Object obj)
    {
        return a((ModifyThreadParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((ModifyThreadParams)obj, r1);
    }

    public Void a(ModifyThreadParams modifythreadparams, r r1)
    {
        r1.f();
        return null;
    }
}
