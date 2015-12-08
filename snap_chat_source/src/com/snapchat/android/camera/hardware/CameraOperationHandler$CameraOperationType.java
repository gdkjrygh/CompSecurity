// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.hardware;


// Referenced classes of package com.snapchat.android.camera.hardware:
//            CameraOperationHandler

public static final class  extends Enum
{

    private static final ADD_CALLBACK_BUFFER $VALUES[];
    public static final ADD_CALLBACK_BUFFER ADD_CALLBACK_BUFFER;
    public static final ADD_CALLBACK_BUFFER AUTOFOCUS;
    public static final ADD_CALLBACK_BUFFER GET_PARAMETERS;
    public static final ADD_CALLBACK_BUFFER LOCK;
    public static final ADD_CALLBACK_BUFFER OPEN;
    public static final ADD_CALLBACK_BUFFER RECONNECT;
    public static final ADD_CALLBACK_BUFFER RELEASE;
    public static final ADD_CALLBACK_BUFFER SET_CALLBACK_WITH_BUFFER;
    public static final ADD_CALLBACK_BUFFER SET_ORIENTATION;
    public static final ADD_CALLBACK_BUFFER SET_PARAMETERS;
    public static final ADD_CALLBACK_BUFFER SET_TEXTURE;
    public static final ADD_CALLBACK_BUFFER START_PREVIEW;
    public static final ADD_CALLBACK_BUFFER STOP_PREVIEW;
    public static final ADD_CALLBACK_BUFFER UNLOCK;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/camera/hardware/CameraOperationHandler$CameraOperationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        OPEN = new <init>("OPEN", 0);
        RELEASE = new <init>("RELEASE", 1);
        SET_PARAMETERS = new <init>("SET_PARAMETERS", 2);
        GET_PARAMETERS = new <init>("GET_PARAMETERS", 3);
        UNLOCK = new <init>("UNLOCK", 4);
        LOCK = new <init>("LOCK", 5);
        RECONNECT = new <init>("RECONNECT", 6);
        AUTOFOCUS = new <init>("AUTOFOCUS", 7);
        START_PREVIEW = new <init>("START_PREVIEW", 8);
        STOP_PREVIEW = new <init>("STOP_PREVIEW", 9);
        SET_CALLBACK_WITH_BUFFER = new <init>("SET_CALLBACK_WITH_BUFFER", 10);
        SET_TEXTURE = new <init>("SET_TEXTURE", 11);
        SET_ORIENTATION = new <init>("SET_ORIENTATION", 12);
        ADD_CALLBACK_BUFFER = new <init>("ADD_CALLBACK_BUFFER", 13);
        $VALUES = (new .VALUES[] {
            OPEN, RELEASE, SET_PARAMETERS, GET_PARAMETERS, UNLOCK, LOCK, RECONNECT, AUTOFOCUS, START_PREVIEW, STOP_PREVIEW, 
            SET_CALLBACK_WITH_BUFFER, SET_TEXTURE, SET_ORIENTATION, ADD_CALLBACK_BUFFER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
