// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.social;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.opensense.social:
//            AbstractSocialPlugin, ISocialPluginResponse, SocialPluginResponse

private class <init> extends <init>
{

    final AbstractSocialPlugin this$0;

    private boolean isCallerValid(int i)
    {
        return AbstractSocialPlugin.this.isCallerValid(i);
    }

    public void getDataSources(final ISocialPluginResponse response, final String features[])
        throws RemoteException
    {
        if (!isCallerValid(Binder.getCallingUid()))
        {
            throw new RemoteException("invalid caller");
        } else
        {
            (new Thread(new Runnable() {

                final AbstractSocialPlugin.Transport this$1;
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
                this$1 = AbstractSocialPlugin.Transport.this;
                response = isocialpluginresponse;
                features = as;
                super();
            }
            })).start();
            return;
        }
    }

    public void getSyncTypes(final ISocialPluginResponse response, final Account accounts[], final Bundle options)
        throws RemoteException
    {
        if (!isCallerValid(Binder.getCallingUid()))
        {
            throw new RemoteException("invalid caller");
        } else
        {
            (new Thread(new Runnable() {

                final AbstractSocialPlugin.Transport this$1;
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
                this$1 = AbstractSocialPlugin.Transport.this;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = bundle;
                super();
            }
            })).start();
            return;
        }
    }

    public void publishActivityStream(final ISocialPluginResponse response, final Account accounts[], final Bundle options)
        throws RemoteException
    {
        if (!isCallerValid(Binder.getCallingUid()))
        {
            throw new RemoteException("invalid caller");
        } else
        {
            (new Thread(new Runnable() {

                final AbstractSocialPlugin.Transport this$1;
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
                this$1 = AbstractSocialPlugin.Transport.this;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = bundle;
                super();
            }
            })).start();
            return;
        }
    }

    public void syncActivityStreams(final ISocialPluginResponse response, final Account accounts[], final Bundle options)
        throws RemoteException
    {
        if (!isCallerValid(Binder.getCallingUid()))
        {
            throw new RemoteException("invalid caller");
        } else
        {
            (new Thread(new Runnable() {

                final AbstractSocialPlugin.Transport this$1;
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
                this$1 = AbstractSocialPlugin.Transport.this;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = bundle;
                super();
            }
            })).start();
            return;
        }
    }

    public void syncContacts(final ISocialPluginResponse response, final Account accounts[], final Bundle options)
        throws RemoteException
    {
        if (!isCallerValid(Binder.getCallingUid()))
        {
            throw new RemoteException("invalid caller");
        } else
        {
            (new Thread(new Runnable() {

                final AbstractSocialPlugin.Transport this$1;
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
                this$1 = AbstractSocialPlugin.Transport.this;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = bundle;
                super();
            }
            })).start();
            return;
        }
    }

    public void syncSyncTypes(final ISocialPluginResponse response, final Account accounts[], final Bundle options)
        throws RemoteException
    {
        if (!isCallerValid(Binder.getCallingUid()))
        {
            throw new RemoteException("invalid caller");
        } else
        {
            (new Thread(new Runnable() {

                final AbstractSocialPlugin.Transport this$1;
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
                this$1 = AbstractSocialPlugin.Transport.this;
                response = isocialpluginresponse;
                accounts = aaccount;
                options = bundle;
                super();
            }
            })).start();
            return;
        }
    }

    private _cls6.val.options()
    {
        this$0 = AbstractSocialPlugin.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
