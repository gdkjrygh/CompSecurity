// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.en;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, ApplicationMetadata

public static final class _cls9.xS
    implements _cls9.xS
{

    public ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((en)googleapiclient.a(Cast.wx)).getApplicationMetadata();
    }

    public String getApplicationStatus(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((en)googleapiclient.a(Cast.wx)).getApplicationStatus();
    }

    public double getVolume(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((en)googleapiclient.a(Cast.wx)).dI();
    }

    public boolean isMute(GoogleApiClient googleapiclient)
        throws IllegalStateException
    {
        return ((en)googleapiclient.a(Cast.wx)).isMute();
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new Cast.c() {

            final Cast.CastApi.a xP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.b(null, null, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                super(null);
            }
        });
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new Cast.c(s) {

            final Cast.CastApi.a xP;
            final String xQ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.b(xQ, null, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                xQ = s;
                super(null);
            }
        });
    }

    public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new Cast.c(s, s1) {

            final Cast.CastApi.a xP;
            final String xQ;
            final String xS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.b(xQ, xS, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                xQ = s;
                xS = s1;
                super(null);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new Cast.c(s) {

            final Cast.CastApi.a xP;
            final String xQ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.a(xQ, false, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                xQ = s;
                super(null);
            }
        });
    }

    public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.b(new Cast.c(s, flag) {

            final Cast.CastApi.a xP;
            final String xQ;
            final boolean xR;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.a(xQ, xR, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                xQ = s;
                xR = flag;
                super(null);
            }
        });
    }

    public PendingResult leaveApplication(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new Cast.b() {

            final Cast.CastApi.a xP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.e(this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                super(null);
            }
        });
    }

    public void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
        throws IOException, IllegalArgumentException
    {
        try
        {
            ((en)googleapiclient.a(Cast.wx)).V(s);
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
            ((en)googleapiclient.a(Cast.wx)).dH();
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

            final String xN;
            final String xO;
            final Cast.CastApi.a xP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.a(xN, xO, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                xN = s;
                xO = s1;
                super(null);
            }
        });
    }

    public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, eivedCallback eivedcallback)
        throws IOException, IllegalStateException
    {
        try
        {
            ((en)googleapiclient.a(Cast.wx)).a(s, eivedcallback);
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
            ((en)googleapiclient.a(Cast.wx)).v(flag);
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
            ((en)googleapiclient.a(Cast.wx)).a(d);
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

            final Cast.CastApi.a xP;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                try
                {
                    en1.a("", this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                super(null);
            }
        });
    }

    public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new Cast.b(s) {

            final Cast.CastApi.a xP;
            final String xS;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((en)a1);
            }

            protected void a(en en1)
                throws RemoteException
            {
                if (TextUtils.isEmpty(xS))
                {
                    c(2001, "IllegalArgument: sessionId cannot be null or empty");
                    return;
                }
                try
                {
                    en1.a(xS, this);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (en en1)
                {
                    x(2001);
                }
            }

            
            {
                xP = Cast.CastApi.a.this;
                xS = s;
                super(null);
            }
        });
    }

    public _cls9.xS()
    {
    }
}
