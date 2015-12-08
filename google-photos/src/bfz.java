// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import com.google.android.apps.consumerphotoeditor.core.EditProcessorInitializationResult;
import java.io.File;
import java.util.concurrent.ExecutionException;

public final class bfz extends mtf
{

    private final Intent a;
    private final bdo b;
    private int c;

    public bfz(Intent intent, bdo bdo1, int i)
    {
        super("LoadPhotoTask");
        a = intent;
        b = bdo1;
        c = i;
    }

    public final mue a(Context context)
    {
        noz noz1 = noz.a(context, 3, "LoadPhotoTask", new String[0]);
        if ("com.google.android.apps.photos.photoeditor.edit".equalsIgnoreCase(a.getAction()))
        {
            Object obj;
            Object obj1;
            Object obj2;
            File file;
            File file1;
            int i;
            if (a.hasExtra("com.google.android.apps.photos.photoeditor.contract.media_model"))
            {
                obj = (gap)a.getParcelableExtra("com.google.android.apps.photos.photoeditor.contract.media_model");
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                obj1 = a.getData();
            } else
            {
                obj1 = null;
            }
        } else
        {
            obj2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            file1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            i = 0;
            obj = null;
            do
            {
                obj1 = obj;
                if (i >= 3)
                {
                    break;
                }
                obj = (new File[] {
                    obj2, file, file1
                })[i];
                if (obj == null || !((File) (obj)).isDirectory())
                {
                    obj = null;
                } else
                {
                    obj = ((File) (obj)).listFiles(new bgh());
                    if (obj != null && obj.length > 0)
                    {
                        obj = obj[obj.length - 1];
                    } else
                    {
                        obj = null;
                    }
                }
                obj1 = obj;
                if (obj != null)
                {
                    break;
                }
                i++;
            } while (true);
            if (obj1 != null)
            {
                obj = Uri.fromFile(((File) (obj1)));
            } else
            {
                obj = null;
            }
            obj1 = obj;
            obj = null;
        }
        try
        {
            obj2 = b.a(context, ((gap) (obj)), ((Uri) (obj1)), false);
            b.i = ((gap) (obj));
            break MISSING_BLOCK_LABEL_82;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        return new mue(0, context, null);
        if (obj2 == null)
        {
            return new mue(false);
        }
        if (noz1.a())
        {
            noy.a("width", Integer.valueOf(((Bitmap) (obj2)).getWidth()));
            noy.a("height", Integer.valueOf(((Bitmap) (obj2)).getHeight()));
        }
        if (obj1 != null)
        {
            b.v = true;
        }
        context = b.a(context, a, ((Bitmap) (obj2)), c);
        obj = new mue(true);
        ((mue) (obj)).a().putBoolean("edit_list_success", ((EditProcessorInitializationResult) (context)).setEditListSuccess);
        return ((mue) (obj));
    }
}
