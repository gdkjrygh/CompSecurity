// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.analytics.LogEvent;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ImageCache;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.drawable.RoundDrawable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInFlow, AccountsList, AccountInfo

public class UnifiedSignInPickAccountFragment extends SkypeFragment
{
    private static final class a extends android.support.v7.widget.RecyclerView.a
        implements AsyncCallback
    {

        private final List accounts;
        private final Analytics analytics;
        private final AnalyticsPersistentStorage analyticsPersistentStorage;
        private final RoundDrawable defaultAvatarImage;
        private final ImageCache imageCache;
        private final SignInDurationReporter signInDurationReporter;
        private final UnifiedSignInFlow unifiedSignInFlow;

        public final void done(AsyncResult asyncresult)
        {
            if (!asyncresult.d())
            {
                ImageView imageview = (ImageView)asyncresult.b();
                asyncresult = (Bitmap)asyncresult.a();
                if (asyncresult != null)
                {
                    imageview.setImageDrawable(new RoundDrawable(asyncresult));
                }
            }
        }

        public final int getItemCount()
        {
            return accounts.size();
        }

        public final volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.v v, int i)
        {
            onBindViewHolder((a)v, i);
        }

        public final void onBindViewHolder(a a1, int i)
        {
            AccountInfo accountinfo = (AccountInfo)accounts.get(i);
            a1.itemView.setOnClickListener(a1. new android.view.View.OnClickListener() {

                final a this$0;
                final a.a val$holder;

                public final void onClick(View view)
                {
                    unifiedSignInFlow.selectAccount(holder.getLayoutPosition());
                    analytics.a(LogEvent.C);
                    signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.b, String.valueOf(SignInConstants.ScreenName.UNIFIED_ACCOUNT_PICKER_SCREEN));
                }

            
            {
                this$0 = final_a1;
                holder = a.a.this;
                super();
            }
            });
            if (a1.future != null)
            {
                a1.future.cancel(true);
            }
            a1.accountName.setText(accountinfo.getUsername());
            a1.accountType.setText(accountinfo.getType().getAccountDescriptionResourceId());
            a1.avatar.setImageDrawable(defaultAvatarImage);
            if (accountinfo.getAvatarUrl() != null)
            {
                a1.future = imageCache.a(accountinfo.getAvatarUrl(), a1.avatar, this);
            }
        }

        public final volatile android.support.v7.widget.RecyclerView.v onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public final a onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return new a(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030126, viewgroup, false));
        }




        private a(List list, RoundDrawable rounddrawable, ImageCache imagecache, UnifiedSignInFlow unifiedsigninflow, Analytics analytics1, SignInDurationReporter signindurationreporter, AnalyticsPersistentStorage analyticspersistentstorage)
        {
            accounts = list;
            defaultAvatarImage = rounddrawable;
            imageCache = imagecache;
            unifiedSignInFlow = unifiedsigninflow;
            analytics = analytics1;
            signInDurationReporter = signindurationreporter;
            analyticsPersistentStorage = analyticspersistentstorage;
        }

    }

    static final class a.a extends android.support.v7.widget.RecyclerView.v
    {

        private TextView accountName;
        private TextView accountType;
        private ImageView avatar;
        private Future future;



/*
        static Future access$502(a.a a1, Future future1)
        {
            a1.future = future1;
            return future1;
        }

*/




        private a.a(View view)
        {
            super(view);
            accountName = (TextView)view.findViewById(0x7f100571);
            accountType = (TextView)view.findViewById(0x7f100572);
            avatar = (ImageView)view.findViewById(0x7f100570);
        }

    }


    AccessibilityUtil accessibilityUtil;
    RecyclerView accountsListView;
    Analytics analytics;
    AnalyticsPersistentStorage analyticsPersistentStorage;
    SymbolView backButton;
    ImageCache imageCache;
    View rootView;
    SignInDurationReporter signInDurationReporter;

    public UnifiedSignInPickAccountFragment()
    {
    }

    private UnifiedSignInFlow getUnifiedSignInFlow()
    {
        return (UnifiedSignInFlow)getActivity();
    }

    private void initRecyclerView()
    {
        accountsListView.setLayoutManager(new LinearLayoutManager(getActivity()));
        accountsListView.setHasFixedSize(true);
        Object obj = getUnifiedSignInFlow().getAccountsList();
        RoundDrawable rounddrawable;
        if (obj != null)
        {
            obj = ((AccountsList) (obj)).getAccounts();
        } else
        {
            obj = new ArrayList();
        }
        rounddrawable = new RoundDrawable(BitmapFactory.decodeResource(getResources(), 0x7f020064));
        accountsListView.setAdapter(new a(((List) (obj)), rounddrawable, imageCache, getUnifiedSignInFlow(), analytics, signInDurationReporter, analyticsPersistentStorage));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030125, viewgroup, false);
    }

    public void onResume()
    {
        super.onResume();
        AccessibilityUtil.b(rootView, getString(0x7f0800c9));
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.k, String.valueOf(SignInConstants.AccountType.SKYPE), false, String.valueOf(SignInConstants.ScreenName.UNIFIED_ACCOUNT_PICKER_SCREEN));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        initRecyclerView();
        backButton.setOnClickListener(new android.view.View.OnClickListener() {

            final UnifiedSignInPickAccountFragment this$0;

            public final void onClick(View view1)
            {
                getActivity().getSupportFragmentManager().c();
            }

            
            {
                this$0 = UnifiedSignInPickAccountFragment.this;
                super();
            }
        });
    }
}
