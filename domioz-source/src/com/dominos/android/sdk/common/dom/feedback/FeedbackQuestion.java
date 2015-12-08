// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.feedback;

import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.core.MapNode;
import com.dominos.android.sdk.common.core.Util;
import java.util.Map;

public class FeedbackQuestion
{

    private final boolean answered;
    private final String category;
    private final String categoryMethod;
    private final String code;
    private final String questionTag;
    private final String sortOrder;
    private final String text;
    private final String type;

    private FeedbackQuestion(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            boolean flag)
    {
        code = Util.notEmpty(s);
        type = Util.notEmpty(s1);
        sortOrder = Util.notEmpty(s2);
        questionTag = Util.notEmpty(s3);
        category = Util.notEmpty(s4);
        categoryMethod = Util.notEmpty(s5);
        text = Util.notEmpty(s6);
        answered = flag;
    }

    FeedbackQuestion(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            boolean flag, _cls1 _pcls1)
    {
        this(s, s1, s2, s3, s4, s5, s6, flag);
    }

    public static FeedbackQuestion from(Map map)
    {
        map = new MapNode(map);
        return (new Builder()).setCode(StringHelper.defaultString(map.getText("Code"))).setType(StringHelper.defaultString(map.getText("Type"))).setSortOrder(StringHelper.defaultString(map.getText("SortOrder"))).setQuestionTag(StringHelper.defaultString(map.getText("QuestionTag"))).setCategory(StringHelper.defaultString(map.getText("Category"))).setCategoryMethod(StringHelper.defaultString(map.getText("CategoryMethod"))).setText(StringHelper.defaultString(map.getText("Text"))).setAnswered(StringHelper.defaultString(map.getText("Answered"))).build();
    }

    public boolean getAnswered()
    {
        return answered;
    }

    public String getCategory()
    {
        return category;
    }

    public String getCategoryMethod()
    {
        return categoryMethod;
    }

    public String getCode()
    {
        return code;
    }

    public String getQuestionTag()
    {
        return questionTag;
    }

    public String getSortOrder()
    {
        return sortOrder;
    }

    public String getText()
    {
        return text;
    }

    public String getType()
    {
        return type;
    }

    private class Builder
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

        public Builder setAnswered(String s)
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

        public Builder setCategory(String s)
        {
            category = s;
            return this;
        }

        public Builder setCategoryMethod(String s)
        {
            categoryMethod = s;
            return this;
        }

        public Builder setCode(String s)
        {
            code = s;
            return this;
        }

        public Builder setQuestionTag(String s)
        {
            questionTag = s;
            return this;
        }

        public Builder setSortOrder(String s)
        {
            sortOrder = s;
            return this;
        }

        public Builder setText(String s)
        {
            text = s;
            return this;
        }

        public Builder setType(String s)
        {
            type = s;
            return this;
        }

        public Builder()
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

}
