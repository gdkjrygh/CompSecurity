// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.internal.dp;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.g;
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
//            ab, ay, ap, PutDataResponse, 
//            y, aq, z

public final class bi
    implements d
{
    public static final class a
        implements com.google.android.gms.wearable.d.a
    {

        private final Status a;
        private final g b;

        public final Status a()
        {
            return a;
        }

        public a(Status status, g g)
        {
            a = status;
            b = g;
        }
    }

    public static final class b
        implements com.google.android.gms.wearable.d.c
    {

        private final Status a;
        private final int b;

        public final Status a()
        {
            return a;
        }

        public b(Status status, int i)
        {
            a = status;
            b = i;
        }
    }


    public bi()
    {
    }

    public final com.google.android.gms.common.api.d a(c c1, Uri uri)
    {
        return c1.a(new ay(c1, uri) {

            final Uri c;
            final int d = 0;
            final bi e;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ap)b1;
                Uri uri1 = c;
                int i = d;
                ((y)b1.m()).b(new ao.b(this), uri1, i);
            }

            protected final f c(Status status)
            {
                return new b(status, 0);
            }

            
            {
                e = bi.this;
                c = uri;
                super(c1);
            }
        });
    }

    public final com.google.android.gms.common.api.d a(c c1, PutDataRequest putdatarequest)
    {
        return c1.a(new ay(c1, putdatarequest) {

            final PutDataRequest c;
            final bi d;

            protected final void b(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                Object obj = (ap)b1;
                b1 = c;
                for (Iterator iterator = b1.a().entrySet().iterator(); iterator.hasNext();)
                {
                    Asset asset = (Asset)((java.util.Map.Entry)iterator.next()).getValue();
                    if (asset.b == null && asset.c == null && asset.d == null && asset.e == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Put for ")).append(((PutDataRequest) (b1)).b).append(" contains invalid asset: ").append(asset).toString());
                    }
                }

                PutDataRequest putdatarequest1 = PutDataRequest.a(((PutDataRequest) (b1)).b);
                putdatarequest1.d = ((PutDataRequest) (b1)).d;
                ArrayList arraylist = new ArrayList();
                for (Iterator iterator1 = b1.a().entrySet().iterator(); iterator1.hasNext();)
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    Object obj1 = (Asset)entry.getValue();
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
                            throw new IllegalStateException((new StringBuilder("Unable to create ParcelFileDescriptor for asset in request: ")).append(b1).toString(), ((Throwable) (obj)));
                        }
                        if (Log.isLoggable("WearableClient", 3))
                        {
                            Log.d("WearableClient", (new StringBuilder("processAssets: replacing data with FD in asset: ")).append(obj1).append(" read:").append(aparcelfiledescriptor[0]).append(" write:").append(aparcelfiledescriptor[1]).toString());
                        }
                        putdatarequest1.a((String)entry.getKey(), Asset.a(aparcelfiledescriptor[0]));
                        obj1 = new FutureTask(new ap._cls1(((ap) (obj)), aparcelfiledescriptor[1], ((Asset) (obj1)).b));
                        arraylist.add(obj1);
                        ((ap) (obj)).e.submit(((Runnable) (obj1)));
                    } else
                    if (((Asset) (obj1)).e != null)
                    {
                        try
                        {
                            Asset asset1 = Asset.a(((j) (obj)).a.getContentResolver().openFileDescriptor(((Asset) (obj1)).e, "r"));
                            putdatarequest1.a((String)entry.getKey(), asset1);
                        }
                        // Misplaced declaration of an exception variable
                        catch (com.google.android.gms.common.api.a.b b1)
                        {
                            (new ao.d(this, arraylist)).a(new PutDataResponse());
                            Log.w("WearableClient", (new StringBuilder("Couldn't resolve asset URI: ")).append(((Asset) (obj1)).e).toString());
                            return;
                        }
                    } else
                    {
                        putdatarequest1.a((String)entry.getKey(), ((Asset) (obj1)));
                    }
                }

                ((y)((ap) (obj)).m()).a(new ao.d(this, arraylist), putdatarequest1);
            }

            public final f c(Status status)
            {
                return new a(status, null);
            }

            
            {
                d = bi.this;
                c = putdatarequest;
                super(c1);
            }
        });
    }

    public final com.google.android.gms.common.api.d a(c c1, com.google.android.gms.wearable.d.b b1)
    {
        return ab.a(c1, new ab.a() {

            final IntentFilter a[] = null;

            public final volatile void a(ap ap1, com.google.android.gms.internal.dg.b b2, Object obj, dp dp)
                throws RemoteException
            {
                obj = (com.google.android.gms.wearable.d.b)obj;
                IntentFilter aintentfilter[] = a;
                ap1.i.a(ap1, b2, obj, aq.a(dp, aintentfilter));
            }

            
            {
                super();
            }
        }, b1);
    }

    public final com.google.android.gms.common.api.d b(c c1, com.google.android.gms.wearable.d.b b1)
    {
        return c1.a(new ay(c1, b1) {

            final com.google.android.gms.wearable.d.b c;
            final bi d;

            protected final void b(com.google.android.gms.common.api.a.b b2)
                throws RemoteException
            {
                b2 = (ap)b2;
                com.google.android.gms.wearable.d.b b3 = c;
                ((ap) (b2)).i.a(b2, this, b3);
            }

            public final f c(Status status)
            {
                return status;
            }

            
            {
                d = bi.this;
                c = b1;
                super(c1);
            }
        });
    }
}
