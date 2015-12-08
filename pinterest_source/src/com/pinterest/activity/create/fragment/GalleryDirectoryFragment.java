// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.create.adapter.GalleryDirectoryAdapter;
import com.pinterest.activity.create.model.DirectoryItem;
import com.pinterest.activity.create.model.DirectoryItemFeed;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.model.Feed;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.ui.actionbar.ActionBar;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GalleryDirectoryFragment extends BaseFragment
{

    private GalleryDirectoryAdapter _adapter;
    private Feed _directoryFeed;
    private HashMap _directoryPathMap;
    ListView _listView;
    private OnSelectDirectoryListener _listener;

    public GalleryDirectoryFragment()
    {
    }

    private boolean containsPhotos(File file)
    {
        return getPhotoCount(file) > 0;
    }

    private void findDirectories()
    {
        _directoryPathMap = new HashMap();
        ArrayList arraylist = new ArrayList();
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getPath());
        File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath());
        File file3 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getPath());
        File file4 = Environment.getExternalStorageDirectory();
        placeDirectoriesInMaps(file);
        placeDirectoriesInMaps(file2);
        placeDirectoriesInMaps(file3);
        placeDirectoriesInMaps(file4);
        if (!_directoryPathMap.containsKey("Pinterest"))
        {
            File file1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Pinterest");
            _directoryPathMap.put(file1.getName(), file1.getAbsolutePath());
        }
        String s;
        int i;
        for (Iterator iterator = _directoryPathMap.keySet().iterator(); iterator.hasNext(); arraylist.add(new DirectoryItem((String)_directoryPathMap.get(s), s, i)))
        {
            s = (String)iterator.next();
            i = getPhotoCount(new File((String)_directoryPathMap.get(s)));
        }

        Collections.sort(arraylist, new _cls2());
        _directoryFeed = new DirectoryItemFeed();
        _directoryFeed.setItems(arraylist);
    }

    private int getPhotoCount(File file)
    {
        file = file.listFiles(ImageUtils.PICTURE_FILE_FILTER);
        if (file != null)
        {
            return file.length;
        } else
        {
            return 0;
        }
    }

    private void init()
    {
        findDirectories();
        _actionBar.setTitle(0x7f0702cb);
        _actionBar.setTitleTextColor(Resources.color(0x7f0e00a6));
        _actionBarWrapper.setShadowVisibility(8);
        _adapter = new GalleryDirectoryAdapter();
        _adapter.setDataSource(_directoryFeed);
        _listView.setAdapter(_adapter);
        _listView.setOnItemClickListener(new _cls1());
    }

    private void placeDirectoriesInMaps(File file)
    {
        if (containsPhotos(file))
        {
            _directoryPathMap.put(file.getName(), file.getAbsolutePath());
        }
        file = file.listFiles();
        if (file != null && file.length > 0)
        {
            int j = file.length;
            for (int i = 0; i < j; i++)
            {
                File file1 = file[i];
                if (file1.isDirectory() && containsPhotos(file1) && !file1.isHidden())
                {
                    _directoryPathMap.put(file1.getName(), file1.getAbsolutePath());
                }
            }

        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            _listener = (OnSelectDirectoryListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement OnSelectDirectoryListener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300ca;
        _menuId = 0x7f100002;
    }

    public void onDestroy()
    {
        _listener = null;
        _directoryPathMap = null;
        _adapter = null;
        super.onDestroy();
    }

    public void onDestroyView()
    {
        _listener.onCancelSelection();
        _directoryFeed.destroy();
        _directoryPathMap.clear();
        ButterKnife.a(this);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        init();
    }




    private class _cls2
        implements Comparator
    {

        final GalleryDirectoryFragment this$0;

        public int compare(DirectoryItem directoryitem, DirectoryItem directoryitem1)
        {
            if (directoryitem.getName().equals("Pinterest"))
            {
                return -1;
            }
            if (directoryitem1.getName().equals("Pinterest"))
            {
                return 1;
            } else
            {
                return directoryitem.getName().compareToIgnoreCase(directoryitem1.getName());
            }
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((DirectoryItem)obj, (DirectoryItem)obj1);
        }

        _cls2()
        {
            this$0 = GalleryDirectoryFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final GalleryDirectoryFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (DirectoryItem)_directoryFeed.get(i);
            if (adapterview != null && _listener != null)
            {
                _listener.onDirectorySelected((String)_directoryPathMap.get(adapterview.getName()));
            }
        }

        _cls1()
        {
            this$0 = GalleryDirectoryFragment.this;
            super();
        }
    }


    private class OnSelectDirectoryListener
    {

        public abstract void onCancelSelection();

        public abstract void onDirectorySelected(String s);
    }

}
