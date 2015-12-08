// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64InputStream;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package org.chromium.media:
//            MediaPlayerBridge

private class mContext extends AsyncTask
{

    static final boolean $assertionsDisabled;
    private final Context mContext;
    private final String mData;
    private File mTempFile;
    final MediaPlayerBridge this$0;

    private void deleteFile()
    {
        if (mTempFile != null && !mTempFile.delete())
        {
            Log.e("MediaPlayerBridge", (new StringBuilder()).append("Failed to delete temporary file: ").append(mTempFile).toString());
            if (!$assertionsDisabled)
            {
                throw new AssertionError();
            }
        }
    }

    protected transient Boolean doInBackground(Void avoid[])
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        avoid = ((Void []) (obj));
        mTempFile = File.createTempFile("decoded", "mediadata");
        avoid = ((Void []) (obj));
        obj = new FileOutputStream(mTempFile);
        avoid = new Base64InputStream(new ByteArrayInputStream(mData.getBytes()), 0);
        obj1 = new byte[1024];
_L3:
        int i = avoid.read(((byte []) (obj1)));
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((FileOutputStream) (obj)).write(((byte []) (obj1)), 0, i);
          goto _L3
        avoid;
_L7:
        avoid = ((Void []) (obj));
        obj1 = Boolean.valueOf(false);
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                return ((Boolean) (obj1));
            }
        }
        return ((Boolean) (obj1));
_L2:
        avoid.close();
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[]) { }
        }
        return Boolean.valueOf(true);
        obj;
_L5:
        if (avoid != null)
        {
            try
            {
                avoid.close();
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[]) { }
        }
        throw obj;
        obj1;
        avoid = ((Void []) (obj));
        obj = obj1;
        if (true) goto _L5; else goto _L4
_L4:
        avoid;
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Boolean boolean1)
    {
        if (isCancelled())
        {
            deleteFile();
            return;
        }
        try
        {
            getLocalPlayer().setDataSource(mContext, Uri.fromFile(mTempFile));
        }
        // Misplaced declaration of an exception variable
        catch (Boolean boolean1)
        {
            boolean1 = Boolean.valueOf(false);
        }
        deleteFile();
        if (!$assertionsDisabled && MediaPlayerBridge.access$000(MediaPlayerBridge.this) == 0L)
        {
            throw new AssertionError();
        } else
        {
            MediaPlayerBridge.access$100(MediaPlayerBridge.this, MediaPlayerBridge.access$000(MediaPlayerBridge.this), boolean1.booleanValue());
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/media/MediaPlayerBridge.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public (Context context, String s)
    {
        this$0 = MediaPlayerBridge.this;
        super();
        mData = s;
        mContext = context;
    }
}
