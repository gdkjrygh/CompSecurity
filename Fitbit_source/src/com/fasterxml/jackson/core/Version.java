// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Serializable;

public class Version
    implements Serializable, Comparable
{

    private static final Version a = new Version(0, 0, 0, null, null, null);
    private static final long serialVersionUID = 1L;
    protected final String _artifactId;
    protected final String _groupId;
    protected final int _majorVersion;
    protected final int _minorVersion;
    protected final int _patchLevel;
    protected final String _snapshotInfo;

    public Version(int j, int k, int l, String s)
    {
        this(j, k, l, s, null, null);
    }

    public Version(int j, int k, int l, String s, String s1, String s2)
    {
        _majorVersion = j;
        _minorVersion = k;
        _patchLevel = l;
        _snapshotInfo = s;
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        _groupId = s;
        s = s2;
        if (s2 == null)
        {
            s = "";
        }
        _artifactId = s;
    }

    public static Version a()
    {
        return a;
    }

    public int a(Version version)
    {
        int j;
        if (version == this)
        {
            j = 0;
        } else
        {
            int k = _groupId.compareTo(version._groupId);
            j = k;
            if (k == 0)
            {
                int l = _artifactId.compareTo(version._artifactId);
                j = l;
                if (l == 0)
                {
                    int i1 = _majorVersion - version._majorVersion;
                    j = i1;
                    if (i1 == 0)
                    {
                        int j1 = _minorVersion - version._minorVersion;
                        j = j1;
                        if (j1 == 0)
                        {
                            return _patchLevel - version._patchLevel;
                        }
                    }
                }
            }
        }
        return j;
    }

    public boolean b()
    {
        return this == a;
    }

    public boolean c()
    {
        return _snapshotInfo != null && _snapshotInfo.length() > 0;
    }

    public int compareTo(Object obj)
    {
        return a((Version)obj);
    }

    public int d()
    {
        return _majorVersion;
    }

    public int e()
    {
        return _minorVersion;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (Version)obj;
            if (((Version) (obj))._majorVersion != _majorVersion || ((Version) (obj))._minorVersion != _minorVersion || ((Version) (obj))._patchLevel != _patchLevel || !((Version) (obj))._artifactId.equals(_artifactId) || !((Version) (obj))._groupId.equals(_groupId))
            {
                return false;
            }
        }
        return true;
    }

    public int f()
    {
        return _patchLevel;
    }

    public String g()
    {
        return _groupId;
    }

    public String h()
    {
        return _artifactId;
    }

    public int hashCode()
    {
        return _artifactId.hashCode() ^ ((_groupId.hashCode() + _majorVersion) - _minorVersion) + _patchLevel;
    }

    public String i()
    {
        return (new StringBuilder()).append(_groupId).append('/').append(_artifactId).append('/').append(toString()).toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(_majorVersion).append('.');
        stringbuilder.append(_minorVersion).append('.');
        stringbuilder.append(_patchLevel);
        if (c())
        {
            stringbuilder.append('-').append(_snapshotInfo);
        }
        return stringbuilder.toString();
    }

}
