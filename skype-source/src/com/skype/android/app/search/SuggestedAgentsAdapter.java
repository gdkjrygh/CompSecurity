// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.text.BoldTypeFacedSpan;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.PathType;
import com.skype.android.widget.SkypeAvatarView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.search:
//            AgentInfo, AgentInfoImageSource

public class SuggestedAgentsAdapter extends DataAdapter
{
    private final class a extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        private final SkypeAvatarView avatarView;
        protected final BoldTypeFacedSpan boldfaced;
        protected final TextView firstLineView;
        private Future imageFuture;
        protected final TextView secondLineView;
        final SuggestedAgentsAdapter this$0;

        protected final void onSetData(AgentInfo agentinfo)
        {
            firstLineView.setText(agentinfo.getDisplayName());
            contactUtil.a(firstLineView, com.skype.Contact.TYPE.BOT);
            secondLineView.setText(agentinfo.getDescription());
            secondLineView.setVisibility(0);
            if (imageFuture != null)
            {
                imageFuture.cancel(true);
            }
            agentinfo = new AgentInfoImageSource(agentinfo, httpUtil);
            avatarView.setAlternativeShape(PathType.b);
            defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.d, com.skype.android.res.DefaultAvatars.AvatarSize.c, agentinfo.getIdentity());
            imageFuture = imageCache.a(agentinfo, avatarView, new AsyncCallback() {

                final a this$1;

                public final void done(AsyncResult asyncresult)
                {
                    SkypeAvatarView skypeavatarview = (SkypeAvatarView)asyncresult.b();
                    asyncresult = (Bitmap)asyncresult.a();
                    if (asyncresult != null)
                    {
                        skypeavatarview.setImageBitmap(asyncresult);
                    }
                }

            
            {
                this$1 = a.this;
                super();
            }
            });
        }

        protected final volatile void onSetData(Object obj)
        {
            onSetData((AgentInfo)obj);
        }

        public a(View view)
        {
            this$0 = SuggestedAgentsAdapter.this;
            super(view);
            firstLineView = (TextView)ViewUtil.a(view, 0x7f10031a);
            secondLineView = (TextView)ViewUtil.a(view, 0x7f10031b);
            avatarView = (SkypeAvatarView)ViewUtil.a(view, 0x7f10030c);
            boldfaced = new BoldTypeFacedSpan(typeFaceFactory);
        }
    }


    private final ContactUtil contactUtil;
    private final DefaultAvatars defaultAvatars;
    private final HttpUtil httpUtil;
    private final ImageCache imageCache;
    private final TypeFaceFactory typeFaceFactory;

    public SuggestedAgentsAdapter(final Activity activity, ImageCache imagecache, ContactUtil contactutil, DefaultAvatars defaultavatars, TypeFaceFactory typefacefactory, HttpUtil httputil)
    {
        imageCache = imagecache;
        contactUtil = contactutil;
        defaultAvatars = defaultavatars;
        typeFaceFactory = typefacefactory;
        httpUtil = httputil;
        setItemViewAdapter(0, new com.skype.android.app.data.DataAdapter.ItemViewAdapter() {

            final SuggestedAgentsAdapter this$0;
            final Activity val$activity;

            protected final int getItemId(AgentInfo agentinfo)
            {
                return agentinfo.hashCode();
            }

            protected final volatile int getItemId(Object obj)
            {
                return getItemId((AgentInfo)obj);
            }

            protected final View onCreateView(ViewGroup viewgroup)
            {
                return LayoutInflater.from(activity).inflate(0x7f030063, viewgroup, false);
            }

            protected final com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
            {
                return new a(view);
            }

            
            {
                this$0 = SuggestedAgentsAdapter.this;
                activity = activity1;
                super();
            }
        });
    }





}
