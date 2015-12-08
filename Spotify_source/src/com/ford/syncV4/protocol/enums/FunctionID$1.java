// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.protocol.enums;

import atb;
import java.util.HashMap;

public final class put extends HashMap
{

    public ()
    {
        super(60);
        put("RegisterAppInterface", Integer.valueOf(1));
        put("UnregisterAppInterface", Integer.valueOf(2));
        put("SetGlobalProperties", Integer.valueOf(3));
        put("ResetGlobalProperties", Integer.valueOf(4));
        put("AddCommand", Integer.valueOf(5));
        put("DeleteCommand", Integer.valueOf(6));
        put("AddSubMenu", Integer.valueOf(7));
        put("DeleteSubMenu", Integer.valueOf(8));
        put("CreateInteractionChoiceSet", Integer.valueOf(9));
        put("PerformInteraction", Integer.valueOf(10));
        put("DeleteInteractionChoiceSet", Integer.valueOf(11));
        put("Alert", Integer.valueOf(12));
        put("Show", Integer.valueOf(13));
        put("Speak", Integer.valueOf(14));
        put("SetMediaClockTimer", Integer.valueOf(15));
        put("PerformAudioPassThru", Integer.valueOf(16));
        put("EndAudioPassThru", Integer.valueOf(17));
        put("SubscribeButton", Integer.valueOf(18));
        put("UnsubscribeButton", Integer.valueOf(19));
        put("SubscribeVehicleData", Integer.valueOf(20));
        put("UnsubscribeVehicleData", Integer.valueOf(21));
        put("GetVehicleData", Integer.valueOf(22));
        put("ReadDID", Integer.valueOf(23));
        put("GetDTCs", Integer.valueOf(24));
        put("ScrollableMessage", Integer.valueOf(25));
        put("Slider", Integer.valueOf(26));
        put("ShowConstantTBT", Integer.valueOf(27));
        put("AlertManeuver", Integer.valueOf(28));
        put("UpdateTurnList", Integer.valueOf(29));
        put("ChangeRegistration", Integer.valueOf(30));
        put("GenericResponse", Integer.valueOf(31));
        put("PutFile", Integer.valueOf(32));
        put("DeleteFile", Integer.valueOf(33));
        put("ListFiles", Integer.valueOf(34));
        put("SetAppIcon", Integer.valueOf(35));
        put("SetDisplayLayout", Integer.valueOf(36));
        put("DiagnosticMessage", Integer.valueOf(37));
        put("SystemRequest", Integer.valueOf(38));
        put("OnHMIStatus", Integer.valueOf(32768));
        put("OnAppInterfaceUnregistered", Integer.valueOf(32769));
        put("OnButtonEvent", Integer.valueOf(32770));
        put("OnButtonPress", Integer.valueOf(32771));
        put("OnVehicleData", Integer.valueOf(32772));
        put("OnCommand", Integer.valueOf(32773));
        put("OnTBTClientState", Integer.valueOf(32774));
        put("OnDriverDistraction", Integer.valueOf(32775));
        put("OnPermissionsChange", Integer.valueOf(32776));
        put("OnAudioPassThru", Integer.valueOf(32777));
        put("OnLanguageChange", Integer.valueOf(32778));
        put("OnSystemRequest", Integer.valueOf(32781));
        put("OnHashChange", Integer.valueOf(32782));
        put("EncodedSyncPData", Integer.valueOf(0x10000));
        put("SyncPData", Integer.valueOf(0x10001));
        put("OnEncodedSyncPData", Integer.valueOf(0x18000));
        put("OnSyncPData", Integer.valueOf(0x18001));
        put("OnKeyboardInput", Integer.valueOf(32779));
        put("OnTouchEvent", Integer.valueOf(32780));
    }
}
