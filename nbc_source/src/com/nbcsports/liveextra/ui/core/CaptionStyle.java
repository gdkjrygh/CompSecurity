// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import com.adobe.mediacore.TextFormat;
import com.adobe.mediacore.TextFormatBuilder;

public class CaptionStyle extends ContextWrapper
{

    private final SharedPreferences preferences;

    public CaptionStyle(Application application, SharedPreferences sharedpreferences)
    {
        super(application);
        preferences = sharedpreferences;
    }

    private void setBackgroundColor(String s, TextFormatBuilder textformatbuilder)
    {
        if ("Black".equalsIgnoreCase(s))
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.BLACK);
            return;
        }
        if ("Cyan".equalsIgnoreCase(s))
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.CYAN);
            return;
        }
        if ("Blue".equalsIgnoreCase(s))
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.BLUE);
            return;
        }
        if ("Green".equalsIgnoreCase(s))
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.GREEN);
            return;
        }
        if ("Yellow".equalsIgnoreCase(s))
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.YELLOW);
            return;
        }
        if ("Magenta".equalsIgnoreCase(s))
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.MAGENTA);
            return;
        }
        if ("Red".equalsIgnoreCase(s))
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.RED);
            return;
        } else
        {
            textformatbuilder.setBackgroundColor(com.adobe.mediacore.TextFormat.Color.WHITE);
            return;
        }
    }

    private void setFontColor(String s, TextFormatBuilder textformatbuilder)
    {
        if ("Black".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.BLACK);
            return;
        }
        if ("Cyan".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.CYAN);
            return;
        }
        if ("Blue".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.BLUE);
            return;
        }
        if ("Green".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.GREEN);
            return;
        }
        if ("Yellow".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.YELLOW);
            return;
        }
        if ("Magenta".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.MAGENTA);
            return;
        }
        if ("Red".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.RED);
            return;
        } else
        {
            textformatbuilder.setFontColor(com.adobe.mediacore.TextFormat.Color.WHITE);
            return;
        }
    }

    private void setFontEdge(String s, TextFormatBuilder textformatbuilder)
    {
        if ("None".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontEdge(com.adobe.mediacore.TextFormat.FontEdge.NONE);
            return;
        }
        if ("Depressed".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontEdge(com.adobe.mediacore.TextFormat.FontEdge.DEPRESSED);
            return;
        }
        if ("Drop Shadow Left".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontEdge(com.adobe.mediacore.TextFormat.FontEdge.DROP_SHADOW_LEFT);
            return;
        }
        if ("Drop Shadow Right".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontEdge(com.adobe.mediacore.TextFormat.FontEdge.DROP_SHADOW_RIGHT);
            return;
        }
        if ("Raised".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontEdge(com.adobe.mediacore.TextFormat.FontEdge.RAISED);
            return;
        }
        if ("Uniform".equalsIgnoreCase(s))
        {
            textformatbuilder.setFontEdge(com.adobe.mediacore.TextFormat.FontEdge.UNIFORM);
            return;
        } else
        {
            textformatbuilder.setFontEdge(com.adobe.mediacore.TextFormat.FontEdge.DEFAULT);
            return;
        }
    }

    private void setFontName(String s, TextFormatBuilder textformatbuilder)
    {
        if (s.equals(getString(0x7f070082)))
        {
            textformatbuilder.setFont(com.adobe.mediacore.TextFormat.Font.PROPORTIONAL_WITH_SERIFS);
            return;
        }
        if (s.equals(getString(0x7f070083)) || s.equals(getString(0x7f07007e)))
        {
            textformatbuilder.setFont(com.adobe.mediacore.TextFormat.Font.CURSIVE);
            return;
        } else
        {
            textformatbuilder.setFont(com.adobe.mediacore.TextFormat.Font.DEFAULT);
            return;
        }
    }

    private void setFontSize(int i, TextFormatBuilder textformatbuilder)
    {
        switch (i)
        {
        default:
            textformatbuilder.setSize(com.adobe.mediacore.TextFormat.Size.LARGE);
            return;

        case 0: // '\0'
            textformatbuilder.setSize(com.adobe.mediacore.TextFormat.Size.SMALL);
            return;

        case 1: // '\001'
            textformatbuilder.setSize(com.adobe.mediacore.TextFormat.Size.DEFAULT);
            break;
        }
    }

    public StateListDrawable buildThemedListSelector()
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        ColorDrawable colordrawable = new ColorDrawable(0);
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            ColorDrawable colordrawable1 = new ColorDrawable(0x33ccff00);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, colordrawable1);
            statelistdrawable.addState(new int[] {
                0x101009c
            }, colordrawable1);
        } else
        {
            ShapeDrawable shapedrawable = new ShapeDrawable();
            shapedrawable.getPaint().setColor(0x33ccff00);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, shapedrawable);
            statelistdrawable.addState(new int[] {
                0x101009c
            }, shapedrawable);
        }
        statelistdrawable.addState(new int[0], colordrawable);
        return statelistdrawable;
    }

    public Drawable buildThemedPressedState()
    {
        return new ColorDrawable(0x33ccff00);
    }

    public TextFormat getTextFormat()
    {
        long l = getUserSelectedCaptionStyleId();
        android.net.Uri uri = ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.ClosedCaptioningStylesContract.Styles.CONTENT_URI, l);
        Object obj = getContentResolver().query(uri, null, null, null, null);
        if (!((Cursor) (obj)).moveToFirst())
        {
            ((Cursor) (obj)).close();
            return null;
        } else
        {
            String s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("font"));
            int i = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("text_size"));
            String s1 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("text_color"));
            String s2 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("text_edge"));
            String s3 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("background_color"));
            int j = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("background_opacity"));
            int k = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndex("text_opacity"));
            ((Cursor) (obj)).close();
            obj = new TextFormatBuilder();
            setFontName(s, ((TextFormatBuilder) (obj)));
            setFontSize(i, ((TextFormatBuilder) (obj)));
            setFontColor(s1, ((TextFormatBuilder) (obj)));
            setFontEdge(s2, ((TextFormatBuilder) (obj)));
            setBackgroundColor(s3, ((TextFormatBuilder) (obj)));
            ((TextFormatBuilder) (obj)).setFontOpacity(k);
            ((TextFormatBuilder) (obj)).setBackgroundOpacity(j);
            return ((TextFormatBuilder) (obj)).toTextFormat();
        }
    }

    public String getUserSelectedCaptionStyle()
    {
        return preferences.getString(getString(0x7f070164), "Default");
    }

    public long getUserSelectedCaptionStyleId()
    {
        return preferences.getLong(getString(0x7f070165), -1L);
    }

    public void setUserSelectedCaptionStyle(String s, long l)
    {
        preferences.edit().putLong(getString(0x7f070165), l).apply();
        preferences.edit().putString(getString(0x7f070164), s).apply();
    }
}
