// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ViewSwitcher;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.login.FbLoginForReadActivity;
import com.cardinalblue.android.piccollage.controller.network.d;
import com.cardinalblue.android.piccollage.model.gson.FbAlbum;
import com.cardinalblue.android.piccollage.model.gson.FbFriend;
import com.cardinalblue.android.piccollage.view.a.g;
import com.cardinalblue.android.piccollage.view.a.s;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseListActivity, FbFriendListActivity, FbPhotoListActivity

public class FbAlbumListActivity extends BaseListActivity
    implements android.content.DialogInterface.OnClickListener, android.widget.AdapterView.OnItemClickListener, com.cardinalblue.android.piccollage.view.a.s.a
{

    private String a;
    private ViewSwitcher b;
    private GraphRequest c;
    private GraphRequestAsyncTask d;
    private s e;
    private String f;

    public FbAlbumListActivity()
    {
    }

    static s a(FbAlbumListActivity fbalbumlistactivity)
    {
        return fbalbumlistactivity.e;
    }

    static List a(FbAlbumListActivity fbalbumlistactivity, String s1)
    {
        return fbalbumlistactivity.a(s1);
    }

    private List a(String s1)
    {
        Object obj1 = new ArrayList();
        Object obj = com.cardinalblue.android.piccollage.controller.network.d.a(s1);
        if (!((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        f = "";
        return ((List) (obj));
_L8:
        int i;
        if (i >= ((List) (obj)).size()) goto _L4; else goto _L3
_L3:
        obj1 = (FbAlbum)((List) (obj)).get(i);
        if (((FbAlbum) (obj1)).getCount() == 0)
        {
            ((List) (obj)).remove(obj1);
        }
          goto _L5
_L4:
        if (a.equals("me"))
        {
            obj1 = new FbAlbum();
            ((FbAlbum) (obj1)).setCoverPhotoUrl(null);
            ((FbAlbum) (obj1)).setName(getString(0x7f0701b9));
            ((FbAlbum) (obj1)).setId("<friends_albums>");
            ((List) (obj)).add(0, obj1);
        }
        s1 = new JSONObject(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        s1 = s1.getJSONObject("paging");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        s1 = s1.getJSONObject("cursors");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        f = s1.getString("after");
        return ((List) (obj));
        obj;
        s1 = ((String) (obj1));
_L6:
        a(((Exception) (obj)));
        return s1;
        JSONException jsonexception;
        jsonexception;
        s1 = ((String) (obj));
        obj = jsonexception;
        if (true) goto _L6; else goto _L2
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(int i)
    {
        if (b().getDisplayedChild() != i)
        {
            b().setDisplayedChild(i);
        }
    }

    static void a(FbAlbumListActivity fbalbumlistactivity, int i)
    {
        fbalbumlistactivity.a(i);
    }

    static void a(FbAlbumListActivity fbalbumlistactivity, FacebookRequestError facebookrequesterror)
    {
        fbalbumlistactivity.a(facebookrequesterror);
    }

    private void a(FacebookRequestError facebookrequesterror)
    {
        if (facebookrequesterror.getCategory() == com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE)
        {
            e();
            return;
        } else
        {
            a(((Exception) (facebookrequesterror.getException())));
            return;
        }
    }

    private void a(Exception exception)
    {
        if (!isFinishing())
        {
            try
            {
                showDialog(0);
            }
            catch (android.view.WindowManager.BadTokenException badtokenexception)
            {
                com.cardinalblue.android.piccollage.a.f.a(badtokenexception);
            }
        }
        com.cardinalblue.android.piccollage.a.f.a(exception);
    }

    private ViewSwitcher b()
    {
        if (b == null)
        {
            b = (ViewSwitcher)findViewById(0x7f1000c1);
        }
        return b;
    }

    static String b(FbAlbumListActivity fbalbumlistactivity)
    {
        return fbalbumlistactivity.f;
    }

    private void c()
    {
        a(0);
        d();
        Bundle bundle = new Bundle();
        bundle.putString("fields", "picture{url},name,count");
        bundle.putString("limit", "25");
        String s1 = String.format("%s/albums", new Object[] {
            a
        });
        c = GraphRequest.newGraphPathRequest(AccessToken.getCurrentAccessToken(), s1, new com.facebook.GraphRequest.Callback() {

            final FbAlbumListActivity a;

            public void onCompleted(GraphResponse graphresponse)
            {
                FbAlbumListActivity.a(a).b();
                FbAlbumListActivity.a(a, 1);
                FacebookRequestError facebookrequesterror = graphresponse.getError();
                if (facebookrequesterror != null)
                {
                    FbAlbumListActivity.a(a, facebookrequesterror);
                    return;
                }
                graphresponse = FbAlbumListActivity.a(a, graphresponse.getRawResponse());
                ((g)FbAlbumListActivity.a(a).c()).clear();
                ((g)FbAlbumListActivity.a(a).c()).addAll(graphresponse);
                graphresponse = FbAlbumListActivity.a(a);
                boolean flag;
                if (!TextUtils.isEmpty(com.cardinalblue.android.piccollage.activities.FbAlbumListActivity.b(a)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                graphresponse.a(flag);
                FbAlbumListActivity.a(a).notifyDataSetChanged();
            }

            
            {
                a = FbAlbumListActivity.this;
                super();
            }
        });
        c.setParameters(bundle);
        d = c.executeAsync();
    }

    private void d()
    {
        if (c != null)
        {
            c.setCallback(null);
            c = null;
        }
        if (d != null)
        {
            d.cancel(true);
            d = null;
        }
    }

    private void e()
    {
        com.cardinalblue.android.piccollage.a.c.a(this);
        f();
    }

    private void f()
    {
        com.cardinalblue.android.piccollage.a.b.ba();
        com.cardinalblue.android.piccollage.a.b.aj("facebook photos");
        startActivityForResult(new Intent(this, com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity), 200);
    }

    public void a()
    {
        d();
        Bundle bundle = new Bundle();
        bundle.putString("fields", "picture{url},name,count");
        bundle.putString("limit", "25");
        bundle.putString("after", f);
        String s1 = String.format("%s/albums", new Object[] {
            a
        });
        c = GraphRequest.newGraphPathRequest(AccessToken.getCurrentAccessToken(), s1, new com.facebook.GraphRequest.Callback() {

            final FbAlbumListActivity a;

            public void onCompleted(GraphResponse graphresponse)
            {
                FbAlbumListActivity.a(a).b();
                FacebookRequestError facebookrequesterror = graphresponse.getError();
                if (facebookrequesterror != null)
                {
                    FbAlbumListActivity.a(a, facebookrequesterror);
                    return;
                }
                graphresponse = FbAlbumListActivity.a(a, graphresponse.getRawResponse());
                ((g)FbAlbumListActivity.a(a).c()).addAll(graphresponse);
                graphresponse = FbAlbumListActivity.a(a);
                boolean flag;
                if (!TextUtils.isEmpty(com.cardinalblue.android.piccollage.activities.FbAlbumListActivity.b(a)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                graphresponse.a(flag);
                FbAlbumListActivity.a(a).notifyDataSetChanged();
            }

            
            {
                a = FbAlbumListActivity.this;
                super();
            }
        });
        c.setParameters(bundle);
        d = c.executeAsync();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR tableswitch 200 202: default 36
    //                   200 73
    //                   201 37
    //                   202 99;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        if (j != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (intent.hasExtra("extra_fb_photos"))
        {
            setResult(-1, intent);
            finish();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (j != 1) goto _L1; else goto _L5
_L5:
        e();
        return;
_L2:
        if (j == -1)
        {
            a = "me";
            c();
            return;
        } else
        {
            setResult(0);
            finish();
            return;
        }
_L4:
        if (j == -1)
        {
            if (intent.hasExtra("extra_album"))
            {
                setTitle(getString(0x7f0702a9, new Object[] {
                    ((FbAlbum)intent.getParcelableExtra("extra_album")).getName()
                }));
            }
            if (intent.hasExtra("extra_fb_friend"))
            {
                a = ((FbFriend)intent.getParcelableExtra("extra_fb_friend")).getId();
                c();
                return;
            }
        } else
        {
            setTitle(0x7f0702a7);
            a = "me";
            c();
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030025);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        int i = getResources().getDimensionPixelSize(0x7f0b0137);
        e = new s(this, new g(this, i), i, i);
        e.b(this);
        bundle = (ListView)findViewById(0x7f1000c2);
        bundle.setAdapter(e);
        bundle.setOnItemClickListener(this);
        if (!k.b(this))
        {
            k.a(this, 0x7f07021d, 1);
            finish();
            return;
        }
        if (AccessToken.getCurrentAccessToken() == null)
        {
            f();
            return;
        }
        if (getIntent().hasExtra("extra_fb_friend"))
        {
            a = ((FbFriend)getIntent().getParcelableExtra("extra_fb_friend")).getId();
        } else
        {
            a = "me";
        }
        c();
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 0: // '\0'
            return (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f070220)).setMessage(getString(0x7f0700f8)).setCancelable(false).setPositiveButton(getString(0x7f0702c6), this).create();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        d();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (FbAlbum)((g)e.c()).getItem(i);
        i = getIntent().getExtras().getInt("max_choices", 30);
        if (adapterview.getId().equals("<friends_albums>"))
        {
            adapterview = new Intent(this, com/cardinalblue/android/piccollage/activities/FbFriendListActivity);
            adapterview.putExtra("max_choices", i);
            startActivityForResult(adapterview, 202);
            return;
        } else
        {
            view = new Intent(this, com/cardinalblue/android/piccollage/activities/FbPhotoListActivity);
            view.putExtra("extra_album", adapterview);
            view.putExtra("max_choices", i);
            startActivityForResult(view, 201);
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }
}
