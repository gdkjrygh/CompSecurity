// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestAsyncTask;
import com.facebook.GraphResponse;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.ah;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.common.b;
import com.roidapp.cloudlib.t;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.facebook:
//            ag, ai, al, aj, 
//            FbAlbumListActivity, w, ah

public class FbPhotoFragment extends t
    implements com.facebook.GraphRequest.Callback
{

    private RelativeLayout o;
    private boolean p;
    private int q;
    private int r;
    private GraphRequest s;
    private GraphRequestAsyncTask t;
    private android.content.DialogInterface.OnClickListener u;

    public FbPhotoFragment()
    {
        u = new ag(this);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            o.setVisibility(0);
            return;
        } else
        {
            o.setVisibility(8);
            return;
        }
    }

    static boolean a(FbPhotoFragment fbphotofragment)
    {
        return fbphotofragment.j();
    }

    static boolean a(FbPhotoFragment fbphotofragment, boolean flag)
    {
        fbphotofragment.p = flag;
        return flag;
    }

    private void b(Exception exception)
    {
        if (exception == null)
        {
            return;
        } else
        {
            Log.e("FbPhotoFragment", (new StringBuilder()).append(exception.getMessage()).toString());
            exception = getString(at.T);
            Toast.makeText(getActivity(), exception, 0).show();
            return;
        }
    }

    private void i()
    {
        if (s != null)
        {
            s.setCallback(null);
            s = null;
        }
        if (t != null)
        {
            t.cancel(true);
            t = null;
        }
    }

    private boolean j()
    {
        return o.getVisibility() == 0;
    }

    protected final android.widget.AbsListView.OnScrollListener a()
    {
        return new ai(this);
    }

    public final void d()
    {
        if (!j()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        int k;
        b b1 = com.roidapp.cloudlib.common.a.a();
        obj = b1.a;
        k = b1.b;
        if (!p) goto _L4; else goto _L3
_L3:
        if (r >= k) goto _L6; else goto _L5
_L5:
        (new StringBuilder("onLoadPhotoMore, albumid=")).append(((String) (obj))).append(",begin=").append(q).append(",end=").append(r).append(",photoCount=").append(k);
        a(true);
        if (!((String) (obj)).equals(""))
        {
            i();
            String s1 = (new StringBuilder()).append(((String) (obj))).append("/photos").toString();
            obj = new Bundle();
            if (p)
            {
                ((Bundle) (obj)).putString("offset", (new StringBuilder()).append(r).toString());
                ((Bundle) (obj)).putString("limit", "100");
            } else
            {
                int j1 = 100;
                int k1 = q - 100;
                int i1 = k1;
                if (k1 < 0)
                {
                    i1 = 0;
                    j1 = q + 0;
                }
                ((Bundle) (obj)).putString("offset", String.valueOf(i1));
                ((Bundle) (obj)).putString("limit", String.valueOf(j1));
            }
            s = GraphRequest.newGraphPathRequest(com.roidapp.cloudlib.facebook.al.b(), s1, this);
            s.setParameters(((Bundle) (obj)));
            t = s.executeAsync();
            return;
        }
_L6:
        if (true) goto _L1; else goto _L4
_L4:
        if (q <= 0)
        {
            return;
        }
          goto _L5
    }

    public final void g()
    {
        if (j())
        {
            return;
        } else
        {
            Log.i("FbPhotoFragment", "refreshPhotos.");
            d = new aj(this, getActivity());
            c.setAdapter(d);
            com.roidapp.cloudlib.common.a.n(getActivity());
            r = 0;
            q = 0;
            p = true;
            d();
            return;
        }
    }

    public final void h()
    {
        a(false);
        Log.i("FbPhotoFragment", "doBack");
        b b1 = com.roidapp.cloudlib.common.a.a();
        Intent intent = new Intent(getActivity(), com/roidapp/cloudlib/facebook/FbAlbumListActivity);
        intent.putExtra("user_id", b1.d);
        intent.putExtra("user_name", b1.e);
        startActivity(intent);
        getActivity().finish();
        com.roidapp.cloudlib.common.a.b();
    }

    public void onCompleted(GraphResponse graphresponse)
    {
        if (getActivity() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        a(false);
        FacebookRequestError facebookrequesterror = graphresponse.getError();
        if (facebookrequesterror != null)
        {
            b(facebookrequesterror.getException());
            return;
        }
        graphresponse = graphresponse.getJSONObject();
        if (graphresponse == null) goto _L1; else goto _L3
_L3:
        graphresponse = graphresponse.toString();
        graphresponse = (new w()).b(graphresponse);
        if (!p)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        r = r + graphresponse.size();
_L4:
        if (d != null)
        {
            ((aj)d).a(graphresponse, p);
        }
        (new StringBuilder("Load photo, begin=")).append(q).append(",end=").append(r).append(",get size=").append(graphresponse.size());
        return;
        try
        {
            q = q - graphresponse.size();
        }
        // Misplaced declaration of an exception variable
        catch (GraphResponse graphresponse)
        {
            b(graphresponse);
            return;
        }
          goto _L4
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new ah(getActivity()));
        d = new aj(this, getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.p, viewgroup, false);
        a(layoutinflater);
        b(layoutinflater);
        o = (RelativeLayout)layoutinflater.findViewById(ar.l);
        int k = (com.roidapp.cloudlib.common.a.m(getActivity()) / 100) * 100;
        r = k;
        q = k;
        if (l.b(getActivity()))
        {
            p = true;
            d();
            return layoutinflater;
        } else
        {
            l.a(getActivity(), u, new com.roidapp.cloudlib.facebook.ah(this));
            return layoutinflater;
        }
    }

    public void onDestroy()
    {
        Log.i("FbPhotoFragment", (new StringBuilder("onDestroy. ")).append(this).toString());
        super.onDestroy();
        i();
        System.gc();
    }

    public void onPause()
    {
        super.onPause();
        Log.i("FbPhotoFragment", (new StringBuilder("onPause, ")).append(this).toString());
    }

    public void onResume()
    {
        super.onResume();
        Log.i("FbPhotoFragment", (new StringBuilder("onResume, ")).append(this).toString());
    }
}
