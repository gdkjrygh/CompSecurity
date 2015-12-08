// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.gh;
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
            return ((gh)googleapiclient.a(Cast.yH)).getApplicationMetadata();
        }

        public String getApplicationStatus(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((gh)googleapiclient.a(Cast.yH)).getApplicationStatus();
        }

        public double getVolume(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((gh)googleapiclient.a(Cast.yH)).eh();
        }

        public boolean isMute(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((gh)googleapiclient.a(Cast.yH)).isMute();
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.b(new Cast.c(this) {

                final a zW;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.b(null, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                super(null);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new Cast.c(this, s) {

                final a zW;
                final String zX;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.b(zX, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                zX = s;
                super(null);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.b(new Cast.c(this, s, s1) {

                final a zW;
                final String zX;
                final String zZ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.b(zX, zZ, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                zX = s;
                zZ = s1;
                super(null);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new Cast.c(this, s) {

                final a zW;
                final String zX;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.a(zX, false, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                zX = s;
                super(null);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
        {
            return googleapiclient.b(new Cast.c(this, s, launchoptions) {

                final a zW;
                final String zX;
                final LaunchOptions zY;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.a(zX, zY, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                zX = s;
                zY = launchoptions;
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

                final a zW;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.d(this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                super(null);
            }
            });
        }

        public void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
            throws IOException, IllegalArgumentException
        {
            try
            {
                ((gh)googleapiclient.a(Cast.yH)).aj(s);
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
                ((gh)googleapiclient.a(Cast.yH)).eg();
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

                final String zU;
                final String zV;
                final a zW;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.a(zU, zV, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                zU = s;
                zV = s1;
                super(null);
            }
            });
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, Cast.MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException
        {
            try
            {
                ((gh)googleapiclient.a(Cast.yH)).a(s, messagereceivedcallback);
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
                ((gh)googleapiclient.a(Cast.yH)).y(flag);
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
                ((gh)googleapiclient.a(Cast.yH)).a(d);
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

                final a zW;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    try
                    {
                        gh1.a("", this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                super(null);
            }
            });
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new Cast.b(this, s) {

                final a zW;
                final String zZ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((gh)a1);
                }

                protected void a(gh gh1)
                    throws RemoteException
                {
                    if (TextUtils.isEmpty(zZ))
                    {
                        c(2001, "IllegalArgument: sessionId cannot be null or empty");
                        return;
                    }
                    try
                    {
                        gh1.a(zZ, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (gh gh1)
                    {
                        N(2001);
                    }
                }

            
            {
                zW = a1;
                zZ = s;
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
