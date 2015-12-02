// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import android.net.Uri;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.e.h;
import com.facebook.j.a.a.c;
import com.facebook.nativejpeg.BitmapFactory;
import com.facebook.nativejpeg.b;
import com.facebook.ui.media.attachments.MediaResource;
import com.google.common.base.Stopwatch;
import java.io.File;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.photos.b:
//            f, e

public class aa
{

    private final av a;
    private final h b;
    private final a c;
    private final Stopwatch d;

    public aa(av av1, h h1, a a1, Stopwatch stopwatch)
    {
        a = av1;
        b = h1;
        c = a1;
        d = stopwatch;
    }

    private cb a(String s, MediaResource mediaresource)
    {
        s = new cb(s);
        s.e("compose");
        mediaresource = mediaresource.j();
        String s1 = a(((String) (mediaresource)));
        s.b("uuid", s1);
        s.b("offline_threading_id", s1);
        s.b("attachment_id", mediaresource);
        return s;
    }

    private String a(String s)
    {
        return s.substring(0, s.indexOf('_'));
    }

    private void a(cb cb1)
    {
        if (!(c instanceof f))
        {
            return;
        } else
        {
            cb1.a("native_resizer", ((f)c).f());
            return;
        }
    }

    public void a(MediaResource mediaresource)
    {
        d.reset().start();
        cb cb1 = a("media_upload_unpublished_start", mediaresource);
        cb1.a("upload_size", (new File(mediaresource.f())).length());
        a.a(cb1);
    }

    public void a(MediaResource mediaresource, e e1, c c1, File file)
    {
        d.stop();
        File file1 = new File(mediaresource.d().getPath());
        b b1 = new b();
        b1.inJustDecodeBounds = true;
        BitmapFactory.a(mediaresource.d().getPath(), b1);
        mediaresource = a("media_upload_resize_end", mediaresource);
        mediaresource.a("original_size", file1.length());
        mediaresource.a("resized_size", file.length());
        file = new StringBuilder(50);
        file.append(e1.a()).append("x").append(e1.b());
        mediaresource.b("requested_dims", file.toString());
        file.setLength(0);
        file.append(b1.outWidth).append("x").append(b1.outHeight);
        mediaresource.b("original_dims", file.toString());
        file.setLength(0);
        file.append(c1.a()).append("x").append(c1.b());
        mediaresource.b("resized_dims", file.toString());
        mediaresource.a("resized_quality", c1.c());
        mediaresource.a("elapsed_time", d.elapsedMillis());
        a(((cb) (mediaresource)));
        a.a(mediaresource);
    }

    public void a(MediaResource mediaresource, Exception exception, int i)
    {
        d.stop();
        mediaresource = a("media_upload_unpublished_failure", mediaresource);
        mediaresource.a("elapsed_time", d.elapsedMillis());
        mediaresource.a("retry_count", i);
        mediaresource.b("exception_info", exception.toString());
        a.a(mediaresource);
    }

    public void a(MediaResource mediaresource, String s)
    {
        d.stop();
        mediaresource = a("media_upload_unpublished_end", mediaresource);
        mediaresource.a("elapsed_time", d.elapsedMillis());
        mediaresource.b("unpublished_fbid", s);
        a.a(mediaresource);
    }

    public void a(MediaResource mediaresource, Throwable throwable)
    {
        d.stop();
        mediaresource = a("media_upload_resize_end", mediaresource);
        mediaresource.a("elapsed_time", d.elapsedMillis());
        if (throwable instanceof Error)
        {
            mediaresource.b("exception_info", ((Error)throwable).toString());
        } else
        {
            mediaresource.b("exception_info", ((Exception)throwable).toString());
        }
        mediaresource.a("elapsed_time", d.elapsedMillis());
        a(((cb) (mediaresource)));
        a.a(mediaresource);
        b.a("orca_upload_resize_failure", throwable);
    }

    public void b(MediaResource mediaresource)
    {
        d.reset().start();
        mediaresource = a("media_upload_resize_start", mediaresource);
        a.a(mediaresource);
    }

    public void c(MediaResource mediaresource)
    {
        mediaresource = a("media_upload_resize_delete", mediaresource);
        a.a(mediaresource);
    }

    public void d(MediaResource mediaresource)
    {
        b.b("orca_upload_rename_failure", mediaresource.f());
    }
}
