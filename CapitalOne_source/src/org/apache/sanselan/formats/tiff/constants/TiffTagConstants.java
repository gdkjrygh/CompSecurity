// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;


// Referenced classes of package org.apache.sanselan.formats.tiff.constants:
//            TiffDirectoryConstants, TiffFieldTypeConstants, TagInfo

public interface TiffTagConstants
    extends TiffDirectoryConstants, TiffFieldTypeConstants
{

    public static final TagInfo A_ = new TagInfo("Compression", 259, r_, 1, c_);
    public static final TagInfo B_ = new TagInfo("Photometric Interpretation", 262, r_, 1, c_);
    public static final TagInfo C_ = new TagInfo("Threshholding", 263, r_, 1, c_);
    public static final TagInfo D_ = new TagInfo("Cell Width", 264, r_, 1, c_);
    public static final TagInfo E_ = new TagInfo("Cell Length", 265, r_, 1, c_);
    public static final TagInfo F_ = new TagInfo("Fill Order", 266, r_, 1, c_);
    public static final TagInfo G_ = new TagInfo("Document Name", 269, gh, -1, c_);
    public static final TagInfo H_ = new TagInfo("Image Description", 270, gh, -1, c_);
    public static final TagInfo I_ = new TagInfo("Make", 271, gh, -1, c_);
    public static final TagInfo J_ = new TagInfo("Model", 272, gh, -1, c_);
    public static final TagInfo K_ = new TagInfo.Offset("Strip Offsets", 273, s_, -1, c_);
    public static final TagInfo L_ = new TagInfo("Orientation", 274, r_, 1, c_);
    public static final TagInfo M_ = new TagInfo("Samples Per Pixel", 277, r_, 1, c_);
    public static final TagInfo N_ = new TagInfo("Rows Per Strip", 278, s_, 1, c_);
    public static final TagInfo O_ = new TagInfo("Strip Byte Counts", 279, gi, -1, c_);
    public static final TagInfo P_ = new TagInfo("Min Sample Value", 280, r_, -1, c_);
    public static final TagInfo Q_ = new TagInfo("Max Sample Value", 281, r_, -1, c_);
    public static final TagInfo R_ = new TagInfo("XResolution", 282, gj, 1, c_);
    public static final TagInfo S_ = new TagInfo("YResolution", 283, gj, 1, c_);
    public static final TagInfo T_ = new TagInfo("Planar Configuration", 284, r_, 1, c_);
    public static final TagInfo U_ = new TagInfo("Page Name", 285, gh, -1, c_);
    public static final TagInfo V_ = new TagInfo("XPosition", 286, gj, -1, c_);
    public static final TagInfo W_ = new TagInfo("YPosition", 287, gj, -1, c_);
    public static final TagInfo X_ = new TagInfo("Free Offsets", 288, q_, -1, c_);
    public static final TagInfo Y_ = new TagInfo("Free Byte Counts", 289, q_, -1, c_);
    public static final TagInfo Z_ = new TagInfo("Gray Response Unit", 290, r_, 1, c_);
    public static final TagInfo aA_ = new TagInfo("SMin Sample Value", 340, gm, -1, c_);
    public static final TagInfo aB_ = new TagInfo("SMax Sample Value", 341, gm, -1, c_);
    public static final TagInfo aC_ = new TagInfo("Transfer Range", 342, r_, 6, c_);
    public static final TagInfo aD_ = new TagInfo("JPEGProc", 512, r_, 1, c_);
    public static final TagInfo aE_ = new TagInfo.Offset("JPEGInterchange Format", 513, q_, 1, c_);
    public static final TagInfo aF_ = new TagInfo("JPEGInterchange Format Length", 514, q_, 1, c_);
    public static final TagInfo aG_ = new TagInfo("JPEGRestart Interval", 515, r_, 1, c_);
    public static final TagInfo aH_ = new TagInfo("JPEGLossless Predictors", 517, r_, -1, c_);
    public static final TagInfo aI_ = new TagInfo("JPEGPoint Transforms", 518, r_, -1, c_);
    public static final TagInfo aJ[] = {
        v_, w_, x_, y_, z_, A_, B_, C_, D_, E_, 
        F_, G_, H_, I_, J_, K_, L_, M_, N_, O_, 
        P_, Q_, R_, S_, T_, U_, V_, W_, X_, Y_, 
        Z_, aa_, ab_, ac_, ad_, ae_, af_, ag_, ah_, ai_, 
        aj_, ak_, al_, am_, an_, ao_, ap_, aq_, ar_, as_, 
        at_, au_, av_, aw_, ax_, ay_, az_, aA_, aB_, aC_, 
        aD_, aE_, aF_, aG_, aH_, aI_, aJ_, aK_, aL_, aM_, 
        aN_, aO_, aP_, aQ_, aR_
    };
    public static final TagInfo aJ_ = new TagInfo("JPEGQTables", 519, q_, -1, c_);
    public static final TagInfo aK_ = new TagInfo("JPEGDCTables", 520, q_, -1, c_);
    public static final TagInfo aL_ = new TagInfo("JPEGACTables", 521, q_, -1, c_);
    public static final TagInfo aM_ = new TagInfo("YCbCr Coefficients", 529, gj, 3, c_);
    public static final TagInfo aN_ = new TagInfo("YCbCr Sub Sampling", 530, r_, 2, c_);
    public static final TagInfo aO_ = new TagInfo("YCbCr Positioning", 531, r_, 1, c_);
    public static final TagInfo aP_ = new TagInfo("Reference Black White", 532, q_, -1, c_);
    public static final TagInfo aQ_ = new TagInfo("Copyright", 33432, gh, -1, c_);
    public static final TagInfo aR_ = new TagInfo("XMP", 700, gl, -1, c_);
    public static final TagInfo aS_ = new TagInfo.Unknown("Unknown Tag", gn, gf);
    public static final TagInfo aa_ = new TagInfo("Gray Response Curve", 291, r_, -1, c_);
    public static final TagInfo ab_ = new TagInfo("T4 Options", 292, q_, 1, c_);
    public static final TagInfo ac_ = new TagInfo("T6 Options", 293, q_, 1, c_);
    public static final TagInfo ad_ = new TagInfo("Resolution Unit", 296, r_, 1, c_);
    public static final TagInfo ae_ = new TagInfo("Page Number", 297, r_, 2, c_);
    public static final TagInfo af_ = new TagInfo("Transfer Function", 301, r_, -1, c_);
    public static final TagInfo ag_ = new TagInfo("Software", 305, gh, -1, c_);
    public static final TagInfo ah_ = new TagInfo("Date Time", 306, gh, 20, c_);
    public static final TagInfo ai_ = new TagInfo("Artist", 315, gh, -1, c_);
    public static final TagInfo aj_ = new TagInfo("Host Computer", 316, gh, -1, c_);
    public static final TagInfo ak_ = new TagInfo("Predictor", 317, r_, 1, c_);
    public static final TagInfo al_ = new TagInfo("White Point", 318, gj, 2, c_);
    public static final TagInfo am_ = new TagInfo("Primary Chromaticities", 319, gj, 6, c_);
    public static final TagInfo an_ = new TagInfo("Color Map", 320, r_, -1, c_);
    public static final TagInfo ao_ = new TagInfo("Halftone Hints", 321, r_, 2, c_);
    public static final TagInfo ap_ = new TagInfo("Tile Width", 322, s_, 1, c_);
    public static final TagInfo aq_ = new TagInfo("Tile Length", 323, s_, 1, c_);
    public static final TagInfo ar_ = new TagInfo.Offset("Tile Offsets", 324, q_, -1, c_);
    public static final TagInfo as_ = new TagInfo("Tile Byte Counts", 325, s_, -1, c_);
    public static final TagInfo at_ = new TagInfo("Ink Set", 332, r_, 1, c_);
    public static final TagInfo au_ = new TagInfo("Ink Names", 333, gh, -1, c_);
    public static final TagInfo av_ = new TagInfo("Number Of Inks", 334, r_, 1, c_);
    public static final TagInfo aw_ = new TagInfo("Dot Range", 336, gk, -1, c_);
    public static final TagInfo ax_ = new TagInfo("Target Printer", 337, gh, -1, c_);
    public static final TagInfo ay_ = new TagInfo("Extra Samples", 338, gl, -1, c_);
    public static final TagInfo az_ = new TagInfo("Sample Format", 339, r_, -1, c_);
    public static final TagInfo v_ = new TagInfo("New Subfile Type", 254, q_, 1, c_);
    public static final TagInfo w_ = new TagInfo("Subfile Type", 255, r_, 1, c_);
    public static final TagInfo x_ = new TagInfo("Image Width", 256, s_, 1, c_);
    public static final TagInfo y_ = new TagInfo("Image Length", 257, s_, 1, c_);
    public static final TagInfo z_ = new TagInfo("Bits Per Sample", 258, r_, -1, c_);

}
