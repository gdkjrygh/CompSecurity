// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.create.adapter.GalleryGridAdapter;
import com.pinterest.activity.create.event.UnavailableCameraEvent;
import com.pinterest.activity.create.fragment.GalleryDirectoryFragment;
import com.pinterest.activity.create.model.PhotoItem;
import com.pinterest.activity.create.model.PhotoItemFeed;
import com.pinterest.base.Events;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.actionbar.ActionBar;
import java.io.File;

// Referenced classes of package com.pinterest.activity.create:
//            CreateActivity

public class PhotoGalleryActivity extends BaseActivity
    implements com.pinterest.activity.create.fragment.GalleryDirectoryFragment.OnSelectDirectoryListener
{

    protected Toolbar _actionBar;
    ActionBar _actionBarWrapper;
    private GalleryGridAdapter _adapter;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private PhotoItemFeed _feed;
    TextView _folderTextView;
    private String _gridPath;
    GridView _gridView;
    View _header;
    private String _pinterestPath;
    private BackgroundTask _setGridItemsTask;

    public PhotoGalleryActivity()
    {
        _eventsSubscriber = new _cls1();
        _setGridItemsTask = new _cls2();
    }

    protected void init()
    {
        initActionBar(0x7f100002);
        _pinterestPath = (new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Pinterest")).getPath();
        _gridPath = _pinterestPath;
        _adapter = new GalleryGridAdapter();
        _feed = new PhotoItemFeed();
        _gridView.setAdapter(_adapter);
        initListeners();
        _setGridItemsTask.execute();
    }

    public void initActionBar(int i)
    {
        if (_actionBarWrapper != null)
        {
            _actionBar = _actionBarWrapper.getActionBar();
            _actionBarWrapper.setShadowVisibility(8);
        }
        if (_actionBar != null)
        {
            if (i > 0)
            {
                _actionBar.inflateMenu(i);
            }
            _actionBar.setNavigationIcon(0x7f02015c);
            _actionBar.setNavigationOnClickListener(new _cls5());
            DrawableUtils.tintToolbarIcons(_actionBar, 0x7f0e006d);
        }
    }

    public void initListeners()
    {
        _gridView.setOnItemClickListener(new _cls3());
        _header.setOnClickListener(new _cls4());
    }

    public void onBackPressed()
    {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0)
        {
            getSupportFragmentManager().popBackStack();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onCancelSelection()
    {
        if (_header != null)
        {
            _header.setClickable(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030024);
        ButterKnife.a(this);
        init();
    }

    public void onDestroy()
    {
        Events.unregister(_eventsSubscriber);
        _feed.destroy();
        _adapter.notifyDataSetChanged();
        _setGridItemsTask = null;
        ButterKnife.a(this);
        super.onDestroy();
    }

    public void onDirectorySelected(String s)
    {
        _gridPath = s;
        _setGridItemsTask.execute();
        _header.setClickable(true);
        getSupportFragmentManager().popBackStack();
    }

    public void onPhotoClicked(Uri uri)
    {
        Intent intent = new Intent(this, com/pinterest/activity/create/CreateActivity);
        intent.putExtra("Image Uri", uri.toString());
        startActivity(intent);
    }

    public void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber, com/pinterest/activity/create/model/PhotoItem, new Class[] {
            com/pinterest/activity/create/event/UnavailableCameraEvent
        });
        _gridView.setEnabled(true);
    }

    public void onSwitchDirectory()
    {
        FragmentHelper.replaceFragment(this, new GalleryDirectoryFragment(), true, com.pinterest.activity.FragmentHelper.Animation.MODAL);
    }





    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PhotoGalleryActivity this$0;

        public void onEventMainThread(UnavailableCameraEvent unavailablecameraevent)
        {
            Toast.makeText(PhotoGalleryActivity.this, Resources.string(0x7f0700ac), 1).show();
        }

        public void onEventMainThread(PhotoItem photoitem)
        {
            if (_gridPath.equals(_pinterestPath))
            {
                _feed.addItem(1, photoitem);
                _adapter.notifyDataSetChanged();
            }
        }

        _cls1()
        {
            this$0 = PhotoGalleryActivity.this;
            super();
        }
    }


    private class _cls2 extends BackgroundTask
    {

        File _imageDirectory;
        List _photoItems;
        final PhotoGalleryActivity this$0;

        public void onFinish()
        {
            _folderTextView.setText(_imageDirectory.getName());
            _feed.setItems(_photoItems);
            _feed.prependItem(new PhotoItem());
            _adapter.setDataSource(_feed);
        }

        public void run()
        {
            _imageDirectory = new File(_gridPath);
            _photoItems = new ArrayList();
            File afile[] = _imageDirectory.listFiles(ImageUtils.PICTURE_FILE_FILTER);
            List list;
            if (afile != null)
            {
                list = Arrays.asList(afile);
            } else
            {
                list = null;
            }
            if (list != null)
            {
                class _cls1
                    implements Comparator
                {

                    final _cls2 this$1;

                    public int compare(File file, File file1)
                    {
                        if (file1.lastModified() > file.lastModified())
                        {
                            return 1;
                        }
                        return file1.lastModified() >= file.lastModified() ? 0 : -1;
                    }

                    public volatile int compare(Object obj, Object obj1)
                    {
                        return compare((File)obj, (File)obj1);
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    super();
                }
                }

                Collections.sort(list, new _cls1());
                for (int i = 0; i < list.size(); i++)
                {
                    PhotoItem photoitem = new PhotoItem(((File)list.get(i)).getAbsolutePath());
                    _photoItems.add(photoitem);
                }

            }
        }

        _cls2()
        {
            this$0 = PhotoGalleryActivity.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final PhotoGalleryActivity this$0;

        public void onClick(View view)
        {
            onBackPressed();
        }

        _cls5()
        {
            this$0 = PhotoGalleryActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final PhotoGalleryActivity this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            _gridView.setEnabled(false);
            if (i == 0)
            {
                adapterview = new Intent(PhotoGalleryActivity.this, com/pinterest/activity/create/CameraActivity);
                startActivity(adapterview);
            } else
            {
                adapterview = (PhotoItem)_feed.get(i);
                if (adapterview != null)
                {
                    onPhotoClicked(adapterview.getUri());
                    return;
                }
            }
        }

        _cls3()
        {
            this$0 = PhotoGalleryActivity.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final PhotoGalleryActivity this$0;

        public void onClick(View view)
        {
            _header.setClickable(false);
            onSwitchDirectory();
        }

        _cls4()
        {
            this$0 = PhotoGalleryActivity.this;
            super();
        }
    }

}
