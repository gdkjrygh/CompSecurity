// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.host.HostManager;
import org.xbmc.kore.ui.hosts.HostManagerActivity;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity, MoviesActivity, MusicActivity, FileActivity, 
//            TVShowsActivity, AddonsActivity, SettingsActivity

public class NavigationDrawerFragment extends Fragment
{
    public static class DrawerItem
    {

        public final String desc;
        public final int iconResourceId;
        public final int id;
        public final int type;

        public DrawerItem()
        {
            id = -1;
            type = 1;
            desc = null;
            iconResourceId = 0;
        }

        public DrawerItem(int i, int j, String s, int k)
        {
            type = i;
            id = j;
            desc = s;
            iconResourceId = k;
        }
    }

    public static class DrawerItemAdapter extends ArrayAdapter
    {

        private int hostItemColor;
        private int selectedItemColor;

        public int getItemViewType(int i)
        {
            return ((DrawerItem)getItem(i)).type;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            DrawerItem draweritem = (DrawerItem)getItem(i);
            draweritem.type;
            JVM INSTR tableswitch 0 2: default 40
        //                       0 175
        //                       1 46
        //                       2 73;
               goto _L1 _L2 _L3 _L4
_L1:
            View view3 = view;
_L6:
            return view3;
_L3:
            view3 = view;
            if (view != null) goto _L6; else goto _L5
_L5:
            return ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030043, viewgroup, false);
_L4:
            View view1;
            view1 = view;
            if (view == null)
            {
                view1 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030042, viewgroup, false);
            }
            view = (ImageView)view1.findViewById(0x7f0e00c5);
            view.setImageResource(draweritem.iconResourceId);
            viewgroup = (TextView)view1.findViewById(0x7f0e00c6);
            viewgroup.setText(draweritem.desc);
            view3 = view1;
            if (NavigationDrawerFragment.selectedItemId != draweritem.id) goto _L6; else goto _L7
_L7:
            view.setColorFilter(selectedItemColor);
            viewgroup.setTextColor(selectedItemColor);
            return view1;
_L2:
            View view2 = view;
            if (view == null)
            {
                view2 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030044, viewgroup, false);
            }
            view = (ImageView)view2.findViewById(0x7f0e00c5);
            view.setImageResource(draweritem.iconResourceId);
            viewgroup = (TextView)view2.findViewById(0x7f0e00c6);
            viewgroup.setText(draweritem.desc);
            if (NavigationDrawerFragment.selectedItemId == draweritem.id)
            {
                view.setColorFilter(selectedItemColor);
                viewgroup.setTextColor(selectedItemColor);
                return view2;
            } else
            {
                view.setColorFilter(hostItemColor);
                viewgroup.setTextColor(hostItemColor);
                return view2;
            }
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public DrawerItemAdapter(Context context, int i, DrawerItem adraweritem[])
        {
            super(context, i, adraweritem);
            context = context.getTheme().obtainStyledAttributes(new int[] {
                0x7f010106, 0x7f010045
            });
            selectedItemColor = context.getColor(0, 0x7f0d0004);
            hostItemColor = context.getColor(1, 0x7f0d0159);
            context.recycle();
        }
    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/ui/NavigationDrawerFragment);
    private static final SparseArray activityItemIdMap;
    private static int selectedItemId = -1;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerListView;
    private ActionBarDrawerToggle mDrawerToggle;
    private View mFragmentContainerView;
    private boolean mUserLearnedDrawer;

    public NavigationDrawerFragment()
    {
    }

    private int getItemIdFromActivity()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity instanceof HostManagerActivity)
        {
            return 0;
        }
        if (fragmentactivity instanceof RemoteActivity)
        {
            return 1;
        }
        if (fragmentactivity instanceof MoviesActivity)
        {
            return 2;
        }
        if (fragmentactivity instanceof TVShowsActivity)
        {
            return 3;
        }
        if (fragmentactivity instanceof MusicActivity)
        {
            return 4;
        }
        if (fragmentactivity instanceof FileActivity)
        {
            return 5;
        }
        if (fragmentactivity instanceof AddonsActivity)
        {
            return 6;
        }
        return !(fragmentactivity instanceof SettingsActivity) ? -1 : 7;
    }

    private void saveUserLearnedDrawer()
    {
        if (!mUserLearnedDrawer)
        {
            mUserLearnedDrawer = true;
            PreferenceManager.getDefaultSharedPreferences(getActivity()).edit().putBoolean("navigation_drawer_learned", true).apply();
        }
    }

    private void selectItem(final DrawerItem launchIntentFinal, int i)
    {
        if (launchIntentFinal.type != 1)
        {
            if (mDrawerListView != null)
            {
                mDrawerListView.setItemChecked(i, true);
            }
            mDrawerLayout.closeDrawer(0x800003);
            if (launchIntentFinal.id != getItemIdFromActivity())
            {
                launchIntentFinal = (new Intent(getActivity(), (Class)activityItemIdMap.get(launchIntentFinal.id))).addFlags(0x4000000);
                mDrawerLayout.postDelayed(new Runnable() {

                    final NavigationDrawerFragment this$0;
                    final Intent val$launchIntentFinal;

                    public void run()
                    {
                        startActivity(launchIntentFinal);
                        getActivity().overridePendingTransition(0x7f04000a, 0x7f04000b);
                    }

            
            {
                this$0 = NavigationDrawerFragment.this;
                launchIntentFinal = intent;
                super();
            }
                }, 250L);
                return;
            }
        }
    }

    public boolean isDrawerOpen()
    {
        return mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mFragmentContainerView);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(true);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        mDrawerToggle.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mUserLearnedDrawer = PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("navigation_drawer_learned", false);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mDrawerListView = (ListView)layoutinflater.inflate(0x7f03002f, viewgroup, false);
        mDrawerListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final NavigationDrawerFragment this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (DrawerItem)adapterview.getItemAtPosition(i);
                selectItem(adapterview, i);
            }

            
            {
                this$0 = NavigationDrawerFragment.this;
                super();
            }
        });
        viewgroup = getActivity().getTheme().obtainStyledAttributes(new int[] {
            0x7f01001a, 0x7f01002d, 0x7f010020, 0x7f01003b, 0x7f010021, 0x7f010018, 0x7f01000e, 0x7f010037
        });
        layoutinflater = HostManager.getInstance(getActivity()).getHostInfo();
        DrawerItem draweritem;
        DrawerItem draweritem1;
        DrawerItem draweritem2;
        DrawerItem draweritem3;
        DrawerItem draweritem4;
        DrawerItem draweritem5;
        DrawerItem draweritem6;
        if (layoutinflater != null)
        {
            layoutinflater = layoutinflater.getName();
        } else
        {
            layoutinflater = getString(0x7f0700cc);
        }
        layoutinflater = new DrawerItem(0, 0, layoutinflater, viewgroup.getResourceId(0, 0));
        bundle = new DrawerItem(2, 1, getString(0x7f07007a), viewgroup.getResourceId(1, 0));
        draweritem = new DrawerItem(2, 2, getString(0x7f070056), viewgroup.getResourceId(2, 0));
        draweritem1 = new DrawerItem(2, 3, getString(0x7f07009f), viewgroup.getResourceId(3, 0));
        draweritem2 = new DrawerItem(2, 4, getString(0x7f070057), viewgroup.getResourceId(4, 0));
        draweritem3 = new DrawerItem(2, 5, getString(0x7f0700d8), viewgroup.getResourceId(5, 0));
        draweritem4 = new DrawerItem(2, 6, getString(0x7f07001c), viewgroup.getResourceId(6, 0));
        draweritem5 = new DrawerItem();
        draweritem6 = new DrawerItem(2, 7, getString(0x7f070088), viewgroup.getResourceId(7, 0));
        viewgroup.recycle();
        mDrawerListView.setAdapter(new DrawerItemAdapter(getActivity(), 0x7f030042, new DrawerItem[] {
            layoutinflater, bundle, draweritem, draweritem1, draweritem2, draweritem3, draweritem4, draweritem5, draweritem6
        }));
        return mDrawerListView;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (mDrawerToggle.onOptionsItemSelected(menuitem))
        {
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onResume()
    {
        super.onResume();
        selectedItemId = getItemIdFromActivity();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    public void setDrawerIndicatorEnabled(boolean flag)
    {
        mDrawerToggle.setDrawerIndicatorEnabled(flag);
    }

    public void setUp(int i, DrawerLayout drawerlayout)
    {
        mFragmentContainerView = getActivity().findViewById(i);
        mDrawerLayout = drawerlayout;
        mDrawerLayout.setDrawerShadow(0x7f02003d, 0x800003);
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), mDrawerLayout, 0x7f07005a, 0x7f070059) {

            final NavigationDrawerFragment this$0;

            public void onDrawerClosed(View view)
            {
                super.onDrawerClosed(view);
                if (!isAdded())
                {
                    return;
                } else
                {
                    saveUserLearnedDrawer();
                    getActivity().invalidateOptionsMenu();
                    return;
                }
            }

            public void onDrawerOpened(View view)
            {
                super.onDrawerOpened(view);
                if (!isAdded())
                {
                    return;
                } else
                {
                    saveUserLearnedDrawer();
                    getActivity().invalidateOptionsMenu();
                    return;
                }
            }

            
            {
                this$0 = NavigationDrawerFragment.this;
                super(activity, drawerlayout, i, j);
            }
        };
        if (!mUserLearnedDrawer)
        {
            mDrawerLayout.openDrawer(mFragmentContainerView);
        }
        mDrawerLayout.post(new Runnable() {

            final NavigationDrawerFragment this$0;

            public void run()
            {
                mDrawerToggle.syncState();
            }

            
            {
                this$0 = NavigationDrawerFragment.this;
                super();
            }
        });
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        selectedItemId = getItemIdFromActivity();
    }

    static 
    {
        activityItemIdMap = new SparseArray(10);
        activityItemIdMap.put(0, org/xbmc/kore/ui/hosts/HostManagerActivity);
        activityItemIdMap.put(1, org/xbmc/kore/ui/RemoteActivity);
        activityItemIdMap.put(2, org/xbmc/kore/ui/MoviesActivity);
        activityItemIdMap.put(4, org/xbmc/kore/ui/MusicActivity);
        activityItemIdMap.put(5, org/xbmc/kore/ui/FileActivity);
        activityItemIdMap.put(3, org/xbmc/kore/ui/TVShowsActivity);
        activityItemIdMap.put(6, org/xbmc/kore/ui/AddonsActivity);
        activityItemIdMap.put(7, org/xbmc/kore/ui/SettingsActivity);
    }




}
