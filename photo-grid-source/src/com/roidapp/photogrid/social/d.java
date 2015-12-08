// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.social;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.e.l;
import com.roidapp.cloudlib.facebook.FbLoginActivity;
import com.roidapp.cloudlib.facebook.al;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.g.c;
import com.roidapp.cloudlib.sns.g.e;
import com.roidapp.cloudlib.sns.login.a;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.social:
//            g, e, f

public final class d extends Fragment
    implements android.view.View.OnClickListener, android.widget.AbsListView.OnScrollListener, c
{

    private SwipeRefreshLayout2 a;
    private ListView b;
    private TextView c;
    private TextView d;
    private View e;
    private View f;
    private View g;
    private View h;
    private TextView i;
    private a j;
    private int k;
    private com.roidapp.cloudlib.sns.b.a.d l;
    private long m;
    private boolean n;
    private boolean o;
    private GraphRequest p;
    private GraphRequest q;
    private List r;
    private o s;
    private boolean t;
    private boolean u;

    public d()
    {
    }

    static com.roidapp.cloudlib.sns.b.a.d a(d d1)
    {
        return d1.l;
    }

    static com.roidapp.cloudlib.sns.b.a.d a(d d1, com.roidapp.cloudlib.sns.b.a.d d2)
    {
        d1.l = d2;
        return d2;
    }

    public static d a(int i1)
    {
        d d1 = new d();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", i1);
        d1.setArguments(bundle);
        return d1;
    }

    static void a(d d1, GraphResponse graphresponse)
    {
        if (d1.getActivity() == null || graphresponse.getRequest() != d1.p) goto _L2; else goto _L1
_L1:
        d1.p = null;
        Object obj = graphresponse.getError();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((FacebookRequestError) (obj)).getException();
        }
        obj1 = obj;
        if (graphresponse.getJSONObject() == null)
        {
            obj1 = obj;
            if (obj == null)
            {
                obj1 = new FacebookException("GraphObjectPagingLoader received neither a result nor an error.");
            }
        }
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        d1.d();
_L2:
        return;
_L4:
        JSONArray jsonarray = graphresponse.getJSONObject().optJSONArray("data");
        int j1 = jsonarray.length();
        int i1;
        if (j1 > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        d1.q = graphresponse.getRequestForPagedResults(com.facebook.GraphResponse.PagingDirection.NEXT);
        if (d1.r == null)
        {
            d1.r = new ArrayList();
        } else
        {
            d1.r.clear();
        }
        i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                break;
            }
            try
            {
                graphresponse = jsonarray.getJSONObject(i1);
                d1.r.add(graphresponse.optString("id"));
            }
            // Misplaced declaration of an exception variable
            catch (GraphResponse graphresponse)
            {
                d1.d();
                return;
            }
            i1++;
        } while (true);
        graphresponse = TextUtils.join(",", d1.r.toArray());
        if (d1.getActivity() != null)
        {
            d1.s = com.roidapp.cloudlib.sns.q.a(com.roidapp.cloudlib.sns.b.q.a(aj.a()).c().a, d1.m, graphresponse, new g(d1, (byte)0));
            d1.s.a(d1);
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        d1.q = null;
        if (d1.getActivity() == null) goto _L2; else goto _L6
_L6:
        d1.a();
        if (d1.j == null) goto _L2; else goto _L7
_L7:
        if (d1.l == null || d1.l.size() <= 0) goto _L9; else goto _L8
_L8:
        d1.c.setText(d1.getString(0x7f07035c, new Object[] {
            Integer.valueOf(d1.l.size())
        }));
        d1.c.setVisibility(0);
_L11:
        d1.j.a(d1.l);
        d1.j.notifyDataSetChanged();
        return;
_L9:
        if (d1.e.getVisibility() != 0)
        {
            d1.e.setVisibility(0);
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    static a b(d d1)
    {
        return d1.j;
    }

    private void b()
    {
        o = false;
        if (j != null)
        {
            if (f.getVisibility() != 8)
            {
                f.setVisibility(8);
            }
            if (af.a(aj.a()))
            {
                p p1 = com.roidapp.cloudlib.sns.b.q.a(aj.a()).c();
                m = p1.b.a;
                j.a(m);
                if (k == 1)
                {
                    a.a(true);
                    u = true;
                    com.roidapp.cloudlib.sns.q.a(p1.a, p1.b.a, true, new g(this, (byte)0)).a(this);
                    return;
                }
                if (al.b() != null)
                {
                    a.a(true);
                    u = true;
                    e();
                    return;
                }
                n = true;
                if (g.getVisibility() != 0)
                {
                    g.setVisibility(0);
                    return;
                }
            } else
            {
                getActivity().finish();
                return;
            }
        }
    }

    static int c(d d1)
    {
        return d1.k;
    }

    private void c()
    {
        if (com.roidapp.baselib.e.l.b(getActivity()))
        {
            o = true;
            d.setText(0x7f07006b);
        } else
        {
            d.setText(0x7f0700db);
        }
        if (f.getVisibility() != 0)
        {
            f.setVisibility(0);
        }
    }

    static View d(d d1)
    {
        return d1.f;
    }

    private void d()
    {
        if (getActivity() == null)
        {
            return;
        }
        a();
        if (l != null && l.size() > 0)
        {
            c.setText(getString(0x7f07035c, new Object[] {
                Integer.valueOf(l.size())
            }));
            c.setVisibility(0);
            return;
        } else
        {
            c();
            return;
        }
    }

    static TextView e(d d1)
    {
        return d1.c;
    }

    private void e()
    {
        GraphRequest graphrequest = GraphRequest.newGraphPathRequest(al.b(), "me/friends", null);
        HashSet hashset = new HashSet();
        hashset.addAll(Arrays.asList(new String[] {
            "id"
        }));
        Bundle bundle = graphrequest.getParameters();
        bundle.putString("fields", TextUtils.join(",", hashset));
        graphrequest.setParameters(bundle);
        graphrequest.setCallback(new com.roidapp.photogrid.social.e(this));
        p = graphrequest;
        q = null;
        GraphRequest.executeBatchAsync(new GraphRequestBatch(new GraphRequest[] {
            graphrequest
        }));
    }

    static View f(d d1)
    {
        return d1.e;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (!af.a(getActivity())) goto _L2; else goto _L1
_L1:
        if (j != null && q != null && !u)
        {
            u = true;
            a.a(true);
            a.setEnabled(false);
            if (q != null)
            {
                q.setCallback(new f(this));
                p = q;
                GraphRequest.executeBatchAsync(new GraphRequestBatch(new GraphRequest[] {
                    p
                }));
            }
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a.b())
        {
            a.a(false);
        }
        an.a(getActivity(), 0x7f0700c4);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static TextView g(d d1)
    {
        return d1.d;
    }

    static void h(d d1)
    {
        d1.c();
    }

    public final void a()
    {
        a.setEnabled(false);
        a.a(false);
        u = false;
    }

    public final void a(e e1, Object obj)
    {
        if (e1 == e.a && j != null)
        {
            j.notifyDataSetChanged();
        }
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (j == null)
        {
            j = new a(this, l, m, true, "SuggestFriend");
        }
        b.setAdapter(j);
        b();
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d0073)
        {
            com.roidapp.photogrid.common.q.a(getActivity());
        } else
        {
            if (view.getId() == 0x7f0d0074)
            {
                (new com.roidapp.photogrid.common.o(getActivity())).a();
                return;
            }
            if (view.getId() == 0x7f0d0077)
            {
                view = new Intent(getActivity(), com/roidapp/cloudlib/facebook/FbLoginActivity);
                view.putExtra("page_name", "suggest_fb_friends");
                view.putExtra("need_load_user_info", false);
                getActivity().startActivityForResult(view, 13271);
                return;
            }
            if (view.getId() == 0x7f0d0070)
            {
                if (com.roidapp.baselib.e.l.b(getActivity()))
                {
                    if (c.getVisibility() != 4)
                    {
                        c.setVisibility(4);
                    }
                    b();
                    return;
                } else
                {
                    com.roidapp.baselib.e.l.a(getActivity(), null);
                    return;
                }
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = getArguments().getInt("page_type", -1);
        com.roidapp.cloudlib.sns.g.b.a().a(e.a, this);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030011, null);
        a = (SwipeRefreshLayout2)layoutinflater.findViewById(0x7f0d006e);
        b = (ListView)layoutinflater.findViewById(0x7f0d006f);
        viewgroup = a;
        if (viewgroup != null)
        {
            float f1 = getResources().getDimension(0x7f090167);
            int i1 = (int)((float)getResources().getDimensionPixelSize(0x7f0900dd) - f1 / 2.0F);
            viewgroup.a(i1, (int)(f1 + (float)i1));
            viewgroup.a(new int[] {
                0xff008000, 0xffff0000, -23296, -256
            });
        }
        c = new TextView(getActivity());
        viewgroup = new android.widget.AbsListView.LayoutParams(-1, -2);
        c.setLayoutParams(viewgroup);
        c.setPadding(0, getActivity().getResources().getDimensionPixelSize(0x7f090009), 0, getActivity().getResources().getDimensionPixelSize(0x7f090009));
        c.setTextSize(0, getActivity().getResources().getDimensionPixelSize(0x7f090009));
        c.setTypeface(Typeface.defaultFromStyle(1));
        c.setTextColor(getResources().getColor(0x106000b));
        c.setBackgroundColor(getResources().getColor(0x7f0c0025));
        c.setGravity(1);
        c.setMaxLines(2);
        if (k == 1)
        {
            c.setText(0x7f070373);
        } else
        {
            c.setText(getString(0x7f07035c, new Object[] {
                Integer.valueOf(0)
            }));
        }
        c.setVisibility(4);
        b.addHeaderView(c);
        f = layoutinflater.findViewById(0x7f0d0070);
        f.setVisibility(8);
        f.setOnClickListener(this);
        d = (TextView)layoutinflater.findViewById(0x7f0d0071);
        e = layoutinflater.findViewById(0x7f0d0072);
        e.setVisibility(8);
        g = layoutinflater.findViewById(0x7f0d0075);
        g.setVisibility(8);
        h = layoutinflater.findViewById(0x7f0d0077);
        h.setBackgroundDrawable(com.roidapp.baselib.c.n.a(0xff3a5796, 0xff2a4277, com.roidapp.cloudlib.common.d.a(getResources(), 2.0F)));
        h.setOnClickListener(this);
        i = (TextView)layoutinflater.findViewById(0x7f0d0078);
        com.roidapp.baselib.c.n.a(i, 0x7f02038a, 0, 0);
        layoutinflater.findViewById(0x7f0d0073).setOnClickListener(this);
        layoutinflater.findViewById(0x7f0d0074).setOnClickListener(this);
        b.setOnScrollListener(this);
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        if (j != null)
        {
            j.a();
        }
    }

    public final void onResume()
    {
        super.onResume();
        if (k == 0 && n && al.b() != null)
        {
            if (g.getVisibility() != 8)
            {
                g.setVisibility(8);
            }
            a.a(true);
            u = true;
            if (c.getVisibility() != 4)
            {
                c.setVisibility(4);
            }
            e();
        } else
        if (f.getVisibility() == 0 && o && com.roidapp.baselib.e.l.b(getActivity()))
        {
            if (c.getVisibility() != 4)
            {
                c.setVisibility(4);
            }
            b();
            return;
        }
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        boolean flag;
        if (k1 == i1 + j1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        t = flag;
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (t && !u && i1 == 0)
        {
            f();
        }
    }
}
