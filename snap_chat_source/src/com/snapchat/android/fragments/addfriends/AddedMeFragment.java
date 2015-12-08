// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Bt;
import CF;
import CG;
import LY;
import MI;
import Mf;
import NH;
import OC;
import OH;
import Pp;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.util.emoji.Emoji;
import com.squareup.otto.Bus;
import hX;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lX;
import ll;
import mQ;
import wN;
import wR;
import wW;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            SwipeableFriendsFragment, FriendListProperty

public class AddedMeFragment extends SwipeableFriendsFragment
{

    private final ProfileEventAnalytics j;
    private final Set k;
    private TextView l;
    private String m;

    public AddedMeFragment()
    {
        Bt.a();
        new lX();
        this(Pp.a(), FriendManager.e());
    }

    private AddedMeFragment(Pp pp, FriendManager friendmanager)
    {
        super(pp, friendmanager);
        k = new HashSet();
        j = ProfileEventAnalytics.a();
    }

    private int a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            for (int i = 0; i < this.i.size(); i++)
            {
                if (TextUtils.equals(((Friend)this.i.get(i)).g(), s))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public final int a()
    {
        return 13;
    }

    public final com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext c()
    {
        return com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADDED_ME_PAGE;
    }

    protected final void e()
    {
        boolean flag;
        if (!c.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b.f() && flag && Bt.a(b.q()))
        {
            (new mQ()).execute();
        }
    }

    public final CF k()
    {
        return new CF() {

            public final boolean a(CG.a a1)
            {
                return CG.h.contains(a1.c);
            }

            public final boolean b(CG.a a1)
            {
                return false;
            }

        };
    }

    protected final int l()
    {
        return 0x7f0400a5;
    }

    protected final wR n()
    {
        return new wW(true);
    }

    protected final void o()
    {
        if (b.f())
        {
            int i = b.a(Bt.m());
            synchronized (this.i)
            {
                this.i.clear();
                this.i.addAll(b.a(null, 200));
                this.i.addAll(k);
                FriendManager friendmanager = b;
                Collections.sort(this.i, new com.snapchat.android.model.FriendManager._cls2(friendmanager));
            }
            Timber.c("AddedMeFragment", (new StringBuilder("refreshFriendList - LastSeenAddedMeTimestamp: ")).append(Bt.m()).append(" Total # of FriendsWhoAddedMe: ").append(b.p().size()).append(" # of FriendsWhoAddedMe for display: ").append(this.i.size()).append(" # of NewFriendRequests (should be same with the one in Profile Page): ").append(i).toString(), new Object[0]);
        }
        if (c != null)
        {
            c.notifyDataSetChanged();
        }
        if (!b.f())
        {
            d.setVisibility(8);
            l.setVisibility(8);
            d(0x7f0d009a).setVisibility(0);
            return;
        }
        break MISSING_BLOCK_LABEL_225;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        if (this.i.isEmpty())
        {
            d.setVisibility(8);
            l.setVisibility(0);
            d(0x7f0d009a).setVisibility(8);
            return;
        } else
        {
            d.setVisibility(0);
            l.setVisibility(8);
            d(0x7f0d009a).setVisibility(8);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        l = (TextView)d(0x7f0d0369);
        viewgroup = getActivity().getString(0x7f080043);
        l.setText((new StringBuilder()).append(viewgroup).append(" ").append(LY.a(Emoji.DISAPPOINTED_FACE)).toString());
        m = getResources().getString(0x7f080355);
        o();
        viewgroup = getArguments();
        if (viewgroup != null)
        {
            int i = a(viewgroup.getString("ADD_ME_FRAGMENT_SELECTED_FRIEND_USERNAME"));
            if (i >= 0)
            {
                c.a(i);
                d.post(new Runnable(i) {

                    private int a;
                    private AddedMeFragment b;

                    public final void run()
                    {
                        b.d.setSelection(a);
                    }

            
            {
                b = AddedMeFragment.this;
                a = i;
                super();
            }
                });
            }
        }
        ll.f();
        return layoutinflater;
    }

    public void onFriendsProfileImageLoadedEvent(MI mi)
    {
        if (mi == null || TextUtils.isEmpty(mi.mFriendUsername))
        {
            Timber.e("AddedMeFragment", "friends profile images - invalid FriendProfileImagesLoadedEvent posted!", new Object[0]);
        } else
        {
            if (mi.mSize != com.snapchat.android.util.profileimages.ProfileImageUtils.ProfileImageSize.THUMBNAIL || !mi.mHasImages)
            {
                Timber.c("AddedMeFragment", (new StringBuilder("friends profile images - ignore event on Added Me with size: ")).append(mi.mSize.toString()).append(" hasImages: ").append(mi.mHasImages).toString(), new Object[0]);
                return;
            }
            Timber.c("AddedMeFragment", (new StringBuilder("friends profile images - start processing FriendProfileImagesLoadedEvent for friend: ")).append(mi.mFriendUsername).toString(), new Object[0]);
            int i = 0;
            while (i <= d.getChildCount()) 
            {
                View view = d.getWrappedView(i);
                if (view != null)
                {
                    Object obj = (ViewGroup)view.findViewWithTag(mi.mFriendUsername);
                    if (obj != null)
                    {
                        ImageView imageview = (ImageView)((ViewGroup) (obj)).findViewById(0x7f0d006b);
                        ImageView imageview1 = (ImageView)((ViewGroup) (obj)).findViewById(0x7f0d006c);
                        obj = (ImageView)((ViewGroup) (obj)).findViewById(0x7f0d006a);
                        Object obj1 = a.a(mi.mFriendUsername, com.snapchat.android.util.profileimages.ProfileImageUtils.ProfileImageSize.THUMBNAIL);
                        AnimationDrawable animationdrawable = new AnimationDrawable();
                        Bitmap bitmap;
                        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); animationdrawable.addFrame(new BitmapDrawable(getResources(), bitmap), 200))
                        {
                            bitmap = (Bitmap)((Iterator) (obj1)).next();
                        }

                        animationdrawable.setOneShot(false);
                        imageview.setBackgroundDrawable(animationdrawable);
                        imageview.setContentDescription(m);
                        animationdrawable.start();
                        imageview.setVisibility(0);
                        imageview1.setVisibility(0);
                        ((ImageView) (obj)).setVisibility(4);
                        Timber.c("AddedMeFragment", (new StringBuilder("friends profile images - FriendProfileImagesLoadedEvent's been processed for friend:")).append(mi.mFriendUsername).toString(), new Object[0]);
                        return;
                    }
                }
                i++;
            }
        }
    }

    public void onRefreshOnFriendActionEvent(NH nh)
    {
        Friend friend = nh.mFriend;
        if (friend != null && nh.mAction == FriendAction.DELETE)
        {
            k.add(friend);
        }
        super.a(nh);
    }

    public void onUserLoadedEvent(OH oh)
    {
        if (oh != null && oh.user != null)
        {
            Timber.c("AddedMeFragment", "Update snaps because this fragment has not updated snaps since it became visible.", new Object[0]);
            (new mQ()).execute();
        }
        o();
    }

    protected void onVisible()
    {
        ll.e();
        super.onVisible();
        Mf.a().a(new OC(com.snapchat.android.util.TitleBarManager.Visibility.VISIBLE));
        if (b.f())
        {
            (new mQ()).execute();
        } else
        {
            Timber.c("AddedMeFragment", "User is not loaded yet. Need to update snaps when the user is loaded.", new Object[0]);
        }
        j.a(com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext.PROFILE_ADDED_ME_PAGE);
        ll.f();
    }

    protected final FriendListProperty p()
    {
        FriendListProperty friendlistproperty = (new FriendListProperty(FriendListProperty.TouchMode.SWIPEABLE, FriendListProperty.Style.OPAQUE_CHECKBOX)).a(true);
        friendlistproperty.l = true;
        friendlistproperty.m = true;
        return friendlistproperty;
    }

    protected final void q()
    {
        Object obj = this.i;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = this.i.iterator();
        int i = 0;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (((Friend)iterator.next()).mAddSourceType != com.snapchat.android.model.Friend.AddSourceType.ADDED_BY_ADDED_ME_BACK)
        {
            i++;
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        obj = j;
        int i1 = this.i.size();
        int j1 = c.a(FriendAction.ADD, false);
        int k1 = c.a(FriendAction.BLOCK, false);
        int l1 = c.a(FriendAction.IGNORE, false);
        int i2 = c.a(FriendAction.SET_DISPLAY_NAME, false);
        hX hx = new hX();
        hx.totalRequestCount = Long.valueOf(i1);
        hx.newRequestCount = Long.valueOf(i);
        hx.requestAcceptCount = Long.valueOf(j1);
        hx.requestBlockCount = Long.valueOf(k1);
        hx.requestIgnoreCount = Long.valueOf(l1);
        hx.requestNameEditCount = Long.valueOf(i2);
        ((ProfileEventAnalytics) (obj)).mBlizzardEventLogger.a(hx);
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
