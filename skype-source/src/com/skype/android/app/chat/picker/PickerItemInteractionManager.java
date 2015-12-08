// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import android.view.View;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.MojiContent;

public class PickerItemInteractionManager
    implements android.view.View.OnClickListener
{
    public static interface MediaPreviewCallback
    {

        public abstract void onMojiPreviewDismissed();

        public abstract void onMojiSelected(MojiContent mojicontent);

        public abstract void requestThumbnail(int i);
    }

    public static interface MediaSendCallback
    {

        public abstract void onEmoticonSelected(EmoticonContent emoticoncontent);

        public abstract void onSendMoji(MojiContent mojicontent);
    }

    public static interface PickerItemViewUpdateCallback
    {

        public abstract MediaContent getItem(int i);

        public abstract void refreshItem(int i);

        public abstract void setTelemetrydata(MediaContent mediacontent);
    }


    private int currentMojiSelectedPosition;
    MediaContentRoster mediaContentRoster;
    private MediaPreviewCallback mediaPreviewCallback;
    private MediaSendCallback mediaSendCallback;
    private PickerItemViewUpdateCallback pickerItemViewUpdateCallback;

    public PickerItemInteractionManager(MediaSendCallback mediasendcallback, MediaPreviewCallback mediapreviewcallback, PickerItemViewUpdateCallback pickeritemviewupdatecallback)
    {
        mediaSendCallback = mediasendcallback;
        mediaPreviewCallback = mediapreviewcallback;
        pickerItemViewUpdateCallback = pickeritemviewupdatecallback;
        currentMojiSelectedPosition = -1;
    }

    private MediaContent getMediaContentFromRoster(int i)
    {
        MediaContent mediacontent = pickerItemViewUpdateCallback.getItem(i);
        if (mediacontent != null)
        {
            if (mediacontent.b() == null)
            {
                mediaPreviewCallback.requestThumbnail(mediacontent.k());
            } else
            if (mediaSendCallback != null)
            {
                pickerItemViewUpdateCallback.setTelemetrydata(mediacontent);
                return mediacontent;
            }
        }
        return mediacontent;
    }

    private void sendMediaContent(MediaContent mediacontent)
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

        _cls1..SwitchMap.com.skype.MediaDocument.DOCUMENT_TYPE[mediacontent.n().ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 49;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        mediacontent = (MojiContent)mediacontent;
        mediaSendCallback.onSendMoji(mediacontent);
        return;
_L3:
        if (currentMojiSelectedPosition == -1)
        {
            mediaSendCallback.onEmoticonSelected((EmoticonContent)mediacontent);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int getCurrentMojiSelectedPosition()
    {
        return currentMojiSelectedPosition;
    }

    public void onClick(View view)
    {
label0:
        {
            int i = ((Integer)view.getTag()).intValue();
            view = getMediaContentFromRoster(i);
            if (view != null)
            {
                if (view.n() != com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK || i == currentMojiSelectedPosition)
                {
                    break label0;
                }
                setMojiSelectedPosition(i);
                mediaPreviewCallback.onMojiSelected((MojiContent)view);
            }
            return;
        }
        sendMediaContent(view);
    }

    public void removeCurrentMojiSelectedPosition()
    {
        setMojiSelectedPosition(-1);
    }

    public void setMojiSelectedPosition(int i)
    {
        int j = currentMojiSelectedPosition;
        currentMojiSelectedPosition = i;
        if (j != -1)
        {
            pickerItemViewUpdateCallback.refreshItem(j);
        }
        if (currentMojiSelectedPosition != -1)
        {
            pickerItemViewUpdateCallback.refreshItem(currentMojiSelectedPosition);
        }
    }
}
