// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.n;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.d.q;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            f, an, ad

public class e
    implements f
{

    private final ad a;
    private final an b;

    public e(ad ad1, an an1)
    {
        a = ad1;
        b = an1;
    }

    public com.facebook.http.protocol.n a(com.facebook.orca.protocol.methods.f f1)
    {
        java.util.ArrayList arraylist = hq.a();
        SendMessageByRecipientsParams sendmessagebyrecipientsparams = f.a(f1);
        if (sendmessagebyrecipientsparams.c())
        {
            arraylist.add(new BasicNameValuePair("name", sendmessagebyrecipientsparams.b()));
        }
        Object obj = sendmessagebyrecipientsparams.a();
        b.a(arraylist, ((Message) (obj)), f.b(f1));
        java.util.ArrayList arraylist1 = hq.a();
        if (((Message) (obj)).C() && f.b(f1) == null)
        {
            obj = ((Message) (obj)).B().iterator();
            int i = 0;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                MediaResource mediaresource = (MediaResource)((Iterator) (obj)).next();
                if (mediaresource.c() == g.AUDIO)
                {
                    com.facebook.http.protocol.ab ab = b.a(mediaresource);
                    StringBuilder stringbuilder = (new StringBuilder()).append("audio");
                    i++;
                    arraylist1.add(new q(stringbuilder.append(i).toString(), ab, mediaresource.g()));
                }
            } while (true);
        }
        if (!n.a(f.c(f1)))
        {
            arraylist.add(new BasicNameValuePair("media", f.c(f1)));
        }
        arraylist.add(new BasicNameValuePair("to", a.a(sendmessagebyrecipientsparams.d()).toString()));
        return com.facebook.http.protocol.n.newBuilder().a("createThread").b("POST").c("me/threads").a(arraylist).a(t.JSON).b(arraylist1).k();
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((com.facebook.orca.protocol.methods.f)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((com.facebook.orca.protocol.methods.f)obj, r1);
    }

    public String a(com.facebook.orca.protocol.methods.f f1, r r1)
    {
        return com.facebook.common.w.e.b(r1.c().get("tid"));
    }
}
