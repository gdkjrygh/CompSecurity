// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;


// Referenced classes of package com.netflix.mediaclient.ui.common:
//            NetflixAlertDialog

private static class buttonId
{

    private final String buttonId;
    private final String label;

    public String getButtonId()
    {
        return buttonId;
    }

    public String getLabel()
    {
        return label;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActionButtonDescriptor [labelResourceId=").append(label).append(", buttonId=").append(buttonId).append("]").toString();
    }

    public Q(String s, String s1)
    {
        if (s1 == null || s == null)
        {
            throw new IllegalArgumentException("Button ID and label can not be null!");
        } else
        {
            label = s;
            buttonId = s1;
            return;
        }
    }
}
