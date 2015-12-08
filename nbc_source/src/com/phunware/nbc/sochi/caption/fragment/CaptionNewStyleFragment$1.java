// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.support.v4.app.LoaderManager;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionNewStyleFragment

class this._cls0 extends AsyncQueryHandler
{

    final CaptionNewStyleFragment this$0;

    protected void onInsertComplete(int i, Object obj, Uri uri)
    {
        super.onInsertComplete(i, obj, uri);
        CaptionNewStyleFragment.access$002(CaptionNewStyleFragment.this, ContentUris.parseId(uri));
        getLoaderManager().restartLoader(0, null, CaptionNewStyleFragment.this);
    }

    (ContentResolver contentresolver)
    {
        this$0 = CaptionNewStyleFragment.this;
        super(contentresolver);
    }
}
