// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.presentation.ListItemAdapter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.explore:
//            GenreCellRenderer, GenreSection

class ExploreGenresAdapter extends ListItemAdapter
{

    private final GenreCellRenderer cellRenderer;

    ExploreGenresAdapter(GenreCellRenderer genrecellrenderer)
    {
        super(genrecellrenderer);
        cellRenderer = genrecellrenderer;
    }

    public void clear()
    {
        super.clear();
        cellRenderer.clearSections();
    }

    void demarcateSection(GenreSection genresection)
    {
        boolean flag = true;
        int j = items.size();
        for (int i = j - genresection.getSize(); i < j; i++)
        {
            cellRenderer.setSectionForPosition(i, genresection, flag);
            flag = false;
        }

    }
}
