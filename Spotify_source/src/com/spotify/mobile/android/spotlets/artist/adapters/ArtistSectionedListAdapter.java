// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ListAdapter;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.mobile.android.spotlets.artist.adapters.releases.ReleasesAdapterWithViewAll;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import eik;
import eir;
import eiu;
import eiw;
import eix;
import ejn;
import ftg;
import ftr;

public final class ArtistSectionedListAdapter extends ftg
{

    public final ejn a;
    public final Flags b;
    public eir c;

    public ArtistSectionedListAdapter(Context context, android.view.View.OnClickListener onclicklistener, Flags flags)
    {
        super(context);
        b = flags;
        a = new ejn(context, onclicklistener);
        super.e = new ftr(context) {

            public final void a(int i, SectionHeaderView sectionheaderview, String s, String s1)
            {
                super.a(i, sectionheaderview, s, s1);
                sectionheaderview.b(Section.a(Section.values()[i]));
            }


            private class Section extends Enum
            {

                public static final Section a;
                public static final Section b;
                public static final Section c;
                public static final Section d;
                public static final Section e;
                public static final Section f;
                public static final Section g;
                public static final Section h;
                public static final Section i;
                public static final Section j;
                public static final Section k;
                public static final Section l;
                public static final Section m;
                private static final Section n[];
                private final PreferredAdapter mPreferredAdapter;
                private final int mTitleStringId;

                static boolean a(Section section)
                {
                    return section.mPreferredAdapter != PreferredAdapter.a;
                }

                static int b(Section section)
                {
                    return section.mTitleStringId;
                }

                static PreferredAdapter c(Section section)
                {
                    return section.mPreferredAdapter;
                }

                public static Section valueOf(String s)
                {
                    return (Section)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/adapters/ArtistSectionedListAdapter$Section, s);
                }

                public static Section[] values()
                {
                    return (Section[])n.clone();
                }

                static 
                {
                    a = new Section("CUSTOM_MESSAGE", 0, 0, PreferredAdapter.b);
                    b = new Section("LATEST_RELEASE", 1, 0x7f08034b, PreferredAdapter.b);
                    c = new Section("TOP_TRACKS", 2, 0x7f08034c, PreferredAdapter.b);
                    d = new Section("RADIO", 3, 0, PreferredAdapter.a);
                    e = new Section("RELATED_ARTISTS", 4, 0x7f0800c8, PreferredAdapter.b);
                    f = new Section("ON_TOUR", 5, 0x7f080351, PreferredAdapter.b);
                    g = new Section("ALBUMS", 6, 0x7f0800c9, PreferredAdapter.a);
                    h = new Section("SINGLES", 7, 0x7f0800ce, PreferredAdapter.a);
                    i = new Section("COMPILATIONS", 8, 0x7f0800cb, PreferredAdapter.a);
                    j = new Section("PLAYLISTS", 9, 0x7f0800cd, PreferredAdapter.b);
                    k = new Section("APPEARS_ON", 10, 0x7f0800ca, PreferredAdapter.b);
                    l = new Section("BIOGRAPHY", 11, 0x7f0800c7, PreferredAdapter.b);
                    m = new Section("MERCHANDISE", 12, 0x7f0800cc, PreferredAdapter.b);
                    n = (new Section[] {
                        a, b, c, d, e, f, g, h, i, j, 
                        k, l, m
                    });
                }

                private Section(String s, int i1, int j1, PreferredAdapter preferredadapter)
                {
                    super(s, i1);
                    mTitleStringId = j1;
                    mPreferredAdapter = preferredadapter;
                }

                private class PreferredAdapter extends Enum
                {

                    public static final PreferredAdapter a;
                    public static final PreferredAdapter b;
                    private static final PreferredAdapter c[];

                    public static PreferredAdapter valueOf(String s)
                    {
                        return (PreferredAdapter)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/adapters/ArtistSectionedListAdapter$PreferredAdapter, s);
                    }

                    public static PreferredAdapter[] values()
                    {
                        return (PreferredAdapter[])c.clone();
                    }

                    static 
                    {
                        a = new PreferredAdapter("CARDS", 0);
                        b = new PreferredAdapter("LISTITEMS", 1);
                        c = (new PreferredAdapter[] {
                            a, b
                        });
                    }

                    private PreferredAdapter(String s, int i1)
                    {
                        super(s, i1);
                    }
                }

            }

        };
    }

    public final void a(ListAdapter listadapter, Section section)
    {
        if (Section.b(section) != 0)
        {
            a(listadapter, Section.b(section), section.ordinal());
            return;
        } else
        {
            a(listadapter, null, section.ordinal());
            return;
        }
    }

    public final void a(ReleasesSection releasessection, ArtistModel artistmodel, eik eik1)
    {
        if (!artistmodel.hasReleasesOfType(ReleasesSection.a(releasessection)))
        {
            return;
        }
        if (Section.c(ReleasesSection.b(releasessection)) == PreferredAdapter.a)
        {
            com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseList releaselist = artistmodel.getReleases(ReleasesSection.a(releasessection));
            eix eix1 = eik1.b;
            artistmodel = eik1.c;
            eik1 = new eiu(eix1.a, artistmodel, releaselist.releases, eix1.b, eix1.c);
            artistmodel = eik1;
            if (!releaselist.hasAllReleases())
            {
                artistmodel = new ReleasesAdapterWithViewAll(eix1.a, releaselist.releaseType, eik1, eix1.b);
            }
        } else
        {
            artistmodel = eik1.a(artistmodel.getReleases(ReleasesSection.a(releasessection)));
        }
        a(artistmodel.a(), ReleasesSection.b(releasessection));
    }

    public final void a(String s)
    {
        if (c != null)
        {
            eir eir1 = c;
            if (!TextUtils.equals(eir1.a, s))
            {
                eir1.a = s;
                eir1.notifyDataSetChanged();
            }
        }
    }

    private class ReleasesSection extends Enum
    {

        public static final ReleasesSection a;
        public static final ReleasesSection b;
        public static final ReleasesSection c;
        public static final ReleasesSection d;
        private static final ReleasesSection e[];
        private final com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType mReleaseType;
        private final Section mSection;

        static com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType a(ReleasesSection releasessection)
        {
            return releasessection.mReleaseType;
        }

        static Section b(ReleasesSection releasessection)
        {
            return releasessection.mSection;
        }

        public static ReleasesSection valueOf(String s)
        {
            return (ReleasesSection)Enum.valueOf(com/spotify/mobile/android/spotlets/artist/adapters/ArtistSectionedListAdapter$ReleasesSection, s);
        }

        public static ReleasesSection[] values()
        {
            return (ReleasesSection[])e.clone();
        }

        static 
        {
            a = new ReleasesSection("ALBUMS", 0, Section.g, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.a);
            b = new ReleasesSection("SINGLES", 1, Section.h, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.b);
            c = new ReleasesSection("COMPILATIONS", 2, Section.i, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.d);
            d = new ReleasesSection("APPEARS_ON", 3, Section.k, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType.c);
            e = (new ReleasesSection[] {
                a, b, c, d
            });
        }

        private ReleasesSection(String s, int i, Section section, com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType releasetype)
        {
            super(s, i);
            mSection = section;
            mReleaseType = releasetype;
        }
    }

}
