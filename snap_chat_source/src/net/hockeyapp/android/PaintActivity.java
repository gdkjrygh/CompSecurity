// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import afM;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Stack;
import net.hockeyapp.android.views.PaintView;

public class PaintActivity extends Activity
{

    private PaintView a;
    private String b;

    public PaintActivity()
    {
    }

    private String a(Uri uri, String s)
    {
        Cursor cursor;
        Object obj1 = null;
        Object obj = null;
        cursor = getApplicationContext().getContentResolver().query(uri, new String[] {
            "_data"
        }, null, null, null);
        uri = obj1;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        uri = obj;
        if (cursor.moveToFirst())
        {
            uri = cursor.getString(0);
        }
        cursor.close();
        if (uri == null)
        {
            return s;
        } else
        {
            return (new File(uri)).getName();
        }
        uri;
        cursor.close();
        throw uri;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (Uri)getIntent().getExtras().getParcelable("imageUri");
        b = a(bundle, bundle.getLastPathSegment());
        int j = getResources().getDisplayMetrics().widthPixels;
        int k = getResources().getDisplayMetrics().heightPixels;
        int i;
        int l;
        if (j > k)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        l = PaintView.a(getContentResolver(), bundle);
        setRequestedOrientation(l);
        if (i != l)
        {
            return;
        } else
        {
            a = new PaintView(this, bundle, j, k);
            bundle = new LinearLayout(this);
            bundle.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            bundle.setGravity(17);
            bundle.setOrientation(1);
            LinearLayout linearlayout = new LinearLayout(this);
            linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
            linearlayout.setGravity(17);
            linearlayout.setOrientation(0);
            bundle.addView(linearlayout);
            linearlayout.addView(a);
            setContentView(bundle);
            Toast.makeText(this, afM.a(1536), 1000).show();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, afM.a(1537));
        menu.add(0, 2, 0, afM.a(1538));
        menu.add(0, 3, 0, afM.a(1539));
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && !a.a.empty())
        {
            keyevent = new android.content.DialogInterface.OnClickListener() {

                private PaintActivity a;

                public final void onClick(DialogInterface dialoginterface, int j)
                {
                    switch (j)
                    {
                    default:
                        return;

                    case -1: 
                        a.finish();
                        break;
                    }
                }

            
            {
                a = PaintActivity.this;
                super();
            }
            };
            (new android.app.AlertDialog.Builder(this)).setMessage(afM.a(1540)).setPositiveButton(afM.a(1542), keyevent).setNegativeButton(afM.a(1541), keyevent).show();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR tableswitch 1 3: default 36
    //                   1 46
    //                   2 213
    //                   3 242;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = super.onOptionsItemSelected(menuitem);
_L6:
        return flag;
_L2:
        Object obj = new File(getCacheDir(), "HockeyApp");
        ((File) (obj)).mkdir();
        menuitem = new File(((File) (obj)), b);
        for (int i = 1; menuitem.exists(); i++)
        {
            menuitem = new File(((File) (obj)), (new StringBuilder()).append(b).append("_").append(i).toString());
        }

        a.setDrawingCacheEnabled(true);
        (new AsyncTask(a.getDrawingCache()) {

            private Bitmap a;

            private transient Void a(File afile[])
            {
                try
                {
                    afile = new FileOutputStream(afile[0]);
                    a.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, afile);
                    afile.close();
                }
                // Misplaced declaration of an exception variable
                catch (File afile[])
                {
                    afile.printStackTrace();
                }
                return null;
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a((File[])aobj);
            }

            
            {
                a = bitmap;
                super();
            }
        }).execute(new File[] {
            menuitem
        });
        obj = new Intent();
        ((Intent) (obj)).putExtra("imageUri", Uri.fromFile(menuitem));
        if (getParent() == null)
        {
            setResult(-1, ((Intent) (obj)));
        } else
        {
            getParent().setResult(-1, ((Intent) (obj)));
        }
        finish();
        return true;
_L3:
        menuitem = a;
        if (((PaintView) (menuitem)).a.empty()) goto _L6; else goto _L5
_L5:
        ((PaintView) (menuitem)).a.pop();
        menuitem.invalidate();
        return true;
_L4:
        menuitem = a;
        ((PaintView) (menuitem)).a.clear();
        menuitem.invalidate();
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        return true;
    }
}
