// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.view.View;
import java.util.LinkedList;

public class RecycleBin
{

    private LinkedList _bin[];

    public RecycleBin()
    {
    }

    public void clear()
    {
        if (_bin != null)
        {
            LinkedList alinkedlist[] = _bin;
            int j = alinkedlist.length;
            int i = 0;
            while (i < j) 
            {
                alinkedlist[i].clear();
                i++;
            }
        }
    }

    public void offer(View view)
    {
        PinterestAdapterView.LayoutParams layoutparams;
        if (view != null && _bin != null)
        {
            if ((layoutparams = (PinterestAdapterView.LayoutParams)view.getLayoutParams()) != null && layoutparams.viewType >= 0)
            {
                layoutparams.forceAdd = true;
                view.setLayoutParams(layoutparams);
                _bin[layoutparams.viewType].offer(view);
                return;
            }
        }
    }

    public View poll(int i)
    {
        LinkedList linkedlist;
        if (_bin != null)
        {
            if ((linkedlist = _bin[i]) != null && linkedlist.size() > 0)
            {
                return (View)linkedlist.poll();
            }
        }
        return null;
    }

    public void setViewTypeCount(int i)
    {
        _bin = new LinkedList[i];
        for (int j = 0; j < i; j++)
        {
            _bin[j] = new LinkedList();
        }

    }
}
