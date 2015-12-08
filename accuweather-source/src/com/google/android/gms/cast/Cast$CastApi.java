// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.gi;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, ApplicationMetadata, LaunchOptions

public static interface a
{
    public static final class a
        implements Cast.CastApi
    {

        public ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((gi)googleapiclient.a(Cast.yE)).getApplicationMetadata();
        }

        public String getApplicationStatus(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((gi)googleapiclient.a(Cast.yE)).getApplicationStatus();
        }

        public double getVolume(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((gi)googleapiclient.a(Cast.yE)).ec();
        }

        public boolean isMute(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((gi)googleapiclient.a(Cast.yE)).isMute();
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.b(new Cast.c(this) {

                final a zT;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.b(null, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                super(null);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new Cast.c(this, s) {

                final a zT;
                final String zU;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.b(zU, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                zU = s;
                super(null);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.b(new Cast.c(this, s, s1) {

                final a zT;
                final String zU;
                final String zW;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.b(zU, zW, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                zU = s;
                zW = s1;
                super(null);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new Cast.c(this, s) {

                final a zT;
                final String zU;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.a(zU, false, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                zU = s;
                super(null);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
        {
            return googleapiclient.b(new Cast.c(this, s, launchoptions) {

                final a zT;
                final String zU;
                final LaunchOptions zV;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.a(zU, zV, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                zU = s;
                zV = launchoptions;
                super(null);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
        {
            return launchApplication(googleapiclient, s, (new LaunchOptions.Builder()).setRelaunchIfRunning(flag).build());
        }

        public PendingResult leaveApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.b(new Cast.b(this) {

                final a zT;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.d(this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                super(null);
            }
            });
        }

        public void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
            throws IOException, IllegalArgumentException
        {
            try
            {
                ((gi)googleapiclient.a(Cast.yE)).aj(s);
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
                ((gi)googleapiclient.a(Cast.yE)).eb();
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
            return googleapiclient.b(new Cast.b(this, s, s1) {

                final String zR;
                final String zS;
                final a zT;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.a(zR, zS, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                zR = s;
                zS = s1;
                super(null);
            }
            });
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, Cast.MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException
        {
            try
            {
                ((gi)googleapiclient.a(Cast.yE)).a(s, messagereceivedcallback);
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
                ((gi)googleapiclient.a(Cast.yE)).y(flag);
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
                ((gi)googleapiclient.a(Cast.yE)).a(d);
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
            return googleapiclient.b(new Cast.b(this) {

                final a zT;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    try
                    {
                        gi1.a("", this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                super(null);
            }
            });
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new Cast.b(this, s) {

                final a zT;
                final String zW;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gi)a1);
                }

                protected void a(gi gi1)
                    throws RemoteException
                {
                    if (TextUtils.isEmpty(zW))
                    {
                        c(2001, "IllegalArgument: sessionId cannot be null or empty");
                        return;
                    }
                    try
                    {
                        gi1.a(zW, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gi gi1)
                    {
                        N(2001);
                    }
                }

            
            {
                zT = a1;
                zW = s;
                super(null);
            }
            });
        }

        public a()
        {
        }
    }


    public abstract ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract String getApplicationStatus(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract double getVolume(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract boolean isMute(GoogleApiClient googleapiclient)
        throws IllegalStateException;

    public abstract PendingResult joinApplication(GoogleApiClient googleapiclient);

    public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1);

    public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions);

    public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag);

    public abstract PendingResult leaveApplication(GoogleApiClient googleapiclient);

    public abstract void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
        throws IOException, IllegalArgumentException;

    public abstract void requestStatus(GoogleApiClient googleapiclient)
        throws IOException, IllegalStateException;

    public abstract PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1);

    public abstract void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, eceivedCallback eceivedcallback)
        throws IOException, IllegalStateException;

    public abstract void setMute(GoogleApiClient googleapiclient, boolean flag)
        throws IOException, IllegalStateException;

    public abstract void setVolume(GoogleApiClient googleapiclient, double d)
        throws IOException, IllegalArgumentException, IllegalStateException;

    public abstract PendingResult stopApplication(GoogleApiClient googleapiclient);

    public abstract PendingResult stopApplication(GoogleApiClient googleapiclient, String s);
}
