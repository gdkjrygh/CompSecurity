// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadHandler, DownloadState

static class listenerRef extends Handler
{

    static final int ACTION_DOWNLOAD_CANCEL = 2;
    static final int ACTION_DOWNLOAD_FAILED = 1;
    static final int ACTION_DOWNLOAD_PROGRESS = 3;
    static final int ACTION_DOWNLOAD_SUCCESS = 0;
    private final WeakReference listenerRef;

    public void handleMessage(Message message)
    {
        listenerRef listenerref;
        DownloadState downloadstate;
label0:
        {
label1:
            {
label2:
                {
                    listenerref = (listenerRef)listenerRef.get();
                    if (listenerref != null)
                    {
                        downloadstate = (DownloadState)message.obj;
                        switch (message.what)
                        {
                        default:
                            throw new IllegalArgumentException((new StringBuilder("Unknown action received by DownloadHandler: ")).append(message.what).toString());

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label2;

                        case 3: // '\003'
                            break label0;

                        case 0: // '\0'
                            listenerref.uccess(downloadstate);
                            break;
                        }
                    }
                    return;
                }
                listenerref.ancel(downloadstate);
                return;
            }
            listenerref.rror(downloadstate);
            return;
        }
        listenerref.rogress(downloadstate);
    }

    public void quit()
    {
        listenerRef.clear();
    }

    public ( )
    {
        super(Looper.getMainLooper());
        listenerRef = new WeakReference();
    }
}
