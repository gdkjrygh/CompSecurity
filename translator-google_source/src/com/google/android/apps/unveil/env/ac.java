// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;
import com.google.android.apps.unveil.g;

public final class ac
    implements BaseColumns
{

    public static final String a[] = {
        "_id", "query_params", "thumbnail", "created", "barcode", "camera_config", "crop_rect", "crop_context_size", "docid", "flash_mode", 
        "focus_state", "image_data", "image_rotated", "image_size", "image_url", "jpeg_quality", "ms_since_epoch", "orientation_relative_to_camera", "orientation_relative_to_device", "query_type", 
        "replay_id", "restricts", "sequence_number", "source", "text", "preview_size", "transmitted_rect", "source_language", "can_log_image"
    };

    public static final Uri a(Context context)
    {
        context = String.valueOf(context.getString(g.unveil_content_provider_authority));
        String s = String.valueOf("queries");
        return Uri.parse((new StringBuilder(String.valueOf(context).length() + 11 + String.valueOf(s).length())).append("content://").append(context).append("/").append(s).toString());
    }

}
