// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.ArrayList;
import java.util.List;

public class HintModel
{

    public static final String DEFAULT_HINT_GROUP = "generic";
    public static final String PIZZA_HINT_GROUP = "pr_pizza";
    protected String footer;
    protected List navigationContent;
    protected String navigationHeader;
    protected List taskContent;
    protected String taskHeader;
    protected String title;

    public HintModel()
    {
        title = "";
        taskHeader = "";
        taskContent = new ArrayList();
        navigationHeader = "";
        navigationContent = new ArrayList();
        footer = "";
    }

    public String getFooter()
    {
        return footer;
    }

    public List getNavigationContent()
    {
        return navigationContent;
    }

    public String getNavigationHeader()
    {
        return navigationHeader;
    }

    public List getTaskContent()
    {
        return taskContent;
    }

    public String getTaskHeader()
    {
        return taskHeader;
    }

    public String getTitle()
    {
        return title;
    }

    public void setFooter(String s)
    {
        footer = s;
    }

    public void setNavigationContent(List list)
    {
        navigationContent = list;
    }

    public void setNavigationHeader(String s)
    {
        navigationHeader = s;
    }

    public void setTaskContent(List list)
    {
        taskContent = list;
    }

    public void setTaskHeader(String s)
    {
        taskHeader = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public String toString()
    {
        return (new StringBuilder("HintModel is:[ Title: ")).append(title).append("  taskHeader: ").append(taskHeader).append("  taskContent: ").append(taskContent).append("  navigationHeader: ").append(navigationHeader).append("  navigationContent: ").append(navigationContent).append("  footer: ").append(footer).toString();
    }
}
