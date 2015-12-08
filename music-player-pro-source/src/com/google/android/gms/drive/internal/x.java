// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.FileUploadPreferences;

// Referenced classes of package com.google.android.gms.drive.internal:
//            FileUploadPreferencesImpl, c, OnDeviceUsagePreferenceResponse, r, 
//            ae, q, SetFileUploadPreferencesRequest, bg

public class x
    implements DrivePreferencesApi
{
    private class a extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;
        final x Qq;

        public void a(OnDeviceUsagePreferenceResponse ondeviceusagepreferenceresponse)
            throws RemoteException
        {
            Ea.b(Qq. new b(Status.Kw, ondeviceusagepreferenceresponse.iN()));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(Qq. new b(status, null));
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Qq = x.this;
            super();
            Ea = b1;
        }

    }

    private class b
        implements com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult
    {

        private final Status Eb;
        final x Qq;
        private final FileUploadPreferences Qs;

        public FileUploadPreferences getFileUploadPreferences()
        {
            return Qs;
        }

        public Status getStatus()
        {
            return Eb;
        }

        private b(Status status, FileUploadPreferences fileuploadpreferences)
        {
            Qq = x.this;
            super();
            Eb = status;
            Qs = fileuploadpreferences;
        }

    }

    private abstract class c extends q
    {

        final x Qq;

        protected Result c(Status status)
        {
            return t(status);
        }

        protected com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult t(Status status)
        {
            return Qq. new b(status, null);
        }

        public c(GoogleApiClient googleapiclient)
        {
            Qq = x.this;
            super(googleapiclient);
        }
    }


    public x()
    {
    }

    public PendingResult getFileUploadPreferences(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new c(googleapiclient) {

            final x Qq;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().h(Qq. new a(this));
            }

            
            {
                Qq = x.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult setFileUploadPreferences(GoogleApiClient googleapiclient, FileUploadPreferences fileuploadpreferences)
    {
        if (!(fileuploadpreferences instanceof FileUploadPreferencesImpl))
        {
            throw new IllegalArgumentException("Invalid preference value");
        } else
        {
            return googleapiclient.b(new q.a(googleapiclient, (FileUploadPreferencesImpl)fileuploadpreferences) {

                final x Qq;
                final FileUploadPreferencesImpl Qr;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.iG().a(new SetFileUploadPreferencesRequest(Qr), new bg(this));
                }

            
            {
                Qq = x.this;
                Qr = fileuploadpreferencesimpl;
                super(googleapiclient);
            }
            });
        }
    }
}
