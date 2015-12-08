// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.bind.logging.Logd;

// Referenced classes of package com.google.android.libraries.bind.data:
//            Data

public class BoundHelper
{

    private static final Logd LOGD = Logd.get(com/google/android/libraries/bind/data/BoundHelper);
    public final Integer bindBackgroundKey;
    public final Integer bindContentDescriptionKey;
    public final Integer bindEnabledKey;
    public final Integer bindInvisibilityKey;
    public final Integer bindMinHeightKey;
    public final Integer bindOnClickListenerKey;
    public final Integer bindPaddingTopKey;
    public final Integer bindTransitionNameKey;
    public final Integer bindVisibilityKey;
    protected final View view;

    public BoundHelper(Context context, AttributeSet attributeset, View view1)
    {
        view = view1;
        context = context.obtainStyledAttributes(attributeset, com.google.android.libraries.bind.R.styleable.BoundView);
        bindBackgroundKey = getInteger(context, 0);
        bindContentDescriptionKey = getInteger(context, 1);
        bindEnabledKey = getInteger(context, 2);
        bindOnClickListenerKey = getInteger(context, 5);
        bindInvisibilityKey = getInteger(context, 3);
        bindMinHeightKey = getInteger(context, 4);
        bindPaddingTopKey = getInteger(context, 6);
        bindVisibilityKey = getInteger(context, 8);
        bindTransitionNameKey = getInteger(context, 7);
        context.recycle();
    }

    private static void bindVisibility(View view1, Integer integer, Data data, boolean flag)
    {
        if (integer != null)
        {
            byte byte0;
            byte byte1;
            if (data == null || !data.containsKey(integer.intValue()))
            {
                byte0 = 8;
            } else
            if (data.get(integer.intValue()) instanceof Boolean)
            {
                if (((Boolean)data.get(integer.intValue())).booleanValue())
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 8;
                }
            } else
            {
                byte0 = 0;
            }
            byte1 = byte0;
            if (flag)
            {
                if (byte0 == 0)
                {
                    byte1 = 8;
                } else
                {
                    byte1 = 0;
                }
            }
            view1.setVisibility(byte1);
        }
    }

    public static Integer getInteger(TypedArray typedarray, int i)
    {
        i = typedarray.getResourceId(i, 0x7fffffff);
        if (i == 0x7fffffff)
        {
            return null;
        } else
        {
            return Integer.valueOf(i);
        }
    }

    public final void updateBoundData(Data data)
    {
        Object obj1 = null;
        Object obj2 = view;
        Integer integer = bindBackgroundKey;
        Object obj;
        int i;
        if (integer != null)
        {
            if (data == null)
            {
                obj = null;
            } else
            {
                obj = data.get(integer.intValue());
            }
            if (obj == null)
            {
                ((View) (obj2)).setBackgroundResource(0);
            } else
            if (obj instanceof Integer)
            {
                ((View) (obj2)).setBackgroundResource(((Integer)obj).intValue());
            } else
            if (obj instanceof Drawable)
            {
                ((View) (obj2)).setBackgroundDrawable((Drawable)obj);
            } else
            {
                LOGD.e("Unrecognized bound background for key: %s", new Object[] {
                    integer
                });
            }
        }
        obj2 = view;
        obj = bindContentDescriptionKey;
        if (obj != null)
        {
            if (data == null)
            {
                obj = null;
            } else
            {
                obj = (CharSequence)data.get(((Integer) (obj)).intValue());
            }
            ((View) (obj2)).setContentDescription(((CharSequence) (obj)));
        }
        obj = view;
        obj2 = bindEnabledKey;
        if (obj2 != null)
        {
            boolean flag;
            if (data != null && data.containsKey(((Integer) (obj2)).intValue()) && !data.get(((Integer) (obj2)).intValue()).equals(Boolean.FALSE))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((View) (obj)).setEnabled(flag);
        }
        bindVisibility(view, bindInvisibilityKey, data, true);
        obj2 = view;
        obj = bindMinHeightKey;
        if (obj != null)
        {
            if (data == null)
            {
                obj = Integer.valueOf(0);
            } else
            {
                obj = (Number)data.get(((Integer) (obj)).intValue());
            }
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = ((Number) (obj)).intValue();
            }
            ((View) (obj2)).setMinimumHeight(i);
        }
        obj2 = view;
        obj = bindOnClickListenerKey;
        if (obj != null)
        {
            if (data == null)
            {
                obj = null;
            } else
            {
                obj = (android.view.View.OnClickListener)data.get(((Integer) (obj)).intValue());
            }
            ((View) (obj2)).setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
        obj2 = view;
        obj = bindPaddingTopKey;
        if (obj != null)
        {
            int j;
            if (data == null)
            {
                obj = Integer.valueOf(0);
            } else
            {
                obj = (Number)data.get(((Integer) (obj)).intValue());
            }
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = ((Number) (obj)).intValue();
            }
            j = ((View) (obj2)).getPaddingBottom();
            if (android.os.Build.VERSION.SDK_INT >= 17 && ((View) (obj2)).isPaddingRelative())
            {
                ((View) (obj2)).setPaddingRelative(((View) (obj2)).getPaddingStart(), i, ((View) (obj2)).getPaddingEnd(), j);
            } else
            {
                ((View) (obj2)).setPadding(((View) (obj2)).getPaddingLeft(), i, ((View) (obj2)).getPaddingRight(), j);
            }
        }
        obj2 = view;
        obj = bindTransitionNameKey;
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 21)
        {
            if (data == null)
            {
                obj = obj1;
            } else
            {
                obj = data.getAsString(((Integer) (obj)).intValue());
            }
            ((View) (obj2)).setTransitionName(((String) (obj)));
        }
        bindVisibility(view, bindVisibilityKey, data, false);
    }

}
