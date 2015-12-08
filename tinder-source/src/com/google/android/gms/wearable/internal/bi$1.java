// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ay, bi, ap, PutDataResponse, 
//            y

final class nit> extends ay
{

    final PutDataRequest c;
    final bi d;

    protected final void b(com.google.android.gms.common.api._cls1 _pcls1)
        throws RemoteException
    {
        Object obj = (ap)_pcls1;
        _pcls1 = c;
        for (Iterator iterator = _pcls1.a().entrySet().iterator(); iterator.hasNext();)
        {
            Asset asset = (Asset)((java.util.ntry)iterator.next()).getValue();
            if (asset.b == null && asset.c == null && asset.d == null && asset.e == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Put for ")).append(((PutDataRequest) (_pcls1)).b).append(" contains invalid asset: ").append(asset).toString());
            }
        }

        PutDataRequest putdatarequest = PutDataRequest.a(((PutDataRequest) (_pcls1)).b);
        putdatarequest.d = ((PutDataRequest) (_pcls1)).d;
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = _pcls1.a().entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.ntry ntry = (java.util.ntry)iterator1.next();
            Object obj1 = (Asset)ntry.getValue();
            if (((Asset) (obj1)).b != null)
            {
                ParcelFileDescriptor aparcelfiledescriptor[];
                try
                {
                    aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new IllegalStateException((new StringBuilder("Unable to create ParcelFileDescriptor for asset in request: ")).append(_pcls1).toString(), ((Throwable) (obj)));
                }
                if (Log.isLoggable("WearableClient", 3))
                {
                    Log.d("WearableClient", (new StringBuilder("processAssets: replacing data with FD in asset: ")).append(obj1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]).toString());
                }
                putdatarequest.a((String)ntry.getKey(), Asset.a(aparcelfiledescriptor[0]));
                obj1 = new FutureTask(new <init>(((ap) (obj)), aparcelfiledescriptor[1], ((Asset) (obj1)).b));
                arraylist.add(obj1);
                ((ap) (obj)).e.submit(((Runnable) (obj1)));
            } else
            if (((Asset) (obj1)).e != null)
            {
                try
                {
                    Asset asset1 = Asset.a(((j) (obj)).a.getContentResolver().openFileDescriptor(((Asset) (obj1)).e, "r"));
                    putdatarequest.a((String)ntry.getKey(), asset1);
                }
                // Misplaced declaration of an exception variable
                catch (com.google.android.gms.common.api._cls1 _pcls1)
                {
                    (new <init>(this, arraylist)).a(new PutDataResponse());
                    Log.w("WearableClient", (new StringBuilder("Couldn't resolve asset URI: ")).append(((Asset) (obj1)).e).toString());
                    return;
                }
            } else
            {
                putdatarequest.a((String)ntry.getKey(), ((Asset) (obj1)));
            }
        }

        ((y)((ap) (obj)).m()).a(new <init>(this, arraylist), putdatarequest);
    }

    public final f c(Status status)
    {
        return new <init>(status, null);
    }

    (bi bi1, c c1, PutDataRequest putdatarequest)
    {
        d = bi1;
        c = putdatarequest;
        super(c1);
    }
}
