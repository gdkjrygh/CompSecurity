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
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.fq;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            ApplicationMetadata, CastDevice

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
            return googleapiclient.b(new c(this) {

                final CastApi.a xP;

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
                xP = a1;
                super();
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, s) {

                final CastApi.a xP;
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
                xP = a1;
                xQ = s;
                super();
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.b(new c(this, s, s1) {

                final CastApi.a xP;
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
                xP = a1;
                xQ = s;
                xS = s1;
                super();
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, s) {

                final CastApi.a xP;
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
                xP = a1;
                xQ = s;
                super();
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
        {
            return googleapiclient.b(new c(this, s, flag) {

                final CastApi.a xP;
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
                xP = a1;
                xQ = s;
                xR = flag;
                super();
            }
            });
        }

        public PendingResult leaveApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.b(new b(this) {

                final CastApi.a xP;

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
                xP = a1;
                super();
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
            return googleapiclient.b(new b(this, s, s1) {

                final String xN;
                final String xO;
                final CastApi.a xP;

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
                xP = a1;
                xN = s;
                xO = s1;
                super();
            }
            });
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException
        {
            try
            {
                ((en)googleapiclient.a(Cast.wx)).a(s, messagereceivedcallback);
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
            return googleapiclient.b(new b(this) {

                final CastApi.a xP;

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
                xP = a1;
                super();
            }
            });
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new b(this, s) {

                final CastApi.a xP;
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
                xP = a1;
                xS = s;
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

        final CastDevice xT;
        final Listener xU;
        private final int xV;

        static int a(CastOptions castoptions)
        {
            return castoptions.xV;
        }

        public static Builder builder(CastDevice castdevice, Listener listener)
        {
            return new Builder(castdevice, listener);
        }

        private CastOptions(Builder builder1)
        {
            xT = builder1.xW;
            xU = builder1.xX;
            xV = Builder.a(builder1);
        }

    }

    public static final class CastOptions.Builder
    {

        CastDevice xW;
        Listener xX;
        private int xY;

        static int a(CastOptions.Builder builder)
        {
            return builder.xY;
        }

        public CastOptions build()
        {
            return new CastOptions(this);
        }

        public CastOptions.Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                xY = xY | 1;
                return this;
            } else
            {
                xY = xY & -2;
                return this;
            }
        }

        private CastOptions.Builder(CastDevice castdevice, Listener listener)
        {
            fq.b(castdevice, "CastDevice parameter cannot be null");
            fq.b(listener, "CastListener parameter cannot be null");
            xW = castdevice;
            xX = listener;
            xY = 0;
        }

    }

    public static abstract class Listener
    {

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

        public void c(int i, String s)
        {
            a(d(new Status(i, s, null)));
        }

        public void x(int i)
        {
            a(d(new Status(i)));
        }

        public a()
        {
            super(Cast.wx);
        }
    }

    private static abstract class b extends a
    {

        public Result d(Status status)
        {
            return f(status);
        }

        public Status f(Status status)
        {
            return status;
        }

        private b()
        {
        }

    }

    private static abstract class c extends a
    {

        public Result d(Status status)
        {
            return h(status);
        }

        public ApplicationConnectionResult h(Status status)
        {
            return new ApplicationConnectionResult(this, status) {

                final Status wz;
                final c xZ;

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
                    return wz;
                }

                public boolean getWasLaunched()
                {
                    return false;
                }

            
            {
                xZ = c1;
                wz = status;
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
    static final com.google.android.gms.common.api.Api.c wx;
    private static final com.google.android.gms.common.api.Api.b wy;

    private Cast()
    {
    }

    static 
    {
        wx = new com.google.android.gms.common.api.Api.c();
        wy = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, fc fc, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, fc, (CastOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public en a(Context context, Looper looper, fc fc, CastOptions castoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                fq.b(castoptions, "Setting the API options is required.");
                return new en(context, looper, castoptions.xT, CastOptions.a(castoptions), castoptions.xU, connectioncallbacks, onconnectionfailedlistener);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(wy, wx, new Scope[0]);
    }
}
