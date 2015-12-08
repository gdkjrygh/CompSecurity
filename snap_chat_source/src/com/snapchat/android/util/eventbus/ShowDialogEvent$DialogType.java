// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


// Referenced classes of package com.snapchat.android.util.eventbus:
//            ShowDialogEvent

public static final class  extends Enum
{

    private static final YES_NO_SC_DIALOG $VALUES[];
    public static final YES_NO_SC_DIALOG ONE_BUTTON;
    public static final YES_NO_SC_DIALOG ONE_BUTTON_SC_DIALOG;
    public static final YES_NO_SC_DIALOG TOAST;
    public static final YES_NO_SC_DIALOG YES_NO_DIALOG;
    public static final YES_NO_SC_DIALOG YES_NO_DONTASK_DIALOG;
    public static final YES_NO_SC_DIALOG YES_NO_SC_DIALOG;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/eventbus/ShowDialogEvent$DialogType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TOAST = new <init>("TOAST", 0);
        ONE_BUTTON = new <init>("ONE_BUTTON", 1);
        YES_NO_DIALOG = new <init>("YES_NO_DIALOG", 2);
        YES_NO_DONTASK_DIALOG = new <init>("YES_NO_DONTASK_DIALOG", 3);
        ONE_BUTTON_SC_DIALOG = new <init>("ONE_BUTTON_SC_DIALOG", 4);
        YES_NO_SC_DIALOG = new <init>("YES_NO_SC_DIALOG", 5);
        $VALUES = (new .VALUES[] {
            TOAST, ONE_BUTTON, YES_NO_DIALOG, YES_NO_DONTASK_DIALOG, ONE_BUTTON_SC_DIALOG, YES_NO_SC_DIALOG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
