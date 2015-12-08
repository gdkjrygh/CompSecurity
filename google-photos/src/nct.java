// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.social.ingest.IngestActivity;
import java.lang.ref.WeakReference;

public final class nct extends Handler
{

    private WeakReference a;

    public nct(IngestActivity ingestactivity)
    {
        a = new WeakReference(ingestactivity);
    }

    public final void handleMessage(Message message)
    {
        IngestActivity ingestactivity = (IngestActivity)a.get();
        if (ingestactivity == null || !IngestActivity.h(ingestactivity))
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            IngestActivity.j(ingestactivity);
            return;

        case 1: // '\001'
            IngestActivity.i(ingestactivity);
            return;

        case 2: // '\002'
            IngestActivity.k(ingestactivity);
            return;

        case 3: // '\003'
            IngestActivity.c(ingestactivity).b();
            return;

        case 4: // '\004'
            IngestActivity.l(ingestactivity);
            break;
        }
    }
}
