// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.Images;

// Referenced classes of package com.google.android.gms.internal:
//            rn

public final class sh
    implements Images
{
    static abstract class a extends com.google.android.gms.people.People.a
    {

        private com.google.android.gms.people.Images.LoadImageResult bn(Status status)
        {
            return new com.google.android.gms.people.Images.LoadImageResult(this, status) {

                final Status Fe;
                final a aFC;

                public final int getHeight()
                {
                    return 0;
                }

                public final ParcelFileDescriptor getParcelFileDescriptor()
                {
                    return null;
                }

                public final Status getStatus()
                {
                    return Fe;
                }

                public final int getWidth()
                {
                    return 0;
                }

                public final void release()
                {
                }

            
            {
                aFC = a1;
                Fe = status;
                super();
            }
            };
        }

        public final Result b(Status status)
        {
            return bn(status);
        }

        private a(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public sh()
    {
    }

    private PendingResult loadOwnerCoverPhoto(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.a(new a(googleapiclient, s, s1) {

            final String aEH;
            final String aEN;
            final sh aFu;

            private void b(rn rn1)
            {
                a(rn1.a(this, aEH, aEN, 0));
            }

            protected final void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                b((rn)a1);
            }

            
            {
                aFu = sh.this;
                aEH = s;
                aEN = s1;
                super(googleapiclient);
            }
        });
    }

    public final PendingResult loadOwnerAvatar(GoogleApiClient googleapiclient, String s, String s1, int i, int j)
    {
        return googleapiclient.a(new a(googleapiclient, s, s1, i, j) {

            final String aEH;
            final String aEN;
            final sh aFu;
            final int aFw;
            final int aFz;

            private void b(rn rn1)
            {
                a(rn1.b(this, aEH, aEN, aFw, aFz));
            }

            protected final void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                b((rn)a1);
            }

            
            {
                aFu = sh.this;
                aEH = s;
                aEN = s1;
                aFw = i;
                aFz = j;
                super(googleapiclient);
            }
        });
    }

    public final PendingResult loadOwnerCoverPhoto(GoogleApiClient googleapiclient, String s, String s1, int i)
    {
        return loadOwnerCoverPhoto(googleapiclient, s, s1);
    }

    // Unreferenced inner class com/google/android/gms/internal/sh$1

/* anonymous class */
    final class _cls1 extends com.google.android.gms.people.People.a
    {

        final String aEH;
        final String aEN;
        final Uri aFs;
        final boolean aFt;

        private void b(rn rn1)
        {
            rn1.a(this, aEH, aEN, aFs, aFt);
        }

        private com.google.android.gms.people.Images.SetAvatarResult bm(Status status)
        {
            return new com.google.android.gms.people.Images.SetAvatarResult(this, status) {

                final Status Fe;
                final _cls1 aFv;

                public final Status getStatus()
                {
                    return Fe;
                }

            
            {
                aFv = _pcls1;
                Fe = status;
                super();
            }
            };
        }

        protected final void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            b((rn)a1);
        }

        protected final Result b(Status status)
        {
            return bm(status);
        }
    }

}
