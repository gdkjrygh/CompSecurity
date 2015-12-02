// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.f;

import android.os.Bundle;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.c;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.orca.server.AddMembersParams;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteMessagesResult;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.ReceiptResult;
import com.facebook.orca.server.SendBroadcastResult;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.server.a;
import com.facebook.orca.server.ai;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.g;
import com.google.common.a.es;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.f:
//            g, i, ad, z

public class j extends a
{

    private static final Class a = com/facebook/orca/f/j;
    private final com.facebook.orca.f.ad b;
    private final z c;
    private final com.facebook.orca.app.g d;
    private final com.facebook.orca.f.g e;
    private final i f;
    private final g g;

    public j(com.facebook.orca.f.ad ad1, z z1, com.facebook.orca.app.g g1, com.facebook.orca.f.g g2, i i1, g g3)
    {
        super("CacheServiceHandler");
        b = ad1;
        c = z1;
        d = g1;
        e = g2;
        f = i1;
        g = g3;
    }

    protected OperationResult b(ad ad1, e e1)
    {
        Bundle bundle = ad1.b();
        FetchThreadListParams fetchthreadlistparams = (FetchThreadListParams)bundle.getParcelable("fetchThreadListParams");
        FolderName foldername = fetchthreadlistparams.b();
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("handleFetchThreadList with freshness=").append(fetchthreadlistparams.a().toString()).toString());
        FetchThreadListParams fetchthreadlistparams1 = e.a(fetchthreadlistparams);
        Object obj = fetchthreadlistparams;
        if (fetchthreadlistparams != fetchthreadlistparams1)
        {
            bundle.putParcelable("fetchThreadListParams", fetchthreadlistparams1);
            com.facebook.debug.log.b.a(a, (new StringBuilder()).append("handleFetchThreadList upgraded to ").append(fetchthreadlistparams1.a()).toString());
            obj = fetchthreadlistparams1;
        }
        obj = ((FetchThreadListParams) (obj)).a();
        boolean flag = e.a(foldername, ((s) (obj)));
        com.facebook.debug.log.b.a(a, (new StringBuilder()).append("handleFetchThreadList canServeFromCache=").append(flag).toString());
        if (flag)
        {
            return OperationResult.a(e.a(foldername));
        } else
        {
            ad1 = e1.a(ad1);
            e1 = (FetchThreadListResult)ad1.i();
            f.a(e1);
            return ad1;
        }
    }

    protected OperationResult c(ad ad1, e e1)
    {
        ad1 = e1.a(ad1);
        e1 = (FetchMoreThreadsResult)ad1.i();
        f.a(e1);
        return ad1;
    }

    protected OperationResult d(ad ad1, e e1)
    {
        FetchThreadParams fetchthreadparams = (FetchThreadParams)ad1.b().getParcelable("fetchThreadParams");
        Object obj = fetchthreadparams.a();
        obj = g.a(((com.facebook.orca.server.ThreadCriteria) (obj)));
        obj = e.a(ad1, ((FolderName) (obj)));
        if (obj != null)
        {
            return OperationResult.a(((android.os.Parcelable) (obj)));
        }
        ad1 = e1.a(ad1);
        e1 = (FetchThreadResult)ad1.i();
        if (e1.e() != com.facebook.fbservice.c.b.NO_DATA)
        {
            f.a(fetchthreadparams, e1);
        }
        return ad1;
    }

    protected OperationResult e(ad ad1, e e1)
    {
        SendMessageByRecipientsParams sendmessagebyrecipientsparams = (SendMessageByRecipientsParams)ad1.b().getParcelable("createThreadParams");
        ad1 = e1.a(ad1);
        e1 = (FetchThreadResult)ad1.i();
        f.a(e1);
        return ad1;
    }

    protected OperationResult f(ad ad1, e e1)
    {
        ad1 = e1.a(ad1);
        FetchThreadResult fetchthreadresult;
        for (e1 = ((SendBroadcastResult)ad1.i()).b().iterator(); e1.hasNext(); f.a(fetchthreadresult))
        {
            fetchthreadresult = (FetchThreadResult)e1.next();
        }

        return ad1;
    }

    protected OperationResult g(ad ad1, e e1)
    {
        e1 = e1.a(ad1);
        ad1 = (Message)ad1.b().getParcelable("outgoingMessage");
        Object obj = ad1.e();
        obj = g.a(((String) (obj)));
        f.a(((FolderName) (obj)), ad1);
        return e1;
    }

    protected OperationResult h(ad ad1, e e1)
    {
        Object obj = (AddMembersParams)ad1.b().getParcelable("addMembersParams");
        ad1 = e1.a(ad1);
        e1 = (FetchThreadResult)ad1.i();
        obj = e1.a();
        if (obj != null)
        {
            b.a(((ThreadSummary) (obj)), e1.f());
            b.a(e1.c());
            c.a();
        }
        return ad1;
    }

    protected OperationResult i(ad ad1, e e1)
    {
        ad1 = e1.a(ad1);
        e1 = (FetchThreadResult)ad1.i();
        b.a(e1.a(), e1.f());
        b.a(e1.c());
        c.a();
        return ad1;
    }

    protected OperationResult j(ad ad1, e e1)
    {
        MarkThreadParams markthreadparams = (MarkThreadParams)ad1.b().getParcelable("markThreadParams");
        String s1 = markthreadparams.a();
        ai ai1 = markthreadparams.b();
        FolderName foldername = g.a(s1);
        f.a(foldername, markthreadparams);
        if ((ai1 == ai.ARCHIVED || ai1 == ai.SPAM) && markthreadparams.c())
        {
            d.c(s1);
        }
        return e1.a(ad1);
    }

    protected OperationResult k(ad ad1, e e1)
    {
        ad1 = e1.a(ad1);
        e1 = (ReceiptResult)ad1.i();
        ThreadSummary threadsummary = e1.a();
        if (threadsummary != null)
        {
            b.a(threadsummary, e1.f());
            d.a(threadsummary.a());
        }
        return ad1;
    }

    protected OperationResult l(ad ad1, e e1)
    {
        ad1 = e1.a(ad1);
        e1 = (ReceiptResult)ad1.i();
        ThreadSummary threadsummary = e1.a();
        if (threadsummary != null)
        {
            b.a(threadsummary, e1.f());
            d.a(threadsummary.a());
        }
        return ad1;
    }

    protected OperationResult m(ad ad1, e e1)
    {
        Object obj = (DeleteThreadParams)ad1.b().getParcelable("deleteThreadParams");
        ad1 = e1.a(ad1);
        e1 = ((DeleteThreadParams) (obj)).a();
        obj = g.a(e1);
        f.a(((FolderName) (obj)), e1);
        return ad1;
    }

    protected OperationResult n(ad ad1, e e1)
    {
        DeleteMessagesParams deletemessagesparams = (DeleteMessagesParams)ad1.b().getParcelable("deleteMessagesParams");
        ad1 = e1.a(ad1);
        e1 = (DeleteMessagesResult)ad1.i();
        Object obj = deletemessagesparams.a();
        obj = g.a(((String) (obj)));
        f.a(((FolderName) (obj)), deletemessagesparams, e1);
        return ad1;
    }

    protected OperationResult o(ad ad1, e e1)
    {
        ad1 = e1.a(ad1);
        e1 = (FetchThreadResult)ad1.i();
        f.b(e1);
        return ad1;
    }

    protected OperationResult p(ad ad1, e e1)
    {
        e1 = e1.a(ad1);
        Object obj = ad1.b();
        ad1 = ((Bundle) (obj)).getString("threadId");
        obj = (MessageDraft)((Bundle) (obj)).getParcelable("draft");
        FolderName foldername = g.a(ad1);
        f.a(foldername, ad1, ((MessageDraft) (obj)));
        return e1;
    }

    protected OperationResult q(ad ad1, e e1)
    {
        FolderName foldername = (FolderName)ad1.b().getParcelable("folderName");
        ad1 = e1.a(ad1);
        long l1 = System.currentTimeMillis();
        f.a(foldername, l1);
        return ad1;
    }

    protected OperationResult r(ad ad1, e e1)
    {
        ad1.b().getString("threadId");
        e1 = e1.a(ad1);
        NewMessageResult newmessageresult = (NewMessageResult)e1.i();
        if (newmessageresult != null)
        {
            Message message = newmessageresult.b();
            ad1 = FolderName.b;
            if (c.SMS.equals(message.A()) || c.MMS.equals(message.A()))
            {
                ad1 = FolderName.d;
            }
            f.a(ad1, newmessageresult);
        }
        return e1;
    }

}
