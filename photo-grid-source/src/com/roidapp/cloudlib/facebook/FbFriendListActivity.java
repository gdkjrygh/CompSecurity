// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.ai;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            r, s, al, FbAlbumListActivity, 
//            w, t, o, p, 
//            q

public class FbFriendListActivity extends Activity
    implements android.view.View.OnClickListener, com.facebook.GraphRequest.Callback, ai
{

    protected ah a;
    protected ProgressBar b;
    private List c;
    private ListView d;
    private RelativeLayout e;
    private TextView f;
    private ImageButton g;
    private GraphRequestAsyncTask h;
    private GraphRequest i;
    private String j;
    private ImageView k;
    private com.roidapp.cloudlib.ads.l l;
    private final List m = new ArrayList();
    private android.widget.AdapterView.OnItemClickListener n;
    private android.content.DialogInterface.OnClickListener o;

    public FbFriendListActivity()
    {
        n = new r(this);
        o = new s(this);
    }

    static ImageView a(FbFriendListActivity fbfriendlistactivity)
    {
        return fbfriendlistactivity.k;
    }

    private void a(Throwable throwable)
    {
        if (throwable != null)
        {
            j = throwable.getMessage();
        }
        Log.e("FbFriendListActivity", (new StringBuilder("get friend list failed, ")).append(j).toString());
        showDialog(1);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            e.setVisibility(0);
            return;
        } else
        {
            e.setVisibility(8);
            return;
        }
    }

    static List b(FbFriendListActivity fbfriendlistactivity)
    {
        return fbfriendlistactivity.c;
    }

    private void b()
    {
        if (i != null)
        {
            i.setCallback(null);
            i = null;
        }
        if (h != null)
        {
            h.cancel(true);
            h = null;
        }
    }

    private void c()
    {
        b();
        d.setAdapter(null);
        if (com.roidapp.baselib.e.l.b(this))
        {
            a(true);
            i = GraphRequest.newGraphPathRequest(com.roidapp.cloudlib.facebook.al.b(), "me/friends", this);
            h = i.executeAsync();
            return;
        } else
        {
            com.roidapp.baselib.e.l.a(this, o);
            return;
        }
    }

    static void c(FbFriendListActivity fbfriendlistactivity)
    {
        fbfriendlistactivity.d();
    }

    static List d(FbFriendListActivity fbfriendlistactivity)
    {
        return fbfriendlistactivity.m;
    }

    private void d()
    {
        a();
        startActivity(new Intent(this, com/roidapp/cloudlib/facebook/FbAlbumListActivity));
        finish();
    }

    public final void a()
    {
        if (l != null)
        {
            l.d();
        }
    }

    public final void a(Message message)
    {
        if (message.what == 8480)
        {
            g.setVisibility(4);
            b.setVisibility(0);
        } else
        if (message.what == 8481 && m.size() == 0)
        {
            b.setVisibility(4);
            g.setVisibility(0);
            return;
        }
    }

    public void onClick(View view)
    {
        if (view.getId() == ar.bU)
        {
            if (e.getVisibility() != 0)
            {
                c();
            }
        } else
        if (view.getId() == ar.cH)
        {
            d();
            return;
        }
    }

    public void onCompleted(GraphResponse graphresponse)
    {
        if (!isFinishing() && graphresponse != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a(false);
        FacebookRequestError facebookrequesterror = graphresponse.getError();
        if (facebookrequesterror != null)
        {
            a(facebookrequesterror.getException());
            return;
        }
        graphresponse = graphresponse.getJSONObject();
        if (graphresponse == null) goto _L1; else goto _L3
_L3:
        Object obj;
        obj = new w();
        al.a();
        obj = ((w) (obj)).a(graphresponse.toString());
        if (obj == null)
        {
            try
            {
                a(new Throwable("FB friend list is null"));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (GraphResponse graphresponse)
            {
                graphresponse.printStackTrace();
            }
            a(graphresponse);
            return;
        }
        c = ((List) (obj));
        graphresponse = new t(this, this, ((List) (obj)));
        (new StringBuilder("friend count ")).append(((List) (obj)).size());
        d.setAdapter(graphresponse);
        obj = (EditText)findViewById(ar.bo);
        ((EditText) (obj)).addTextChangedListener(new o(this, graphresponse));
        k.setOnClickListener(new p(this, ((EditText) (obj))));
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(as.e);
        e = (RelativeLayout)findViewById(ar.l);
        f = (TextView)findViewById(ar.cH);
        f.setOnClickListener(this);
        d = (ListView)findViewById(ar.bw);
        d.setOnItemClickListener(n);
        b = (ProgressBar)findViewById(ar.bQ);
        g = (ImageButton)findViewById(ar.bU);
        g.setAlpha(160);
        g.setOnClickListener(this);
        k = (ImageView)findViewById(ar.bV);
        a = new ah(this);
        a.a(this);
        if (al.g().a(bundle))
        {
            a();
            startActivity(new Intent(this, al.g().a()));
            finish();
        } else
        {
            c();
            bundle = (LinearLayout)findViewById(ar.br);
            if (l == null)
            {
                l = al.g().d(this, "cloud_list");
            }
            if (l != null)
            {
                l.a(this, bundle, "ca-app-pub-7109791911060569/9716033936");
                return;
            }
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
            builder = (new android.app.AlertDialog.Builder(this)).setTitle(getString(at.b));
            break;
        }
        String s1;
        if (j == null)
        {
            s1 = getString(at.h);
        } else
        {
            s1 = j;
        }
        return builder.setMessage(s1).setCancelable(false).setPositiveButton(getString(at.bo), new q(this)).create();
    }

    protected void onDestroy()
    {
        a();
        if (l != null)
        {
            l.c();
        }
        l = null;
        b();
        super.onDestroy();
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            d();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    protected void onPause()
    {
        if (l != null)
        {
            l.a();
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (l != null)
        {
            l.b();
        }
    }

    protected void onStart()
    {
        com.roidapp.baselib.c.b.c("Facebook/FacebookFriendList");
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }
}
