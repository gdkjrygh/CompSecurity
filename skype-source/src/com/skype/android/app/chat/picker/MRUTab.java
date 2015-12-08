// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.OnMRUListUpdated;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat.picker:
//            AbstractPickerTab, AbstractPickerTabComponent, PickerItemViewBuilder, PickerItemInteractionManager, 
//            PickerCustomRowBuilder, MRUManager

public class MRUTab extends AbstractPickerTab
{

    EcsConfiguration configuration;
    private View contentView;
    private View emptyView;
    MRUManager mruManager;
    private final PickerCustomRowBuilder pickerCustomRowBuilder;
    private final PickerItemViewBuilder pickerItemViewBuilder;
    private final PickerItemInteractionManager pickeritemClickHandler;
    private ViewGroup rowsContainer;
    UserPreferences userPrefs;

    public MRUTab(Context context, ExtensiblePickerDialogFragment.Callback callback, PickerItemInteractionManager.MediaSendCallback mediasendcallback, PickerItemInteractionManager.MediaPreviewCallback mediapreviewcallback, AbstractPickerTab.TabCallback tabcallback)
    {
        super(context, callback, tabcallback);
        getComponent().inject(this);
        pickerItemViewBuilder = new PickerItemViewBuilder(context, mediapreviewcallback, this);
        pickeritemClickHandler = new PickerItemInteractionManager(mediasendcallback, mediapreviewcallback, this);
        pickerCustomRowBuilder = new PickerCustomRowBuilder(context, mediasendcallback, mediapreviewcallback, this, this);
        init();
    }

    private void createMRURows(com.skype.MediaDocument.DOCUMENT_TYPE document_type, int i)
    {
        createMRURows(document_type, 0, i);
    }

    private void createMRURows(final com.skype.MediaDocument.DOCUMENT_TYPE type, int i, int j)
    {
        final List recentItemsIds = mruManager.getRecentItemsOfType(type);
        int k = pickerCustomRowBuilder.getColumnCountForContentType(pickerCustomRowBuilder.getItemViewType(type));
        pickerCustomRowBuilder.createPickerItemRows(rowsContainer, new PickerCustomRowBuilder.CustomPickerMediaProviderCallback() {

            final MRUTab this$0;
            final List val$recentItemsIds;
            final com.skype.MediaDocument.DOCUMENT_TYPE val$type;

            public final MediaContent getMediaForPosition(int l)
            {
                return getMediaContentRoster().a((String)recentItemsIds.get(l), type);
            }

            public final int size()
            {
                return recentItemsIds.size();
            }

            
            {
                this$0 = MRUTab.this;
                recentItemsIds = list;
                type = document_type;
                super();
            }
        }, i, j, k);
    }

    private void detachViews()
    {
        for (int i = 0; i < rowsContainer.getChildCount(); i++)
        {
            ((ViewGroup)rowsContainer.getChildAt(i)).removeAllViews();
        }

        rowsContainer.removeAllViews();
    }

    private void toggleEmptyViewVisibility(boolean flag)
    {
        boolean flag1 = false;
        int i;
        if (flag)
        {
            View view;
            if (configuration.isMojiSupported() && userPrefs.isMojiEnabled())
            {
                i = 0x7f0804b8;
            } else
            {
                i = 0x7f0804b9;
            }
            ((TextView)emptyView.findViewById(0x7f1004ae)).setText(i);
        }
        view = emptyView;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = contentView;
        if (!flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    protected void consume()
    {
    }

    public int getId()
    {
        return 0;
    }

    public MediaContent getItem(int i)
    {
        return pickerCustomRowBuilder.getItem(i);
    }

    protected int getSortingOrder()
    {
        return 0;
    }

    protected String getTelemetryPackName()
    {
        return "Recents";
    }

    protected com.skype.android.mediacontent.MediaContent.Source getTelemetrySource()
    {
        return com.skype.android.mediacontent.MediaContent.Source.a;
    }

    protected View initContentView()
    {
        View view = LayoutInflater.from(getContext()).inflate(0x7f0300d7, null);
        emptyView = view.findViewById(0x7f1004ad);
        contentView = view.findViewById(0x7f1004af);
        rowsContainer = (ViewGroup)view.findViewById(0x7f1004b0);
        ((TextView)view.findViewById(0x7f1004b1)).setText(0x7f080303);
        setGlyphAsset(0x7f0201ce);
        contentView.setOnClickListener(pickeritemClickHandler);
        return view;
    }

    protected boolean isConsumed()
    {
        return true;
    }

    protected boolean isItemFeatured(MediaContent mediacontent)
    {
        return false;
    }

    protected void loadContent()
    {
        detachViews();
        pickerCustomRowBuilder.clearAddedItems();
        Resources resources = getContext().getResources();
        createMRURows(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON, resources.getInteger(0x7f0e0037));
        if (getPickerCallback() != null && !getPickerCallback().getShowEmoticonsOnly())
        {
            createMRURows(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK, resources.getInteger(0x7f0e0038));
        }
        boolean flag;
        if (pickerCustomRowBuilder.getAddedItemsCount() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        toggleEmptyViewVisibility(flag);
    }

    protected void onContentLoaded()
    {
    }

    public void onEvent(OnMRUListUpdated onmrulistupdated)
    {
        loadContent();
    }

    public void refreshItem(int i)
    {
        pickerCustomRowBuilder.refreshItem(i);
    }

    public void removeCurrentMojiSelectedPosition()
    {
        pickeritemClickHandler.removeCurrentMojiSelectedPosition();
    }
}
