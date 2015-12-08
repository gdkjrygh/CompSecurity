// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;


// Referenced classes of package org.apache.http.entity.mime:
//            HttpMultipart, HttpMultipartMode

static class e
{

    static final int $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[];

    static 
    {
        $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode = new int[HttpMultipartMode.values().length];
        try
        {
            $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[HttpMultipartMode.STRICT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$org$apache$http$entity$mime$HttpMultipartMode[HttpMultipartMode.BROWSER_COMPATIBLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
