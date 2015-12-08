// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.analytics.framework.ErrorMetric;
import java.util.HashMap;

public final class uE extends uI
{

    private static final String TAG = "SendChatMediaTask";

    public uE(AA aa, uI.a a1, HashMap hashmap)
    {
        super(aa, a1, hashmap);
    }

    protected final String a()
    {
        return "SendChatMediaTask";
    }

    public final void a(TR tr, pi pi1)
    {
        if (mUser != null)
        {
            mUser.a(new com.snapchat.android.database.table.DbTable.DatabaseTable[] {
                com.snapchat.android.database.table.DbTable.DatabaseTable.CHAT_MEDIA_FILES, com.snapchat.android.database.table.DbTable.DatabaseTable.FAILED_CHAT_MEDIA_SNAPBRYOS, com.snapchat.android.database.table.DbTable.DatabaseTable.CONVERSATION
            });
        }
        if (pi1.c() && tr != null && tr.d())
        {
            a(tr);
            return;
        }
        if (pi1.mResponseCode == 404)
        {
            try
            {
                mSendMediaallback.f(mSnapbryo);
                (new uF(mSnapbryo, mSendMediaallback)).execute();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (TR tr)
            {
                (new ErrorMetric(tr.getMessage())).a(tr).e();
            }
            return;
        } else
        {
            b();
            return;
        }
    }

    public final void onJsonResult(Object obj, pi pi1)
    {
        a((TR)obj, pi1);
    }
}
