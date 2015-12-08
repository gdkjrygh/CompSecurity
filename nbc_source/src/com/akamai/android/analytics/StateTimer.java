// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

// Referenced classes of package com.akamai.android.analytics:
//            States, ConnectState, InitBuffState, PlayState, 
//            RebufferState, SeekState, PauseState, ResumeBufferState, 
//            StopState, ErrorState, BackGroundState, AdState, 
//            StateTimerInputPacket, StateTimerInputPacketType, StateTimerOutputPacketType, InternalCodes, 
//            VisitMetrics, StateTimerOutputPacket, CSMAKEYS, MyPair, 
//            PluginMetricsSnapShot, ErrorCodes, PluginCallBackSnapShot

public class StateTimer
{
    class InputPacketQueueHandler extends Timer
    {

        final StateTimer this$0;

        public void start()
        {
            schedule(new TimerTask() {

                final InputPacketQueueHandler this$1;

                public void run()
                {
                    Object obj = stateTimerLock;
                    obj;
                    JVM INSTR monitorenter ;
_L2:
                    Object obj1 = inputPacketsQueueLock;
                    obj1;
                    JVM INSTR monitorenter ;
                    StateTimerInputPacket statetimerinputpacket;
                    if (inputPacketsQueue.size() <= 0)
                    {
                        break MISSING_BLOCK_LABEL_87;
                    }
                    statetimerinputpacket = (StateTimerInputPacket)inputPacketsQueue.remove(0);
_L3:
                    actOnTheInputPacket(statetimerinputpacket);
                    if (statetimerinputpacket != null) goto _L2; else goto _L1
_L1:
                    stop();
                    obj;
                    JVM INSTR monitorexit ;
                    return;
                    statetimerinputpacket = null;
                      goto _L3
                    Exception exception;
                    exception;
                    obj1;
                    JVM INSTR monitorexit ;
                    throw exception;
                    exception;
                    obj;
                    JVM INSTR monitorexit ;
                    try
                    {
                        throw exception;
                    }
                    catch (Exception exception1)
                    {
                        return;
                    }
                }

            
            {
                this$1 = InputPacketQueueHandler.this;
                super();
            }
            }, 0L);
        }

        public void stop()
        {
            synchronized (inputPacketsQueueLock)
            {
                StateTimer statetimer = StateTimer.this;
                statetimer.activeQueueProcessingThreads = statetimer.activeQueueProcessingThreads - 1;
            }
            cancel();
            purge();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }


        public InputPacketQueueHandler()
        {
            this$0 = StateTimer.this;
            statetimer = new StringBuilder("AkamaiStateEventHandler");
            int i = StateTimer.noOfEventHandlerIntstance;
            StateTimer.noOfEventHandlerIntstance = i + 1;
            super(append(i).toString());
            try
            {
                start();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (StateTimer statetimer)
            {
                return;
            }
        }
    }

    static interface StateTimerOutputListener
    {

        public abstract void disable();

        public abstract void event(StateTimerOutputPacket statetimeroutputpacket);
    }


    static int noOfEventHandlerIntstance = 0;
    int _currState;
    PluginCallBackSnapShot _currentPluginCallBackSnapShot;
    PluginMetricsSnapShot _currentPluginMetricsSnapshot;
    long _currentTime;
    int _prevState;
    States _stateObj[];
    float _strHead;
    long _timeAtInit;
    long _timeAtLastLog;
    int _timeSinceLastLog;
    int _timeSinceStart;
    public int activeQueueProcessingThreads;
    private long bytesLoadedValueAtLastLog;
    int currAdType;
    private long fullScreenEnteredAt;
    private int fullScreenTime;
    private int hSequenceId;
    public boolean initAtLeastOnce;
    public Vector inputPacketsQueue;
    public Object inputPacketsQueueLock;
    private boolean isFullScreen;
    private int lastDroppedFrames;
    public boolean looksOk;
    private boolean pauseSeekSessionHappening;
    public boolean playAtLeastOnce;
    public boolean reachedEnd;
    private int sequenceId;
    public Object stateTimerLock;
    public StateTimerOutputListener stateTimerOutputListener;
    int stateWhenEnteredAdState;
    private long timeAtLastH;
    private VisitMetrics visitMetrics;
    boolean waitingForPostRoll;

    public StateTimer(StateTimerOutputListener statetimeroutputlistener, VisitMetrics visitmetrics)
    {
        _timeAtInit = 0L;
        _timeAtLastLog = 0L;
        _timeSinceStart = 0;
        _timeSinceLastLog = 0;
        _currentTime = 0L;
        _strHead = 0.0F;
        timeAtLastH = 0L;
        hSequenceId = -1;
        sequenceId = -1;
        lastDroppedFrames = 0;
        bytesLoadedValueAtLastLog = 0L;
        waitingForPostRoll = false;
        currAdType = 0;
        stateWhenEnteredAdState = 12;
        stateTimerLock = new Object();
        synchronized (stateTimerLock)
        {
            setStateTimerOutputListener(statetimeroutputlistener);
            visitMetrics = visitmetrics;
            initializeStateMachine();
            looksOk = true;
            reachedEnd = false;
            inputPacketsQueueLock = new Object();
            inputPacketsQueue = new Vector();
        }
        return;
        statetimeroutputlistener;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw statetimeroutputlistener;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerOutputListener statetimeroutputlistener)
        {
            return;
        }
    }

    private void initializeStateMachine()
    {
        Object obj = stateTimerLock;
        obj;
        JVM INSTR monitorenter ;
        States.DebugInterface debuginterface;
        initializeTimes();
        _stateObj = new States[13];
        _stateObj[0] = new States(0);
        _stateObj[1] = new ConnectState(1);
        _stateObj[2] = new InitBuffState(2);
        _stateObj[3] = new PlayState(3);
        _stateObj[4] = new RebufferState(4);
        _stateObj[5] = new SeekState(5);
        _stateObj[6] = new PauseState(6);
        _stateObj[7] = new ResumeBufferState(7);
        _stateObj[8] = new StopState(8);
        _stateObj[9] = new ErrorState(9);
        _stateObj[10] = new BackGroundState(10);
        _stateObj[11] = new AdState(11);
        _stateObj[12] = new States(12);
        debuginterface = new States.DebugInterface() {

            final StateTimer this$0;

            public void debugToParent(String s)
            {
                debug(s);
            }

            
            {
                this$0 = StateTimer.this;
                super();
            }
        };
        int i = 0;
_L2:
        if (i < 12)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        _currState = 12;
        _prevState = 12;
        playAtLeastOnce = false;
        initAtLeastOnce = false;
        waitingForPostRoll = false;
        currAdType = -1;
        stateWhenEnteredAdState = 12;
        hSequenceId = -1;
        sequenceId = 0;
        isFullScreen = false;
        pauseSeekSessionHappening = false;
        obj;
        JVM INSTR monitorexit ;
        return;
        _stateObj[i].setDebugListener(debuginterface);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void initializeTimes()
    {
        synchronized (stateTimerLock)
        {
            _timeAtInit = 0L;
            _timeAtLastLog = 0L;
            _timeSinceStart = 0;
            _timeSinceLastLog = 0;
            _currentTime = 0L;
            _strHead = 0.0F;
            _currentPluginCallBackSnapShot = null;
            _currentPluginMetricsSnapshot = null;
            fullScreenEnteredAt = 0L;
            fullScreenTime = 0;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void toggleInputPacketQueueHandler(boolean flag)
    {
        Object obj = inputPacketsQueueLock;
        obj;
        JVM INSTR monitorenter ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        if (activeQueueProcessingThreads < 2)
        {
            new InputPacketQueueHandler();
            activeQueueProcessingThreads = activeQueueProcessingThreads + 1;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void actOnTheInputPacket(StateTimerInputPacket statetimerinputpacket)
    {
        if (statetimerinputpacket != null)
        {
            if (statetimerinputpacket.packetType != StateTimerInputPacketType.DEBUG)
            {
                debug((new StringBuilder("\nActing on Input Packet : ")).append(statetimerinputpacket.packetType).append(":Time :").append(statetimerinputpacket.currentTime).toString());
            }
            manageTimes(statetimerinputpacket.currentTime.longValue());
            managePacketInfo(statetimerinputpacket);
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.INIT)
            {
                handleJustInit();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.CONNECT)
            {
                handleConnect();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.BUFFER_START)
            {
                handleBufferStart();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.BUFFER_END)
            {
                handleBufferEnd();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.PLAY)
            {
                handlePlayStart();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.PAUSE)
            {
                handlePause();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.RESUME_BUFFER)
            {
                handleResume(true);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.SEEK_START)
            {
                handleSeekStart(((Float)statetimerinputpacket.auxInfo).floatValue());
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.SEEK_END)
            {
                handleSeekEnd(((Float)statetimerinputpacket.auxInfo).floatValue());
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.ERROR)
            {
                handleError((String)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.PLAY_END)
            {
                handlePlayEnd((String)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.PLAY_END_POSTROLL)
            {
                handlePlayEndWithPostRoll((String)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.SWITCH_REQUESTED)
            {
                handleSwitchRequest(((Integer)statetimerinputpacket.auxInfo).intValue());
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.SWITCHED_TO)
            {
                handleSwitchedTo(((Integer)statetimerinputpacket.auxInfo).intValue());
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.FULL_SCREEN)
            {
                handleFullScreen(((Boolean)statetimerinputpacket.auxInfo).booleanValue());
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_LOADED)
            {
                handleAdLoaded((HashMap)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_STARTED)
            {
                handleAdStarted();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_FIRST_QUARTILE)
            {
                handleAdFirstQuartile();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_MIDPOINT)
            {
                handleAdMidPoint();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_THIRD_QUARTILE)
            {
                handleAdThirdQuartile();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_COMPLETE)
            {
                handleAdComplete();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_STOPPED)
            {
                handleAdStopped();
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_END)
            {
                handleAdEnd(((Integer)statetimerinputpacket.auxInfo).intValue());
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.AD_ERROR)
            {
                handleAdError((HashMap)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.GIVEMEABEACON)
            {
                handleGiveBeacon(StateTimerOutputPacketType.CURRENTMETRICS, (HashMap)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.GIVEMEAHEARTBEATBEACON)
            {
                handleGiveBeacon(StateTimerOutputPacketType.SENDHEARTBEATLINE, (HashMap)statetimerinputpacket.auxInfo);
                timeAtLastH = _currentTime;
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.GIVEMEAERRORBEACONRESET)
            {
                handleGiveBeaconReset(StateTimerOutputPacketType.SENDERRORLINE, (HashMap)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.GIVEMEACOMPLETEBEACONRESET)
            {
                handleGiveBeaconReset(StateTimerOutputPacketType.SENDSTOPLINE, (HashMap)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.GIVEMEAPLAYBEACONRESET)
            {
                handleGiveBeaconReset(StateTimerOutputPacketType.SENDPLAYLINE, (HashMap)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.SETDATAFEEDBACK)
            {
                handleFeedBack((HashMap)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.DEBUG)
            {
                handleDebug((String)statetimerinputpacket.auxInfo);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.REMOVELISTENER)
            {
                setStateTimerOutputListener(null);
                return;
            }
            if (statetimerinputpacket.packetType == StateTimerInputPacketType.TITLE_SWITCHED)
            {
                handleTitleSwitch((HashMap)statetimerinputpacket.auxInfo);
                return;
            }
        }
    }

    public void changeState(int i)
    {
        if (!reachedEnd || waitingForPostRoll) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (_currState == 11)
        {
            ((AdState)_stateObj[11]).handleAdEnd(InternalCodes.ADENDEDWITHUSERSTOP, _timeSinceLastLog, _timeSinceStart, _strHead);
        }
        if (i == 11)
        {
            stateWhenEnteredAdState = _currState;
        }
        updatePauseSeekFlag(i);
        _prevState = _stateObj[_currState].exit_state(i, _timeSinceLastLog, _timeSinceStart, _strHead);
        _currState = _stateObj[i].enter_state(_prevState, _timeSinceLastLog, _timeSinceStart, _strHead);
        if (!pauseSeekSessionHappening) goto _L4; else goto _L3
_L3:
        PauseState pausestate = (PauseState)_stateObj[6];
        if (_prevState != 6) goto _L6; else goto _L5
_L5:
        pausestate.lastExitDueToPauseSeekSess();
_L4:
        if (!playAtLeastOnce && i == 3)
        {
            playAtLeastOnce = true;
            timeAtLastH = _currentTime;
            handleGiveBeaconReset(StateTimerOutputPacketType.SENDFIRSTPLAYLINE, null);
            return;
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (_currState == 6)
        {
            pausestate.lastEntryDueToPauseSeekSess();
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (i == 8)
        {
            handleGiveBeaconReset(StateTimerOutputPacketType.SENDSTOPLINE, null);
            reachedEnd = true;
            waitingForPostRoll = false;
            return;
        }
        if (i == 9)
        {
            if (playAtLeastOnce)
            {
                handleGiveBeaconReset(StateTimerOutputPacketType.SENDPLAYLINE, null);
            } else
            {
                synchronized (visitMetrics.visitLock)
                {
                    VisitMetrics visitmetrics1 = visitMetrics;
                    visitmetrics1.visitStartupErrors = visitmetrics1.visitStartupErrors + 1;
                }
            }
            synchronized (visitMetrics.visitLock)
            {
                VisitMetrics visitmetrics = visitMetrics;
                visitmetrics.visitErrors = visitmetrics.visitErrors + 1;
            }
            handleGiveBeaconReset(StateTimerOutputPacketType.SENDERRORLINE, null);
            reachedEnd = true;
            waitingForPostRoll = false;
            return;
        }
        continue; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        if (initAtLeastOnce || i != 0) goto _L1; else goto _L8
_L8:
        initAtLeastOnce = true;
        timeAtLastH = _currentTime;
        handleGiveBeaconReset(StateTimerOutputPacketType.SENDINITLINE, null);
        return;
    }

    public void debug(String s)
    {
        queueInputPacket(new StateTimerInputPacket(StateTimerInputPacketType.DEBUG, Long.valueOf(_currentTime), _currentPluginCallBackSnapShot, _currentPluginMetricsSnapshot, s));
    }

    public long fullScreenClockTime()
    {
        if (isFullScreen)
        {
            return (long)(fullScreenTime + _timeSinceStart) - fullScreenEnteredAt;
        } else
        {
            return (long)fullScreenTime;
        }
    }

    public int getAdType(HashMap hashmap)
    {
        if (hashmap != null && hashmap.containsKey(InternalCodes.ADPOSITIONKEY))
        {
            return Integer.parseInt((String)hashmap.get(InternalCodes.ADPOSITIONKEY));
        }
        if (playAtLeastOnce)
        {
            if (waitingForPostRoll)
            {
                return InternalCodes.ADTYPE_POSTROLL;
            } else
            {
                return InternalCodes.ADTYPE_MIDROLL;
            }
        } else
        {
            return InternalCodes.ADTYPE_PREROLL;
        }
    }

    public StateTimerOutputPacket giveActionPacketForBeacon(StateTimerOutputPacketType statetimeroutputpackettype)
    {
        return giveActionPacketForBeacon(statetimeroutputpackettype, new HashMap());
    }

    public StateTimerOutputPacket giveActionPacketForBeacon(StateTimerOutputPacketType statetimeroutputpackettype, HashMap hashmap)
    {
        return new StateTimerOutputPacket(statetimeroutputpackettype, Long.valueOf(_currentTime), _currentPluginCallBackSnapShot, _currentPluginMetricsSnapshot, hashmap);
    }

    public void giveCommonMetrics(HashMap hashmap)
    {
        try
        {
            hashmap.put(CSMAKEYS.startuptime.toString(), Integer.toString(startupTime()));
            hashmap.put(CSMAKEYS.loginterval.toString(), Float.toString((float)_timeSinceLastLog / 1000F));
            hashmap.put(CSMAKEYS.currentclocktime.toString(), Integer.toString(_timeSinceStart));
            hashmap.put(CSMAKEYS.currentstreamtime.toString(), Integer.toString(Math.round(_strHead)));
            hashmap.put(CSMAKEYS.pauseseeksession.toString(), givePauseSeekSessionString());
            hashmap.put(CSMAKEYS.fullscreenclocktime.toString(), Long.toString(fullScreenClockTime()));
            hashmap.put(CSMAKEYS.sequenceid.toString(), Integer.toString(sequenceId));
            hashmap.put(CSMAKEYS.sequenceidh.toString(), Integer.toString(hSequenceId));
            hashmap.put(CSMAKEYS.epochtime.toString(), Long.toString(_currentTime));
            if (hashmap.containsKey(CSMAKEYS.endofstream.toString()) && ((String)hashmap.get(CSMAKEYS.endofstream.toString())).equals("-"))
            {
                hashmap.put(CSMAKEYS.endofstream.toString(), "0");
            }
            hashmap.put(CSMAKEYS.lasthtime.toString(), Float.toString((float)(_currentTime - timeAtLastH) / 1000F));
            updateCallBackRelatedInfo(hashmap);
            updatePluginMetricsRelatedInfo(hashmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return;
        }
    }

    public String givePauseSeekSessionString()
    {
        Object obj1 = (SeekState)_stateObj[5];
        Object obj = (PauseState)_stateObj[6];
        obj1 = ((SeekState) (obj1)).sessionString(_timeSinceLastLog, _timeSinceStart, _strHead);
        Object obj2 = ((PauseState) (obj)).sessionString(_timeSinceLastLog, _timeSinceStart, _strHead);
        Object obj3 = null;
        obj = obj3;
        if (obj1 != null)
        {
            obj = obj3;
            if (((ArrayList) (obj1)).size() > 0)
            {
                obj = obj1;
            }
        }
        obj1 = obj;
        if (obj2 != null)
        {
            obj1 = obj;
            if (((ArrayList) (obj2)).size() > 0)
            {
                if (obj != null && ((ArrayList) (obj)).size() > 0)
                {
                    ((ArrayList) (obj)).addAll(((java.util.Collection) (obj2)));
                    obj1 = obj;
                } else
                {
                    obj1 = obj2;
                }
            }
        }
        if (obj1 != null && ((ArrayList) (obj1)).size() > 0)
        {
            Collections.sort(((java.util.List) (obj1)), new Comparator() {

                final StateTimer this$0;

                public int compare(MyPair mypair, MyPair mypair1)
                {
                    return ((Integer)mypair.second).compareTo((Integer)mypair1.second);
                }

                public volatile int compare(Object obj4, Object obj5)
                {
                    return compare((MyPair)obj4, (MyPair)obj5);
                }

            
            {
                this$0 = StateTimer.this;
                super();
            }
            });
            String s = "";
            obj1 = ((ArrayList) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    if (s.length() > 0)
                    {
                        return s.substring(0, s.length() - 1);
                    }
                    break;
                }
                obj2 = (MyPair)((Iterator) (obj1)).next();
                s = (new StringBuilder(String.valueOf(s))).append((String)((MyPair) (obj2)).first).append(",").toString();
            } while (true);
        }
        return "-";
    }

    public HashMap giveStatesMetrics(HashMap hashmap)
    {
        HashMap hashmap1;
        hSequenceId = hSequenceId + 1;
        hashmap1 = hashmap;
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        hashmap1 = new HashMap();
        hashmap = CSMAKEYS.values();
        j = hashmap.length;
        i = 0;
_L4:
        if (i < j) goto _L3; else goto _L2
_L2:
        if (_currentPluginMetricsSnapshot != null && _currentPluginMetricsSnapshot.heartBeatInterval > 0)
        {
            hashmap1.put(CSMAKEYS.heartbeatinterval.toString(), Integer.toString(_currentPluginMetricsSnapshot.heartBeatInterval));
        }
        if (_currentPluginMetricsSnapshot != null)
        {
            hashmap1.put(CSMAKEYS.issessionwithrebufferlimit.toString(), Integer.toString(_currentPluginMetricsSnapshot.isSessionWithRebufferLimit));
        }
        i = 0;
_L5:
        if (i >= 12)
        {
            giveCommonMetrics(hashmap1);
            return hashmap1;
        }
        break MISSING_BLOCK_LABEL_142;
_L3:
        hashmap1.put(hashmap[i].toString(), "-");
        i++;
          goto _L4
        _stateObj[i].getMetrics(hashmap1, _timeSinceLastLog, _timeSinceStart, _strHead, visitMetrics);
        i++;
          goto _L5
    }

    public HashMap giveStatesMetricsReset(HashMap hashmap)
    {
        hashmap = giveStatesMetrics(hashmap);
        resetForRelative();
        return hashmap;
    }

    public void handleAdComplete()
    {
        ((AdState)_stateObj[11]).handleAdComplete(_timeSinceLastLog, _timeSinceStart, _strHead);
        changeState(stateWhenEnteredAdState);
    }

    public void handleAdEnd(int i)
    {
        ((AdState)_stateObj[11]).handleAdEnd(i, _timeSinceLastLog, _timeSinceStart, _strHead);
        changeState(stateWhenEnteredAdState);
    }

    public void handleAdError(HashMap hashmap)
    {
        ((AdState)_stateObj[11]).handleAdError(hashmap, _timeSinceLastLog, _timeSinceStart, _strHead);
        changeState(stateWhenEnteredAdState);
    }

    public void handleAdFirstQuartile()
    {
        ((AdState)_stateObj[11]).handleAdFirstQuartile(_timeSinceLastLog, _timeSinceStart, _strHead);
    }

    public void handleAdLoaded(HashMap hashmap)
    {
        handleJustInit();
        int i = getAdType(hashmap);
        if (_currState != 11)
        {
            changeState(11);
        }
        ((AdState)_stateObj[11]).handleAdLoaded(i, hashmap, _timeSinceLastLog, _timeSinceStart, _strHead);
    }

    public void handleAdMidPoint()
    {
        ((AdState)_stateObj[11]).handleAdMidPoint(_timeSinceLastLog, _timeSinceStart, _strHead);
    }

    public void handleAdStarted()
    {
        ((AdState)_stateObj[11]).handleAdStarted(_timeSinceLastLog, _timeSinceStart, _strHead);
    }

    public void handleAdStopped()
    {
        ((AdState)_stateObj[11]).handleAdStopped(_timeSinceLastLog, _timeSinceStart, _strHead);
        changeState(stateWhenEnteredAdState);
    }

    public void handleAdThirdQuartile()
    {
        ((AdState)_stateObj[11]).handleAdThirdQuartile(_timeSinceLastLog, _timeSinceStart, _strHead);
    }

    public void handleBufferEnd()
    {
        if (_currState == 12 || _currState == 4 || _currState == 2 || _currState == 7 || _currState == 1)
        {
            handlePlayStart();
        } else
        if (_currState == 5)
        {
            if (pauseSeekSessionHappening)
            {
                handlePause();
                return;
            } else
            {
                handlePlayStart();
                return;
            }
        }
    }

    public void handleBufferStart()
    {
        if (_currState == 12)
        {
            handleJustInit();
        }
        if ((_currState == 0 || _currState == 1) && !playAtLeastOnce)
        {
            changeState(2);
        } else
        if (_currState == 3)
        {
            changeState(4);
            return;
        }
    }

    public void handleConnect()
    {
        if (_currState == 12)
        {
            handleJustInit();
        }
        if (_currState == 0)
        {
            changeState(1);
        }
    }

    public void handleDebug(String s)
    {
        sendOutputPacket(new StateTimerOutputPacket(StateTimerOutputPacketType.DEBUG, Long.valueOf(_currentTime), _currentPluginCallBackSnapShot, _currentPluginMetricsSnapshot, s));
    }

    public void handleError(String s)
    {
        if (_currState == 12)
        {
            return;
        }
        if (_currState == 11)
        {
            stateWhenEnteredAdState = 8;
            ((StopState)_stateObj[8]).endReasonCode = "Ad.Abandon";
            ((ErrorState)_stateObj[9]).errorCode = "Ad.Abandon";
            handleAdEnd(InternalCodes.ADENDEDWITHUSERSTOP);
            changeState(8);
            return;
        }
        ((StopState)_stateObj[8]).endReasonCode = s;
        ((ErrorState)_stateObj[9]).errorCode = s;
        if (playAtLeastOnce && s == ErrorCodes.Application_Close.toString())
        {
            handlePlayEnd(s);
            return;
        } else
        {
            changeState(9);
            return;
        }
    }

    public void handleFeedBack(HashMap hashmap)
    {
        sendOutputPacket(new StateTimerOutputPacket(StateTimerOutputPacketType.SENDFEEDBACKLINE, Long.valueOf(_currentTime), _currentPluginCallBackSnapShot, _currentPluginMetricsSnapshot, hashmap));
    }

    public void handleFullScreen(boolean flag)
    {
        if (flag && !isFullScreen)
        {
            isFullScreen = true;
            fullScreenEnteredAt = _timeSinceStart;
        } else
        if (!flag && isFullScreen)
        {
            isFullScreen = false;
            fullScreenTime = (int)((long)fullScreenTime + ((long)_timeSinceStart - fullScreenEnteredAt));
            return;
        }
    }

    public void handleGiveBeacon(StateTimerOutputPacketType statetimeroutputpackettype, HashMap hashmap)
    {
        sendOutputPacket(giveActionPacketForBeacon(statetimeroutputpackettype, giveStatesMetrics(hashmap)));
    }

    public void handleGiveBeaconReset(StateTimerOutputPacketType statetimeroutputpackettype, HashMap hashmap)
    {
        sendOutputPacket(giveActionPacketForBeacon(statetimeroutputpackettype, giveStatesMetricsReset(hashmap)));
    }

    public void handleInit(boolean flag)
    {
        handleJustInit();
        if (flag)
        {
            handleBufferStart();
            return;
        } else
        {
            handleConnect();
            return;
        }
    }

    public void handleJustInit()
    {
        if (_currState != 12)
        {
            debug("Init may have been done already");
            return;
        } else
        {
            _timeAtInit = _currentTime;
            _timeAtLastLog = _currentTime;
            _timeSinceStart = 0;
            _timeSinceLastLog = 0;
            manageTimes(_currentTime);
            changeState(0);
            return;
        }
    }

    public void handlePause()
    {
        if (_currState == 3 || _currState == 5 || _currState == 7 || _currState == 1 || _currState == 2 || _currState == 4)
        {
            if (_currState == 12 || _currState == 1 || _currState == 2)
            {
                handlePlayStart();
            }
            changeState(6);
        }
    }

    public void handlePlayEnd(String s)
    {
        if (_currState == 12)
        {
            return;
        }
        if (_currState == 11)
        {
            stateWhenEnteredAdState = 8;
            ((StopState)_stateObj[8]).endReasonCode = "Ad.Abandon";
            ((ErrorState)_stateObj[9]).errorCode = "Ad.Abandon";
            handleAdEnd(InternalCodes.ADENDEDWITHAPPCLOSE);
            changeState(8);
            return;
        }
        ((StopState)_stateObj[8]).endReasonCode = s;
        ((ErrorState)_stateObj[9]).errorCode = s;
        if (playAtLeastOnce)
        {
            changeState(8);
            return;
        } else
        {
            handleError(s);
            return;
        }
    }

    public void handlePlayEndWithPostRoll(String s)
    {
        if (_currState == 12)
        {
            return;
        } else
        {
            ((StopState)_stateObj[8]).endReasonCode = s;
            ((ErrorState)_stateObj[9]).errorCode = s;
            waitingForPostRoll = true;
            sendOutputPacket(giveActionPacketForBeacon(StateTimerOutputPacketType.WAITINGFORPOSTROLL));
            return;
        }
    }

    public void handlePlayStart()
    {
        if (_currState == 12)
        {
            handleConnect();
        }
        changeState(3);
    }

    public void handleResume(boolean flag)
    {
        if (_currState == 6 && flag)
        {
            changeState(7);
            return;
        } else
        {
            handlePlayStart();
            return;
        }
    }

    public void handleSeekEnd(float f)
    {
        _strHead = f;
        handleBufferEnd();
    }

    public void handleSeekStart(float f)
    {
        while (_currState == 12 || _currState != 6 && _currState != 3 && _currState != 4 && _currState != 7) 
        {
            return;
        }
        _strHead = f;
        changeState(5);
    }

    public void handleSwitchRequest(int i)
    {
        ((PlayState)_stateObj[3]).switchRequestedTo(i, _timeSinceLastLog, _timeSinceStart, _strHead);
    }

    public void handleSwitchedTo(int i)
    {
        ((PlayState)_stateObj[3]).switchedTo(i, _timeSinceLastLog, _timeSinceStart, _strHead);
    }

    public void handleTitleSwitch(HashMap hashmap)
    {
        sendOutputPacket(new StateTimerOutputPacket(StateTimerOutputPacketType.TITLE_SWITCHED, null, null, null, hashmap));
    }

    public void managePacketInfo(StateTimerInputPacket statetimerinputpacket)
    {
        if (waitingForPostRoll)
        {
            return;
        }
        _currentPluginCallBackSnapShot = statetimerinputpacket.pluginCallBack;
        _currentPluginMetricsSnapshot = statetimerinputpacket.pluginMetrics;
        float f;
        if (_currentPluginCallBackSnapShot != null)
        {
            f = _currentPluginCallBackSnapShot.streamHeadPosition;
        } else
        {
            f = 0.0F;
        }
        _strHead = f;
    }

    public void manageTimes(long l)
    {
        int i = (int)(l - _timeAtInit);
        int j = (int)(l - _timeAtLastLog);
        if (i >= 0 && i >= _timeSinceStart && j >= 0 && l >= _timeAtLastLog && l >= _timeAtInit)
        {
            _timeSinceStart = i;
            _timeSinceLastLog = j;
        }
        if (_currentTime < l)
        {
            _currentTime = l;
        }
    }

    public void queueInputPacket(StateTimerInputPacket statetimerinputpacket)
    {
        synchronized (inputPacketsQueueLock)
        {
            inputPacketsQueue.add(statetimerinputpacket);
            if (statetimerinputpacket.packetType != StateTimerInputPacketType.DEBUG)
            {
                debug((new StringBuilder("\nGiven Input Packet : ")).append(statetimerinputpacket.packetType).toString());
            }
            toggleInputPacketQueueHandler(true);
        }
        return;
        statetimerinputpacket;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw statetimerinputpacket;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerInputPacket statetimerinputpacket)
        {
            return;
        }
    }

    public void resetForRelative()
    {
        hSequenceId = -1;
        sequenceId = sequenceId + 1;
        int i = 0;
        do
        {
            if (i >= 12)
            {
                if (_timeAtLastLog < _currentTime)
                {
                    _timeAtLastLog = _currentTime;
                }
                if (fullScreenEnteredAt < (long)_timeSinceStart)
                {
                    fullScreenEnteredAt = _timeSinceStart;
                }
                fullScreenTime = 0;
                if (_currentPluginCallBackSnapShot != null)
                {
                    lastDroppedFrames = _currentPluginCallBackSnapShot.droppedFrames;
                    bytesLoadedValueAtLastLog = _currentPluginCallBackSnapShot.bytesLoaded;
                }
                manageTimes(_currentTime);
                return;
            }
            _stateObj[i].reset(_timeSinceLastLog, _timeSinceStart, _strHead, visitMetrics);
            i++;
        } while (true);
    }

    public void sendOutputPacket(StateTimerOutputPacket statetimeroutputpacket)
    {
        try
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.DEBUG)
            {
                debug((new StringBuilder("\nProducing Output Packet: ")).append(statetimeroutputpacket.packetType).append(":Time :").append(statetimeroutputpacket.currentTime).toString());
            }
            if (stateTimerOutputListener != null)
            {
                stateTimerOutputListener.event(statetimeroutputpacket);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerOutputPacket statetimeroutputpacket)
        {
            return;
        }
    }

    public void setStateTimerOutputListener(StateTimerOutputListener statetimeroutputlistener)
    {
        synchronized (stateTimerLock)
        {
            stateTimerOutputListener = statetimeroutputlistener;
        }
        return;
        statetimeroutputlistener;
        obj;
        JVM INSTR monitorexit ;
        throw statetimeroutputlistener;
    }

    public int startupTime()
    {
        return _stateObj[1].timeSpent(_timeSinceLastLog, _timeSinceStart) + _stateObj[2].timeSpent(_timeSinceLastLog, _timeSinceStart);
    }

    public void updateCallBackRelatedInfo(HashMap hashmap)
    {
        String s;
label0:
        {
            updateStreamNameRelatedInfo(hashmap);
            PluginCallBackSnapShot plugincallbacksnapshot = _currentPluginCallBackSnapShot;
            String s1 = CSMAKEYS.deliverytype.toString();
            int i;
            if (plugincallbacksnapshot.isLive)
            {
                s = "L";
            } else
            {
                s = "O";
            }
            hashmap.put(s1, s);
            hashmap.put(CSMAKEYS.streamlength.toString(), Float.toString(plugincallbacksnapshot.streamLength));
            hashmap.put(CSMAKEYS.videosize.toString(), plugincallbacksnapshot.videoSize);
            hashmap.put(CSMAKEYS.bytesloaded.toString(), Long.toString(plugincallbacksnapshot.bytesLoaded - bytesLoadedValueAtLastLog));
            i = plugincallbacksnapshot.droppedFrames;
            if (i >= lastDroppedFrames)
            {
                hashmap.put(CSMAKEYS.droppedframes.toString(), Integer.toString(i - lastDroppedFrames));
            }
            s = plugincallbacksnapshot.serverIP;
            if (s != null && s.length() > 0)
            {
                if (s.lastIndexOf(":") == -1)
                {
                    break label0;
                }
                hashmap.put(CSMAKEYS.serverip.toString(), s.substring(0, s.lastIndexOf(":")));
                hashmap.put(CSMAKEYS.port.toString(), s.substring(s.lastIndexOf(":") + 1));
            }
            return;
        }
        hashmap.put(CSMAKEYS.serverip.toString(), s);
    }

    public void updatePauseSeekFlag(int i)
    {
        if (_currState == 6 && i == 5 || pauseSeekSessionHappening && _currState == 5 && (i == 6 || i == 5))
        {
            pauseSeekSessionHappening = true;
            return;
        } else
        {
            pauseSeekSessionHappening = false;
            return;
        }
    }

    public void updatePluginMetricsRelatedInfo(HashMap hashmap)
    {
        if (_currentPluginMetricsSnapshot != null && _currentPluginMetricsSnapshot.total500msCount > 0)
        {
            String s = Integer.toString(_currentPluginMetricsSnapshot.total500msCount);
            hashmap.put(CSMAKEYS.playbackbitrate.toString(), (new StringBuilder(String.valueOf(Integer.toString(Math.round(_currentPluginMetricsSnapshot.playBackBitRateSum500ms))))).append(":").append(s).toString());
            hashmap.put(CSMAKEYS.totalbandwidth.toString(), (new StringBuilder(String.valueOf(Long.toString(_currentPluginMetricsSnapshot.totalBandwidthSum500ms)))).append(":").append(s).toString());
            hashmap.put(CSMAKEYS.averagefps.toString(), (new StringBuilder(String.valueOf(Float.toString(_currentPluginMetricsSnapshot.averageFpsSum500ms)))).append(":").append(s).toString());
            hashmap.put(CSMAKEYS.maxbandwidth.toString(), Long.toString(_currentPluginMetricsSnapshot.currentMaxBandwidth));
        }
    }

    public void updateStreamNameRelatedInfo(HashMap hashmap)
    {
        if (_currentPluginCallBackSnapShot == null || _currentPluginCallBackSnapShot.streamURL == null) goto _L2; else goto _L1
_L1:
        Object obj = _currentPluginCallBackSnapShot.streamURL;
        hashmap.put(CSMAKEYS.streamurl.toString(), _currentPluginCallBackSnapShot.streamURL);
        Object obj1;
        String s;
        StringBuilder stringbuilder;
        try
        {
            obj = new URI(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return;
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        hashmap.put(CSMAKEYS.hostname.toString(), ((URI) (obj)).getHost());
        obj1 = ((URI) (obj)).getPath();
        obj = ((URI) (obj)).getScheme();
        hashmap.put(CSMAKEYS.protocol.toString(), obj);
        hashmap.put(CSMAKEYS.streamname.toString(), obj1);
        hashmap.put(CSMAKEYS.eventname.toString(), obj1);
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        if (!((String) (obj1)).toLowerCase().endsWith("m3u8")) goto _L5; else goto _L6
_L6:
        hashmap.put(CSMAKEYS.format.toString(), "L");
_L9:
        s = CSMAKEYS.playerformat.toString();
        stringbuilder = new StringBuilder("Android:");
        if (!hashmap.containsKey(CSMAKEYS.format.toString())) goto _L8; else goto _L7
_L7:
        obj = (String)hashmap.get(CSMAKEYS.format.toString());
_L10:
        hashmap.put(s, stringbuilder.append(((String) (obj))).toString());
        synchronized (visitMetrics.visitLock)
        {
            obj = (new StringBuilder("|")).append(((String) (obj1))).append("|").toString();
            if (visitMetrics.visitUniqueTitlesList.indexOf(((String) (obj))) == -1)
            {
                obj1 = visitMetrics;
                obj1.visitUniqueTitlesList = (new StringBuilder(String.valueOf(((VisitMetrics) (obj1)).visitUniqueTitlesList))).append(((String) (obj))).toString();
                obj = visitMetrics;
                obj.visitUniqueTitles = ((VisitMetrics) (obj)).visitUniqueTitles + 1;
            }
        }
_L2:
        return;
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        if (!((String) (obj)).toLowerCase().startsWith("rtmp"))
        {
            break MISSING_BLOCK_LABEL_342;
        }
        hashmap.put(CSMAKEYS.format.toString(), "F");
          goto _L9
        hashmap.put(CSMAKEYS.format.toString(), "P");
          goto _L9
_L8:
        obj = "";
          goto _L10
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
          goto _L9
    }

}
