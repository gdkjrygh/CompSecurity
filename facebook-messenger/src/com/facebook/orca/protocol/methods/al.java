// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.messages.model.threads.Message;
import com.facebook.orca.d.q;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.orca.protocol.methods:
//            am, an

public class al
    implements f
{

    private static final Class a = com/facebook/orca/protocol/methods/al;
    private final an b;

    public al(an an1)
    {
        b = an1;
    }

    public com.facebook.http.protocol.n a(am am1)
    {
        java.util.ArrayList arraylist = hq.a();
        Object obj = am.a(am1);
        arraylist.add(new BasicNameValuePair("id", ((Message) (obj)).e()));
        b.a(arraylist, ((Message) (obj)), am.b(am1));
        java.util.ArrayList arraylist1 = hq.a();
        if (((Message) (obj)).C() && am.b(am1) == null)
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
        if (!n.a(am.c(am1)))
        {
            arraylist.add(new BasicNameValuePair("media", am.c(am1)));
        }
        return com.facebook.http.protocol.n.newBuilder().a("sendMessage").b("POST").c("").a(arraylist).a(t.JSON).b(arraylist1).k();
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((am)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((am)obj, r1);
    }

    public String a(am am1, r r1)
    {
        return e.b(r1.c().get("id"));
    }

}
