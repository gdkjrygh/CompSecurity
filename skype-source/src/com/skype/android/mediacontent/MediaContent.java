// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.skype.MediaDocument;
import com.skype.android.util.ImageCache;

public abstract class MediaContent
    implements Comparable
{
    public static final class Source extends Enum
    {

        public static final Source a;
        public static final Source b;
        public static final Source c;
        public static final Source d;
        private static final Source e[];

        public static Source valueOf(String s1)
        {
            return (Source)Enum.valueOf(com/skype/android/mediacontent/MediaContent$Source, s1);
        }

        public static Source[] values()
        {
            return (Source[])e.clone();
        }

        static 
        {
            a = new Source("RECENTS", 0);
            b = new Source("ROSTER", 1);
            c = new Source("TYPED", 2);
            d = new Source("ROSTER_SEARCH", 3);
            e = (new Source[] {
                a, b, c, d
            });
        }

        private Source(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private boolean a;
    protected final ImageCache b;
    protected Context c;
    protected MediaDocument d;
    private com.skype.MediaDocument.DOCUMENT_TYPE e;
    private String f;
    private String g;
    private int h;
    private Source i;
    private String j;
    private int k;

    protected MediaContent(MediaDocument mediadocument, ImageCache imagecache, Context context)
    {
        i = Source.c;
        d = mediadocument;
        b = imagecache;
        c = context;
        e = mediadocument.getDocTypeProp();
        f = mediadocument.getMetadataStringValue("description").m_value;
        g = mediadocument.getMetadataStringValue("pickerTitle").m_value;
    }

    public final int a(MediaContent mediacontent)
    {
        int i1 = h;
        int j1 = mediacontent.h;
        if (i1 < j1)
        {
            return -1;
        }
        return i1 != j1 ? 1 : 0;
    }

    public final void a(int i1)
    {
        h = i1;
    }

    public final void a(Source source)
    {
        i = source;
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public abstract Drawable b();

    public final void b(int i1)
    {
        k = i1;
    }

    public abstract Bitmap c();

    public final void c(String s1)
    {
        j = s1;
    }

    public int compareTo(Object obj)
    {
        return a((MediaContent)obj);
    }

    public String e()
    {
        return Integer.toString(k());
    }

    public final Source j()
    {
        return i;
    }

    public final int k()
    {
        return d.getObjectID();
    }

    public final String l()
    {
        return f;
    }

    public final String m()
    {
        return g;
    }

    public final com.skype.MediaDocument.DOCUMENT_TYPE n()
    {
        return e;
    }

    public final int o()
    {
        return h;
    }

    public final Context p()
    {
        return c;
    }

    public final boolean q()
    {
        return a;
    }

    public final String r()
    {
        return j;
    }

    public final int s()
    {
        return k;
    }
}
