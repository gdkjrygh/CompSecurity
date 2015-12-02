// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final SPHERICAL_VIDEO_ASPECT_RATIO $VALUES[];
    public static final SPHERICAL_VIDEO_ASPECT_RATIO SPHERICAL_FIELD_OF_VIEW_VERTICAL;
    public static final SPHERICAL_VIDEO_ASPECT_RATIO SPHERICAL_LAST_DRAG_TIMESTAMP;
    public static final SPHERICAL_VIDEO_ASPECT_RATIO SPHERICAL_VIDEO_ASPECT_RATIO;
    public static final SPHERICAL_VIDEO_ASPECT_RATIO SPHERICAL_VIEWPORT_LOGGING_REASON;
    public static final SPHERICAL_VIDEO_ASPECT_RATIO SPHERICAL_VIEWPORT_PITCH_ANGLE;
    public static final SPHERICAL_VIDEO_ASPECT_RATIO SPHERICAL_VIEWPORT_ROLL_ANGLE;
    public static final SPHERICAL_VIDEO_ASPECT_RATIO SPHERICAL_VIEWPORT_YAW_ANGLE;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$SphericalVideoAttributes, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        SPHERICAL_VIEWPORT_PITCH_ANGLE = new <init>("SPHERICAL_VIEWPORT_PITCH_ANGLE", 0, "pitch");
        SPHERICAL_VIEWPORT_YAW_ANGLE = new <init>("SPHERICAL_VIEWPORT_YAW_ANGLE", 1, "yaw");
        SPHERICAL_VIEWPORT_ROLL_ANGLE = new <init>("SPHERICAL_VIEWPORT_ROLL_ANGLE", 2, "roll");
        SPHERICAL_VIEWPORT_LOGGING_REASON = new <init>("SPHERICAL_VIEWPORT_LOGGING_REASON", 3, "spherical_viewport_logging_reason");
        SPHERICAL_FIELD_OF_VIEW_VERTICAL = new <init>("SPHERICAL_FIELD_OF_VIEW_VERTICAL", 4, "spherical_fov_y");
        SPHERICAL_LAST_DRAG_TIMESTAMP = new <init>("SPHERICAL_LAST_DRAG_TIMESTAMP", 5, "last_drag_timestamp");
        SPHERICAL_VIDEO_ASPECT_RATIO = new <init>("SPHERICAL_VIDEO_ASPECT_RATIO", 6, "spherical_aspect_ratio");
        $VALUES = (new .VALUES[] {
            SPHERICAL_VIEWPORT_PITCH_ANGLE, SPHERICAL_VIEWPORT_YAW_ANGLE, SPHERICAL_VIEWPORT_ROLL_ANGLE, SPHERICAL_VIEWPORT_LOGGING_REASON, SPHERICAL_FIELD_OF_VIEW_VERTICAL, SPHERICAL_LAST_DRAG_TIMESTAMP, SPHERICAL_VIDEO_ASPECT_RATIO
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
