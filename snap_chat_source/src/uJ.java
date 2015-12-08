// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.model.Mediabryo;
import com.snapchat.android.notification.AndroidNotificationManager;

public abstract class uJ extends oC
    implements oS.a
{
    public static final class a extends Exception
    {
    }


    private static final String TAG = "SendMediaWithMediaTask";
    protected Context mContext;
    protected byte mData[];
    protected final AndroidNotificationManager mNotificationManager;
    protected uI.a mSendSnapCallback;
    protected final Bf mSnapWomb;
    protected AA mSnapbryo;

    public uJ(AA aa, uI.a a1, Bf bf, AndroidNotificationManager androidnotificationmanager)
    {
        mContext = SnapchatApplication.get();
        mSnapbryo = aa;
        mSendSnapCallback = a1;
        mSnapWomb = bf;
        mNotificationManager = androidnotificationmanager;
        registerCallback(java/lang/String, this);
    }

    protected abstract void a();

    protected abstract void b();

    public pi executeSynchronously()
    {
        return super.executeSynchronously();
    }

    protected String getPath()
    {
        return "/ph/upload";
    }

    public pn getRequestPayload()
    {
        int i;
        if (((Mediabryo) (mSnapbryo)).mSnapType == com.snapchat.android.model.Mediabryo.SnapType.CHATMEDIA)
        {
            i = mSnapbryo.i();
        } else
        {
            i = 4;
        }
        return new pb(buildAuthPayload((new To()).a(((Mediabryo) (mSnapbryo)).mClientId).a(Integer.valueOf(i)).a(mData)));
    }

    public void onJsonResult(Object obj, pi pi1)
    {
        if (pi1.c())
        {
            a();
            return;
        } else
        {
            b();
            return;
        }
    }
}
