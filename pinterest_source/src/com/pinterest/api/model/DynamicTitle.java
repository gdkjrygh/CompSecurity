// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            DynamicArgument

public class DynamicTitle
{

    private static final String HOLDER_REX = "\\{\\d\\}";
    List args;
    private String formattedText;
    private String text;

    public DynamicTitle()
    {
        args = new ArrayList();
    }

    public DynamicTitle(String s)
    {
        args = new ArrayList();
        text = s;
    }

    public static DynamicTitle make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return null;
        }
        DynamicTitle dynamictitle = (DynamicTitle)pinterestjsonobject.a(com/pinterest/api/model/DynamicTitle);
        pinterestjsonobject = pinterestjsonobject.e("args");
        for (int i = 0; i < pinterestjsonobject.a(); i++)
        {
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c(i);
            dynamictitle.args.add((DynamicArgument)pinterestjsonobject1.a(com/pinterest/api/model/DynamicArgument));
        }

        dynamictitle.getFormattedText();
        PLog.log((new StringBuilder("DynamicTitle.formattedText: ")).append(dynamictitle.formattedText).toString(), new Object[0]);
        return dynamictitle;
    }

    public DynamicArgument getArgument(int i)
    {
        if (i >= args.size())
        {
            return null;
        } else
        {
            return (DynamicArgument)args.get(i);
        }
    }

    public String getFormattedText()
    {
        if (formattedText != null)
        {
            return formattedText;
        }
        formattedText = text;
        for (Iterator iterator = args.iterator(); iterator.hasNext();)
        {
            DynamicArgument dynamicargument = (DynamicArgument)iterator.next();
            formattedText = formattedText.replaceFirst("\\{\\d\\}", dynamicargument.getRender());
        }

        return formattedText;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String s)
    {
        text = s;
    }
}
