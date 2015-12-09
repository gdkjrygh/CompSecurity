// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;

// Referenced classes of package com.fitbit.runtrack.ui:
//            ShareExerciseGalleryActivity

class a
    implements android.support.v4.app.a
{

    final ShareExerciseGalleryActivity a;

    public void a(Loader loader, Cursor cursor)
    {
        ShareExerciseGalleryActivity.a(a).changeCursor(cursor);
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new CursorLoader(a, android.provider.L_CONTENT_URI, new String[] {
            "_id", "_data"
        }, null, null, "_id DESC");
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        ShareExerciseGalleryActivity.a(a).changeCursor(null);
    }

    (ShareExerciseGalleryActivity shareexercisegalleryactivity)
    {
        a = shareexercisegalleryactivity;
        super();
    }
}
