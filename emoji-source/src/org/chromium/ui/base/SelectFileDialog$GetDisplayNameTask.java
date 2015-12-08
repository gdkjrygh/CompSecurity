// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import org.chromium.base.ContentUriUtils;

// Referenced classes of package org.chromium.ui.base:
//            SelectFileDialog

private class mIsMultiple extends AsyncTask
{

    final ContentResolver mContentResolver;
    String mFilePaths[];
    final boolean mIsMultiple;
    final SelectFileDialog this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Uri[])aobj);
    }

    protected transient String[] doInBackground(Uri auri[])
    {
        String as1[];
        int i;
        mFilePaths = new String[auri.length];
        as1 = new String[auri.length];
        i = 0;
_L2:
        String as[] = as1;
        if (i >= auri.length)
        {
            break; /* Loop/switch isn't completed */
        }
        mFilePaths[i] = auri[i].toString();
        as1[i] = ContentUriUtils.getDisplayName(auri[i], mContentResolver, "_display_name");
        i++;
        if (true) goto _L2; else goto _L1
        auri;
        Log.w("SelectFileDialog", "Unable to extract results from the content provider");
        as = null;
_L1:
        return as;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String[])obj);
    }

    protected void onPostExecute(String as[])
    {
        if (as == null)
        {
            SelectFileDialog.access$000(SelectFileDialog.this);
            return;
        }
        if (mIsMultiple)
        {
            SelectFileDialog.access$200(SelectFileDialog.this, SelectFileDialog.access$100(SelectFileDialog.this), mFilePaths, as);
            return;
        } else
        {
            SelectFileDialog.access$300(SelectFileDialog.this, SelectFileDialog.access$100(SelectFileDialog.this), mFilePaths[0], as[0]);
            return;
        }
    }

    public (ContentResolver contentresolver, boolean flag)
    {
        this$0 = SelectFileDialog.this;
        super();
        mContentResolver = contentresolver;
        mIsMultiple = flag;
    }
}
