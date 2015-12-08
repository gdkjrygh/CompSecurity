// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.AccountMgrActivity;
import com.roidapp.cloudlib.ads.l;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.common.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            e, j, h, i, 
//            al, FbFriendListActivity, w, b, 
//            k, FbLoginActivity, f, c, 
//            d

public class FbAlbumListActivity extends Activity
    implements android.view.View.OnClickListener, com.facebook.GraphRequest.Callback
{

    private android.content.DialogInterface.OnClickListener A;
    private android.widget.AdapterView.OnItemClickListener B;
    public final String a = "album_id";
    public final String b = "album_name";
    public final String c = "caption";
    public final String d = "purpose";
    public final String e = "user_id";
    public final String f = "user_name";
    public final String g = "<friends_albums>";
    protected ProgressBar h;
    private final String i = "FbAlbumListActivity";
    private final int j = 1;
    private final int k = 2;
    private final int l = 0;
    private final String m = "me";
    private GraphRequest n;
    private String o;
    private String p;
    private List q;
    private ListView r;
    private GraphRequestAsyncTask s;
    private RelativeLayout t;
    private ImageButton u;
    private ImageButton v;
    private TextView w;
    private int x;
    private l y;
    private final List z = new ArrayList();

    public FbAlbumListActivity()
    {
        A = new e(this);
        B = new j(this);
    }

    static List a(FbAlbumListActivity fbalbumlistactivity)
    {
        return fbalbumlistactivity.z;
    }

    private void a(Exception exception)
    {
        if (exception == null)
        {
            return;
        }
        Log.e("FbAlbumListActivity", (new StringBuilder()).append(exception.getMessage()).toString());
        String s1;
        String s2;
        try
        {
            s2 = (new StringBuilder()).append(exception.getMessage()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        s1 = s2;
        if (exception.getMessage() == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s1 = s2;
        if (!exception.getMessage().contains("validate certificate"))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s1 = s2;
        if (exception.getMessage().contains("time"))
        {
            s1 = getString(at.aZ);
        }
        com.roidapp.cloudlib.common.d.a(this, s1, new h(this), new i(this));
        return;
    }

    private void a(String s1)
    {
        o = s1;
        c();
        Bundle bundle = new Bundle();
        bundle.putString("limit", "1000");
        s1 = String.format("%s/albums", new Object[] {
            s1
        });
        n = GraphRequest.newGraphPathRequest(com.roidapp.cloudlib.facebook.al.b(), s1, this);
        n.setParameters(bundle);
        s1 = new GraphRequestBatch(new GraphRequest[] {
            n
        });
        s1.setTimeout(8000);
        s = GraphRequest.executeBatchAsync(s1);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            t.setVisibility(0);
            return;
        } else
        {
            t.setVisibility(8);
            return;
        }
    }

    static void b(FbAlbumListActivity fbalbumlistactivity)
    {
        if (!fbalbumlistactivity.isFinishing())
        {
            fbalbumlistactivity.v.setVisibility(4);
            fbalbumlistactivity.h.setVisibility(0);
        }
    }

    private void b(String s1)
    {
        w.setText(s1);
    }

    private void c()
    {
        if (n != null)
        {
            n.setCallback(null);
            n = null;
        }
        if (s != null)
        {
            s.cancel(true);
            s = null;
        }
    }

    static void c(FbAlbumListActivity fbalbumlistactivity)
    {
        if (!fbalbumlistactivity.isFinishing() && fbalbumlistactivity.z.size() == 0)
        {
            fbalbumlistactivity.h.setVisibility(4);
            fbalbumlistactivity.v.setVisibility(0);
        }
    }

    private void d()
    {
        if (t.getVisibility() == 0)
        {
            return;
        } else
        {
            r.setAdapter(null);
            a(true);
            a(o);
            return;
        }
    }

    static void d(FbAlbumListActivity fbalbumlistactivity)
    {
        fbalbumlistactivity.d();
    }

    static List e(FbAlbumListActivity fbalbumlistactivity)
    {
        return fbalbumlistactivity.q;
    }

    private void e()
    {
        if (o == null || o.equals("me"))
        {
            p = com.roidapp.cloudlib.common.a.k(this);
            b(getString(at.ba, new Object[] {
                p
            }));
            return;
        } else
        {
            u.setVisibility(8);
            RelativeLayout relativelayout = (RelativeLayout)findViewById(ar.bu);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(11);
            relativelayout.setLayoutParams(layoutparams);
            return;
        }
    }

    static String f(FbAlbumListActivity fbalbumlistactivity)
    {
        return fbalbumlistactivity.o;
    }

    static String g(FbAlbumListActivity fbalbumlistactivity)
    {
        return fbalbumlistactivity.p;
    }

    static int h(FbAlbumListActivity fbalbumlistactivity)
    {
        return fbalbumlistactivity.x;
    }

    protected final void a()
    {
        if (y != null)
        {
            y.d();
        }
    }

    protected final void b()
    {
        a();
        if (o != null && !"me".equals(o))
        {
            startActivity(new Intent(this, com/roidapp/cloudlib/facebook/FbFriendListActivity));
        } else
        {
            Intent intent = new Intent(this, al.g().d());
            intent.putExtra("fromCloud", true);
            startActivity(intent);
        }
        finish();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        i1;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 37
    //                   1 36
    //                   2 87;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (j1 != -1)
        {
            a();
            startActivity(new Intent(this, al.g().d()));
            finish();
            return;
        } else
        {
            a("me");
            e();
            al.g().a(this);
            return;
        }
_L3:
        if (!al.c())
        {
            a();
            startActivity(new Intent(this, al.g().d()));
            finish();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onClick(View view)
    {
        if (view.getId() == ar.f)
        {
            startActivityForResult(new Intent(this, com/roidapp/cloudlib/AccountMgrActivity), 2);
        } else
        {
            if (view.getId() == ar.cH)
            {
                b();
                return;
            }
            if (view.getId() == ar.bU)
            {
                d();
                return;
            }
        }
    }

    public void onCompleted(GraphResponse graphresponse)
    {
        int i1 = 0;
        if (!isFinishing() && graphresponse != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a(false);
        Object obj = graphresponse.getError();
        if (obj != null)
        {
            a(((FacebookRequestError) (obj)).getException());
            return;
        }
        obj = graphresponse.getJSONObject();
        graphresponse = "";
        if (obj != null)
        {
            graphresponse = ((JSONObject) (obj)).toString();
        }
        if (com.roidapp.cloudlib.facebook.al.b() == null) goto _L1; else goto _L3
_L3:
        q = (new w()).a(com.roidapp.cloudlib.facebook.al.a(), graphresponse);
        (new StringBuilder("album list count = ")).append(q.size());
_L6:
        if (i1 >= q.size()) goto _L5; else goto _L4
_L4:
        if (((com.roidapp.cloudlib.facebook.b)q.get(i1)).a() != 0)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        q.remove(i1);
        i1--;
        break MISSING_BLOCK_LABEL_256;
_L5:
        try
        {
            (new StringBuilder("album list left count = ")).append(q.size());
            if (o.equals("me"))
            {
                graphresponse = new com.roidapp.cloudlib.facebook.b();
                graphresponse.a(null);
                graphresponse.c(getString(at.Q));
                graphresponse.b("<friends_albums>");
                q.add(0, graphresponse);
            }
            r.setAdapter(new k(this, this, q));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (GraphResponse graphresponse)
        {
            a(graphresponse);
        }
        return;
        i1++;
          goto _L6
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(as.d);
        r = (ListView)findViewById(ar.bv);
        r.setOnItemClickListener(B);
        h = (ProgressBar)findViewById(ar.bQ);
        t = (RelativeLayout)findViewById(ar.l);
        u = (ImageButton)findViewById(ar.f);
        u.setAlpha(160);
        u.setOnClickListener(this);
        w = (TextView)findViewById(ar.cH);
        w.setOnClickListener(this);
        v = (ImageButton)findViewById(ar.bU);
        v.setAlpha(160);
        v.setOnClickListener(this);
        x = getResources().getDimensionPixelSize(ap.h);
        com.roidapp.cloudlib.common.a.b();
        if (al.g().a(bundle))
        {
            a();
            startActivity(new Intent(this, al.g().a()));
            finish();
        } else
        if (com.roidapp.baselib.e.l.b(this))
        {
            if (al.c())
            {
                if (getIntent().hasExtra("user_name"))
                {
                    p = getIntent().getStringExtra("user_name");
                    b(getString(at.ba, new Object[] {
                        p
                    }));
                }
                if (getIntent().hasExtra("user_id"))
                {
                    o = getIntent().getStringExtra("user_id");
                    a(o);
                } else
                {
                    a("me");
                    o = "me";
                }
                a(true);
                if (o.equals("me"))
                {
                    p = com.roidapp.cloudlib.common.a.k(this);
                    b(getString(at.ba, new Object[] {
                        p
                    }));
                }
                Log.i("FbAlbumListActivity", (new StringBuilder("album, userid[")).append(o).append("],userName[").append(p).append("]").toString());
            } else
            {
                startActivityForResult(new Intent(this, com/roidapp/cloudlib/facebook/FbLoginActivity), 0);
            }
            e();
            bundle = (LinearLayout)findViewById(ar.br);
            if (y == null)
            {
                y = al.g().d(this, "cloud_list");
            }
            if (y != null)
            {
                y.a(this, bundle, "ca-app-pub-7109791911060569/9716033936");
                return;
            }
        } else
        {
            com.roidapp.baselib.e.l.a(this, A, new f(this));
            return;
        }
    }

    protected Dialog onCreateDialog(int i1)
    {
        android.app.AlertDialog.Builder builder;
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            builder = new android.app.AlertDialog.Builder(this);
            break;
        }
        builder.setPositiveButton(at.bo, new c(this));
        builder.setNegativeButton(at.ab, new com.roidapp.cloudlib.facebook.d(this));
        builder.setCancelable(false).setMessage(at.aE);
        return builder.create();
    }

    protected void onDestroy()
    {
        a();
        if (y != null)
        {
            y.c();
        }
        y = null;
        c();
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            b();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onPause()
    {
        if (y != null)
        {
            y.a();
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (y != null)
        {
            y.b();
        }
    }

    protected void onStart()
    {
        com.roidapp.baselib.c.b.c("Facebook/FacebookAlbumList");
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }
}
