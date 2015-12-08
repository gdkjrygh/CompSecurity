// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.content.Context;
import android.content.Intent;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.miteksystems.misnap:
//            r

public class MiSnapAPI
{

    public static final String AllowVideoFrames = "AllowVideoFrames";
    public static final String AnimatedBug = "AnimatedBug";
    public static final String AnimationRectangleColor = "AnimationRectangleColor";
    public static final String AnimationRectangleCornerRadius = "AnimationRectangleCornerRadius";
    public static final String AnimationRectangleStrokeWidth = "AnimationRectangleStrokeWidth";
    public static final String AutoCaptureFailoverToStillCapture = "AutoCaptureFailoverToStillCapture";
    public static final String AutoTorchAppearanceDelay = "AutoTorchAppearanceDelay";
    public static final String AutoTorchLowLightMinimum = "AutoTorchLowLightMinimum";
    public static final String ButtonFirstTimeTutorialContinue = "ButtonFirstTimeTutorialContinue";
    public static final String ButtonManualHelpCancel = "ButtonManualHelpCancel";
    public static final String ButtonManualHelpContinue = "ButtonManualHelpContinue";
    public static final String ButtonTransitionTutorialCancel = "ButtonTransitionTutorialCancel";
    public static final String ButtonTransitionTutorialContinue = "ButtonTransitionTutorialContinue";
    public static final String ButtonVideoHelpCancel = "ButtonVideoHelpCancel";
    public static final String ButtonVideoHelpContinue = "ButtonVideoHelpContinue";
    public static final String ButtonVideoTutorialCancel = "ButtonVideoTutorialCancel";
    public static final String ButtonVideoTutorialContinue = "ButtonVideoTutorialContinue";
    public static final String CameraAutoCaptureProcess = "CameraAutoCaptureProcess";
    public static final String CameraBrightness = "CameraBrightness";
    public static final String CameraDegreesThreshold = "CameraDegreesThreshold";
    public static final String CameraFlash = "CameraFlash";
    public static final String CameraGForce = "CameraGForce";
    public static final String CameraGlare = "CameraGlare";
    public static final String CameraGuideImageAppearanceFillPercentage = "CameraGuideImageAppearanceFillPercentage";
    public static final String CameraGuideImageEnabled = "CameraGuideImageEnabled";
    public static final String CameraGuideImageReappearanceDelay = "CameraGuideImageReappearanceDelay";
    public static final String CameraGuideImageStillCameraAlpha = "CameraGuideImageStillCameraAlpha";
    public static final String CameraGuideImageStillCameraEnabled = "CameraGuideImageStillCameraEnabled";
    public static final String CameraInitialTimeoutInSeconds = "CameraInitialTimeoutInSeconds";
    public static final String CameraMaxTimeouts = "CameraMaxTimeouts";
    public static final String CameraMillisecondsDelay = "CameraMillisecondsDelay";
    public static final String CameraSharpness = "CameraSharpness";
    public static final String CameraTimeoutInSeconds = "CameraTimeoutInSeconds";
    public static final String CameraVideoAutoCaptureProcess = "CameraVideoAutoCaptureProcess";
    public static final String CameraViewfinderBoundingBox = "CameraViewfinderBoundingBox";
    public static final String CameraViewfinderBoundingBoxMaxDimension = "CameraViewfinderBoundingBoxMaxDimension";
    public static final String CameraViewfinderBoundingBoxMinDimension = "CameraViewfinderBoundingBoxMinDimension";
    public static final String CameraViewfinderMinFill = "CameraViewfinderMinFill";
    public static final String CameraViewfinderMinHorizontalFill = "CameraViewfinderMinHorizontalFill";
    public static final String CameraVignetteImageEnabled = "CameraVignetteImageEnabled";
    public static final String CameraVignetteImageManualModeEnabled = "CameraVignetteImageManualModeEnabled";
    public static final String CaptureAngle = "CaptureAngle";
    public static final String CaptureBrightness = "CaptureBrightness";
    public static final String CaptureGForce = "CaptureGForce";
    public static final String CaptureGlare = "CaptureGlare";
    public static final String CaptureMode = "CaptureMode";
    public static final String CaptureSharpness = "CaptureSharpness";
    public static final String ConsecutiveVideoFrames = "ConsecutiveVideoFrames";
    public static final String DeviceID = "DeviceID";
    public static final String FEATURE_MINIMUM_AUTO_CAPTURE_CAPABILITY = "com.miteksystems.misnap.FEATURE_MINIMUM_AUTO_CAPTURE_CAPABILITY";
    public static final String JOB_SETTINGS = "com.miteksystems.misnap.JobSettings";
    public static final String LightingStillCamera = "LightingStillCamera";
    public static final String LightingVideo = "LightingVideo";
    public static final String MIBI_DATA_VERSION = "1.2";
    public static final String MIPVersion = "MIPVersion";
    public static final String MiSnapLocale = "Locale";
    public static final String MiSnapLockView = "MiSnapLockView";
    public static final String MiSnapTutorialAcknowledgementEnabled = "MiSnapTutorialAcknowledgementEnabled";
    public static final String Name = "Name";
    public static final String RESULT_CAMERA_NOT_SUFFICIENT = "CameraNotSufficient";
    public static final String RESULT_CANCELED = "Cancelled";
    public static final String RESULT_CODE = "com.miteksystems.misnap.ResultCode";
    public static final String RESULT_IMAGE_QUALITY = "com.miteksystems.misnap.QUALITY";
    public static final String RESULT_METRICS = "ResultMetrics";
    public static final String RESULT_MIBI_DATA = "com.miteksystems.misnap.MIBI_DATA";
    public static final String RESULT_ORIGINAL_PIC_HEIGHT = "com.miteksystems.misnap.HEIGHT";
    public static final String RESULT_ORIGINAL_PIC_WIDTH = "com.miteksystems.misnap.WIDTH";
    public static final int RESULT_PICTURE_CODE = 3;
    public static final String RESULT_PICTURE_DATA = "com.miteksystems.misnap.PICTURE";
    public static final int RESULT_RETAKE = 2;
    public static final String RESULT_SUCCESS_STILL = "SuccessStillCamera";
    public static final String RESULT_SUCCESS_VIDEO = "SuccessVideo";
    public static final String RESULT_VIDEO_CAPTURE_FAILED = "VideoCaptureFailed";
    public static final String RequiredCompressionLevel = "RequiredCompressionLevel";
    public static final String RequiredMaxImageHeightAndWidth = "RequiredMaxImageHeightAndWidth";
    public static final String ScreenRotationSuspendTime = "ScreenRotationSuspendTime";
    public static final String ShortDescription = "ShortDescription";
    public static final String SmartBubbleApparanceDelay = "SmartBubbleApparanceDelay";
    public static final String SmartBubbleCumulativeErrorThreshold = "SmartBubbleCumulativeErrorThreshold";
    public static final String SmartBubbleEnabled = "SmartBubbleEnabled";
    public static final String SpokenGhostImageMessage = "SpokenGhostImageMessage";
    public static final String SpokenHelpFailoverMessage = "SpokenHelpFailoverMessage";
    public static final String SpokenHelpManualMessage = "SpokenHelpManualMessage";
    public static final String SpokenHelpMessage = "SpokenHelpMessage";
    public static final String SpokenTutorialMessage = "SpokenTutorialMessage";
    public static final int THEME_MANUAL = 0;
    public static final int THEME_MISNAP = 1;
    public static final String TextCheckBackPrompt = "TextCheckBackPrompt";
    public static final String TextCheckFrontPrompt = "TextCheckFrontPrompt";
    public static final String TutorialBackgroundColor = "TutorialBackgroundColor";
    public static final String TutorialBackgroundColorFailoverToStillCamera = "TutorialBackgroundColorFailoverToStillCamera";
    public static final String TutorialBackgroundColorFirstTimeUser = "TutorialBackgroundColorFirstTimeUser";
    public static final String TutorialBackgroundColorStillCamera = "TutorialBackgroundColorStillCamera";
    public static final String TutorialBackgroundColorStillCameraFirstTimeUser = "TutorialBackgroundColorStillCameraFirstTimeUser";
    public static final String TutorialBrandNewUserDuration = "TutorialBrandNewUserDuration";
    public static final String UnnecessaryScreenTouchLimit = "UnnecessaryScreenTouchLimit";
    public static final String UseNewestFeatures = "UseNewestFeatures";
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private int U;
    private int V;
    private int W;
    private boolean X;
    private int Y;
    private int Z;
    boolean a;
    private int aA;
    private int aB;
    private int aC;
    private int aD;
    private boolean aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private boolean al;
    private String am;
    private String an;
    private String ao;
    private String ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private String au;
    private String av;
    private String aw;
    private String ax;
    private int ay;
    private int az;
    int b;
    String c;
    public final String d;
    String e;
    private JSONObject f;
    private String g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private String m;
    private String n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private int x;
    private double y;
    private int z;

    MiSnapAPI(Intent intent)
    {
        JSONObject jsonobject;
        boolean flag;
        g = "";
        h = 0;
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        m = "";
        n = "UNIQUE";
        String s1;
        int i1;
        int j1;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        o = 0;
        p = o;
        q = 0;
        r = 0;
        s = true;
        t = false;
        u = true;
        v = 3;
        w = true;
        x = 2;
        y = 0.0833565263748169D;
        z = 350;
        b = 1;
        A = 1400;
        B = 0;
        C = -1;
        D = 1;
        E = 1;
        F = 1250;
        G = 1600;
        H = 50;
        I = 150;
        J = 400;
        K = 600;
        L = 0;
        M = 333;
        N = 800;
        O = 0;
        c = "";
        d = "MDVersion";
        e = "";
        P = true;
        Q = 20;
        R = 16;
        S = 0xed1c24;
        T = true;
        U = 600;
        V = 5000;
        W = 50;
        X = true;
        Y = 5000;
        Z = 600;
        aa = true;
        ab = 3000;
        ac = 10;
        ad = 30;
        ae = 20;
        af = 7500;
        ag = 0xe1e1e2;
        ah = 0xe1e1e2;
        ai = 0xe1e1e2;
        aj = 0xe1e1e2;
        ak = 0xe1e1e2;
        al = true;
        am = "MiSnapLocalizedTextCheckBackPrompt";
        an = "MiSnapLocalizedTextCheckFrontPrompt";
        ao = null;
        ap = "MiSnapButtonVideoHelpCancel";
        aq = "MiSnapLocalizedButtonVideoHelpContinue";
        ar = "MiSnapLocalizedButtonVideoTutorialCancel";
        as = "MiSnapLocalizedButtonVideoTutorialContinue";
        at = "";
        au = "MiSnapLocalizedButtonTransitionTutorialContinue";
        av = "MiSnapButtonManualHelpCancel";
        aw = "MiSnapLocalizedButtonManualHelpContinue";
        ax = "MiSnapLocalizedButtonVideoHelpContinue";
        ay = 1;
        az = 1500;
        aA = 4;
        aB = 1;
        aC = 1;
        aD = 0;
        s1 = "";
        if (intent != null)
        {
            s1 = intent.getStringExtra("com.miteksystems.misnap.JobSettings");
        }
        intent = s1;
        if (s1 == null)
        {
            intent = "";
        }
        jsonobject = new JSONObject(intent);
        f = jsonobject;
        if (jsonobject.has("Name"))
        {
            g = jsonobject.getString("Name");
        }
        if (!jsonobject.has("AnimatedBug"))
        {
            break MISSING_BLOCK_LABEL_596;
        }
        if (jsonobject.getInt("AnimatedBug") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        P = flag;
        if (jsonobject.has("AnimationRectangleStrokeWidth"))
        {
            Q = jsonobject.getInt("AnimationRectangleStrokeWidth");
        }
        if (jsonobject.has("AnimationRectangleCornerRadius"))
        {
            R = jsonobject.getInt("AnimationRectangleCornerRadius");
        }
        if (!jsonobject.has("AnimationRectangleColor"))
        {
            break MISSING_BLOCK_LABEL_678;
        }
        s1 = jsonobject.getString("AnimationRectangleColor");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        S = Integer.parseInt(intent, 16);
        if (jsonobject.has("MIPVersion"))
        {
            c = jsonobject.getString("MIPVersion");
        }
        if (jsonobject.has("MDVersion"))
        {
            e = jsonobject.getString("MDVersion");
        }
        if (!jsonobject.has("AllowVideoFrames") || 1 != jsonobject.getInt("AllowVideoFrames"))
        {
            break MISSING_BLOCK_LABEL_782;
        }
        if (!g.equals("CheckFront") && !g.equals("CheckBack") && !a(c))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        t = flag;
        if (!jsonobject.has("CameraVideoAutoCaptureProcess") || android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_817;
        }
        if (jsonobject.getInt("CameraVideoAutoCaptureProcess") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (jsonobject.has("CaptureMode")) goto _L2; else goto _L1
_L1:
        if (t) goto _L4; else goto _L3
_L3:
        u = false;
_L31:
        if (!u) goto _L6; else goto _L5
_L5:
        if (jsonobject.has("ConsecutiveVideoFrames"))
        {
            v = jsonobject.getInt("ConsecutiveVideoFrames");
        }
        if (!jsonobject.has("AutoCaptureFailoverToStillCapture")) goto _L8; else goto _L7
_L7:
        if (jsonobject.getInt("AutoCaptureFailoverToStillCapture") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
_L8:
        if (!jsonobject.has("CameraAutoCaptureProcess")) goto _L10; else goto _L9
_L9:
        if (jsonobject.getInt("CameraAutoCaptureProcess") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w = flag;
_L10:
        if (jsonobject.has("CameraMillisecondsDelay"))
        {
            z = jsonobject.getInt("CameraMillisecondsDelay");
        }
_L6:
        x = 0;
        i1 = -1;
        if (jsonobject.has("LightingVideo"))
        {
            i1 = jsonobject.getInt("LightingVideo");
        }
        if (-1 != i1)
        {
            break MISSING_BLOCK_LABEL_994;
        }
        if (!jsonobject.has("CameraFlash"))
        {
            break MISSING_BLOCK_LABEL_994;
        }
        j1 = jsonobject.getInt("CameraFlash");
        if (j1 != 0)
        {
            i1 = j1;
        }
        if (-1 == i1)
        {
            break MISSING_BLOCK_LABEL_1006;
        }
        D = i1;
        i1 = -1;
        if (jsonobject.has("LightingStillCamera"))
        {
            i1 = jsonobject.getInt("LightingStillCamera");
        }
        if (-1 != i1)
        {
            break MISSING_BLOCK_LABEL_1058;
        }
        if (!jsonobject.has("CameraFlash"))
        {
            break MISSING_BLOCK_LABEL_1058;
        }
        j1 = jsonobject.getInt("CameraFlash");
        if (j1 != 0)
        {
            i1 = j1;
        }
        if (-1 == i1)
        {
            break MISSING_BLOCK_LABEL_1070;
        }
        E = i1;
        if (jsonobject.has("RequiredMaxImageHeightAndWidth"))
        {
            G = jsonobject.getInt("RequiredMaxImageHeightAndWidth");
        }
        if (jsonobject.has("SpokenTutorialMessage"))
        {
            h = jsonobject.getInt("SpokenTutorialMessage");
        }
        if (jsonobject.has("SpokenHelpMessage"))
        {
            j = jsonobject.getInt("SpokenHelpMessage");
        }
        if (jsonobject.has("SpokenHelpFailoverMessage"))
        {
            i = jsonobject.getInt("SpokenHelpFailoverMessage");
        }
        if (jsonobject.has("SpokenHelpManualMessage"))
        {
            k = jsonobject.getInt("SpokenHelpManualMessage");
        }
        if (jsonobject.has("SpokenGhostImageMessage"))
        {
            l = jsonobject.getInt("SpokenGhostImageMessage");
        }
        if (jsonobject.has("CameraViewfinderBoundingBoxMaxDimension"))
        {
            A = jsonobject.getInt("CameraViewfinderBoundingBoxMaxDimension");
        }
        if (jsonobject.has("CameraViewfinderBoundingBoxMinDimension"))
        {
            B = jsonobject.getInt("CameraViewfinderBoundingBoxMinDimension");
        }
        if (jsonobject.has("CameraViewfinderBoundingBox"))
        {
            b = jsonobject.getInt("CameraViewfinderBoundingBox");
        }
        if (jsonobject.has("RequiredCompressionLevel"))
        {
            H = jsonobject.getInt("RequiredCompressionLevel");
        }
        if (jsonobject.has("CameraDegreesThreshold"))
        {
            I = jsonobject.getInt("CameraDegreesThreshold");
        }
        if (jsonobject.has("CameraViewfinderMinFill"))
        {
            M = jsonobject.getInt("CameraViewfinderMinFill");
        }
        if (jsonobject.has("CameraViewfinderMinHorizontalFill"))
        {
            N = jsonobject.getInt("CameraViewfinderMinHorizontalFill");
        }
        if (jsonobject.has("MitekReserved"))
        {
            p = jsonobject.getInt("MitekReserved");
        }
        if (jsonobject.has("CameraMaxTimeouts"))
        {
            q = jsonobject.getInt("CameraMaxTimeouts");
        }
        if (jsonobject.has("MiSnapLockView"))
        {
            r = jsonobject.getInt("MiSnapLockView");
        }
        if (jsonobject.has("CameraBrightness"))
        {
            J = jsonobject.getInt("CameraBrightness");
        }
        if (jsonobject.has("CameraGlare"))
        {
            L = jsonobject.getInt("CameraGlare");
        }
        if (!jsonobject.has("CameraSharpness")) goto _L12; else goto _L11
_L11:
        K = jsonobject.getInt("CameraSharpness");
_L36:
        if (jsonobject.has("DeviceID"))
        {
            n = jsonobject.getString("DeviceID");
        }
        if (!jsonobject.has("CameraGuideImageEnabled")) goto _L14; else goto _L13
_L13:
        if (jsonobject.getInt("CameraGuideImageEnabled") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        T = flag;
_L14:
        if (jsonobject.has("CameraGuideImageAppearanceFillPercentage"))
        {
            U = jsonobject.getInt("CameraGuideImageAppearanceFillPercentage");
        }
        if (jsonobject.has("CameraGuideImageReappearanceDelay"))
        {
            V = jsonobject.getInt("CameraGuideImageReappearanceDelay");
        }
        if (jsonobject.has("CameraGuideImageStillCameraAlpha"))
        {
            W = jsonobject.getInt("CameraGuideImageStillCameraAlpha");
        }
        if (!jsonobject.has("CameraGuideImageStillCameraEnabled")) goto _L16; else goto _L15
_L15:
        if (jsonobject.getInt("CameraGuideImageStillCameraEnabled") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        X = flag;
_L16:
        if (jsonobject.has("AutoTorchAppearanceDelay"))
        {
            Y = jsonobject.getInt("AutoTorchAppearanceDelay");
        }
        if (jsonobject.has("AutoTorchLowLightMinimum"))
        {
            Z = jsonobject.getInt("AutoTorchLowLightMinimum");
        }
        if (jsonobject.has("LightChangeDelay"))
        {
            F = jsonobject.getInt("LightChangeDelay");
        }
        if (!jsonobject.has("SmartBubbleEnabled")) goto _L18; else goto _L17
_L17:
        if (jsonobject.getInt("SmartBubbleEnabled") != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aa = flag;
_L18:
        if (jsonobject.has("SmartBubbleApparanceDelay"))
        {
            ab = jsonobject.getInt("SmartBubbleApparanceDelay");
        }
        if (jsonobject.has("SmartBubbleCumulativeErrorThreshold"))
        {
            ac = jsonobject.getInt("SmartBubbleCumulativeErrorThreshold");
        }
        if (jsonobject.has("CameraTimeoutInSeconds"))
        {
            ad = jsonobject.getInt("CameraTimeoutInSeconds");
        }
        if (jsonobject.has("CameraInitialTimeoutInSeconds"))
        {
            ae = jsonobject.getInt("CameraInitialTimeoutInSeconds");
        }
        if (jsonobject.has("TutorialBrandNewUserDuration"))
        {
            af = jsonobject.getInt("TutorialBrandNewUserDuration");
        }
        if (!jsonobject.has("TutorialBackgroundColor")) goto _L20; else goto _L19
_L19:
        s1 = jsonobject.getString("TutorialBackgroundColor");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        ag = Integer.parseInt(intent, 16);
_L20:
        if (!jsonobject.has("TutorialBackgroundColorFirstTimeUser")) goto _L22; else goto _L21
_L21:
        s1 = jsonobject.getString("TutorialBackgroundColorFirstTimeUser");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        ah = Integer.parseInt(intent, 16);
_L22:
        if (!jsonobject.has("TutorialBackgroundColorFailoverToStillCamera")) goto _L24; else goto _L23
_L23:
        s1 = jsonobject.getString("TutorialBackgroundColorFailoverToStillCamera");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        ai = Integer.parseInt(intent, 16);
_L24:
        if (!jsonobject.has("TutorialBackgroundColorStillCamera")) goto _L26; else goto _L25
_L25:
        s1 = jsonobject.getString("TutorialBackgroundColorStillCamera");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        aj = Integer.parseInt(intent, 16);
_L26:
        if (!jsonobject.has("TutorialBackgroundColorStillCameraFirstTimeUser")) goto _L28; else goto _L27
_L27:
        s1 = jsonobject.getString("TutorialBackgroundColorStillCameraFirstTimeUser");
        intent = s1;
        if (s1.startsWith("0x"))
        {
            intent = s1.substring(2);
        }
        ak = Integer.parseInt(intent, 16);
_L28:
        if (jsonobject.has("ScreenRotationSuspendTime"))
        {
            az = jsonobject.getInt("ScreenRotationSuspendTime");
        }
        if (jsonobject.has("UnnecessaryScreenTouchLimit"))
        {
            aA = jsonobject.getInt("UnnecessaryScreenTouchLimit");
        }
        if (jsonobject.has("Locale"))
        {
            ao = jsonobject.getString("Locale");
        }
        if (jsonobject.has("TextCheckFrontPrompt"))
        {
            an = jsonobject.getString("TextCheckFrontPrompt");
        }
        if (jsonobject.has("TextCheckBackPrompt"))
        {
            am = jsonobject.getString("TextCheckBackPrompt");
        }
        if (jsonobject.has("ButtonVideoHelpCancel"))
        {
            ap = jsonobject.getString("ButtonVideoHelpCancel");
        }
        if (jsonobject.has("ButtonVideoHelpContinue"))
        {
            aq = jsonobject.getString("ButtonVideoHelpContinue");
        }
        if (jsonobject.has("ButtonVideoTutorialCancel"))
        {
            ar = jsonobject.getString("ButtonVideoTutorialCancel");
        }
        if (jsonobject.has("ButtonVideoTutorialContinue"))
        {
            as = jsonobject.getString("ButtonVideoTutorialContinue");
        }
        if (jsonobject.has("ButtonTransitionTutorialCancel"))
        {
            at = jsonobject.getString("ButtonTransitionTutorialCancel");
        }
        if (jsonobject.has("ButtonTransitionTutorialContinue"))
        {
            au = jsonobject.getString("ButtonTransitionTutorialContinue");
        }
        if (jsonobject.has("ButtonManualHelpCancel"))
        {
            av = jsonobject.getString("ButtonManualHelpCancel");
        }
        if (jsonobject.has("ButtonManualHelpContinue"))
        {
            aw = jsonobject.getString("ButtonManualHelpContinue");
        }
        if (jsonobject.has("ButtonFirstTimeTutorialContinue"))
        {
            ax = jsonobject.getString("ButtonFirstTimeTutorialContinue");
        }
        if (jsonobject.has("MiSnapTutorialAcknowledgementEnabled"))
        {
            ay = jsonobject.getInt("MiSnapTutorialAcknowledgementEnabled");
        }
        if (jsonobject.has("UseNewestFeatures"))
        {
            aD = jsonobject.getInt("UseNewestFeatures");
        }
        aD = a(aD, 0, 1, 0);
        aB = a(jsonobject, "CameraVignetteImageEnabled");
        aC = a(jsonobject, "CameraVignetteImageManualModeEnabled");
        if (jsonobject.has("TEST_MODE"))
        {
            r.a = jsonobject.getBoolean("TEST_MODE");
        }
        if (jsonobject.has("SHOW_LIGHT"))
        {
            r.d = jsonobject.getBoolean("SHOW_LIGHT");
        }
        if (jsonobject.has("SHOW_FILL"))
        {
            r.e = jsonobject.getBoolean("SHOW_FILL");
        }
        if (jsonobject.has("SHOW_HORIZ_FILL"))
        {
            r.f = jsonobject.getBoolean("SHOW_HORIZ_FILL");
        }
        if (jsonobject.has("SHOW_FPS"))
        {
            r.d = jsonobject.getBoolean("SHOW_FPS");
        }
        if (jsonobject.has("RESET_NEW_USER"))
        {
            r.g = jsonobject.getBoolean("RESET_NEW_USER");
        }
_L44:
        if (q < 0)
        {
            q = 0;
        }
        if (r < 0 || r > 1)
        {
            r = 0;
        }
        b = a(b, 0, 3, 1);
        if (b == 0)
        {
            a = false;
            x = 0;
        }
        if (!a)
        {
            b = 0;
            x = 0;
        }
        if (x == 0)
        {
            y = 0.0D;
        } else
        {
            y = (((double)x * 0.14999999999999999D + 0.55000000000000004D) * 9.8066501617431641D) / 100D;
        }
        v = a(v, 1, 5, 3);
        x = a(x, 0, 1000, 2);
        p = a(p, 0, 1000, o);
        C = a(C, 0, 2, -1);
        G = a(G, 300, 5500, 1600);
        A = a(A, 300, 5500, 1400);
        B = a(B, 300, 5500, 0);
        H = a(H, 0, 100, 50);
        I = a(I, 2, 1000, 150);
        M = a(M, 200, 1000, 333);
        J = J * 1;
        J = a(J, 0, 1000, 400);
        L = a(L, 0, 1000, 0);
        K = a(K, 0, 1000, 600);
        ay = a(ay, 0, 1, 0);
        D = a(D, 0, 3, 1);
        E = a(E, 0, 3, 1);
        U = a(U, 333, 1000, 600);
        V = a(V, 3000, 15000, 5000);
        W = a(W, 30, 100, 50);
        Y = a(Y, 3000, 10000, 5000);
        Z = a(Z, 100, 1000, 600);
        F = a(F, 500, 2000, 1250);
        ab = a(ab, 1000, 10000, 3000);
        ac = a(ac, 5, 20, 10);
        ae = a(ae, 15, 90, 20);
        ad = a(ad, ae, 90, 30);
        N = a(N, 500, 1000, 800);
        Q = a(Q, 0, 100, 20);
        R = a(R, 1, 100, 16);
        af = a(af, 3000, 10000, 7500);
        az = a(az, 500, 2500, 1500);
        aA = a(aA, 2, 9, 4);
        if (40 < an.length())
        {
            an = an.substring(0, 40);
        }
        if (40 < am.length())
        {
            am = am.substring(0, 40);
        }
        if (20 < ap.length() && !ap.equals("MiSnapButtonVideoHelpCancel"))
        {
            ap = ap.substring(0, 20);
        }
        if (20 < aq.length() && !aq.equals("MiSnapLocalizedButtonVideoHelpContinue"))
        {
            aq = aq.substring(0, 20);
        }
        if (20 < ar.length() && !ar.equals("MiSnapLocalizedButtonVideoTutorialCancel"))
        {
            ar = ar.substring(0, 20);
        }
        if (20 < as.length() && !as.equals("MiSnapLocalizedButtonVideoTutorialContinue"))
        {
            as = as.substring(0, 20);
        }
        if (20 < at.length() && !at.equals(""))
        {
            at = at.substring(0, 20);
        }
        if (20 < au.length() && !au.equals("MiSnapLocalizedButtonTransitionTutorialContinue"))
        {
            au = au.substring(0, 20);
        }
        if (20 < av.length() && !av.equals("MiSnapButtonManualHelpCancel"))
        {
            av = av.substring(0, 20);
        }
        if (20 < aw.length() && !aw.equals("MiSnapLocalizedButtonManualHelpContinue"))
        {
            aw = aw.substring(0, 20);
        }
        if (20 < ax.length() && !ax.equals("MiSnapLocalizedButtonVideoHelpContinue"))
        {
            ax = ax.substring(0, 20);
        }
        return;
_L4:
        if (!t || a) goto _L30; else goto _L29
_L29:
        u = false;
          goto _L31
_L30:
        if (!t || !a) goto _L31; else goto _L32
_L32:
        u = true;
          goto _L31
_L2:
        if (!jsonobject.getString("CaptureMode").equals("1"))
        {
            break MISSING_BLOCK_LABEL_3598;
        }
        u = false;
_L33:
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            u = false;
        }
          goto _L31
        u = true;
          goto _L33
_L12:
        intent = g.toLowerCase(Locale.US);
        if (!intent.startsWith("checkfront") && !intent.startsWith("ach")) goto _L35; else goto _L34
_L34:
        K = 600;
_L37:
        if (android.os.Build.VERSION.SDK_INT > 9)
        {
            break MISSING_BLOCK_LABEL_3758;
        }
        K = (int)((double)K * 0.40000000000000002D);
          goto _L36
_L35:
label0:
        {
            if (!intent.startsWith("checkback"))
            {
                break label0;
            }
            K = 100;
        }
          goto _L37
label1:
        {
            if (!intent.startsWith("auto"))
            {
                break label1;
            }
            K = 750;
        }
          goto _L37
        if (!intent.startsWith("remit") && !intent.startsWith("w2")) goto _L39; else goto _L38
_L38:
        K = 850;
          goto _L37
_L39:
        if (!intent.contains("license")) goto _L37; else goto _L40
_L40:
        K = 500;
          goto _L37
label2:
        {
            if (android.os.Build.VERSION.SDK_INT > 10)
            {
                break label2;
            }
            K = (int)((double)K * 0.5D);
        }
          goto _L36
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L42; else goto _L41
_L41:
        K = (int)((double)K * 0.59999999999999998D);
          goto _L36
_L42:
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L36; else goto _L43
_L43:
        K = (int)((double)K * 0.80000000000000004D);
          goto _L36
        intent;
          goto _L44
    }

    private static int a(int i1, int j1, int k1, int l1)
    {
label0:
        {
            if (i1 >= j1)
            {
                j1 = i1;
                if (i1 <= k1)
                {
                    break label0;
                }
            }
            j1 = l1;
        }
        return j1;
    }

    private int a(JSONObject jsonobject, String s1)
    {
        int i1 = 1;
        int j1;
        if (jsonobject.has(s1))
        {
            return jsonobject.getInt(s1);
        }
        j1 = aD;
        if (1 != j1)
        {
            return 0;
        }
        break MISSING_BLOCK_LABEL_33;
        jsonobject;
        i1 = 0;
        return i1;
    }

    private static boolean a(String s1)
    {
        if (s1 != null && s1.length() != 0)
        {
            if ((s1 = s1.split("\\.")).length > 1)
            {
                int i1;
                int j1;
                try
                {
                    i1 = Integer.parseInt(s1[0]);
                    j1 = Integer.parseInt(s1[1]);
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    return false;
                }
                if (2 < i1 || 2 == i1 && j1 > 0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isFeatureSupported(String s1)
    {
        return "com.miteksystems.misnap.FEATURE_MINIMUM_AUTO_CAPTURE_CAPABILITY".equals(s1);
    }

    public static String miSnapBuildVersion(Context context)
    {
        return context.getString(R.string.misnap_buildnumber);
    }

    public static String miSnapVersion(Context context)
    {
        return context.getString(R.string.misnap_versionName);
    }

    final int A()
    {
        return V;
    }

    final boolean B()
    {
        return X;
    }

    final int C()
    {
        return (int)((double)W * 0.01D * 255D);
    }

    final int D()
    {
        return Y;
    }

    final int E()
    {
        return Z;
    }

    final int F()
    {
        return D;
    }

    final int G()
    {
        return E;
    }

    final int H()
    {
        return F;
    }

    final boolean I()
    {
        return aa;
    }

    final int J()
    {
        return ab;
    }

    final int K()
    {
        return ac;
    }

    final int L()
    {
        return ae;
    }

    final int M()
    {
        return af;
    }

    final boolean N()
    {
        return al;
    }

    final int O()
    {
        return aA;
    }

    final int P()
    {
        return h;
    }

    final int Q()
    {
        return j;
    }

    final int R()
    {
        return i;
    }

    final int S()
    {
        return k;
    }

    final int T()
    {
        return l;
    }

    final int U()
    {
        return ag;
    }

    final int V()
    {
        return ah;
    }

    final int W()
    {
        return ai;
    }

    final int X()
    {
        return aj;
    }

    final String Y()
    {
        return am;
    }

    final String Z()
    {
        return an;
    }

    final void a()
    {
        u = false;
    }

    final boolean aA()
    {
        return g != null && (g.startsWith("Check") || g.startsWith("ACH"));
    }

    final JSONObject aB()
    {
        return f;
    }

    final JSONObject aC()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("Name", g);
        jsonobject.put("ShortDescription", m);
        jsonobject.put("CameraTimeoutInSeconds", Integer.toString(ad));
        jsonobject.put("CameraMaxTimeouts", Integer.toString(q));
        Object obj;
        byte byte0;
        if (u)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        jsonobject.put("CaptureMode", byte0);
        if (a)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        jsonobject.put("CameraVideoAutoCaptureProcess", obj);
        if (w)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        jsonobject.put("CameraAutoCaptureProcess", obj);
        jsonobject.put("CameraGForce", Integer.toString(x));
        jsonobject.put("CameraMillisecondsDelay", Integer.toString(z));
        jsonobject.put("CameraViewfinderBoundingBox", Integer.toString(b));
        jsonobject.put("CameraViewfinderBoundingBoxMaxDimension", Integer.toString(A));
        jsonobject.put("CameraViewfinderBoundingBoxMinDimension", Integer.toString(B));
        jsonobject.put("CameraFlash", Integer.toString(C));
        jsonobject.put("LightingVideo", Integer.toString(D));
        jsonobject.put("LightingStillCamera", Integer.toString(E));
        jsonobject.put("RequiredMaxImageHeightAndWidth", Integer.toString(G));
        jsonobject.put("RequiredCompressionLevel", Integer.toString(H));
        jsonobject.put("CameraBrightness", Integer.toString(J));
        jsonobject.put("CameraSharpness", Integer.toString(K));
        jsonobject.put("MiSnapTutorialAcknowledgementEnabled", Integer.toString(ay));
        jsonobject.put("CameraDegreesThreshold", Integer.toString(I));
        jsonobject.put("CameraGlare", Integer.toString(L));
        jsonobject.put("CameraViewfinderMinFill", Integer.toString(M));
        jsonobject.put("CameraViewfinderMinHorizontalFill", Integer.toString(N));
        jsonobject.put("DeviceID", n);
        if (P)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        jsonobject.put("AnimatedBug", obj);
        if (T)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        jsonobject.put("CameraGuideImageEnabled", obj);
        if (aa)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        jsonobject.put("SmartBubbleEnabled", obj);
        if (X)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        try
        {
            jsonobject.put("CameraGuideImageStillCameraEnabled", obj);
            jsonobject.put("CameraGuideImageAppearanceFillPercentage", Integer.toString(U));
            jsonobject.put("CameraGuideImageReappearanceDelay", Integer.toString(V));
            jsonobject.put("CameraGuideImageStillCameraAlpha", Integer.toString(W));
            jsonobject.put("AutoTorchAppearanceDelay", Integer.toString(Y));
            jsonobject.put("AutoTorchLowLightMinimum", Integer.toString(Z));
            jsonobject.put("SmartBubbleApparanceDelay", Integer.toString(ab));
            jsonobject.put("SmartBubbleCumulativeErrorThreshold", Integer.toString(ac));
            jsonobject.put("CameraInitialTimeoutInSeconds", Integer.toString(ae));
            jsonobject.put("CameraViewfinderMinHorizontalFill", Integer.toString(N));
            jsonobject.put("AnimationRectangleStrokeWidth", Integer.toString(Q));
            jsonobject.put("AnimationRectangleCornerRadius", Integer.toString(R));
            jsonobject.put("TutorialBrandNewUserDuration", Integer.toString(af));
            jsonobject.put("ScreenRotationSuspendTime", Integer.toString(az));
            jsonobject.put("ButtonFirstTimeTutorialContinue", ax);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((JSONException) (obj)).printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    final String aa()
    {
        return ap;
    }

    final String ab()
    {
        return aq;
    }

    final String ac()
    {
        return ar;
    }

    final String ad()
    {
        return as;
    }

    final String ae()
    {
        return at;
    }

    final String af()
    {
        return au;
    }

    final String ag()
    {
        return av;
    }

    final String ah()
    {
        return aw;
    }

    final String ai()
    {
        return ax;
    }

    final int aj()
    {
        return ay;
    }

    final boolean ak()
    {
        return an.equals("MiSnapLocalizedTextCheckFrontPrompt");
    }

    final boolean al()
    {
        return am.equals("MiSnapLocalizedTextCheckBackPrompt");
    }

    final boolean am()
    {
        return ap.equals("MiSnapButtonVideoHelpCancel") || ap.trim().equals("");
    }

    final boolean an()
    {
        return aq.equals("MiSnapLocalizedButtonVideoHelpContinue") || aq.trim().equals("");
    }

    final boolean ao()
    {
        return ap.trim().equals("");
    }

    final boolean ap()
    {
        return ar.equals("MiSnapLocalizedButtonVideoTutorialCancel") || ar.trim().equals("");
    }

    final boolean aq()
    {
        return as.equals("MiSnapLocalizedButtonVideoTutorialContinue") || as.trim().equals("");
    }

    final boolean ar()
    {
        return ar.trim().equals("");
    }

    final boolean as()
    {
        return au.equals("MiSnapLocalizedButtonTransitionTutorialContinue") || au.trim().equals("");
    }

    final boolean at()
    {
        return ax.equals("MiSnapLocalizedButtonVideoHelpContinue") || ax.trim().equals("");
    }

    final boolean au()
    {
        return at.trim().equals("");
    }

    final boolean av()
    {
        return av.equals("MiSnapButtonManualHelpCancel") || av.trim().equals("");
    }

    final boolean aw()
    {
        return aw.equals("MiSnapLocalizedButtonManualHelpContinue") || aw.trim().equals("");
    }

    final boolean ax()
    {
        return av.trim().equals("");
    }

    final boolean ay()
    {
        return g != null && g.startsWith("CheckFront");
    }

    final boolean az()
    {
        return g != null && g.startsWith("CheckBack");
    }

    final boolean b()
    {
        return u;
    }

    final boolean c()
    {
        return s;
    }

    final int d()
    {
        return v;
    }

    final int e()
    {
        return G;
    }

    final int f()
    {
        return H;
    }

    final int g()
    {
        return J;
    }

    final int h()
    {
        return K;
    }

    final int i()
    {
        return I;
    }

    final int j()
    {
        return M;
    }

    final int k()
    {
        return ad;
    }

    final int l()
    {
        return q;
    }

    final int m()
    {
        return p;
    }

    final String n()
    {
        return g;
    }

    final boolean o()
    {
        return P;
    }

    final int p()
    {
        return Q;
    }

    final int q()
    {
        return R;
    }

    final int r()
    {
        return S;
    }

    final int s()
    {
        return N;
    }

    final int t()
    {
        return r;
    }

    final boolean u()
    {
        return aB != 0;
    }

    final boolean v()
    {
        return aC != 0;
    }

    final int w()
    {
        return az;
    }

    final String x()
    {
        return ao;
    }

    final boolean y()
    {
        return T;
    }

    final int z()
    {
        return U;
    }
}
