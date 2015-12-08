// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.waveform:
//            WaveformFetchCommand, WaveformConnectionFactory, WaveformParser

public final class I extends b
    implements a, Provider
{

    private b supertype;
    private b waveformConnectionFactory;
    private b waveformParser;

    public final void attach(l l1)
    {
        waveformConnectionFactory = l1.a("com.soundcloud.android.waveform.WaveformConnectionFactory", com/soundcloud/android/waveform/WaveformFetchCommand, getClass().getClassLoader());
        waveformParser = l1.a("com.soundcloud.android.waveform.WaveformParser", com/soundcloud/android/waveform/WaveformFetchCommand, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.commands.Command", com/soundcloud/android/waveform/WaveformFetchCommand, getClass().getClassLoader(), false);
    }

    public final WaveformFetchCommand get()
    {
        WaveformFetchCommand waveformfetchcommand = new WaveformFetchCommand((WaveformConnectionFactory)waveformConnectionFactory.get(), (WaveformParser)waveformParser.get());
        injectMembers(waveformfetchcommand);
        return waveformfetchcommand;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(waveformConnectionFactory);
        set.add(waveformParser);
        set1.add(supertype);
    }

    public final void injectMembers(WaveformFetchCommand waveformfetchcommand)
    {
        supertype.injectMembers(waveformfetchcommand);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WaveformFetchCommand)obj);
    }

    public I()
    {
        super("com.soundcloud.android.waveform.WaveformFetchCommand", "members/com.soundcloud.android.waveform.WaveformFetchCommand", false, com/soundcloud/android/waveform/WaveformFetchCommand);
    }
}
