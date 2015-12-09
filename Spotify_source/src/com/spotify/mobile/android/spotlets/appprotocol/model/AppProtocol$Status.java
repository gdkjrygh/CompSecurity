// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.appprotocol.model;

import android.content.Context;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Locale;

// Referenced classes of package com.spotify.mobile.android.spotlets.appprotocol.model:
//            AppProtocol

public class longText
    implements JacksonModel
{

    public static final longText OK = new <init>(0, "", "");
    private static final int STATUS_CODE_NOT_LOGGED_IN = 1;
    private static final int STATUS_CODE_OK = 0;
    public String longText;
    public String shortText;
    public int statusCode;

    public static longText createNotLoggedIn(Context context)
    {
        return new <init>(1, context.getString(0x7f08009d), String.format(Locale.getDefault(), "%s %s", new Object[] {
            context.getString(0x7f08009d), context.getString(0x7f08009e)
        }));
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (<init>)obj;
        if (statusCode != ((statusCode) (obj)).statusCode)
        {
            return false;
        }
        if (shortText == null ? ((shortText) (obj)).shortText != null : !shortText.equals(((shortText) (obj)).shortText))
        {
            return false;
        }
        if (longText == null) goto _L4; else goto _L3
_L3:
        if (longText.equals(((longText) (obj)).longText)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((longText) (obj)).longText == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = 0;
        int k = statusCode;
        int i;
        if (shortText != null)
        {
            i = shortText.hashCode();
        } else
        {
            i = 0;
        }
        if (longText != null)
        {
            j = longText.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        String s;
        try
        {
            s = AppProtocol.a().writeValueAsString(this);
        }
        catch (JsonProcessingException jsonprocessingexception)
        {
            return (new StringBuilder("{")).append(getClass().getSimpleName()).append("}").toString();
        }
        return s;
    }


    public (int i, String s, String s1)
    {
        statusCode = i;
        shortText = s;
        longText = s1;
    }
}
