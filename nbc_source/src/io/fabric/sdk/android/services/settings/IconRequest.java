// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;

public class IconRequest
{

    public final String hash;
    public final int height;
    public final int iconResourceId;
    public final int width;

    public IconRequest(String s, int i, int j, int k)
    {
        hash = s;
        iconResourceId = i;
        width = j;
        height = k;
    }

    public static IconRequest build(Context context, String s)
    {
        Object obj = null;
        if (s != null)
        {
            try
            {
                int i = CommonUtils.getAppIconResourceId(context);
                Fabric.getLogger().d("Fabric", (new StringBuilder()).append("App icon resource ID is ").append(i).toString());
                obj = new android.graphics.BitmapFactory.Options();
                obj.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), i, ((android.graphics.BitmapFactory.Options) (obj)));
                obj = new IconRequest(s, i, ((android.graphics.BitmapFactory.Options) (obj)).outWidth, ((android.graphics.BitmapFactory.Options) (obj)).outHeight);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Fabric.getLogger().e("Fabric", "Failed to load icon", context);
                return null;
            }
        }
        return ((IconRequest) (obj));
    }
}
