// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import android.content.res.Resources;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.presentation.CellRenderer;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.explore:
//            GenreSection, ExploreGenre

class GenreCellRenderer
    implements CellRenderer
{
    private static final class RowDescriptor
    {

        private final boolean isSectionHeader;
        private final GenreSection section;



        RowDescriptor(GenreSection genresection, boolean flag)
        {
            section = genresection;
            isSectionHeader = flag;
        }
    }


    static final int AUDIO_SECTION = 0;
    static final int MUSIC_SECTION = 1;
    private final SparseArray listPositionsToSections = new SparseArray();

    GenreCellRenderer()
    {
    }

    private GenreSection getSection(int i)
    {
        return ((RowDescriptor)listPositionsToSections.get(i)).section;
    }

    private void setTrackingTag(int i, View view, String s)
    {
        switch (getSection(i).getSectionId())
        {
        default:
            throw new IllegalArgumentException("Unrecognised genre section, cannot generate screen tag");

        case 0: // '\0'
            view.setTag(Screen.EXPLORE_AUDIO_GENRE.get(s));
            return;

        case 1: // '\001'
            view.setTag(Screen.EXPLORE_MUSIC_GENRE.get(s));
            break;
        }
    }

    private void updateSectionHeader(View view, RowDescriptor rowdescriptor, TextView textview)
    {
        if (rowdescriptor.isSectionHeader)
        {
            textview.setText(view.getResources().getString(rowdescriptor.section.getTitleId()).toUpperCase(Locale.getDefault()));
            textview.setVisibility(0);
            return;
        } else
        {
            textview.setVisibility(8);
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        RowDescriptor rowdescriptor = (RowDescriptor)listPositionsToSections.get(i);
        TextView textview = (TextView)view.findViewById(0x1020014);
        updateSectionHeader(view, rowdescriptor, (TextView)view.findViewById(0x7f0f0179));
        list = ((ExploreGenre)list.get(i)).getTitle();
        textview.setText(list);
        setTrackingTag(i, view, list);
    }

    void clearSections()
    {
        listPositionsToSections.clear();
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030067, viewgroup, false);
    }

    void setSectionForPosition(int i, GenreSection genresection, boolean flag)
    {
        listPositionsToSections.put(i, new RowDescriptor(genresection, flag));
    }
}
