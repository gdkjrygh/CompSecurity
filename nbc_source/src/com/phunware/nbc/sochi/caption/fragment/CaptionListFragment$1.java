// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.ContentUris;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import com.phunware.nbc.sochi.caption.caption.CaptionPreviewHelper;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionListFragment

class this._cls0
    implements android.support.v4.app.llbacks
{

    final CaptionListFragment this$0;

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new CursorLoader(getActivity(), ContentUris.withAppendedId(com.phunware.nbc.sochi.caption.provider.Contract.Styles.CONTENT_URI, bundle.getLong("style_id")), null, null, null, null);
    }

    public void onLoadFinished(Loader loader, Cursor cursor)
    {
        CaptionListFragment.access$100(CaptionListFragment.this).preview(getActivity(), cursor, CaptionListFragment.access$000(CaptionListFragment.this));
    }

    public volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (Cursor)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    Contract.Styles()
    {
        this$0 = CaptionListFragment.this;
        super();
    }
}
