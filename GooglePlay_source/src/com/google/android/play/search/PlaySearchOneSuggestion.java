// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.BitmapLoader;
import com.google.android.play.image.FifeImageView;

// Referenced classes of package com.google.android.play.search:
//            LevenshteinSuggestionFormatter, PlaySearchSuggestionModel, SuggestionFormatter

public class PlaySearchOneSuggestion extends RelativeLayout
{

    private Drawable mDefaultIconDrawable;
    private FifeImageView mIcon;
    private TextView mSuggestText;
    private final SuggestionFormatter mSuggestionFormatter;

    public PlaySearchOneSuggestion(Context context)
    {
        this(context, null);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mSuggestionFormatter = new LevenshteinSuggestionFormatter(context);
    }

    public final void bindSuggestion(PlaySearchSuggestionModel playsearchsuggestionmodel, BitmapLoader bitmaploader, String s)
    {
        bitmaploader = mSuggestionFormatter.formatSuggestion(s, playsearchsuggestionmodel.displayText, 0x7f11015d, 0x7f11015e);
        mSuggestText.setText(bitmaploader);
        com.google.android.play.image.BitmapLoader.BitmapContainer bitmapcontainer;
        if (playsearchsuggestionmodel.defaultIconDrawable != null)
        {
            bitmaploader = playsearchsuggestionmodel.defaultIconDrawable;
        } else
        {
            bitmaploader = mDefaultIconDrawable;
        }
        s = mIcon;
        s.mDefaultDrawable = null;
        s.mUrl = null;
        bitmapcontainer = (com.google.android.play.image.BitmapLoader.BitmapContainer)s.getTag();
        if (bitmapcontainer != null)
        {
            bitmapcontainer.cancelRequest();
            s.setTag(null);
        }
        s.setImageBitmap(null);
        s.setLoaded$7c48010f(false);
        mIcon.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        mIcon.setBackgroundDrawable(null);
        mIcon.mDefaultDrawable = bitmaploader;
        if (playsearchsuggestionmodel.iconUrl != null)
        {
            playsearchsuggestionmodel = Uri.parse(playsearchsuggestionmodel.iconUrl);
            if ("android.resource".equals(playsearchsuggestionmodel.getScheme()))
            {
                mIcon.setImageURI(playsearchsuggestionmodel);
                return;
            }
        }
        mIcon.mOnLoadedListener = null;
        mIcon.setImageDrawable(bitmaploader);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        mIcon = (FifeImageView)findViewById(0x7f0d006b);
        mSuggestText = (TextView)findViewById(0x7f0d0336);
        mDefaultIconDrawable = getContext().getResources().getDrawable(0x7f0201c5);
    }
}
