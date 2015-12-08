// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.apple;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.b.b.a.a;
import org.b.b.b.b;

public class TrackLoadSettingsAtom extends AbstractBox
{

    public static final String TYPE = "load";
    private static final org.b.a.a.a ajc$tjp_0;
    private static final org.b.a.a.a ajc$tjp_1;
    private static final org.b.a.a.a ajc$tjp_2;
    private static final org.b.a.a.a ajc$tjp_3;
    private static final org.b.a.a.a ajc$tjp_4;
    private static final org.b.a.a.a ajc$tjp_5;
    private static final org.b.a.a.a ajc$tjp_6;
    private static final org.b.a.a.a ajc$tjp_7;
    int defaultHints;
    int preloadDuration;
    int preloadFlags;
    int preloadStartTime;

    public TrackLoadSettingsAtom()
    {
        super("load");
    }

    private static void ajc$preClinit()
    {
        b b1 = new b("TrackLoadSettingsAtom.java", com/googlecode/mp4parser/boxes/apple/TrackLoadSettingsAtom);
        ajc$tjp_0 = b1.a("method-execution", b1.a("1", "getPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 49);
        ajc$tjp_1 = b1.a("method-execution", b1.a("1", "setPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadStartTime", "", "void"), 53);
        ajc$tjp_2 = b1.a("method-execution", b1.a("1", "getPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 57);
        ajc$tjp_3 = b1.a("method-execution", b1.a("1", "setPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadDuration", "", "void"), 61);
        ajc$tjp_4 = b1.a("method-execution", b1.a("1", "getPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 65);
        ajc$tjp_5 = b1.a("method-execution", b1.a("1", "setPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "preloadFlags", "", "void"), 69);
        ajc$tjp_6 = b1.a("method-execution", b1.a("1", "getDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", "int"), 73);
        ajc$tjp_7 = b1.a("method-execution", b1.a("1", "setDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "int", "defaultHints", "", "void"), 77);
    }

    protected void _parseDetails(ByteBuffer bytebuffer)
    {
        preloadStartTime = bytebuffer.getInt();
        preloadDuration = bytebuffer.getInt();
        preloadFlags = bytebuffer.getInt();
        defaultHints = bytebuffer.getInt();
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(preloadStartTime);
        bytebuffer.putInt(preloadDuration);
        bytebuffer.putInt(preloadFlags);
        bytebuffer.putInt(defaultHints);
    }

    protected long getContentSize()
    {
        return 16L;
    }

    public int getDefaultHints()
    {
        org.b.a.a a1 = b.a(ajc$tjp_6, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return defaultHints;
    }

    public int getPreloadDuration()
    {
        org.b.a.a a1 = b.a(ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return preloadDuration;
    }

    public int getPreloadFlags()
    {
        org.b.a.a a1 = b.a(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return preloadFlags;
    }

    public int getPreloadStartTime()
    {
        org.b.a.a a1 = b.a(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(a1);
        return preloadStartTime;
    }

    public void setDefaultHints(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_7, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        defaultHints = i;
    }

    public void setPreloadDuration(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_3, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        preloadDuration = i;
    }

    public void setPreloadFlags(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_5, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        preloadFlags = i;
    }

    public void setPreloadStartTime(int i)
    {
        org.b.a.a a1 = b.a(ajc$tjp_1, this, this, a.a(i));
        RequiresParseDetailAspect.aspectOf().before(a1);
        preloadStartTime = i;
    }

    static 
    {
        ajc$preClinit();
    }
}
