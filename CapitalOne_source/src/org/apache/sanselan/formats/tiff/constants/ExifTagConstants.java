// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.constants;


// Referenced classes of package org.apache.sanselan.formats.tiff.constants:
//            TiffDirectoryConstants, TiffFieldTypeConstants, TagInfo

public interface ExifTagConstants
    extends TiffDirectoryConstants, TiffFieldTypeConstants
{

    public static final TagInfo A = new TagInfo("Image Description", 270, g_, 1, fQ);
    public static final TagInfo B = new TagInfo("Make", 271, g_, 1, fQ);
    public static final TagInfo C = new TagInfo("Model", 272, g_, 1, fQ);
    public static final TagInfo D = new TagInfo.Offset("Preview Image Start", 273, fS, fQ);
    public static final TagInfo E = new TagInfo.Offset("Preview Image Start", 273, fS, fZ);
    public static final TagInfo F = new TagInfo.Offset("Jpg From Raw Start", 273, fS, ga);
    public static final TagInfo G = new TagInfo("Orientation", 274, fR, 1, fQ);
    public static final TagInfo H = new TagInfo("Samples Per Pixel", 277, fR, 1, fQ);
    public static final TagInfo I = new TagInfo("Rows Per Strip", 278, fS, 1, fQ);
    public static final TagInfo J = new TagInfo("Preview Image Length", 279, fS, 1, fQ);
    public static final TagInfo K = new TagInfo("Preview Image Length", 279, fS, 1, fZ);
    public static final TagInfo L = new TagInfo("Jpg From Raw Length", 279, fS, 1, ga);
    public static final TagInfo M = new TagInfo("Min Sample Value", 280, fR, 1, fQ);
    public static final TagInfo N = new TagInfo("Max Sample Value", 281, fR, 1, fQ);
    public static final TagInfo O = new TagInfo("XResolution", 282, h_, 1, fQ);
    public static final TagInfo P = new TagInfo("YResolution", 283, h_, 1, fQ);
    public static final TagInfo R = new TagInfo("Page Name", 285, g_, 1, fQ);
    public static final TagInfo S = new TagInfo("XPosition", 286, h_, 1, fQ);
    public static final TagInfo T = new TagInfo("YPosition", 287, h_, 1, fQ);
    public static final TagInfo U = new TagInfo("Free Offsets", 288, gn, 1, gf);
    public static final TagInfo V = new TagInfo("Free Byte Counts", 289, gn, 1, gf);
    public static final TagInfo W = new TagInfo("Gray Response Unit", 290, fR, 1, fQ);
    public static final TagInfo X = new TagInfo("Gray Response Curve", 291, gn, 1, gf);
    public static final TagInfo Y = new TagInfo("T4 Options", 292, gn, 1, gf);
    public static final TagInfo Z = new TagInfo("T6 Options", 293, gn, 1, gf);
    public static final TagInfo aA = new TagInfo("Extra Samples", 338, gn, 1, gf);
    public static final TagInfo aB = new TagInfo("Sample Format", 339, gn, 1, gf);
    public static final TagInfo aC = new TagInfo("SMin Sample Value", 340, gn, 1, gf);
    public static final TagInfo aD = new TagInfo("SMax Sample Value", 341, gn, 1, gf);
    public static final TagInfo aE = new TagInfo("Transfer Range", 342, gn, 1, gf);
    public static final TagInfo aF = new TagInfo("Clip Path", 343, gn, 1, gf);
    public static final TagInfo aG = new TagInfo("XClip Path Units", 344, gn, 1, gf);
    public static final TagInfo aH = new TagInfo("YClip Path Units", 345, gn, 1, gf);
    public static final TagInfo aI = new TagInfo("Indexed", 346, gn, 1, gf);
    public static final TagInfo aK = new TagInfo("OPIProxy", 351, gn, 1, gf);
    public static final TagInfo aL = new TagInfo("Global Parameters IFD", 400, gn, 1, gf);
    public static final TagInfo aM = new TagInfo("Profile Type", 401, gn, 1, gf);
    public static final TagInfo aN = new TagInfo("Fax Profile", 402, gn, 1, gf);
    public static final TagInfo aO = new TagInfo("Coding Methods", 403, gn, 1, gf);
    public static final TagInfo aP = new TagInfo("Version Year", 404, gn, 1, gf);
    public static final TagInfo aQ = new TagInfo("Mode Number", 405, gn, 1, gf);
    public static final TagInfo aR = new TagInfo("Decode", 433, gn, 1, gf);
    public static final TagInfo aS = new TagInfo("Default Image Color", 434, gn, 1, gf);
    public static final TagInfo aT = new TagInfo("JPEGProc", 512, gn, 1, gf);
    public static final TagInfo aT_ = new TagInfo("Planar Configuration", 284, fR, 1, fQ);
    public static final TagInfo aU = new TagInfo("Preview Image Start", 513, fS, 1, gc);
    public static final TagInfo aU_ = new TagInfo("JPEGTables", 347, gn, 1, gf);
    public static final TagInfo aV = new TagInfo.Offset("Jpg From Raw Start", 513, fS, fY);
    public static final TagInfo aW = new TagInfo.Offset("Jpg From Raw Start", 513, fS, fV);
    public static final TagInfo aX = new TagInfo.Offset("Other Image Start", 513, gn, 1, gf);
    public static final TagInfo aY = new TagInfo("Preview Image Length", 514, fS, 1, gc);
    public static final TagInfo aZ = new TagInfo("Jpg From Raw Length", 514, fS, 1, fY);
    public static final TagInfo aa = new TagInfo("Resolution Unit", 296, fR, 1, fQ);
    public static final TagInfo ab = new TagInfo("Page Number", 297, fR, 2, fQ);
    public static final TagInfo ac = new TagInfo("Color Response Unit", 300, gn, 1, gf);
    public static final TagInfo ad = new TagInfo("Transfer Function", 301, gn, 1, gf);
    public static final TagInfo ae = new TagInfo("Software", 305, g_, 1, fQ);
    public static final TagInfo af = new TagInfo("Modify Date", 306, g_, 1, fQ);
    public static final TagInfo ag = new TagInfo("Artist", 315, g_, 1, fQ);
    public static final TagInfo ah = new TagInfo("Host Computer", 316, g_, 1, fQ);
    public static final TagInfo ai = new TagInfo("Predictor", 317, fR, 1, fQ);
    public static final TagInfo aj = new TagInfo("White Point", 318, h_, 2, fQ);
    public static final TagInfo ak = new TagInfo("Primary Chromaticities", 319, h_, 6, fQ);
    public static final TagInfo al = new TagInfo("Color Map", 320, gn, 1, gf);
    public static final TagInfo am = new TagInfo("Halftone Hints", 321, fR, 2, fQ);
    public static final TagInfo an = new TagInfo("Tile Width", 322, fS, 1, fQ);
    public static final TagInfo ao = new TagInfo("Tile Length", 323, fS, 1, fQ);
    public static final TagInfo ap = new TagInfo("Tile Offsets", 324, gn, 1, gf);
    public static final TagInfo aq = new TagInfo("Tile Byte Counts", 325, gn, 1, gf);
    public static final TagInfo ar = new TagInfo("Bad Fax Lines", 326, gn, 1, gf);
    public static final TagInfo as = new TagInfo("Clean Fax Data", 327, gn, 1, gf);
    public static final TagInfo at = new TagInfo("Consecutive Bad Fax Lines", 328, gn, 1, gf);
    public static final TagInfo au = new TagInfo("Sub IFD", 330, gn, 1, gf);
    public static final TagInfo av = new TagInfo("Ink Set", 332, fR, 1, fQ);
    public static final TagInfo aw = new TagInfo("Ink Names", 333, gn, 1, gf);
    public static final TagInfo ax = new TagInfo("Numberof Inks", 334, gn, 1, gf);
    public static final TagInfo ay = new TagInfo("Dot Range", 336, g_, 1, fQ);
    public static final TagInfo az = new TagInfo("Target Printer", 337, gn, 1, gf);
    public static final TagInfo bA = new TagInfo("CFARepeat Pattern Dim", 33421, gn, 1, gf);
    public static final TagInfo bB = new TagInfo("CFAPattern 2", 33422, gn, 1, gf);
    public static final TagInfo bC = new TagInfo("Battery Level", 33423, gn, 1, gf);
    public static final TagInfo bD = new TagInfo("Copyright", 33432, g_, 1, fQ);
    public static final TagInfo bE = new TagInfo("Exposure Time", 33434, h_, 1, gd);
    public static final TagInfo bF = new TagInfo("FNumber", 33437, h_, 1, gd);
    public static final TagInfo bG = new TagInfo("MDFile Tag", 33445, gn, 1, gf);
    public static final TagInfo bH = new TagInfo("MDScale Pixel", 33446, gn, 1, gf);
    public static final TagInfo bI = new TagInfo("MDColor Table", 33447, gn, 1, gf);
    public static final TagInfo bJ = new TagInfo("MDLab Name", 33448, gn, 1, gf);
    public static final TagInfo bK = new TagInfo("MDSample Info", 33449, gn, 1, gf);
    public static final TagInfo bL = new TagInfo("MDPrep Date", 33450, gn, 1, gf);
    public static final TagInfo bM = new TagInfo("MDPrep Time", 33451, gn, 1, gf);
    public static final TagInfo bN = new TagInfo("MDFile Units", 33452, gn, 1, gf);
    public static final TagInfo bO = new TagInfo("Pixel Scale", 33550, gn, 1, gf);
    public static final TagInfo bP = new TagInfo("IPTC- NAA", 33723, fS, 1, fQ);
    public static final TagInfo bQ = new TagInfo("Intergraph Packet Data", 33918, gn, 1, gf);
    public static final TagInfo bR = new TagInfo("Intergraph Flag Registers", 33919, gn, 1, gf);
    public static final TagInfo bS = new TagInfo("Intergraph Matrix", 33920, gn, 1, gf);
    public static final TagInfo bT = new TagInfo("Model Tie Point", 33922, gn, 1, gf);
    public static final TagInfo bU = new TagInfo("Site", 34016, gn, 1, gf);
    public static final TagInfo bV = new TagInfo("Color Sequence", 34017, gn, 1, gf);
    public static final TagInfo bW = new TagInfo("IT8 Header", 34018, gn, 1, gf);
    public static final TagInfo bX = new TagInfo("Raster Padding", 34019, gn, 1, gf);
    public static final TagInfo bY = new TagInfo("Bits Per Run Length", 34020, gn, 1, gf);
    public static final TagInfo bZ = new TagInfo("Bits Per Extended Run Length", 34021, gn, 1, gf);
    public static final TagInfo ba = new TagInfo("Jpg From Raw Length", 514, fS, 1, fV);
    public static final TagInfo bb = new TagInfo("Other Image Length", 514, gn, 1, gf);
    public static final TagInfo bc = new TagInfo("JPEGRestart Interval", 515, gn, 1, gf);
    public static final TagInfo bd = new TagInfo("JPEGLossless Predictors", 517, gn, 1, gf);
    public static final TagInfo be = new TagInfo("JPEGPoint Transforms", 518, gn, 1, gf);
    public static final TagInfo bf = new TagInfo("JPEGQTables", 519, gn, 1, gf);
    public static final TagInfo bg = new TagInfo("JPEGDCTables", 520, gn, 1, gf);
    public static final TagInfo bh = new TagInfo("JPEGACTables", 521, gn, 1, gf);
    public static final TagInfo bi = new TagInfo("YCbCr Coefficients", 529, h_, 3, fQ);
    public static final TagInfo bj = new TagInfo("YCbCr Sub Sampling", 530, fR, 2, fQ);
    public static final TagInfo bk = new TagInfo("YCbCr Positioning", 531, fR, 1, fQ);
    public static final TagInfo bl = new TagInfo("Reference Black White", 532, h_, 6, fQ);
    public static final TagInfo bm = new TagInfo("Strip Row Counts", 559, gn, 1, gf);
    public static final TagInfo bn = new TagInfo("Application Notes", 700, gn, 1, gf);
    public static final TagInfo bo = new TagInfo("Related Image File Format", 4096, g_, 1, gb);
    public static final TagInfo bp = new TagInfo("Related Image Width", 4097, fR, 1, gb);
    public static final TagInfo bq = new TagInfo("Related Image Length", 4098, fR, 1, gb);
    public static final TagInfo br = new TagInfo("Rating", 18246, fR, 1, fQ);
    public static final TagInfo bs = new TagInfo("Rating Percent", 18249, fR, 1, fQ);
    public static final TagInfo bt = new TagInfo("Image ID", 32781, gn, 1, gf);
    public static final TagInfo bu = new TagInfo("Wang Annotation", 32932, gn, 1, gf);
    public static final TagInfo bv = new TagInfo("Matteing", 32995, gn, 1, gf);
    public static final TagInfo bw = new TagInfo("Data Type", 32996, gn, 1, gf);
    public static final TagInfo bx = new TagInfo("Image Depth", 32997, gn, 1, gf);
    public static final TagInfo by = new TagInfo("Tile Depth", 32998, gn, 1, gf);
    public static final TagInfo bz = new TagInfo("Model 2", 33405, gn, 1, gf);
    public static final TagInfo cA = new TagInfo("Time Zone Offset", 34858, fW, -1, gd);
    public static final TagInfo cB = new TagInfo("Self Timer Mode", 34859, fR, 1, gd);
    public static final TagInfo cC = new TagInfo("Fax Recv Params", 34908, gn, 1, gf);
    public static final TagInfo cD = new TagInfo("Fax Sub Address", 34909, gn, 1, gf);
    public static final TagInfo cE = new TagInfo("Fax Recv Time", 34910, gn, 1, gf);
    public static final TagInfo cF = new TagInfo("Leaf Sub IFD", 34954, gn, 1, gf);
    public static final TagInfo cG = new TagInfo("Exif Version", 36864, i_, 1, gd);
    public static final TagInfo cH = new TagInfo("Date Time Original", 36867, g_, 1, gd);
    public static final TagInfo cI = new TagInfo("Create Date", 36868, g_, 1, gd);
    public static final TagInfo cJ = new TagInfo("Components Configuration", 37121, i_, 1, gd);
    public static final TagInfo cK = new TagInfo("Compressed Bits Per Pixel", 37122, h_, 1, gd);
    public static final TagInfo cL = new TagInfo("Shutter Speed Value", 37377, k_, 1, gd);
    public static final TagInfo cM = new TagInfo("Aperture Value", 37378, h_, 1, gd);
    public static final TagInfo cN = new TagInfo("Brightness Value", 37379, k_, 1, gd);
    public static final TagInfo cO = new TagInfo("Exposure Compensation", 37380, k_, 1, gd);
    public static final TagInfo cP = new TagInfo("Max Aperture Value", 37381, h_, 1, gd);
    public static final TagInfo cQ = new TagInfo("Subject Distance", 37382, h_, 1, gd);
    public static final TagInfo cR = new TagInfo("Metering Mode", 37383, fR, 1, gd);
    public static final TagInfo cS = new TagInfo("Light Source", 37384, fR, 1, gd);
    public static final TagInfo cT = new TagInfo("Flash", 37385, fR, 1, gd);
    public static final TagInfo cU = new TagInfo("Focal Length", 37386, h_, 1, gd);
    public static final TagInfo cV = new TagInfo("Flash Energy", 37387, gn, 1, gf);
    public static final TagInfo cW = new TagInfo("Spatial Frequency Response", 37388, gn, 1, gf);
    public static final TagInfo cX = new TagInfo("Noise", 37389, gn, 1, gf);
    public static final TagInfo cY = new TagInfo("Focal Plane XResolution", 37390, gn, 1, gf);
    public static final TagInfo cZ = new TagInfo("Focal Plane YResolution", 37391, gn, 1, gf);
    public static final TagInfo ca = new TagInfo("Color Table", 34022, gn, 1, gf);
    public static final TagInfo cb = new TagInfo("Image Color Indicator", 34023, gn, 1, gf);
    public static final TagInfo cc = new TagInfo("Background Color Indicator", 34024, gn, 1, gf);
    public static final TagInfo cd = new TagInfo("Image Color Value", 34025, gn, 1, gf);
    public static final TagInfo ce = new TagInfo("Background Color Value", 34026, gn, 1, gf);
    public static final TagInfo cf = new TagInfo("Pixel Intensity Range", 34027, gn, 1, gf);
    public static final TagInfo cg = new TagInfo("Transparency Indicator", 34028, gn, 1, gf);
    public static final TagInfo ch = new TagInfo("Color Characterization", 34029, gn, 1, gf);
    public static final TagInfo ci = new TagInfo("HCUsage", 34030, gn, 1, gf);
    public static final TagInfo cj = new TagInfo("SEMInfo", 34118, g_, 1, fQ);
    public static final TagInfo ck = new TagInfo("AFCP_ IPTC", 34152, gn, 1, gf);
    public static final TagInfo cl = new TagInfo("Model Transform", 34264, gn, 1, gf);
    public static final TagInfo cm = new TagInfo("Leaf Data", 34310, gn, 1, gf);
    public static final TagInfo cn = new TagInfo("Photoshop Settings", 34377, gn, 1, gf);
    public static final TagInfo co = new TagInfo.Offset("Exif Offset", 34665, gn, 1, gf);
    public static final TagInfo cp = new TagInfo("ICC_ Profile", 34675, gn, 1, gf);
    public static final TagInfo cq = new TagInfo("Image Layer", 34732, gn, 1, gf);
    public static final TagInfo cr = new TagInfo("Geo Tiff Directory", 34735, gn, 1, gf);
    public static final TagInfo cs = new TagInfo("Geo Tiff Double Params", 34736, gn, 1, gf);
    public static final TagInfo ct = new TagInfo("Geo Tiff Ascii Params", 34737, gn, 1, gf);
    public static final TagInfo cu = new TagInfo("Exposure Program", 34850, fR, 1, gd);
    public static final TagInfo cv = new TagInfo("Spectral Sensitivity", 34852, g_, 1, gd);
    public static final TagInfo cw = new TagInfo.Offset("GPSInfo", 34853, gn, 1, gf);
    public static final TagInfo cx = new TagInfo("ISO", 34855, fR, 1, gd);
    public static final TagInfo cy = new TagInfo("Opto - Electric Conv Factor", 34856, gn, 1, gf);
    public static final TagInfo cz = new TagInfo("Interlace", 34857, gn, 1, gf);
    public static final TagInfo dA = new TagInfo("Flash Energy", 41483, h_, -1, gd);
    public static final TagInfo dB = new TagInfo("Spatial Frequency Response", 41484, gn, 1, gf);
    public static final TagInfo dC = new TagInfo("Noise", 41485, gn, 1, gf);
    public static final TagInfo dD = new TagInfo("Focal Plane XResolution", 41486, h_, 1, gd);
    public static final TagInfo dE = new TagInfo("Focal Plane YResolution", 41487, h_, 1, gd);
    public static final TagInfo dF = new TagInfo("Focal Plane Resolution Unit", 41488, fR, 1, gd);
    public static final TagInfo dG = new TagInfo("Image Number", 41489, gn, 1, gf);
    public static final TagInfo dH = new TagInfo("Security Classification", 41490, gn, 1, gf);
    public static final TagInfo dI = new TagInfo("Image History", 41491, gn, 1, gf);
    public static final TagInfo dJ = new TagInfo("Subject Location", 41492, fR, 2, gd);
    public static final TagInfo dK = new TagInfo("Exposure Index", 41493, h_, 1, gd);
    public static final TagInfo dL = new TagInfo("TIFF- EPStandard ID", 41494, gn, 1, gf);
    public static final TagInfo dM = new TagInfo("Sensing Method", 41495, fR, 1, gd);
    public static final TagInfo dN = new TagInfo("File Source", 41728, i_, 1, gd);
    public static final TagInfo dO = new TagInfo("Scene Type", 41729, i_, 1, gd);
    public static final TagInfo dP = new TagInfo("CFAPattern", 41730, i_, 1, gd);
    public static final TagInfo dQ = new TagInfo("Custom Rendered", 41985, fR, 1, gd);
    public static final TagInfo dR = new TagInfo("Exposure Mode", 41986, fR, 1, gd);
    public static final TagInfo dS = new TagInfo("White Balance", 41987, fR, 1, gd);
    public static final TagInfo dT = new TagInfo("Digital Zoom Ratio", 41988, h_, 1, gd);
    public static final TagInfo dU = new TagInfo("Focal Length In 3 5mm Format", 41989, fR, 1, gd);
    public static final TagInfo dV = new TagInfo("Scene Capture Type", 41990, fR, 1, gd);
    public static final TagInfo dW = new TagInfo("Gain Control", 41991, fR, 1, gd);
    public static final TagInfo dX = new TagInfo("Contrast", 41992, fR, 1, gd);
    public static final TagInfo dY = new TagInfo("Saturation", 41993, fR, 1, gd);
    public static final TagInfo dZ = new TagInfo("Sharpness", 41994, fR, 1, gd);
    public static final TagInfo da = new TagInfo("Focal Plane Resolution Unit", 37392, gn, 1, gf);
    public static final TagInfo db = new TagInfo("Image Number", 37393, fS, 1, gd);
    public static final TagInfo dc = new TagInfo("Security Classification", 37394, g_, 1, gd);
    public static final TagInfo dd = new TagInfo("Image History", 37395, g_, 1, gd);
    public static final TagInfo de = new TagInfo("Subject Location", 37396, fR, 4, gd);
    public static final TagInfo df = new TagInfo("Exposure Index", 37397, gn, 1, gf);
    public static final TagInfo dg = new TagInfo("TIFF- EPStandard ID", 37398, gn, 1, gf);
    public static final TagInfo dh = new TagInfo("Sensing Method", 37399, gn, 1, gf);
    public static final TagInfo di = new TagInfo("Sto Nits", 37439, gn, 1, gf);
    public static final TagInfo dj = new TagInfo("Maker Note", 37500, i_, 1, gd);
    public static final TagInfo dk = new TagInfo.Text("UserComment", i_, gd);
    public static final TagInfo dl = new TagInfo("Sub Sec Time", 37520, g_, 1, gd);
    public static final TagInfo dm = new TagInfo("Sub Sec Time Original", 37521, g_, 1, gd);
    public static final TagInfo dn = new TagInfo("Sub Sec Time Digitized", 37522, g_, 1, gd);
    public static final TagInfo _flddo = new TagInfo("Image Source Data", 37724, i_, 1, fQ);
    public static final TagInfo dp = new TagInfo("XPTitle", 40091, fP, 1, fQ);
    public static final TagInfo dq = new TagInfo("XPComment", 40092, fP, 1, fQ);
    public static final TagInfo dr = new TagInfo("XPAuthor", 40093, fP, 1, fQ);
    public static final TagInfo ds = new TagInfo("XPKeywords", 40094, fP, 1, fQ);
    public static final TagInfo dt = new TagInfo("XPSubject", 40095, fP, 1, fQ);
    public static final TagInfo du = new TagInfo("Flashpix Version", 40960, i_, 1, gd);
    public static final TagInfo dv = new TagInfo("Color Space", 40961, fR, 1, gd);
    public static final TagInfo dw = new TagInfo("Exif Image Width", 40962, fR, 1, gd);
    public static final TagInfo dx = new TagInfo("Exif Image Length", 40963, fR, 1, gd);
    public static final TagInfo dy = new TagInfo("Related Sound File", 40964, g_, 1, gd);
    public static final TagInfo dz = new TagInfo.Offset("Interop Offset", 40965, gn, 1, gf);
    public static final TagInfo eA = new TagInfo("DNG Version", 50706, fP, 4, fQ);
    public static final TagInfo eB = new TagInfo("DNG Backward Version", 50707, fP, 4, fQ);
    public static final TagInfo eC = new TagInfo("Unique Camera Model", 50708, g_, 1, fQ);
    public static final TagInfo eD = new TagInfo("Localized Camera Model", 50709, g_, 1, fQ);
    public static final TagInfo eE = new TagInfo("CFAPlane Color", 50710, gn, 1, gf);
    public static final TagInfo eF = new TagInfo("CFALayout", 50711, gn, 1, gf);
    public static final TagInfo eG = new TagInfo("Linearization Table", 50712, gn, 1, gf);
    public static final TagInfo eH = new TagInfo("Black Level Repeat Dim", 50713, gn, 1, gf);
    public static final TagInfo eI = new TagInfo("Black Level", 50714, gn, 1, gf);
    public static final TagInfo eJ = new TagInfo("Black Level Delta H", 50715, gn, 1, gf);
    public static final TagInfo eK = new TagInfo("Black Level Delta V", 50716, gn, 1, gf);
    public static final TagInfo eL = new TagInfo("White Level", 50717, gn, 1, gf);
    public static final TagInfo eM = new TagInfo("Default Scale", 50718, h_, 2, fY);
    public static final TagInfo eN = new TagInfo("Default Crop Origin", 50719, fS, 2, fY);
    public static final TagInfo eO = new TagInfo("Default Crop Size", 50720, fS, 2, fY);
    public static final TagInfo eP = new TagInfo("Color Matrix 1", 50721, gn, 1, gf);
    public static final TagInfo eQ = new TagInfo("Color Matrix 2", 50722, gn, 1, gf);
    public static final TagInfo eR = new TagInfo("Camera Calibration 1", 50723, gn, 1, gf);
    public static final TagInfo eS = new TagInfo("Camera Calibration 2", 50724, gn, 1, gf);
    public static final TagInfo eT = new TagInfo("Reduction Matrix 1", 50725, gn, 1, gf);
    public static final TagInfo eU = new TagInfo("Reduction Matrix 2", 50726, gn, 1, gf);
    public static final TagInfo eV = new TagInfo("Analog Balance", 50727, gn, 1, gf);
    public static final TagInfo eW = new TagInfo("As Shot Neutral", 50728, gn, 1, gf);
    public static final TagInfo eX = new TagInfo("As Shot White XY", 50729, h_, 2, fQ);
    public static final TagInfo eY = new TagInfo("Baseline Exposure", 50730, k_, 1, fQ);
    public static final TagInfo eZ = new TagInfo("Baseline Noise", 50731, h_, 1, fQ);
    public static final TagInfo ea = new TagInfo("Device Setting Description", 41995, gn, 1, gf);
    public static final TagInfo eb = new TagInfo("Subject Distance Range", 41996, fR, 1, gd);
    public static final TagInfo ec = new TagInfo("Image Unique ID", 42016, g_, 1, gd);
    public static final TagInfo ed = new TagInfo("GDALMetadata", 42112, gn, 1, gf);
    public static final TagInfo ee = new TagInfo("GDALNo Data", 42113, gn, 1, gf);
    public static final TagInfo ef = new TagInfo("Gamma", 42240, h_, 1, gd);
    public static final TagInfo eg = new TagInfo("Pixel Format", 48129, gn, 1, gf);
    public static final TagInfo eh = new TagInfo("Transfomation", 48130, gn, 1, gf);
    public static final TagInfo ei = new TagInfo("Uncompressed", 48131, gn, 1, gf);
    public static final TagInfo ej = new TagInfo("Image Type", 48132, gn, 1, gf);
    public static final TagInfo ek = new TagInfo("Image Width", 48256, gn, 1, gf);
    public static final TagInfo el = new TagInfo("Image Height", 48257, gn, 1, gf);
    public static final TagInfo em = new TagInfo("Width Resolution", 48258, gn, 1, gf);
    public static final TagInfo en = new TagInfo("Height Resolution", 48259, gn, 1, gf);
    public static final TagInfo eo = new TagInfo("Image Offset", 48320, gn, 1, gf);
    public static final TagInfo ep = new TagInfo("Image Byte Count", 48321, gn, 1, gf);
    public static final TagInfo eq = new TagInfo("Alpha Offset", 48322, gn, 1, gf);
    public static final TagInfo er = new TagInfo("Alpha Byte Count", 48323, gn, 1, gf);
    public static final TagInfo es = new TagInfo("Image Data Discard", 48324, gn, 1, gf);
    public static final TagInfo et = new TagInfo("Alpha Data Discard", 48325, gn, 1, gf);
    public static final TagInfo eu = new TagInfo("Oce Scanjob Desc", 50215, gn, 1, gf);
    public static final TagInfo ev = new TagInfo("Oce Application Selector", 50216, gn, 1, gf);
    public static final TagInfo ew = new TagInfo("Oce IDNumber", 50217, gn, 1, gf);
    public static final TagInfo ex = new TagInfo("Oce Image Logic", 50218, gn, 1, gf);
    public static final TagInfo ey = new TagInfo("Annotations", 50255, gn, 1, gf);
    public static final TagInfo ez = new TagInfo("Print IM", 50341, i_, 1, fQ);
    public static final TagInfo fA = new TagInfo("Owner Name", 65000, g_, 1, gd);
    public static final TagInfo fB = new TagInfo("Serial Number", 65001, g_, 1, gd);
    public static final TagInfo fC = new TagInfo("Lens", 65002, g_, 1, gd);
    public static final TagInfo fD = new TagInfo("Raw File", 65100, g_, 1, gd);
    public static final TagInfo fE = new TagInfo("Converter", 65101, g_, 1, gd);
    public static final TagInfo fF = new TagInfo("White Balance", 65102, g_, 1, gd);
    public static final TagInfo fG = new TagInfo("Exposure", 65105, g_, 1, gd);
    public static final TagInfo fH = new TagInfo("Shadows", 65106, g_, 1, gd);
    public static final TagInfo fI = new TagInfo("Brightness", 65107, g_, 1, gd);
    public static final TagInfo fJ = new TagInfo("Contrast", 65108, g_, 1, gd);
    public static final TagInfo fK = new TagInfo("Saturation", 65109, g_, 1, gd);
    public static final TagInfo fL = new TagInfo("Sharpness", 65110, g_, 1, gd);
    public static final TagInfo fM = new TagInfo("Smoothness", 65111, g_, 1, gd);
    public static final TagInfo fN = new TagInfo("Moire Filter", 65112, g_, 1, gd);
    public static final TagInfo fO[] = {
        l, m, n, o, p, q, r, s, t, u, 
        v, w, x, y, z, A, B, C, D, E, 
        F, G, H, I, J, K, L, M, N, O, 
        P, aT_, R, S, T, U, V, W, X, Y, 
        Z, aa, ab, ac, ad, ae, af, ag, ah, ai, 
        aj, ak, al, am, an, ao, ap, aq, ar, as, 
        at, au, av, aw, ax, ay, az, aA, aB, aC, 
        aD, aE, aF, aG, aH, aI, aU_, aK, aL, aM, 
        aN, aO, aP, aQ, aR, aS, aT, aU, aV, aW, 
        aX, aY, aZ, ba, bb, bc, bd, be, bf, bg, 
        bh, bi, bj, bk, bl, bm, bn, bo, bp, bq, 
        br, bs, bt, bu, bv, bw, bx, by, bz, bA, 
        bB, bC, bD, bE, bF, bG, bH, bI, bJ, bK, 
        bL, bM, bN, bO, bP, bQ, bR, bS, bT, bU, 
        bV, bW, bX, bY, bZ, ca, cb, cc, cd, ce, 
        cf, cg, ch, ci, cj, ck, cl, cm, cn, co, 
        cp, cq, cr, cs, ct, cu, cv, cw, cx, cy, 
        cz, cA, cB, cC, cD, cE, cF, cG, cH, cI, 
        cJ, cK, cL, cM, cN, cO, cP, cQ, cR, cS, 
        cT, cU, cV, cW, cX, cY, cZ, da, db, dc, 
        dd, de, df, dg, dh, di, dl, dm, dn, _flddo, 
        dp, dq, dr, ds, dt, du, dv, dw, dx, dy, 
        dz, dA, dB, dC, dD, dE, dF, dG, dH, dI, 
        dJ, dK, dL, dM, dN, dO, dP, dQ, dR, dS, 
        dT, dU, dV, dW, dX, dY, dZ, ea, eb, ec, 
        ed, ee, ef, eg, eh, ei, ej, ek, el, em, 
        en, eo, ep, eq, er, es, et, eu, ev, ew, 
        ex, ey, ez, eA, eB, eC, eD, eE, eF, eG, 
        eH, eI, eJ, eK, eL, eM, eN, eO, eP, eQ, 
        eR, eS, eT, eU, eV, eW, eX, eY, eZ, fa, 
        fb, fc, fd, fe, ff, fg, fh, fi, fj, fk, 
        fl, fm, fn, fo, fp, fq, fr, fs, ft, fu, 
        fv, fw, fx, fy, fz, fA, fB, fC, fD, fE, 
        fF, fG, fH, fI, fJ, fK, fL, fM, fN, dk, 
        dj
    };
    public static final TagInfo fa = new TagInfo("Baseline Sharpness", 50732, h_, 1, fQ);
    public static final TagInfo fb = new TagInfo("Bayer Green Split", 50733, fS, 1, fY);
    public static final TagInfo fc = new TagInfo("Linear Response Limit", 50734, h_, 1, fQ);
    public static final TagInfo fd = new TagInfo("Camera Serial Number", 50735, g_, 1, fQ);
    public static final TagInfo fe = new TagInfo("DNG Lens Info", 50736, h_, 4, fQ);
    public static final TagInfo ff = new TagInfo("Chroma Blur Radius", 50737, h_, 1, fY);
    public static final TagInfo fg = new TagInfo("Anti Alias Strength", 50738, h_, 1, fY);
    public static final TagInfo fh = new TagInfo("Shadow Scale", 50739, h_, 1, fQ);
    public static final TagInfo fi = new TagInfo("DNG Adobe Data", 50740, gn, 1, gf);
    public static final TagInfo fj = new TagInfo("DNG Pentax Data", 50740, gn, 1, gf);
    public static final TagInfo fk = new TagInfo("DNG Private Data", 50740, gn, 1, gf);
    public static final TagInfo fl = new TagInfo("Maker Note Safety", 50741, fR, 1, fQ);
    public static final TagInfo fm = new TagInfo("Calibration Illuminant 1", 50778, fR, 1, fQ);
    public static final TagInfo fn = new TagInfo("Calibration Illuminant 2", 50779, fR, 1, fQ);
    public static final TagInfo fo = new TagInfo("Best Quality Scale", 50780, h_, 1, fY);
    public static final TagInfo fp = new TagInfo("Raw Data Unique ID", 50781, fP, 16, fQ);
    public static final TagInfo fq = new TagInfo("Alias Layer Metadata", 50784, gn, 1, gf);
    public static final TagInfo fr = new TagInfo("Original Raw File Name", 50827, g_, 1, fQ);
    public static final TagInfo fs = new TagInfo("Original Raw File Data", 50828, i_, 1, fQ);
    public static final TagInfo ft = new TagInfo("Active Area", 50829, fS, 4, fY);
    public static final TagInfo fu = new TagInfo("Masked Areas", 50830, fS, 4, fY);
    public static final TagInfo fv = new TagInfo("As Shot ICCProfile", 50831, gn, 1, gf);
    public static final TagInfo fw = new TagInfo("As Shot Pre Profile Matrix", 50832, gn, 1, gf);
    public static final TagInfo fx = new TagInfo("Current ICCProfile", 50833, gn, 1, gf);
    public static final TagInfo fy = new TagInfo("Current Pre Profile Matrix", 50834, gn, 1, gf);
    public static final TagInfo fz = new TagInfo("Offset Schema", 59933, j_, 1, gd);
    public static final TagInfo l = new TagInfo("Interop Index", 1, g_, 1, gb);
    public static final TagInfo m = new TagInfo("Interop Version", 2, i_, 1, gb);
    public static final TagInfo n = new TagInfo("Processing Software", 11, g_, 1, fQ);
    public static final TagInfo o = new TagInfo("Subfile Type", 254, fS, 1, fQ);
    public static final TagInfo p = new TagInfo("Old Subfile Type", 255, fR, 1, fQ);
    public static final TagInfo q = new TagInfo("Image Width", 256, fS, 1, fQ);
    public static final TagInfo r = new TagInfo("Image Height", 257, fS, 1, fQ);
    public static final TagInfo s = new TagInfo("Bits Per Sample", 258, fR, -1, fQ);
    public static final TagInfo t = new TagInfo("Compression", 259, fR, 1, fQ);
    public static final TagInfo u = new TagInfo("Photometric Interpretation", 262, fR, 1, fQ);
    public static final TagInfo v = new TagInfo("Thresholding", 263, fR, 1, fQ);
    public static final TagInfo w = new TagInfo("Cell Width", 264, fR, 1, fQ);
    public static final TagInfo x = new TagInfo("Cell Length", 265, fR, 1, fQ);
    public static final TagInfo y = new TagInfo("Fill Order", 266, fR, 1, fQ);
    public static final TagInfo z = new TagInfo("Document Name", 269, g_, 1, fQ);

}
