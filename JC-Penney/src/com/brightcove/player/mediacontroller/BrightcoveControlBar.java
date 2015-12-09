// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class BrightcoveControlBar extends LinearLayout
{

    private static final String a = com/brightcove/player/mediacontroller/BrightcoveControlBar.getSimpleName();
    private List b;

    public BrightcoveControlBar(Context context)
    {
        super(context);
        b = new ArrayList();
    }

    public BrightcoveControlBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = new ArrayList();
        a(context, attributeset);
    }

    public BrightcoveControlBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = new ArrayList();
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        String s = a;
        int i;
        if (attributeset == null)
        {
            i = -1;
        } else
        {
            i = attributeset.getAttributeCount();
        }
        Log.d(s, String.format("The attribute set contains %1$d attributes.", new Object[] {
            Integer.valueOf(i)
        }));
        context = context.obtainStyledAttributes(attributeset, com.brightcove.player.R.styleable.BrightcoveMediaController);
        i = 0;
        while (i < context.length()) 
        {
            attributeset = new TypedValue();
            b.add(attributeset);
            if (context.getValue(i, attributeset))
            {
                Log.d(a, String.format("The typed value for the styleable attribute with index %1$d is %2$s and has type: %3$x.", new Object[] {
                    Integer.valueOf(i), attributeset.toString(), Integer.valueOf(((TypedValue) (attributeset)).type)
                }));
            } else
            {
                Log.d(a, String.format("The typed value for the styleable attribute with index %1$d could not be retrieved.  The attribure is likely not used.", new Object[] {
                    Integer.valueOf(i)
                }));
            }
            i++;
        }
        context.recycle();
    }

    public boolean getBooleanResource(int i)
    {
        if (i > -1 && i < b.size())
        {
            TypedValue typedvalue = (TypedValue)b.get(i);
            if (typedvalue != null && typedvalue.type == 18)
            {
                return typedvalue.data != 0;
            }
            Log.e(a, String.format("The styleable attribute at index %1$d is either null or not a boolean!", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            Log.e(a, String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            }));
        }
        return false;
    }

    public float getFloatResource(int i, float f)
    {
        if (i > -1 && i < b.size())
        {
            TypedValue typedvalue = (TypedValue)b.get(i);
            if (typedvalue != null && typedvalue.type == 4)
            {
                return typedvalue.getFloat();
            } else
            {
                Log.e(a, String.format("The styleable attribute at index %1$d is either null or not a float!", new Object[] {
                    Integer.valueOf(i)
                }));
                return f;
            }
        } else
        {
            Log.e(a, String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            }));
            return f;
        }
    }

    public int getIntegerResource(int i, int j)
    {
        if (i > -1 && i < b.size())
        {
            TypedValue typedvalue = (TypedValue)b.get(i);
            if (typedvalue != null && (typedvalue.type == 16 || typedvalue.type == 17))
            {
                return typedvalue.data;
            } else
            {
                Log.e(a, String.format("The styleable attribute at index %1$d is either null or not an integer!", new Object[] {
                    Integer.valueOf(i)
                }));
                return j;
            }
        } else
        {
            Log.e(a, String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            }));
            return j;
        }
    }

    public String getStringResource(int i, String s)
    {
        if (i > -1 && i < b.size())
        {
            TypedValue typedvalue = (TypedValue)b.get(i);
            if (typedvalue != null && typedvalue.type == 3)
            {
                return (String)typedvalue.string;
            }
            Log.e(a, String.format("The styleable attribute at index %1$d is either null or not a string!", new Object[] {
                Integer.valueOf(i)
            }));
        } else
        {
            Log.e(a, String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            }));
        }
        return s;
    }

}
