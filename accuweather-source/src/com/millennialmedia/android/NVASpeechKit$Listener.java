// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit

public static interface 
{

    public abstract void onAudioLevelUpdate(double d);

    public abstract void onAudioSampleUpdate(double d);

    public abstract void onCustomWordsAdded();

    public abstract void onCustomWordsDeleted();

    public abstract void onError();

    public abstract void onResults();

    public abstract void onStateChange( );
}
