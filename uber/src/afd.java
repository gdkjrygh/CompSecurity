// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

public final class afd extends afh
{

    private final Map a;
    private final Context b;

    public afd(akk akk1, Map map)
    {
        super(akk1, "storePicture");
        a = map;
        b = akk1.d();
    }

    static android.app.DownloadManager.Request a(String s, String s1)
    {
        s = new android.app.DownloadManager.Request(Uri.parse(s));
        s.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s1);
        ot.g().a(s);
        return s;
    }

    static Context a(afd afd1)
    {
        return afd1.b;
    }

    private static String d(String s)
    {
        return Uri.parse(s).getLastPathSegment();
    }

    public final void a()
    {
        if (b == null)
        {
            a("Activity context is not available");
            return;
        }
        ot.e();
        if (!ajc.e(b).c())
        {
            a("Feature is not supported by the device.");
            return;
        }
        String s = (String)a.get("iurl");
        if (TextUtils.isEmpty(s))
        {
            a("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(s))
        {
            a((new StringBuilder("Invalid image url: ")).append(s).toString());
            return;
        }
        String s1 = d(s);
        ot.e();
        if (!ajc.c(s1))
        {
            a((new StringBuilder("Image type not recognized: ")).append(s1).toString());
            return;
        } else
        {
            ot.e();
            android.app.AlertDialog.Builder builder = ajc.d(b);
            builder.setTitle(ot.h().a(kf.store_picture_title, "Save image"));
            builder.setMessage(ot.h().a(kf.store_picture_message, "Allow Ad to store image in Picture gallery?"));
            builder.setPositiveButton(ot.h().a(kf.accept, "Accept"), new _cls1(s, s1));
            builder.setNegativeButton(ot.h().a(kf.decline, "Decline"), new _cls2());
            builder.create().show();
            return;
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
