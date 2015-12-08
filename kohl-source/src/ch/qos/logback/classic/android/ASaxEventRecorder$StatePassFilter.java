// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.android;


// Referenced classes of package ch.qos.logback.classic.android:
//            ASaxEventRecorder

static class _states
{

    private int _depth;
    private final String _states[];

    public boolean checkEnd(String s)
    {
        if (_depth > 0 && s.equals(_states[_depth - 1]))
        {
            _depth = _depth - 1;
        } else
        if (_depth == _states.length)
        {
            return true;
        }
        return false;
    }

    public boolean checkStart(String s)
    {
        if (_depth == _states.length)
        {
            return true;
        }
        if (s.equals(_states[_depth]))
        {
            _depth = _depth + 1;
        }
        return false;
    }

    public boolean passed()
    {
        return _depth == _states.length;
    }

    public void reset()
    {
        _depth = 0;
    }

    public transient (String as[])
    {
        _depth = 0;
        String as1[] = as;
        if (as == null)
        {
            as1 = new String[0];
        }
        _states = as1;
    }
}
