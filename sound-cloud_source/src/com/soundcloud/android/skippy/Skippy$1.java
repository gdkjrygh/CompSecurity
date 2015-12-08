// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            SkippyVersionValidator, SkippyLibrary, Skippy

class this._cls0
    implements SkippyVersionValidator
{

    final Skippy this$0;

    public boolean isValidLibraryVersionLoaded(SkippyLibrary skippylibrary)
    {
        if (skippylibrary.equals(SkippyLibrary.SKIPPY))
        {
            return isNativeSkippyLibVersionCorrect();
        } else
        {
            return true;
        }
    }

    rary()
    {
        this$0 = Skippy.this;
        super();
    }
}
