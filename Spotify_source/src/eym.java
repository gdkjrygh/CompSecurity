// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.LinearLayout;
import com.spotify.mobile.android.spotlets.party.json.TrackJacksonModel;

public abstract class eym extends abo
{

    protected final LinearLayout j;

    public eym(View view)
    {
        super(view);
        j = (LinearLayout)a.findViewById(0x7f11046e);
    }

    public abstract void a(TrackJacksonModel trackjacksonmodel);
}
