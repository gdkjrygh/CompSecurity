// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.Message;
import com.skype.MessageAnnotation;
import com.skype.android.skylib.ObjectIdMap;

public class AnnotationUtil
{

    public static final String MSG_EMOTICON_KEY_HEART = "heart";
    private ObjectIdMap objMap;

    public AnnotationUtil(ObjectIdMap objectidmap)
    {
        objMap = objectidmap;
    }

    public int getAnnotationCount(Message message, com.skype.MessageAnnotation.TYPE type, String s)
    {
        int j = 0;
        message = message.getAnnotations(type);
        for (int i = 0; i < ((com.skype.Message.GetAnnotations_Result) (message)).m_annotationObjectIDList.length;)
        {
            int k;
label0:
            {
                type = getAnnotationObj(message, i);
                k = j;
                if (type == null)
                {
                    break label0;
                }
                k = j;
                if (!type.getKeyProp().contentEquals(s))
                {
                    break label0;
                }
                type = type.getStatusProp();
                if (type != com.skype.MessageAnnotation.STATUS.SENDING)
                {
                    k = j;
                    if (type != com.skype.MessageAnnotation.STATUS.SENT)
                    {
                        break label0;
                    }
                }
                k = j + 1;
            }
            i++;
            j = k;
        }

        return j;
    }

    public MessageAnnotation getAnnotationObj(com.skype.Message.GetAnnotations_Result getannotations_result, int i)
    {
        if (i >= 0 && i < getannotations_result.m_annotationObjectIDList.length)
        {
            return (MessageAnnotation)objMap.a(getannotations_result.m_annotationObjectIDList[i], com/skype/MessageAnnotation);
        } else
        {
            return null;
        }
    }

    public int getOwnAnnotationIndex(com.skype.Message.GetOwnAnnotations_Result getownannotations_result, String s)
    {
        for (int i = 0; i < getownannotations_result.m_messageannotationObjectIDList.length; i++)
        {
            Object obj = (MessageAnnotation)objMap.a(getownannotations_result.m_messageannotationObjectIDList[i], com/skype/MessageAnnotation);
            if (obj == null || !((MessageAnnotation) (obj)).getKeyProp().contentEquals(s))
            {
                continue;
            }
            obj = ((MessageAnnotation) (obj)).getStatusProp();
            if (obj == com.skype.MessageAnnotation.STATUS.SENDING || obj == com.skype.MessageAnnotation.STATUS.SENT)
            {
                return i;
            }
        }

        return -1;
    }

    public boolean isAnnotatedByMe(Message message, com.skype.MessageAnnotation.TYPE type, String s)
    {
        return getOwnAnnotationIndex(message.getOwnAnnotations(type), s) >= 0;
    }

    public boolean isAnnotatedByOthers(Message message, com.skype.MessageAnnotation.TYPE type, String s)
    {
        int i = getAnnotationCount(message, type, s);
        return i > 1 || i == 1 && !isAnnotatedByMe(message, type, s);
    }
}
