// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.AccountMgrActivity;
import com.roidapp.cloudlib.ads.l;
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

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramAuthActivity, l, i

public class InstagramListCloud extends Activity
    implements android.view.View.OnClickListener
{

    private Handler a;
    private com.roidapp.cloudlib.instagram.l b;
    private l c;

    public InstagramListCloud()
    {
        a = new Handler();
    }

    static Handler a(InstagramListCloud instagramlistcloud)
    {
        return instagramlistcloud.a;
    }

    private void a()
    {
        if (c != null)
        {
            c.d();
        }
    }

    static void a(InstagramListCloud instagramlistcloud, boolean flag)
    {
        if (flag)
        {
            if (TextUtils.isEmpty(com.roidapp.cloudlib.common.a.d(instagramlistcloud)))
            {
                instagramlistcloud.startActivityForResult(new Intent(instagramlistcloud, com/roidapp/cloudlib/instagram/InstagramAuthActivity), 3);
                return;
            } else
            {
                instagramlistcloud.a(flag);
                return;
            }
        } else
        {
            instagramlistcloud.a(flag);
            return;
        }
    }

    private void a(boolean flag)
    {
        a();
        ak ak1 = al.g().b("Instagram");
        Intent intent = new Intent();
        intent.setClass(this, ak1.b);
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        com.roidapp.cloudlib.common.a.a(j);
        startActivity(intent);
        finish();
    }

    public static boolean a(String s, OutputStream outputstream)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj1 = null;
        obj3 = null;
        com.roidapp.baselib.e.l.a();
        Object obj2;
        Exception exception;
        int j;
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
        j = ((BufferedInputStream) (obj)).read();
        if (j == -1) goto _L2; else goto _L1
_L1:
        ((BufferedOutputStream) (obj2)).write(j);
          goto _L3
        outputstream;
        obj1 = obj2;
        obj2 = outputstream;
        outputstream = s;
        s = ((String) (obj));
        obj = obj2;
_L7:
        Log.e("InstragramListCloud", (new StringBuilder("Error in downloadBitmap - ")).append(obj).toString());
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

    private void b()
    {
        a();
        Intent intent = new Intent(this, al.g().d());
        intent.putExtra("fromCloud", true);
        startActivity(intent);
        finish();
    }

    protected void onActivityResult(int j, int k, Intent intent)
    {
        super.onActivityResult(j, k, intent);
        j;
        JVM INSTR tableswitch 2 3: default 32
    //                   2 89
    //                   3 33;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        intent = com.roidapp.cloudlib.common.a.d(this);
        if (TextUtils.isEmpty(intent))
        {
            Toast.makeText(this, at.i, 1).show();
            return;
        } else
        {
            a(true);
            Bundle bundle = new Bundle();
            bundle.putString("KEY_INSTAGRAM_TOKEN", intent);
            al.g().a(this, bundle);
            return;
        }
_L2:
        if (b != null)
        {
            b.notifyDataSetChanged();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onClick(View view)
    {
        if (view.getId() == ar.cH)
        {
            b();
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
        setContentView(as.J);
        ((TextView)findViewById(ar.cH)).setOnClickListener(this);
        bundle = (ImageButton)findViewById(ar.f);
        bundle.setAlpha(160);
        bundle.setOnClickListener(this);
        bundle = (ListView)findViewById(ar.aN);
        b = new com.roidapp.cloudlib.instagram.l(this, this);
        bundle.setAdapter(b);
        bundle.setOnItemClickListener(new i(this));
        bundle = (LinearLayout)findViewById(ar.br);
        if (c == null)
        {
            c = al.g().d(this, "cloud_list");
        }
        if (c != null)
        {
            c.a(this, bundle, "ca-app-pub-7109791911060569/9716033936");
        }
    }

    protected void onDestroy()
    {
        a();
        if (c != null)
        {
            c.c();
        }
        c = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        if (j == 4)
        {
            b();
            return true;
        } else
        {
            return super.onKeyDown(j, keyevent);
        }
    }

    protected void onPause()
    {
        if (c != null)
        {
            c.a();
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (c != null)
        {
            c.b();
        }
    }

    protected void onStart()
    {
        com.roidapp.baselib.c.b.c("Instagram/LoginList");
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }
}
