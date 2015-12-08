// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.instagramphotopicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.t;
import java.net.URL;
import java.util.List;

// Referenced classes of package ly.kite.instagramphotopicker:
//            PagingBaseAdapter, InstagramGalleryActivity, InstagramPhoto, PagingGridView

private class this._cls0 extends PagingBaseAdapter
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
            view = LayoutInflater.from(viewgroup.getContext()).inflate(getItem, null);
            viewgroup = new getItem(null);
            viewgroup.getItem = (ImageView)view.findViewById(getItem);
            viewgroup.getItem = (ImageView)view.findViewById(getItem);
            view.setTag(viewgroup);
        }
        viewgroup = (getItem)view.getTag();
        imageview = ((getItem) (viewgroup)).getItem;
        Picasso.a(InstagramGalleryActivity.this).a(instagramphoto.getThumbnailURL().toString()).a(imageview);
        viewgroup = ((this._cls0) (viewgroup))._fld0;
        if (InstagramGalleryActivity.access$000(InstagramGalleryActivity.this).isItemChecked(i))
        {
            i = this._fld0;
        } else
        {
            i = this._fld0;
        }
        viewgroup.setImageResource(i);
        return view;
    }

    public Q()
    {
        this$0 = InstagramGalleryActivity.this;
        super();
    }

    public this._cls0(List list)
    {
        this$0 = InstagramGalleryActivity.this;
        super(list);
    }
}
