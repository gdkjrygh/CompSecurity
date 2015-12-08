// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.view.crop.CropImageView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity

public class CropImageActivity extends BaseActivity
{
    private class a extends com.cardinalblue.android.piccollage.controller.a.b
    {

        final CropImageActivity a;
        private CropImageView b;
        private int c;
        private int d;
        private String e;
        private b f;

        static void a(a a1, b b1)
        {
            a1.a(b1);
        }

        private void a(b b1)
        {
            f = b1;
        }

        private boolean a(Bitmap bitmap)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = false;
            Object obj = new File(e);
            if (((File) (obj)).exists() || !((File) (obj)).createNewFile()) goto _L2; else goto _L1
_L1:
            FileOutputStream fileoutputstream = new FileOutputStream(((File) (obj)));
            obj = fileoutputstream;
            if (fileoutputstream == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            obj = fileoutputstream;
            flag = bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, fileoutputstream);
            obj = fileoutputstream;
_L9:
            flag1 = flag;
            if (obj != null)
            {
                try
                {
                    ((OutputStream) (obj)).flush();
                    ((OutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Bitmap bitmap)
                {
                    bitmap.printStackTrace();
                    return flag;
                }
                flag1 = flag;
            }
_L4:
            return flag1;
            bitmap;
            fileoutputstream = null;
_L7:
            obj = fileoutputstream;
            Log.e("CropImageActivity", (new StringBuilder()).append("Cannot open file: ").append(e).toString(), bitmap);
            if (fileoutputstream == null) goto _L4; else goto _L3
_L3:
            try
            {
                fileoutputstream.flush();
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap.printStackTrace();
                return false;
            }
            return false;
            bitmap;
            obj = null;
_L6:
            if (obj != null)
            {
                try
                {
                    ((OutputStream) (obj)).flush();
                    ((OutputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((IOException) (obj)).printStackTrace();
                }
            }
            throw bitmap;
            bitmap;
            if (true) goto _L6; else goto _L5
_L5:
            bitmap;
              goto _L7
_L2:
            obj = null;
            if (true) goto _L9; else goto _L8
_L8:
        }

        protected transient Object a(Void avoid[])
        {
label0:
            {
                Bitmap bitmap = b.b(c, d);
                avoid = bitmap;
                if (e != null)
                {
                    if (!a(bitmap))
                    {
                        break label0;
                    }
                    avoid = e;
                }
                return avoid;
            }
            return null;
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            super.onPostExecute(obj);
            if (f != null)
            {
                f.a(obj);
            }
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            if (f != null)
            {
                f.a();
            }
        }

        public a(CropImageView cropimageview, int i1, int j1, String s)
        {
            a = CropImageActivity.this;
            super();
            b = cropimageview;
            c = i1;
            d = j1;
            e = s;
        }
    }

    private static interface b
    {

        public abstract void a();

        public abstract void a(Bitmap bitmap);

        public abstract void a(Object obj);
    }

    private class c extends com.cardinalblue.android.piccollage.controller.a.b
    {

        final CropImageActivity a;
        private Uri b;
        private b c;

        private void a(b b1)
        {
            c = b1;
        }

        static void a(c c1, b b1)
        {
            c1.a(b1);
        }

        protected transient Bitmap a(Void avoid[])
        {
            int i1 = 1;
            avoid = null;
            if (b != null)
            {
                try
                {
                    avoid = CropImageActivity.b(a).openInputStream(b);
                    Object obj = new android.graphics.BitmapFactory.Options();
                    obj.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(avoid, null, ((android.graphics.BitmapFactory.Options) (obj)));
                    avoid.close();
                    if (((android.graphics.BitmapFactory.Options) (obj)).outHeight > 2048 || ((android.graphics.BitmapFactory.Options) (obj)).outWidth > 2048)
                    {
                        i1 = (int)Math.pow(2D, (int)Math.round(Math.log(2048D / (double)Math.max(((android.graphics.BitmapFactory.Options) (obj)).outHeight, ((android.graphics.BitmapFactory.Options) (obj)).outWidth)) / Math.log(0.5D)));
                    }
                    obj = new android.graphics.BitmapFactory.Options();
                    obj.inSampleSize = i1;
                    avoid = CropImageActivity.b(a).openInputStream(b);
                    obj = BitmapFactory.decodeStream(avoid, null, ((android.graphics.BitmapFactory.Options) (obj)));
                    avoid.close();
                    avoid = com.cardinalblue.android.b.a.a(((Bitmap) (obj)), com.cardinalblue.android.b.k.a(a.getApplicationContext(), b), 2);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    Log.e("CropImageActivity", (new StringBuilder()).append("file ").append(b).append(" not found").toString());
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    Log.e("CropImageActivity", (new StringBuilder()).append("Load error: ").append(b).toString());
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    Log.e("CropImageActivity", (new StringBuilder()).append("Out Of Memory : ").append(b).toString());
                    return null;
                }
            }
            return avoid;
        }

        protected void a(Bitmap bitmap)
        {
            super.onPostExecute(bitmap);
            if (c != null)
            {
                c.a(bitmap);
            }
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Bitmap)obj);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
            if (c != null)
            {
                c.a();
            }
        }

        private c(Uri uri)
        {
            a = CropImageActivity.this;
            super();
            b = uri;
        }

    }


    private Uri a;
    private String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private CropImageView g;
    private ContentResolver h;
    private boolean i;
    private ProgressDialog j;
    private c k;
    private a l;
    private b m;

    public CropImageActivity()
    {
        a = null;
        b = null;
        m = new b() {

            final CropImageActivity a;

            public void a()
            {
                CropImageActivity.a(a);
            }

            public void a(Bitmap bitmap)
            {
                CropImageActivity.a(a, bitmap);
            }

            public void a(Object obj)
            {
                CropImageActivity.a(a, obj);
            }

            
            {
                a = CropImageActivity.this;
                super();
            }
        };
    }

    private void a(Bitmap bitmap)
    {
        j.hide();
        k = null;
        if (bitmap == null)
        {
            com.cardinalblue.android.b.k.a(this, 0x7f0700d4, 0);
            setResult(0);
            finish();
        }
        g.setImageBitmap(bitmap);
        g.invalidate();
    }

    static void a(CropImageActivity cropimageactivity)
    {
        cropimageactivity.b();
    }

    static void a(CropImageActivity cropimageactivity, Bitmap bitmap)
    {
        cropimageactivity.a(bitmap);
    }

    static void a(CropImageActivity cropimageactivity, Object obj)
    {
        cropimageactivity.a(obj);
    }

    private void a(Object obj)
    {
        Intent intent;
        boolean flag;
        flag = true;
        j.hide();
        l = null;
        intent = new Intent();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof Bitmap)) goto _L4; else goto _L3
_L3:
        intent.putExtra("return-data", (Bitmap)obj);
_L6:
        if (flag)
        {
            setResult(-1, intent);
        } else
        {
            setResult(0);
        }
        finish();
        return;
_L4:
        if (obj instanceof String)
        {
            intent.putExtra("output", (String)obj);
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static ContentResolver b(CropImageActivity cropimageactivity)
    {
        return cropimageactivity.h;
    }

    private void b()
    {
        com.cardinalblue.android.b.k.b(this, j);
    }

    private void onSaveClicked()
    {
        if (i)
        {
            return;
        } else
        {
            i = true;
            l = new a(g, e, f, b);
            a.a(l, m);
            l.a(new Void[0]);
            return;
        }
    }

    public boolean a()
    {
        return i;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030027);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        g = (CropImageView)findViewById(0x7f100077);
        bundle = getIntent();
        a = bundle.getData();
        if (a == null)
        {
            Log.w("CropImageActivity", "No input image!");
            finish();
            return;
        } else
        {
            c = bundle.getIntExtra("aspectX", 0);
            d = bundle.getIntExtra("aspectY", 0);
            e = bundle.getIntExtra("outputX", 150);
            e = bundle.getIntExtra("outputY", 150);
            b = bundle.getStringExtra("output");
            g.a(c, d);
            j = new ProgressDialog(this);
            j.setMessage(getString(0x7f070239));
            j.setCancelable(false);
            j.setCanceledOnTouchOutside(false);
            j.setProgressStyle(0);
            h = getContentResolver();
            k = new c(a);
            c.a(k, m);
            k.a(new Void[0]);
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110009, menu);
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (k != null && k.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            k.cancel(true);
            c.a(k, null);
        }
        if (l != null && l.getStatus() != android.os.AsyncTask.Status.FINISHED)
        {
            l.cancel(true);
            a.a(l, null);
        }
        com.cardinalblue.android.b.k.a(this, j);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   16908332: 38
    //                   2131755754: 44;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L2:
        onBackPressed();
_L5:
        return true;
_L3:
        onSaveClicked();
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }
}
