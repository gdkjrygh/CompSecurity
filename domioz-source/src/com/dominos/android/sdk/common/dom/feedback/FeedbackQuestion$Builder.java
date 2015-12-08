// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.feedback;


// Referenced classes of package com.dominos.android.sdk.common.dom.feedback:
//            FeedbackQuestion

public class answered
{

    private boolean answered;
    private String category;
    private String categoryMethod;
    private String code;
    private String questionTag;
    private String sortOrder;
    private String text;
    private String type;

    public FeedbackQuestion build()
    {
        return new FeedbackQuestion(code, type, sortOrder, questionTag, category, categoryMethod, text, answered, null);
    }

    public answered setAnswered(String s)
    {
        if (s == null)
        {
            return this;
        }
        if (s.equalsIgnoreCase("yes"))
        {
            answered = true;
            return this;
        } else
        {
            answered = false;
            return this;
        }
    }

    public answered setCategory(String s)
    {
        category = s;
        return this;
    }

    public category setCategoryMethod(String s)
    {
        categoryMethod = s;
        return this;
    }

    public categoryMethod setCode(String s)
    {
        code = s;
        return this;
    }

    public code setQuestionTag(String s)
    {
        questionTag = s;
        return this;
    }

    public questionTag setSortOrder(String s)
    {
        sortOrder = s;
        return this;
    }

    public sortOrder setText(String s)
    {
        text = s;
        return this;
    }

    public text setType(String s)
    {
        type = s;
        return this;
    }

    public ()
    {
        code = "";
        type = "";
        sortOrder = "";
        questionTag = "";
        category = "";
        categoryMethod = "";
        text = "";
        answered = false;
    }
}
