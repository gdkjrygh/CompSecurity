// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.fitbit.ui.FitbitActivity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.UUID;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ShareExerciseActivity

public class ShareExerciseGalleryActivity extends FitbitActivity
    implements android.widget.AdapterView.OnItemClickListener
{
    private class a extends CursorAdapter
    {

        final ShareExerciseGalleryActivity a;

        public String a(int i)
        {
            Cursor cursor = getCursor();
            if (cursor.moveToPosition(i))
            {
                return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            } else
            {
                return null;
            }
        }

        public void bindView(View view, Context context, Cursor cursor)
        {
            view = (ImageView)view;
            long l = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            cursor = Uri.withAppendedPath(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.toString(l));
            Picasso.with(context).load(cursor).fit().centerCrop().into(view);
        }

        public Object getItem(int i)
        {
            return a(i);
        }

        public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            return LayoutInflater.from(context).inflate(0x7f0400fb, viewgroup, false);
        }

        public a(Context context, Cursor cursor)
        {
            a = ShareExerciseGalleryActivity.this;
            super(context, cursor, 0);
        }
    }


    private static final String a = "ShareExerciseGalleryActivity";
    private static final String b = "uuid";
    private UUID c;
    private GridView d;
    private a e;
    private android.support.v4.app.LoaderManager.LoaderCallbacks f;

    public ShareExerciseGalleryActivity()
    {
        f = new android.support.v4.app.LoaderManager.LoaderCallbacks() {

            final ShareExerciseGalleryActivity a;

            public void a(Loader loader, Cursor cursor)
            {
                ShareExerciseGalleryActivity.a(a).changeCursor(cursor);
            }

            public Loader onCreateLoader(int i, Bundle bundle)
            {
                return new CursorLoader(a, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[] {
                    "_id", "_data"
                }, null, null, "_id DESC");
            }

            public void onLoadFinished(Loader loader, Object obj)
            {
                a(loader, (Cursor)obj);
            }

            public void onLoaderReset(Loader loader)
            {
                ShareExerciseGalleryActivity.a(a).changeCursor(null);
            }

            
            {
                a = ShareExerciseGalleryActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, UUID uuid)
    {
        context = new Intent(context, com/fitbit/runtrack/ui/ShareExerciseGalleryActivity);
        context.putExtra("uuid", new ParcelUuid(uuid));
        return context;
    }

    static a a(ShareExerciseGalleryActivity shareexercisegalleryactivity)
    {
        return shareexercisegalleryactivity.e;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j == -1)
        {
            setResult(-1);
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04004a);
        d = (GridView)findViewById(0x7f1101b4);
        d.setOnItemClickListener(this);
        c = ((ParcelUuid)getIntent().getParcelableExtra("uuid")).getUuid();
        e = new a(this, null);
        d.setAdapter(e);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)adapterview.getItemAtPosition(i);
        startActivityForResult(ShareExerciseActivity.a(this, c, adapterview, ShareExerciseSharingEvent.Source.c), 0);
    }

    protected void onResume()
    {
        super.onResume();
        getSupportLoaderManager().initLoader(0, null, f);
    }
}
