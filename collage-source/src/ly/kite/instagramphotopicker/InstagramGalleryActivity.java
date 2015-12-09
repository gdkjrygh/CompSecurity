// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.t;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package ly.kite.instagramphotopicker:
//            InstagramPhotoPicker, InstagramMediaRequest, PagingGridView, InstagramPhoto, 
//            PagingBaseAdapter

public class InstagramGalleryActivity extends Activity
{
    private class InstagramPhotoAdapter extends PagingBaseAdapter
    {

        final InstagramGalleryActivity this$0;

        public int getCount()
        {
            return items.size();
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public InstagramPhoto getItem(int i)
        {
            return (InstagramPhoto)items.get(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            InstagramPhoto instagramphoto = getItem(i);
            ImageView imageview;
            if (view == null)
            {
                view = LayoutInflater.from(viewgroup.getContext()).inflate(R.layout.photo_cell, null);
                viewgroup = new ViewHolder();
                viewgroup.imageView = (ImageView)view.findViewById(R.id.imageview);
                viewgroup.checkbox = (ImageView)view.findViewById(R.id.checkbox);
                view.setTag(viewgroup);
            }
            viewgroup = (ViewHolder)view.getTag();
            imageview = ((ViewHolder) (viewgroup)).imageView;
            Picasso.a(InstagramGalleryActivity.this).a(instagramphoto.getThumbnailURL().toString()).a(imageview);
            viewgroup = ((ViewHolder) (viewgroup)).checkbox;
            if (gridView.isItemChecked(i))
            {
                i = R.drawable.checkbox_on;
            } else
            {
                i = R.drawable.checkbox_off;
            }
            viewgroup.setImageResource(i);
            return view;
        }

        public InstagramPhotoAdapter()
        {
            this$0 = InstagramGalleryActivity.this;
            super();
        }

        public InstagramPhotoAdapter(List list)
        {
            this$0 = InstagramGalleryActivity.this;
            super(list);
        }
    }

    public class MultiChoiceModeListener
        implements android.widget.AbsListView.MultiChoiceModeListener
    {

        final InstagramGalleryActivity this$0;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            if (menuitem.getItemId() == R.id.item_done)
            {
                actionmode = new Intent();
                menuitem = new InstagramPhoto[selectedPhotos.size()];
                selectedPhotos.toArray(menuitem);
                actionmode.putExtra("ly.kite.instagramphotopicker.EXTRA_SELECTED_PHOTOS", menuitem);
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
        }

        public void onItemCheckedStateChanged(ActionMode actionmode, int i, long l, boolean flag)
        {
            int j = gridView.getCheckedItemCount();
            actionmode.setTitle((new StringBuilder()).append("").append(j).toString());
            actionmode = (InstagramPhotoAdapter)gridView.getOriginalAdapter();
            actionmode.notifyDataSetChanged();
            actionmode = actionmode.getItem(i);
            if (flag)
            {
                selectedPhotos.add(actionmode);
                return;
            } else
            {
                selectedPhotos.remove(actionmode);
                return;
            }
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return true;
        }

        public MultiChoiceModeListener()
        {
            this$0 = InstagramGalleryActivity.this;
            super();
        }
    }

    private static final class ViewHolder
    {

        ImageView checkbox;
        ImageView imageView;

        private ViewHolder()
        {
        }

    }


    private static final String KEY_FETCHED_PHOTOS = "ly.kite.instagramphotopicker.KEY_FETCHED_PHOTOS";
    private static final String KEY_HAS_MORE_PHOTOS = "ly.kite.instagramphotopicker.KEY_HAS_MORE_PHOTOS";
    private static final String KEY_NEXT_PAGE_REQUEST = "ly.kite.instagramphotopicker.KEY_NEXT_PAGE_REQUEST";
    private static final String KEY_SELECTED_PHOTOS = "ly.kite.instagramphotopicker.KEY_SELECTED_PHOTOS";
    private static final int REQUEST_CODE_LOGIN = 99;
    private InstagramPhotoAdapter adapter;
    private PagingGridView gridView;
    private InstagramMediaRequest nextPageRequest;
    private final HashSet selectedPhotos = new HashSet();

    public InstagramGalleryActivity()
    {
    }

    private void logout()
    {
        String s = InstagramPhotoPicker.getClientId(this);
        String s1 = InstagramPhotoPicker.getRedirectUri(this);
        InstagramPhotoPicker.logout(this);
        InstagramPhotoPicker.startPhotoPickerForResult(this, s, s1, 99);
    }

    private void showErrorDialog(String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Error");
        builder.setMessage(s);
        builder.setPositiveButton("OK", null);
        builder.show();
    }

    static void startForResult(Activity activity, int i)
    {
        activity.startActivityForResult(new Intent(activity, ly/kite/instagramphotopicker/InstagramGalleryActivity), i);
    }

    static void startForResult(Fragment fragment, int i)
    {
        fragment.startActivityForResult(new Intent(fragment.getActivity(), ly/kite/instagramphotopicker/InstagramGalleryActivity), i);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        setResult(j, intent);
        finish();
    }

    protected void onCreate(final Bundle accessToken)
    {
        boolean flag = false;
        super.onCreate(accessToken);
        setContentView(R.layout.activity_instagram_gallery);
        nextPageRequest = new InstagramMediaRequest();
        gridView = (PagingGridView)findViewById(R.id.gridview);
        ArrayList arraylist = new ArrayList();
        boolean flag1 = true;
        if (accessToken != null)
        {
            android.os.Parcelable aparcelable[] = accessToken.getParcelableArray("ly.kite.instagramphotopicker.KEY_FETCHED_PHOTOS");
            int k = aparcelable.length;
            for (int i = 0; i < k; i++)
            {
                arraylist.add((InstagramPhoto)aparcelable[i]);
            }

            aparcelable = accessToken.getParcelableArray("ly.kite.instagramphotopicker.KEY_SELECTED_PHOTOS");
            k = aparcelable.length;
            for (int j = ((flag) ? 1 : 0); j < k; j++)
            {
                android.os.Parcelable parcelable = aparcelable[j];
                selectedPhotos.add((InstagramPhoto)parcelable);
            }

            flag1 = accessToken.getBoolean("ly.kite.instagramphotopicker.KEY_HAS_MORE_PHOTOS");
            nextPageRequest = (InstagramMediaRequest)accessToken.getParcelable("ly.kite.instagramphotopicker.KEY_NEXT_PAGE_REQUEST");
        }
        adapter = new InstagramPhotoAdapter(arraylist);
        gridView.setAdapter(adapter);
        gridView.setHasMoreItems(flag1);
        gridView.setChoiceMode(3);
        gridView.setMultiChoiceModeListener(new MultiChoiceModeListener());
        accessToken = InstagramPhotoPicker.getAccessToken(this);
        gridView.setPagingableListener(new PagingGridView.Pagingable() {

            final InstagramGalleryActivity this$0;
            final String val$accessToken;

            public void onLoadMoreItems()
            {
            /* block-local class not found */
            class _cls1 {}

                nextPageRequest.getMedia(accessToken, new _cls1());
            }

            
            {
                this$0 = InstagramGalleryActivity.this;
                accessToken = s;
                super();
            }
        });
        gridView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final InstagramGalleryActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int l, long l1)
            {
                boolean flag2 = gridView.isItemChecked(l);
                adapterview = gridView;
                if (!flag2)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                adapterview.setItemChecked(l, flag2);
            }

            
            {
                this$0 = InstagramGalleryActivity.this;
                super();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_instagram_gallery, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == R.id.action_logout)
        {
            logout();
            return true;
        }
        if (i == 0x102002c)
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
        bundle.putParcelableArray("ly.kite.instagramphotopicker.KEY_SELECTED_PHOTOS", (android.os.Parcelable[])selectedPhotos.toArray(new InstagramPhoto[0]));
        bundle.putBoolean("ly.kite.instagramphotopicker.KEY_HAS_MORE_PHOTOS", gridView.hasMoreItems());
        bundle.putParcelableArray("ly.kite.instagramphotopicker.KEY_FETCHED_PHOTOS", (android.os.Parcelable[])adapter.getItems().toArray(new InstagramPhoto[0]));
        bundle.putParcelable("ly.kite.instagramphotopicker.KEY_NEXT_PAGE_REQUEST", nextPageRequest);
    }




/*
    static InstagramMediaRequest access$102(InstagramGalleryActivity instagramgalleryactivity, InstagramMediaRequest instagrammediarequest)
    {
        instagramgalleryactivity.nextPageRequest = instagrammediarequest;
        return instagrammediarequest;
    }

*/



}
