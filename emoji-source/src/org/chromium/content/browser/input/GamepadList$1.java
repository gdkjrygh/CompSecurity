// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;


// Referenced classes of package org.chromium.content.browser.input:
//            GamepadList

class this._cls0
    implements android.hardware.input.nputDeviceListener
{

    final GamepadList this$0;

    public void onInputDeviceAdded(int i)
    {
        GamepadList.access$200(GamepadList.this, i);
    }

    public void onInputDeviceChanged(int i)
    {
        GamepadList.access$000(GamepadList.this, i);
    }

    public void onInputDeviceRemoved(int i)
    {
        GamepadList.access$100(GamepadList.this, i);
    }

    stener()
    {
        this$0 = GamepadList.this;
        super();
    }
}
