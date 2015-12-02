// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import com.facebook.messages.model.threads.Message;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.orca.prefs.av;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteMessagesResult;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.ai;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadSummary;

// Referenced classes of package com.facebook.orca.f:
//            ad, z

public class i
{

    private final Class a = com/facebook/orca/f/i;
    private final ad b;
    private final z c;
    private final av d;

    public i(ad ad1, z z1, av av1)
    {
        b = ad1;
        c = z1;
        d = av1;
    }

    public void a(FetchMoreThreadsResult fetchmorethreadsresult)
    {
        b.a(fetchmorethreadsresult.c());
        b.a(fetchmorethreadsresult.a(), fetchmorethreadsresult.b(), fetchmorethreadsresult.f());
    }

    public void a(FetchThreadListResult fetchthreadlistresult)
    {
        FolderName foldername = fetchthreadlistresult.a();
        com.google.common.a.es es = fetchthreadlistresult.c();
        b.a(es);
        b.a(foldername, fetchthreadlistresult.h());
        b.a(fetchthreadlistresult.a(), fetchthreadlistresult.b(), fetchthreadlistresult.f(), false);
    }

    public void a(FetchThreadParams fetchthreadparams, FetchThreadResult fetchthreadresult)
    {
        ThreadSummary threadsummary = fetchthreadresult.a();
        if (fetchthreadresult.c() != null)
        {
            b.a(fetchthreadresult.c());
        }
        c.a();
        if (threadsummary != null)
        {
            b.a(threadsummary, fetchthreadresult.f());
            if (fetchthreadparams.f() > 0)
            {
                b.a(threadsummary.y(), fetchthreadresult.b());
            }
        }
        d.a();
    }

    public void a(FetchThreadResult fetchthreadresult)
    {
        ThreadSummary threadsummary = fetchthreadresult.a();
        b.a(fetchthreadresult.c());
        b.a(threadsummary, fetchthreadresult.f());
        b.a(threadsummary, fetchthreadresult.b());
    }

    public void a(FolderName foldername, long l)
    {
        FolderCounts foldercounts = b.e(foldername);
        if (foldercounts != null)
        {
            foldercounts = new FolderCounts(foldercounts.a(), 0, l, foldercounts.d());
            b.a(foldername, foldercounts);
        }
    }

    public void a(FolderName foldername, Message message)
    {
        b.a(foldername, message, null);
        foldername = b.a(foldername, message.e());
        if (foldername != null)
        {
            b.a(foldername, null);
        }
    }

    public void a(FolderName foldername, DeleteMessagesParams deletemessagesparams, DeleteMessagesResult deletemessagesresult)
    {
        String s = deletemessagesparams.a();
        deletemessagesparams = deletemessagesparams.b();
        b.a(s, deletemessagesparams);
        if (deletemessagesresult.b())
        {
            a(foldername, s);
        }
    }

    public void a(FolderName foldername, MarkThreadParams markthreadparams)
    {
        String s = markthreadparams.a();
        ai ai1 = markthreadparams.b();
        if (ai1 == ai.READ && markthreadparams.c())
        {
            b.a(foldername, s, markthreadparams.d());
        } else
        {
            if (ai1 == ai.ARCHIVED && markthreadparams.c())
            {
                b.c(foldername, s);
                return;
            }
            if (ai1 == ai.SPAM && markthreadparams.c())
            {
                b.c(foldername, s);
                return;
            }
        }
    }

    public void a(FolderName foldername, NewMessageResult newmessageresult)
    {
        b.a(foldername, newmessageresult.b(), newmessageresult.c());
    }

    public void a(FolderName foldername, String s)
    {
        b.c(foldername, s);
    }

    public void a(FolderName foldername, String s, MessageDraft messagedraft)
    {
        foldername = b.a(foldername, s);
        if (foldername != null)
        {
            b.a(foldername, messagedraft);
        }
    }

    public void b(FetchThreadResult fetchthreadresult)
    {
        b.a(fetchthreadresult.a(), fetchthreadresult.f());
        b.a(fetchthreadresult.c());
    }
}
