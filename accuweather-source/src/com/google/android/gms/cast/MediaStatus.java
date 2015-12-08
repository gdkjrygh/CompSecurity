// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.gj;
import org.json.JSONArray;
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
    private long AG;
    private double AH;
    private int AI;
    private int AJ;
    private long AK;
    private long AL;
    private double AM;
    private boolean AN;
    private long AO[];
    private JSONObject Ax;
    private MediaInfo Ay;

    public MediaStatus(JSONObject jsonobject)
        throws JSONException
    {
        a(jsonobject, 0);
    }

    public int a(JSONObject jsonobject, int i)
        throws JSONException
    {
        byte byte0 = 2;
        boolean flag1 = false;
        boolean flag = true;
        long l1 = jsonobject.getLong("mediaSessionId");
        int k;
        int l;
        if (l1 != AG)
        {
            AG = l1;
            k = 1;
        } else
        {
            k = 0;
        }
        l = k;
        if (jsonobject.has("playerState"))
        {
            long al[] = jsonobject.getString("playerState");
            int j;
            int i1;
            if (al.equals("IDLE"))
            {
                j = 1;
            } else
            if (al.equals("PLAYING"))
            {
                j = 2;
            } else
            if (al.equals("PAUSED"))
            {
                j = 3;
            } else
            if (al.equals("BUFFERING"))
            {
                j = 4;
            } else
            {
                j = 0;
            }
            i1 = k;
            if (j != AI)
            {
                AI = j;
                i1 = k | 2;
            }
            l = i1;
            if (j == 1)
            {
                l = i1;
                if (jsonobject.has("idleReason"))
                {
                    al = jsonobject.getString("idleReason");
                    double d;
                    JSONArray jsonarray;
                    long l2;
                    boolean flag2;
                    if (al.equals("CANCELLED"))
                    {
                        j = byte0;
                    } else
                    if (al.equals("INTERRUPTED"))
                    {
                        j = 3;
                    } else
                    if (al.equals("FINISHED"))
                    {
                        j = 1;
                    } else
                    if (al.equals("ERROR"))
                    {
                        j = 4;
                    } else
                    {
                        j = 0;
                    }
                    l = i1;
                    if (j != AJ)
                    {
                        AJ = j;
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
            if (AH != d)
            {
                AH = d;
                j = l | 2;
            }
        }
        l = j;
        if (jsonobject.has("currentTime"))
        {
            l = j;
            if ((i & 2) == 0)
            {
                l2 = gj.b(jsonobject.getDouble("currentTime"));
                l = j;
                if (l2 != AK)
                {
                    AK = l2;
                    l = j | 2;
                }
            }
        }
        k = l;
        if (jsonobject.has("supportedMediaCommands"))
        {
            l2 = jsonobject.getLong("supportedMediaCommands");
            k = l;
            if (l2 != AL)
            {
                AL = l2;
                k = l | 2;
            }
        }
        j = k;
        if (jsonobject.has("volume"))
        {
            j = k;
            if ((i & 1) == 0)
            {
                al = jsonobject.getJSONObject("volume");
                d = al.getDouble("level");
                i = k;
                if (d != AM)
                {
                    AM = d;
                    i = k | 2;
                }
                flag2 = al.getBoolean("muted");
                j = i;
                if (flag2 != AN)
                {
                    AN = flag2;
                    j = i | 2;
                }
            }
        }
        if (!jsonobject.has("activeTrackIds")) goto _L2; else goto _L1
_L1:
        jsonarray = jsonobject.getJSONArray("activeTrackIds");
        l = jsonarray.length();
        al = new long[l];
        for (i = 0; i < l; i++)
        {
            al[i] = jsonarray.getLong(i);
        }

        if (AO != null) goto _L4; else goto _L3
_L3:
        i = ((flag) ? 1 : 0);
_L8:
        if (i != 0)
        {
            AO = al;
        }
        k = i;
_L6:
        i = j;
        if (k != 0)
        {
            AO = al;
            i = j | 2;
        }
        j = i;
        if (jsonobject.has("customData"))
        {
            Ax = jsonobject.getJSONObject("customData");
            j = i | 2;
        }
        i = j;
        if (jsonobject.has("media"))
        {
            jsonobject = jsonobject.getJSONObject("media");
            Ay = new MediaInfo(jsonobject);
            j |= 2;
            i = j;
            if (jsonobject.has("metadata"))
            {
                i = j | 4;
            }
        }
        return i;
_L4:
        i = ((flag) ? 1 : 0);
        if (AO.length != l)
        {
            continue; /* Loop/switch isn't completed */
        }
        for (k = 0; k < l; k++)
        {
            i = ((flag) ? 1 : 0);
            if (AO[k] != al[k])
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (AO != null)
        {
            k = 1;
            al = null;
        } else
        {
            al = null;
            k = ((flag1) ? 1 : 0);
        }
        if (true) goto _L6; else goto _L5
_L5:
        i = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public long dV()
    {
        return AG;
    }

    public long[] getActiveTrackIds()
    {
        return AO;
    }

    public JSONObject getCustomData()
    {
        return Ax;
    }

    public int getIdleReason()
    {
        return AJ;
    }

    public MediaInfo getMediaInfo()
    {
        return Ay;
    }

    public double getPlaybackRate()
    {
        return AH;
    }

    public int getPlayerState()
    {
        return AI;
    }

    public long getStreamPosition()
    {
        return AK;
    }

    public double getStreamVolume()
    {
        return AM;
    }

    public boolean isMediaCommandSupported(long l)
    {
        return (AL & l) != 0L;
    }

    public boolean isMute()
    {
        return AN;
    }
}
