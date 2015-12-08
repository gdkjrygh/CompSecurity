// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video;


// Referenced classes of package com.skype.android.video:
//            DeviceProfile

class Size
{

    public int h;
    private int rot;
    public int w;

    public Size(int i, int j)
    {
        rot = -1;
        w = i;
        h = j;
    }

    public Size(Size size)
    {
        rot = -1;
        w = size.w;
        h = size.h;
    }

    public Size fill(Size size)
    {
        float f = Math.max((float)size.w / (float)w, (float)size.h / (float)h);
        return new Size((int)((float)w * f), (int)((float)h * f));
    }

    public Size fitTo(Size size)
    {
        float f = Math.min((float)size.w / (float)w, (float)size.h / (float)h);
        return new Size((int)((float)w * f), (int)((float)h * f));
    }

    public void fixSize(int i, int j)
    {
        if (rot != i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (rot != -1) goto _L4; else goto _L3
_L3:
        if (!DeviceProfile.changePreviewDimensions(j, i)) goto _L1; else goto _L5
_L5:
        swap();
_L7:
        rot = i;
        return;
_L4:
        if ((rot - i) % 180 != 0)
        {
            swap();
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void swap()
    {
        int i = w;
        w = h;
        h = i;
    }

    public String toString()
    {
        return (new StringBuilder()).append(w).append(",").append(h).toString();
    }
}
