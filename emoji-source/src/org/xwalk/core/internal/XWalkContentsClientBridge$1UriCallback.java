// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.ValueCallback;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContentsClientBridge

abstract class syncCallFinished
    implements ValueCallback
{

    boolean syncCallFinished;
    boolean syncNullReceived;
    final XWalkContentsClientBridge this$0;

    protected String resolveFileName(Uri uri, ContentResolver contentresolver)
    {
        if (contentresolver != null && uri != null) goto _L2; else goto _L1
_L1:
        uri = "";
_L4:
        return uri;
_L2:
        Object obj;
        ContentResolver contentresolver1;
        contentresolver1 = null;
        obj = null;
        contentresolver = contentresolver.query(uri, null, null, null, null);
        if (contentresolver == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = contentresolver;
        contentresolver1 = contentresolver;
        if (contentresolver.getCount() < 1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = contentresolver;
        contentresolver1 = contentresolver;
        contentresolver.moveToFirst();
        obj = contentresolver;
        contentresolver1 = contentresolver;
        int i = contentresolver.getColumnIndex("_display_name");
        if (i <= -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = contentresolver;
        contentresolver1 = contentresolver;
        uri = contentresolver.getString(i);
        obj = uri;
        uri = ((Uri) (obj));
        if (contentresolver != null)
        {
            contentresolver.close();
            return ((String) (obj));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        return "";
        uri;
        uri = "";
        if (obj == null) goto _L4; else goto _L5
_L5:
        ((Cursor) (obj)).close();
        return "";
        uri;
        if (contentresolver1 != null)
        {
            contentresolver1.close();
        }
        throw uri;
    }

    ()
    {
        this$0 = XWalkContentsClientBridge.this;
        super();
        syncNullReceived = false;
        syncCallFinished = false;
    }
}
