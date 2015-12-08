// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class acg extends Handler
{

    private final WeakReference a;

    protected acg(Looper looper, ace ace1)
    {
        super(looper);
        a = new WeakReference(ace1);
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        ace ace1 = (ace)a.get();
        if (ace1 == null)
        {
            return;
        }
        switch (message.arg1)
        {
        default:
            return;

        case 72631: 
            ace.a(ace1);
            return;

        case 72632: 
            ace.b(ace1);
            return;

        case 72633: 
            ace.c(ace1);
            return;

        case 72634: 
            ace.a(ace1, (ack)message.obj);
            return;

        case 72635: 
            ace.a(ace1, (JSONObject)message.obj);
            return;

        case 72636: 
            message = (ach)message.obj;
            ace.a(ace1, ((ach) (message)).a, ((ach) (message)).b);
            return;

        case 72637: 
            message = (acf)message.obj;
            ace.a(ace1, ((acf) (message)).a, ((acf) (message)).b);
            return;

        case 72638: 
            ace.d(ace1);
            return;

        case 72639: 
            ace.e(ace1);
            break;
        }
    }
}
