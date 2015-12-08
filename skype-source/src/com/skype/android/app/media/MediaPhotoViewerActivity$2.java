// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;


// Referenced classes of package com.skype.android.app.media:
//            MediaPhotoViewerActivity

static final class 
{

    static final int $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[];

    static 
    {
        $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS = new int[com.skype.values().length];
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MEDIA_LOADING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MEDIA_NOT_AVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MEDIA_BAD_CONTENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$skype$MediaDocument$MEDIA_STATUS[com.skype.MEDIA_LOADED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
