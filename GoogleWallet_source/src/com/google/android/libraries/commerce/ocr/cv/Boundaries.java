// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.cv;

import com.google.common.base.Objects;

// Referenced classes of package com.google.android.libraries.commerce.ocr.cv:
//            Edge

public class Boundaries
{

    public static final Boundaries NULL = new Boundaries(null, null, null, null);
    private final Edge bottom;
    private final Edge left;
    private final Edge right;
    private final Edge top;

    public Boundaries(Edge edge, Edge edge1, Edge edge2, Edge edge3)
    {
        top = edge;
        left = edge1;
        right = edge2;
        bottom = edge3;
    }

    public boolean allEdgesDetected()
    {
        return top != null && left != null && bottom != null && right != null;
    }

    public Edge getBottom()
    {
        return bottom;
    }

    public Edge getLeft()
    {
        return left;
    }

    public Edge getRight()
    {
        return right;
    }

    public Edge getTop()
    {
        return top;
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("top", top).add("left", left).add("right", right).add("bottom", bottom).toString();
    }

}
