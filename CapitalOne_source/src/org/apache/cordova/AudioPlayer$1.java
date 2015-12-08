// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;


// Referenced classes of package org.apache.cordova:
//            AudioPlayer

static class DE
{

    static final int $SwitchMap$org$apache$cordova$AudioPlayer$MODE[];
    static final int $SwitchMap$org$apache$cordova$AudioPlayer$STATE[];

    static 
    {
        $SwitchMap$org$apache$cordova$AudioPlayer$STATE = new int[ATE.values().length];
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$STATE[ATE.MEDIA_NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$STATE[ATE.MEDIA_LOADING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$STATE[ATE.MEDIA_STARTING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$STATE[ATE.MEDIA_RUNNING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$STATE[ATE.MEDIA_PAUSED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$STATE[ATE.MEDIA_STOPPED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        $SwitchMap$org$apache$cordova$AudioPlayer$MODE = new int[DE.values().length];
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$MODE[DE.PLAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$MODE[DE.NONE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$apache$cordova$AudioPlayer$MODE[DE.RECORD.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
