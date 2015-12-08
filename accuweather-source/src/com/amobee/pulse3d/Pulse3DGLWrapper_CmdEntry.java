// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            CmdTableEntry, CmdParser, CommandActiveTexture, CommandAttachShader, 
//            CommandBindAttribLocation, CommandBindBuffer, CommandBindFramebuffer, CommandBindRenderbuffer, 
//            CommandBindTexture, CommandBlendColor, CommandBlendEquation, CommandBlendEquationSeparate, 
//            CommandBlendFunc, CommandBlendFuncSeparate, CommandBufferData, CommandBufferSubData, 
//            CommandCheckFramebufferStatus, CommandClear, CommandClearColor, CommandClearDepthf, 
//            CommandClearStencil, CommandColorMask, CommandCompileShader, CommandCompressedTexImage2D, 
//            CommandCompressedTexSubImage2D, CommandCopyTexImage2D, CommandCopyTexSubImage2D, CommandCreateProgram, 
//            CommandCreateShader, CommandCullFace, CommandDeleteBuffers, CommandDeleteFramebuffers, 
//            CommandDeleteProgram, CommandDeleteRenderbuffers, CommandDeleteShader, CommandDeleteTextures, 
//            CommandDepthFunc, CommandDepthMask, CommandDepthRangef, CommandDetachShader, 
//            CommandDisable, CommandDisableVertexAttribArray, CommandDrawArrays, CommandEnable, 
//            CommandEnableVertexAttribArray, CommandFinish, CommandFlush, CommandFramebufferRenderbuffer, 
//            CommandFramebufferTexture2D, CommandFrontFace, CommandGenBuffers, CommandGenerateMipmap, 
//            CommandGenFramebuffers, CommandGenRenderbuffers, CommandGenTextures, CommandGetAttachedShaders, 
//            CommandGetAttribLocation, CommandGetBooleanv, CommandGetBufferParameteriv, CommandGetError, 
//            CommandGetFloatv, CommandGetFramebufferAttachmentParameteriv, CommandGetIntegerv, CommandGetProgramiv, 
//            CommandGetRenderbufferParameteriv, CommandGetShaderiv, CommandGetShaderPrecisionFormat, CommandGetString, 
//            CommandGetTexParameterfv, CommandGetTexParameteriv, CommandGetUniformfv, CommandGetUniformiv, 
//            CommandGetUniformLocation, CommandGetVertexAttribfv, CommandGetVertexAttribiv, CommandHint, 
//            CommandIsBuffer, CommandIsEnabled, CommandIsFramebuffer, CommandIsProgram, 
//            CommandIsRenderbuffer, CommandIsShader, CommandIsTexture, CommandLineWidth, 
//            CommandLinkProgram, CommandPixelStorei, CommandPolygonOffset, CommandReleaseShaderCompiler, 
//            CommandRenderbufferStorage, CommandSampleCoverage, CommandScissor, CommandShaderBinary, 
//            CommandStencilFunc, CommandStencilFuncSeparate, CommandStencilMask, CommandStencilMaskSeparate, 
//            CommandStencilOp, CommandStencilOpSeparate, CommandTexImage2D, CommandTexParameterf, 
//            CommandTexParameterfv, CommandTexParameteri, CommandTexParameteriv, CommandTexSubImage2D, 
//            CommandUniform1f, CommandUniform1fv, CommandUniform1i, CommandUniform1iv, 
//            CommandUniform2f, CommandUniform2fv, CommandUniform2i, CommandUniform2iv, 
//            CommandUniform3f, CommandUniform3fv, CommandUniform3i, CommandUniform3iv, 
//            CommandUniform4f, CommandUniform4fv, CommandUniform4i, CommandUniform4iv, 
//            CommandUniformMatrix2fv, CommandUniformMatrix3fv, CommandUniformMatrix4fv, CommandUseProgram, 
//            CommandValidateProgram, CommandVertexAttrib1f, CommandVertexAttrib1fv, CommandVertexAttrib2f, 
//            CommandVertexAttrib2fv, CommandVertexAttrib3f, CommandVertexAttrib3fv, CommandVertexAttrib4f, 
//            CommandVertexAttrib4fv, CommandVertexAttribPointer, CommandViewport

public class Pulse3DGLWrapper_CmdEntry
{

    public Pulse3DGLWrapper_CmdEntry()
    {
    }

    public static void fillEntry(CmdTableEntry acmdtableentry[])
    {
        acmdtableentry[34] = new CmdTableEntry(34, "glActiveTexture", new CmdParser(CommandActiveTexture.argTypes, new CommandActiveTexture()));
        acmdtableentry[35] = new CmdTableEntry(35, "glAttachShader", new CmdParser(CommandAttachShader.argTypes, new CommandAttachShader()));
        acmdtableentry[36] = new CmdTableEntry(36, "glBindAttribLocation", new CmdParser(CommandBindAttribLocation.argTypes, new CommandBindAttribLocation()));
        acmdtableentry[37] = new CmdTableEntry(37, "glBindBuffer", new CmdParser(CommandBindBuffer.argTypes, new CommandBindBuffer()));
        acmdtableentry[38] = new CmdTableEntry(38, "glBindFramebuffer", new CmdParser(CommandBindFramebuffer.argTypes, new CommandBindFramebuffer()));
        acmdtableentry[39] = new CmdTableEntry(39, "glBindRenderbuffer", new CmdParser(CommandBindRenderbuffer.argTypes, new CommandBindRenderbuffer()));
        acmdtableentry[40] = new CmdTableEntry(40, "glBindTexture", new CmdParser(CommandBindTexture.argTypes, new CommandBindTexture()));
        acmdtableentry[41] = new CmdTableEntry(41, "glBlendColor", new CmdParser(CommandBlendColor.argTypes, new CommandBlendColor()));
        acmdtableentry[42] = new CmdTableEntry(42, "glBlendEquation", new CmdParser(CommandBlendEquation.argTypes, new CommandBlendEquation()));
        acmdtableentry[43] = new CmdTableEntry(43, "glBlendEquationSeparate", new CmdParser(CommandBlendEquationSeparate.argTypes, new CommandBlendEquationSeparate()));
        acmdtableentry[44] = new CmdTableEntry(44, "glBlendFunc", new CmdParser(CommandBlendFunc.argTypes, new CommandBlendFunc()));
        acmdtableentry[45] = new CmdTableEntry(45, "glBlendFuncSeparate", new CmdParser(CommandBlendFuncSeparate.argTypes, new CommandBlendFuncSeparate()));
        acmdtableentry[46] = new CmdTableEntry(46, "glBufferData", new CmdParser(CommandBufferData.argTypes, new CommandBufferData()));
        acmdtableentry[47] = new CmdTableEntry(47, "glBufferSubData", new CmdParser(CommandBufferSubData.argTypes, new CommandBufferSubData()));
        acmdtableentry[48] = new CmdTableEntry(48, "glCheckFramebufferStatus", new CmdParser(CommandCheckFramebufferStatus.argTypes, new CommandCheckFramebufferStatus()));
        acmdtableentry[49] = new CmdTableEntry(49, "glClear", new CmdParser(CommandClear.argTypes, new CommandClear()));
        acmdtableentry[50] = new CmdTableEntry(50, "glClearColor", new CmdParser(CommandClearColor.argTypes, new CommandClearColor()));
        acmdtableentry[51] = new CmdTableEntry(51, "glClearDepthf", new CmdParser(CommandClearDepthf.argTypes, new CommandClearDepthf()));
        acmdtableentry[52] = new CmdTableEntry(52, "glClearStencil", new CmdParser(CommandClearStencil.argTypes, new CommandClearStencil()));
        acmdtableentry[53] = new CmdTableEntry(53, "glColorMask", new CmdParser(CommandColorMask.argTypes, new CommandColorMask()));
        acmdtableentry[54] = new CmdTableEntry(54, "glCompileShader", new CmdParser(CommandCompileShader.argTypes, new CommandCompileShader()));
        acmdtableentry[55] = new CmdTableEntry(55, "glCompressedTexImage2D", new CmdParser(CommandCompressedTexImage2D.argTypes, new CommandCompressedTexImage2D()));
        acmdtableentry[56] = new CmdTableEntry(56, "glCompressedTexSubImage2D", new CmdParser(CommandCompressedTexSubImage2D.argTypes, new CommandCompressedTexSubImage2D()));
        acmdtableentry[57] = new CmdTableEntry(57, "glCopyTexImage2D", new CmdParser(CommandCopyTexImage2D.argTypes, new CommandCopyTexImage2D()));
        acmdtableentry[58] = new CmdTableEntry(58, "glCopyTexSubImage2D", new CmdParser(CommandCopyTexSubImage2D.argTypes, new CommandCopyTexSubImage2D()));
        acmdtableentry[59] = new CmdTableEntry(59, "glCreateProgram", new CmdParser(CommandCreateProgram.argTypes, new CommandCreateProgram()));
        acmdtableentry[60] = new CmdTableEntry(60, "glCreateShader", new CmdParser(CommandCreateShader.argTypes, new CommandCreateShader()));
        acmdtableentry[61] = new CmdTableEntry(61, "glCullFace", new CmdParser(CommandCullFace.argTypes, new CommandCullFace()));
        acmdtableentry[62] = new CmdTableEntry(62, "glDeleteBuffers", new CmdParser(CommandDeleteBuffers.argTypes, new CommandDeleteBuffers()));
        acmdtableentry[63] = new CmdTableEntry(63, "glDeleteFramebuffers", new CmdParser(CommandDeleteFramebuffers.argTypes, new CommandDeleteFramebuffers()));
        acmdtableentry[64] = new CmdTableEntry(64, "glDeleteProgram", new CmdParser(CommandDeleteProgram.argTypes, new CommandDeleteProgram()));
        acmdtableentry[65] = new CmdTableEntry(65, "glDeleteRenderbuffers", new CmdParser(CommandDeleteRenderbuffers.argTypes, new CommandDeleteRenderbuffers()));
        acmdtableentry[66] = new CmdTableEntry(66, "glDeleteShader", new CmdParser(CommandDeleteShader.argTypes, new CommandDeleteShader()));
        acmdtableentry[67] = new CmdTableEntry(67, "glDeleteTextures", new CmdParser(CommandDeleteTextures.argTypes, new CommandDeleteTextures()));
        acmdtableentry[68] = new CmdTableEntry(68, "glDepthFunc", new CmdParser(CommandDepthFunc.argTypes, new CommandDepthFunc()));
        acmdtableentry[69] = new CmdTableEntry(69, "glDepthMask", new CmdParser(CommandDepthMask.argTypes, new CommandDepthMask()));
        acmdtableentry[70] = new CmdTableEntry(70, "glDepthRangef", new CmdParser(CommandDepthRangef.argTypes, new CommandDepthRangef()));
        acmdtableentry[71] = new CmdTableEntry(71, "glDetachShader", new CmdParser(CommandDetachShader.argTypes, new CommandDetachShader()));
        acmdtableentry[72] = new CmdTableEntry(72, "glDisable", new CmdParser(CommandDisable.argTypes, new CommandDisable()));
        acmdtableentry[73] = new CmdTableEntry(73, "glDisableVertexAttribArray", new CmdParser(CommandDisableVertexAttribArray.argTypes, new CommandDisableVertexAttribArray()));
        acmdtableentry[74] = new CmdTableEntry(74, "glDrawArrays", new CmdParser(CommandDrawArrays.argTypes, new CommandDrawArrays()));
        acmdtableentry[76] = new CmdTableEntry(76, "glEnable", new CmdParser(CommandEnable.argTypes, new CommandEnable()));
        acmdtableentry[77] = new CmdTableEntry(77, "glEnableVertexAttribArray", new CmdParser(CommandEnableVertexAttribArray.argTypes, new CommandEnableVertexAttribArray()));
        acmdtableentry[78] = new CmdTableEntry(78, "glFinish", new CmdParser(CommandFinish.argTypes, new CommandFinish()));
        acmdtableentry[79] = new CmdTableEntry(79, "glFlush", new CmdParser(CommandFlush.argTypes, new CommandFlush()));
        acmdtableentry[80] = new CmdTableEntry(80, "glFramebufferRenderbuffer", new CmdParser(CommandFramebufferRenderbuffer.argTypes, new CommandFramebufferRenderbuffer()));
        acmdtableentry[81] = new CmdTableEntry(81, "glFramebufferTexture2D", new CmdParser(CommandFramebufferTexture2D.argTypes, new CommandFramebufferTexture2D()));
        acmdtableentry[82] = new CmdTableEntry(82, "glFrontFace", new CmdParser(CommandFrontFace.argTypes, new CommandFrontFace()));
        acmdtableentry[83] = new CmdTableEntry(83, "glGenBuffers", new CmdParser(CommandGenBuffers.argTypes, new CommandGenBuffers()));
        acmdtableentry[84] = new CmdTableEntry(84, "glGenerateMipmap", new CmdParser(CommandGenerateMipmap.argTypes, new CommandGenerateMipmap()));
        acmdtableentry[85] = new CmdTableEntry(85, "glGenFramebuffers", new CmdParser(CommandGenFramebuffers.argTypes, new CommandGenFramebuffers()));
        acmdtableentry[86] = new CmdTableEntry(86, "glGenRenderbuffers", new CmdParser(CommandGenRenderbuffers.argTypes, new CommandGenRenderbuffers()));
        acmdtableentry[87] = new CmdTableEntry(87, "glGenTextures", new CmdParser(CommandGenTextures.argTypes, new CommandGenTextures()));
        acmdtableentry[90] = new CmdTableEntry(90, "glGetAttachedShaders", new CmdParser(CommandGetAttachedShaders.argTypes, new CommandGetAttachedShaders()));
        acmdtableentry[91] = new CmdTableEntry(91, "glGetAttribLocation", new CmdParser(CommandGetAttribLocation.argTypes, new CommandGetAttribLocation()));
        acmdtableentry[92] = new CmdTableEntry(92, "glGetBooleanv", new CmdParser(CommandGetBooleanv.argTypes, new CommandGetBooleanv()));
        acmdtableentry[93] = new CmdTableEntry(93, "glGetBufferParameteriv", new CmdParser(CommandGetBufferParameteriv.argTypes, new CommandGetBufferParameteriv()));
        acmdtableentry[94] = new CmdTableEntry(94, "glGetError", new CmdParser(CommandGetError.argTypes, new CommandGetError()));
        acmdtableentry[95] = new CmdTableEntry(95, "glGetFloatv", new CmdParser(CommandGetFloatv.argTypes, new CommandGetFloatv()));
        acmdtableentry[96] = new CmdTableEntry(96, "glGetFramebufferAttachmentParameteriv", new CmdParser(CommandGetFramebufferAttachmentParameteriv.argTypes, new CommandGetFramebufferAttachmentParameteriv()));
        acmdtableentry[97] = new CmdTableEntry(97, "glGetIntegerv", new CmdParser(CommandGetIntegerv.argTypes, new CommandGetIntegerv()));
        acmdtableentry[98] = new CmdTableEntry(98, "glGetProgramiv", new CmdParser(CommandGetProgramiv.argTypes, new CommandGetProgramiv()));
        acmdtableentry[100] = new CmdTableEntry(100, "glGetRenderbufferParameteriv", new CmdParser(CommandGetRenderbufferParameteriv.argTypes, new CommandGetRenderbufferParameteriv()));
        acmdtableentry[101] = new CmdTableEntry(101, "glGetShaderiv", new CmdParser(CommandGetShaderiv.argTypes, new CommandGetShaderiv()));
        acmdtableentry[103] = new CmdTableEntry(103, "glGetShaderPrecisionFormat", new CmdParser(CommandGetShaderPrecisionFormat.argTypes, new CommandGetShaderPrecisionFormat()));
        acmdtableentry[105] = new CmdTableEntry(105, "glGetString", new CmdParser(CommandGetString.argTypes, new CommandGetString()));
        acmdtableentry[106] = new CmdTableEntry(106, "glGetTexParameterfv", new CmdParser(CommandGetTexParameterfv.argTypes, new CommandGetTexParameterfv()));
        acmdtableentry[107] = new CmdTableEntry(107, "glGetTexParameteriv", new CmdParser(CommandGetTexParameteriv.argTypes, new CommandGetTexParameteriv()));
        acmdtableentry[108] = new CmdTableEntry(108, "glGetUniformfv", new CmdParser(CommandGetUniformfv.argTypes, new CommandGetUniformfv()));
        acmdtableentry[109] = new CmdTableEntry(109, "glGetUniformiv", new CmdParser(CommandGetUniformiv.argTypes, new CommandGetUniformiv()));
        acmdtableentry[110] = new CmdTableEntry(110, "glGetUniformLocation", new CmdParser(CommandGetUniformLocation.argTypes, new CommandGetUniformLocation()));
        acmdtableentry[111] = new CmdTableEntry(111, "glGetVertexAttribfv", new CmdParser(CommandGetVertexAttribfv.argTypes, new CommandGetVertexAttribfv()));
        acmdtableentry[112] = new CmdTableEntry(112, "glGetVertexAttribiv", new CmdParser(CommandGetVertexAttribiv.argTypes, new CommandGetVertexAttribiv()));
        acmdtableentry[113] = new CmdTableEntry(113, "glHint", new CmdParser(CommandHint.argTypes, new CommandHint()));
        acmdtableentry[114] = new CmdTableEntry(114, "glIsBuffer", new CmdParser(CommandIsBuffer.argTypes, new CommandIsBuffer()));
        acmdtableentry[115] = new CmdTableEntry(115, "glIsEnabled", new CmdParser(CommandIsEnabled.argTypes, new CommandIsEnabled()));
        acmdtableentry[116] = new CmdTableEntry(116, "glIsFramebuffer", new CmdParser(CommandIsFramebuffer.argTypes, new CommandIsFramebuffer()));
        acmdtableentry[117] = new CmdTableEntry(117, "glIsProgram", new CmdParser(CommandIsProgram.argTypes, new CommandIsProgram()));
        acmdtableentry[118] = new CmdTableEntry(118, "glIsRenderbuffer", new CmdParser(CommandIsRenderbuffer.argTypes, new CommandIsRenderbuffer()));
        acmdtableentry[119] = new CmdTableEntry(119, "glIsShader", new CmdParser(CommandIsShader.argTypes, new CommandIsShader()));
        acmdtableentry[120] = new CmdTableEntry(120, "glIsTexture", new CmdParser(CommandIsTexture.argTypes, new CommandIsTexture()));
        acmdtableentry[121] = new CmdTableEntry(121, "glLineWidth", new CmdParser(CommandLineWidth.argTypes, new CommandLineWidth()));
        acmdtableentry[122] = new CmdTableEntry(122, "glLinkProgram", new CmdParser(CommandLinkProgram.argTypes, new CommandLinkProgram()));
        acmdtableentry[123] = new CmdTableEntry(123, "glPixelStorei", new CmdParser(CommandPixelStorei.argTypes, new CommandPixelStorei()));
        acmdtableentry[124] = new CmdTableEntry(124, "glPolygonOffset", new CmdParser(CommandPolygonOffset.argTypes, new CommandPolygonOffset()));
        acmdtableentry[125] = new CmdTableEntry(125, "glReleaseShaderCompiler", new CmdParser(CommandReleaseShaderCompiler.argTypes, new CommandReleaseShaderCompiler()));
        acmdtableentry[126] = new CmdTableEntry(126, "glRenderbufferStorage", new CmdParser(CommandRenderbufferStorage.argTypes, new CommandRenderbufferStorage()));
        acmdtableentry[127] = new CmdTableEntry(127, "glSampleCoverage", new CmdParser(CommandSampleCoverage.argTypes, new CommandSampleCoverage()));
        acmdtableentry[128] = new CmdTableEntry(128, "glScissor", new CmdParser(CommandScissor.argTypes, new CommandScissor()));
        acmdtableentry[129] = new CmdTableEntry(129, "glShaderBinary", new CmdParser(CommandShaderBinary.argTypes, new CommandShaderBinary()));
        acmdtableentry[130] = new CmdTableEntry(130, "glStencilFunc", new CmdParser(CommandStencilFunc.argTypes, new CommandStencilFunc()));
        acmdtableentry[131] = new CmdTableEntry(131, "glStencilFuncSeparate", new CmdParser(CommandStencilFuncSeparate.argTypes, new CommandStencilFuncSeparate()));
        acmdtableentry[132] = new CmdTableEntry(132, "glStencilMask", new CmdParser(CommandStencilMask.argTypes, new CommandStencilMask()));
        acmdtableentry[133] = new CmdTableEntry(133, "glStencilMaskSeparate", new CmdParser(CommandStencilMaskSeparate.argTypes, new CommandStencilMaskSeparate()));
        acmdtableentry[134] = new CmdTableEntry(134, "glStencilOp", new CmdParser(CommandStencilOp.argTypes, new CommandStencilOp()));
        acmdtableentry[135] = new CmdTableEntry(135, "glStencilOpSeparate", new CmdParser(CommandStencilOpSeparate.argTypes, new CommandStencilOpSeparate()));
        acmdtableentry[136] = new CmdTableEntry(136, "glTexImage2D", new CmdParser(CommandTexImage2D.argTypes, new CommandTexImage2D()));
        acmdtableentry[137] = new CmdTableEntry(137, "glTexParameterf", new CmdParser(CommandTexParameterf.argTypes, new CommandTexParameterf()));
        acmdtableentry[138] = new CmdTableEntry(138, "glTexParameterfv", new CmdParser(CommandTexParameterfv.argTypes, new CommandTexParameterfv()));
        acmdtableentry[139] = new CmdTableEntry(139, "glTexParameteri", new CmdParser(CommandTexParameteri.argTypes, new CommandTexParameteri()));
        acmdtableentry[140] = new CmdTableEntry(140, "glTexParameteriv", new CmdParser(CommandTexParameteriv.argTypes, new CommandTexParameteriv()));
        acmdtableentry[141] = new CmdTableEntry(141, "glTexSubImage2D", new CmdParser(CommandTexSubImage2D.argTypes, new CommandTexSubImage2D()));
        acmdtableentry[142] = new CmdTableEntry(142, "glUniform1f", new CmdParser(CommandUniform1f.argTypes, new CommandUniform1f()));
        acmdtableentry[143] = new CmdTableEntry(143, "glUniform1fv", new CmdParser(CommandUniform1fv.argTypes, new CommandUniform1fv()));
        acmdtableentry[144] = new CmdTableEntry(144, "glUniform1i", new CmdParser(CommandUniform1i.argTypes, new CommandUniform1i()));
        acmdtableentry[145] = new CmdTableEntry(145, "glUniform1iv", new CmdParser(CommandUniform1iv.argTypes, new CommandUniform1iv()));
        acmdtableentry[146] = new CmdTableEntry(146, "glUniform2f", new CmdParser(CommandUniform2f.argTypes, new CommandUniform2f()));
        acmdtableentry[147] = new CmdTableEntry(147, "glUniform2fv", new CmdParser(CommandUniform2fv.argTypes, new CommandUniform2fv()));
        acmdtableentry[148] = new CmdTableEntry(148, "glUniform2i", new CmdParser(CommandUniform2i.argTypes, new CommandUniform2i()));
        acmdtableentry[149] = new CmdTableEntry(149, "glUniform2iv", new CmdParser(CommandUniform2iv.argTypes, new CommandUniform2iv()));
        acmdtableentry[150] = new CmdTableEntry(150, "glUniform3f", new CmdParser(CommandUniform3f.argTypes, new CommandUniform3f()));
        acmdtableentry[151] = new CmdTableEntry(151, "glUniform3fv", new CmdParser(CommandUniform3fv.argTypes, new CommandUniform3fv()));
        acmdtableentry[152] = new CmdTableEntry(152, "glUniform3i", new CmdParser(CommandUniform3i.argTypes, new CommandUniform3i()));
        acmdtableentry[153] = new CmdTableEntry(153, "glUniform3iv", new CmdParser(CommandUniform3iv.argTypes, new CommandUniform3iv()));
        acmdtableentry[154] = new CmdTableEntry(154, "glUniform4f", new CmdParser(CommandUniform4f.argTypes, new CommandUniform4f()));
        acmdtableentry[155] = new CmdTableEntry(155, "glUniform4fv", new CmdParser(CommandUniform4fv.argTypes, new CommandUniform4fv()));
        acmdtableentry[156] = new CmdTableEntry(156, "glUniform4i", new CmdParser(CommandUniform4i.argTypes, new CommandUniform4i()));
        acmdtableentry[157] = new CmdTableEntry(157, "glUniform4iv", new CmdParser(CommandUniform4iv.argTypes, new CommandUniform4iv()));
        acmdtableentry[158] = new CmdTableEntry(158, "glUniformMatrix2fv", new CmdParser(CommandUniformMatrix2fv.argTypes, new CommandUniformMatrix2fv()));
        acmdtableentry[159] = new CmdTableEntry(159, "glUniformMatrix3fv", new CmdParser(CommandUniformMatrix3fv.argTypes, new CommandUniformMatrix3fv()));
        acmdtableentry[160] = new CmdTableEntry(160, "glUniformMatrix4fv", new CmdParser(CommandUniformMatrix4fv.argTypes, new CommandUniformMatrix4fv()));
        acmdtableentry[161] = new CmdTableEntry(161, "glUseProgram", new CmdParser(CommandUseProgram.argTypes, new CommandUseProgram()));
        acmdtableentry[162] = new CmdTableEntry(162, "glValidateProgram", new CmdParser(CommandValidateProgram.argTypes, new CommandValidateProgram()));
        acmdtableentry[163] = new CmdTableEntry(163, "glVertexAttrib1f", new CmdParser(CommandVertexAttrib1f.argTypes, new CommandVertexAttrib1f()));
        acmdtableentry[164] = new CmdTableEntry(164, "glVertexAttrib1fv", new CmdParser(CommandVertexAttrib1fv.argTypes, new CommandVertexAttrib1fv()));
        acmdtableentry[165] = new CmdTableEntry(165, "glVertexAttrib2f", new CmdParser(CommandVertexAttrib2f.argTypes, new CommandVertexAttrib2f()));
        acmdtableentry[166] = new CmdTableEntry(166, "glVertexAttrib2fv", new CmdParser(CommandVertexAttrib2fv.argTypes, new CommandVertexAttrib2fv()));
        acmdtableentry[167] = new CmdTableEntry(167, "glVertexAttrib3f", new CmdParser(CommandVertexAttrib3f.argTypes, new CommandVertexAttrib3f()));
        acmdtableentry[168] = new CmdTableEntry(168, "glVertexAttrib3fv", new CmdParser(CommandVertexAttrib3fv.argTypes, new CommandVertexAttrib3fv()));
        acmdtableentry[169] = new CmdTableEntry(169, "glVertexAttrib4f", new CmdParser(CommandVertexAttrib4f.argTypes, new CommandVertexAttrib4f()));
        acmdtableentry[170] = new CmdTableEntry(170, "glVertexAttrib4fv", new CmdParser(CommandVertexAttrib4fv.argTypes, new CommandVertexAttrib4fv()));
        acmdtableentry[171] = new CmdTableEntry(171, "glVertexAttribPointer", new CmdParser(CommandVertexAttribPointer.argTypes, new CommandVertexAttribPointer()));
        acmdtableentry[172] = new CmdTableEntry(172, "glViewport", new CmdParser(CommandViewport.argTypes, new CommandViewport()));
    }
}
