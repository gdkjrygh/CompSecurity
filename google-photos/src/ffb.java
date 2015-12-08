// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.content.SyncStats;
import android.os.Bundle;
import com.google.android.apps.photos.downsync.GooglePhotoDownsyncProvider;
import com.google.android.apps.photos.downsync.GooglePhotoDownsyncService;
import java.util.Iterator;
import java.util.List;

public final class ffb extends AbstractThreadedSyncAdapter
{

    private final noz a;
    private final mmv b;
    private final noz c;
    private final noz d;
    private gct e;

    public ffb(Context context)
    {
        super(context, false);
        b = (mmv)olm.a(context, mmv);
        a = noz.a(context, 4, "PhotoSyncService", new String[] {
            "sync"
        });
        c = noz.a(context, 3, "PhotoSyncService", new String[] {
            "sync"
        });
        d = noz.a(context, "PhotoSyncService", new String[] {
            "sync"
        });
    }

    private void a(List list)
    {
        Context context = getContext();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            int i = ((Integer)list.next()).intValue();
            b.a(i);
            long l = GooglePhotoDownsyncService.a(context, i, ffe.a);
            l = System.currentTimeMillis() - l;
            long l1 = ffe.a.c;
            if (l < l1)
            {
                if (a.a())
                {
                    noy.a(i);
                    noy.a("due in", Long.valueOf((l1 - l) / 1000L));
                }
            } else
            {
                if (a.a())
                {
                    noy.a(i);
                }
                GooglePhotoDownsyncService.a(context, i, ffe.a, System.currentTimeMillis());
            }
        } while (true);
    }

    private void a(List list, gct gct1, SyncResult syncresult, boolean flag)
    {
        gct1.b("Photo down-sync");
        Iterator iterator = list.iterator();
_L3:
        int i;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        i = ((Integer)iterator.next()).intValue();
        if (a.a())
        {
            noy.a(i);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = get.b;
_L6:
        ((gcc)olm.a(getContext(), gcc)).a(i, gct1, ((get) (obj)));
          goto _L3
        obj;
        if (d.a())
        {
            noy.a(i);
        }
        if (GooglePhotoDownsyncService.a(((Exception) (obj)))) goto _L5; else goto _L4
_L4:
        obj = syncresult.stats;
        obj.numIoExceptions = ((SyncStats) (obj)).numIoExceptions + 1L;
          goto _L3
        syncresult;
        i = ((Integer)list.get(0)).intValue();
        gct1.a(getContext(), i);
        throw syncresult;
_L2:
        obj = get.a;
          goto _L6
_L5:
        if (!c.a()) goto _L3; else goto _L7
_L7:
        noy.a(i);
          goto _L3
        syncresult = (hqg)olm.a(getContext(), hqg);
        Intent intent = new Intent("com.google.android.apps.photos.scheduler.ACTION_ALARM");
        ((hqg) (syncresult)).a.sendBroadcast(intent);
        a(list);
        int j = ((Integer)list.get(0)).intValue();
        gct1.a(getContext(), j);
        return;
    }

    public final void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
    {
        int i;
        int j;
        j = b.a(account.name);
        s = account.name;
        if (bundle != null && bundle.getBoolean("initialize", false))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentproviderclient = GooglePhotoDownsyncProvider.a(getContext());
        if (i == 0) goto _L2; else goto _L1
_L1:
        account = GooglePhotoDownsyncService.b(s);
        if (GooglePhotoDownsyncService.c(getContext(), s))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ContentResolver.setIsSyncable(account, contentproviderclient, i);
        if (c.a())
        {
            noy.a(j);
        }
_L4:
        return;
_L2:
        account = GooglePhotoDownsyncService.d(getContext(), account.name);
        if (!account.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        if (c.a())
        {
            noy.a(j);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((gcf)olm.a(getContext(), gcf)).a(((Integer)account.get(0)).intValue()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (c.a())
        {
            noy.a(j);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        this;
        JVM INSTR monitorenter ;
        if (!Thread.currentThread().isInterrupted())
        {
            break MISSING_BLOCK_LABEL_212;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        account;
        this;
        JVM INSTR monitorexit ;
        throw account;
        e = GooglePhotoDownsyncService.a(s);
        this;
        JVM INSTR monitorexit ;
        e.a("Google Photos Sync");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        if (!bundle.containsKey("feed"))
        {
            break MISSING_BLOCK_LABEL_366;
        }
        bundle = bundle.getString("feed");
        if (a.a())
        {
            noy.a("feed", bundle);
            noy.a(j);
        }
        if (!"google_photos".equals(bundle)) goto _L7; else goto _L6
_L6:
        a(account, e, syncresult, true);
_L9:
        if (a.a())
        {
            noy.a(j);
        }
        e.d();
        e = null;
        return;
_L7:
        if (!d.a()) goto _L9; else goto _L8
_L8:
        noy.a("feed", bundle);
        noy.a(j);
          goto _L9
        account;
        e.d();
        e = null;
        throw account;
        if (c.a())
        {
            noy.a(j);
        }
        a(account, e, syncresult, false);
          goto _L9
    }

    public final void onSyncCanceled()
    {
        this;
        JVM INSTR monitorenter ;
        super.onSyncCanceled();
        if (e != null)
        {
            e.a();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
