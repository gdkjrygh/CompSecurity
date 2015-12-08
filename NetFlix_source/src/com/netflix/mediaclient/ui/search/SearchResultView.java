// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.search;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.android.widget.VideoDetailsClickListener;
import com.netflix.mediaclient.servicemgr.SearchPerson;
import com.netflix.mediaclient.servicemgr.SearchSuggestion;
import com.netflix.mediaclient.servicemgr.SearchVideo;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextProvider;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;

// Referenced classes of package com.netflix.mediaclient.ui.search:
//            SearchQueryDetailsActivity

public class SearchResultView extends FrameLayout
    implements PlayContextProvider
{
    private static final class ImgSizeType extends Enum
    {

        private static final ImgSizeType $VALUES[];
        public static final ImgSizeType BOXART;
        public static final ImgSizeType SQUARE;
        private final int heightDimenId;

        public static ImgSizeType valueOf(String s)
        {
            return (ImgSizeType)Enum.valueOf(com/netflix/mediaclient/ui/search/SearchResultView$ImgSizeType, s);
        }

        public static ImgSizeType[] values()
        {
            return (ImgSizeType[])$VALUES.clone();
        }

        static 
        {
            BOXART = new ImgSizeType("BOXART", 0, 0x7f0a0046);
            SQUARE = new ImgSizeType("SQUARE", 1, 0x7f0a0045);
            $VALUES = (new ImgSizeType[] {
                BOXART, SQUARE
            });
        }


        private ImgSizeType(String s, int i, int j)
        {
            super(s, i);
            heightDimenId = j;
        }
    }

    private class PersonClickListener
        implements android.view.View.OnClickListener
    {

        private final String id;
        private final String name;
        final SearchResultView this$0;

        public void onClick(View view)
        {
            SearchQueryDetailsActivity.show((Activity)getContext(), SearchQueryDetailsActivity.SearchQueryDetailsType.PERSON, id, name);
        }

        public PersonClickListener(String s, String s1)
        {
            this$0 = SearchResultView.this;
            super();
            id = s;
            name = s1;
        }
    }

    private class SuggestionClickListener
        implements android.view.View.OnClickListener
    {

        private final String id;
        final SearchResultView this$0;
        private final String title;

        public void onClick(View view)
        {
            SearchQueryDetailsActivity.show((Activity)getContext(), SearchQueryDetailsActivity.SearchQueryDetailsType.SEARCH_SUGGESTION, id, title);
        }

        public SuggestionClickListener(String s, String s1)
        {
            this$0 = SearchResultView.this;
            super();
            id = s;
            title = s1;
        }
    }


    public static final String PEOPLE_TAG = "People";
    public static final String SUGGESTION_TAG = "Suggestion";
    public static final String VIDEO_TAG = "Video";
    private AdvancedImageView img;
    private PlayContext playContext;
    protected TextView rating;
    protected TextView title;
    private View verticalDivider;
    private VideoDetailsClickListener videoClickListener;

    public SearchResultView(Context context)
    {
        super(context);
        init();
    }

    public SearchResultView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private CharSequence getFormattedYearSpannable(String s, String s1)
    {
        if (StringUtils.isEmpty(s1))
        {
            return s;
        } else
        {
            s = new SpannableString(String.format("%s  (%s)", new Object[] {
                s, s1
            }));
            int i = s.length();
            int j = i - s1.length() - 4;
            s.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(0x7f0a002d)), j, i, 0);
            s.setSpan(new ForegroundColorSpan(getResources().getColor(getYearColorResId())), j, i, 0);
            return s;
        }
    }

    private void init()
    {
        NetflixActivity netflixactivity = (NetflixActivity)getContext();
        netflixactivity.getLayoutInflater().inflate(0x7f030077, this);
        playContext = PlayContext.EMPTY_CONTEXT;
        setForeground(getResources().getDrawable(0x7f02015f));
        img = (AdvancedImageView)findViewById(0x7f070191);
        img.setPressedStateHandlerEnabled(false);
        title = (TextView)findViewById(0x7f070192);
        verticalDivider = findViewById(0x7f070194);
        rating = (TextView)findViewById(0x7f070193);
        rating.setVisibility(8);
        videoClickListener = new VideoDetailsClickListener(netflixactivity, this);
    }

    private void setViewHeights(ImgSizeType imgsizetype)
    {
        int i = getResources().getDimensionPixelOffset(imgsizetype.heightDimenId);
        img.getLayoutParams().height = i;
        verticalDivider.getLayoutParams().height = i;
    }

    private void update(SearchPerson searchperson)
    {
        setViewHeights(ImgSizeType.SQUARE);
        String s = searchperson.getName();
        setContentDescription(s);
        setTag("People");
        title.setText(s);
        img.setVisibility(0);
        String s1 = searchperson.getImgUrl();
        NetflixActivity.getImageLoader(getContext()).showImg(img, s1, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.heroImage, s, false, false);
        if (StringUtils.isEmpty(s1))
        {
            img.setImageResource(0x7f020174);
        }
        videoClickListener.remove(this);
        setOnClickListener(new PersonClickListener(searchperson.getId(), searchperson.getName()));
    }

    private void update(SearchSuggestion searchsuggestion)
    {
        setViewHeights(ImgSizeType.SQUARE);
        String s = searchsuggestion.getTitle();
        setContentDescription(s);
        setTag("Suggestion");
        title.setText(s);
        img.setVisibility(8);
        videoClickListener.remove(this);
        setOnClickListener(new SuggestionClickListener(searchsuggestion.getTitle(), searchsuggestion.getTitle()));
    }

    public PlayContext getPlayContext()
    {
        return playContext;
    }

    protected int getYearColorResId()
    {
        return 0x7f09003b;
    }

    public void update(Object obj, PlayContext playcontext)
    {
        playContext = playcontext;
        if (obj instanceof SearchVideo)
        {
            updateForVideo((SearchVideo)obj, playcontext.getVideoPos());
            return;
        }
        if (obj instanceof SearchPerson)
        {
            update((SearchPerson)obj);
            return;
        }
        if (obj instanceof SearchSuggestion)
        {
            update((SearchSuggestion)obj);
            return;
        } else
        {
            throw new IllegalStateException("Unknown search result type");
        }
    }

    protected void updateForVideo(SearchVideo searchvideo, int i)
    {
        setViewHeights(ImgSizeType.BOXART);
        setContentDescription(searchvideo.getTitle());
        setTag("Video");
        title.setText(getFormattedYearSpannable(searchvideo.getTitle(), String.valueOf(searchvideo.getYear())));
        img.setVisibility(0);
        NetflixActivity.getImageLoader(getContext()).showImg(img, searchvideo.getBoxshotURL(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, searchvideo.getTitle(), true, true);
        videoClickListener.update(this, searchvideo);
    }
}
