// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.astuetz.PagerSlidingTabStrip;
import org.xbmc.kore.utils.TabsAdapter;

// Referenced classes of package org.xbmc.kore.ui:
//            MediaFileListFragment, FileActivity

public class FileListFragment extends Fragment
    implements FileActivity.OnBackPressedListener
{

    PagerSlidingTabStrip pagerTabStrip;
    ViewPager viewPager;

    public FileListFragment()
    {
    }

    public boolean currentPageAtRootDirectory()
    {
        MediaFileListFragment mediafilelistfragment = findFragmentByPosition(viewPager.getCurrentItem() + 1);
        if (mediafilelistfragment != null)
        {
            return mediafilelistfragment.atRootDirectory();
        } else
        {
            return true;
        }
    }

    MediaFileListFragment findFragmentByPosition(int i)
    {
        String s = (new StringBuilder()).append("android:switcher:").append(viewPager.getId()).append(":").append(i).toString();
        return (MediaFileListFragment)getChildFragmentManager().findFragmentByTag(s);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setHasOptionsMenu(false);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            ((FileActivity)activity).setBackPressedListener(this);
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" unable to register BackPressedListener").toString());
        }
    }

    public void onBackPressed()
    {
        MediaFileListFragment mediafilelistfragment = findFragmentByPosition(viewPager.getCurrentItem() + 1);
        if (mediafilelistfragment != null)
        {
            mediafilelistfragment.onBackPressed();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f03002b, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = new Bundle();
        viewgroup.putString("mediaType", "video");
        bundle = new Bundle();
        bundle.putString("mediaType", "music");
        Bundle bundle1 = new Bundle();
        bundle1.putString("mediaType", "pictures");
        viewgroup = (new TabsAdapter(getActivity(), getChildFragmentManager())).addTab(org/xbmc/kore/ui/MediaFileListFragment, viewgroup, 0x7f0700e0, 1L).addTab(org/xbmc/kore/ui/MediaFileListFragment, bundle, 0x7f070057, 2L).addTab(org/xbmc/kore/ui/MediaFileListFragment, bundle1, 0x7f070070, 3L);
        viewPager.setAdapter(viewgroup);
        pagerTabStrip.setViewPager(viewPager);
        return layoutinflater;
    }
}
