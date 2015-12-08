// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.util.Log;

// Referenced classes of package com.amobee.pulse3d:
//            Pulse3DJavaScriptInterface, Pulse3DGLRenderer, Pulse3DView

abstract class CommandBase
{

    static String TAG = "CommandBase";
    public String command_name;
    Pulse3DJavaScriptInterface jsInterface;
    public String node_name;
    Pulse3DGLRenderer renderer;

    CommandBase()
    {
    }

    static void missingArg(String s, String s1)
    {
        Log.e(TAG, (new StringBuilder()).append("Missing ").append(s1).append(" in ").append(s).toString());
    }

    static void notImplementedArgs(String s)
    {
        Log.e(TAG, (new StringBuilder()).append("Not implemented args on ").append(s).toString());
    }

    abstract void execute();

    abstract void initArgs(CmdParserBase.GlArg aglarg[], Pulse3DView pulse3dview);

    String stringifyResult()
    {
        return "";
    }

}
