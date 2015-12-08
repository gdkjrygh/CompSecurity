// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.momentsstart.model.MomentContext;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements android.os.r.Callback
{

    private euz a;

    public final boolean handleMessage(Message message)
    {
        Object obj;
        switch (message.what)
        {
        default:
            Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
            return true;

        case 1: // '\001'
            obj = message.getData();
            break;
        }
        message = (MomentContext)((Bundle) (obj)).getParcelable("key_current");
        MomentContext momentcontext = (MomentContext)((Bundle) (obj)).getParcelable("key_next");
        MomentContext momentcontext1 = (MomentContext)((Bundle) (obj)).getParcelable("key_previous");
        obj = a;
        if (((euz) (obj)).b)
        {
            ((euz) (obj)).a(message, momentcontext1, momentcontext, 500L);
            return true;
        }
        obj.b = true;
        PlayerState playerstate = ((euz) (obj)).d.getLastPlayerState();
        if (playerstate != null && TextUtils.equals(((MomentContext) (message)).uri, playerstate.entityUri()))
        {
            if (playerstate.isPaused())
            {
                ((euz) (obj)).d.resume();
            }
            obj.b = false;
            return true;
        } else
        {
            message = new <init>(((euz) (obj)), message, momentcontext1, momentcontext);
            ((euz) (obj)).d.fetchState(new <init>(((euz) (obj)), message));
            return true;
        }
    }

    (euz euz1)
    {
        a = euz1;
        super();
    }
}
