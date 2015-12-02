// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.facebook.ipc.photos.MediaItem;
import com.facebook.orca.camera.CropImage;
import com.facebook.orca.compose.aq;
import com.facebook.orca.images.ImageSearchActivity;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.google.common.b.a;
import com.google.common.b.f;
import com.google.common.b.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.photos.picking:
//            PickMediaParams, i, g, MediaChoiceDialog, 
//            f

public class PickMediaOperation extends Fragment
{

    private static final Class a = com/facebook/orca/photos/picking/PickMediaOperation;
    private d b;
    private aq c;
    private com.facebook.orca.photos.picking.i d;
    private PickMediaParams e;
    private long f;

    public PickMediaOperation()
    {
        f = System.currentTimeMillis();
    }

    private void O()
    {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("android.intent.extra.durationLimit", 10);
        intent.setFlags(3);
        a(intent, 5);
    }

    private void P()
    {
        try
        {
            n().openFileOutput(R(), 3).close();
            n().openFileOutput(S(), 3).close();
            return;
        }
        catch (IOException ioexception)
        {
            com.facebook.debug.log.b.a("Exception opening files", ioexception);
        }
    }

    private void Q()
    {
        File file = T();
        File file1 = U();
        Intent intent = new Intent(n(), com/facebook/orca/camera/CropImage);
        intent.setDataAndType(Uri.fromFile(file), "image/*");
        intent.putExtra("outputX", e.c());
        intent.putExtra("outputY", e.d());
        intent.putExtra("aspectX", e.e());
        intent.putExtra("aspectY", e.f());
        intent.putExtra("scale", true);
        intent.putExtra("output", Uri.fromFile(file1));
        intent.putExtra("outputFormat", android.graphics.Bitmap.CompressFormat.JPEG.toString());
        intent.setFlags(3);
        if (n().getPackageManager().queryIntentActivities(intent, 0x10000).isEmpty())
        {
            a(MediaResource.a(Uri.fromFile(T())));
            return;
        } else
        {
            a(intent, 3);
            return;
        }
    }

    private String R()
    {
        return (new StringBuilder()).append("temp-compose-photo_").append(f).append(".jpg").toString();
    }

    private String S()
    {
        return (new StringBuilder()).append("temp-compose-photo-post-cropped_").append(f).append(".jpg").toString();
    }

    private File T()
    {
        return n().getFileStreamPath(R());
    }

    private File U()
    {
        return n().getFileStreamPath(S());
    }

    private void V()
    {
        T().deleteOnExit();
        U().deleteOnExit();
    }

    private void W()
    {
        e = null;
        if (d != null)
        {
            d.b();
        }
    }

    private void X()
    {
        e = null;
        if (d != null)
        {
            d.a();
        }
    }

    private void Y()
    {
        e = null;
        if (d != null)
        {
            d.c();
        }
    }

    private void a()
    {
        P();
        File file = T();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", Uri.fromFile(file));
        intent.setFlags(3);
        a(intent, 2);
    }

    static void a(PickMediaOperation pickmediaoperation)
    {
        pickmediaoperation.a();
    }

    private void a(MediaResource mediaresource)
    {
        e = null;
        if (d != null)
        {
            d.a(mediaresource);
        }
    }

    private void a(i j, String s)
    {
        com.google.common.b.a.a(j, new g(this, s));
    }

    private void b()
    {
        P();
        c.a(this, e);
    }

    static void b(PickMediaOperation pickmediaoperation)
    {
        pickmediaoperation.c();
    }

    private void c()
    {
        P();
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        a(intent, 1);
    }

    static void c(PickMediaOperation pickmediaoperation)
    {
        pickmediaoperation.b();
    }

    private void d()
    {
        P();
        a(new Intent(n(), com/facebook/orca/images/ImageSearchActivity), 4);
    }

    static void d(PickMediaOperation pickmediaoperation)
    {
        pickmediaoperation.d();
    }

    static void e(PickMediaOperation pickmediaoperation)
    {
        pickmediaoperation.O();
    }

    private void f(int j, Intent intent)
    {
        if (j != -1)
        {
            W();
            return;
        }
        d.d();
        intent = intent.getParcelableArrayListExtra("extra_media_items");
        if (intent != null)
        {
            intent = intent.iterator();
            do
            {
                if (!intent.hasNext())
                {
                    break;
                }
                Object obj = (MediaItem)intent.next();
                obj = MediaResource.a(new File(((MediaItem) (obj)).b()), ((MediaItem) (obj)).a());
                if (d != null)
                {
                    d.a(((MediaResource) (obj)));
                }
            } while (true);
        }
        e = null;
    }

    static void f(PickMediaOperation pickmediaoperation)
    {
        pickmediaoperation.W();
    }

    static void g(PickMediaOperation pickmediaoperation)
    {
        pickmediaoperation.Y();
    }

    public void a(int j, int k, Intent intent)
    {
        if (j == 1)
        {
            a(k, intent);
        } else
        {
            if (j == 6)
            {
                f(k, intent);
                return;
            }
            if (j == 2)
            {
                b(k, intent);
                return;
            }
            if (j == 4)
            {
                c(k, intent);
                return;
            }
            if (j == 3)
            {
                d(k, intent);
                return;
            }
            if (j == 5)
            {
                e(k, intent);
                return;
            }
        }
    }

    public void a(int j, Intent intent)
    {
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        MediaResource mediaresource = MediaResource.a(intent.getData());
        intent = b.b(mediaresource);
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got attachment ").append(mediaresource.d()).toString());
        File file;
        file = T();
        a(intent.c(), R());
        if (e.b())
        {
            Q();
            return;
        }
        try
        {
            a(MediaResource.a(file));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.facebook.debug.log.b.d(a, "Got IOException while trying to process file", intent);
        }
        W();
        return;
        X();
        return;
        W();
        return;
    }

    public void a(Context context)
    {
        super.a(context);
        context = t.a(context);
        b = (d)context.a(com/facebook/ui/media/attachments/d);
        c = (aq)context.a(com/facebook/orca/compose/aq);
        b = (d)context.a(com/facebook/ui/media/attachments/d);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            e = (PickMediaParams)bundle.getParcelable("params");
            f = bundle.getLong("uniqueId");
        }
    }

    public void a(PickMediaParams pickmediaparams)
    {
        f = System.currentTimeMillis();
        if (e != null)
        {
            com.facebook.debug.log.b.a(a, "Photo operation already in progress. Shouldn't happen");
        }
        ad ad1 = p().a();
        Object obj = p().a("dialog");
        if (obj != null)
        {
            ad1.a(((Fragment) (obj)));
        }
        e = pickmediaparams;
        obj = com.facebook.orca.photos.picking.MediaChoiceDialog.a(pickmediaparams.a(), pickmediaparams.g());
        ((MediaChoiceDialog) (obj)).a(new com.facebook.orca.photos.picking.f(this, pickmediaparams));
        ((MediaChoiceDialog) (obj)).a(ad1, "dialog");
    }

    public void a(PickMediaParams pickmediaparams, int j)
    {
        f = System.currentTimeMillis();
        if (e != null)
        {
            com.facebook.debug.log.b.a(a, "Photo operation already in progress. Shouldn't happen");
        }
        e = pickmediaparams;
        switch (j)
        {
        case 3: // '\003'
        default:
            return;

        case 2: // '\002'
            a();
            return;

        case 1: // '\001'
            b();
            return;

        case 4: // '\004'
            d();
            break;
        }
    }

    public void a(com.facebook.orca.photos.picking.i j)
    {
        d = j;
    }

    public void b(int j, Intent intent)
    {
        if (j == -1)
        {
            if (e.b())
            {
                Q();
            } else
            {
                a(MediaResource.a(T()));
            }
            V();
            return;
        } else
        {
            W();
            return;
        }
    }

    public void c(int j, Intent intent)
    {
        if (j != -1) goto _L2; else goto _L1
_L1:
        Uri uri;
        uri = intent.getData();
        intent = T();
        a(com.google.common.b.f.a(new File(uri.getPath())), R());
_L3:
        IOException ioexception;
        if (e.b())
        {
            Q();
            return;
        } else
        {
            a(MediaResource.a(intent));
            return;
        }
        ioexception;
        intent = null;
_L4:
        com.facebook.debug.log.b.d(a, "Got IOException while trying to process file", ioexception);
        W();
          goto _L3
_L2:
        W();
        return;
        ioexception;
          goto _L4
    }

    public void d(int j, Intent intent)
    {
        if (j == -1)
        {
            a(MediaResource.a(U()));
            V();
            return;
        } else
        {
            W();
            return;
        }
    }

    public void e(int j, Intent intent)
    {
        if (j != -1)
        {
            W();
            return;
        }
        intent = MediaResource.b(intent.getData());
        intent = b.b(intent);
        if (intent == null)
        {
            X();
            return;
        }
        com.facebook.debug.log.b.b(a, (new StringBuilder()).append("Got video attachment ").append(intent.a().d()).toString());
        try
        {
            File file = T();
            a(intent.c(), R());
            a(MediaResource.b(file));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.facebook.debug.log.b.d(a, "Got IOException while trying to process file", intent);
        }
        W();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("params", e);
        bundle.putLong("uniqueId", f);
    }

}
