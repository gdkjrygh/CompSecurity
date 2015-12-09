// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.mobile.android.service.feature.FeatureService;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import rx.internal.operators.OperatorReplay;

public class dun
    implements dmx
{

    public final hew a;

    public dun(Context context)
    {
        this(duh.a(context, new Intent(context, com/spotify/mobile/android/service/feature/FeatureService)).b(hfj.a()).c(new hfw() {

            public final volatile Object call(Object obj)
            {
                return ((dwy)(IBinder)obj).a;
            }

        }));
    }

    private dun(hew hew1)
    {
        a = OperatorReplay.b(hew1.b(new hfw() {

            public final Object call(Object obj)
            {
                return hew.a(new duk((dxe)obj));
            }

        })).e();
    }

    public final hew a(fyu fyu)
    {
        return a.a(new dui(fyu)).c(new hfw(fyu) {

            private fyu a;

            public final Object call(Object obj)
            {
                return ((Flags)obj).a(a);
            }

            
            {
                a = fyu;
                super();
            }
        });
    }
}
