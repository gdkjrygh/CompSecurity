// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hn;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            ApplicationMetadata, LaunchOptions, CastDevice

public final class Cast
{
    public static interface ApplicationConnectionResult
        extends Result
    {

        public abstract ApplicationMetadata getApplicationMetadata();

        public abstract String getApplicationStatus();

        public abstract String getSessionId();

        public abstract boolean getWasLaunched();
    }

    public static interface CastApi
    {

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

        public abstract void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException;

        public abstract void setMute(GoogleApiClient googleapiclient, boolean flag)
            throws IOException, IllegalStateException;

        public abstract void setVolume(GoogleApiClient googleapiclient, double d)
            throws IOException, IllegalArgumentException, IllegalStateException;

        public abstract PendingResult stopApplication(GoogleApiClient googleapiclient);

        public abstract PendingResult stopApplication(GoogleApiClient googleapiclient, String s);
    }

    public static final class CastApi.a
        implements CastApi
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
            return googleapiclient.b(new c(this) {

                final CastApi.a zT;

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
                super();
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, s) {

                final CastApi.a zT;
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
                super();
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.b(new c(this, s, s1) {

                final CastApi.a zT;
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
                super();
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, s) {

                final CastApi.a zT;
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
                super();
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
        {
            return googleapiclient.b(new c(this, s, launchoptions) {

                final CastApi.a zT;
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
                super();
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
        {
            return launchApplication(googleapiclient, s, (new LaunchOptions.Builder()).setRelaunchIfRunning(flag).build());
        }

        public PendingResult leaveApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.b(new b(this) {

                final CastApi.a zT;

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
                super();
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
            return googleapiclient.b(new b(this, s, s1) {

                final String zR;
                final String zS;
                final CastApi.a zT;

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
                super();
            }
            });
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
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
            return googleapiclient.b(new b(this) {

                final CastApi.a zT;

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
                super();
            }
            });
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new b(this, s) {

                final CastApi.a zT;
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
                super();
            }
            });
        }

        public CastApi.a()
        {
        }
    }

    public static final class CastOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        final CastDevice zX;
        final Listener zY;
        private final int zZ;

        static int a(CastOptions castoptions)
        {
            return castoptions.zZ;
        }

        public static Builder builder(CastDevice castdevice, Listener listener)
        {
            return new Builder(castdevice, listener);
        }

        private CastOptions(Builder builder1)
        {
            zX = builder1.Aa;
            zY = builder1.Ab;
            zZ = Builder.a(builder1);
        }

    }

    public static final class CastOptions.Builder
    {

        CastDevice Aa;
        Listener Ab;
        private int Ac;

        static int a(CastOptions.Builder builder)
        {
            return builder.Ac;
        }

        public CastOptions build()
        {
            return new CastOptions(this);
        }

        public CastOptions.Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                Ac = Ac | 1;
                return this;
            } else
            {
                Ac = Ac & -2;
                return this;
            }
        }

        private CastOptions.Builder(CastDevice castdevice, Listener listener)
        {
            hn.b(castdevice, "CastDevice parameter cannot be null");
            hn.b(listener, "CastListener parameter cannot be null");
            Aa = castdevice;
            Ab = listener;
            Ac = 0;
        }

    }

    public static class Listener
    {

        public void O(int i)
        {
        }

        public void onApplicationDisconnected(int i)
        {
        }

        public void onApplicationStatusChanged()
        {
        }

        public void onVolumeChanged()
        {
        }

        public Listener()
        {
        }
    }

    public static interface MessageReceivedCallback
    {

        public abstract void onMessageReceived(CastDevice castdevice, String s, String s1);
    }

    protected static abstract class a extends com.google.android.gms.common.api.a.b
    {

        public void N(int i)
        {
            b(c(new Status(i)));
        }

        public void c(int i, String s)
        {
            b(c(new Status(i, s, null)));
        }

        public a()
        {
            super(Cast.yE);
        }
    }

    private static abstract class b extends a
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private b()
        {
        }

    }

    private static abstract class c extends a
    {

        public Result c(Status status)
        {
            return j(status);
        }

        public ApplicationConnectionResult j(Status status)
        {
            return new ApplicationConnectionResult(this, status) {

                final c Ad;
                final Status yG;

                public ApplicationMetadata getApplicationMetadata()
                {
                    return null;
                }

                public String getApplicationStatus()
                {
                    return null;
                }

                public String getSessionId()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

                public boolean getWasLaunched()
                {
                    return false;
                }

            
            {
                Ad = c1;
                yG = status;
                super();
            }
            };
        }

        private c()
        {
        }

    }


    public static final Api API;
    public static final CastApi CastApi = new CastApi.a();
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 0x10000;
    public static final int MAX_NAMESPACE_LENGTH = 128;
    static final com.google.android.gms.common.api.Api.c yE;
    private static final com.google.android.gms.common.api.Api.b yF;

    private Cast()
    {
    }

    static 
    {
        yE = new com.google.android.gms.common.api.Api.c();
        yF = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gz gz, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, gz, (CastOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public gi a(Context context, Looper looper, gz gz, CastOptions castoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                hn.b(castoptions, "Setting the API options is required.");
                return new gi(context, looper, castoptions.zX, CastOptions.a(castoptions), castoptions.zY, connectioncallbacks, onconnectionfailedlistener);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(yF, yE, new Scope[0]);
    }
}
