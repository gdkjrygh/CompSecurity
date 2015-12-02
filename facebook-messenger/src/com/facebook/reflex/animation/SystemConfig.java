// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.animation;

import com.facebook.reflex.Countable;

// Referenced classes of package com.facebook.reflex.animation:
//            PropertyName, b, Node, Transition

public final class SystemConfig extends Countable
{

    public SystemConfig()
    {
        a(initialize());
    }

    private native int initialize();

    public void a(String s, b b, PropertyName propertyname)
    {
        bindNode(new PropertyName(s, b), variableNode(propertyname));
    }

    public native Node add(Node node, Node node1);

    public native void bindNode(PropertyName propertyname, Node node);

    public native void bindNode(String s, Node node);

    public native Node clampNode(Node node, Node node1, Node node2);

    public native Node constantNode(float f);

    public native void declareVariable(PropertyName propertyname, float f);

    public native void declareVariable(String s, float f);

    public native void declareWidget(String s);

    public native Node divide(Node node, Node node1);

    public native Node multiply(Node node, Node node1);

    public native Node subtract(Node node, Node node1);

    public native Node transition(Transition transition1, Node node);

    public native Node variableNode(PropertyName propertyname);

    public native Node variableNode(String s);
}
