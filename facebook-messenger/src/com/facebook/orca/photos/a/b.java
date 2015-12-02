// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.a;

import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.f.z;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.q;
import com.facebook.orca.threadview.dm;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserIdentifier;
import com.facebook.user.s;
import com.facebook.widget.tiles.a;

// Referenced classes of package com.facebook.orca.photos.a:
//            c

public class b
{

    public static a a;
    public static a b;
    private final com.facebook.widget.tiles.b c;
    private final com.facebook.user.tiles.a d;
    private final q e;
    private final z f;

    public b(com.facebook.widget.tiles.b b1, com.facebook.user.tiles.a a1, q q1, z z1)
    {
        c = b1;
        d = a1;
        e = q1;
        f = z1;
    }

    private a a(ParticipantInfo participantinfo)
    {
        if (participantinfo != null)
        {
            if (participantinfo.b())
            {
                return com.facebook.user.tiles.a.b;
            }
            if (participantinfo.c())
            {
                return com.facebook.user.tiles.a.d;
            }
            if (!n.a(participantinfo.a()))
            {
                return com.facebook.user.tiles.a.c;
            }
        }
        return com.facebook.user.tiles.a.b;
    }

    public a a(ThreadViewSpec threadviewspec)
    {
        if (threadviewspec.a())
        {
            if (dm.a(threadviewspec))
            {
                return com.facebook.user.tiles.a.d;
            } else
            {
                return com.facebook.user.tiles.a.b;
            }
        }
        if (!threadviewspec.b()) goto _L2; else goto _L1
_L1:
        threadviewspec.e().a();
        com.facebook.orca.photos.a.c.a[threadviewspec.e().a().e().ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 84
    //                   2 88
    //                   3 92;
           goto _L2 _L3 _L4 _L5
_L2:
        return com.facebook.user.tiles.a.b;
_L3:
        return com.facebook.user.tiles.a.b;
_L4:
        return com.facebook.user.tiles.a.d;
_L5:
        return com.facebook.user.tiles.a.c;
    }

    public a a(ThreadSummary threadsummary)
    {
        ParticipantInfo participantinfo = e.a(threadsummary).a();
        if (threadsummary.h() && f.c(threadsummary) == 1)
        {
            return com.facebook.user.tiles.a.b;
        } else
        {
            return a(participantinfo);
        }
    }

    static 
    {
        a = new a("group", h.orca_default_group_tile, com.facebook.user.tiles.a.a);
        b = new a("mms", h.orca_default_mms_tile, com.facebook.user.tiles.a.a);
    }
}
