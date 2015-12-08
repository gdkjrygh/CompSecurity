// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.party.json.TracksJacksonModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.List;

public final class eyh
{

    public final eyi a;
    public final eyq b;
    public final eyo c;
    public final eyu d;
    public final Flags e;
    public final String f;
    public String g;
    public int h;
    public TracksJacksonModel i;
    eyt j;
    public eyr k;
    public eyp l;

    public eyh(eyi eyi, eyq eyq, eyo eyo, eyu eyu1, String s, String s1, Flags flags)
    {
        k = new eyr() {

            private eyh a;

            public final void a(TracksJacksonModel tracksjacksonmodel)
            {
                a.i = tracksjacksonmodel;
                a.a.a(tracksjacksonmodel);
            }

            
            {
                a = eyh.this;
                super();
            }
        };
        l = new eyp() {

            private eyh a;

            public final void a(eyt eyt1)
            {
                a.j = eyt1;
                a.a();
                a.a.a(eyt1);
            }

            
            {
                a = eyh.this;
                super();
            }
        };
        a = eyi;
        b = eyq;
        c = eyo;
        d = eyu1;
        f = s;
        g = s1;
        e = flags;
        h = 2;
    }

    public final void a()
    {
        if (j != null)
        {
            d.b = j.b;
            d.a = ((eys)j.a.get(h - 1)).b;
        }
    }
}
