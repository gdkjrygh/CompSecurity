// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package butterknife.internal;


final class Parameter
{

    static final Parameter NONE[] = new Parameter[0];
    private final int listenerPosition;
    private final String type;

    Parameter(int i, String s)
    {
        listenerPosition = i;
        type = s;
    }

    final int getListenerPosition()
    {
        return listenerPosition;
    }

    final String getType()
    {
        return type;
    }

}
