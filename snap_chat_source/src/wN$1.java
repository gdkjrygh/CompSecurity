// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.snapchat.android.model.FriendAction;

final class id.os.Handler extends Handler
{

    private wN a;

    public final void handleMessage(Message message)
    {
label0:
        {
            if (message.obj instanceof FriendAction)
            {
                FriendAction friendaction = (FriendAction)message.obj;
                switch (a[friendaction.ordinal()])
                {
                default:
                    super.handleMessage(message);
                    break;

                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    break label0;
                }
            }
            return;
        }
        a.notifyDataSetChanged();
    }

    >(wN wn)
    {
        a = wn;
        super();
    }
}
