// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class BrightcoveControlBar extends LinearLayout
{

    public static final int CLOSED_CAPTIONS;
    public static final int CLOSED_CAPTIONS_IMAGE;
    public static final int ENTER_FULL_SCREEN_IMAGE;
    public static final int EXIT_FULL_SCREEN_IMAGE;
    public static final int FULL_SCREEN;
    public static final int LIVE;
    public static final int PAUSE_IMAGE;
    public static final int PLAY;
    public static final int PLAY_IMAGE;
    public static final int REWIND;
    public static final int REWIND_IMAGE;
    private List a;
    private SparseArray b;

    public BrightcoveControlBar(Context context)
    {
        super(context);
        a = new ArrayList();
        b = new SparseArray();
    }

    public BrightcoveControlBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ArrayList();
        b = new SparseArray();
        a(context, attributeset);
    }

    public BrightcoveControlBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ArrayList();
        b = new SparseArray();
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        int i;
        if (attributeset == null)
        {
            i = -1;
        } else
        {
            i = attributeset.getAttributeCount();
        }
        String.format("The attribute set contains %1$d attributes.", new Object[] {
            Integer.valueOf(i)
        });
        context = context.obtainStyledAttributes(attributeset, com.brightcove.player.R.styleable.BrightcoveMediaController);
        for (i = 0; i < context.length(); i++)
        {
            attributeset = new TypedValue();
            context.getValue(i, attributeset);
            a.add(attributeset);
            if (i != com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_chrome_cast_image && i != com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_closed_captions_image && i != com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_enter_full_screen_image && i != com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_exit_full_screen_image && i != com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_pause_image && i != com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_play_image && i != com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_rewind_image || ((TypedValue) (attributeset)).type != 3)
            {
                continue;
            }
            attributeset = context.getDrawable(i);
            if (attributeset != null)
            {
                b.put(i, attributeset);
            }
        }

        context.recycle();
    }

    public boolean getBooleanResource(int i)
    {
        if (i >= 0 && i < a.size())
        {
            TypedValue typedvalue = (TypedValue)a.get(i);
            if (typedvalue != null && typedvalue.type == 18)
            {
                boolean flag;
                if (typedvalue.data != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            } else
            {
                String.format("The styleable attribute at index %1$d is either null or not a boolean!", new Object[] {
                    Integer.valueOf(i)
                });
                return false;
            }
        } else
        {
            String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            });
            return false;
        }
    }

    public int getColorResource(int i, int j)
    {
        if (i >= 0 && i < a.size())
        {
            TypedValue typedvalue = (TypedValue)a.get(i);
            if (typedvalue != null && typedvalue.type == 28)
            {
                return typedvalue.data;
            } else
            {
                String.format("The styleable attribute at index %1$d is either null or not a color value!", new Object[] {
                    Integer.valueOf(i)
                });
                return j;
            }
        } else
        {
            String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            });
            return j;
        }
    }

    public float getFloatResource(int i, float f)
    {
        if (i >= 0 && i < a.size())
        {
            TypedValue typedvalue = (TypedValue)a.get(i);
            if (typedvalue != null && typedvalue.type == 4)
            {
                return typedvalue.getFloat();
            } else
            {
                String.format("The styleable attribute at index %1$d is either null or not a float!", new Object[] {
                    Integer.valueOf(i)
                });
                return f;
            }
        } else
        {
            String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            });
            return f;
        }
    }

    public Drawable getImage(int i)
    {
        return (Drawable)b.get(i);
    }

    public int getIntegerResource(int i, int j)
    {
        if (i >= 0 && i < a.size())
        {
            TypedValue typedvalue = (TypedValue)a.get(i);
            if (typedvalue != null && (typedvalue.type == 16 || typedvalue.type == 17))
            {
                return typedvalue.data;
            } else
            {
                String.format("The styleable attribute at index %1$d is either null or not an integer!", new Object[] {
                    Integer.valueOf(i)
                });
                return j;
            }
        } else
        {
            String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            });
            return j;
        }
    }

    public int getResourceId(int i)
    {
        if (i >= 0 && i < a.size())
        {
            TypedValue typedvalue = (TypedValue)a.get(i);
            if (typedvalue != null && typedvalue.type == 1)
            {
                return typedvalue.data;
            } else
            {
                String.format("The styleable attribute at index %1$d is either null or not a reference!", new Object[] {
                    Integer.valueOf(i)
                });
                return -1;
            }
        } else
        {
            String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            });
            return -1;
        }
    }

    public String getStringResource(int i, String s)
    {
        if (i >= 0 && i < a.size())
        {
            TypedValue typedvalue = (TypedValue)a.get(i);
            if (typedvalue != null && typedvalue.type == 3)
            {
                return (String)typedvalue.string;
            } else
            {
                String.format("The styleable attribute at index %1$d is either null or not a string!", new Object[] {
                    Integer.valueOf(i)
                });
                return s;
            }
        } else
        {
            String.format("The index %1$d is not valid.", new Object[] {
                Integer.valueOf(i)
            });
            return s;
        }
    }

    static 
    {
        CLOSED_CAPTIONS = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_closed_captions;
        CLOSED_CAPTIONS_IMAGE = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_closed_captions_image;
        ENTER_FULL_SCREEN_IMAGE = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_enter_full_screen_image;
        EXIT_FULL_SCREEN_IMAGE = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_exit_full_screen_image;
        FULL_SCREEN = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_full_screen;
        LIVE = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_live;
        PLAY = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_play;
        PLAY_IMAGE = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_play_image;
        PAUSE_IMAGE = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_pause_image;
        REWIND = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_rewind;
        REWIND_IMAGE = com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_pause_image;
        com/brightcove/player/mediacontroller/BrightcoveControlBar.getSimpleName();
    }
}
