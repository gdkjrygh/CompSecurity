// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.d.d.e;
import com.facebook.d.d.f;
import com.facebook.d.d.j;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.SendError;
import com.facebook.orca.server.NewMessageResult;

// Referenced classes of package com.facebook.orca.g:
//            aa, n, h, b

public class t
{

    private final Class a = com/facebook/orca/g/t;
    private final aa b;
    private final n c;
    private final h d;
    private final com.facebook.orca.g.b e;

    public t(aa aa1, n n1, h h1, com.facebook.orca.g.b b1)
    {
        b = aa1;
        c = n1;
        d = h1;
        e = b1;
    }

    private void a(SendError senderror)
    {
        a(senderror, ((String) (null)));
    }

    private void a(SendError senderror, String s)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        f f1 = com.facebook.d.d.e.a();
        f1.a(com.facebook.d.d.e.a("msg_type", Integer.toString(900)));
        if (s != null)
        {
            f1.a(com.facebook.d.d.e.a("thread_id", s));
        }
        s = new ContentValues();
        s.put("msg_type", Integer.valueOf(901));
        s.put("send_error", senderror.a());
        sqlitedatabase.update("messages", s, f1.a(), f1.b());
    }

    private void b(Message message)
    {
        SQLiteDatabase sqlitedatabase = b.e();
        j j1 = com.facebook.d.d.e.a("msg_id", message.d());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("send_error", message.K().a());
        sqlitedatabase.update("messages", contentvalues, j1.a(), j1.b());
    }

    public OperationResult a(String s, OperationResult operationresult)
    {
        Object obj = (NewMessageResult)operationresult.i();
        NewMessageResult newmessageresult = c.a(((NewMessageResult) (obj)));
        obj = d.c(s);
        operationresult.g().putParcelable("result", newmessageresult);
        operationresult.g().putString("threadId", s);
        s = operationresult.g();
        boolean flag;
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s.putBoolean("hasMoreQueuedMessages", flag);
        return operationresult;
    }

    public Message a(String s)
    {
        return d.c(s);
    }

    public void a()
    {
        if (e.a())
        {
            return;
        } else
        {
            a(SendError.e);
            e.a(true);
            return;
        }
    }

    public void a(Message message)
    {
        SQLiteDatabase sqlitedatabase;
        String s;
        s = message.e();
        sqlitedatabase = b.e();
        sqlitedatabase.beginTransaction();
        a(SendError.d, s);
        b(message);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        message;
        com.facebook.debug.log.b.d(a, "SQLException", message);
        throw message;
        message;
        sqlitedatabase.endTransaction();
        throw message;
    }
}
