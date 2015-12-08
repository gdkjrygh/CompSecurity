// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            CmdParserBase, CommandBase, BufferViewIterator, Pulse3DView

class CmdParser extends CmdParserBase
{

    int argTypes_[];
    CommandBase commandPrototype_;

    CmdParser(int ai[], CommandBase commandbase)
    {
        argTypes_ = ai;
        commandPrototype_ = commandbase;
    }

    public CommandBase parse(BufferViewIterator bufferviewiterator, Pulse3DView pulse3dview)
        throws InstantiationException, IllegalAccessException
    {
        CommandBase commandbase = (CommandBase)commandPrototype_.getClass().newInstance();
        CmdParserBase.GlArg aglarg[] = new CmdParserBase.GlArg[argTypes_.length];
        parseArgs(bufferviewiterator, argTypes_, aglarg);
        commandbase.initArgs(aglarg, pulse3dview);
        return commandbase;
    }
}
