// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.IngestService;

public final class ncs
    implements ServiceConnection
{

    private IngestActivity a;

    public ncs(IngestActivity ingestactivity)
    {
        a = ingestactivity;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        IngestActivity.a(a, ((ncw)ibinder).a);
        IngestActivity.m(a).a(a);
        componentname = IngestActivity.m(a).c;
        ibinder = IngestActivity.b(a);
        ibinder.a = componentname;
        ibinder.notifyDataSetChanged();
        if (IngestActivity.g(a) != null)
        {
            IngestActivity.g(a).a(componentname);
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        IngestActivity.a(a, null);
    }
}
