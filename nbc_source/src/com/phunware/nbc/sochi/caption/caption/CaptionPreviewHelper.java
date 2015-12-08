// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.caption;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.phunware.nbc.sochi.FullScreenCaptionPreviewActivity;
import com.phunware.nbc.sochi.system.NBCSystem;

public class CaptionPreviewHelper
{

    public static final int STYLE_NOT_SPECIFIED = -100;
    private static final String TAG = "CaptionPreviewHelper";
    private final Configuration configuration;

    public CaptionPreviewHelper(Configuration configuration1)
    {
        configuration = configuration1;
    }

    public void bindFullScreenPreviewButton(Context context, View view)
    {
        bindFullScreenPreviewButton(context, view, -100L);
    }

    public void bindFullScreenPreviewButton(final Context context, View view, final long styleId)
    {
        ((ImageView)view.findViewById(0x7f0f0114)).setOnClickListener(new android.view.View.OnClickListener() {

            final CaptionPreviewHelper this$0;
            final Context val$context;
            final long val$styleId;

            public void onClick(View view1)
            {
                long l1 = styleId;
                long l = l1;
                if (l1 == -100L)
                {
                    l = configuration.getUserSelectedCaptionStyleId();
                }
                NBCSystem.debugLog("CaptionPreviewHelper", (new StringBuilder()).append("Attempting to bind preview style with id ").append(styleId).toString());
                context.startActivity(FullScreenCaptionPreviewActivity.getIntent(context, l));
            }

            
            {
                this$0 = CaptionPreviewHelper.this;
                styleId = l;
                context = context1;
                super();
            }
        });
    }

    public String getFontTypeFaceForName(Context context, String s)
    {
        String s1 = null;
        if (context.getString(0x7f07007f).equalsIgnoreCase(s))
        {
            s1 = "fonts/DroidSansMono.ttf";
        } else
        {
            if (context.getString(0x7f070080).equalsIgnoreCase(s))
            {
                return "fonts/DroidSansMono.ttf";
            }
            if (context.getString(0x7f070081).equalsIgnoreCase(s))
            {
                return "fonts/DroidSansMono.ttf";
            }
            if (context.getString(0x7f070082).equalsIgnoreCase(s))
            {
                return "fonts/DroidSerif-Regular.ttf";
            }
            if (context.getString(0x7f070083).equalsIgnoreCase(s))
            {
                return "fonts/DroidSans.ttf";
            }
            if (context.getString(0x7f07007d).equalsIgnoreCase(s))
            {
                return "fonts/DroidSansMono.ttf";
            }
            if (context.getString(0x7f07007e).equalsIgnoreCase(s))
            {
                return "fonts/DroidSans.ttf";
            }
            if (context.getString(0x7f070084).equalsIgnoreCase(s))
            {
                return "fonts/DroidSansMono.ttf";
            }
        }
        return s1;
    }

    public Typeface getTypeFaceForName(Context context, String s)
    {
        Typeface typeface = null;
        if (context.getString(0x7f07007f).equalsIgnoreCase(s))
        {
            typeface = Typeface.MONOSPACE;
        } else
        {
            if (context.getString(0x7f070080).equalsIgnoreCase(s))
            {
                return Typeface.MONOSPACE;
            }
            if (context.getString(0x7f070081).equalsIgnoreCase(s))
            {
                return Typeface.MONOSPACE;
            }
            if (context.getString(0x7f070082).equalsIgnoreCase(s))
            {
                return Typeface.SERIF;
            }
            if (context.getString(0x7f070083).equalsIgnoreCase(s))
            {
                return Typeface.SANS_SERIF;
            }
            if (context.getString(0x7f07007d).equalsIgnoreCase(s))
            {
                return Typeface.MONOSPACE;
            }
            if (context.getString(0x7f07007e).equalsIgnoreCase(s))
            {
                return Typeface.SANS_SERIF;
            }
            if (context.getString(0x7f070084).equalsIgnoreCase(s))
            {
                return Typeface.MONOSPACE;
            }
        }
        return typeface;
    }

    public int mapColorNameToARGB(String s, int i)
    {
        boolean flag = false;
        int j = (int)(((double)i / 100D) * 255D);
        if ("white".equalsIgnoreCase(s))
        {
            i = Color.argb(j, 255, 255, 255);
        } else
        {
            if ("cyan".equalsIgnoreCase(s))
            {
                return Color.argb(j, 0, 255, 255);
            }
            if ("blue".equalsIgnoreCase(s))
            {
                return Color.argb(j, 0, 0, 255);
            }
            if ("green".equalsIgnoreCase(s))
            {
                return Color.argb(j, 0, 255, 0);
            }
            if ("yellow".equalsIgnoreCase(s))
            {
                return Color.argb(j, 255, 255, 0);
            }
            if ("magenta".equalsIgnoreCase(s))
            {
                return Color.argb(j, 255, 0, 255);
            }
            if ("red".equalsIgnoreCase(s))
            {
                return Color.argb(j, 255, 0, 0);
            }
            i = ((flag) ? 1 : 0);
            if ("black".equalsIgnoreCase(s))
            {
                return Color.argb(j, 0, 0, 0);
            }
        }
        return i;
    }

    public void preview(Context context, Cursor cursor, TextView textview)
    {
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        String s2;
        int i;
        int j;
        int k;
        i = cursor.getInt(cursor.getColumnIndex("_id"));
        s = cursor.getString(cursor.getColumnIndex("title"));
        NBCSystem.debugLog("CaptionPreviewHelper", (new StringBuilder()).append("Applying style ").append(s).append(" w/ID ").append(i).toString());
        s = cursor.getString(cursor.getColumnIndex("font"));
        i = cursor.getInt(cursor.getColumnIndex("text_size"));
        s1 = cursor.getString(cursor.getColumnIndex("text_color"));
        s2 = cursor.getString(cursor.getColumnIndex("background_color"));
        j = cursor.getInt(cursor.getColumnIndex("background_opacity"));
        k = cursor.getInt(cursor.getColumnIndex("text_opacity"));
        i;
        JVM INSTR tableswitch 0 1: default 196
    //                   0 245
    //                   1 255;
           goto _L3 _L4 _L5
_L3:
        textview.setTextAppearance(context, 0x1030042);
_L6:
        textview.setTextColor(mapColorNameToARGB(s1, k));
        textview.setBackgroundColor(mapColorNameToARGB(s2, j));
        context = getTypeFaceForName(context, s);
        if (context != null)
        {
            textview.setTypeface(context);
        }
        return;
_L4:
        textview.setTextAppearance(context, 0x1030046);
        continue; /* Loop/switch isn't completed */
_L5:
        textview.setTextAppearance(context, 0x1030044);
        if (true) goto _L6; else goto _L2
_L2:
        Log.e("CaptionPreviewHelper", "Unable to apply user selected caption style.  Cursor empty?");
        return;
    }

}
