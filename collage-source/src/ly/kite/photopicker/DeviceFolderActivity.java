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
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
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
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.t;
import java.util.HashSet;

// Referenced classes of package ly.kite.photopicker:
//            GalleryActivity

public class DeviceFolderActivity extends Activity
    implements android.app.LoaderManager.LoaderCallbacks
{
    private class FolderCursorAdapter extends CursorAdapter
    {

        final DeviceFolderActivity this$0;

        public void bindView(View view, Context context, Cursor cursor)
        {
            view = (FolderViewHolder)view.getTag();
            String s = cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name"));
            ((FolderViewHolder) (view)).title.setText(s);
            int i = cursor.getInt(cursor.getColumnIndex("_id"));
            cursor = Uri.withAppendedPath(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.toString(i));
            Picasso.a(context).a(cursor).a().c().a(((FolderViewHolder) (view)).cover);
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            context = LayoutInflater.from(context).inflate(R.layout.folder_cell, viewgroup, false);
            cursor = new FolderViewHolder();
            cursor.cover = (ImageView)context.findViewById(R.id.imageview);
            cursor.title = (TextView)context.findViewById(R.id.text);
            context.setTag(cursor);
            return context;
        }

        public FolderCursorAdapter()
        {
            this$0 = DeviceFolderActivity.this;
            super(DeviceFolderActivity.this, null, false);
        }
    }

    private static final class FolderViewHolder
    {

        ImageView cover;
        TextView title;

        private FolderViewHolder()
        {
        }

    }


    private static final String FOLDER_SUMMARY_PROJECTION[] = {
        "_id", "bucket_id", "bucket_display_name", "datetaken"
    };
    private static final int REQUEST_CODE_GET_PHOTOS = 99;
    private FolderCursorAdapter adapter;
    private GridView gridView;

    public DeviceFolderActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (j == -1)
        {
            setResult(j, intent);
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_folder);
        gridView = (GridView)findViewById(R.id.gridview);
        adapter = new FolderCursorAdapter();
        gridView.setAdapter(adapter);
        getLoaderManager().initLoader(0, null, this);
        gridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final DeviceFolderActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                view = (Cursor)adapter.getItem(i);
                adapterview = view.getString(view.getColumnIndexOrThrow("bucket_id"));
                view = view.getString(view.getColumnIndexOrThrow("bucket_display_name"));
                Intent intent = new Intent(DeviceFolderActivity.this, ly/kite/photopicker/GalleryActivity);
                intent.putExtra("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_ID", adapterview);
                intent.putExtra("ly.kite.photopicker.EXTRA_MEDIA_BUCKET_NAME", view);
                startActivityForResult(intent, 99);
            }

            
            {
                this$0 = DeviceFolderActivity.this;
                super();
            }
        });
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new CursorLoader(this, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, FOLDER_SUMMARY_PROJECTION, null, null, "bucket_display_name COLLATE NOCASE ASC, datetaken DESC");
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_device_folder, menu);
        return true;
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        loader = new MatrixCursor(FOLDER_SUMMARY_PROJECTION);
        HashSet hashset = new HashSet();
        if (cursor.moveToFirst())
        {
            do
            {
                String s = cursor.getString(cursor.getColumnIndexOrThrow("bucket_id"));
                if (!hashset.contains(s))
                {
                    hashset.add(s);
                    loader.addRow(new Object[] {
                        cursor.getString(0), cursor.getString(1), cursor.getString(2), Integer.valueOf(cursor.getInt(3))
                    });
                }
            } while (cursor.moveToNext());
        }
        adapter.swapCursor(loader);
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


}
