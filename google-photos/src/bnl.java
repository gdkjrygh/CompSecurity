// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.res.Resources;
import android.text.TextUtils;

public class bnl
    implements blf, blg, buk, ckh, cta, cum, czd, ds
{

    public final ContentResolver a;

    public bnl(ContentResolver contentresolver, Resources resources)
    {
        a = (ContentResolver)b.a(contentresolver, "contentResolver", null);
        b.a(resources, "resources", null);
    }

    public final boolean A_()
    {
        boolean flag = false;
        if (ddy.c.a())
        {
            flag = true;
        } else
        if (!ddy.d.a())
        {
            return lvd.a(a, "moviemaker:enabled", false);
        }
        return flag;
    }

    public final String[] B_()
    {
        return TextUtils.split(lvd.a(a, "moviemaker:override_audio_decoder_names", ""), ",");
    }

    public final String a()
    {
        return lvd.a(a, "moviemaker:asset_base_url", "https://android-movie-maker-assets-3-83a82ce67950.storage.googleapis.com/");
    }

    public final String b()
    {
        return lvd.a(a, "moviemaker:ui_asset_base_url", "http://ssl.gstatic.com/s2/photos/aam/android/images/");
    }

    public final int c()
    {
        return lvd.a(a, "moviemaker:asset_download_read_timeout_ms", 5000);
    }

    public final void d()
    {
        lvd.a(a, "dummy", "");
    }

    public final boolean h()
    {
        return lvd.a(a, "moviemaker:clip_editor_hardware_codecs_enabled", true);
    }

    public final int i()
    {
        return lvd.a(a, "moviemaker:maximum_seekable_frame_size_pixels", 0xe1000);
    }

    public final boolean j()
    {
        return lvd.a(a, "moviemaker:use_adaptive_decoder", false);
    }

    public final String k()
    {
        return lvd.a(a, "moviemaker:soundtrack_base_url_v3", "https://android-movie-maker-music-prod-12-f8b933b299fb.storage.googleapis.com/");
    }

    public final int l()
    {
        return lvd.a(a, "moviemaker:music_http_read_timeout_ms", 5000);
    }

    public final String[] m()
    {
        return TextUtils.split(lvd.a(a, "moviemaker:music_locales", ""), ",");
    }

    public final int n()
    {
        return lvd.a(a, "moviemaker:maximum_output_duration_secs", 240);
    }

    public final boolean o()
    {
        return lvd.a(a, "moviemaker:state_tracker_enabled", false);
    }

    public final int p()
    {
        return Math.min(lvd.a(a, "moviemaker:aam_renderer_version", 4), 4);
    }
}
