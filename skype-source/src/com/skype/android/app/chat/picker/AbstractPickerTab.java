// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseIntArray;
import android.view.View;
import com.skype.android.SkypeApplication;
import com.skype.android.analytics.Analytics;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.OnMediaContentReady;
import com.skype.android.mediacontent.PackInfoUtils;
import com.skype.android.widget.BadgeDecoratorView;

// Referenced classes of package com.skype.android.app.chat.picker:
//            AbstractPickerTabComponent, DaggerAbstractPickerTabComponent, GlyphImageView

public abstract class AbstractPickerTab
    implements PickerItemInteractionManager.PickerItemViewUpdateCallback, PickerItemViewBuilder.MediaPendingRequestCallback, Comparable
{
    protected static interface TabCallback
    {

        public abstract int getDefaultTabsCount();

        public abstract void hideBottomBar();

        public abstract void showBottomBar();
    }


    private static final String CACHE_PREFIX = "tab:";
    protected static final int EMOTICON_VIEW_TYPE = 1;
    protected static final int MOJI_VIEW_TYPE = 0;
    Analytics analytics;
    private AbstractPickerTabComponent component;
    EcsConfiguration configuration;
    private View contentView;
    private Context context;
    private final EventSubscriberBinder eventBinder = new EventSubscriberBinder(EventBusInstance.a(), this);
    private BadgeDecoratorView glyphView;
    MediaContentRoster mediaContentRoster;
    PackInfoUtils packInfoUtils;
    private SparseIntArray pendingItemRequests;
    private ExtensiblePickerDialogFragment.Callback pickerCallback;
    private int position;
    private TabCallback tabCallback;

    public AbstractPickerTab(Context context1, ExtensiblePickerDialogFragment.Callback callback, TabCallback tabcallback)
    {
        context = context1;
        pickerCallback = callback;
        tabCallback = tabcallback;
        getComponent().inject(this);
        eventBinder.bind();
        pendingItemRequests = new SparseIntArray();
        position = -1;
    }

    private int getPosition()
    {
        return position;
    }

    public int compareTo(AbstractPickerTab abstractpickertab)
    {
        return getSortingOrder() - abstractpickertab.getSortingOrder();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((AbstractPickerTab)obj);
    }

    protected abstract void consume();

    public void destroy()
    {
        eventBinder.unbind();
    }

    protected int getColumnCountForContentType(com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[];

            static 
            {
                $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE = new int[com.skype.MediaDocument.DOCUMENT_TYPE.values().length];
                try
                {
                    $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$MediaDocument$DOCUMENT_TYPE[com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.MediaDocument.DOCUMENT_TYPE[document_type.ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 43;
           goto _L1 _L2
_L1:
        int i = 0x7f0e0002;
_L4:
        return getContext().getResources().getInteger(i);
_L2:
        i = 0x7f0e0003;
        if (true) goto _L4; else goto _L3
_L3:
    }

    AbstractPickerTabComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerAbstractPickerTabComponent.builder().skypeApplicationComponent(((SkypeApplication)context.getApplicationContext()).a()).build();
        }
        return component;
    }

    public View getContentView()
    {
        return contentView;
    }

    protected Context getContext()
    {
        return context;
    }

    public View getGlyphView()
    {
        return glyphView;
    }

    protected abstract int getId();

    public abstract MediaContent getItem(int i);

    protected MediaContentRoster getMediaContentRoster()
    {
        return mediaContentRoster;
    }

    protected ExtensiblePickerDialogFragment.Callback getPickerCallback()
    {
        return pickerCallback;
    }

    protected abstract int getSortingOrder();

    protected TabCallback getTabCallback()
    {
        return tabCallback;
    }

    protected abstract String getTelemetryPackName();

    protected abstract com.skype.android.mediacontent.MediaContent.Source getTelemetrySource();

    protected void init()
    {
        setContentView(initContentView());
        loadContent();
        onContentLoaded();
    }

    protected abstract View initContentView();

    protected abstract boolean isConsumed();

    protected abstract boolean isItemFeatured(MediaContent mediacontent);

    protected abstract void loadContent();

    protected abstract void onContentLoaded();

    public void onEvent(OnMediaContentReady onmediacontentready)
    {
        int i = onmediacontentready.a();
        int j = pendingItemRequests.get(i, -1);
        if (j != -1)
        {
            refreshItem(j);
            pendingItemRequests.delete(i);
        }
    }

    public void putInPendingQueue(int i, int j)
    {
        pendingItemRequests.put(i, j);
    }

    public abstract void refreshItem(int i);

    public abstract void removeCurrentMojiSelectedPosition();

    protected void setBadgeVisibile(boolean flag)
    {
        if (glyphView != null)
        {
            glyphView.setBadgeVisible(flag);
        }
    }

    protected void setContentView(View view)
    {
        contentView = view;
    }

    public void setGlyphAsset(int i)
    {
        String s = PackInfoUtils.a(i);
        Bitmap bitmap = PackInfoUtils.a(s);
        if (bitmap != null)
        {
            setGlyphAsset(bitmap);
            return;
        } else
        {
            Bitmap bitmap1 = BitmapFactory.decodeResource(getContext().getResources(), i);
            setGlyphAsset(bitmap1);
            PackInfoUtils.a(s, bitmap1);
            return;
        }
    }

    protected void setGlyphAsset(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap = new GlyphImageView(context, bitmap);
            glyphView = new BadgeDecoratorView(context, bitmap);
            glyphView.setBadgeDistanceFromEdgeToCenter(glyphView.getResources().getDimensionPixelSize(0x7f0c00b6));
            bitmap = glyphView;
            boolean flag;
            if (!isConsumed())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bitmap.setBadgeVisible(flag);
        }
    }

    public void setPosition(int i)
    {
        position = i;
    }

    public void setTelemetrydata(MediaContent mediacontent)
    {
        mediacontent.a(getTelemetrySource());
        mediacontent.c(getTelemetryPackName());
        mediacontent.b(getPosition());
        mediacontent.a(isItemFeatured(mediacontent));
    }
}
