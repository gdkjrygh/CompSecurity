// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.AccountMgrActivity;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            k, FlickrAuthenActivity, q, l, 
//            m, n

public class FlickrListCloud extends Activity
    implements android.view.View.OnClickListener
{

    private Handler a;
    private com.roidapp.cloudlib.ads.l b;

    public FlickrListCloud()
    {
        a = new Handler();
    }

    private void a()
    {
        b();
        Intent intent = new Intent(this, al.g().d());
        intent.putExtra("fromCloud", true);
        startActivity(intent);
        finish();
    }

    private void a(OAuth oauth)
    {
        b();
        ak ak1 = al.g().b("Flickr");
        Intent intent = new Intent();
        intent.setClass(this, ak1.b);
        if (oauth != null)
        {
            com.roidapp.cloudlib.common.a.a(this, 0);
        } else
        {
            com.roidapp.cloudlib.common.a.a(this, 1);
        }
        startActivity(intent);
        finish();
    }

    static void a(FlickrListCloud flickrlistcloud)
    {
        com.roidapp.cloudlib.flickr.k.a();
        com.roidapp.cloudlib.flickr.k.a(flickrlistcloud);
    }

    static void a(FlickrListCloud flickrlistcloud, boolean flag)
    {
        OAuth oauth;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        oauth = com.roidapp.cloudlib.common.a.h(flickrlistcloud);
        if (oauth != null && oauth.getUser() != null) goto _L2; else goto _L1
_L1:
        flickrlistcloud.startActivityForResult(new Intent(flickrlistcloud, com/roidapp/cloudlib/flickr/FlickrAuthenActivity), 100);
_L4:
        return;
_L2:
        if (com.roidapp.cloudlib.common.a.g(flickrlistcloud).equals("")) goto _L4; else goto _L3
_L3:
        flickrlistcloud.a(oauth);
        return;
        flickrlistcloud.a(((OAuth) (null)));
        return;
    }

    public static boolean a(String s, OutputStream outputstream)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj1 = null;
        obj3 = null;
        l.a();
        Object obj2;
        Exception exception;
        int i;
        try
        {
            s = (HttpURLConnection)(new URL(s)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s = null;
            outputstream = null;
            obj1 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = null;
            outputstream = null;
        }
        try
        {
_L4:
            s.setConnectTimeout(10000);
            s.setReadTimeout(10000);
            obj = new BufferedInputStream(s.getInputStream(), 8192);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            outputstream = s;
            s = null;
            obj1 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = null;
            outputstream = s;
            s = ((String) (obj2));
            continue; /* Loop/switch isn't completed */
        }
        obj2 = new BufferedOutputStream(outputstream, 8192);
_L3:
        i = ((BufferedInputStream) (obj)).read();
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((BufferedOutputStream) (obj2)).write(i);
          goto _L3
        outputstream;
        obj1 = obj2;
        obj2 = outputstream;
        outputstream = s;
        s = ((String) (obj));
        obj = obj2;
_L7:
        Log.e("FlickrListCloud", (new StringBuilder("Error in downloadBitmap - ")).append(obj).toString());
        if (outputstream != null)
        {
            outputstream.disconnect();
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ((BufferedOutputStream) (obj1)).close();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return false;
_L2:
        if (s != null)
        {
            s.disconnect();
        }
        IOException ioexception;
        try
        {
            ((BufferedOutputStream) (obj2)).close();
            ((BufferedInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return true;
_L5:
        if (outputstream != null)
        {
            outputstream.disconnect();
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        ((BufferedOutputStream) (obj)).close();
        if (obj1 != null)
        {
            try
            {
                ((BufferedInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream) { }
        }
        throw s;
        obj1;
        obj2 = null;
        outputstream = s;
        s = ((String) (obj1));
        obj1 = obj;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        obj1;
        outputstream = s;
        s = ((String) (obj1));
        obj1 = obj;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = obj1;
        obj1 = s;
        s = exception;
        if (true) goto _L5; else goto _L4
        ioexception;
        outputstream = ((OutputStream) (obj));
        obj1 = s;
        obj = ioexception;
        s = outputstream;
        outputstream = ((OutputStream) (obj1));
        obj1 = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Handler b(FlickrListCloud flickrlistcloud)
    {
        return flickrlistcloud.a;
    }

    private void b()
    {
        if (b != null)
        {
            b.d();
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 104
    //                   100: 37;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        Object obj = null;
        OAuth oauth = obj;
        if (intent != null)
        {
            oauth = obj;
            if (intent.hasExtra("oauth"))
            {
                oauth = (OAuth)intent.getSerializableExtra("oauth");
            }
        }
        if (oauth == null)
        {
            Toast.makeText(this, at.i, 1).show();
            return;
        } else
        {
            Log.e("FlickrListCloud", "onOAuthDone startFlickMainActivity");
            a(oauth);
            return;
        }
_L2:
        if (com.roidapp.cloudlib.common.a.h(this) == null)
        {
            b();
            startActivity(new Intent(this, al.g().d()));
            finish();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onClick(View view)
    {
        if (view.getId() == ar.cH)
        {
            a();
        } else
        if (view.getId() == ar.f)
        {
            startActivityForResult(new Intent(this, com/roidapp/cloudlib/AccountMgrActivity), 2);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(as.B);
        ((TextView)findViewById(ar.cH)).setOnClickListener(this);
        bundle = (ImageButton)findViewById(ar.f);
        bundle.setAlpha(160);
        bundle.setOnClickListener(this);
        bundle = (ListView)findViewById(ar.aN);
        bundle.setAdapter(new q(this, this));
        bundle.setOnItemClickListener(new com.roidapp.cloudlib.flickr.l(this));
        bundle = (LinearLayout)findViewById(ar.br);
        if (b == null)
        {
            b = al.g().d(this, "cloud_list");
        }
        if (b != null)
        {
            b.a(this, bundle, "ca-app-pub-7109791911060569/9716033936");
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        android.app.AlertDialog.Builder builder;
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            builder = new android.app.AlertDialog.Builder(this);
            break;
        }
        builder.setPositiveButton(at.bo, new m(this));
        builder.setNegativeButton(at.ab, new n(this));
        builder.setCancelable(false).setMessage(at.aE);
        return builder.create();
    }

    protected void onDestroy()
    {
        b();
        if (b != null)
        {
            b.c();
        }
        b = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            a();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onPause()
    {
        if (b != null)
        {
            b.a();
        }
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
    }

    public void onResume()
    {
        super.onResume();
        if (b != null)
        {
            b.b();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        com.roidapp.baselib.c.b.c("Flickr/FlickrList");
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }
}
