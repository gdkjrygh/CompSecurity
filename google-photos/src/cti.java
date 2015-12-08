// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.LoaderManager;
import android.content.ContentUris;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.SimpleCursorAdapter;
import java.util.ArrayList;

public class cti extends rz
{

    private GridView d;
    private MenuItem e;
    private Bitmap f;
    private SimpleCursorAdapter g;
    private Cursor h;
    private Cursor i;
    private ctg j;
    private boolean k[] = {
        0, 1
    };
    private HandlerThread l;
    private Handler m;

    public cti()
    {
    }

    static Cursor a(cti cti1, Cursor cursor)
    {
        cti1.h = cursor;
        return cursor;
    }

    static void a(cti cti1)
    {
        cti1.f();
    }

    static Cursor b(cti cti1, Cursor cursor)
    {
        cti1.i = cursor;
        return cursor;
    }

    static void b(cti cti1)
    {
        if (cti1.i == null || cti1.h == null)
        {
            return;
        } else
        {
            cti1.j = new ctg(new Cursor[] {
                cti1.h, cti1.i
            }, "datetaken", 0);
            cti1.g.swapCursor(cti1.j);
            return;
        }
    }

    static Bitmap c(cti cti1)
    {
        return cti1.f;
    }

    static Handler d(cti cti1)
    {
        return cti1.m;
    }

    static boolean[] e(cti cti1)
    {
        return cti1.k;
    }

    private void f()
    {
        int i1 = d.getCheckedItemCount();
        if (i1 > 0)
        {
            e().a().a(getResources().getQuantityString(b.hH, i1, new Object[] {
                Integer.valueOf(i1)
            }));
            if (e != null)
            {
                e.setVisible(true);
            }
        } else
        {
            e().a().c(c.be);
            if (e != null)
            {
                e.setVisible(false);
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(c.D);
        bundle = e().a();
        bundle.a(false);
        bundle.c(true);
        d = (GridView)findViewById(b.fN);
        f = BitmapFactory.decodeResource(getResources(), b.eB);
        bundle = getBaseContext();
        int i1 = c.z;
        int j1 = b.fO;
        g = new SimpleCursorAdapter(bundle, i1, null, new String[] {
            "_id"
        }, new int[] {
            j1
        }, 0);
        g.setViewBinder(new ctm(this));
        d.setAdapter(g);
        d.setNumColumns(4);
        d.setChoiceMode(2);
        d.setOnItemClickListener(new ctj(this));
        bundle = new String[4];
        bundle[0] = "_id";
        bundle[1] = "_data";
        bundle[2] = "datetaken";
        bundle[3] = "bucket_display_name";
        getLoaderManager().initLoader(0, null, new ctk(this, bundle, null));
        getLoaderManager().initLoader(1, null, new ctl(this, bundle, null));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(b.hE, menu);
        e = menu.findItem(b.gb);
        f();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        if (menuitem == e)
        {
            Object obj = d.getCheckedItemPositions();
            menuitem = new ArrayList();
            int i1 = 0;
            while (i1 < g.getCount()) 
            {
                if (((SparseBooleanArray) (obj)).get(i1))
                {
                    ctg ctg1 = (ctg)g.getItem(i1);
                    if (k[ctg1.a])
                    {
                        menuitem.add(ContentUris.withAppendedId(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, ctg1.getLong(0)));
                    } else
                    {
                        menuitem.add(ContentUris.withAppendedId(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ctg1.getLong(0)));
                    }
                }
                i1++;
            }
            obj = new Intent();
            ((Intent) (obj)).setAction("android.intent.action.SEND_MULTIPLE");
            ((Intent) (obj)).putExtra("android.intent.extra.STREAM", menuitem);
            setResult(-1, ((Intent) (obj)));
            finish();
            flag = true;
        }
        return flag;
    }

    protected void onPause()
    {
        l.quit();
        l = null;
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        f();
        l = new HandlerThread("Tileloader");
        l.start();
        m = new Handler(l.getLooper());
    }
}
