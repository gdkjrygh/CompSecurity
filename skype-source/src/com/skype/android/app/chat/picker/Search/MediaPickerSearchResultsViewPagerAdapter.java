// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.s;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.skype.android.app.chat.picker.PickerCustomRowBuilder;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.OnMediaContentReady;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            SearchWeightedMediaContent

public class MediaPickerSearchResultsViewPagerAdapter extends s
    implements com.skype.android.app.chat.picker.PickerCustomRowBuilder.CustomPickerMediaProviderCallback, com.skype.android.app.chat.picker.PickerItemInteractionManager.PickerItemViewUpdateCallback, com.skype.android.app.chat.picker.PickerItemViewBuilder.MediaPendingRequestCallback
{

    private static Logger log = Logger.getLogger("MediaPickerSearchResultsViewPagerAdapter");
    private Context context;
    private int itemsPerRow;
    private SparseIntArray pendingItemRequests;
    private final PickerCustomRowBuilder pickerCustomRowBuilder;
    private int rowCount;
    private ArrayList searchedMediaArray;
    private int totalPages;

    public MediaPickerSearchResultsViewPagerAdapter(Context context1, Set set, MediaContentRoster mediacontentroster, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaSendCallback mediasendcallback, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaPreviewCallback mediapreviewcallback, com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        itemsPerRow = 6;
        rowCount = 1;
        context = context1;
        searchedMediaArray = new ArrayList(set);
        pickerCustomRowBuilder = new PickerCustomRowBuilder(context1, mediasendcallback, mediapreviewcallback, this, this);
        pendingItemRequests = new SparseIntArray();
        if (document_type == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON)
        {
            rowCount = getRowsCountForContentType(1);
            itemsPerRow = pickerCustomRowBuilder.getColumnCountForContentType(1);
            totalPages = (int)Math.ceil((double)set.size() / (double)itemsPerRow);
            return;
        }
        if (document_type == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK)
        {
            rowCount = getRowsCountForContentType(0);
            itemsPerRow = pickerCustomRowBuilder.getColumnCountForContentType(0);
            totalPages = (int)Math.ceil((double)set.size() / (double)(itemsPerRow * 2));
            return;
        } else
        {
            log.severe((new StringBuilder("Unsupported media document type: ")).append(document_type.name()).toString());
            return;
        }
    }

    private int getRowsCountForContentType(int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 35;
           goto _L1 _L2
_L1:
        i = 0x7f0e0035;
_L4:
        return context.getResources().getInteger(i);
_L2:
        i = 0x7f0e0005;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((LinearLayout)obj);
    }

    public int getCount()
    {
        return (int)Math.ceil((float)searchedMediaArray.size() / (float)(itemsPerRow * rowCount));
    }

    public MediaContent getItem(int i)
    {
        return ((SearchWeightedMediaContent)searchedMediaArray.get(i)).getMediaContent();
    }

    public MediaContent getMediaForPosition(int i)
    {
        return ((SearchWeightedMediaContent)searchedMediaArray.get(i)).getMediaContent();
    }

    public int getTotalPages()
    {
        return totalPages;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup.setVisibility(8);
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        linearlayout.setOrientation(1);
        PickerCustomRowBuilder pickercustomrowbuilder = pickerCustomRowBuilder;
        int j = itemsPerRow;
        pickercustomrowbuilder.createPickerItemRows(linearlayout, this, rowCount * (j * i), rowCount, itemsPerRow);
        viewgroup.addView(linearlayout);
        viewgroup.setVisibility(0);
        return linearlayout;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return obj == view;
    }

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

    public void refreshItem(int i)
    {
        pickerCustomRowBuilder.refreshItem(i);
    }

    public void setTelemetrydata(MediaContent mediacontent)
    {
        mediacontent.a(com.skype.android.mediacontent.MediaContent.Source.d);
    }

    public int size()
    {
        return searchedMediaArray.size();
    }

}
