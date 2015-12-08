// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.i;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.d;
import com.facebook.login.e;
import com.tinder.e.ax;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.f;
import com.tinder.managers.z;
import com.tinder.model.Career;
import com.tinder.model.Job;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            m

public class FragmentJob extends m
{

    f h;
    private com.tinder.adapters.f i;
    private List j;
    private List k;
    private Job l;
    private View m;
    private boolean n;
    private Job o;
    private com.facebook.d p;

    public FragmentJob()
    {
        ManagerApp.h().a(this);
        h = ManagerApp.h().e();
        p = new CallbackManagerImpl();
        com.facebook.login.d.a().a(p, new com.facebook.f() {

            final FragmentJob a;

            public final void a()
            {
            }

            public final void a(FacebookException facebookexception)
            {
                v.b(facebookexception.getMessage());
            }

            public final void a(Object obj)
            {
                AccessToken.a(((e)obj).a);
                obj = new ProgressDialog(a.getActivity());
                ((ProgressDialog) (obj)).setIndeterminate(true);
                ((ProgressDialog) (obj)).setMessage("Fetching your work history");
                if (a.isAdded())
                {
                    ((ProgressDialog) (obj)).show();
                }
                Career.forceRefreshCareer(new com.tinder.model.Career.ForceRefreshListener(this, ((ProgressDialog) (obj))) {

                    final ProgressDialog a;
                    final _cls1 b;

                    public final void onFailure()
                    {
                        a.dismiss();
                        Toast.makeText(b.a.getActivity(), 0x7f060248, 0);
                    }

                    public final void onProfileLoaded()
                    {
                        if (com.tinder.fragments.FragmentJob.a(b.a) != null)
                        {
                            com.tinder.fragments.FragmentJob.a(b.a).setVisibility(8);
                        }
                        b.a.b = b.a.f.b();
                        b.a.b();
                        a.dismiss();
                    }

            
            {
                b = _pcls1;
                a = progressdialog;
                super();
            }
                });
            }

            
            {
                a = FragmentJob.this;
                super();
            }
        });
    }

    static View a(FragmentJob fragmentjob)
    {
        return fragmentjob.m;
    }

    static Job a(FragmentJob fragmentjob, Job job)
    {
        fragmentjob.l = job;
        return job;
    }

    static List b(FragmentJob fragmentjob)
    {
        return fragmentjob.k;
    }

    static boolean c(FragmentJob fragmentjob)
    {
        fragmentjob.n = true;
        return true;
    }

    static com.tinder.adapters.f d(FragmentJob fragmentjob)
    {
        return fragmentjob.i;
    }

    public final void b()
    {
        boolean flag2 = true;
        Object obj = (TextView)getView().findViewById(0x7f0e02e5);
        TextView textview = (TextView)c.findViewById(0x7f0e01b5);
        ((TextView) (obj)).setText(Html.fromHtml(getString(0x7f060223)));
        textview.setText(Html.fromHtml(getString(0x7f0600f0)));
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final FragmentJob a;

            public final void onClick(View view)
            {
                view = new Intent("android.intent.action.VIEW", Uri.parse(com.tinder.a.f.aa));
                a.startActivity(view);
            }

            
            {
                a = FragmentJob.this;
                super();
            }
        };
        ((TextView) (obj)).setOnClickListener(onclicklistener);
        textview.setOnClickListener(onclicklistener);
        if (!ManagerApp.h().e().a("user_work_history"))
        {
            obj = getView().findViewById(0x7f0e02ed);
            m = ((View) (obj));
            ((View) (obj)).setVisibility(0);
            getView().findViewById(0x7f0e02e4).setOnClickListener(new android.view.View.OnClickListener() {

                final FragmentJob a;

                public final void onClick(View view)
                {
                    view = a;
                    ((FragmentJob) (view)).h.a(view, new String[] {
                        "user_work_history"
                    });
                }

            
            {
                a = FragmentJob.this;
                super();
            }
            });
        }
        obj = b.getCareer();
        if (((Career) (obj)).hasJobs())
        {
            o = b.getCareer().getMyJob();
        }
        k = new ArrayList();
        i = new com.tinder.adapters.f(k);
        a();
        setListAdapter(i);
        if (((Career) (obj)).hasJobs())
        {
            j = ((Career) (obj)).getJobs();
            obj = new ArrayList();
            int i1 = 0;
            while (i1 < j.size()) 
            {
                Job job = (Job)j.get(i1);
                Job job2 = new Job();
                job2.companyId = job.companyId;
                job2.titleId = job.titleId;
                job2.setCompany(job.getCompany());
                job2.setTitle(job.getTitle());
                job2.companyId = job.companyId;
                job2.titleId = job.titleId;
                Job job3;
                Job job4;
                boolean flag;
                if (job.companyShown && job.titleShown)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                job2.titleShown = flag;
                job2.companyShown = flag;
                job3 = new Job();
                job3.setTitle(job.getTitle());
                job3.titleId = job.titleId;
                if (job.titleShown && !job.companyShown)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                job3.titleShown = flag;
                job4 = new Job();
                job4.setCompany(job.getCompany());
                job4.companyId = job.companyId;
                if (job.companyShown && !job.titleShown)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                job4.companyShown = flag;
                ((List) (obj)).add(Integer.valueOf(k.size()));
                if (job2.hasCompany() && job2.hasTitle())
                {
                    k.add(job2);
                }
                if (job3.hasTitle())
                {
                    k.add(job3);
                }
                if (job4.hasCompany())
                {
                    k.add(job4);
                }
                i1++;
            }
            i.a = ((List) (obj));
            i.notifyDataSetChanged();
            getListView().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final FragmentJob a;

                public final void onItemClick(AdapterView adapterview, View view, int j1, long l1)
                {
                    if (j1 < FragmentJob.b(a).size())
                    {
                        int k1 = 0;
                        while (k1 < FragmentJob.b(a).size()) 
                        {
                            adapterview = (Job)FragmentJob.b(a).get(k1);
                            if (k1 == j1)
                            {
                                adapterview.companyShown = adapterview.hasCompany();
                                adapterview.titleShown = adapterview.hasTitle();
                                com.tinder.fragments.FragmentJob.a(a, adapterview);
                                a.a(false);
                            } else
                            {
                                adapterview.titleShown = false;
                                adapterview.companyShown = false;
                            }
                            k1++;
                        }
                        FragmentJob.c(a);
                        com.tinder.fragments.FragmentJob.d(a).notifyDataSetChanged();
                    }
                }

            
            {
                a = FragmentJob.this;
                super();
            }
            });
            a.setOnClickListener(new android.view.View.OnClickListener() {

                final FragmentJob a;

                public final void onClick(View view)
                {
                    for (view = FragmentJob.b(a).iterator(); view.hasNext();)
                    {
                        Job job5 = (Job)view.next();
                        job5.titleShown = false;
                        job5.companyShown = false;
                    }

                    com.tinder.fragments.FragmentJob.a(a, null);
                    FragmentJob.c(a);
                    a.a(true);
                    com.tinder.fragments.FragmentJob.d(a).notifyDataSetChanged();
                }

            
            {
                a = FragmentJob.this;
                super();
            }
            });
            obj = j.iterator();
            boolean flag1 = flag2;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Job job1 = (Job)((Iterator) (obj)).next();
                if (job1.companyShown || job1.titleShown)
                {
                    flag1 = false;
                }
            } while (true);
            a(flag1);
            return;
        } else
        {
            v.b("No jobs but permission given (showing only footer)");
            return;
        }
    }

    public final int c()
    {
        return 0x7f0300a1;
    }

    public final int d()
    {
        return 0x7f0300a2;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        p.a(i1, j1, intent);
    }

    public void onPause()
    {
        super.onPause();
        if (!n) goto _L2; else goto _L1
_L1:
        if (l != null) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = b.getCareer().getJobs();
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
        {
            Job job1 = (Job)iterator.next();
            job1.companyShown = false;
            job1.titleShown = false;
        }

          goto _L5
_L2:
        return;
_L5:
        try
        {
            b.getCareer().setJobs(((List) (obj)));
            com.tinder.managers.a.a(new SparksEvent("Job.Deny"));
            obj = new com.tinder.a.a(3, d.X, com.tinder.a.a.k(), "", new ax() {

                final FragmentJob a;

                public final void a(int i1)
                {
                    if (i1 != 204)
                    {
                        Toast.makeText(a.getActivity(), 0x7f060249, 0).show();
                    }
                }

            
            {
                a = FragmentJob.this;
                super();
            }
            });
            ManagerApp.b().a(((com.android.volley.Request) (obj)));
            e.o();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b("JSON Exception while saving job");
            Toast.makeText(getActivity(), 0x7f060249, 0).show();
        }
        if (true) goto _L2; else goto _L4
_L4:
        obj = b.getCareer().getJobs().iterator();
        boolean flag = false;
_L7:
        Job job;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_425;
        }
        job = (Job)((Iterator) (obj)).next();
        job.companyShown = false;
        job.titleShown = false;
        if (!l.hasCompany() || !l.hasTitle())
        {
            break MISSING_BLOCK_LABEL_337;
        }
        boolean flag1;
        if (job.getCompany().equals(l.getCompany()) && job.getTitle().equals(l.getTitle()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l == null || !flag1 || flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        job.companyShown = l.companyShown;
        job.titleShown = l.titleShown;
        if (o == null)
        {
            com.tinder.managers.a.a(new SparksEvent("Job.Set"));
            e.n();
            break;
        }
        break MISSING_BLOCK_LABEL_395;
        if (l.hasCompany())
        {
            flag1 = job.getCompany().equals(l.getCompany());
            continue;
        }
        if (l.hasTitle())
        {
            flag1 = job.getTitle().equals(l.getTitle());
            continue;
        }
        break MISSING_BLOCK_LABEL_559;
        if (!l.equals(o))
        {
            com.tinder.managers.a.a(new SparksEvent("Job.Change"));
        }
        break;
        Object obj1 = new JSONObject();
        if (l.companyShown)
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("id", l.companyId);
            ((JSONObject) (obj1)).put("company", jsonobject);
        }
        if (l.titleShown)
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("id", l.titleId);
            ((JSONObject) (obj1)).put("title", jsonobject1);
        }
        obj1 = new com.tinder.a.a(2, d.W, com.tinder.a.a.k(), ((JSONObject) (obj1)).toString(), new ax() {

            final FragmentJob a;

            public final void a(int i1)
            {
                if (i1 != 204 && a.getActivity() != null)
                {
                    a.getActivity().runOnUiThread(new Runnable(this) {

                        final _cls6 a;

                        public final void run()
                        {
                            Toast.makeText(a.a.getActivity(), 0x7f060249, 0).show();
                        }

            
            {
                a = _pcls6;
                super();
            }
                    });
                }
            }

            
            {
                a = FragmentJob.this;
                super();
            }
        });
        ManagerApp.b().a(((com.android.volley.Request) (obj1)));
        return;
        for (flag1 = false; true;)
        {
            break MISSING_BLOCK_LABEL_266;
        }

        flag = true;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
