// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.view.View;
import com.soundcloud.android.model.Urn;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class TrackPageRecycler
{
    private static class RecycledElement
    {

        public final Urn urn;
        public final View view;

        private RecycledElement(Urn urn1, View view1)
        {
            urn = urn1;
            view = view1;
        }

        RecycledElement(Urn urn1, View view1, _cls1 _pcls1)
        {
            this(urn1, view1);
        }
    }


    private final List recycledViews = new ArrayList(6);
    private final Deque scrapViews = new LinkedList();

    TrackPageRecycler()
    {
    }

    private boolean containsView(Urn urn)
    {
        return findView(urn) != null;
    }

    private View findAndRemoveView(Urn urn)
    {
label0:
        {
            if (recycledViews.isEmpty())
            {
                break label0;
            }
            Iterator iterator = recycledViews.iterator();
            RecycledElement recycledelement;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                recycledelement = (RecycledElement)iterator.next();
            } while (!recycledelement.urn.equals(urn));
            iterator.remove();
            return recycledelement.view;
        }
        return null;
    }

    private View findView(Urn urn)
    {
        for (int i = 0; i < recycledViews.size(); i++)
        {
            RecycledElement recycledelement = (RecycledElement)recycledViews.get(i);
            if (recycledelement.urn.equals(urn))
            {
                return recycledelement.view;
            }
        }

        return null;
    }

    void addScrapView(View view)
    {
        scrapViews.push(view);
    }

    View getRecycledPage()
    {
        if (scrapViews.isEmpty())
        {
            return ((RecycledElement)recycledViews.remove(0)).view;
        } else
        {
            return (View)scrapViews.pop();
        }
    }

    boolean hasExistingPage(Urn urn)
    {
        return containsView(urn);
    }

    public boolean isPageForUrn(View view, Urn urn)
    {
        return view == findView(urn);
    }

    void recyclePage(Urn urn, View view)
    {
        recycledViews.add(new RecycledElement(urn, view, null));
    }

    View removePageByUrn(Urn urn)
    {
        return findAndRemoveView(urn);
    }
}
