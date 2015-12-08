// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning.preferences;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.brightcove.player.captioning.preferences:
//            ListDialogPreference

public class ColorPreference extends ListDialogPreference
{

    private ColorDrawable b;
    private boolean c;

    public ColorPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setDialogLayoutResource(com.brightcove.player.R.layout.grid_picker_dialog);
        setListItemLayoutResource(com.brightcove.player.R.layout.color_picker_item);
    }

    protected final CharSequence a(int i)
    {
        CharSequence charsequence = super.a(i);
        if (charsequence != null)
        {
            return charsequence;
        } else
        {
            int k = super.a[i];
            i = Color.red(k);
            int j = Color.green(k);
            k = Color.blue(k);
            return getContext().getString(com.brightcove.player.R.string.color_custom, new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            });
        }
    }

    protected final void a(View view, int i)
    {
        int j = super.a[i];
        int k = Color.alpha(j);
        Object obj = (ImageView)view.findViewById(com.brightcove.player.R.id.color_swatch);
        android.graphics.drawable.Drawable drawable;
        if (k < 255)
        {
            ((ImageView) (obj)).setBackgroundResource(com.brightcove.player.R.drawable.transparency_tileable);
        } else
        {
            ((ImageView) (obj)).setBackground(null);
        }
        drawable = ((ImageView) (obj)).getDrawable();
        if (drawable instanceof ColorDrawable)
        {
            ((ColorDrawable)drawable).setColor(j);
        } else
        {
            ((ImageView) (obj)).setImageDrawable(new ColorDrawable(j));
        }
        obj = a(i);
        if (obj != null)
        {
            ((TextView)view.findViewById(com.brightcove.player.R.id.summary)).setText(((CharSequence) (obj)));
        }
    }

    protected void onBindView(View view)
    {
        super.onBindView(view);
        if (c)
        {
            view = (ImageView)view.findViewById(com.brightcove.player.R.id.color_preview);
            int i = getValue();
            float f;
            CharSequence charsequence;
            if (Color.alpha(i) < 255)
            {
                view.setBackgroundResource(com.brightcove.player.R.drawable.transparency_tileable);
            } else
            {
                view.setBackground(null);
            }
            if (b == null)
            {
                b = new ColorDrawable(i);
                view.setImageDrawable(b);
            } else
            {
                b.setColor(i);
            }
            charsequence = getSummary();
            if (!TextUtils.isEmpty(charsequence))
            {
                view.setContentDescription(charsequence);
            } else
            {
                view.setContentDescription(null);
            }
            if (isEnabled())
            {
                f = 1.0F;
            } else
            {
                f = 0.2F;
            }
            view.setAlpha(f);
        }
    }

    public void setPreviewEnabled(boolean flag)
    {
label0:
        {
            if (c != flag)
            {
                c = flag;
                if (!flag)
                {
                    break label0;
                }
                setWidgetLayoutResource(com.brightcove.player.R.layout.preference_color);
            }
            return;
        }
        setWidgetLayoutResource(0);
    }

    public boolean shouldDisableDependents()
    {
        return Color.alpha(getValue()) == 0 || super.shouldDisableDependents();
    }
}
