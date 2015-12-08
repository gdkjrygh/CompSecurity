// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class czb
{

    private final czd a = new czd();

    public czb()
    {
    }

    private View a(cze cze1, View view, int i)
    {
        boolean flag1;
        int k;
        flag1 = false;
        k = a.a[i];
        if (cze1.b == null) goto _L2; else goto _L1
_L1:
        Object obj;
        String s1;
        s1 = cze1.b;
        obj = view.getClass();
_L4:
        boolean flag;
        if (((Class) (obj)).getCanonicalName().equals(s1))
        {
            flag = true;
        } else
        {
label0:
            {
                if (obj != java/lang/Object)
                {
                    break label0;
                }
                flag = false;
            }
        }
_L6:
        if (flag) goto _L2; else goto _L3
_L3:
        flag = false;
_L5:
        if (flag)
        {
            obj = a.a;
            obj[i] = obj[i] + 1;
            if (cze1.c == -1 || cze1.c == k)
            {
                return view;
            }
        }
        break MISSING_BLOCK_LABEL_222;
        obj = ((Class) (obj)).getSuperclass();
          goto _L4
_L2:
        if (-1 != cze1.d && view.getId() != cze1.d)
        {
            flag = false;
        } else
        if (cze1.e != null && !cze1.e.equals(view.getContentDescription()))
        {
            flag = false;
        } else
        {
            String s = cze1.f;
            if (cze1.f != null && (view.getTag() == null || !s.equals(view.getTag().toString())))
            {
                flag = false;
            } else
            {
                flag = true;
            }
        }
          goto _L5
        if (cze1.a == 1 && (view instanceof ViewGroup))
        {
            view = (ViewGroup)view;
            int l = view.getChildCount();
            for (int j = ((flag1) ? 1 : 0); j < l; j++)
            {
                View view1 = a(cze1, view.getChildAt(j), i);
                if (view1 != null)
                {
                    return view1;
                }
            }

        }
        return null;
          goto _L6
    }

    private void b(View view, List list, czc czc1)
    {
        int i = 0;
        if (list.isEmpty())
        {
            czc1.a(view);
        } else
        if (view instanceof ViewGroup)
        {
            if (a.a())
            {
                Log.v("MixpanelAPI.PathFinder", "Path is too deep, will not match");
                return;
            }
            view = (ViewGroup)view;
            cze cze1 = (cze)list.get(0);
            list = list.subList(1, list.size());
            int j = view.getChildCount();
            int k = a.b();
            do
            {
                if (i >= j)
                {
                    break;
                }
                View view1 = a(cze1, view.getChildAt(i), k);
                if (view1 != null)
                {
                    b(view1, list, czc1);
                }
                if (cze1.c >= 0 && a.a[k] > cze1.c)
                {
                    break;
                }
                i++;
            } while (true);
            a.c();
            return;
        }
    }

    public final void a(View view, List list, czc czc1)
    {
        if (!list.isEmpty())
        {
            if (a.a())
            {
                Log.w("MixpanelAPI.PathFinder", "There appears to be a concurrency issue in the pathfinding code. Path will not be matched.");
                return;
            }
            cze cze1 = (cze)list.get(0);
            list = list.subList(1, list.size());
            view = a(cze1, view, a.b());
            a.c();
            if (view != null)
            {
                b(view, list, czc1);
                return;
            }
        }
    }
}
