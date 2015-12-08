// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;
import com.google.android.gms.people.model.Owner;
import com.google.android.gms.people.model.OwnerBuffer;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import java.util.Iterator;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.account:
//            AccountChanger

public class UserSwitcherFilter extends ActivityFilter
{
    final class OwnersLoadedListener
        implements ResultCallback
    {

        final UserSwitcherFilter this$0;

        private void onResult(com.google.android.gms.people.Graph.LoadOwnersResult loadownersresult)
        {
            if (!loadownersresult.getStatus().isSuccess())
            {
                String s = UserSwitcherFilter.TAG;
                loadownersresult = String.valueOf(loadownersresult.getStatus().getStatusMessage());
                if (loadownersresult.length() != 0)
                {
                    loadownersresult = "Loading owners failed: ".concat(loadownersresult);
                } else
                {
                    loadownersresult = new String("Loading owners failed: ");
                }
                WLog.e(s, loadownersresult);
            } else
            {
                loadownersresult = loadownersresult.getOwners();
                HashFunction hashfunction = Hashing.sha1();
                if (!hashfunction.hashUnencodedChars(((Account)account.get()).name).toString().equals(gaiaHash))
                {
                    Object obj = null;
                    Iterator iterator = loadownersresult.iterator();
                    do
                    {
                        loadownersresult = obj;
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        loadownersresult = (Owner)iterator.next();
                    } while (!hashfunction.hashUnencodedChars(loadownersresult.getAccountName()).toString().equals(gaiaHash));
                    if (loadownersresult != null)
                    {
                        ((AccountChanger)accountChangeHelper.get()).changeAccount(loadownersresult.getAccountName(), destinationUri);
                        return;
                    }
                }
            }
        }

        public final volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.people.Graph.LoadOwnersResult)result);
        }

        OwnersLoadedListener()
        {
            this$0 = UserSwitcherFilter.this;
            super();
        }
    }

    final class PeopleClientConnectionCallbacks
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    {

        public OwnersLoadedListener ownersLoadedListener;
        final UserSwitcherFilter this$0;

        public final void onConnected(Bundle bundle)
        {
            if (peopleClient.isConnected())
            {
                bundle = (new com.google.android.gms.people.Graph.LoadOwnersOptions()).setIncludePlusPages(false);
                People.GraphApi.loadOwners(peopleClient, bundle).setResultCallback(ownersLoadedListener);
            }
        }

        public final void onConnectionSuspended(int i)
        {
        }

        private PeopleClientConnectionCallbacks()
        {
            this$0 = UserSwitcherFilter.this;
            super();
            ownersLoadedListener = new OwnersLoadedListener();
        }

    }


    private static final String TAG = com/google/android/apps/wallet/account/UserSwitcherFilter.getSimpleName();
    private final Provider account;
    private final Provider accountChangeHelper;
    private final Activity activity;
    private Uri destinationUri;
    private String gaiaHash;
    private final GoogleApiClient peopleClient;

    UserSwitcherFilter(Activity activity1, Provider provider, GoogleApiClient googleapiclient, Provider provider1)
    {
        activity = activity1;
        account = provider;
        peopleClient = googleapiclient;
        accountChangeHelper = provider1;
    }

    protected final Intent onCreate(Bundle bundle)
    {
        destinationUri = activity.getIntent().getData();
        if (destinationUri == null)
        {
            WLog.v(TAG, activity.getIntent().toString());
        } else
        {
            WLog.v(TAG, destinationUri.toString());
            gaiaHash = destinationUri.getQueryParameter("hgid");
            if (gaiaHash != null)
            {
                peopleClient.registerConnectionCallbacks(new PeopleClientConnectionCallbacks());
                return null;
            }
        }
        return null;
    }

    public final void onStart()
    {
        if (peopleClient != null && !peopleClient.isConnected() && !peopleClient.isConnecting() && GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity) == 0)
        {
            peopleClient.connect();
        }
    }







}
