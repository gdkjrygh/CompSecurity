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
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.t;

// Referenced classes of package ly.kite.photopicker:
//            DeviceFolderActivity

private class this._cls0 extends CursorAdapter
{

    final DeviceFolderActivity this$0;

    public void bindView(View view, Context context, Cursor cursor)
    {
        view = (this._cls0)view.getTag();
        String s = cursor.getString(cursor.getColumnIndexOrThrow("bucket_display_name"));
        ((this._cls0) (view)).le.setText(s);
        int i = cursor.getInt(cursor.getColumnIndex("_id"));
        cursor = Uri.withAppendedPath(android.provider.URI, Integer.toString(i));
        Picasso.a(context).a(cursor).a().c().a((() (view)).er);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = LayoutInflater.from(context).inflate(er, viewgroup, false);
        cursor = new it>(null);
        cursor.er = (ImageView)context.findViewById(er);
        cursor.le = (TextView)context.findViewById(le);
        context.setTag(cursor);
        return context;
    }

    public ()
    {
        this$0 = DeviceFolderActivity.this;
        super(DeviceFolderActivity.this, null, false);
    }
}
