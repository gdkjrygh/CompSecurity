// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class CamelliaEngine
    implements BlockCipher
{

    private static final int BLOCK_SIZE = 16;
    private static final int MASK8 = 255;
    private static final int SBOX1_1110[] = {
        0x70707000, 0x82828200, 0x2c2c2c00, 0xececec00, 0xb3b3b300, 0x27272700, 0xc0c0c000, 0xe5e5e500, 0xe4e4e400, 0x85858500, 
        0x57575700, 0x35353500, 0xeaeaea00, 0xc0c0c00, 0xaeaeae00, 0x41414100, 0x23232300, 0xefefef00, 0x6b6b6b00, 0x93939300, 
        0x45454500, 0x19191900, 0xa5a5a500, 0x21212100, 0xededed00, 0xe0e0e00, 0x4f4f4f00, 0x4e4e4e00, 0x1d1d1d00, 0x65656500, 
        0x92929200, 0xbdbdbd00, 0x86868600, 0xb8b8b800, 0xafafaf00, 0x8f8f8f00, 0x7c7c7c00, 0xebebeb00, 0x1f1f1f00, 0xcecece00, 
        0x3e3e3e00, 0x30303000, 0xdcdcdc00, 0x5f5f5f00, 0x5e5e5e00, 0xc5c5c500, 0xb0b0b00, 0x1a1a1a00, 0xa6a6a600, 0xe1e1e100, 
        0x39393900, 0xcacaca00, 0xd5d5d500, 0x47474700, 0x5d5d5d00, 0x3d3d3d00, 0xd9d9d900, 0x1010100, 0x5a5a5a00, 0xd6d6d600, 
        0x51515100, 0x56565600, 0x6c6c6c00, 0x4d4d4d00, 0x8b8b8b00, 0xd0d0d00, 0x9a9a9a00, 0x66666600, 0xfbfbfb00, 0xcccccc00, 
        0xb0b0b000, 0x2d2d2d00, 0x74747400, 0x12121200, 0x2b2b2b00, 0x20202000, 0xf0f0f000, 0xb1b1b100, 0x84848400, 0x99999900, 
        0xdfdfdf00, 0x4c4c4c00, 0xcbcbcb00, 0xc2c2c200, 0x34343400, 0x7e7e7e00, 0x76767600, 0x5050500, 0x6d6d6d00, 0xb7b7b700, 
        0xa9a9a900, 0x31313100, 0xd1d1d100, 0x17171700, 0x4040400, 0xd7d7d700, 0x14141400, 0x58585800, 0x3a3a3a00, 0x61616100, 
        0xdedede00, 0x1b1b1b00, 0x11111100, 0x1c1c1c00, 0x32323200, 0xf0f0f00, 0x9c9c9c00, 0x16161600, 0x53535300, 0x18181800, 
        0xf2f2f200, 0x22222200, 0xfefefe00, 0x44444400, 0xcfcfcf00, 0xb2b2b200, 0xc3c3c300, 0xb5b5b500, 0x7a7a7a00, 0x91919100, 
        0x24242400, 0x8080800, 0xe8e8e800, 0xa8a8a800, 0x60606000, 0xfcfcfc00, 0x69696900, 0x50505000, 0xaaaaaa00, 0xd0d0d000, 
        0xa0a0a000, 0x7d7d7d00, 0xa1a1a100, 0x89898900, 0x62626200, 0x97979700, 0x54545400, 0x5b5b5b00, 0x1e1e1e00, 0x95959500, 
        0xe0e0e000, -256, 0x64646400, 0xd2d2d200, 0x10101000, 0xc4c4c400, 0, 0x48484800, 0xa3a3a300, 0xf7f7f700, 
        0x75757500, 0xdbdbdb00, 0x8a8a8a00, 0x3030300, 0xe6e6e600, 0xdadada00, 0x9090900, 0x3f3f3f00, 0xdddddd00, 0x94949400, 
        0x87878700, 0x5c5c5c00, 0x83838300, 0x2020200, 0xcdcdcd00, 0x4a4a4a00, 0x90909000, 0x33333300, 0x73737300, 0x67676700, 
        0xf6f6f600, 0xf3f3f300, 0x9d9d9d00, 0x7f7f7f00, 0xbfbfbf00, 0xe2e2e200, 0x52525200, 0x9b9b9b00, 0xd8d8d800, 0x26262600, 
        0xc8c8c800, 0x37373700, 0xc6c6c600, 0x3b3b3b00, 0x81818100, 0x96969600, 0x6f6f6f00, 0x4b4b4b00, 0x13131300, 0xbebebe00, 
        0x63636300, 0x2e2e2e00, 0xe9e9e900, 0x79797900, 0xa7a7a700, 0x8c8c8c00, 0x9f9f9f00, 0x6e6e6e00, 0xbcbcbc00, 0x8e8e8e00, 
        0x29292900, 0xf5f5f500, 0xf9f9f900, 0xb6b6b600, 0x2f2f2f00, 0xfdfdfd00, 0xb4b4b400, 0x59595900, 0x78787800, 0x98989800, 
        0x6060600, 0x6a6a6a00, 0xe7e7e700, 0x46464600, 0x71717100, 0xbababa00, 0xd4d4d400, 0x25252500, 0xababab00, 0x42424200, 
        0x88888800, 0xa2a2a200, 0x8d8d8d00, 0xfafafa00, 0x72727200, 0x7070700, 0xb9b9b900, 0x55555500, 0xf8f8f800, 0xeeeeee00, 
        0xacacac00, 0xa0a0a00, 0x36363600, 0x49494900, 0x2a2a2a00, 0x68686800, 0x3c3c3c00, 0x38383800, 0xf1f1f100, 0xa4a4a400, 
        0x40404000, 0x28282800, 0xd3d3d300, 0x7b7b7b00, 0xbbbbbb00, 0xc9c9c900, 0x43434300, 0xc1c1c100, 0x15151500, 0xe3e3e300, 
        0xadadad00, 0xf4f4f400, 0x77777700, 0xc7c7c700, 0x80808000, 0x9e9e9e00
    };
    private static final int SBOX2_0222[] = {
        0xe0e0e0, 0x50505, 0x585858, 0xd9d9d9, 0x676767, 0x4e4e4e, 0x818181, 0xcbcbcb, 0xc9c9c9, 0xb0b0b, 
        0xaeaeae, 0x6a6a6a, 0xd5d5d5, 0x181818, 0x5d5d5d, 0x828282, 0x464646, 0xdfdfdf, 0xd6d6d6, 0x272727, 
        0x8a8a8a, 0x323232, 0x4b4b4b, 0x424242, 0xdbdbdb, 0x1c1c1c, 0x9e9e9e, 0x9c9c9c, 0x3a3a3a, 0xcacaca, 
        0x252525, 0x7b7b7b, 0xd0d0d, 0x717171, 0x5f5f5f, 0x1f1f1f, 0xf8f8f8, 0xd7d7d7, 0x3e3e3e, 0x9d9d9d, 
        0x7c7c7c, 0x606060, 0xb9b9b9, 0xbebebe, 0xbcbcbc, 0x8b8b8b, 0x161616, 0x343434, 0x4d4d4d, 0xc3c3c3, 
        0x727272, 0x959595, 0xababab, 0x8e8e8e, 0xbababa, 0x7a7a7a, 0xb3b3b3, 0x20202, 0xb4b4b4, 0xadadad, 
        0xa2a2a2, 0xacacac, 0xd8d8d8, 0x9a9a9a, 0x171717, 0x1a1a1a, 0x353535, 0xcccccc, 0xf7f7f7, 0x999999, 
        0x616161, 0x5a5a5a, 0xe8e8e8, 0x242424, 0x565656, 0x404040, 0xe1e1e1, 0x636363, 0x90909, 0x333333, 
        0xbfbfbf, 0x989898, 0x979797, 0x858585, 0x686868, 0xfcfcfc, 0xececec, 0xa0a0a, 0xdadada, 0x6f6f6f, 
        0x535353, 0x626262, 0xa3a3a3, 0x2e2e2e, 0x80808, 0xafafaf, 0x282828, 0xb0b0b0, 0x747474, 0xc2c2c2, 
        0xbdbdbd, 0x363636, 0x222222, 0x383838, 0x646464, 0x1e1e1e, 0x393939, 0x2c2c2c, 0xa6a6a6, 0x303030, 
        0xe5e5e5, 0x444444, 0xfdfdfd, 0x888888, 0x9f9f9f, 0x656565, 0x878787, 0x6b6b6b, 0xf4f4f4, 0x232323, 
        0x484848, 0x101010, 0xd1d1d1, 0x515151, 0xc0c0c0, 0xf9f9f9, 0xd2d2d2, 0xa0a0a0, 0x555555, 0xa1a1a1, 
        0x414141, 0xfafafa, 0x434343, 0x131313, 0xc4c4c4, 0x2f2f2f, 0xa8a8a8, 0xb6b6b6, 0x3c3c3c, 0x2b2b2b, 
        0xc1c1c1, 0xffffff, 0xc8c8c8, 0xa5a5a5, 0x202020, 0x898989, 0, 0x909090, 0x474747, 0xefefef, 
        0xeaeaea, 0xb7b7b7, 0x151515, 0x60606, 0xcdcdcd, 0xb5b5b5, 0x121212, 0x7e7e7e, 0xbbbbbb, 0x292929, 
        0xf0f0f, 0xb8b8b8, 0x70707, 0x40404, 0x9b9b9b, 0x949494, 0x212121, 0x666666, 0xe6e6e6, 0xcecece, 
        0xededed, 0xe7e7e7, 0x3b3b3b, 0xfefefe, 0x7f7f7f, 0xc5c5c5, 0xa4a4a4, 0x373737, 0xb1b1b1, 0x4c4c4c, 
        0x919191, 0x6e6e6e, 0x8d8d8d, 0x767676, 0x30303, 0x2d2d2d, 0xdedede, 0x969696, 0x262626, 0x7d7d7d, 
        0xc6c6c6, 0x5c5c5c, 0xd3d3d3, 0xf2f2f2, 0x4f4f4f, 0x191919, 0x3f3f3f, 0xdcdcdc, 0x797979, 0x1d1d1d, 
        0x525252, 0xebebeb, 0xf3f3f3, 0x6d6d6d, 0x5e5e5e, 0xfbfbfb, 0x696969, 0xb2b2b2, 0xf0f0f0, 0x313131, 
        0xc0c0c, 0xd4d4d4, 0xcfcfcf, 0x8c8c8c, 0xe2e2e2, 0x757575, 0xa9a9a9, 0x4a4a4a, 0x575757, 0x848484, 
        0x111111, 0x454545, 0x1b1b1b, 0xf5f5f5, 0xe4e4e4, 0xe0e0e, 0x737373, 0xaaaaaa, 0xf1f1f1, 0xdddddd, 
        0x595959, 0x141414, 0x6c6c6c, 0x929292, 0x545454, 0xd0d0d0, 0x787878, 0x707070, 0xe3e3e3, 0x494949, 
        0x808080, 0x505050, 0xa7a7a7, 0xf6f6f6, 0x777777, 0x939393, 0x868686, 0x838383, 0x2a2a2a, 0xc7c7c7, 
        0x5b5b5b, 0xe9e9e9, 0xeeeeee, 0x8f8f8f, 0x10101, 0x3d3d3d
    };
    private static final int SBOX3_3033[] = {
        0x38003838, 0x41004141, 0x16001616, 0x76007676, 0xd900d9d9, 0x93009393, 0x60006060, 0xf200f2f2, 0x72007272, 0xc200c2c2, 
        0xab00abab, 0x9a009a9a, 0x75007575, 0x6000606, 0x57005757, 0xa000a0a0, 0x91009191, 0xf700f7f7, 0xb500b5b5, 0xc900c9c9, 
        0xa200a2a2, 0x8c008c8c, 0xd200d2d2, 0x90009090, 0xf600f6f6, 0x7000707, 0xa700a7a7, 0x27002727, 0x8e008e8e, 0xb200b2b2, 
        0x49004949, 0xde00dede, 0x43004343, 0x5c005c5c, 0xd700d7d7, 0xc700c7c7, 0x3e003e3e, 0xf500f5f5, 0x8f008f8f, 0x67006767, 
        0x1f001f1f, 0x18001818, 0x6e006e6e, 0xaf00afaf, 0x2f002f2f, 0xe200e2e2, 0x85008585, 0xd000d0d, 0x53005353, 0xf000f0f0, 
        0x9c009c9c, 0x65006565, 0xea00eaea, 0xa300a3a3, 0xae00aeae, 0x9e009e9e, 0xec00ecec, 0x80008080, 0x2d002d2d, 0x6b006b6b, 
        0xa800a8a8, 0x2b002b2b, 0x36003636, 0xa600a6a6, 0xc500c5c5, 0x86008686, 0x4d004d4d, 0x33003333, 0xfd00fdfd, 0x66006666, 
        0x58005858, 0x96009696, 0x3a003a3a, 0x9000909, 0x95009595, 0x10001010, 0x78007878, 0xd800d8d8, 0x42004242, 0xcc00cccc, 
        0xef00efef, 0x26002626, 0xe500e5e5, 0x61006161, 0x1a001a1a, 0x3f003f3f, 0x3b003b3b, 0x82008282, 0xb600b6b6, 0xdb00dbdb, 
        0xd400d4d4, 0x98009898, 0xe800e8e8, 0x8b008b8b, 0x2000202, 0xeb00ebeb, 0xa000a0a, 0x2c002c2c, 0x1d001d1d, 0xb000b0b0, 
        0x6f006f6f, 0x8d008d8d, 0x88008888, 0xe000e0e, 0x19001919, 0x87008787, 0x4e004e4e, 0xb000b0b, 0xa900a9a9, 0xc000c0c, 
        0x79007979, 0x11001111, 0x7f007f7f, 0x22002222, 0xe700e7e7, 0x59005959, 0xe100e1e1, 0xda00dada, 0x3d003d3d, 0xc800c8c8, 
        0x12001212, 0x4000404, 0x74007474, 0x54005454, 0x30003030, 0x7e007e7e, 0xb400b4b4, 0x28002828, 0x55005555, 0x68006868, 
        0x50005050, 0xbe00bebe, 0xd000d0d0, 0xc400c4c4, 0x31003131, 0xcb00cbcb, 0x2a002a2a, 0xad00adad, 0xf000f0f, 0xca00caca, 
        0x70007070, 0xff00ffff, 0x32003232, 0x69006969, 0x8000808, 0x62006262, 0, 0x24002424, 0xd100d1d1, 0xfb00fbfb, 
        0xba00baba, 0xed00eded, 0x45004545, 0x81008181, 0x73007373, 0x6d006d6d, 0x84008484, 0x9f009f9f, 0xee00eeee, 0x4a004a4a, 
        0xc300c3c3, 0x2e002e2e, 0xc100c1c1, 0x1000101, 0xe600e6e6, 0x25002525, 0x48004848, 0x99009999, 0xb900b9b9, 0xb300b3b3, 
        0x7b007b7b, 0xf900f9f9, 0xce00cece, 0xbf00bfbf, 0xdf00dfdf, 0x71007171, 0x29002929, 0xcd00cdcd, 0x6c006c6c, 0x13001313, 
        0x64006464, 0x9b009b9b, 0x63006363, 0x9d009d9d, 0xc000c0c0, 0x4b004b4b, 0xb700b7b7, 0xa500a5a5, 0x89008989, 0x5f005f5f, 
        0xb100b1b1, 0x17001717, 0xf400f4f4, 0xbc00bcbc, 0xd300d3d3, 0x46004646, 0xcf00cfcf, 0x37003737, 0x5e005e5e, 0x47004747, 
        0x94009494, 0xfa00fafa, 0xfc00fcfc, 0x5b005b5b, 0x97009797, 0xfe00fefe, 0x5a005a5a, 0xac00acac, 0x3c003c3c, 0x4c004c4c, 
        0x3000303, 0x35003535, 0xf300f3f3, 0x23002323, 0xb800b8b8, 0x5d005d5d, 0x6a006a6a, 0x92009292, 0xd500d5d5, 0x21002121, 
        0x44004444, 0x51005151, 0xc600c6c6, 0x7d007d7d, 0x39003939, 0x83008383, 0xdc00dcdc, 0xaa00aaaa, 0x7c007c7c, 0x77007777, 
        0x56005656, 0x5000505, 0x1b001b1b, 0xa400a4a4, 0x15001515, 0x34003434, 0x1e001e1e, 0x1c001c1c, 0xf800f8f8, 0x52005252, 
        0x20002020, 0x14001414, 0xe900e9e9, 0xbd00bdbd, 0xdd00dddd, 0xe400e4e4, 0xa100a1a1, 0xe000e0e0, 0x8a008a8a, 0xf100f1f1, 
        0xd600d6d6, 0x7a007a7a, 0xbb00bbbb, 0xe300e3e3, 0x40004040, 0x4f004f4f
    };
    private static final int SBOX4_4404[] = {
        0x70700070, 0x2c2c002c, 0xb3b300b3, 0xc0c000c0, 0xe4e400e4, 0x57570057, 0xeaea00ea, 0xaeae00ae, 0x23230023, 0x6b6b006b, 
        0x45450045, 0xa5a500a5, 0xeded00ed, 0x4f4f004f, 0x1d1d001d, 0x92920092, 0x86860086, 0xafaf00af, 0x7c7c007c, 0x1f1f001f, 
        0x3e3e003e, 0xdcdc00dc, 0x5e5e005e, 0xb0b000b, 0xa6a600a6, 0x39390039, 0xd5d500d5, 0x5d5d005d, 0xd9d900d9, 0x5a5a005a, 
        0x51510051, 0x6c6c006c, 0x8b8b008b, 0x9a9a009a, 0xfbfb00fb, 0xb0b000b0, 0x74740074, 0x2b2b002b, 0xf0f000f0, 0x84840084, 
        0xdfdf00df, 0xcbcb00cb, 0x34340034, 0x76760076, 0x6d6d006d, 0xa9a900a9, 0xd1d100d1, 0x4040004, 0x14140014, 0x3a3a003a, 
        0xdede00de, 0x11110011, 0x32320032, 0x9c9c009c, 0x53530053, 0xf2f200f2, 0xfefe00fe, 0xcfcf00cf, 0xc3c300c3, 0x7a7a007a, 
        0x24240024, 0xe8e800e8, 0x60600060, 0x69690069, 0xaaaa00aa, 0xa0a000a0, 0xa1a100a1, 0x62620062, 0x54540054, 0x1e1e001e, 
        0xe0e000e0, 0x64640064, 0x10100010, 0, 0xa3a300a3, 0x75750075, 0x8a8a008a, 0xe6e600e6, 0x9090009, 0xdddd00dd, 
        0x87870087, 0x83830083, 0xcdcd00cd, 0x90900090, 0x73730073, 0xf6f600f6, 0x9d9d009d, 0xbfbf00bf, 0x52520052, 0xd8d800d8, 
        0xc8c800c8, 0xc6c600c6, 0x81810081, 0x6f6f006f, 0x13130013, 0x63630063, 0xe9e900e9, 0xa7a700a7, 0x9f9f009f, 0xbcbc00bc, 
        0x29290029, 0xf9f900f9, 0x2f2f002f, 0xb4b400b4, 0x78780078, 0x6060006, 0xe7e700e7, 0x71710071, 0xd4d400d4, 0xabab00ab, 
        0x88880088, 0x8d8d008d, 0x72720072, 0xb9b900b9, 0xf8f800f8, 0xacac00ac, 0x36360036, 0x2a2a002a, 0x3c3c003c, 0xf1f100f1, 
        0x40400040, 0xd3d300d3, 0xbbbb00bb, 0x43430043, 0x15150015, 0xadad00ad, 0x77770077, 0x80800080, 0x82820082, 0xecec00ec, 
        0x27270027, 0xe5e500e5, 0x85850085, 0x35350035, 0xc0c000c, 0x41410041, 0xefef00ef, 0x93930093, 0x19190019, 0x21210021, 
        0xe0e000e, 0x4e4e004e, 0x65650065, 0xbdbd00bd, 0xb8b800b8, 0x8f8f008f, 0xebeb00eb, 0xcece00ce, 0x30300030, 0x5f5f005f, 
        0xc5c500c5, 0x1a1a001a, 0xe1e100e1, 0xcaca00ca, 0x47470047, 0x3d3d003d, 0x1010001, 0xd6d600d6, 0x56560056, 0x4d4d004d, 
        0xd0d000d, 0x66660066, 0xcccc00cc, 0x2d2d002d, 0x12120012, 0x20200020, 0xb1b100b1, 0x99990099, 0x4c4c004c, 0xc2c200c2, 
        0x7e7e007e, 0x5050005, 0xb7b700b7, 0x31310031, 0x17170017, 0xd7d700d7, 0x58580058, 0x61610061, 0x1b1b001b, 0x1c1c001c, 
        0xf0f000f, 0x16160016, 0x18180018, 0x22220022, 0x44440044, 0xb2b200b2, 0xb5b500b5, 0x91910091, 0x8080008, 0xa8a800a8, 
        0xfcfc00fc, 0x50500050, 0xd0d000d0, 0x7d7d007d, 0x89890089, 0x97970097, 0x5b5b005b, 0x95950095, -65281, 0xd2d200d2, 
        0xc4c400c4, 0x48480048, 0xf7f700f7, 0xdbdb00db, 0x3030003, 0xdada00da, 0x3f3f003f, 0x94940094, 0x5c5c005c, 0x2020002, 
        0x4a4a004a, 0x33330033, 0x67670067, 0xf3f300f3, 0x7f7f007f, 0xe2e200e2, 0x9b9b009b, 0x26260026, 0x37370037, 0x3b3b003b, 
        0x96960096, 0x4b4b004b, 0xbebe00be, 0x2e2e002e, 0x79790079, 0x8c8c008c, 0x6e6e006e, 0x8e8e008e, 0xf5f500f5, 0xb6b600b6, 
        0xfdfd00fd, 0x59590059, 0x98980098, 0x6a6a006a, 0x46460046, 0xbaba00ba, 0x25250025, 0x42420042, 0xa2a200a2, 0xfafa00fa, 
        0x7070007, 0x55550055, 0xeeee00ee, 0xa0a000a, 0x49490049, 0x68680068, 0x38380038, 0xa4a400a4, 0x28280028, 0x7b7b007b, 
        0xc9c900c9, 0xc1c100c1, 0xe3e300e3, 0xf4f400f4, 0xc7c700c7, 0x9e9e009e
    };
    private static final int SIGMA[] = {
        0xa09e667f, 0x3bcc908b, 0xb67ae858, 0x4caa73b2, 0xc6ef372f, 0xe94f82be, 0x54ff53a5, 0xf1d36f1c, 0x10e527fa, 0xde682d1d, 
        0xb05688c2, 0xb3e6c1fd
    };
    private boolean _keyIs128;
    private boolean initialised;
    private int ke[];
    private int kw[];
    private int state[];
    private int subkey[];

    public CamelliaEngine()
    {
        initialised = false;
        subkey = new int[96];
        kw = new int[8];
        ke = new int[12];
        state = new int[4];
    }

    private int bytes2int(byte abyte0[], int i)
    {
        int j = 0;
        int k = 0;
        for (; j < 4; j++)
        {
            k = (k << 8) + (abyte0[j + i] & 0xff);
        }

        return k;
    }

    private void camelliaF2(int ai[], int ai1[], int i)
    {
        int j = ai[0] ^ ai1[i + 0];
        int k = SBOX4_4404[j & 0xff];
        int l = SBOX3_3033[j >>> 8 & 0xff];
        int i1 = SBOX2_0222[j >>> 16 & 0xff];
        j = SBOX1_1110[j >>> 24 & 0xff] ^ (k ^ l ^ i1);
        k = ai[1] ^ ai1[i + 1];
        l = SBOX1_1110[k & 0xff];
        i1 = SBOX4_4404[k >>> 8 & 0xff];
        int j1 = SBOX3_3033[k >>> 16 & 0xff];
        k = SBOX2_0222[k >>> 24 & 0xff] ^ (l ^ i1 ^ j1);
        ai[2] = ai[2] ^ (j ^ k);
        l = ai[3];
        ai[3] = rightRotate(j, 8) ^ (k ^ j) ^ l;
        j = ai[2] ^ ai1[i + 2];
        k = SBOX4_4404[j & 0xff];
        l = SBOX3_3033[j >>> 8 & 0xff];
        i1 = SBOX2_0222[j >>> 16 & 0xff];
        j = SBOX1_1110[j >>> 24 & 0xff] ^ (k ^ l ^ i1);
        i = ai[3] ^ ai1[i + 3];
        k = SBOX1_1110[i & 0xff];
        l = SBOX4_4404[i >>> 8 & 0xff];
        i1 = SBOX3_3033[i >>> 16 & 0xff];
        i = SBOX2_0222[i >>> 24 & 0xff] ^ (k ^ l ^ i1);
        ai[0] = ai[0] ^ (j ^ i);
        k = ai[1];
        ai[1] = rightRotate(j, 8) ^ (i ^ j) ^ k;
    }

    private void camelliaFLs(int ai[], int ai1[], int i)
    {
        ai[1] = ai[1] ^ leftRotate(ai[0] & ai1[i + 0], 1);
        ai[0] = ai[0] ^ (ai1[i + 1] | ai[1]);
        ai[2] = ai[2] ^ (ai1[i + 3] | ai[3]);
        ai[3] = ai[3] ^ leftRotate(ai1[i + 2] & ai[2], 1);
    }

    private static void decroldq(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 2] = ai[j + 0] << i | ai[j + 1] >>> 32 - i;
        ai1[k + 3] = ai[j + 1] << i | ai[j + 2] >>> 32 - i;
        ai1[k + 0] = ai[j + 2] << i | ai[j + 3] >>> 32 - i;
        ai1[k + 1] = ai[j + 3] << i | ai[j + 0] >>> 32 - i;
        ai[j + 0] = ai1[k + 2];
        ai[j + 1] = ai1[k + 3];
        ai[j + 2] = ai1[k + 0];
        ai[j + 3] = ai1[k + 1];
    }

    private static void decroldqo32(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 2] = ai[j + 1] << i - 32 | ai[j + 2] >>> 64 - i;
        ai1[k + 3] = ai[j + 2] << i - 32 | ai[j + 3] >>> 64 - i;
        ai1[k + 0] = ai[j + 3] << i - 32 | ai[j + 0] >>> 64 - i;
        ai1[k + 1] = ai[j + 0] << i - 32 | ai[j + 1] >>> 64 - i;
        ai[j + 0] = ai1[k + 2];
        ai[j + 1] = ai1[k + 3];
        ai[j + 2] = ai1[k + 0];
        ai[j + 3] = ai1[k + 1];
    }

    private void int2bytes(int i, byte abyte0[], int j)
    {
        boolean flag = false;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < 4; i++)
        {
            abyte0[(3 - i) + j] = (byte)k;
            k >>>= 8;
        }

    }

    private static int leftRotate(int i, int j)
    {
        return (i << j) + (i >>> 32 - j);
    }

    private int processBlock128(byte abyte0[], int i, byte abyte1[], int j)
    {
        for (int k = 0; k < 4; k++)
        {
            state[k] = bytes2int(abyte0, k * 4 + i);
            int ai[] = state;
            ai[k] = ai[k] ^ kw[k];
        }

        camelliaF2(state, subkey, 0);
        camelliaF2(state, subkey, 4);
        camelliaF2(state, subkey, 8);
        camelliaFLs(state, ke, 0);
        camelliaF2(state, subkey, 12);
        camelliaF2(state, subkey, 16);
        camelliaF2(state, subkey, 20);
        camelliaFLs(state, ke, 4);
        camelliaF2(state, subkey, 24);
        camelliaF2(state, subkey, 28);
        camelliaF2(state, subkey, 32);
        abyte0 = state;
        abyte0[2] = abyte0[2] ^ kw[4];
        abyte0 = state;
        abyte0[3] = abyte0[3] ^ kw[5];
        abyte0 = state;
        abyte0[0] = abyte0[0] ^ kw[6];
        abyte0 = state;
        abyte0[1] = abyte0[1] ^ kw[7];
        int2bytes(state[2], abyte1, j);
        int2bytes(state[3], abyte1, j + 4);
        int2bytes(state[0], abyte1, j + 8);
        int2bytes(state[1], abyte1, j + 12);
        return 16;
    }

    private int processBlock192or256(byte abyte0[], int i, byte abyte1[], int j)
    {
        for (int k = 0; k < 4; k++)
        {
            state[k] = bytes2int(abyte0, k * 4 + i);
            int ai[] = state;
            ai[k] = ai[k] ^ kw[k];
        }

        camelliaF2(state, subkey, 0);
        camelliaF2(state, subkey, 4);
        camelliaF2(state, subkey, 8);
        camelliaFLs(state, ke, 0);
        camelliaF2(state, subkey, 12);
        camelliaF2(state, subkey, 16);
        camelliaF2(state, subkey, 20);
        camelliaFLs(state, ke, 4);
        camelliaF2(state, subkey, 24);
        camelliaF2(state, subkey, 28);
        camelliaF2(state, subkey, 32);
        camelliaFLs(state, ke, 8);
        camelliaF2(state, subkey, 36);
        camelliaF2(state, subkey, 40);
        camelliaF2(state, subkey, 44);
        abyte0 = state;
        abyte0[2] = abyte0[2] ^ kw[4];
        abyte0 = state;
        abyte0[3] = abyte0[3] ^ kw[5];
        abyte0 = state;
        abyte0[0] = abyte0[0] ^ kw[6];
        abyte0 = state;
        abyte0[1] = abyte0[1] ^ kw[7];
        int2bytes(state[2], abyte1, j);
        int2bytes(state[3], abyte1, j + 4);
        int2bytes(state[0], abyte1, j + 8);
        int2bytes(state[1], abyte1, j + 12);
        return 16;
    }

    private static int rightRotate(int i, int j)
    {
        return (i >>> j) + (i << 32 - j);
    }

    private static void roldq(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 0] = ai[j + 0] << i | ai[j + 1] >>> 32 - i;
        ai1[k + 1] = ai[j + 1] << i | ai[j + 2] >>> 32 - i;
        ai1[k + 2] = ai[j + 2] << i | ai[j + 3] >>> 32 - i;
        ai1[k + 3] = ai[j + 3] << i | ai[j + 0] >>> 32 - i;
        ai[j + 0] = ai1[k + 0];
        ai[j + 1] = ai1[k + 1];
        ai[j + 2] = ai1[k + 2];
        ai[j + 3] = ai1[k + 3];
    }

    private static void roldqo32(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 0] = ai[j + 1] << i - 32 | ai[j + 2] >>> 64 - i;
        ai1[k + 1] = ai[j + 2] << i - 32 | ai[j + 3] >>> 64 - i;
        ai1[k + 2] = ai[j + 3] << i - 32 | ai[j + 0] >>> 64 - i;
        ai1[k + 3] = ai[j + 0] << i - 32 | ai[j + 1] >>> 64 - i;
        ai[j + 0] = ai1[k + 0];
        ai[j + 1] = ai1[k + 1];
        ai[j + 2] = ai1[k + 2];
        ai[j + 3] = ai1[k + 3];
    }

    private void setKey(boolean flag, byte abyte0[])
    {
        int ai[];
        int ai1[];
        int ai2[];
        int ai3[];
        ai = new int[8];
        ai1 = new int[4];
        ai2 = new int[4];
        ai3 = new int[4];
        abyte0.length;
        JVM INSTR lookupswitch 3: default 56
    //                   16: 67
    //                   24: 162
    //                   32: 246;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
_L2:
        _keyIs128 = true;
        ai[0] = bytes2int(abyte0, 0);
        ai[1] = bytes2int(abyte0, 4);
        ai[2] = bytes2int(abyte0, 8);
        ai[3] = bytes2int(abyte0, 12);
        ai[7] = 0;
        ai[6] = 0;
        ai[5] = 0;
        ai[4] = 0;
_L6:
        for (int i = 0; i < 4; i++)
        {
            ai1[i] = ai[i] ^ ai[i + 4];
        }

        break; /* Loop/switch isn't completed */
_L3:
        ai[0] = bytes2int(abyte0, 0);
        ai[1] = bytes2int(abyte0, 4);
        ai[2] = bytes2int(abyte0, 8);
        ai[3] = bytes2int(abyte0, 12);
        ai[4] = bytes2int(abyte0, 16);
        ai[5] = bytes2int(abyte0, 20);
        ai[6] = ~ai[4];
        ai[7] = ~ai[5];
        _keyIs128 = false;
        continue; /* Loop/switch isn't completed */
_L4:
        ai[0] = bytes2int(abyte0, 0);
        ai[1] = bytes2int(abyte0, 4);
        ai[2] = bytes2int(abyte0, 8);
        ai[3] = bytes2int(abyte0, 12);
        ai[4] = bytes2int(abyte0, 16);
        ai[5] = bytes2int(abyte0, 20);
        ai[6] = bytes2int(abyte0, 24);
        ai[7] = bytes2int(abyte0, 28);
        _keyIs128 = false;
        if (true) goto _L6; else goto _L5
_L5:
        camelliaF2(ai1, SIGMA, 0);
        for (int j = 0; j < 4; j++)
        {
            ai1[j] = ai1[j] ^ ai[j];
        }

        camelliaF2(ai1, SIGMA, 4);
        if (_keyIs128)
        {
            if (flag)
            {
                kw[0] = ai[0];
                kw[1] = ai[1];
                kw[2] = ai[2];
                kw[3] = ai[3];
                roldq(15, ai, 0, subkey, 4);
                roldq(30, ai, 0, subkey, 12);
                roldq(15, ai, 0, ai3, 0);
                subkey[18] = ai3[2];
                subkey[19] = ai3[3];
                roldq(17, ai, 0, ke, 4);
                roldq(17, ai, 0, subkey, 24);
                roldq(17, ai, 0, subkey, 32);
                subkey[0] = ai1[0];
                subkey[1] = ai1[1];
                subkey[2] = ai1[2];
                subkey[3] = ai1[3];
                roldq(15, ai1, 0, subkey, 8);
                roldq(15, ai1, 0, ke, 0);
                roldq(15, ai1, 0, ai3, 0);
                subkey[16] = ai3[0];
                subkey[17] = ai3[1];
                roldq(15, ai1, 0, subkey, 20);
                roldqo32(34, ai1, 0, subkey, 28);
                roldq(17, ai1, 0, kw, 4);
                return;
            } else
            {
                kw[4] = ai[0];
                kw[5] = ai[1];
                kw[6] = ai[2];
                kw[7] = ai[3];
                decroldq(15, ai, 0, subkey, 28);
                decroldq(30, ai, 0, subkey, 20);
                decroldq(15, ai, 0, ai3, 0);
                subkey[16] = ai3[0];
                subkey[17] = ai3[1];
                decroldq(17, ai, 0, ke, 0);
                decroldq(17, ai, 0, subkey, 8);
                decroldq(17, ai, 0, subkey, 0);
                subkey[34] = ai1[0];
                subkey[35] = ai1[1];
                subkey[32] = ai1[2];
                subkey[33] = ai1[3];
                decroldq(15, ai1, 0, subkey, 24);
                decroldq(15, ai1, 0, ke, 4);
                decroldq(15, ai1, 0, ai3, 0);
                subkey[18] = ai3[2];
                subkey[19] = ai3[3];
                decroldq(15, ai1, 0, subkey, 12);
                decroldqo32(34, ai1, 0, subkey, 4);
                roldq(17, ai1, 0, kw, 0);
                return;
            }
        }
        for (int k = 0; k < 4; k++)
        {
            ai2[k] = ai1[k] ^ ai[k + 4];
        }

        camelliaF2(ai2, SIGMA, 8);
        if (flag)
        {
            kw[0] = ai[0];
            kw[1] = ai[1];
            kw[2] = ai[2];
            kw[3] = ai[3];
            roldqo32(45, ai, 0, subkey, 16);
            roldq(15, ai, 0, ke, 4);
            roldq(17, ai, 0, subkey, 32);
            roldqo32(34, ai, 0, subkey, 44);
            roldq(15, ai, 4, subkey, 4);
            roldq(15, ai, 4, ke, 0);
            roldq(30, ai, 4, subkey, 24);
            roldqo32(34, ai, 4, subkey, 36);
            roldq(15, ai1, 0, subkey, 8);
            roldq(30, ai1, 0, subkey, 20);
            ke[8] = ai1[1];
            ke[9] = ai1[2];
            ke[10] = ai1[3];
            ke[11] = ai1[0];
            roldqo32(49, ai1, 0, subkey, 40);
            subkey[0] = ai2[0];
            subkey[1] = ai2[1];
            subkey[2] = ai2[2];
            subkey[3] = ai2[3];
            roldq(30, ai2, 0, subkey, 12);
            roldq(30, ai2, 0, subkey, 28);
            roldqo32(51, ai2, 0, kw, 4);
            return;
        } else
        {
            kw[4] = ai[0];
            kw[5] = ai[1];
            kw[6] = ai[2];
            kw[7] = ai[3];
            decroldqo32(45, ai, 0, subkey, 28);
            decroldq(15, ai, 0, ke, 4);
            decroldq(17, ai, 0, subkey, 12);
            decroldqo32(34, ai, 0, subkey, 0);
            decroldq(15, ai, 4, subkey, 40);
            decroldq(15, ai, 4, ke, 8);
            decroldq(30, ai, 4, subkey, 20);
            decroldqo32(34, ai, 4, subkey, 8);
            decroldq(15, ai1, 0, subkey, 36);
            decroldq(30, ai1, 0, subkey, 24);
            ke[2] = ai1[1];
            ke[3] = ai1[2];
            ke[0] = ai1[3];
            ke[1] = ai1[0];
            decroldqo32(49, ai1, 0, subkey, 4);
            subkey[46] = ai2[0];
            subkey[47] = ai2[1];
            subkey[44] = ai2[2];
            subkey[45] = ai2[3];
            decroldq(30, ai2, 0, subkey, 32);
            decroldq(30, ai2, 0, subkey, 16);
            roldqo32(51, ai2, 0, kw, 0);
            return;
        }
    }

    public String getAlgorithmName()
    {
        return "Camellia";
    }

    public int getBlockSize()
    {
        return 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        } else
        {
            setKey(flag, ((KeyParameter)cipherparameters).getKey());
            initialised = true;
            return;
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException
    {
        if (!initialised)
        {
            throw new IllegalStateException("Camellia engine not initialised");
        }
        if (i + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (_keyIs128)
        {
            return processBlock128(abyte0, i, abyte1, j);
        } else
        {
            return processBlock192or256(abyte0, i, abyte1, j);
        }
    }

    public void reset()
    {
    }

}
