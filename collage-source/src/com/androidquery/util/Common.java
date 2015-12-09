// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.util;

import android.app.Activity;
import android.app.Dialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Gallery;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import com.androidquery.a;
import com.androidquery.callback.BitmapAjaxCallback;
import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.androidquery.util:
//            a

public class Common
    implements TextWatcher, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemLongClickListener, android.widget.AdapterView.OnItemSelectedListener, Runnable, Comparator
{

    private Object a;
    private String b;
    private Object c[];
    private boolean d;
    private Class e[];
    private int f;
    private int g;
    private android.widget.AbsListView.OnScrollListener h;
    private int i;
    private android.widget.AdapterView.OnItemSelectedListener j;
    private boolean k;

    public Common()
    {
        g = 0;
        k = false;
    }

    private transient Object a(Object aobj[])
    {
        if (b != null)
        {
            if (c != null)
            {
                aobj = c;
            }
            Object obj1 = a;
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = this;
            }
            return com.androidquery.util.a.a(obj, b, d, true, e, aobj);
        }
        if (f == 0) goto _L2; else goto _L1
_L1:
        f;
        JVM INSTR tableswitch 1 2: default 84
    //                   1 125
    //                   2 86;
           goto _L2 _L3 _L4
_L2:
        return null;
_L4:
        com.androidquery.util.a.a((File)c[0], ((Long)c[1]).longValue(), ((Long)c[2]).longValue());
        continue; /* Loop/switch isn't completed */
_L3:
        com.androidquery.util.a.b((File)c[0], (byte[])c[1]);
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void a(AbsListView abslistview, int l)
    {
        int i1 = abslistview.getCount();
        int j1 = abslistview.getLastVisiblePosition();
        if (l == 0 && i1 == j1 + 1)
        {
            if (j1 != i)
            {
                i = j1;
                a(new Object[] {
                    abslistview, Integer.valueOf(l)
                });
            }
            return;
        } else
        {
            i = -1;
            return;
        }
    }

    private void a(ExpandableListView expandablelistview, int l)
    {
        expandablelistview.setTag(0x40ff0004, Integer.valueOf(l));
        if (l != 0) goto _L2; else goto _L1
_L1:
        ExpandableListAdapter expandablelistadapter;
        int i1;
        int j1;
        i1 = expandablelistview.getFirstVisiblePosition();
        j1 = expandablelistview.getLastVisiblePosition();
        expandablelistadapter = expandablelistview.getExpandableListAdapter();
        l = 0;
_L5:
        if (l <= j1 - i1) goto _L3; else goto _L2
_L2:
        return;
_L3:
        long l2 = expandablelistview.getExpandableListPosition(l + i1);
        int k1 = ExpandableListView.getPackedPositionGroup(l2);
        int l1 = ExpandableListView.getPackedPositionChild(l2);
        if (k1 >= 0)
        {
            View view = expandablelistview.getChildAt(l);
            Long long1 = (Long)view.getTag(0x40ff0004);
            if (long1 != null && long1.longValue() == l2)
            {
                if (l1 == -1)
                {
                    expandablelistadapter.getGroupView(k1, expandablelistview.isGroupExpanded(k1), view, expandablelistview);
                } else
                {
                    boolean flag;
                    if (l1 == expandablelistadapter.getChildrenCount(k1) - 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    expandablelistadapter.getChildView(k1, l1, flag, view, expandablelistview);
                }
                view.setTag(0x40ff0004, null);
            }
        }
        l++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a(Object obj, String s, boolean flag)
    {
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof View)) goto _L4; else goto _L3
_L3:
        View view = (View)obj;
        Object obj1;
        if (obj instanceof ProgressBar)
        {
            obj = (ProgressBar)obj;
        } else
        {
            obj = null;
        }
        if (!flag) goto _L6; else goto _L5
_L5:
        view.setTag(0x40ff0001, s);
        view.setVisibility(0);
        if (obj != null)
        {
            ((ProgressBar) (obj)).setProgress(0);
            ((ProgressBar) (obj)).setMax(100);
        }
_L2:
        return;
_L6:
        obj1 = view.getTag(0x40ff0001);
        if (obj1 == null || obj1.equals(s))
        {
            view.setTag(0x40ff0001, null);
            if (obj == null || ((ProgressBar) (obj)).isIndeterminate())
            {
                view.setVisibility(8);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj instanceof Dialog)
        {
            obj = (Dialog)obj;
            s = new a(((Dialog) (obj)).getContext());
            if (flag)
            {
                s.a(((Dialog) (obj)));
                return;
            } else
            {
                s.b(((Dialog) (obj)));
                return;
            }
        }
        if (obj instanceof Activity)
        {
            obj = (Activity)obj;
            ((Activity) (obj)).setProgressBarIndeterminateVisibility(flag);
            ((Activity) (obj)).setProgressBarVisibility(flag);
            if (flag)
            {
                ((Activity) (obj)).setProgress(0);
                return;
            }
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    public static boolean a(int l, int i1, View view, ViewGroup viewgroup, String s)
    {
        if (s == null || BitmapAjaxCallback.f(s))
        {
            return false;
        }
        s = (AbsListView)viewgroup;
        if ((android.widget.AbsListView.OnScrollListener)viewgroup.getTag(0x40ff0002) == null)
        {
            Common common = new Common();
            s.setOnScrollListener(common);
            viewgroup.setTag(0x40ff0002, common);
        }
        s = (Integer)s.getTag(0x40ff0004);
        if (s == null || s.intValue() == 0 || s.intValue() == 1)
        {
            return false;
        }
        long l1 = i1;
        if (viewgroup instanceof ExpandableListView)
        {
            l1 = ExpandableListView.getPackedPositionForChild(l, i1);
        }
        view.setTag(0x40ff0004, Long.valueOf(l1));
        return true;
    }

    public static boolean a(int l, View view, ViewGroup viewgroup, String s)
    {
        if (viewgroup instanceof Gallery)
        {
            return b(l, view, viewgroup, s);
        } else
        {
            return a(-2, l, view, viewgroup, s);
        }
    }

    private void b(AbsListView abslistview, int l)
    {
        abslistview.setTag(0x40ff0004, Integer.valueOf(l));
        if (l != 0) goto _L2; else goto _L1
_L1:
        ListAdapter listadapter;
        int i1;
        int j1;
        i1 = abslistview.getFirstVisiblePosition();
        j1 = abslistview.getLastVisiblePosition();
        listadapter = (ListAdapter)abslistview.getAdapter();
        l = 0;
_L5:
        if (l <= j1 - i1) goto _L3; else goto _L2
_L2:
        return;
_L3:
        long l1 = l + i1;
        View view = abslistview.getChildAt(l);
        if ((Number)view.getTag(0x40ff0004) != null)
        {
            listadapter.getView((int)l1, view, abslistview);
            view.setTag(0x40ff0004, null);
        }
        l++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static boolean b(int l, View view, ViewGroup viewgroup, String s)
    {
        if (s == null || BitmapAjaxCallback.f(s))
        {
            return false;
        }
        Gallery gallery = (Gallery)viewgroup;
        s = (Integer)gallery.getTag(0x40ff0004);
        viewgroup = s;
        if (s == null)
        {
            viewgroup = Integer.valueOf(0);
            gallery.setTag(0x40ff0004, Integer.valueOf(0));
            gallery.setCallbackDuringFling(false);
            (new Common()).a(gallery);
        }
        int i1 = gallery.getFirstVisiblePosition();
        i1 = (gallery.getLastVisiblePosition() - i1) / 2 + 1;
        int k1 = viewgroup.intValue() - i1;
        int l1 = viewgroup.intValue() + i1;
        int j1 = l1;
        i1 = k1;
        if (k1 < 0)
        {
            j1 = l1 - k1;
            i1 = 0;
        }
        if (l >= i1 && l <= j1)
        {
            view.setTag(0x40ff0004, Integer.valueOf(l));
            return false;
        } else
        {
            view.setTag(0x40ff0004, null);
            return true;
        }
    }

    public int a(File file, File file1)
    {
        long l = file.lastModified();
        long l1 = file1.lastModified();
        if (l1 > l)
        {
            return 1;
        }
        return l1 != l ? -1 : 0;
    }

    public transient Common a(int l, Object aobj[])
    {
        f = l;
        c = aobj;
        return this;
    }

    public void a(Gallery gallery)
    {
        j = gallery.getOnItemSelectedListener();
        k = true;
        gallery.setOnItemSelectedListener(this);
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int l, int i1, int j1)
    {
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }

    public void onClick(View view)
    {
        a(new Object[] {
            view
        });
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        a(new Object[] {
            adapterview, view, Integer.valueOf(l), Long.valueOf(l1)
        });
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int l, long l1)
    {
        return ((Boolean)a(new Object[] {
            adapterview, view, Integer.valueOf(l), Long.valueOf(l1)
        })).booleanValue();
    }

    public void onItemSelected(AdapterView adapterview, View view, int l, long l1)
    {
        a(new Object[] {
            adapterview, view, Integer.valueOf(l), Long.valueOf(l1)
        });
        if (j != null)
        {
            j.onItemSelected(adapterview, view, l, l1);
        }
        if (!k || ((Integer)adapterview.getTag(0x40ff0004)).intValue() == l) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        view = adapterview.getAdapter();
        adapterview.setTag(0x40ff0004, Integer.valueOf(l));
        i1 = adapterview.getChildCount();
        j1 = adapterview.getFirstVisiblePosition();
        l = 0;
_L5:
        if (l < i1) goto _L3; else goto _L2
_L2:
        return;
_L3:
        View view1 = adapterview.getChildAt(l);
        int k1 = j1 + l;
        Integer integer = (Integer)view1.getTag(0x40ff0004);
        if (integer == null || integer.intValue() != k1)
        {
            view.getView(k1, view1, adapterview);
        }
        l++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean onLongClick(View view)
    {
        view = ((View) (a(new Object[] {
            view
        })));
        if (view instanceof Boolean)
        {
            return ((Boolean)view).booleanValue();
        } else
        {
            return false;
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        if (j != null)
        {
            j.onNothingSelected(adapterview);
        }
    }

    public void onScroll(AbsListView abslistview, int l, int i1, int j1)
    {
        a(abslistview, g);
        if (h != null)
        {
            h.onScroll(abslistview, l, i1, j1);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int l)
    {
        g = l;
        a(abslistview, l);
        if (abslistview instanceof ExpandableListView)
        {
            a((ExpandableListView)abslistview, l);
        } else
        {
            b(abslistview, l);
        }
        if (h != null)
        {
            h.onScrollStateChanged(abslistview, l);
        }
    }

    public void onTextChanged(CharSequence charsequence, int l, int i1, int j1)
    {
        a(new Object[] {
            charsequence, Integer.valueOf(l), Integer.valueOf(i1), Integer.valueOf(j1)
        });
    }

    public void run()
    {
        a(new Object[0]);
    }
}
