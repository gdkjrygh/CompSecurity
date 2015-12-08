// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

// Referenced classes of package android.databinding:
//            DataBinderMapper, ViewDataBinding

public class DataBindingUtil
{

    private static DataBinderMapper sMapper = new DataBinderMapper();

    public DataBindingUtil()
    {
    }

    public static ViewDataBinding bind(View view)
    {
        Object obj = getBinding(view);
        if (obj != null)
        {
            return ((ViewDataBinding) (obj));
        }
        obj = view.getTag();
        if (!(obj instanceof String))
        {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        obj = (String)obj;
        int i = sMapper.getLayoutId(((String) (obj)));
        if (i == 0)
        {
            throw new IllegalArgumentException("View is not a binding layout");
        } else
        {
            return sMapper.getDataBinder(view, i);
        }
    }

    static ViewDataBinding bind(View view, int i)
    {
        return sMapper.getDataBinder(view, i);
    }

    static ViewDataBinding bind(View aview[], int i)
    {
        return sMapper.getDataBinder(aview, i);
    }

    public static String convertBrIdToString(int i)
    {
        return sMapper.convertBrIdToString(i);
    }

    public static ViewDataBinding findBinding(View view)
    {
_L8:
        Object obj;
        if (view == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ViewDataBinding.getBinding(view);
        if (obj != null)
        {
            return ((ViewDataBinding) (obj));
        }
        obj = view.getTag();
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        obj = (String)obj;
        if (!((String) (obj)).startsWith("layout") || !((String) (obj)).endsWith("_0")) goto _L2; else goto _L3
_L3:
        boolean flag1;
        char c;
        int i;
        c = ((String) (obj)).charAt(6);
        i = ((String) (obj)).indexOf('/', 7);
        flag1 = false;
        if (c != '/') goto _L5; else goto _L4
_L4:
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L6:
        if (flag)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L5:
        flag = flag1;
        if (c == '-')
        {
            flag = flag1;
            if (i != -1)
            {
                if (((String) (obj)).indexOf('/', i + 1) == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
        view = view.getParent();
        if (view instanceof View)
        {
            view = (View)view;
        } else
        {
            view = null;
        }
        if (true) goto _L8; else goto _L7
_L7:
        return null;
    }

    public static ViewDataBinding getBinding(View view)
    {
        return ViewDataBinding.getBinding(view);
    }

    public static ViewDataBinding inflate(LayoutInflater layoutinflater, int i, ViewGroup viewgroup, boolean flag)
    {
        int j = 0;
        int k;
        if (viewgroup != null && flag)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k != 0)
        {
            j = viewgroup.getChildCount();
        }
        layoutinflater = layoutinflater.inflate(i, viewgroup, flag);
        if (k != 0)
        {
            k = viewgroup.getChildCount();
            int i1 = k - j;
            if (i1 == 1)
            {
                return bind(viewgroup.getChildAt(k - 1), i);
            }
            layoutinflater = new View[i1];
            for (int l = 0; l < i1; l++)
            {
                layoutinflater[l] = viewgroup.getChildAt(l + j);
            }

            return bind(layoutinflater, i);
        } else
        {
            return bind(layoutinflater, i);
        }
    }

    public static ViewDataBinding setContentView(Activity activity, int i)
    {
        Object obj = (ViewGroup)activity.getWindow().getDecorView().findViewById(0x1020002);
        obj = inflate(activity.getLayoutInflater(), i, ((ViewGroup) (obj)), false);
        activity.setContentView(((ViewDataBinding) (obj)).getRoot(), ((ViewDataBinding) (obj)).getRoot().getLayoutParams());
        return ((ViewDataBinding) (obj));
    }

}
