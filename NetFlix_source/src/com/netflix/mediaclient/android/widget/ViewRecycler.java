// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.view.View;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ViewRecycler
{
    public static interface ViewRecyclerProvider
    {

        public abstract ViewRecycler getViewRecycler();
    }


    private static final boolean LOG_VERBOSE = false;
    private static final String TAG = "ViewRecycler";
    private final Map scrapHeaps = new HashMap();

    public ViewRecycler()
    {
    }

    private void logVerbose(String s)
    {
    }

    public View pop(Class class1)
    {
        ThreadUtils.assertOnMain();
        String s = class1.getCanonicalName();
        LinkedList linkedlist = (LinkedList)scrapHeaps.get(s);
        if (linkedlist == null)
        {
            logVerbose((new StringBuilder()).append("- No scrap heap available for tag: ").append(s).toString());
            return null;
        }
        View view = (View)linkedlist.poll();
        StringBuilder stringbuilder = new StringBuilder();
        if (view == null)
        {
            class1 = "- No view available for tag: ";
        } else
        {
            class1 = "* Found scrap view for tag: ";
        }
        logVerbose(stringbuilder.append(class1).append(s).append(", scrapHeap size:").append(linkedlist.size()).toString());
        return view;
    }

    public void push(View view)
    {
        ThreadUtils.assertOnMain();
        String s = view.getClass().getCanonicalName();
        LinkedList linkedlist1 = (LinkedList)scrapHeaps.get(s);
        LinkedList linkedlist = linkedlist1;
        if (linkedlist1 == null)
        {
            logVerbose((new StringBuilder()).append("+ Creating new scrap heap for tag: ").append(s).toString());
            linkedlist = new LinkedList();
            scrapHeaps.put(s, linkedlist);
        }
        linkedlist.add(view);
        logVerbose((new StringBuilder()).append("+ Added view to scrap heap with tag: ").append(s).append(", scrapHeap size:").append(linkedlist.size()).toString());
    }
}
