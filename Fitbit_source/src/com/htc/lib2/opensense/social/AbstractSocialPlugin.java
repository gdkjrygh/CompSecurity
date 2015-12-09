// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.social;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.htc.lib2.opensense.social:
//            SocialPluginResponse, ISocialPluginResponse

public abstract class AbstractSocialPlugin
{
    private class Transport extends ISocialPlugin.Stub
    {

        final AbstractSocialPlugin this$0;

        private boolean isCallerValid(int i)
        {
            return AbstractSocialPlugin.this.isCallerValid(i);
        }

        public void getDataSources(final ISocialPluginResponse response, String as[])
            throws RemoteException
        {
            if (!isCallerValid(Binder.getCallingUid()))
            {
                throw new RemoteException("invalid caller");
            } else
            {
                (new Thread(as. new Runnable() {

                    final Transport this$1;
                    final String val$features[];
                    final ISocialPluginResponse val$response;

                    public void run()
                    {
                        Bundle bundle;
                        bundle = getDataSources(new SocialPluginResponse(response), features);
                        if (bundle == null)
                        {
                            break MISSING_BLOCK_LABEL_40;
                        }
                        response.onResult(bundle);
                        return;
                        RemoteException remoteexception;
                        remoteexception;
                        Bundle bundle1 = new Bundle();
                        try
                        {
                            response.onResult(bundle1);
                            return;
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                        return;
                    }

            
            {
                this$1 = final_transport;
                response = isocialpluginresponse;
                features = _5B_Ljava.lang.String_3B_.this;
                super();
            }
                })).start();
                return;
            }
        }

        public void getSyncTypes(final ISocialPluginResponse response, final Account accounts[], Bundle bundle)
            throws RemoteException
        {
            if (!isCallerValid(Binder.getCallingUid()))
            {
                throw new RemoteException("invalid caller");
            } else
            {
                (new Thread(bundle. new Runnable() {

                    final Transport this$1;
                    final Account val$accounts[];
                    final Bundle val$options;
                    final ISocialPluginResponse val$response;

                    public void run()
                    {
                        Bundle bundle;
                        bundle = getSyncTypes(new SocialPluginResponse(response), accounts, options);
                        if (bundle == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        response.onResult(bundle);
                        return;
                        RemoteException remoteexception;
                        remoteexception;
                        Bundle bundle1 = new Bundle();
                        try
                        {
                            response.onResult(bundle1);
                            return;
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                        return;
                    }

            
            {
                this$1 = final_transport;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = Bundle.this;
                super();
            }
                })).start();
                return;
            }
        }

        public void publishActivityStream(final ISocialPluginResponse response, final Account accounts[], Bundle bundle)
            throws RemoteException
        {
            if (!isCallerValid(Binder.getCallingUid()))
            {
                throw new RemoteException("invalid caller");
            } else
            {
                (new Thread(bundle. new Runnable() {

                    final Transport this$1;
                    final Account val$accounts[];
                    final Bundle val$options;
                    final ISocialPluginResponse val$response;

                    public void run()
                    {
                        Bundle bundle;
                        bundle = publishActivityStream(new SocialPluginResponse(response), accounts, options);
                        if (bundle == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        response.onResult(bundle);
                        return;
                        RemoteException remoteexception;
                        remoteexception;
                        Bundle bundle1 = new Bundle();
                        bundle1.putBoolean("booleanResult", false);
                        try
                        {
                            response.onResult(bundle1);
                            return;
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                        return;
                    }

            
            {
                this$1 = final_transport;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = Bundle.this;
                super();
            }
                })).start();
                return;
            }
        }

        public void syncActivityStreams(final ISocialPluginResponse response, final Account accounts[], Bundle bundle)
            throws RemoteException
        {
            if (!isCallerValid(Binder.getCallingUid()))
            {
                throw new RemoteException("invalid caller");
            } else
            {
                (new Thread(bundle. new Runnable() {

                    final Transport this$1;
                    final Account val$accounts[];
                    final Bundle val$options;
                    final ISocialPluginResponse val$response;

                    public void run()
                    {
                        Bundle bundle;
                        bundle = syncActivityStreams(new SocialPluginResponse(response), accounts, options);
                        if (bundle == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        response.onResult(bundle);
                        return;
                        RemoteException remoteexception;
                        remoteexception;
                        Bundle bundle1 = new Bundle();
                        bundle1.putBoolean("booleanResult", false);
                        try
                        {
                            response.onResult(bundle1);
                            return;
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                        return;
                    }

            
            {
                this$1 = final_transport;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = Bundle.this;
                super();
            }
                })).start();
                return;
            }
        }

        public void syncContacts(final ISocialPluginResponse response, final Account accounts[], Bundle bundle)
            throws RemoteException
        {
            if (!isCallerValid(Binder.getCallingUid()))
            {
                throw new RemoteException("invalid caller");
            } else
            {
                (new Thread(bundle. new Runnable() {

                    final Transport this$1;
                    final Account val$accounts[];
                    final Bundle val$options;
                    final ISocialPluginResponse val$response;

                    public void run()
                    {
                        Bundle bundle;
                        bundle = syncContacts(new SocialPluginResponse(response), accounts, options);
                        if (bundle == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        response.onResult(bundle);
                        return;
                        RemoteException remoteexception;
                        remoteexception;
                        Bundle bundle1 = new Bundle();
                        bundle1.putBoolean("booleanResult", false);
                        try
                        {
                            response.onResult(bundle1);
                            return;
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                        return;
                    }

            
            {
                this$1 = final_transport;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = Bundle.this;
                super();
            }
                })).start();
                return;
            }
        }

        public void syncSyncTypes(final ISocialPluginResponse response, final Account accounts[], Bundle bundle)
            throws RemoteException
        {
            if (!isCallerValid(Binder.getCallingUid()))
            {
                throw new RemoteException("invalid caller");
            } else
            {
                (new Thread(bundle. new Runnable() {

                    final Transport this$1;
                    final Account val$accounts[];
                    final Bundle val$options;
                    final ISocialPluginResponse val$response;

                    public void run()
                    {
                        Bundle bundle;
                        bundle = syncSyncTypes(new SocialPluginResponse(response), accounts, options);
                        if (bundle == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        response.onResult(bundle);
                        return;
                        RemoteException remoteexception;
                        remoteexception;
                        Bundle bundle1 = new Bundle();
                        try
                        {
                            response.onResult(bundle1);
                            return;
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                        return;
                    }

            
            {
                this$1 = final_transport;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = Bundle.this;
                super();
            }
                })).start();
                return;
            }
        }

        private Transport()
        {
            this$0 = AbstractSocialPlugin.this;
            super();
        }

    }


    private static final String LOG_TAG = com/htc/lib2/opensense/social/AbstractSocialPlugin.getSimpleName();
    private Transport mTransport;

    public AbstractSocialPlugin()
    {
        mTransport = new Transport();
    }

    public Bundle getDataSources(SocialPluginResponse socialpluginresponse, String as[])
    {
        Log.w(LOG_TAG, "Method not implemented by plugin subclass");
        return new Bundle();
    }

    public final IBinder getIBinder()
    {
        return mTransport.asBinder();
    }

    public Bundle getSyncTypes(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        Log.w(LOG_TAG, "Method not implemented by plugin subclass");
        return new Bundle();
    }

    protected boolean isCallerValid(int i)
    {
        return true;
    }

    public Bundle publishActivityStream(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        return new Bundle();
    }

    public abstract Bundle syncActivityStreams(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle);

    public Bundle syncContacts(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        Log.w(LOG_TAG, "Method not implemented by plugin subclass");
        return new Bundle();
    }

    public Bundle syncSyncTypes(SocialPluginResponse socialpluginresponse, Account aaccount[], Bundle bundle)
    {
        Log.w(LOG_TAG, "Method not implemented by plugin subclass");
        return new Bundle();
    }

}
