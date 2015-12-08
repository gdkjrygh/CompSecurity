// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.managers;

import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import java.io.File;
import me.lyft.android.common.Strings;

public class ImageLoader
{

    private Picasso picasso;

    public ImageLoader(Picasso picasso1)
    {
        picasso = picasso1;
    }

    private static RequestCreator addCommonOptions(RequestCreator requestcreator)
    {
        return requestcreator.noFade();
    }

    public void cancelRequest(ImageView imageview)
    {
        picasso.cancelRequest(imageview);
    }

    public void cancelRequest(Target target)
    {
        picasso.cancelRequest(target);
    }

    public RequestCreator load(int i)
    {
        return addCommonOptions(picasso.load(i));
    }

    public RequestCreator load(Uri uri)
    {
        return addCommonOptions(picasso.load(uri));
    }

    public RequestCreator load(File file)
    {
        return addCommonOptions(picasso.load(file));
    }

    public RequestCreator load(String s)
    {
        String s1 = s;
        if (Strings.isNullOrBlank(s))
        {
            s1 = null;
        }
        return addCommonOptions(picasso.load(s1));
    }
}
