// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.widget.fliks.FlikRelativeLayout;

// Referenced classes of package com.skype.android.app.chat.picker:
//            PickerMediaViewHolder

public class PickerItemViewBuilder
{
    public static interface MediaPendingRequestCallback
    {

        public abstract void putInPendingQueue(int i, int j);
    }


    private static final int EMOTICON_VIEW_TYPE = 1;
    private static final int MOJI_VIEW_TYPE = 0;
    private Context context;
    private final Drawable emoticonPlaceholderDrawable;
    private MediaPendingRequestCallback mediaPendingRequestCallback;
    private PickerItemInteractionManager.MediaPreviewCallback mediaPreviewCallback;
    private final ColorDrawable mojiPlaceholderDrawable;

    public PickerItemViewBuilder(Context context1, PickerItemInteractionManager.MediaPreviewCallback mediapreviewcallback, MediaPendingRequestCallback mediapendingrequestcallback)
    {
        context = context1;
        mediaPreviewCallback = mediapreviewcallback;
        mediaPendingRequestCallback = mediapendingrequestcallback;
        mojiPlaceholderDrawable = new ColorDrawable(context1.getResources().getColor(0x7f0f0085));
        emoticonPlaceholderDrawable = context1.getResources().getDrawable(0x7f02007e);
    }

    public void bindViewHolder(PickerMediaViewHolder pickermediaviewholder, MediaContent mediacontent, int i, android.view.View.OnClickListener onclicklistener, boolean flag)
    {
        ImageView imageview;
        Drawable drawable;
        int j;
        imageview = pickermediaviewholder.getImageView();
        drawable = mediacontent.b();
        j = getItemViewType(mediacontent);
        if (drawable != null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        j;
        JVM INSTR tableswitch 0 1: default 48
    //                   0 132
    //                   1 144;
           goto _L1 _L2 _L3
_L1:
        mediaPreviewCallback.requestThumbnail(mediacontent.k());
        if (mediaPendingRequestCallback != null)
        {
            mediaPendingRequestCallback.putInPendingQueue(mediacontent.k(), i);
        }
_L4:
        if (j == 0)
        {
            pickermediaviewholder.getTextView().setText(mediacontent.m());
            if (flag)
            {
                pickermediaviewholder.getSendView().setVisibility(0);
            } else
            {
                pickermediaviewholder.getSendView().setVisibility(8);
            }
        }
        pickermediaviewholder.itemView.setTag(Integer.valueOf(i));
        pickermediaviewholder.itemView.setOnClickListener(onclicklistener);
        return;
_L2:
        imageview.setImageDrawable(mojiPlaceholderDrawable);
          goto _L1
_L3:
        imageview.setImageDrawable(emoticonPlaceholderDrawable);
          goto _L1
        imageview.setImageDrawable(drawable);
          goto _L4
    }

    public PickerMediaViewHolder createViewHolder(ViewGroup viewgroup, int i)
    {
        PickerMediaViewHolder pickermediaviewholder;
        Object obj;
        pickermediaviewholder = null;
        obj = null;
        i;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 47
    //                   1 78;
           goto _L1 _L2 _L3
_L1:
        viewgroup = obj;
_L5:
        if (viewgroup != null)
        {
            pickermediaviewholder = new PickerMediaViewHolder(viewgroup, i);
        }
        return pickermediaviewholder;
_L2:
        viewgroup = LayoutInflater.from(context).inflate(0x7f0300d5, viewgroup, false);
        ((FlikRelativeLayout)viewgroup.findViewById(0x7f1004a8)).a(-1);
        continue; /* Loop/switch isn't completed */
_L3:
        viewgroup = LayoutInflater.from(context).inflate(0x7f0300d1, viewgroup, false);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int getItemViewType(MediaContent mediacontent)
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

        switch (_cls1..SwitchMap.com.skype.MediaDocument.DOCUMENT_TYPE[mediacontent.n().ordinal()])
        {
        default:
            return 1;

        case 1: // '\001'
            return 0;
        }
    }
}
