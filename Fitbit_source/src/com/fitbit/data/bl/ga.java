// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ResultReceiver;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.food.barcode.c.a;
import com.fitbit.util.service.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService

public class ga extends b
{

    static final String a = "com.fitbit.data.bl.UploadPhotoToS3Task.ACTION";
    private static final String b = "UploadPhotoToS3Task";
    private static final String c = "com.fitbit.data.bl.UploadPhotoToS3Task.EXTRA_URIS";
    private a d;

    public ga()
    {
        d = new a();
    }

    public static Intent a(Context context, ArrayList arraylist)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.UploadPhotoToS3Task.ACTION");
        context.putParcelableArrayListExtra("com.fitbit.data.bl.UploadPhotoToS3Task.EXTRA_URIS", arraylist);
        return context;
    }

    private boolean a(Uri uri)
    {
        uri = new File(uri.getPath());
        FitBitApplication fitbitapplication = FitBitApplication.a();
        boolean flag;
        try
        {
            flag = d.a(fitbitapplication, uri.getName(), uri);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            com.fitbit.e.a.e("UploadPhotoToS3Task", "Can't upload file. File not found.", uri, new Object[0]);
            return false;
        }
        return flag;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        syncservice = intent.getParcelableArrayListExtra("com.fitbit.data.bl.UploadPhotoToS3Task.EXTRA_URIS");
        boolean flag1;
        if (syncservice != null)
        {
            int i = 0;
            boolean flag = false;
            do
            {
                flag1 = flag;
                if (i >= syncservice.size())
                {
                    break;
                }
                intent = (Uri)syncservice.get(i);
                resultreceiver = String.valueOf(intent);
                if (com.fitbit.config.b.a.a())
                {
                    com.fitbit.e.a.a("UploadPhotoToS3Task", "Upload photo to s3. Uri: %s", new Object[] {
                        resultreceiver
                    });
                }
                flag1 = a(((Uri) (intent)));
                if (com.fitbit.config.b.a.a())
                {
                    if (flag)
                    {
                        com.fitbit.e.a.a("UploadPhotoToS3Task", "upload %s completed", new Object[] {
                            resultreceiver
                        });
                    } else
                    {
                        com.fitbit.e.a.e("UploadPhotoToS3Task", "upload %s failed", new Object[] {
                            resultreceiver
                        });
                    }
                }
                if (i == 0)
                {
                    flag = flag1;
                } else
                if (flag && flag1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            com.fitbit.e.a.a("UploadPhotoToS3Task", "upload photos to s3 completed", new Object[0]);
            return;
        } else
        {
            com.fitbit.e.a.e("UploadPhotoToS3Task", "upload photos to s3 failed", new Object[0]);
            return;
        }
    }
}
