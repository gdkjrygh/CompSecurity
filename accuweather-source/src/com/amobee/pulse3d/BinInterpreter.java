// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import java.util.ArrayList;

// Referenced classes of package com.amobee.pulse3d:
//            CmdTableEntry, CmdParser, RenderFrameCommand, RenderNodesCommand, 
//            ReadPixelsCommand, CommandBindResourceP3D, CommandUnbindResourceP3D, MapAttributeCommand, 
//            CommandSetDefaultFramebufferP3D, CommandClearP3D, CommandSetClearColorP3D, CommandSetClearDepthP3D, 
//            CommandEnableP3D, CommandDisableP3D, CommandSetUniformVec4P3D, CommandSetUniformVec3P3D, 
//            CommandSetUniformVec2P3D, CommandSetUniformFloatP3D, CommandSetUniformIntP3D, CommandSetUniformMatrix4P3D, 
//            CommandSetUniformMatrix3P3D, CommandSetUniformSamplerP3D, CommandDisableVertexAttribArrayP3D, CommandSetActiveTextureP3D, 
//            ALT_ViewportCommand, CommandDepthRangef, CommandDrawElementsP3D, CommandDrawArraysP3D, 
//            CommandBlendFuncP3D, CommandBlendColorP3D, CommandDepthMaskP3D, CommandColorMaskP3D, 
//            CommandDepthFunc, CommandCullFaceP3D, CommandTexParameteriP3D, Pulse3DGLWrapper_CmdEntry, 
//            NativeCommandProcessor, NativeCommandByteCodeProcessor, GLConstantsProcessor, NoArgProcessor, 
//            OpenURLProcessor, SetSupportedOrientationProcessor, InitRendererProcessor, ConsoleLogProcessor, 
//            LoadTextureFromDataProcessor, DeclareTextureProcessor, ActivateTextureProcessor, DeclareShaderFromStringProcessor, 
//            DeclareShaderFromDataProcessor, DeclareProgramProcessor, ActivateProgramProcessor, DeclareDataFromURLProcessor, 
//            Pulse3DView, DeclareDataFromJSProcessor, DeclareBufferFromData, BufferType, 
//            ActivateBufferProcessor, DeclareRenderbufferProcessor, ActivateFramebufferProcessor, ActivateRenderbufferProcessor, 
//            AttachFramebufferTextureProcessor, AttachFramebufferRenderbufferProcessor, DeactivateResourceProcessor, ResizeBuffer2DProcessor, 
//            AppendNodeToDisplayListProcessor, ReplaceDisplayListNode, ClearDisplayListWithPriority, EnableNodeWithPriority, 
//            DisableNodeWithPriority, EnableNodesWithPriorityRange, DisableNodesWithPriorityRange, ClearAllDisplayListProcessor, 
//            StopRedraw, ResumeRedraw, ExecuteSingleGLCommandProcessor, GetGLIdFromResourceHandle, 
//            BufferView, CommandBase, BufferViewIterator, CmdParserBase

public class BinInterpreter
{
    public class BadHeader extends Exception
    {

        final BinInterpreter this$0;

        public String getMessage()
        {
            return "Buffer header is corrupted";
        }

        public BadHeader()
        {
            this$0 = BinInterpreter.this;
            super();
        }
    }

    public class BufferNotReadyException extends Exception
    {

        final BinInterpreter this$0;

        public String getMessage()
        {
            return "Buffer is not ready for reading, you can't request access to it. You can callisReady method to know the status of the buffer";
        }

        public BufferNotReadyException()
        {
            this$0 = BinInterpreter.this;
            super();
        }
    }

    static class CommandType
    {

        public static final int COMMAND_ACTIVE_TEXTURE = 34;
        public static final int COMMAND_ATTACH_SHADER = 35;
        public static final int COMMAND_BIND_ATTRIB_LOCATION = 36;
        public static final int COMMAND_BIND_BUFFER = 37;
        public static final int COMMAND_BIND_FRAMEBUFFER = 38;
        public static final int COMMAND_BIND_RENDERBUFFER = 39;
        public static final int COMMAND_BIND_TEXTURE = 40;
        public static final int COMMAND_BLEND_COLOR = 41;
        public static final int COMMAND_BLEND_EQUATION = 42;
        public static final int COMMAND_BLEND_EQUATION_SEPARATE = 43;
        public static final int COMMAND_BLEND_FUNC = 44;
        public static final int COMMAND_BLEND_FUNC_SEPARATE = 45;
        public static final int COMMAND_BUFFER_DATA = 46;
        public static final int COMMAND_BUFFER_SUB_DATA = 47;
        public static final int COMMAND_CHECK_FRAMEBUFFER_STATUS = 48;
        public static final int COMMAND_CLEAR = 49;
        public static final int COMMAND_CLEAR_COLOR = 50;
        public static final int COMMAND_CLEAR_DEPTHF = 51;
        public static final int COMMAND_CLEAR_STENCIL = 52;
        public static final int COMMAND_COLOR_MASK = 53;
        public static final int COMMAND_COMPILE_SHADER = 54;
        public static final int COMMAND_COMPRESSED_TEX_IMAGE_2_D = 55;
        public static final int COMMAND_COMPRESSED_TEX_SUB_IMAGE_2_D = 56;
        public static final int COMMAND_COPY_TEX_IMAGE_2_D = 57;
        public static final int COMMAND_COPY_TEX_SUB_IMAGE_2_D = 58;
        public static final int COMMAND_CREATE_PROGRAM = 59;
        public static final int COMMAND_CREATE_SHADER = 60;
        public static final int COMMAND_CULL_FACE = 61;
        public static final int COMMAND_DELETE_BUFFERS = 62;
        public static final int COMMAND_DELETE_FRAMEBUFFERS = 63;
        public static final int COMMAND_DELETE_PROGRAM = 64;
        public static final int COMMAND_DELETE_RENDERBUFFERS = 65;
        public static final int COMMAND_DELETE_SHADER = 66;
        public static final int COMMAND_DELETE_TEXTURES = 67;
        public static final int COMMAND_DEPTH_FUNC = 68;
        public static final int COMMAND_DEPTH_MASK = 69;
        public static final int COMMAND_DEPTH_RANGEF = 70;
        public static final int COMMAND_DETACH_SHADER = 71;
        public static final int COMMAND_DISABLE = 72;
        public static final int COMMAND_DISABLE_VERTEX_ATTRIB_ARRAY = 73;
        public static final int COMMAND_DRAW_ARRAYS = 74;
        public static final int COMMAND_DRAW_ELEMENTS = 75;
        public static final int COMMAND_ENABLE = 76;
        public static final int COMMAND_ENABLE_VERTEX_ATTRIB_ARRAY = 77;
        public static final int COMMAND_FINISH = 78;
        public static final int COMMAND_FLUSH = 79;
        public static final int COMMAND_FRAMEBUFFER_RENDERBUFFER = 80;
        public static final int COMMAND_FRAMEBUFFER_TEXTURE_2_D = 81;
        public static final int COMMAND_FRONT_FACE = 82;
        public static final int COMMAND_GENERATE_MIPMAP = 84;
        public static final int COMMAND_GEN_BUFFERS = 83;
        public static final int COMMAND_GEN_FRAMEBUFFERS = 85;
        public static final int COMMAND_GEN_RENDERBUFFERS = 86;
        public static final int COMMAND_GEN_TEXTURES = 87;
        public static final int COMMAND_GET_ACTIVE_ATTRIB = 88;
        public static final int COMMAND_GET_ACTIVE_UNIFORM = 89;
        public static final int COMMAND_GET_ATTACHED_SHADERS = 90;
        public static final int COMMAND_GET_ATTRIB_LOCATION = 91;
        public static final int COMMAND_GET_BOOLEANV = 92;
        public static final int COMMAND_GET_BUFFER_PARAMETERIV = 93;
        public static final int COMMAND_GET_ERROR = 94;
        public static final int COMMAND_GET_FLOATV = 95;
        public static final int COMMAND_GET_FRAMEBUFFER_ATTACHMENT_PARAMETERIV = 96;
        public static final int COMMAND_GET_INTEGERV = 97;
        public static final int COMMAND_GET_PROGRAMIV = 98;
        public static final int COMMAND_GET_PROGRAM_INFO_LOG = 99;
        public static final int COMMAND_GET_RENDERBUFFER_PARAMETERIV = 100;
        public static final int COMMAND_GET_SHADERIV = 101;
        public static final int COMMAND_GET_SHADER_INFO_LOG = 102;
        public static final int COMMAND_GET_SHADER_PRECISION_FORMAT = 103;
        public static final int COMMAND_GET_SHADER_SOURCE = 104;
        public static final int COMMAND_GET_STRING = 105;
        public static final int COMMAND_GET_TEX_PARAMETERFV = 106;
        public static final int COMMAND_GET_TEX_PARAMETERIV = 107;
        public static final int COMMAND_GET_UNIFORMFV = 108;
        public static final int COMMAND_GET_UNIFORMIV = 109;
        public static final int COMMAND_GET_UNIFORM_LOCATION = 110;
        public static final int COMMAND_GET_VERTEX_ATTRIBFV = 111;
        public static final int COMMAND_GET_VERTEX_ATTRIBIV = 112;
        public static final int COMMAND_HINT = 113;
        public static final int COMMAND_IS_BUFFER = 114;
        public static final int COMMAND_IS_ENABLED = 115;
        public static final int COMMAND_IS_FRAMEBUFFER = 116;
        public static final int COMMAND_IS_PROGRAM = 117;
        public static final int COMMAND_IS_RENDERBUFFER = 118;
        public static final int COMMAND_IS_SHADER = 119;
        public static final int COMMAND_IS_TEXTURE = 120;
        public static final int COMMAND_LINE_WIDTH = 121;
        public static final int COMMAND_LINK_PROGRAM = 122;
        public static final int COMMAND_PIXEL_STOREI = 123;
        public static final int COMMAND_POLYGON_OFFSET = 124;
        public static final int COMMAND_READ_PIXELS = 1;
        public static final int COMMAND_RELEASE_SHADER_COMPILER = 125;
        public static final int COMMAND_RENDERBUFFER_STORAGE = 126;
        public static final int COMMAND_RENDER_FRAME = 2;
        public static final int COMMAND_RENDER_NODES = 3;
        public static final int COMMAND_SAMPLE_COVERAGE = 127;
        public static final int COMMAND_SCISSOR = 128;
        public static final int COMMAND_SHADER_BINARY = 129;
        public static final int COMMAND_STENCIL_FUNC = 130;
        public static final int COMMAND_STENCIL_FUNC_SEPARATE = 131;
        public static final int COMMAND_STENCIL_MASK = 132;
        public static final int COMMAND_STENCIL_MASK_SEPARATE = 133;
        public static final int COMMAND_STENCIL_OP = 134;
        public static final int COMMAND_STENCIL_OP_SEPARATE = 135;
        public static final int COMMAND_TEX_IMAGE_2_D = 136;
        public static final int COMMAND_TEX_PARAMETERF = 137;
        public static final int COMMAND_TEX_PARAMETERFV = 138;
        public static final int COMMAND_TEX_PARAMETERI = 139;
        public static final int COMMAND_TEX_PARAMETERIV = 140;
        public static final int COMMAND_TEX_SUB_IMAGE_2_D = 141;
        public static final int COMMAND_UNIFORM_1F = 142;
        public static final int COMMAND_UNIFORM_1FV = 143;
        public static final int COMMAND_UNIFORM_1I = 144;
        public static final int COMMAND_UNIFORM_1IV = 145;
        public static final int COMMAND_UNIFORM_2F = 146;
        public static final int COMMAND_UNIFORM_2FV = 147;
        public static final int COMMAND_UNIFORM_2I = 148;
        public static final int COMMAND_UNIFORM_2IV = 149;
        public static final int COMMAND_UNIFORM_3F = 150;
        public static final int COMMAND_UNIFORM_3FV = 151;
        public static final int COMMAND_UNIFORM_3I = 152;
        public static final int COMMAND_UNIFORM_3IV = 153;
        public static final int COMMAND_UNIFORM_4F = 154;
        public static final int COMMAND_UNIFORM_4FV = 155;
        public static final int COMMAND_UNIFORM_4I = 156;
        public static final int COMMAND_UNIFORM_4IV = 157;
        public static final int COMMAND_UNIFORM_MATRIX_2FV = 158;
        public static final int COMMAND_UNIFORM_MATRIX_3FV = 159;
        public static final int COMMAND_UNIFORM_MATRIX_4FV = 160;
        public static final int COMMAND_USE_PROGRAM = 161;
        public static final int COMMAND_VALIDATE_PROGRAM = 162;
        public static final int COMMAND_VERTEX_ATTRIB_1F = 163;
        public static final int COMMAND_VERTEX_ATTRIB_1FV = 164;
        public static final int COMMAND_VERTEX_ATTRIB_2F = 165;
        public static final int COMMAND_VERTEX_ATTRIB_2FV = 166;
        public static final int COMMAND_VERTEX_ATTRIB_3F = 167;
        public static final int COMMAND_VERTEX_ATTRIB_3FV = 168;
        public static final int COMMAND_VERTEX_ATTRIB_4F = 169;
        public static final int COMMAND_VERTEX_ATTRIB_4FV = 170;
        public static final int COMMAND_VERTEX_ATTRIB_POINTER = 171;
        public static final int COMMAND_VIEWPORT = 172;
        public static final int INVALID_COMMAND = 0;
        public static final int NUM_COMMAND_TYPES = 174;
        public static final int OLD_COMMAND_BIND_RESOURCE = 4;
        public static final int OLD_COMMAND_BLEND_COLOR = 28;
        public static final int OLD_COMMAND_BLEND_FUNC = 27;
        public static final int OLD_COMMAND_CLEAR = 8;
        public static final int OLD_COMMAND_COLOR_MASK = 30;
        public static final int OLD_COMMAND_CULL_FACE = 32;
        public static final int OLD_COMMAND_DEPTH_FUNC = 31;
        public static final int OLD_COMMAND_DEPTH_MASK = 29;
        public static final int OLD_COMMAND_DEPTH_RANGE = 24;
        public static final int OLD_COMMAND_DISABLE = 12;
        public static final int OLD_COMMAND_DISABLE_VERTEX_ATTRIB_ARRAY_COMMAND = 22;
        public static final int OLD_COMMAND_DRAW_ARRAYS = 26;
        public static final int OLD_COMMAND_DRAW_ELEMENTS = 25;
        public static final int OLD_COMMAND_ENABLE = 11;
        public static final int OLD_COMMAND_MAP_ATTRIBUTE = 6;
        public static final int OLD_COMMAND_SET_ACTIVE_TEXTURE = 21;
        public static final int OLD_COMMAND_SET_CLEAR_COLOR = 9;
        public static final int OLD_COMMAND_SET_CLEAR_DEPTH = 10;
        public static final int OLD_COMMAND_SET_DEFAULT_FRAMEBUFFER = 7;
        public static final int OLD_COMMAND_SET_UNIFORM_FLOAT = 16;
        public static final int OLD_COMMAND_SET_UNIFORM_INT = 17;
        public static final int OLD_COMMAND_SET_UNIFORM_MATRIX3 = 19;
        public static final int OLD_COMMAND_SET_UNIFORM_MATRIX4 = 18;
        public static final int OLD_COMMAND_SET_UNIFORM_SAMPLER = 20;
        public static final int OLD_COMMAND_SET_UNIFORM_VEC2 = 15;
        public static final int OLD_COMMAND_SET_UNIFORM_VEC3 = 14;
        public static final int OLD_COMMAND_SET_UNIFORM_VEC4 = 13;
        public static final int OLD_COMMAND_SET_VIEWPORT = 23;
        public static final int OLD_COMMAND_TEX_PARAMETERI = 33;
        public static final int OLD_COMMAND_UNBIND_RESOURCE = 5;

        CommandType()
        {
        }
    }


    private static int HEADER_SIZE;
    private static int MAX_BODY_SIZE;
    private static int MAX_PACKET_SIZE;
    private byte buffer[];
    private int bufferIndex;
    private boolean bufferReady;
    private BufferView bufferView;
    ArrayList clears_;
    CmdTableEntry cmdTable_[];
    NativeCommandProcessor commandProcessors_[];
    ArrayList commands_;
    private int totalPacketLength;
    Pulse3DView viewController_;

    BinInterpreter(Pulse3DView pulse3dview)
    {
        buffer = null;
        bufferView = null;
        bufferReady = true;
        bufferIndex = 0;
        totalPacketLength = 0;
        commands_ = new ArrayList();
        clears_ = new ArrayList();
        viewController_ = pulse3dview;
        cmdTable_ = new CmdTableEntry[174];
        cmdTable_[2] = new CmdTableEntry(2, "adkRenderFrame", new CmdParser(RenderFrameCommand.argTypes, new RenderFrameCommand()));
        cmdTable_[3] = new CmdTableEntry(3, "adkRenderNodes", new CmdParser(RenderNodesCommand.argTypes, new RenderNodesCommand()));
        cmdTable_[1] = new CmdTableEntry(1, "glReadPixels", new CmdParser(ReadPixelsCommand.argTypes, new ReadPixelsCommand()));
        cmdTable_[4] = new CmdTableEntry(4, "bind_resource", new CmdParser(CommandBindResourceP3D.argTypes, new CommandBindResourceP3D()));
        cmdTable_[5] = new CmdTableEntry(5, "unbind_resource", new CmdParser(CommandUnbindResourceP3D.argTypes, new CommandUnbindResourceP3D()));
        cmdTable_[6] = new CmdTableEntry(6, "map_attrib", new CmdParser(MapAttributeCommand.argTypes, new MapAttributeCommand()));
        cmdTable_[7] = new CmdTableEntry(7, "set_default_framebuffer", new CmdParser(CommandSetDefaultFramebufferP3D.argTypes, new CommandSetDefaultFramebufferP3D()));
        cmdTable_[8] = new CmdTableEntry(8, "clear", new CmdParser(CommandClearP3D.argTypes, new CommandClearP3D()));
        cmdTable_[9] = new CmdTableEntry(9, "set_clear_color", new CmdParser(CommandSetClearColorP3D.argTypes, new CommandSetClearColorP3D()));
        cmdTable_[10] = new CmdTableEntry(10, "set_clear_depth", new CmdParser(CommandSetClearDepthP3D.argTypes, new CommandSetClearDepthP3D()));
        cmdTable_[11] = new CmdTableEntry(11, "enable", new CmdParser(CommandEnableP3D.argTypes, new CommandEnableP3D()));
        cmdTable_[12] = new CmdTableEntry(12, "disable", new CmdParser(CommandDisableP3D.argTypes, new CommandDisableP3D()));
        cmdTable_[13] = new CmdTableEntry(13, "set_uniform_vec4", new CmdParser(CommandSetUniformVec4P3D.argTypes, new CommandSetUniformVec4P3D()));
        cmdTable_[14] = new CmdTableEntry(14, "set_uniform_vec3", new CmdParser(CommandSetUniformVec3P3D.argTypes, new CommandSetUniformVec3P3D()));
        cmdTable_[15] = new CmdTableEntry(15, "set_uniform_vec2", new CmdParser(CommandSetUniformVec2P3D.argTypes, new CommandSetUniformVec2P3D()));
        cmdTable_[16] = new CmdTableEntry(16, "set_uniform_float", new CmdParser(CommandSetUniformFloatP3D.argTypes, new CommandSetUniformFloatP3D()));
        cmdTable_[17] = new CmdTableEntry(17, "set_uniform_int", new CmdParser(CommandSetUniformIntP3D.argTypes, new CommandSetUniformIntP3D()));
        cmdTable_[18] = new CmdTableEntry(18, "set_uniform_mat4", new CmdParser(CommandSetUniformMatrix4P3D.argTypes, new CommandSetUniformMatrix4P3D()));
        cmdTable_[19] = new CmdTableEntry(19, "set_uniform_mat3", new CmdParser(CommandSetUniformMatrix3P3D.argTypes, new CommandSetUniformMatrix3P3D()));
        cmdTable_[20] = new CmdTableEntry(20, "set_uniform_sampler", new CmdParser(CommandSetUniformSamplerP3D.argTypes, new CommandSetUniformSamplerP3D()));
        cmdTable_[22] = new CmdTableEntry(22, "disable_vertex_attrib_array", new CmdParser(CommandDisableVertexAttribArrayP3D.argTypes, new CommandDisableVertexAttribArrayP3D()));
        cmdTable_[21] = new CmdTableEntry(21, "set_active_texture", new CmdParser(CommandSetActiveTextureP3D.argTypes, new CommandSetActiveTextureP3D()));
        cmdTable_[23] = new CmdTableEntry(23, "set_viewport", new CmdParser(ALT_ViewportCommand.argTypes, new ALT_ViewportCommand()));
        cmdTable_[24] = new CmdTableEntry(24, "depth_range", new CmdParser(CommandDepthRangef.argTypes, new CommandDepthRangef()));
        cmdTable_[25] = new CmdTableEntry(25, "draw_elements", new CmdParser(CommandDrawElementsP3D.argTypes, new CommandDrawElementsP3D()));
        cmdTable_[75] = new CmdTableEntry(75, "glDrawElements", new CmdParser(CommandDrawElementsP3D.argTypes, new CommandDrawElementsP3D()));
        cmdTable_[26] = new CmdTableEntry(26, "draw_arrays", new CmdParser(CommandDrawArraysP3D.argTypes, new CommandDrawArraysP3D()));
        cmdTable_[27] = new CmdTableEntry(27, "blend_func", new CmdParser(CommandBlendFuncP3D.argTypes, new CommandBlendFuncP3D()));
        cmdTable_[28] = new CmdTableEntry(28, "blend_color", new CmdParser(CommandBlendColorP3D.argTypes, new CommandBlendColorP3D()));
        cmdTable_[29] = new CmdTableEntry(29, "depth_mask", new CmdParser(CommandDepthMaskP3D.argTypes, new CommandDepthMaskP3D()));
        cmdTable_[30] = new CmdTableEntry(30, "color_mask", new CmdParser(CommandColorMaskP3D.argTypes, new CommandColorMaskP3D()));
        cmdTable_[31] = new CmdTableEntry(31, "depth_func", new CmdParser(CommandDepthFunc.argTypes, new CommandDepthFunc()));
        cmdTable_[32] = new CmdTableEntry(32, "cull_face", new CmdParser(CommandCullFaceP3D.argTypes, new CommandCullFaceP3D()));
        cmdTable_[33] = new CmdTableEntry(33, "tex_parameteri", new CmdParser(CommandTexParameteriP3D.argTypes, new CommandTexParameteriP3D()));
        Pulse3DGLWrapper_CmdEntry.fillEntry(cmdTable_);
        commandProcessors_ = new NativeCommandProcessor[174];
        commandProcessors_[1] = new NativeCommandByteCodeProcessor(pulse3dview, cmdTable_);
        commandProcessors_[2] = new GLConstantsProcessor(pulse3dview);
        commandProcessors_[3] = new NoArgProcessor(pulse3dview, 0);
        commandProcessors_[5] = new OpenURLProcessor(pulse3dview, true);
        commandProcessors_[6] = new OpenURLProcessor(pulse3dview, false);
        commandProcessors_[7] = null;
        commandProcessors_[8] = new SetSupportedOrientationProcessor(viewController_);
        commandProcessors_[9] = new InitRendererProcessor(viewController_);
        commandProcessors_[10] = new ConsoleLogProcessor(viewController_, false);
        commandProcessors_[11] = new NoArgProcessor(viewController_, 5);
        commandProcessors_[4] = new NoArgProcessor(viewController_, 1);
        commandProcessors_[12] = new ConsoleLogProcessor(viewController_, true);
        commandProcessors_[13] = new NoArgProcessor(viewController_, 2);
        commandProcessors_[14] = new LoadTextureFromDataProcessor(viewController_);
        commandProcessors_[15] = new DeclareTextureProcessor(viewController_);
        commandProcessors_[16] = new ActivateTextureProcessor(viewController_);
        commandProcessors_[17] = new DeclareShaderFromStringProcessor(viewController_);
        commandProcessors_[18] = new DeclareShaderFromDataProcessor(viewController_);
        commandProcessors_[19] = new DeclareShaderFromStringProcessor(viewController_);
        commandProcessors_[20] = new DeclareShaderFromDataProcessor(viewController_);
        commandProcessors_[21] = new DeclareProgramProcessor(viewController_);
        commandProcessors_[22] = new ActivateProgramProcessor(viewController_);
        commandProcessors_[23] = new DeclareDataFromURLProcessor(viewController_, viewController_.getContext());
        commandProcessors_[24] = new DeclareDataFromJSProcessor(viewController_);
        commandProcessors_[25] = new DeclareBufferFromData(viewController_, BufferType.VERTEX_BUFFER);
        commandProcessors_[26] = new DeclareBufferFromData(viewController_, BufferType.INDEX_BUFFER);
        commandProcessors_[27] = new ActivateBufferProcessor(viewController_);
        commandProcessors_[28] = new DeclareRenderbufferProcessor(viewController_);
        commandProcessors_[29] = new NoArgProcessor(viewController_, 3);
        commandProcessors_[30] = new ActivateFramebufferProcessor(viewController_);
        commandProcessors_[31] = new ActivateRenderbufferProcessor(viewController_);
        commandProcessors_[32] = new AttachFramebufferTextureProcessor(viewController_);
        commandProcessors_[33] = new AttachFramebufferRenderbufferProcessor(viewController_);
        commandProcessors_[34] = new DeactivateResourceProcessor(viewController_);
        commandProcessors_[35] = new ResizeBuffer2DProcessor(viewController_);
        commandProcessors_[36] = new NoArgProcessor(viewController_, 4);
        commandProcessors_[37] = new AppendNodeToDisplayListProcessor(viewController_, this);
        commandProcessors_[38] = new ReplaceDisplayListNode(viewController_, this);
        commandProcessors_[39] = new ClearDisplayListWithPriority(this);
        commandProcessors_[41] = new EnableNodeWithPriority(viewController_);
        commandProcessors_[42] = new DisableNodeWithPriority(viewController_);
        commandProcessors_[47] = new EnableNodesWithPriorityRange(viewController_);
        commandProcessors_[48] = new DisableNodesWithPriorityRange(viewController_);
        commandProcessors_[40] = new ClearAllDisplayListProcessor(this);
        commandProcessors_[43] = new StopRedraw(viewController_);
        commandProcessors_[44] = new ResumeRedraw(viewController_);
        commandProcessors_[45] = new ExecuteSingleGLCommandProcessor(viewController_, this);
        commandProcessors_[46] = new GetGLIdFromResourceHandle(viewController_);
    }

    private int parseHeader(byte abyte0[])
        throws BadHeader
    {
        boolean flag = true;
        bufferReady = false;
        String s = (new StringBuilder()).append("").append((char)abyte0[0]).toString();
        s = (new StringBuilder()).append(s).append((char)abyte0[1]).toString();
        s = (new StringBuilder()).append(s).append((char)abyte0[2]).toString();
        if (!(new StringBuilder()).append(s).append((char)abyte0[3]).toString().equals("bin:"))
        {
            throw new BadHeader();
        }
        if ((abyte0[8] & 0xff | (abyte0[9] & 0xff) << 8 | (abyte0[10] & 0xff) << 16 | (abyte0[11] & 0xff) << 24) != 0)
        {
            flag = false;
        }
        bufferReady = flag;
        return abyte0[12] & 0xff | (abyte0[13] & 0xff) << 8 | (abyte0[14] & 0xff) << 16 | (abyte0[15] & 0xff) << 24;
    }

    public void addBuffer(byte abyte0[])
        throws BadHeader
    {
        if (buffer != null) goto _L2; else goto _L1
_L1:
        buffer = new byte[MAX_PACKET_SIZE];
        bufferIndex = 0;
        totalPacketLength = 0;
_L4:
        int l = parseHeader(abyte0);
        totalPacketLength = totalPacketLength + l;
        int i1 = HEADER_SIZE;
        int k = HEADER_SIZE;
        for (int i = bufferIndex; k < l + i1; i++)
        {
            buffer[i] = abyte0[k];
            bufferIndex = bufferIndex + 1;
            k++;
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (buffer.length - bufferIndex < MAX_BODY_SIZE)
        {
            byte abyte1[] = buffer;
            buffer = new byte[abyte1.length + MAX_PACKET_SIZE];
            int j = 0;
            while (j < bufferIndex) 
            {
                buffer[j] = abyte1[j];
                j++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (bufferReady)
        {
            bufferView = new BufferView(buffer);
        }
        return;
    }

    public boolean bufferReady()
    {
        return bufferReady;
    }

    public void clear()
    {
        bufferReady = true;
        buffer = null;
        bufferIndex = 0;
        totalPacketLength = 0;
    }

    public byte[] getBuffer()
        throws BufferNotReadyException
    {
        if (!bufferReady)
        {
            throw new BufferNotReadyException();
        } else
        {
            return buffer;
        }
    }

    public BufferView getBufferView()
        throws BufferNotReadyException
    {
        if (!bufferReady)
        {
            throw new BufferNotReadyException();
        } else
        {
            return bufferView;
        }
    }

    public int getTotalPacketLength()
    {
        return totalPacketLength;
    }

    public void processDisplayCommands(BufferViewIterator bufferviewiterator, int i)
        throws IllegalAccessException, InstantiationException
    {
        commands_ = new ArrayList();
        CommandBase acommandbase[] = new CommandBase[1];
        for (int j = 0; j < i; j++)
        {
            processSingleCommand(bufferviewiterator, acommandbase);
            commands_.add(acommandbase[0]);
        }

    }

    public void processSingleCommand(BufferViewIterator bufferviewiterator, CommandBase acommandbase[])
        throws IllegalAccessException, InstantiationException
    {
        int i = bufferviewiterator.parseInt();
        acommandbase[0] = cmdTable_[i].cmdClass.parse(bufferviewiterator, viewController_);
    }

    static 
    {
        HEADER_SIZE = 16;
        MAX_PACKET_SIZE = 8192;
        MAX_BODY_SIZE = MAX_PACKET_SIZE - HEADER_SIZE;
    }
}
