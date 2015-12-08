// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.widget.Space;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.skype.android.mediacontent.MediaContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerItemInteractionManager, PickerItemViewBuilder, PickerMediaViewHolder

public class PickerCustomRowBuilder
{
    public static interface CustomPickerMediaProviderCallback
    {

        public abstract MediaContent getMediaForPosition(int i);

        public abstract int size();
    }


    public static final int EMOTICON_VIEW_TYPE = 1;
    public static final int MOJI_VIEW_TYPE = 0;
    private Context context;
    private ArrayList holders;
    private ArrayList items;
    private final PickerItemInteractionManager pickerItemClickListener;
    private final PickerItemViewBuilder pickerItemViewBuilder;
    private final SparseArray scrapHolders = new SparseArray();

    public PickerCustomRowBuilder(Context context1, PickerItemInteractionManager.MediaSendCallback mediasendcallback, PickerItemInteractionManager.MediaPreviewCallback mediapreviewcallback, PickerItemInteractionManager.PickerItemViewUpdateCallback pickeritemviewupdatecallback, PickerItemViewBuilder.MediaPendingRequestCallback mediapendingrequestcallback)
    {
        context = context1;
        pickerItemClickListener = new PickerItemInteractionManager(mediasendcallback, mediapreviewcallback, pickeritemviewupdatecallback);
        pickerItemViewBuilder = new PickerItemViewBuilder(context1, mediapreviewcallback, mediapendingrequestcallback);
        holders = new ArrayList();
        items = new ArrayList();
    }

    private PickerMediaViewHolder getScrapViewHolder(int i)
    {
        LinkedList linkedlist = (LinkedList)scrapHolders.get(i);
        if (linkedlist == null || linkedlist.size() == 0)
        {
            return null;
        } else
        {
            return (PickerMediaViewHolder)linkedlist.removeFirst();
        }
    }

    private void putScrapViewHolder(PickerMediaViewHolder pickermediaviewholder)
    {
        LinkedList linkedlist1 = (LinkedList)scrapHolders.get(pickermediaviewholder.getType());
        LinkedList linkedlist = linkedlist1;
        if (linkedlist1 == null)
        {
            linkedlist = new LinkedList();
            scrapHolders.put(pickermediaviewholder.getType(), linkedlist);
        }
        linkedlist.add(pickermediaviewholder);
    }

    private void recycleHolders()
    {
        for (Iterator iterator = holders.iterator(); iterator.hasNext(); putScrapViewHolder((PickerMediaViewHolder)iterator.next())) { }
        holders.clear();
    }

    public void clearAddedItems()
    {
        items.clear();
        recycleHolders();
    }

    public void createPickerItemRows(ViewGroup viewgroup, CustomPickerMediaProviderCallback custompickermediaprovidercallback, int i, int j, int k)
    {
        LinearLayout linearlayout;
        int l;
        LayoutInflater layoutinflater = LayoutInflater.from(context);
        l = custompickermediaprovidercallback.size();
        linearlayout = (LinearLayout)layoutinflater.inflate(0x7f0300d6, viewgroup, false);
        if (l - i == 0) goto _L2; else goto _L1
_L1:
        int i1;
        i1 = 0;
        linearlayout.setWeightSum(k);
        l = i;
_L8:
        if (l >= custompickermediaprovidercallback.size()) goto _L4; else goto _L3
_L3:
        MediaContent mediacontent;
        int j1;
        mediacontent = custompickermediaprovidercallback.getMediaForPosition(l);
        j1 = i1;
        if (mediacontent == null) goto _L6; else goto _L5
_L5:
        j1 = getItemViewType(mediacontent);
        Object obj = getScrapViewHolder(j1);
        PickerMediaViewHolder pickermediaviewholder = ((PickerMediaViewHolder) (obj));
        if (obj == null)
        {
            pickermediaviewholder = pickerItemViewBuilder.createViewHolder(linearlayout, j1);
        }
        holders.add(pickermediaviewholder);
        obj = pickermediaviewholder.itemView;
        PickerItemViewBuilder pickeritemviewbuilder = pickerItemViewBuilder;
        j1 = items.size();
        PickerItemInteractionManager pickeriteminteractionmanager = pickerItemClickListener;
        boolean flag;
        if (items.size() == pickerItemClickListener.getCurrentMojiSelectedPosition())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pickeritemviewbuilder.bindViewHolder(pickermediaviewholder, mediacontent, j1, pickeriteminteractionmanager, flag);
        items.add(mediacontent);
        i1++;
        ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).weight = 1.0F;
        ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).width = 0;
        linearlayout.addView(((View) (obj)));
        j1 = i1;
        if (i1 != k) goto _L6; else goto _L7
_L7:
        if (j <= 1)
        {
            break; /* Loop/switch isn't completed */
        }
        viewgroup.addView(linearlayout);
        createPickerItemRows(viewgroup, custompickermediaprovidercallback, i + i1, j - 1, k);
_L2:
        return;
_L6:
        l++;
        i1 = j1;
          goto _L8
_L4:
        for (i = linearlayout.getChildCount(); i < k; i++)
        {
            linearlayout.addView(new Space(context), new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F));
        }

        viewgroup.addView(linearlayout);
        return;
    }

    public int getAddedItemsCount()
    {
        return items.size();
    }

    public int getColumnCountForContentType(int i)
    {
        i;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 35;
           goto _L1 _L2
_L1:
        i = 0x7f0e0002;
_L4:
        return context.getResources().getInteger(i);
_L2:
        i = 0x7f0e0003;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public MediaContent getItem(int i)
    {
        return (MediaContent)items.get(i);
    }

    public int getItemViewType(com.skype.MediaDocument.DOCUMENT_TYPE document_type)
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

        switch (_cls1..SwitchMap.com.skype.MediaDocument.DOCUMENT_TYPE[document_type.ordinal()])
        {
        default:
            return 1;

        case 1: // '\001'
            return 0;
        }
    }

    public int getItemViewType(MediaContent mediacontent)
    {
        return getItemViewType(mediacontent.n());
    }

    public void refreshItem(int i)
    {
        PickerMediaViewHolder pickermediaviewholder;
        if (i >= 0 && i < holders.size())
        {
            pickermediaviewholder = (PickerMediaViewHolder)holders.get(i);
        } else
        {
            pickermediaviewholder = null;
        }
        if (pickermediaviewholder != null)
        {
            PickerItemViewBuilder pickeritemviewbuilder = pickerItemViewBuilder;
            MediaContent mediacontent = (MediaContent)items.get(i);
            PickerItemInteractionManager pickeriteminteractionmanager = pickerItemClickListener;
            boolean flag;
            if (i == pickerItemClickListener.getCurrentMojiSelectedPosition())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            pickeritemviewbuilder.bindViewHolder(pickermediaviewholder, mediacontent, i, pickeriteminteractionmanager, flag);
        }
    }
}
