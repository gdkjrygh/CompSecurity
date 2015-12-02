// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.time.a;
import com.facebook.location.Coordinates;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.model.threads.e;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.j.c;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.g;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.google.common.a.ev;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class n
{

    private final javax.inject.a a;
    private final javax.inject.a b;
    private final a c;
    private final com.facebook.orca.threads.a d;
    private final c e;

    public n(javax.inject.a a1, javax.inject.a a2, com.facebook.orca.threads.a a3, a a4, c c1)
    {
        a = a1;
        b = a2;
        d = a3;
        c = a4;
        e = c1;
    }

    public Message a(int i, ThreadViewSpec threadviewspec, String s, String s1, String s2, long l, 
            long l1, Coordinates coordinates, List list, List list1)
    {
        return a(i, threadviewspec, s, s1, s2, l, l1, coordinates, list, list1, null);
    }

    public Message a(int i, ThreadViewSpec threadviewspec, String s, String s1, String s2, long l, 
            long l1, Coordinates coordinates, List list, List list1, Map map)
    {
        long l3 = c.a();
        long l2 = l;
        if (l == -1L)
        {
            l2 = l3;
        }
        l = l1;
        if (l1 == -1L)
        {
            l = l3;
        }
        Object obj = map;
        if (map == null)
        {
            obj = ev.j();
        }
        ViewerContext viewercontext = (ViewerContext)a.b();
        Preconditions.checkNotNull(viewercontext, "Can't create a sent message without a viewer");
        Object obj1;
        if (viewercontext.c())
        {
            map = "";
        } else
        {
            map = ((User)b.b()).h();
        }
        obj1 = list;
        if (list != null)
        {
            obj1 = hq.a();
            Iterator iterator = list.iterator();
            int j = 0;
            while (iterator.hasNext()) 
            {
                MediaResource mediaresource = (MediaResource)iterator.next();
                if (mediaresource.c() != g.PHOTO || mediaresource.f() != null)
                {
                    ((List) (obj1)).add(mediaresource);
                } else
                {
                    StringBuilder stringbuilder = new StringBuilder(40);
                    if (s == null)
                    {
                        list = String.valueOf(c.a());
                    } else
                    {
                        list = s;
                    }
                    stringbuilder.append(list).append("_").append(j).append(".jpg");
                    ((List) (obj1)).add(MediaResource.a(mediaresource, e.b(stringbuilder.toString(), true)));
                    j++;
                }
            }
        }
        list = list1;
        if (list1 == null)
        {
            list = hq.a();
        }
        list1 = new ParticipantInfo(new UserKey(com.facebook.user.n.FACEBOOK, viewercontext.a()), map, (new StringBuilder()).append(viewercontext.a()).append("@facebook.com").toString());
        l1 = d.a(l2);
        map = (new StringBuilder()).append("sent.").append(s).toString();
        s = (new e()).a(i).a(map).e(s).d(s1).a(l2).b(l).c(l1).a(list1).a(coordinates).a(true).a(com.facebook.messages.model.threads.c.SEND).f("mobile").e(((List) (obj1))).f(list).g(s2).a(((Map) (obj)));
        if (threadviewspec.a())
        {
            s.b(threadviewspec.d());
        } else
        {
            s.a(threadviewspec.e());
        }
        return s.B();
    }

    public Message a(int i, String s, String s1, String s2, long l, long l1, Coordinates coordinates, List list)
    {
        java.util.ArrayList arraylist = hq.a();
        return a(i, ThreadViewSpec.a(s), s1, s2, null, l, l1, coordinates, list, ((List) (arraylist)));
    }
}
