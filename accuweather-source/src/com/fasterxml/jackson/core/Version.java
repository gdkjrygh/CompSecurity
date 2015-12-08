// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import java.io.Serializable;

public class Version
    implements Comparable, Serializable
{

    private static final Version UNKNOWN_VERSION = new Version(0, 0, 0, null, null, null);
    private static final long serialVersionUID = 1L;
    protected final String _artifactId;
    protected final String _groupId;
    protected final int _majorVersion;
    protected final int _minorVersion;
    protected final int _patchLevel;
    protected final String _snapshotInfo;

    public Version(int i, int j, int k, String s)
    {
        this(i, j, k, s, null, null);
    }

    public Version(int i, int j, int k, String s, String s1, String s2)
    {
        _majorVersion = i;
        _minorVersion = j;
        _patchLevel = k;
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

    public static Version unknownVersion()
    {
        return UNKNOWN_VERSION;
    }

    public int compareTo(Version version)
    {
        int i;
        if (version == this)
        {
            i = 0;
        } else
        {
            int j = _groupId.compareTo(version._groupId);
            i = j;
            if (j == 0)
            {
                int k = _artifactId.compareTo(version._artifactId);
                i = k;
                if (k == 0)
                {
                    int l = _majorVersion - version._majorVersion;
                    i = l;
                    if (l == 0)
                    {
                        int i1 = _minorVersion - version._minorVersion;
                        i = i1;
                        if (i1 == 0)
                        {
                            return _patchLevel - version._patchLevel;
                        }
                    }
                }
            }
        }
        return i;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Version)obj);
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

    public String getArtifactId()
    {
        return _artifactId;
    }

    public String getGroupId()
    {
        return _groupId;
    }

    public int getMajorVersion()
    {
        return _majorVersion;
    }

    public int getMinorVersion()
    {
        return _minorVersion;
    }

    public int getPatchLevel()
    {
        return _patchLevel;
    }

    public int hashCode()
    {
        return _artifactId.hashCode() ^ ((_groupId.hashCode() + _majorVersion) - _minorVersion) + _patchLevel;
    }

    public boolean isSnapshot()
    {
        return _snapshotInfo != null && _snapshotInfo.length() > 0;
    }

    public boolean isUknownVersion()
    {
        return this == UNKNOWN_VERSION;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(_majorVersion).append('.');
        stringbuilder.append(_minorVersion).append('.');
        stringbuilder.append(_patchLevel);
        if (isSnapshot())
        {
            stringbuilder.append('-').append(_snapshotInfo);
        }
        return stringbuilder.toString();
    }

}
