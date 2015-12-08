// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.support.v4.app.i;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.tinder.a.f;
import com.tinder.adapters.k;
import com.tinder.d.a;
import com.tinder.e.ax;
import com.tinder.managers.ManagerApp;
import com.tinder.model.Career;
import com.tinder.model.School;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            m

public class FragmentSchool extends m
{

    private static int j = 2;
    private k h;
    private List i;
    private boolean k;
    private List l;

    public FragmentSchool()
    {
    }

    static List a(FragmentSchool fragmentschool)
    {
        return fragmentschool.i;
    }

    static boolean b(FragmentSchool fragmentschool)
    {
        fragmentschool.k = true;
        return true;
    }

    static void c(FragmentSchool fragmentschool)
    {
        fragmentschool.f();
    }

    static k d(FragmentSchool fragmentschool)
    {
        return fragmentschool.h;
    }

    static int e()
    {
        return j;
    }

    static List e(FragmentSchool fragmentschool)
    {
        return fragmentschool.l;
    }

    private void f()
    {
        Iterator iterator = i.iterator();
        boolean flag = true;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((School)iterator.next()).isDisplayed)
            {
                flag = false;
            }
        } while (true);
        a(flag);
    }

    public final void b()
    {
        a();
        Object obj = b.getCareer();
        if (((Career) (obj)).hasSchools())
        {
            i = ((Career) (obj)).getSchools();
            l = new ArrayList();
            obj = i.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                School school = (School)((Iterator) (obj)).next();
                if (school.isDisplayed)
                {
                    l.add(school.id);
                }
            } while (true);
            h = new k(i);
            setListAdapter(h);
            getListView().setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final FragmentSchool a;

                public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
                {
                    int j1 = 0;
                    int k1 = 0;
                    while (j1 < com.tinder.fragments.FragmentSchool.a(a).size()) 
                    {
                        adapterview = (School)com.tinder.fragments.FragmentSchool.a(a).get(j1);
                        if (j1 == i1)
                        {
                            if (k1 < FragmentSchool.e())
                            {
                                boolean flag;
                                if (!((School) (adapterview)).isDisplayed)
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                adapterview.isDisplayed = flag;
                            } else
                            {
                                adapterview.isDisplayed = true;
                            }
                        } else
                        if (k1 > FragmentSchool.e())
                        {
                            adapterview.isDisplayed = false;
                        }
                        if (((School) (adapterview)).isDisplayed)
                        {
                            k1++;
                            if (k1 == FragmentSchool.e() + 1)
                            {
                                j1 = -1;
                            }
                        }
                        j1++;
                    }
                    FragmentSchool.b(a);
                    FragmentSchool.c(a);
                    FragmentSchool.d(a).notifyDataSetChanged();
                }

            
            {
                a = FragmentSchool.this;
                super();
            }
            });
            a.setOnClickListener(new android.view.View.OnClickListener() {

                final FragmentSchool a;

                public final void onClick(View view)
                {
                    for (view = com.tinder.fragments.FragmentSchool.a(a).iterator(); view.hasNext();)
                    {
                        ((School)view.next()).isDisplayed = false;
                    }

                    FragmentSchool.b(a);
                    a.a(true);
                    FragmentSchool.d(a).notifyDataSetChanged();
                }

            
            {
                a = FragmentSchool.this;
                super();
            }
            });
            f();
            return;
        } else
        {
            setListAdapter(new k(new ArrayList()));
            getListView().setPadding(0, 0, 0, 0);
            v.b("No school");
            return;
        }
    }

    public final int c()
    {
        return 0x7f0300b0;
    }

    public final int d()
    {
        return 0x7f0300b1;
    }

    public void onPause()
    {
        super.onPause();
        if (!k) goto _L2; else goto _L1
_L1:
        Object obj;
        JSONArray jsonarray;
        ArrayList arraylist;
        Iterator iterator;
        obj = new JSONObject();
        jsonarray = new JSONArray();
        arraylist = new ArrayList();
        iterator = i.iterator();
        int i1 = 0;
_L3:
        School school;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        school = (School)iterator.next();
        int j1 = i1;
        if (!school.isDisplayed)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        j1 = i1 + 1;
        JSONObject jsonobject = new JSONObject();
        arraylist.add(school.id);
        jsonobject.put("id", school.id);
        jsonarray.put(jsonobject);
        break MISSING_BLOCK_LABEL_270;
        if (i1 == 0)
        {
            try
            {
                e.m();
                obj = new com.tinder.a.a(3, d.Z, com.tinder.a.a.k(), "", new ax() {

                    final FragmentSchool a;

                    public final void a(int k1)
                    {
                        if (k1 == 204)
                        {
                            com.tinder.managers.a.a(new SparksEvent("School.Deny"));
                            return;
                        } else
                        {
                            Toast.makeText(a.getContext(), 0x7f06024a, 0).show();
                            return;
                        }
                    }

            
            {
                a = FragmentSchool.this;
                super();
            }
                });
                ManagerApp.b().a(((com.android.volley.Request) (obj)));
                return;
            }
            catch (Exception exception)
            {
                Toast.makeText(getActivity(), getString(0x7f06024a), 0).show();
            }
            break MISSING_BLOCK_LABEL_264;
        }
        ((JSONObject) (obj)).put("schools", jsonarray);
        obj = new com.tinder.a.a(2, d.Y, com.tinder.a.a.k(), ((JSONObject) (obj)).toString(), new ax(arraylist) {

            final List a;
            final FragmentSchool b;

            public final void a(int k1)
            {
                if (k1 == 204) goto _L2; else goto _L1
_L1:
                b.getActivity().runOnUiThread(new Runnable(this) {

                    final _cls3 a;

                    public final void run()
                    {
                        Toast.makeText(a.b.getActivity(), a.b.getString(0x7f06024a), 0).show();
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
_L4:
                return;
_L2:
label0:
                {
                    Iterator iterator1;
                    String s;
                    if (FragmentSchool.e(b).size() != a.size())
                    {
                        k1 = 1;
                    } else
                    {
                        k1 = 0;
                    }
                    if (k1 != 0)
                    {
                        break label0;
                    }
                    iterator1 = FragmentSchool.e(b).iterator();
                    do
                    {
                        if (!iterator1.hasNext())
                        {
                            break label0;
                        }
                        s = (String)iterator1.next();
                    } while (a.contains(s));
                    k1 = 1;
                }
                if (FragmentSchool.e(b).isEmpty() && !a.isEmpty())
                {
                    b.e.l();
                    com.tinder.managers.a.a("School.Set");
                    return;
                }
                if (k1 != 0)
                {
                    com.tinder.managers.a.a("School.Change");
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                b = FragmentSchool.this;
                a = list;
                super();
            }
        });
        ManagerApp.b().a(((com.android.volley.Request) (obj)));
        b.getCareer().setSchools(i);
        return;
        v.b("Failed to save schools");
        return;
        i1 = j1;
        if (true) goto _L3; else goto _L2
_L2:
    }

}
