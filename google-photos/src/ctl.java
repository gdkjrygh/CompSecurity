// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;

final class ctl
    implements android.app.LoaderManager.LoaderCallbacks
{

    private String a[];
    private String b[];
    private cti c;

    ctl(cti cti1, String as[], String as1[])
    {
        c = cti1;
        a = as;
        b = null;
        super();
    }

    public final Loader onCreateLoader(int i, Bundle bundle)
    {
        return new CursorLoader(c, android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, a, "bucket_display_name='Camera'", b, "datetaken DESC");
    }

    public final void onLoadFinished(Loader loader, Object obj)
    {
        loader = (Cursor)obj;
        cti.b(c, loader);
        cti.b(c);
    }

    public final void onLoaderReset(Loader loader)
    {
        cti.b(c, null);
    }
}
