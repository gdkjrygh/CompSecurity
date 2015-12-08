// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.im;
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
            return googleapiclient.b(new Cast.c(this, googleapiclient) {

                final a Fv;

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
            return googleapiclient.b(new Cast.c(this, googleapiclient, s) {

                final a Fv;
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
            return googleapiclient.b(new Cast.c(this, googleapiclient, s, s1) {

                final a Fv;
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
            return googleapiclient.b(new Cast.c(this, googleapiclient, s) {

                final a Fv;
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
            return googleapiclient.b(new Cast.c(this, googleapiclient, s, launchoptions) {

                final a Fv;
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
            return googleapiclient.b(new Cast.b(this, googleapiclient) {

                final a Fv;

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
            return googleapiclient.b(new Cast.b(this, googleapiclient, s, s1) {

                final String Ft;
                final String Fu;
                final a Fv;

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

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, Cast.MessageReceivedCallback messagereceivedcallback)
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
            return googleapiclient.b(new Cast.b(this, googleapiclient) {

                final a Fv;

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
            return googleapiclient.b(new Cast.b(this, googleapiclient, s) {

                final a Fv;
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
