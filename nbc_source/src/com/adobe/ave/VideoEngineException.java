// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


// Referenced classes of package com.adobe.ave:
//            MediaErrorCode

public class VideoEngineException extends Exception
{

    private static final long serialVersionUID = 1L;
    private MediaErrorCode errorCode;
    private String errorMessage;

    VideoEngineException(int i)
    {
        errorCode = MediaErrorCode.GENERIC_ERROR;
        MediaErrorCode amediaerrorcode[] = MediaErrorCode.values();
        int k = amediaerrorcode.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    MediaErrorCode mediaerrorcode = amediaerrorcode[j];
                    if (mediaerrorcode.getValue() != i)
                    {
                        break label0;
                    }
                    errorCode = mediaerrorcode;
                }
                return;
            }
            j++;
        } while (true);
    }

    VideoEngineException(int i, String s)
    {
        errorCode = MediaErrorCode.GENERIC_ERROR;
        MediaErrorCode amediaerrorcode[] = MediaErrorCode.values();
        int k = amediaerrorcode.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    MediaErrorCode mediaerrorcode = amediaerrorcode[j];
                    if (mediaerrorcode.getValue() != i)
                    {
                        break label0;
                    }
                    errorCode = mediaerrorcode;
                }
                errorMessage = s;
                return;
            }
            j++;
        } while (true);
    }

    VideoEngineException(MediaErrorCode mediaerrorcode, String s)
    {
        errorCode = mediaerrorcode;
        errorMessage = s;
    }

    public String getDetailMessage()
    {
        return errorMessage;
    }

    public MediaErrorCode getErrorCode()
    {
        return errorCode;
    }
}
