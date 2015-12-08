// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.display;


// Referenced classes of package com.googlecode.eyesfree.braille.display:
//            Display, BrailleDisplayProperties, BrailleInputEvent

private class <init> extends Stub
{

    final Display this$0;

    public void onDisplayConnected(BrailleDisplayProperties brailledisplayproperties)
    {
        Display.access$300(Display.this).eportConnectionState(1, brailledisplayproperties);
    }

    public void onDisplayDisconnected()
    {
        Display.access$300(Display.this).eportConnectionState(0, null);
    }

    public void onInput(BrailleInputEvent brailleinputevent)
    {
        Display.access$300(Display.this).eportInputEvent(brailleinputevent);
    }

    private ()
    {
        this$0 = Display.this;
        super();
    }

    Stub(Stub stub)
    {
        this();
    }
}
