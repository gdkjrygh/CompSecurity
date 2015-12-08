// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mopub.network.Networking;
import com.mopub.network.TrackingRequest;
import com.mopub.volley.toolbox.ImageLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mopub.nativeads:
//            ak, ad, al, MoPubNative, 
//            aw, d, ay, am, 
//            an

public class NativeResponse
{

    private final Context a;
    private final ImageLoader b;
    private MoPubNative.MoPubNativeEventListener c;
    private final ad d;
    private final Set e = new HashSet();
    private final String f;
    private final String g;
    private boolean h;
    private boolean i;
    private boolean j;

    public NativeResponse(Context context, String s, String s1, String s2, ad ad1, MoPubNative.MoPubNativeEventListener mopubnativeeventlistener)
    {
        a = context.getApplicationContext();
        g = s2;
        c = mopubnativeeventlistener;
        d = ad1;
        d.setNativeEventListener(new ak(this));
        e.add(s);
        f = s1;
        b = Networking.getImageLoader(context);
    }

    private void a(View view, android.view.View.OnClickListener onclicklistener)
    {
        view.setOnClickListener(onclicklistener);
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int k = 0; k < view.getChildCount(); k++)
            {
                a(view.getChildAt(k), onclicklistener);
            }

        }
    }

    private void a(String s, ImageView imageview)
    {
        if (imageview == null)
        {
            return;
        }
        if (s == null)
        {
            imageview.setImageDrawable(null);
            return;
        } else
        {
            b.get(s, new al(this, imageview));
            return;
        }
    }

    public void clear(View view)
    {
        a(view, ((android.view.View.OnClickListener) (null)));
        d.clear(view);
    }

    public void destroy()
    {
        if (isDestroyed())
        {
            return;
        } else
        {
            c = MoPubNative.b;
            d.destroy();
            j = true;
            return;
        }
    }

    public String getAdUnitId()
    {
        return g;
    }

    public String getCallToAction()
    {
        return d.getCallToAction();
    }

    public String getClickDestinationUrl()
    {
        return d.getClickDestinationUrl();
    }

    public String getClickTracker()
    {
        return f;
    }

    public Object getExtra(String s)
    {
        return d.getExtra(s);
    }

    public Map getExtras()
    {
        return d.getExtras();
    }

    public String getIconImageUrl()
    {
        return d.getIconImageUrl();
    }

    public int getImpressionMinPercentageViewed()
    {
        return d.getImpressionMinPercentageViewed();
    }

    public int getImpressionMinTimeViewed()
    {
        return d.getImpressionMinTimeViewed();
    }

    public List getImpressionTrackers()
    {
        HashSet hashset = new HashSet();
        hashset.addAll(e);
        hashset.addAll(d.getImpressionTrackers());
        return new ArrayList(hashset);
    }

    public String getMainImageUrl()
    {
        return d.getMainImageUrl();
    }

    public boolean getRecordedImpression()
    {
        return h;
    }

    public Double getStarRating()
    {
        return d.getStarRating();
    }

    public String getSubtitle()
    {
        return d.getText();
    }

    public String getText()
    {
        return d.getText();
    }

    public String getTitle()
    {
        return d.getTitle();
    }

    public void handleClick(View view)
    {
        if (isDestroyed())
        {
            return;
        }
        if (!isClicked())
        {
            TrackingRequest.makeTrackingHttpRequest(f, a, com.mopub.common.event.BaseEvent.Name.CLICK_REQUEST);
        }
        if (getClickDestinationUrl() != null)
        {
            Object obj = null;
            if (view != null)
            {
                obj = new aw(a);
                ((aw) (obj)).a(view);
            }
            Iterator iterator = Arrays.asList(new String[] {
                getClickDestinationUrl()
            }).iterator();
            obj = new d(a, iterator, ((aw) (obj)));
            ay.getResolvedUrl((String)iterator.next(), ((az) (obj)));
        }
        d.handleClick(view);
        i = true;
        c.onNativeClick(view);
    }

    public boolean isClicked()
    {
        return i;
    }

    public boolean isDestroyed()
    {
        return j;
    }

    public boolean isOverridingClickTracker()
    {
        return d.isOverridingClickTracker();
    }

    public boolean isOverridingImpressionTracker()
    {
        return d.isOverridingImpressionTracker();
    }

    public void loadExtrasImage(String s, ImageView imageview)
    {
        s = ((String) (getExtra(s)));
        if (s != null && (s instanceof String))
        {
            a((String)s, imageview);
        }
    }

    public void loadIconImage(ImageView imageview)
    {
        a(getIconImageUrl(), imageview);
    }

    public void loadMainImage(ImageView imageview)
    {
        a(getMainImageUrl(), imageview);
    }

    public void prepare(View view)
    {
        if (isDestroyed())
        {
            return;
        }
        if (!isOverridingClickTracker())
        {
            a(view, new am(this));
        }
        d.prepare(view);
    }

    public void recordImpression(View view)
    {
        if (getRecordedImpression() || isDestroyed())
        {
            return;
        }
        for (Iterator iterator = getImpressionTrackers().iterator(); iterator.hasNext(); TrackingRequest.makeTrackingHttpRequest((String)iterator.next(), a, com.mopub.common.event.BaseEvent.Name.IMPRESSION_REQUEST)) { }
        d.recordImpression();
        h = true;
        c.onNativeImpression(view);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("\n");
        stringbuilder.append(an.TITLE.a).append(":").append(getTitle()).append("\n");
        stringbuilder.append(an.TEXT.a).append(":").append(getText()).append("\n");
        stringbuilder.append(an.ICON_IMAGE.a).append(":").append(getIconImageUrl()).append("\n");
        stringbuilder.append(an.MAIN_IMAGE.a).append(":").append(getMainImageUrl()).append("\n");
        stringbuilder.append(an.STAR_RATING.a).append(":").append(getStarRating()).append("\n");
        stringbuilder.append(an.IMPRESSION_TRACKER.a).append(":").append(getImpressionTrackers()).append("\n");
        stringbuilder.append(an.CLICK_TRACKER.a).append(":").append(f).append("\n");
        stringbuilder.append(an.CLICK_DESTINATION.a).append(":").append(getClickDestinationUrl()).append("\n");
        stringbuilder.append(an.CALL_TO_ACTION.a).append(":").append(getCallToAction()).append("\n");
        stringbuilder.append("recordedImpression:").append(h).append("\n");
        stringbuilder.append("extras:").append(getExtras());
        return stringbuilder.toString();
    }
}
