// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.content.Context;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.roidapp.cloudlib.ah;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            k, FlickrPhotoFragment

public final class v extends ah
{

    final FlickrPhotoFragment c;

    public v(FlickrPhotoFragment flickrphotofragment, Context context)
    {
        c = flickrphotofragment;
        super(context);
    }

    protected final void a(Message message)
    {
        if (message.what == 8704)
        {
            k.a();
            k.a(c.getActivity());
            FlickrPhotoFragment.a(c);
        } else
        if (message.what == 8705 && c.getActivity() != null && !c.getActivity().isFinishing())
        {
            Toast.makeText(c.getActivity(), (String)message.obj, 0).show();
            return;
        }
    }
}
