// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.ij;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, ApplicationMetadata, LaunchOptions

public static final class _cls9.EJ
    implements _cls9.EJ
{

    public ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((ij)googleapiclient.a(Cast.CU)).getApplicationMetadata();
    }

    public String getApplicationStatus(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((ij)googleapiclient.a(Cast.CU)).getApplicationStatus();
    }

    public double getVolume(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((ij)googleapiclient.a(Cast.CU)).fE();
    }

    public boolean isMute(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((ij)googleapiclient.a(Cast.CU)).isMute();
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new Cast.c() {

            final Cast.CastApi.a EG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.b(null, null, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                super(null);
            }
        });
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new Cast.c(s) {

            final Cast.CastApi.a EG;
            final String EH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.b(EH, null, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                EH = s;
                super(null);
            }
        });
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new Cast.c(s, s1) {

            final Cast.CastApi.a EG;
            final String EH;
            final String EJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.b(EH, EJ, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                EH = s;
                EJ = s1;
                super(null);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new Cast.c(s) {

            final Cast.CastApi.a EG;
            final String EH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.a(EH, false, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                EH = s;
                super(null);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
    {
        return googleapiclient.b(new Cast.c(s, launchoptions) {

            final Cast.CastApi.a EG;
            final String EH;
            final LaunchOptions EI;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.a(EH, EI, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                EH = s;
                EI = launchoptions;
                super(null);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return launchApplication(googleapiclient, s, (new uilder()).setRelaunchIfRunning(flag).build());
    }

    public PendingResult leaveApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new Cast.b() {

            final Cast.CastApi.a EG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.d(this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                super(null);
            }
        });
    }

    public void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
        throws IOException, IllegalArgumentException
    {
        try
        {
            ((ij)googleapiclient.a(Cast.CU)).aE(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public void requestStatus(GoogleApiClient googleapiclient)
        throws IOException, IllegalStateException
    {
        try
        {
            ((ij)googleapiclient.a(Cast.CU)).fD();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new Cast.b(s, s1) {

            final String EE;
            final String EF;
            final Cast.CastApi.a EG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.a(EE, EF, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                EE = s;
                EF = s1;
                super(null);
            }
        });
    }

    public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, eivedCallback eivedcallback)
        throws IOException, IllegalStateException
    {
        try
        {
            ((ij)googleapiclient.a(Cast.CU)).a(s, eivedcallback);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public void setMute(GoogleApiClient googleapiclient, boolean flag)
        throws IOException, IllegalStateException
    {
        try
        {
            ((ij)googleapiclient.a(Cast.CU)).G(flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public void setVolume(GoogleApiClient googleapiclient, double d)
        throws IOException, IllegalArgumentException, IllegalStateException
    {
        try
        {
            ((ij)googleapiclient.a(Cast.CU)).a(d);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new IOException("service error");
        }
    }

    public PendingResult stopApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new Cast.b() {

            final Cast.CastApi.a EG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                try
                {
                    ij1.a("", this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                super(null);
            }
        });
    }

    public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new Cast.b(s) {

            final Cast.CastApi.a EG;
            final String EJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((ij)a1);
            }

            protected void a(ij ij1)
                throws RemoteException
            {
                if (TextUtils.isEmpty(EJ))
                {
                    e(2001, "IllegalArgument: sessionId cannot be null or empty");
                    return;
                }
                try
                {
                    ij1.a(EJ, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ij ij1)
                {
                    V(2001);
                }
            }

            
            {
                EG = Cast.CastApi.a.this;
                EJ = s;
                super(null);
            }
        });
    }

    public _cls9.EJ()
    {
    }
}
