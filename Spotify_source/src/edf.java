// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.service.session.SessionStateService;
import rx.internal.operators.OperatorReplay;

public class edf
    implements dmx
{

    public hew a;

    public edf(Context context)
    {
        a = OperatorReplay.b(duh.a(context, new Intent(context, com/spotify/mobile/android/service/session/SessionStateService)).c(new hfw() {

            public final volatile Object call(Object obj)
            {
                return (ecz)(IBinder)obj;
            }

        }).b(hfj.a()).a(new hhm(hfj.a())).b(new hfw() {

            public final Object call(Object obj)
            {
                obj = (ecz)obj;
                if (obj == null)
                {
                    return hew.a();
                } else
                {
                    return hew.a(new ede(((ecz) (obj))));
                }
            }

        })).e();
    }
}
