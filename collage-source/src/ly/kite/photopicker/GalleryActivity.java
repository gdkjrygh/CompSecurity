// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.photopicker;

import android.app.Activity;
import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.t;
import java.util.Collection;
import java.util.HashMap;

// Referenced classes of package ly.kite.photopicker:
//            Photo

public class GalleryActivity extends Activity
    implements android.app.LoaderManager.LoaderCallbacks
{
    private final class GalleryCursorAdapter extends CursorAdapter
    {

        final GalleryActivity this$0;

        public void bindView(View view, Context context, Cursor cursor)
        {
            view = (PhotoViewHolder)view.getTag();
            int i = cursor.getInt(cursor.getColumnIndex("_id"));
            cursor = Uri.withAppendedPath(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.toString(i));
            Picasso.a(context).a(cursor).a().c().a(((PhotoViewHolder) (view)).photo);
            view = ((PhotoViewHolder) (view)).checkbox;
            if (selectedPhotos.containsKey(Integer.valueOf(i)))
            {
                i = R.drawable.checkbox_on;
            } else
            {
                i = R.drawable.checkbox_off;
            }
            view.setImageResource(i);
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            context = LayoutInflater.from(context).inflate(R.layout.photo_cell, viewgroup, false);
            cursor = new PhotoViewHolder();
            cursor.photo = (ImageView)context.findViewById(R.id.imageview);
            cursor.checkbox = (ImageView)context.findViewById(R.id.checkbox);
            context.setTag(cursor);
            return context;
        }

        public GalleryCursorAdapter()
        {
            this$0 = GalleryActivity.this;
            super(GalleryActivity.this, null, false);
        }
    }

    public class MultiChoiceModeListener
        implements android.widget.AbsListView.MultiChoiceModeListener
    {

        final GalleryActivity this$0;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            if (menuitem.getItemId() == R.id.item_done)
            {
                actionmode = new Intent();
                menuitem = new Photo[selectedPhotos.size()];
                selectedPhotos.values().toArray(menuitem);
                actionmode.putExtra("ly.kite.photopicker.EXTRA_SELECTED_PHOTOS", menuitem);
                setResult(-1, actionmode);
                finish();
            }
            return true;
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            getMenuInflater().inflate(R.menu.photo_selection_menu, menu);
            int i = gridView.getCheckedItemCount();
            actionmode.setTitle((new StringBuilder()).append("").append(i).toString());
            return true;
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            selectedPhotos.clear();
            adapter.notifyDataSetChanged();
        }

        public void onItemCheckedStateChanged(ActionMode actionmode, int i, long l, boolean flag)
        {
            int j = gridView.getCheckedItemCount();
            actionmode.setTitle((new StringBuilder()).append("").append(j).toString());
            actionmode = (Cursor)adapter.getItem(i);
            i = actionmode.getInt(actionmode.getColumnIndex("_id"));
            actionmode = Uri.withAppendedPath(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.toString(i));
            if (flag)
            {
                selectedPhotos.put(Integer.valueOf(i), new Photo(actionmode, i));
            } else
            {
                selectedPhotos.remove(Integer.valueOf(i));
            }
            adapter.notifyDataSetChanged();
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return true;
        }

        public MultiChoiceModeListener()
        {
            this$0 = GalleryActivity.this;
            super();
        }
    }

    private static final class PhotoViewHolder
    {

        ImageView checkbox;
        ImageView photo;

        private PhotoViewHolder()
        {
        }

    }


    public static final String EXTRA_MEDIA_BUCKET_ID = "ly.kite.photopicker.EXTRA_MEDIA_BUCKET_ID";
    public static final String EXTRA_MEDIA_BUCKET_NAME = "ly.kite.photopicker.EXTRA_MEDIA_BUCKET_NAME";
    static final String GALLERY_PROJECTION[] = {
        "_id", "bucket_id", "datetaken"
    };
    private static final String KEY_SELECTED_PHOTOS = "ly.kite.photopicker.KEY_SELECTED_PHOTOS";
    private GalleryCursorAdapter adapter;
    private GridView gridView;
    private String mediaBucketId;
    private final HashMap selectedPhotos = new HashMap();

    public GalleryActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_gallery);
        if (bundle != null)
        {
            bundle = bundle.getParcelableArray("ly.kite.photopicker.KEY_SELECTED_PHOTOS");
            int j = bundle.length;
            for (int i = 0; i < j; i++)
            {
                Photo photo = (Photo)bundle[i];
                selectedPhotos.put(Integer.valueOf(photo.getId()), photo);
            }

        }
        mediaBucketId = getIntent().getStringExtra("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_ID");
        setTitle(getIntent().getStringExtra("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_NAME"));
        gridView = (GridView)findViewById(R.id.gridview);
        adapter = new GalleryCursorAdapter();
        gridView.setAdapter(adapter);
        gridView.setChoiceMode(3);
        gridView.setMultiChoiceModeListener(new MultiChoiceModeListener());
        gridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final GalleryActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int k, long l)
            {
                boolean flag = gridView.isItemChecked(k);
                adapterview = gridView;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adapterview.setItemChecked(k, flag);
            }

            
            {
                this$0 = GalleryActivity.this;
                super();
            }
        });
        getLoaderManager().initLoader(0, null, this);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        bundle = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String s = (new StringBuilder()).append("bucket_id = ").append(mediaBucketId).toString();
        return new CursorLoader(this, bundle, GALLERY_PROJECTION, s, null, "datetaken DESC");
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_device_folder, menu);
        return true;
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        adapter.swapCursor(cursor);
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        adapter.swapCursor(null);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_ID", mediaBucketId);
        bundle.putString("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_NAME", getTitle().toString());
        bundle.putParcelableArray("ly.kite.photopicker.KEY_SELECTED_PHOTOS", (android.os.Parcelable[])selectedPhotos.values().toArray(new Photo[0]));
    }




}
