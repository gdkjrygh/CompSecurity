// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.LoadingAndErrorWrapper;
import com.netflix.mediaclient.servicemgr.GenreList;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.gfx.AnimationUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            HomeActivity

public class SlidingMenuAdapter
    implements ManagerStatusListener
{
    private class FetchGenresCallback extends LoggingManagerCallback
    {

        final SlidingMenuAdapter this$0;

        public void onGenreListsFetched(List list1, int i)
        {
            super.onGenreListsFetched(list1, i);
            if (i != 0)
            {
                Log.w("SlidingMenuAdapter", "Invalid status code");
                showErrorView();
                return;
            }
            if (list1 == null)
            {
                Log.v("SlidingMenuAdapter", "No details in response");
                showErrorView();
                return;
            } else
            {
                updateGenres(list1);
                return;
            }
        }

        public FetchGenresCallback()
        {
            this$0 = SlidingMenuAdapter.this;
            super("SlidingMenuAdapter");
        }
    }

    private class GenresListAdapter extends BaseAdapter
    {

        private final List genres;
        final SlidingMenuAdapter this$0;

        public int getCount()
        {
            return genres.size();
        }

        public GenreList getItem(int i)
        {
            return (GenreList)genres.get(i);
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = activity.getLayoutInflater().inflate(0x7f030031, null);
                viewgroup.setTag(new Holder((TextView)viewgroup.findViewById(0x7f0700c1)));
            }
            view = (Holder)viewgroup.getTag();
            updateAdapterViews(view, getItem(i));
            return viewgroup;
        }

        public GenresListAdapter(List list1)
        {
            this$0 = SlidingMenuAdapter.this;
            super();
            genres = list1;
        }
    }

    protected static class Holder
    {

        public final TextView tv;

        public Holder(TextView textview)
        {
            tv = textview;
        }
    }


    private static final String TAG = "SlidingMenuAdapter";
    protected final NetflixActivity activity;
    private GenresListAdapter adapter;
    protected final View content;
    private final DrawerLayout drawerLayout;
    private final com.netflix.mediaclient.android.widget.ErrorWrapper.Callback errorCallback = new com.netflix.mediaclient.android.widget.ErrorWrapper.Callback() {

        final SlidingMenuAdapter this$0;

        public void onRetryRequested()
        {
            refresh();
        }

            
            {
                this$0 = SlidingMenuAdapter.this;
                super();
            }
    };
    protected final TextView home;
    private final LoadingAndErrorWrapper leWrapper;
    private final ListView list;
    private ServiceManager manager;
    private final android.view.View.OnClickListener onHomeClickListener = new android.view.View.OnClickListener() {

        final SlidingMenuAdapter this$0;

        public void onClick(View view)
        {
            view = HomeActivity.createStartIntent(activity);
            view.addFlags(0x4000000);
            activity.startActivity(view);
            drawerLayout.closeDrawers();
        }

            
            {
                this$0 = SlidingMenuAdapter.this;
                super();
            }
    };
    private final android.widget.AdapterView.OnItemClickListener onRowClickListener = new android.widget.AdapterView.OnItemClickListener() {

        final SlidingMenuAdapter this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            int j = list.getHeaderViewsCount();
            HomeActivity.showGenreList(activity, adapter.getItem(i - j));
            drawerLayout.closeDrawers();
        }

            
            {
                this$0 = SlidingMenuAdapter.this;
                super();
            }
    };
    private final android.view.View.OnClickListener onSwitchProfileClickListener = new android.view.View.OnClickListener() {

        final SlidingMenuAdapter this$0;

        public void onClick(View view)
        {
            activity.startActivity(ProfileSelectionActivity.createStartIntent(activity));
        }

            
            {
                this$0 = SlidingMenuAdapter.this;
                super();
            }
    };
    private final AdvancedImageView profileImg;
    private final TextView profileName;
    protected final View profilesGroup;
    private final ImageView switchProfilesIcon;

    public SlidingMenuAdapter(NetflixActivity netflixactivity, DrawerLayout drawerlayout)
    {
        activity = netflixactivity;
        content = drawerlayout.findViewById(0x7f0700ba);
        content.setPadding(content.getPaddingLeft(), netflixactivity.getActionBarHeight(), content.getPaddingRight(), content.getPaddingBottom());
        content.setOnClickListener(null);
        leWrapper = new LoadingAndErrorWrapper(content, errorCallback);
        profilesGroup = content.findViewById(0x7f0700bb);
        profilesGroup.setOnClickListener(onSwitchProfileClickListener);
        switchProfilesIcon = (ImageView)profilesGroup.findViewById(0x7f0700bc);
        profileName = (TextView)content.findViewById(0x7f0700be);
        profileImg = (AdvancedImageView)content.findViewById(0x7f0700bd);
        profileImg.setPressedStateHandlerEnabled(false);
        netflixactivity = netflixactivity.getLayoutInflater().inflate(0x7f030031, null);
        home = (TextView)netflixactivity.findViewById(0x7f0700c1);
        home.setText(0x7f0c013d);
        home.setOnClickListener(onHomeClickListener);
        list = (ListView)content.findViewById(0x7f0700c0);
        list.setFocusable(false);
        list.addHeaderView(netflixactivity, null, false);
        drawerLayout = drawerlayout;
        fetchGenresDataIfReady();
    }

    private void fetchGenresDataIfReady()
    {
        if (managerNotReady())
        {
            return;
        }
        if (content == null)
        {
            Log.v("SlidingMenuAdapter", "Content is null - can't fetch data yet");
            return;
        } else
        {
            Log.v("SlidingMenuAdapter", "Fetching genres list...");
            manager.fetchGenreLists(new FetchGenresCallback());
            return;
        }
    }

    private boolean managerNotReady()
    {
        if (manager == null || !manager.isReady())
        {
            Log.v("SlidingMenuAdapter", "Manager is not ready - can't update");
            return true;
        } else
        {
            return false;
        }
    }

    private void setupSwitchToKids()
    {
        if (activity.isForKids() || !KidsUtils.shouldShowKidsEntryInMenu(activity))
        {
            return;
        } else
        {
            Log.v("SlidingMenuAdapter", "Showing 'switch to kids' menu item in sliding menu");
            TextView textview = (TextView)((ViewStub)content.findViewById(0x7f0700bf)).inflate().findViewById(0x7f0700c1);
            textview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, activity.getResources().getDimensionPixelSize(0x7f0a005e)));
            textview.setBackgroundResource(0x7f020155);
            textview.setCompoundDrawablesWithIntrinsicBounds(0x7f0200dd, 0, 0, 0);
            textview.setCompoundDrawablePadding(AndroidUtils.dipToPixels(activity, 12));
            textview.setText(0x7f0c0054);
            textview.setOnClickListener(new com.netflix.mediaclient.ui.kids.KidsUtils.OnSwitchToKidsClickListener(activity, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.slidingMenuKidsEntry));
            return;
        }
    }

    private void showErrorView()
    {
        leWrapper.showErrorView(true);
        AnimationUtils.hideView(list, true);
    }

    private void showLoadingView()
    {
        leWrapper.showLoadingView(true);
        AnimationUtils.hideView(list, true);
    }

    private void updateGenres(List list1)
    {
        leWrapper.hide(true);
        AnimationUtils.showView(list, true);
        adapter = new GenresListAdapter(list1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(onRowClickListener);
    }

    private void updateProfileInfo()
    {
        if (managerNotReady())
        {
            return;
        }
        UserProfile userprofile = manager.getCurrentProfile();
        if (userprofile == null)
        {
            Log.v("SlidingMenuAdapter", "Profile is null - can't update profile info");
            return;
        } else
        {
            profileName.setText(userprofile.getFirstName());
            NetflixActivity.getImageLoader(activity).showImg(profileImg, userprofile.getAvatarUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.profileAvatar, userprofile.getFirstName(), false, true);
            return;
        }
    }

    private void updateProfileViewGroupVisibility()
    {
        if (managerNotReady())
        {
            Log.d("SlidingMenuAdapter", "Manager not ready - can't update profile view visibility yet");
            return;
        }
        View view = profilesGroup;
        int i;
        if (shouldShowChangeProfilesItem())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void updateProfileViews()
    {
        updateProfileViewGroupVisibility();
        updateProfileInfo();
        updateSwitchProfileButton();
    }

    private void updateSwitchProfileButton()
    {
        if (managerNotReady())
        {
            return;
        }
        manager.refreshProfileSwitchingStatus();
        boolean flag1 = manager.isProfileSwitchingDisabled();
        Object obj = profilesGroup;
        int i;
        boolean flag;
        if (flag1)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        ((View) (obj)).setEnabled(flag);
        obj = switchProfilesIcon;
        if (flag1)
        {
            i = 0x108001f;
        } else
        {
            i = 0x7f0200ba;
        }
        ((ImageView) (obj)).setImageResource(i);
    }

    public void onActivityResume()
    {
        updateProfileViews();
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        manager = servicemanager;
        setupSwitchToKids();
        fetchGenresDataIfReady();
        updateProfileViews();
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        manager = null;
    }

    public void refresh()
    {
        showLoadingView();
        fetchGenresDataIfReady();
    }

    protected boolean shouldShowChangeProfilesItem()
    {
        boolean flag = true;
        List list1 = manager.getAllProfiles();
        if (list1 == null)
        {
            Log.w("SlidingMenuAdapter", "No profiles found for user!");
            return false;
        }
        if (list1.size() <= 1)
        {
            flag = false;
        }
        return flag;
    }

    protected void updateAdapterViews(Holder holder, GenreList genrelist)
    {
        holder.tv.setText(genrelist.getTitle());
    }





}
