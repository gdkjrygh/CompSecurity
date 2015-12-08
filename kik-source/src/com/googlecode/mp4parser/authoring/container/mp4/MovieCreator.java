// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.container.mp4;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.MovieBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.googlecode.mp4parser.DataSource;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Mp4TrackImpl;
import com.googlecode.mp4parser.util.Path;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class MovieCreator
{

    public MovieCreator()
    {
    }

    public static Movie build(DataSource datasource)
    {
        IsoFile isofile = new IsoFile(datasource);
        Movie movie = new Movie();
        Iterator iterator = isofile.getMovieBox().getBoxes(com/coremedia/iso/boxes/TrackBox).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                movie.setMatrix(isofile.getMovieBox().getMovieHeaderBox().getMatrix());
                return movie;
            }
            TrackBox trackbox = (TrackBox)iterator.next();
            SchemeTypeBox schemetypebox = (SchemeTypeBox)Path.getPath(trackbox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
            if (schemetypebox != null && (schemetypebox.getSchemeType().equals("cenc") || schemetypebox.getSchemeType().equals("cbc1")))
            {
                movie.addTrack(new CencMp4TrackImplImpl((new StringBuilder(String.valueOf(datasource.toString()))).append("[").append(trackbox.getTrackHeaderBox().getTrackId()).append("]").toString(), trackbox, new IsoFile[0]));
            } else
            {
                movie.addTrack(new Mp4TrackImpl((new StringBuilder(String.valueOf(datasource.toString()))).append("[").append(trackbox.getTrackHeaderBox().getTrackId()).append("]").toString(), trackbox, new IsoFile[0]));
            }
        } while (true);
    }

    public static Movie build(String s)
    {
        return build(((DataSource) (new FileDataSourceImpl(new File(s)))));
    }
}
