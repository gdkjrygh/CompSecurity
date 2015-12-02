// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.i;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.ai;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.v;
import com.facebook.orca.server.AddMembersParams;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMultipleThreadsParams;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.ModifyThreadParams;
import com.facebook.orca.server.RemoveMemberParams;
import com.facebook.orca.server.SendMessageByRecipientsParams;
import com.facebook.orca.sms.bj;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.facebook.orca.threads.g;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserIdentifier;
import com.facebook.user.s;
import com.google.common.a.es;
import java.util.Iterator;

public class a extends com.facebook.orca.server.a
{

    private static final Class a = com/facebook/orca/i/a;
    private final v b;
    private final v c;
    private final g d;
    private final javax.inject.a e;
    private final javax.inject.a f;

    public a(bj bj, com.facebook.orca.protocol.a a1, g g1, javax.inject.a a2, javax.inject.a a3)
    {
        super("DispatchServiceHandler");
        c = new v(bj, new ai());
        b = new v(a1, new ai());
        d = g1;
        e = a2;
        f = a3;
    }

    private v a(FolderName foldername)
    {
        return a(foldername.a());
    }

    private v a(FolderType foldertype)
    {
        if (FolderType.b.equals(foldertype) || FolderType.c.equals(foldertype))
        {
            return b;
        }
        if (FolderType.d.equals(foldertype))
        {
            if (((Boolean)e.b()).booleanValue() && ((Boolean)f.b()).booleanValue())
            {
                return c;
            } else
            {
                throw new IllegalArgumentException("Trying to handle sms when it is disabled");
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unexpected Folder Type: ").append(foldertype.a()).toString());
        }
    }

    protected OperationResult b(ad ad1, e e1)
    {
        return a(((FetchThreadListParams)ad1.b().getParcelable("fetchThreadListParams")).b()).a(ad1);
    }

    protected OperationResult c(ad ad1, e e1)
    {
        return a(((FetchMoreThreadsParams)ad1.b().getParcelable("fetchMoreThreadsParams")).a()).a(ad1);
    }

    protected OperationResult d(ad ad1, e e1)
    {
        e1 = ((FetchThreadParams)ad1.b().getParcelable("fetchThreadParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult e(ad ad1, e e1)
    {
        e1 = (SendMessageByRecipientsParams)ad1.b().getParcelable("createThreadParams");
        Iterator iterator = e1.d().iterator();
        int k = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((RecipientInfo)iterator.next()).a().e() == s.PHONE)
            {
                k++;
            }
        } while (true);
        if (k == e1.d().size())
        {
            e1 = FolderType.d;
        } else
        if (k == 0)
        {
            e1 = FolderType.b;
        } else
        {
            throw new IllegalArgumentException("Can't mix the user types being sent to");
        }
        return a(e1).a(ad1);
    }

    protected OperationResult f(ad ad1, e e1)
    {
        return b.a(ad1);
    }

    protected OperationResult h(ad ad1, e e1)
    {
        e1 = ((AddMembersParams)ad1.b().getParcelable("addMembersParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult i(ad ad1, e e1)
    {
        e1 = ((RemoveMemberParams)ad1.b().getParcelable("removeMemberParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult j(ad ad1, e e1)
    {
        e1 = ((MarkThreadParams)ad1.b().getParcelable("markThreadParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult m(ad ad1, e e1)
    {
        e1 = ((DeleteThreadParams)ad1.b().getParcelable("deleteThreadParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult n(ad ad1, e e1)
    {
        e1 = ((DeleteMessagesParams)ad1.b().getParcelable("deleteMessagesParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult o(ad ad1, e e1)
    {
        e1 = ((ModifyThreadParams)ad1.b().getParcelable("modifyThreadParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult q(ad ad1, e e1)
    {
        return a((FolderName)ad1.b().getParcelable("folderName")).a(ad1);
    }

    protected OperationResult s(ad ad1, e e1)
    {
        return b.a(ad1);
    }

    protected OperationResult t(ad ad1, e e1)
    {
        e1 = ((FetchMoreMessagesParams)ad1.b().getParcelable("fetchMoreMessagesParams")).a();
        return a(d.a(e1)).a(ad1);
    }

    protected OperationResult u(ad ad1, e e1)
    {
        return a(((FetchMultipleThreadsParams)ad1.b().getParcelable("fetchMultipleThreadsParams")).a()).a(ad1);
    }

    protected OperationResult v(ad ad1, e e1)
    {
        return b.a(ad1);
    }

    protected OperationResult w(ad ad1, e e1)
    {
        return b.a(ad1);
    }

}
