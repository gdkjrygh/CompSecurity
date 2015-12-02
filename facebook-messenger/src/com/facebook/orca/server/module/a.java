// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.server.module;

import com.facebook.auth.userscope.UserScoped;
import com.facebook.fbservice.a.b;
import com.facebook.fbservice.service.LocalQueueSet;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.p;
import com.facebook.inject.a.g;
import com.facebook.inject.c;
import com.facebook.inject.t;
import com.facebook.orca.server.MessagesDataQueueSet;
import com.facebook.orca.server.aq;
import com.facebook.zero.annotations.ZeroTokenQueue;

// Referenced classes of package com.facebook.orca.server.module:
//            ThreadsQueue, h, DataThreadsQueue, e, 
//            SendQueue, i, PushQueue, g, 
//            LocationQueue, d, ImageSearchQueue, c, 
//            PhoneNumberIdentificationQueue, f, WildfireQueue, m, 
//            StickersQueue, j, WebrtcQueue, k, 
//            PhotoUploadQueue, l

public class a extends c
{

    private p a;
    private com.facebook.fbservice.a.a b;
    private b c;

    public a()
    {
    }

    static com.facebook.fbservice.a.a a(a a1)
    {
        return a1.b;
    }

    private void a(OperationType operationtype, Class class1)
    {
        a.a(operationtype, class1);
    }

    private void a(OperationType operationtype, Class class1, Class class2)
    {
        a.a(operationtype, class1, class2);
    }

    static b b(a a1)
    {
        return a1.c;
    }

    protected void a()
    {
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/ThreadsQueue).a(new h(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/DataThreadsQueue).a(new com.facebook.orca.server.module.e(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/SendQueue).a(new i(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/PushQueue).a(new com.facebook.orca.server.module.g(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/LocationQueue).a(new d(this, null)).d();
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/ImageSearchQueue).a(new com.facebook.orca.server.module.c(this, null)).d();
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/PhoneNumberIdentificationQueue).a(new f(this, null)).d();
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/WildfireQueue).a(new m(this, null)).d();
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/StickersQueue).a(new j(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/WebrtcQueue).a(new k(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/fbservice/service/e).a(com/facebook/orca/server/module/PhotoUploadQueue).a(new l(this, null)).d(com/facebook/auth/userscope/UserScoped);
    }

    public void a(t t1)
    {
        a = (p)t1.a(com/facebook/fbservice/service/p);
        b = (com.facebook.fbservice.a.a)t1.a(com/facebook/fbservice/a/a);
        c = (b)t1.a(com/facebook/fbservice/a/b);
        a.a(com/facebook/orca/server/module/ThreadsQueue, com/facebook/fbservice/service/LocalQueueSet);
        a.a(com/facebook/orca/server/module/DataThreadsQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/SendQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/PushQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/LocationQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/ImageSearchQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/PhoneNumberIdentificationQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/WildfireQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/zero/annotations/ZeroTokenQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/StickersQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/WebrtcQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a.a(com/facebook/orca/server/module/PhotoUploadQueue, com/facebook/orca/server/MessagesDataQueueSet);
        a(aq.a, com/facebook/orca/server/module/WildfireQueue);
        a(aq.b, com/facebook/orca/server/module/WildfireQueue);
        a(aq.c, com/facebook/orca/server/module/WildfireQueue);
        a(aq.d, com/facebook/orca/server/module/WildfireQueue);
        a(aq.D, com/facebook/orca/server/module/WildfireQueue);
        a(aq.e, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.f, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.g, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.h, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.i, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.j, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.k, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.m, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.n, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.o, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.p, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.q, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.r, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.s, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.u, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.v, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.E, com/facebook/orca/server/module/ThreadsQueue, com/facebook/orca/server/module/DataThreadsQueue);
        a(aq.I, com/facebook/orca/server/module/StickersQueue);
        a(aq.J, com/facebook/orca/server/module/StickersQueue);
        a(aq.K, com/facebook/orca/server/module/StickersQueue);
        a(aq.w, com/facebook/orca/server/module/SendQueue);
        a(aq.L, com/facebook/orca/server/module/PhotoUploadQueue);
        a(aq.x, com/facebook/orca/server/module/PushQueue);
        a(aq.t, com/facebook/orca/server/module/PushQueue);
        a(aq.y, com/facebook/orca/server/module/PushQueue);
        a(aq.F, com/facebook/orca/server/module/PushQueue);
        a(aq.G, com/facebook/orca/server/module/PhoneNumberIdentificationQueue);
        a(aq.H, com/facebook/orca/server/module/PhoneNumberIdentificationQueue);
        a(aq.A, com/facebook/orca/server/module/LocationQueue);
        a(aq.B, com/facebook/orca/server/module/ImageSearchQueue);
        a(com.facebook.zero.server.e.a, com/facebook/zero/annotations/ZeroTokenQueue);
        a(com.facebook.zero.server.e.b, com/facebook/zero/annotations/ZeroTokenQueue);
        a(aq.z, com/facebook/orca/server/module/WebrtcQueue);
    }
}
