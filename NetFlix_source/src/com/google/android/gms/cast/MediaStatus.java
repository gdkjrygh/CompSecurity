// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.eo;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            MediaInfo

public final class MediaStatus
{

    public static final long COMMAND_PAUSE = 1L;
    public static final long COMMAND_SEEK = 2L;
    public static final long COMMAND_SET_VOLUME = 4L;
    public static final long COMMAND_SKIP_BACKWARD = 32L;
    public static final long COMMAND_SKIP_FORWARD = 16L;
    public static final long COMMAND_TOGGLE_MUTE = 8L;
    public static final int IDLE_REASON_CANCELED = 2;
    public static final int IDLE_REASON_ERROR = 4;
    public static final int IDLE_REASON_FINISHED = 1;
    public static final int IDLE_REASON_INTERRUPTED = 3;
    public static final int IDLE_REASON_NONE = 0;
    public static final int PLAYER_STATE_BUFFERING = 4;
    public static final int PLAYER_STATE_IDLE = 1;
    public static final int PLAYER_STATE_PAUSED = 3;
    public static final int PLAYER_STATE_PLAYING = 2;
    public static final int PLAYER_STATE_UNKNOWN = 0;
    private long yA;
    private long yB;
    private double yC;
    private boolean yD;
    private JSONObject yn;
    private MediaInfo yo;
    private long yw;
    private double yx;
    private int yy;
    private int yz;

    public MediaStatus(JSONObject jsonobject)
        throws JSONException
    {
        a(jsonobject, 0);
    }

    public int a(JSONObject jsonobject, int i)
        throws JSONException
    {
        byte byte0 = 2;
        long l1 = jsonobject.getLong("mediaSessionId");
        int k;
        int l;
        if (l1 != yw)
        {
            yw = l1;
            k = 1;
        } else
        {
            k = 0;
        }
        l = k;
        if (jsonobject.has("playerState"))
        {
            Object obj = jsonobject.getString("playerState");
            int j;
            int i1;
            if (((String) (obj)).equals("IDLE"))
            {
                j = 1;
            } else
            if (((String) (obj)).equals("PLAYING"))
            {
                j = 2;
            } else
            if (((String) (obj)).equals("PAUSED"))
            {
                j = 3;
            } else
            if (((String) (obj)).equals("BUFFERING"))
            {
                j = 4;
            } else
            {
                j = 0;
            }
            i1 = k;
            if (j != yy)
            {
                yy = j;
                i1 = k | 2;
            }
            l = i1;
            if (j == 1)
            {
                l = i1;
                if (jsonobject.has("idleReason"))
                {
                    obj = jsonobject.getString("idleReason");
                    double d;
                    long l2;
                    boolean flag;
                    if (((String) (obj)).equals("CANCELLED"))
                    {
                        j = byte0;
                    } else
                    if (((String) (obj)).equals("INTERRUPTED"))
                    {
                        j = 3;
                    } else
                    if (((String) (obj)).equals("FINISHED"))
                    {
                        j = 1;
                    } else
                    if (((String) (obj)).equals("ERROR"))
                    {
                        j = 4;
                    } else
                    {
                        j = 0;
                    }
                    l = i1;
                    if (j != yz)
                    {
                        yz = j;
                        l = i1 | 2;
                    }
                }
            }
        }
        j = l;
        if (jsonobject.has("playbackRate"))
        {
            d = jsonobject.getDouble("playbackRate");
            j = l;
            if (yx != d)
            {
                yx = d;
                j = l | 2;
            }
        }
        k = j;
        if (jsonobject.has("currentTime"))
        {
            k = j;
            if ((i & 2) == 0)
            {
                l2 = eo.b(jsonobject.getDouble("currentTime"));
                k = j;
                if (l2 != yA)
                {
                    yA = l2;
                    k = j | 2;
                }
            }
        }
        j = k;
        if (jsonobject.has("supportedMediaCommands"))
        {
            l2 = jsonobject.getLong("supportedMediaCommands");
            j = k;
            if (l2 != yB)
            {
                yB = l2;
                j = k | 2;
            }
        }
        k = j;
        if (jsonobject.has("volume"))
        {
            k = j;
            if ((i & 1) == 0)
            {
                obj = jsonobject.getJSONObject("volume");
                d = ((JSONObject) (obj)).getDouble("level");
                i = j;
                if (d != yC)
                {
                    yC = d;
                    i = j | 2;
                }
                flag = ((JSONObject) (obj)).getBoolean("muted");
                k = i;
                if (flag != yD)
                {
                    yD = flag;
                    k = i | 2;
                }
            }
        }
        i = k;
        if (jsonobject.has("customData"))
        {
            yn = jsonobject.getJSONObject("customData");
            i = k | 2;
        }
        j = i;
        if (jsonobject.has("media"))
        {
            jsonobject = jsonobject.getJSONObject("media");
            yo = new MediaInfo(jsonobject);
            i |= 2;
            j = i;
            if (jsonobject.has("metadata"))
            {
                j = i | 4;
            }
        }
        return j;
    }

    public long dC()
    {
        return yw;
    }

    public JSONObject getCustomData()
    {
        return yn;
    }

    public int getIdleReason()
    {
        return yz;
    }

    public MediaInfo getMediaInfo()
    {
        return yo;
    }

    public double getPlaybackRate()
    {
        return yx;
    }

    public int getPlayerState()
    {
        return yy;
    }

    public long getStreamPosition()
    {
        return yA;
    }

    public double getStreamVolume()
    {
        return yC;
    }

    public boolean isMediaCommandSupported(long l)
    {
        return (yB & l) != 0L;
    }

    public boolean isMute()
    {
        return yD;
    }
}
