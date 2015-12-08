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
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.ij;
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
            return googleapiclient.b(new c(this) {

                final CastApi.a EG;

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
                EG = a1;
                super();
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, s) {

                final CastApi.a EG;
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
                EG = a1;
                EH = s;
                super();
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.b(new c(this, s, s1) {

                final CastApi.a EG;
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
                EG = a1;
                EH = s;
                EJ = s1;
                super();
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, s) {

                final CastApi.a EG;
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
                EG = a1;
                EH = s;
                super();
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
        {
            return googleapiclient.b(new c(this, s, launchoptions) {

                final CastApi.a EG;
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
                EG = a1;
                EH = s;
                EI = launchoptions;
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

                final CastApi.a EG;

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
                EG = a1;
                super();
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
            return googleapiclient.b(new b(this, s, s1) {

                final String EE;
                final String EF;
                final CastApi.a EG;

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
                EG = a1;
                EE = s;
                EF = s1;
                super();
            }
            });
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException
        {
            try
            {
                ((ij)googleapiclient.a(Cast.CU)).a(s, messagereceivedcallback);
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
            return googleapiclient.b(new b(this) {

                final CastApi.a EG;

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
                EG = a1;
                super();
            }
            });
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new b(this, s) {

                final CastApi.a EG;
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
                EG = a1;
                EJ = s;
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

        final CastDevice EK;
        final Listener EL;
        private final int EM;

        static int a(CastOptions castoptions)
        {
            return castoptions.EM;
        }

        public static Builder builder(CastDevice castdevice, Listener listener)
        {
            return new Builder(castdevice, listener);
        }

        private CastOptions(Builder builder1)
        {
            EK = builder1.EN;
            EL = builder1.EO;
            EM = Builder.a(builder1);
        }

    }

    public static final class CastOptions.Builder
    {

        CastDevice EN;
        Listener EO;
        private int EP;

        static int a(CastOptions.Builder builder)
        {
            return builder.EP;
        }

        public CastOptions build()
        {
            return new CastOptions(this);
        }

        public CastOptions.Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                EP = EP | 1;
                return this;
            } else
            {
                EP = EP & -2;
                return this;
            }
        }

        private CastOptions.Builder(CastDevice castdevice, Listener listener)
        {
            o.b(castdevice, "CastDevice parameter cannot be null");
            o.b(listener, "CastListener parameter cannot be null");
            EN = castdevice;
            EO = listener;
            EP = 0;
        }

    }

    public static class Listener
    {

        public void W(int i)
        {
        }

        public void X(int i)
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

    protected static abstract class a extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public void V(int i)
        {
            b(c(new Status(i)));
        }

        public void e(int i, String s)
        {
            b(c(new Status(i, s, null)));
        }

        public a()
        {
            super(Cast.CU);
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

                final Status CW;
                final c EQ;

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
                    return CW;
                }

                public boolean getWasLaunched()
                {
                    return false;
                }

            
            {
                EQ = c1;
                CW = status;
                super();
            }
            };
        }

        private c()
        {
        }

    }


    public static final Api API;
    static final com.google.android.gms.common.api.Api.c CU;
    private static final com.google.android.gms.common.api.Api.b CV;
    public static final CastApi CastApi = new CastApi.a();
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 0x10000;
    public static final int MAX_NAMESPACE_LENGTH = 128;

    private Cast()
    {
    }

    static 
    {
        CU = new com.google.android.gms.common.api.Api.c();
        CV = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, clientsettings, (CastOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public ij a(Context context, Looper looper, ClientSettings clientsettings, CastOptions castoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                o.b(castoptions, "Setting the API options is required.");
                return new ij(context, looper, castoptions.EK, CastOptions.a(castoptions), castoptions.EL, connectioncallbacks, onconnectionfailedlistener);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(CV, CU, new Scope[0]);
    }
}
