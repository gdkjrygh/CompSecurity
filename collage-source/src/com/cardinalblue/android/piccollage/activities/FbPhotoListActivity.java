// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.network.d;
import com.cardinalblue.android.piccollage.model.gson.FbAlbum;
import com.cardinalblue.android.piccollage.model.gson.FbPhoto;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import com.cardinalblue.android.piccollage.view.a.i;
import com.cardinalblue.android.piccollage.view.fragments.e;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class FbPhotoListActivity extends BaseFragmentActivity
    implements android.content.DialogInterface.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private List a;
    private GridView b;
    private ViewSwitcher c;
    private int d;
    private GraphRequest e;
    private GraphRequestAsyncTask f;
    private i g;
    private View h;
    private TextView i;

    public FbPhotoListActivity()
    {
        d = 30;
    }

    static List a(FbPhotoListActivity fbphotolistactivity)
    {
        return fbphotolistactivity.a;
    }

    private void a()
    {
        if (e != null)
        {
            e.setCallback(null);
            e = null;
        }
        if (f != null)
        {
            f.cancel(true);
            f = null;
        }
    }

    static void a(FbPhotoListActivity fbphotolistactivity, FacebookRequestError facebookrequesterror)
    {
        fbphotolistactivity.a(facebookrequesterror);
    }

    static void a(FbPhotoListActivity fbphotolistactivity, Exception exception, String s, int j)
    {
        fbphotolistactivity.a(exception, s, j);
    }

    private void a(FacebookRequestError facebookrequesterror)
    {
        int j = 0;
        if (facebookrequesterror.getCategory() == com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE)
        {
            j = 1;
        }
        a(((Exception) (facebookrequesterror.getException())), getString(0x7f0700f8), j);
    }

    private void a(Exception exception, String s, int j)
    {
        setResult(j);
        k.a(this, com.cardinalblue.android.piccollage.view.fragments.e.a(getString(0x7f070220), s, getString(0x7f0702c6), this), "fbphotolist-error-dialog");
        com.cardinalblue.android.piccollage.a.f.a(exception);
    }

    static ViewSwitcher b(FbPhotoListActivity fbphotolistactivity)
    {
        return fbphotolistactivity.c;
    }

    private ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        if (a != null)
        {
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                FbPhoto fbphoto = (FbPhoto)iterator.next();
                if (fbphoto.isSelected())
                {
                    arraylist.add(fbphoto);
                }
            } while (true);
        }
        return arraylist;
    }

    private int c()
    {
        int l;
        if (a != null)
        {
            Iterator iterator = a.iterator();
            int j = 0;
            do
            {
                l = j;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((FbPhoto)iterator.next()).isSelected())
                {
                    j++;
                }
            } while (true);
        } else
        {
            l = 0;
        }
        return l;
    }

    static i c(FbPhotoListActivity fbphotolistactivity)
    {
        return fbphotolistactivity.g;
    }

    private void d()
    {
        boolean flag = false;
        int l = c();
        if (i != null)
        {
            Object obj = i;
            int j;
            if (l > 0)
            {
                j = 0;
            } else
            {
                j = 8;
            }
            ((TextView) (obj)).setVisibility(j);
            i.setText(Integer.toString(l));
        }
        if (h != null)
        {
            obj = h;
            if (l > 0)
            {
                flag = true;
            }
            ((View) (obj)).setEnabled(flag);
        }
    }

    static void d(FbPhotoListActivity fbphotolistactivity)
    {
        fbphotolistactivity.d();
    }

    public void a(String s)
    {
        Object obj = getIntent().getExtras();
        if (obj != null)
        {
            a();
            d = ((Bundle) (obj)).getInt("max_choices", 30);
            obj = ((FbAlbum)((Bundle) (obj)).getParcelable("extra_album")).getId();
            obj = (new StringBuilder()).append(((String) (obj))).append("/photos").toString();
            Bundle bundle = new Bundle();
            bundle.putString("fields", "images");
            bundle.putString("limit", "25");
            bundle.putString("after", s);
            e = GraphRequest.newGraphPathRequest(AccessToken.getCurrentAccessToken(), ((String) (obj)), new com.facebook.GraphRequest.Callback() {

                final FbPhotoListActivity a;

                public void onCompleted(GraphResponse graphresponse)
                {
                    Object obj1;
                    Object obj2;
                    if (FbPhotoListActivity.a(a).size() == 0)
                    {
                        FbPhotoListActivity.b(a).showNext();
                    }
                    obj1 = graphresponse.getError();
                    if (obj1 != null)
                    {
                        FbPhotoListActivity.a(a, ((FacebookRequestError) (obj1)));
                        return;
                    }
                    graphresponse = graphresponse.getRawResponse();
                    obj1 = "";
                    try
                    {
                        obj2 = com.cardinalblue.android.piccollage.controller.network.d.b(graphresponse);
                        if (((List) (obj2)).isEmpty())
                        {
                            FbPhotoListActivity.c(a).a("");
                            FbPhotoListActivity.c(a).notifyDataSetChanged();
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (GraphResponse graphresponse)
                    {
                        graphresponse.printStackTrace();
                        FbPhotoListActivity.a(a, graphresponse, a.getString(0x7f0700f8), 0);
                        return;
                    }
                    FbPhotoListActivity.a(a).addAll(((java.util.Collection) (obj2)));
                    com.cardinalblue.android.piccollage.activities.FbPhotoListActivity.d(a);
                    obj2 = new JSONObject(graphresponse);
                    graphresponse = ((GraphResponse) (obj1));
                    if (obj2 == null)
                    {
                        break MISSING_BLOCK_LABEL_181;
                    }
                    obj2 = ((JSONObject) (obj2)).getJSONObject("paging");
                    graphresponse = ((GraphResponse) (obj1));
                    if (obj2 == null)
                    {
                        break MISSING_BLOCK_LABEL_181;
                    }
                    obj2 = ((JSONObject) (obj2)).getJSONObject("cursors");
                    graphresponse = ((GraphResponse) (obj1));
                    if (obj2 == null)
                    {
                        break MISSING_BLOCK_LABEL_181;
                    }
                    graphresponse = ((JSONObject) (obj2)).getString("after");
                    FbPhotoListActivity.c(a).a(graphresponse);
                    FbPhotoListActivity.c(a).notifyDataSetChanged();
                    return;
                }

            
            {
                a = FbPhotoListActivity.this;
                super();
            }
            });
            e.setParameters(bundle);
            f = e.executeAsync();
        }
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030037);
        setSupportActionBar((Toolbar)findViewById(0x7f1000c5));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        c = (ViewSwitcher)findViewById(0x7f1000c1);
        b = (GridView)findViewById(0x7f1000d7);
        b.setOnItemClickListener(this);
        a = new ArrayList();
        g = new i(this, this, a);
        b.setAdapter(g);
        if (!k.b(this))
        {
            k.a(this, 0x7f07021d, 1);
            finish();
            return;
        } else
        {
            a("");
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11000e, menu);
        menu = menu.findItem(0x7f1002ea);
        View view = MenuItemCompat.getActionView(menu);
        h = view.findViewById(0x7f1000bf);
        h.setOnClickListener(new android.view.View.OnClickListener(menu) {

            final MenuItem a;
            final FbPhotoListActivity b;

            public void onClick(View view1)
            {
                b.onOptionsItemSelected(a);
            }

            
            {
                b = FbPhotoListActivity.this;
                a = menuitem;
                super();
            }
        });
        i = (TextView)view.findViewById(0x7f1000c0);
        d();
        return true;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a();
        g.c();
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        if (g.a(j))
        {
            return;
        }
        adapterview = (CheckableImageView)view;
        int j1 = c();
        int i1;
        if (adapterview.a())
        {
            i1 = -1;
        } else
        {
            i1 = 1;
        }
        i1 += j1;
        if (i1 <= d && i1 >= 0)
        {
            adapterview.b();
            ((FbPhoto)a.get(j)).setSelected(adapterview.a());
            d();
            return;
        } else
        {
            view = String.format(adapterview.getContext().getString(0x7f0702a4), new Object[] {
                Integer.valueOf(30)
            });
            k.a(adapterview.getContext(), view, 0);
            return;
        }
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
        finish();
_L5:
        return true;
_L3:
        menuitem = new Intent();
        menuitem.putExtra("extra_fb_photos", b());
        setResult(-1, menuitem);
        finish();
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onStart()
    {
        super.onStart();
        g.b();
    }

    protected void onStop()
    {
        super.onStop();
        g.a();
    }
}
