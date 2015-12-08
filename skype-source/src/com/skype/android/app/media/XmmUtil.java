// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.text.TextUtils;
import com.skype.MediaDocument;
import com.skype.MediaDocumentImpl;
import com.skype.Message;
import com.skype.SkyLib;
import com.skype.android.skylib.ObjectIdMap;

public class XmmUtil
{

    public static final String METADATA_KEY_AUX_TEXT = "auxiliaryText";
    public static final String METADATA_KEY_AUX_URL = "auxiliaryUrl";
    public static final String METADATA_KEY_COPYRIGHT_INFORMATION = "copyright";
    public static final String METADATA_KEY_DESCRIPTION = "description";
    public static final String METADATA_KEY_ID = "id";
    public static final String METADATA_KEY_IS_HIDDEN = "isHidden";
    public static final String METADATA_KEY_IS_SPONSORED = "isSponsored";
    public static final String METADATA_KEY_IS_USED_SMS = "useInSms";
    public static final String METADATA_KEY_KEYWORDS = "keywords";
    public static final String METADATA_KEY_PICKER_TITLE = "pickerTitle";
    public static final String METADATA_KEY_VISIBLE = "visible";

    public XmmUtil()
    {
    }

    public static MediaDocument getMediaDocument(Message message)
    {
        MediaDocumentImpl mediadocumentimpl = new MediaDocumentImpl();
        if (message.getMediaDocument(mediadocumentimpl))
        {
            return mediadocumentimpl;
        } else
        {
            return null;
        }
    }

    public static MediaDocument getMediaDocumentForMessageId(ObjectIdMap objectidmap, int i)
    {
        return (MediaDocument)objectidmap.a(i, com/skype/MediaDocument);
    }

    public static String getMediaDocumentId(MediaDocument mediadocument)
    {
        mediadocument = mediadocument.getMetadataStringValue("id");
        if (((com.skype.MediaDocument.GetMetadataStringValue_Result) (mediadocument)).m_return)
        {
            return ((com.skype.MediaDocument.GetMetadataStringValue_Result) (mediadocument)).m_value;
        } else
        {
            return "";
        }
    }

    public static com.skype.MediaDocument.UPLOAD_STATUS getMediaDocumentUploadStatus(SkyLib skylib, MediaDocument mediadocument)
    {
        return mediadocument.getUploadStatus(skylib.getDefaultContentId(mediadocument.getDocTypeProp()).m_contentId);
    }

    public static Message getMessageForMediaDocument(ObjectIdMap objectidmap, MediaDocument mediadocument)
    {
        return (Message)objectidmap.a(mediadocument.getMessageIdProp(), com/skype/Message);
    }

    public static String getMetadataAuxiliaryText(Message message)
    {
        return getMetadataStringValue(message, "auxiliaryText");
    }

    public static String getMetadataAuxiliaryUrl(MediaDocument mediadocument)
    {
        mediadocument = mediadocument.getMetadataStringValue("auxiliaryUrl");
        if (((com.skype.MediaDocument.GetMetadataStringValue_Result) (mediadocument)).m_return)
        {
            return ((com.skype.MediaDocument.GetMetadataStringValue_Result) (mediadocument)).m_value;
        } else
        {
            return null;
        }
    }

    public static String getMetadataAuxiliaryUrl(Message message)
    {
        return getMetadataStringValue(message, "auxiliaryUrl");
    }

    public static String getMetadataStringValue(MediaDocument mediadocument, String s)
    {
        mediadocument = mediadocument.getMetadataStringValue(s);
        if (((com.skype.MediaDocument.GetMetadataStringValue_Result) (mediadocument)).m_return)
        {
            return ((com.skype.MediaDocument.GetMetadataStringValue_Result) (mediadocument)).m_value;
        } else
        {
            return null;
        }
    }

    private static String getMetadataStringValue(Message message, String s)
    {
        if (!TextUtils.isEmpty(message.getBodyXmlProp()) || message.getEditTimestampProp() <= 0)
        {
            if ((message = getMediaDocument(message)) != null && ((com.skype.MediaDocument.GetMetadataStringValue_Result) (message = message.getMetadataStringValue(s))).m_return)
            {
                return ((com.skype.MediaDocument.GetMetadataStringValue_Result) (message)).m_value;
            }
        }
        return null;
    }

    public static boolean isXmmMessageType(com.skype.Message.TYPE type)
    {
        return type.toInt() >= com.skype.Message.TYPE.MESSAGE_GENERIC_MEDIA_START.toInt() && type.toInt() <= com.skype.Message.TYPE.MESSAGE_GENERIC_MEDIA_END.toInt();
    }
}
