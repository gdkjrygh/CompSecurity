// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.VolumeProvider;

final class em
{

    // Unreferenced inner class em$1

/* anonymous class */
    final class _cls1 extends VolumeProvider
    {

        private en a;

        public final void onAdjustVolume(int i)
        {
            a.b(i);
        }

        public final void onSetVolumeTo(int i)
        {
            a.a(i);
        }

            
            {
                a = en1;
                super(i, j, k);
            }
    }

}
