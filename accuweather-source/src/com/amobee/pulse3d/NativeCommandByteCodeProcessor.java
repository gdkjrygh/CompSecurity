// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            NativeCommandProcessor, Pulse3DView, Pulse3DWebView, CmdTableEntry, 
//            BufferViewIterator

class NativeCommandByteCodeProcessor extends NativeCommandProcessor
{

    CmdTableEntry displayListTable_[];
    Pulse3DView pulse3DView;

    public NativeCommandByteCodeProcessor(Pulse3DView pulse3dview, CmdTableEntry acmdtableentry[])
    {
        pulse3DView = pulse3dview;
        displayListTable_ = acmdtableentry;
    }

    void execute()
    {
        String s = generateResponse();
        pulse3DView.mPulse3dWebView.injectJS((new StringBuilder()).append("AdKitNative.nativeCommandByteCodes(").append(s).append(")").toString());
    }

    String generateResponse()
    {
        String s = (new StringBuilder()).append("").append("{REQUEST_GL_CONST_VALUES:").append(Integer.toString(2)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("toggleBanner:").append(Integer.toString(3)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("systemOpenURL:").append(Integer.toString(5)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("openURL:").append(Integer.toString(6)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("setPanelConfiguration:").append(Integer.toString(7)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("setSupportedOrientations:").append(Integer.toString(8)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("initRenderer:").append(Integer.toString(9)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("consoleLog:").append(Integer.toString(10)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("commitDisplayListChanges:").append(Integer.toString(11)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("readyToDisplay:").append(Integer.toString(4)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("reportLoadingFailure:").append(Integer.toString(12)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("ensureRender:").append(Integer.toString(13)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("loadTextureFromData:").append(Integer.toString(14)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareTexture:").append(Integer.toString(15)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("activateTexture:").append(Integer.toString(16)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareVertexShaderFromString:").append(Integer.toString(17)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareVertexShaderFromData:").append(Integer.toString(18)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareFragmentShaderFromString:").append(Integer.toString(19)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareFragmentShaderFromData:").append(Integer.toString(20)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareProgram:").append(Integer.toString(21)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("activateProgram:").append(Integer.toString(22)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareDataFromURL:").append(Integer.toString(23)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareDataFromJS:").append(Integer.toString(24)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareVBFromData:").append(Integer.toString(25)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareIBFromData:").append(Integer.toString(26)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("activateBuffer:").append(Integer.toString(27)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareRenderbuffer:").append(Integer.toString(28)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("declareFramebuffer:").append(Integer.toString(29)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("activateFramebuffer:").append(Integer.toString(30)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("activateRenderbuffer:").append(Integer.toString(31)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("attachFramebufferTexture:").append(Integer.toString(32)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("attachFramebufferRenderbuffer:").append(Integer.toString(33)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("deactivateResource:").append(Integer.toString(34)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("resizeBuffer2D:").append(Integer.toString(35)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("fence:").append(Integer.toString(36)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("appendNodeToDisplayList:").append(Integer.toString(37)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("replaceDisplayListNode:").append(Integer.toString(38)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("clearDisplayListWithPriority:").append(Integer.toString(39)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("clearAllDisplayLists:").append(Integer.toString(40)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("disableNodeWithPriority:").append(Integer.toString(42)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("enableNodeWithPriority:").append(Integer.toString(41)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("disableNodesWithPriorityRange:").append(Integer.toString(48)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("enableNodesWithPriorityRange:").append(Integer.toString(47)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("stopRedraw:").append(Integer.toString(43)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("resumeRedraw:").append(Integer.toString(44)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("executeSingleGLCommand:").append(Integer.toString(45)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("getGLIDFromResourceHandle:").append(Integer.toString(46)).toString();
        for (int i = 0; i < 174;)
        {
            String s1 = s;
            if (displayListTable_[i] != null)
            {
                s = (new StringBuilder()).append(s).append(",").toString();
                s = (new StringBuilder()).append(s).append(displayListTable_[i].name).toString();
                s = (new StringBuilder()).append(s).append(":").toString();
                s1 = (new StringBuilder()).append(s).append(Integer.toString(i)).toString();
            }
            i++;
            s = s1;
        }

        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGBA8888:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(0)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGB888:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(1)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGB565:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(2)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("A8:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(3)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("I8:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(4)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("AI88:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(5)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGBA4444:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(6)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGBA5551:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(7)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("PVRTC4:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(8)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("PVRTC2:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(9)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGBA16F:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(10)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGBA32F:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(11)).toString();
        s = (new StringBuilder()).append(s).append(",").toString();
        s = (new StringBuilder()).append(s).append("RGBA8888:").toString();
        s = (new StringBuilder()).append(s).append(Integer.toString(0)).toString();
        return (new StringBuilder()).append(s).append("}").toString();
    }

    void parse(BufferViewIterator bufferviewiterator)
    {
    }
}
