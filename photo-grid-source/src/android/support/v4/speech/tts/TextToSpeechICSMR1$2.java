// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.speech.tts;


final class val.listener
    implements android.speech.tts.nceCompletedListener
{

    final teranceProgressListenerICSMR1 val$listener;

    public final void onUtteranceCompleted(String s)
    {
        val$listener.onStart(s);
        val$listener.onDone(s);
    }

    teranceProgressListenerICSMR1()
    {
        val$listener = teranceprogresslistenericsmr1;
        super();
    }
}
