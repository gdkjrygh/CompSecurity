// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import a.a;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.android.view.EmptyView;
import com.soundcloud.java.strings.Strings;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileEmptyViewHelper

class UserDetailsView
{
    static interface UserDetailsListener
    {

        public abstract void onViewUri(Uri uri);
    }


    private static final String DISCOGS_PATH = "http://www.discogs.com/artist/%s";
    private static final String MYSPACE_PATH = "http://www.myspace.com/%s";
    TextView descriptionText;
    TextView discogsText;
    EmptyView emptyView;
    private UserDetailsListener listener;
    TextView myspaceText;
    ProfileEmptyViewHelper profileEmptyViewHelper;
    private Urn userUrn;
    TextView websiteText;

    public UserDetailsView()
    {
    }

    public void clearViews()
    {
        a.a(this);
    }

    void hideDescription()
    {
        descriptionText.setVisibility(8);
    }

    void hideDiscogs()
    {
        discogsText.setVisibility(8);
    }

    void hideEmptyView()
    {
        if (emptyView != null)
        {
            emptyView.setVisibility(8);
        }
    }

    void hideMyspace()
    {
        myspaceText.setVisibility(8);
    }

    void hideWebsite()
    {
        websiteText.setVisibility(8);
    }

    public void setListener(UserDetailsListener userdetailslistener)
    {
        listener = userdetailslistener;
    }

    public void setUrn(Urn urn)
    {
        userUrn = urn;
    }

    public void setView(View view)
    {
        a.a(this, view);
    }

    void showDescription(String s)
    {
        descriptionText.setVisibility(0);
        descriptionText.setText(ScTextUtils.fromHtml(s));
        descriptionText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    void showDiscogs(final String discogsName)
    {
        discogsText.setMovementMethod(LinkMovementMethod.getInstance());
        discogsText.setVisibility(0);
        discogsText.setOnClickListener(new _cls2());
    }

    void showEmptyView(com.soundcloud.android.view.EmptyView.Status status)
    {
        if (emptyView != null)
        {
            profileEmptyViewHelper.configureBuilderForUserDetails(emptyView, userUrn);
            emptyView.setStatus(status);
            emptyView.setVisibility(0);
        }
    }

    void showMyspace(final String myspaceName)
    {
        myspaceText.setMovementMethod(LinkMovementMethod.getInstance());
        myspaceText.setVisibility(0);
        myspaceText.setOnClickListener(new _cls3());
    }

    void showWebsite(final String websiteUrl, String s)
    {
        TextView textview = websiteText;
        String s1 = s;
        if (Strings.isBlank(s))
        {
            s1 = websiteUrl;
        }
        textview.setText(s1);
        websiteText.setVisibility(0);
        websiteText.setOnClickListener(new _cls1());
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final UserDetailsView this$0;
        final String val$discogsName;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onViewUri(Uri.parse(String.format(Locale.US, "http://www.discogs.com/artist/%s", new Object[] {
                    discogsName
                })));
            }
        }

        _cls2()
        {
            this$0 = UserDetailsView.this;
            discogsName = s;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final UserDetailsView this$0;
        final String val$myspaceName;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onViewUri(Uri.parse(String.format(Locale.US, "http://www.myspace.com/%s", new Object[] {
                    myspaceName
                })));
            }
        }

        _cls3()
        {
            this$0 = UserDetailsView.this;
            myspaceName = s;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserDetailsView this$0;
        final String val$websiteUrl;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onViewUri(Uri.parse(websiteUrl));
            }
        }

        _cls1()
        {
            this$0 = UserDetailsView.this;
            websiteUrl = s;
            super();
        }
    }

}
