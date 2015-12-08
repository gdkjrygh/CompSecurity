// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.widget.TextView;
import com.pinterest.activity.create.adapter.GalleryGridAdapter;
import com.pinterest.activity.create.model.PhotoItem;
import com.pinterest.activity.create.model.PhotoItemFeed;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.utils.ImageUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.pinterest.activity.create:
//            PhotoGalleryActivity

class this._cls0 extends BackgroundTask
{

    File _imageDirectory;
    List _photoItems;
    final PhotoGalleryActivity this$0;

    public void onFinish()
    {
        _folderTextView.setText(_imageDirectory.getName());
        PhotoGalleryActivity.access$200(PhotoGalleryActivity.this).setItems(_photoItems);
        PhotoGalleryActivity.access$200(PhotoGalleryActivity.this).prependItem(new PhotoItem());
        PhotoGalleryActivity.access$300(PhotoGalleryActivity.this).setDataSource(PhotoGalleryActivity.access$200(PhotoGalleryActivity.this));
    }

    public void run()
    {
        _imageDirectory = new File(PhotoGalleryActivity.access$100(PhotoGalleryActivity.this));
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

                final PhotoGalleryActivity._cls2 this$1;

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
                this$1 = PhotoGalleryActivity._cls2.this;
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

    _cls1()
    {
        this$0 = PhotoGalleryActivity.this;
        super();
    }
}
