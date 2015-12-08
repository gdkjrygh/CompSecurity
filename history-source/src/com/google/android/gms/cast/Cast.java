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
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
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
            return ((im)googleapiclient.a(Cast.DQ)).getApplicationMetadata();
        }

        public String getApplicationStatus(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((im)googleapiclient.a(Cast.DQ)).getApplicationStatus();
        }

        public double getVolume(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((im)googleapiclient.a(Cast.DQ)).fZ();
        }

        public boolean isMute(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((im)googleapiclient.a(Cast.DQ)).isMute();
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.b(new c(this, googleapiclient) {

                final CastApi.a Fv;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.b(null, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                super(googleapiclient);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, googleapiclient, s) {

                final CastApi.a Fv;
                final String Fw;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.b(Fw, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                Fw = s;
                super(googleapiclient);
            }
            });
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.b(new c(this, googleapiclient, s, s1) {

                final CastApi.a Fv;
                final String Fw;
                final String Fy;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.b(Fw, Fy, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                Fw = s;
                Fy = s1;
                super(googleapiclient);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new c(this, googleapiclient, s) {

                final CastApi.a Fv;
                final String Fw;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.a(Fw, false, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                Fw = s;
                super(googleapiclient);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
        {
            return googleapiclient.b(new c(this, googleapiclient, s, launchoptions) {

                final CastApi.a Fv;
                final String Fw;
                final LaunchOptions Fx;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.a(Fw, Fx, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                Fw = s;
                Fx = launchoptions;
                super(googleapiclient);
            }
            });
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
        {
            return launchApplication(googleapiclient, s, (new LaunchOptions.Builder()).setRelaunchIfRunning(flag).build());
        }

        public PendingResult leaveApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.b(new b(this, googleapiclient) {

                final CastApi.a Fv;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.d(this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                super(googleapiclient);
            }
            });
        }

        public void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
            throws IOException, IllegalArgumentException
        {
            try
            {
                ((im)googleapiclient.a(Cast.DQ)).aE(s);
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
                ((im)googleapiclient.a(Cast.DQ)).fY();
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
            return googleapiclient.b(new b(this, googleapiclient, s, s1) {

                final String Ft;
                final String Fu;
                final CastApi.a Fv;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.a(Ft, Fu, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                Ft = s;
                Fu = s1;
                super(googleapiclient);
            }
            });
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException
        {
            try
            {
                ((im)googleapiclient.a(Cast.DQ)).a(s, messagereceivedcallback);
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
                ((im)googleapiclient.a(Cast.DQ)).I(flag);
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
                ((im)googleapiclient.a(Cast.DQ)).a(d);
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
            return googleapiclient.b(new b(this, googleapiclient) {

                final CastApi.a Fv;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    try
                    {
                        im1.a("", this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                super(googleapiclient);
            }
            });
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.b(new b(this, googleapiclient, s) {

                final CastApi.a Fv;
                final String Fy;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((im)a1);
                }

                protected void a(im im1)
                    throws RemoteException
                {
                    if (TextUtils.isEmpty(Fy))
                    {
                        e(2001, "IllegalArgument: sessionId cannot be null or empty");
                        return;
                    }
                    try
                    {
                        im1.a(Fy, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (im im1)
                    {
                        W(2001);
                    }
                }

            
            {
                Fv = a1;
                Fy = s;
                super(googleapiclient);
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

        final Listener FA;
        private final int FB;
        final CastDevice Fz;

        static int a(CastOptions castoptions)
        {
            return castoptions.FB;
        }

        public static Builder builder(CastDevice castdevice, Listener listener)
        {
            return new Builder(castdevice, listener);
        }

        private CastOptions(Builder builder1)
        {
            Fz = builder1.FC;
            FA = builder1.FD;
            FB = Builder.a(builder1);
        }

    }

    public static final class CastOptions.Builder
    {

        CastDevice FC;
        Listener FD;
        private int FE;

        static int a(CastOptions.Builder builder)
        {
            return builder.FE;
        }

        public CastOptions build()
        {
            return new CastOptions(this);
        }

        public CastOptions.Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                FE = FE | 1;
                return this;
            } else
            {
                FE = FE & -2;
                return this;
            }
        }

        private CastOptions.Builder(CastDevice castdevice, Listener listener)
        {
            jx.b(castdevice, "CastDevice parameter cannot be null");
            jx.b(listener, "CastListener parameter cannot be null");
            FC = castdevice;
            FD = listener;
            FE = 0;
        }

    }

    public static class Listener
    {

        public void X(int i)
        {
        }

        public void Y(int i)
        {
        }

        public void onApplicationDisconnected(int i)
        {
        }

        public void onApplicationMetadataChanged(ApplicationMetadata applicationmetadata)
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

        public void W(int i)
        {
            b(c(new Status(i)));
        }

        public void e(int i, String s)
        {
            b(c(new Status(i, s, null)));
        }

        public a(GoogleApiClient googleapiclient)
        {
            super(Cast.DQ, googleapiclient);
        }
    }

    private static abstract class b extends a
    {

        public Status b(Status status)
        {
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        b(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class c extends a
    {

        public Result c(Status status)
        {
            return i(status);
        }

        public ApplicationConnectionResult i(Status status)
        {
            return new ApplicationConnectionResult(this, status) {

                final Status DS;
                final c FF;

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
                    return DS;
                }

                public boolean getWasLaunched()
                {
                    return false;
                }

            
            {
                FF = c1;
                DS = status;
                super();
            }
            };
        }

        public c(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public static final Api API;
    public static final CastApi CastApi = new CastApi.a();
    static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 0x10000;
    public static final int MAX_NAMESPACE_LENGTH = 128;

    private Cast()
    {
    }

    static 
    {
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, jg, (CastOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public im a(Context context, Looper looper, jg jg, CastOptions castoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                jx.b(castoptions, "Setting the API options is required.");
                return new im(context, looper, castoptions.Fz, CastOptions.a(castoptions), castoptions.FA, connectioncallbacks, onconnectionfailedlistener);
            }

            public int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api(DR, DQ, new Scope[0]);
    }
}
