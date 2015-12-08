// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public final class guw
{

    public String a;
    public guc b;
    public gap c;
    public long d;
    public long e;
    public byte f[];
    public int g;
    public String h;
    public String i;
    public int j;
    public int k;
    public int l;
    public int m;
    private Uri n;
    private Uri o;
    private Uri p;

    public guw()
    {
        d = -1L;
        e = -1L;
        g = -1;
    }

    public final Intent a()
    {
        Uri uri;
label0:
        {
            boolean flag1 = false;
            Intent intent;
            boolean flag;
            boolean flag2;
            if (!TextUtils.isEmpty(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "Must set mimeType");
            flag2 = a.startsWith("video/");
            if (flag2 || n != null && !n.equals(Uri.EMPTY))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "Must set imageUri iff mimeType is not video/*");
            if (!flag2 || o != null && !o.equals(Uri.EMPTY))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "Must set videoUri iff mimeType is video/*");
            if (!flag2)
            {
                flag = flag1;
                if (p != null)
                {
                    break label0;
                }
            }
            flag = true;
        }
        p.b(flag, "Output URI is not applicable to photo edits.");
        intent = new Intent("com.google.android.apps.photos.photoeditor.edit");
        if (flag2)
        {
            uri = o;
        } else
        {
            uri = n;
        }
        intent.setDataAndType(uri, a);
        if (f != null)
        {
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.edit_list", f);
        }
        if (b != null)
        {
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.external_action", b.name());
            if (b == guc.a)
            {
                intent.putExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.output_x", j);
                intent.putExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.output_y", k);
                intent.putExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.aspect_x", l);
                intent.putExtra("com.google.android.apps.photos.photoeditor.contract.external_crop.aspect_y", m);
            }
        }
        if (p != null)
        {
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.output_uri", p);
        }
        if (c != null)
        {
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.media_model", c);
        }
        if (d > 0L && e > 0L)
        {
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.original_width", d);
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.original_height", e);
        }
        intent.putExtra("account_id", g);
        intent.putExtra("com.google.android.apps.photos.photoeditor.contract.media_key", h);
        intent.putExtra("com.google.android.apps.photos.photoeditor.contract.sha", i);
        return intent;
    }

    public final guw a(Uri uri)
    {
        boolean flag;
        if (o == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Cannot set imageUri and videoUri");
        n = uri;
        return this;
    }

    public final guw b(Uri uri)
    {
        boolean flag;
        if (n == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Cannot set imageUri and videoUri");
        o = uri;
        return this;
    }

    public final guw c(Uri uri)
    {
        boolean flag;
        if (!b.c(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Output URI should not be empty.");
        p = uri;
        return this;
    }
}
