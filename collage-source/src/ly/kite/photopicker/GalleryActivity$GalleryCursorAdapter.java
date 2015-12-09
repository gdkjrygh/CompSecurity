// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.photopicker;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.t;
import java.util.HashMap;

// Referenced classes of package ly.kite.photopicker:
//            GalleryActivity

private final class this._cls0 extends CursorAdapter
{

    final GalleryActivity this$0;

    public void bindView(View view, Context context, Cursor cursor)
    {
        view = (this._cls0)view.getTag();
        int i = cursor.getInt(cursor.getColumnIndex("_id"));
        cursor = Uri.withAppendedPath(android.provider.ENT_URI, Integer.toString(i));
        Picasso.a(context).a(cursor).a().c().a(((_URI) (view)).);
        view = (() (view)).box;
        if (GalleryActivity.access$200(GalleryActivity.this).containsKey(Integer.valueOf(i)))
        {
            i = this._fld0;
        } else
        {
            i = this._fld0;
        }
        view.setImageResource(i);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(this._fld0, viewgroup, false);
        cursor = new >(null);
        cursor. = (ImageView)context.findViewById();
        cursor.box = (ImageView)context.findViewById(box);
        context.setTag(cursor);
        return context;
    }

    public ()
    {
        this$0 = GalleryActivity.this;
        super(GalleryActivity.this, null, false);
    }
}
