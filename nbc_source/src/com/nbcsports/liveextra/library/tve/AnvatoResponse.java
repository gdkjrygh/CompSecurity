// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.nbcsports.liveextra.library.configuration.Configuration;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            AnvatoRequest

public class AnvatoResponse
{
    public static class Reason
    {

        int code;
        String reason;

        public Reason()
        {
        }
    }


    String alternateContent;
    boolean blackout;
    String description;
    String entitled;
    String exception;
    List reason;
    private AnvatoRequest request;

    public AnvatoResponse()
    {
    }

    private Pair getDefaultError(Configuration configuration, Resources resources)
    {
        String s = configuration.getAnvatoErrorDefault();
        configuration = s;
        if (TextUtils.isEmpty(s))
        {
            configuration = resources.getString(0x7f070055);
        }
        return new Pair("", configuration);
    }

    private String replaceTokens(String s, Resources resources)
    {
        if (!TextUtils.isEmpty(request.getMvpdDisplayName()))
        {
            resources = request.getMvpdDisplayName();
        } else
        {
            resources = resources.getString(0x7f0701b9);
        }
        return s.replace("[provider]", resources);
    }

    public Pair getError(Configuration configuration, Resources resources)
    {
        Object obj = configuration.getAnvatoErrors();
        if (obj == null || reason == null || reason.isEmpty())
        {
            return getDefaultError(configuration, resources);
        }
        obj = (String)((Map) (obj)).get(Integer.valueOf(((Reason)reason.get(0)).code));
        if (obj == null)
        {
            return getDefaultError(configuration, resources);
        } else
        {
            return new Pair("", replaceTokens(((String) (obj)), resources));
        }
    }

    public AnvatoRequest getRequest()
    {
        return request;
    }

    public boolean isEntitled()
    {
        return entitled != null && entitled.equals("yes");
    }

    public void setRequest(AnvatoRequest anvatorequest)
    {
        request = anvatorequest;
    }
}
