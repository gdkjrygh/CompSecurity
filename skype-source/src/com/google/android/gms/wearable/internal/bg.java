// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.f;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, ao, x

public final class bg
    implements com.google.android.gms.wearable.c
{
    public static final class a
        implements com.google.android.gms.wearable.c.a
    {

        private final Status a;
        private final f b;

        public final f a()
        {
            return b;
        }

        public final Status getStatus()
        {
            return a;
        }

        public a(Status status, f f)
        {
            a = status;
            b = f;
        }
    }

    public static final class b
        implements com.google.android.gms.wearable.c.c
    {

        private final Status a;
        private final int b;

        public final Status getStatus()
        {
            return a;
        }

        public b(Status status, int i)
        {
            a = status;
            b = i;
        }
    }

    public static final class c
        implements com.google.android.gms.wearable.c.d
    {

        private final Status a;
        private volatile ParcelFileDescriptor b;
        private volatile InputStream c;
        private volatile boolean d;

        public final void a()
        {
            if (b == null)
            {
                return;
            }
            if (d)
            {
                throw new IllegalStateException("releasing an already released result.");
            }
            if (c == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            c.close();
_L1:
            d = true;
            b = null;
            c = null;
            return;
            try
            {
                b.close();
            }
            catch (IOException ioexception)
            {
                return;
            }
              goto _L1
        }

        public final InputStream b()
        {
            if (d)
            {
                throw new IllegalStateException("Cannot access the input stream after release().");
            }
            if (b == null)
            {
                return null;
            }
            if (c == null)
            {
                c = new android.os.ParcelFileDescriptor.AutoCloseInputStream(b);
            }
            return c;
        }

        public final Status getStatus()
        {
            return a;
        }

        public c(Status status, ParcelFileDescriptor parcelfiledescriptor)
        {
            d = false;
            a = status;
            b = parcelfiledescriptor;
        }
    }


    public bg()
    {
    }

    public final e a(com.google.android.gms.common.api.c c1, Uri uri)
    {
        return c1.a(new aw(c1, uri) {

            final Uri b;
            final bg c;

            protected final g a(Status status)
            {
                return new a(status, null);
            }

            protected final void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ao)b1;
                Uri uri1 = b;
                ((x)b1.n()).a(new an.d(this), uri1);
            }

            
            {
                c = bg.this;
                b = uri;
                super(c1);
            }
        });
    }

    public final e a(com.google.android.gms.common.api.c c1, Asset asset)
    {
        if (asset == null)
        {
            throw new IllegalArgumentException("asset is null");
        }
        if (asset.b() == null)
        {
            throw new IllegalArgumentException("invalid asset");
        }
        if (asset.a() != null)
        {
            throw new IllegalArgumentException("invalid asset");
        } else
        {
            return c1.a(new aw(c1, asset) {

                final Asset b;
                final bg c;

                protected final g a(Status status)
                {
                    return new c(status, null);
                }

                protected final void a(com.google.android.gms.common.api.a.b b1)
                    throws RemoteException
                {
                    b1 = (ao)b1;
                    Asset asset1 = b;
                    ((x)b1.n()).a(new an.e(this), asset1);
                }

            
            {
                c = bg.this;
                b = asset;
                super(c1);
            }
            });
        }
    }

    public final e a(com.google.android.gms.common.api.c c1, PutDataRequest putdatarequest)
    {
        return c1.a(new aw(c1, putdatarequest) {

            final PutDataRequest b;
            final bg c;

            public final g a(Status status)
            {
                return new a(status, null);
            }

            protected final volatile void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                ((ao)b1).a(this, b);
            }

            
            {
                c = bg.this;
                b = putdatarequest;
                super(c1);
            }
        });
    }

    public final e b(com.google.android.gms.common.api.c c1, Uri uri)
    {
        return c1.a(new aw(c1, uri) {

            final Uri b;
            final int c = 0;
            final bg d;

            protected final g a(Status status)
            {
                return new b(status, 0);
            }

            protected final void a(com.google.android.gms.common.api.a.b b1)
                throws RemoteException
            {
                b1 = (ao)b1;
                Uri uri1 = b;
                int i = c;
                ((x)b1.n()).b(new an.b(this), uri1, i);
            }

            
            {
                d = bg.this;
                b = uri;
                super(c1);
            }
        });
    }
}
