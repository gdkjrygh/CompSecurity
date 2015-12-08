// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dcu
    implements android.media.AudioManager.OnAudioFocusChangeListener
{

    private dct a;

    dcu(dct dct1)
    {
        a = dct1;
        super();
    }

    public final void onAudioFocusChange(int i)
    {
        if ((i == -1 || i == -2) && a.c != null)
        {
            a.c.a();
        }
    }
}
