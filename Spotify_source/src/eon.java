// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.database.Cursor;

public final class eon
{

    private static final String a[] = {
        "show_unavailable_tracks"
    };

    public static hew a(ContentResolver contentresolver)
    {
        gwt.a();
        return gwt.a(contentresolver).a(dtx.a, a).a(((dup)dmz.a(dup)).a()).a(new duo._cls1(new hfw() {

            public final Object call(Object obj)
            {
                return Boolean.valueOf(gcw.a((Cursor)obj, 0));
            }

        }));
    }

}
