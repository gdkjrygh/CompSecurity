// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.d;
import com.tinder.adapters.t;
import com.tinder.enums.UserType;
import com.tinder.managers.a;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.v;
import java.util.TreeSet;

// Referenced classes of package com.tinder.fragments:
//            bm, br

final class .i extends android.support.v4.view.ger.i
{

    final bm a;

    public final void b(int i)
    {
        long l;
        boolean flag;
        l = 0L;
        flag = true;
        if (bm.f(a) == UserType.ME || bm.j(a) == i) goto _L2; else goto _L1
_L1:
        Object obj;
        byte byte0;
        if (bm.j(a) > i)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        if (i + 1 != bm.k(a).getCount())
        {
            flag = false;
        }
        obj = null;
        if (bm.f(a) != UserType.REC) goto _L4; else goto _L3
_L3:
        obj = new SparksEvent("Recs.ProfileInstagramPage");
_L7:
        if (obj != null) goto _L6; else goto _L5
_L5:
        v.b("Event not sent, user type was neither match nor rec");
_L2:
        return;
_L4:
        if (bm.f(a) == UserType.MATCH)
        {
            SparksEvent sparksevent = new SparksEvent("Chat.ProfileInstagramPage");
            obj = "none";
            long l1;
            if (bm.l(a) != null && bm.l(a).hasMessages())
            {
                l = d.a(bm.l(a).getMessages()).a(com.tinder.fragments.br.a()).a();
                l1 = (long)bm.l(a).getMessages().size() - l;
                if (((Message)bm.l(a).getMessages().last()).isFromMe())
                {
                    obj = "self";
                } else
                {
                    obj = "other";
                }
            } else
            {
                l1 = 0L;
            }
            sparksevent.put("numMessagesOther", Long.valueOf(l1));
            sparksevent.put("numMessagesMe", Long.valueOf(l));
            sparksevent.put("lastMessageFrom", obj);
            obj = sparksevent;
        }
        if (true) goto _L7; else goto _L6
_L6:
        ((SparksEvent) (obj)).put("direction", Integer.valueOf(byte0));
        ((SparksEvent) (obj)).put("pageNumber", Integer.valueOf(i));
        ((SparksEvent) (obj)).put("endOfPhotos", Boolean.valueOf(flag));
        ((SparksEvent) (obj)).put("otherId", bm.m(a).getId());
        ((SparksEvent) (obj)).put("instagramName", bm.m(a).getInstagramDataSet().username);
        com.tinder.managers.a.a(((SparksEvent) (obj)));
        return;
    }

    ataSet(bm bm1)
    {
        a = bm1;
        super();
    }
}
