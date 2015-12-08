// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.media;

import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.media:
//            AudioPlayer, FileHelper

public class AudioHandler extends CordovaPlugin
{

    public static String TAG = "AudioHandler";
    private int origVolumeStream;
    ArrayList pausedForPhone;
    HashMap players;

    public AudioHandler()
    {
        origVolumeStream = -1;
        players = new HashMap();
        pausedForPhone = new ArrayList();
    }

    private AudioPlayer getOrCreatePlayer(String s, String s1)
    {
        AudioPlayer audioplayer1 = (AudioPlayer)players.get(s);
        AudioPlayer audioplayer = audioplayer1;
        if (audioplayer1 == null)
        {
            if (players.isEmpty())
            {
                onFirstPlayerCreated();
            }
            audioplayer = new AudioPlayer(this, s, s1);
            players.put(s, audioplayer);
        }
        return audioplayer;
    }

    private void onFirstPlayerCreated()
    {
        origVolumeStream = cordova.getActivity().getVolumeControlStream();
        cordova.getActivity().setVolumeControlStream(3);
    }

    private void onLastPlayerReleased()
    {
        if (origVolumeStream != -1)
        {
            cordova.getActivity().setVolumeControlStream(origVolumeStream);
            origVolumeStream = -1;
        }
    }

    private boolean release(String s)
    {
        s = (AudioPlayer)players.remove(s);
        if (s == null)
        {
            return false;
        }
        if (players.isEmpty())
        {
            onLastPlayerReleased();
        }
        s.destroy();
        return true;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        Object obj;
        org.apache.cordova.PluginResult.Status status;
        obj = webView.getResourceApi();
        status = org.apache.cordova.PluginResult.Status.OK;
        if (!s.equals("startRecordingAudio")) goto _L2; else goto _L1
_L1:
        s = jsonarray.getString(1);
        obj = ((CordovaResourceApi) (obj)).remapUri(Uri.parse(s)).toString();
        s = ((String) (obj));
_L3:
        startRecordingAudio(jsonarray.getString(0), FileHelper.stripFileProtocol(s));
_L4:
        callbackcontext.sendPluginResult(new PluginResult(status, ""));
        return true;
        obj;
          goto _L3
_L2:
label0:
        {
            if (!s.equals("stopRecordingAudio"))
            {
                break label0;
            }
            stopRecordingAudio(jsonarray.getString(0));
        }
          goto _L4
        if (!s.equals("startPlayingAudio"))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        s = jsonarray.getString(1);
        obj = ((CordovaResourceApi) (obj)).remapUri(Uri.parse(s)).toString();
        s = ((String) (obj));
_L5:
        startPlayingAudio(jsonarray.getString(0), FileHelper.stripFileProtocol(s));
          goto _L4
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
          goto _L5
        if (s.equals("seekToAudio"))
        {
            seekToAudio(jsonarray.getString(0), jsonarray.getInt(1));
        } else
        if (s.equals("pausePlayingAudio"))
        {
            pausePlayingAudio(jsonarray.getString(0));
        } else
        if (s.equals("stopPlayingAudio"))
        {
            stopPlayingAudio(jsonarray.getString(0));
        } else
        if (s.equals("setVolume"))
        {
            try
            {
                setVolume(jsonarray.getString(0), Float.parseFloat(jsonarray.getString(1)));
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        } else
        {
            if (s.equals("getCurrentPositionAudio"))
            {
                callbackcontext.sendPluginResult(new PluginResult(status, getCurrentPositionAudio(jsonarray.getString(0))));
                return true;
            }
            if (s.equals("getDurationAudio"))
            {
                callbackcontext.sendPluginResult(new PluginResult(status, getDurationAudio(jsonarray.getString(0), jsonarray.getString(1))));
                return true;
            }
            if (s.equals("create"))
            {
                getOrCreatePlayer(jsonarray.getString(0), FileHelper.stripFileProtocol(jsonarray.getString(1)));
            } else
            if (s.equals("release"))
            {
                callbackcontext.sendPluginResult(new PluginResult(status, release(jsonarray.getString(0))));
                return true;
            } else
            {
                return false;
            }
        }
          goto _L4
    }

    public int getAudioOutputDevice()
    {
        AudioManager audiomanager = (AudioManager)cordova.getActivity().getSystemService("audio");
        if (audiomanager.getRouting(0) == 1)
        {
            return 1;
        }
        return audiomanager.getRouting(0) != 2 ? -1 : 2;
    }

    public float getCurrentPositionAudio(String s)
    {
        s = (AudioPlayer)players.get(s);
        if (s != null)
        {
            return (float)s.getCurrentPosition() / 1000F;
        } else
        {
            return -1F;
        }
    }

    public float getDurationAudio(String s, String s1)
    {
        return getOrCreatePlayer(s, s1).getDuration(s1);
    }

    public void onDestroy()
    {
        if (!players.isEmpty())
        {
            onLastPlayerReleased();
        }
        for (Iterator iterator = players.values().iterator(); iterator.hasNext(); ((AudioPlayer)iterator.next()).destroy()) { }
        players.clear();
    }

    public Object onMessage(String s, Object obj)
    {
        if (s.equals("telephone"))
        {
            if ("ringing".equals(obj) || "offhook".equals(obj))
            {
                s = players.values().iterator();
                do
                {
                    if (!s.hasNext())
                    {
                        break;
                    }
                    obj = (AudioPlayer)s.next();
                    if (((AudioPlayer) (obj)).getState() == AudioPlayer.STATE.MEDIA_RUNNING.ordinal())
                    {
                        pausedForPhone.add(obj);
                        ((AudioPlayer) (obj)).pausePlaying();
                    }
                } while (true);
            } else
            if ("idle".equals(obj))
            {
                for (s = pausedForPhone.iterator(); s.hasNext(); ((AudioPlayer)s.next()).startPlaying(null)) { }
                pausedForPhone.clear();
            }
        }
        return null;
    }

    public void onReset()
    {
        onDestroy();
    }

    public void pausePlayingAudio(String s)
    {
        s = (AudioPlayer)players.get(s);
        if (s != null)
        {
            s.pausePlaying();
        }
    }

    public void seekToAudio(String s, int i)
    {
        s = (AudioPlayer)players.get(s);
        if (s != null)
        {
            s.seekToPlaying(i);
        }
    }

    public void setAudioOutputDevice(int i)
    {
        AudioManager audiomanager = (AudioManager)cordova.getActivity().getSystemService("audio");
        if (i == 2)
        {
            audiomanager.setRouting(0, 2, -1);
            return;
        }
        if (i == 1)
        {
            audiomanager.setRouting(0, 1, -1);
            return;
        } else
        {
            System.out.println("AudioHandler.setAudioOutputDevice() Error: Unknown output device.");
            return;
        }
    }

    public void setVolume(String s, float f)
    {
        AudioPlayer audioplayer = (AudioPlayer)players.get(s);
        if (audioplayer != null)
        {
            audioplayer.setVolume(f);
            return;
        } else
        {
            System.out.println((new StringBuilder()).append("AudioHandler.setVolume() Error: Unknown Audio Player ").append(s).toString());
            return;
        }
    }

    public void startPlayingAudio(String s, String s1)
    {
        getOrCreatePlayer(s, s1).startPlaying(s1);
    }

    public void startRecordingAudio(String s, String s1)
    {
        getOrCreatePlayer(s, s1).startRecording(s1);
    }

    public void stopPlayingAudio(String s)
    {
        s = (AudioPlayer)players.get(s);
        if (s != null)
        {
            s.stopPlaying();
        }
    }

    public void stopRecordingAudio(String s)
    {
        s = (AudioPlayer)players.get(s);
        if (s != null)
        {
            s.stopRecording();
        }
    }

}
