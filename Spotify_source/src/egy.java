// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.mobile.android.spotlets.player.EntityType;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Locale;
import java.util.Set;

public final class egy extends ehi
    implements eat
{

    private Optional b;

    public egy(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
        b = Optional.c(null);
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Context a(ezs ezs1, PlayerState playerstate, Context context, Flags flags)
    {
        return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Context(playerstate.entityUri(), playerstate.entityUri(), ezs1.b(context), ezs1.a(context), EntityType.a(playerstate, flags).name().toLowerCase(Locale.getDefault()), Boolean.valueOf(playerstate.options().repeatingTrack()), Boolean.valueOf(playerstate.options().repeatingContext()), Boolean.valueOf(playerstate.options().shufflingContext()), Boolean.valueOf(playerstate.restrictions().disallowTogglingRepeatTrackReasons().isEmpty()), Boolean.valueOf(playerstate.restrictions().disallowTogglingRepeatContextReasons().isEmpty()), Boolean.valueOf(playerstate.restrictions().disallowTogglingShuffleReasons().isEmpty()));
    }

    protected final void a()
    {
        a.e.d.add(this);
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(ezs ezs1, PlayerState playerstate)
    {
        ezs1 = a(ezs1, playerstate, ((Context) (a)), a.b);
        if (!b.b() || !ezs1.equals(b.c()))
        {
            b = Optional.c(ezs1);
            a(ezs1);
        }
    }

    public final void b()
    {
        a.a(new eat() {

            private egy a;

            public final void a(ezs ezs1, PlayerState playerstate)
            {
                if (ezs1 == null)
                {
                    a.a(com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Context.EMPTY);
                    return;
                } else
                {
                    a.a(egy.a(ezs1, playerstate, a.a, a.a.b));
                    return;
                }
            }

            
            {
                a = egy.this;
                super();
            }
        });
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }
}
