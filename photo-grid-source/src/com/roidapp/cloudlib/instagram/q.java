// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.content.Context;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import com.roidapp.cloudlib.ah;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramPhotoFragment, r

final class q extends ah
{

    WeakReference c;

    public q(Context context, InstagramPhotoFragment instagramphotofragment)
    {
        super(context);
        c = new WeakReference(instagramphotofragment);
    }

    protected final void a(Message message)
    {
        InstagramPhotoFragment instagramphotofragment;
        for (instagramphotofragment = (InstagramPhotoFragment)c.get(); instagramphotofragment == null || instagramphotofragment.getActivity() == null || instagramphotofragment.getActivity().isFinishing();)
        {
            return;
        }

        message.what;
        JVM INSTR tableswitch 512 512: default 56
    //                   512 62;
           goto _L1 _L2
_L1:
        super.a(message);
        return;
_L2:
        instagramphotofragment.a((r)message.obj, message.arg1);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
