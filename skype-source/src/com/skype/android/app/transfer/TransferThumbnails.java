// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.skype.Transfer;
import java.io.File;
import java.util.HashMap;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferUtil, TransferType

public class TransferThumbnails
    implements android.media.MediaScannerConnection.OnScanCompletedListener
{
    public static interface OnScanCompletedListener
    {

        public abstract void onScanCompleted();
    }

    final class a
    {

        int scanAttempts;
        boolean scanning;
        final TransferThumbnails this$0;
        Bitmap thumb;
        Uri thumbUri;
        TransferType type;

        a()
        {
            this$0 = TransferThumbnails.this;
            super();
            type = TransferType.UNKNOWN;
        }
    }


    private static final int MAX_ATTEMPTS = 3;
    private static final Logger log = Logger.getLogger("TransferThumbnails");
    private HashMap attempts;
    private Context context;
    private OnScanCompletedListener listener;
    private TransferUtil transferUtil;

    public TransferThumbnails(Context context1, TransferUtil transferutil)
    {
        context = context1;
        transferUtil = transferutil;
        attempts = new HashMap();
    }

    private File getFile(Transfer transfer)
    {
        String s;
        if (transfer.getTypeProp() == com.skype.Transfer.TYPE.OUTGOING)
        {
            s = transfer.getFilepathProp().substring(0, transfer.getFilepathProp().lastIndexOf("/"));
        } else
        {
            s = transferUtil.getDownloadsDirectory().toString();
        }
        return new File(s, transferUtil.getLocalFilename(transfer));
    }

    private void setAttempt(File file, int i)
    {
        getOrCreate(file).scanAttempts = i;
    }

    private void setScanning(File file, boolean flag)
    {
        getOrCreate(file).scanning = flag;
    }

    private void setThumbUri(File file, Uri uri)
    {
        getOrCreate(file).thumbUri = uri;
    }

    private void setThumbnail(File file, Bitmap bitmap)
    {
        getOrCreate(file).thumb = bitmap;
    }

    private void setType(File file, TransferType transfertype)
    {
        getOrCreate(file).type = transfertype;
    }

    public boolean canScan(Transfer transfer)
    {
        transfer = (a)attempts.get(getFile(transfer));
        return transfer == null || ((a) (transfer)).scanAttempts < 3;
    }

    public int getAttempts(File file)
    {
        return getOrCreate(file).scanAttempts;
    }

    public a getOrCreate(Transfer transfer)
    {
        return getOrCreate(getFile(transfer));
    }

    public a getOrCreate(File file)
    {
        a a2 = (a)attempts.get(file);
        a a1 = a2;
        if (a2 == null)
        {
            a1 = new a();
            attempts.put(file, a1);
        }
        return a1;
    }

    public Uri getThumbUri(Transfer transfer)
    {
        return getOrCreate(transfer).thumbUri;
    }

    public void getThumbnail(Transfer transfer)
    {
label0:
        {
            if (!isScanning(transfer) && canScan(transfer))
            {
                transfer = getFile(transfer);
                if (transfer.exists())
                {
                    break label0;
                }
            }
            return;
        }
        setScanning(transfer, true);
        MediaScannerConnection.scanFile(context, new String[] {
            transfer.toString()
        }, null, this);
    }

    public TransferType getType(Transfer transfer)
    {
        return getOrCreate(transfer).type;
    }

    public boolean isScanning(Transfer transfer)
    {
        return getOrCreate(transfer).scanning;
    }

    public void onScanCompleted(String s, Uri uri)
    {
        File file = new File(s);
        Object obj1 = null;
        Object obj = null;
        log.fine((new StringBuilder("Scanned ")).append(s).append(":").toString());
        Object obj2 = s.substring(s.lastIndexOf(".") + 1, s.length());
        setType(file, TransferUtil.queryFileType(MimeTypeMap.getSingleton().getMimeTypeFromExtension(((String) (obj2))), ((String) (obj2))));
        uri = Long.valueOf(uri.toString().substring(uri.toString().lastIndexOf("/") + 1, uri.toString().length()));
        android.provider.MediaStore.Images.Thumbnails.getThumbnail(context.getContentResolver(), uri.longValue(), 1, null);
        obj2 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(context.getContentResolver(), uri.longValue(), 1, null);
        boolean flag = false;
        uri = obj1;
        if (obj2 != null)
        {
            if (((Cursor) (obj2)).getCount() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            uri = obj;
            if (flag)
            {
                ((Cursor) (obj2)).moveToFirst();
                uri = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndex("_data"));
                setThumbUri(file, Uri.parse(uri));
                log.info((new StringBuilder("ThumbUri : ")).append(uri).toString());
            }
            ((Cursor) (obj2)).close();
        }
        s = ThumbnailUtils.createVideoThumbnail(s, 1);
        if (s != null)
        {
            setThumbnail(file, s);
        }
        if (flag && uri != null && uri.length() > 0)
        {
            log.info("obtained thumbnail");
            setAttempt(file, 3);
            if (listener != null)
            {
                listener.onScanCompleted();
            }
        } else
        {
            log.info("Did not obtain thumbnail increasing attempt");
            setAttempt(file, getAttempts(file) + 1);
        }
        setScanning(file, false);
    }

    public void setOnScanCompletedListener(OnScanCompletedListener onscancompletedlistener)
    {
        listener = onscancompletedlistener;
    }

}
