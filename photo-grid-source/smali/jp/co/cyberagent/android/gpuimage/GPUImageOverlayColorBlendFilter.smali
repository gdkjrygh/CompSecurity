.class public Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final OVERLAY_BLEND_COLOR_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 overlay;\n \n void main()\n {\n     mediump vec4 base = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float ra;\n     if (2.0 * base.r < base.a) {\n         ra = 2.0 * overlay.r * base.r + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     } else {\n         ra = overlay.a * base.a - 2.0 * (base.a - base.r) * (overlay.a - overlay.r) + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     }\n     \n     mediump float ga;\n     if (2.0 * base.g < base.a) {\n         ga = 2.0 * overlay.g * base.g + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     } else {\n         ga = overlay.a * base.a - 2.0 * (base.a - base.g) * (overlay.a - overlay.g) + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     }\n     \n     mediump float ba;\n     if (2.0 * base.b < base.a) {\n         ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     } else {\n         ba = overlay.a * base.a - 2.0 * (base.a - base.b) * (overlay.a - overlay.b) + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     }\n     \n     gl_FragColor = vec4(ra, ga, ba, 1.0);\n }"


# instance fields
.field private mColorLocation:I

.field private mColorString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 46
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform highp vec4 overlay;\n \n void main()\n {\n     mediump vec4 base = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float ra;\n     if (2.0 * base.r < base.a) {\n         ra = 2.0 * overlay.r * base.r + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     } else {\n         ra = overlay.a * base.a - 2.0 * (base.a - base.r) * (overlay.a - overlay.r) + overlay.r * (1.0 - base.a) + base.r * (1.0 - overlay.a);\n     }\n     \n     mediump float ga;\n     if (2.0 * base.g < base.a) {\n         ga = 2.0 * overlay.g * base.g + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     } else {\n         ga = overlay.a * base.a - 2.0 * (base.a - base.g) * (overlay.a - overlay.g) + overlay.g * (1.0 - base.a) + base.g * (1.0 - overlay.a);\n     }\n     \n     mediump float ba;\n     if (2.0 * base.b < base.a) {\n         ba = 2.0 * overlay.b * base.b + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     } else {\n         ba = overlay.a * base.a - 2.0 * (base.a - base.b) * (overlay.a - overlay.b) + overlay.b * (1.0 - base.a) + base.b * (1.0 - overlay.a);\n     }\n     \n     gl_FragColor = vec4(ra, ga, ba, 1.0);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 51
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 52
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;->getProgram()I

    move-result v0

    const-string v1, "overlay"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;->mColorLocation:I

    .line 53
    return-void
.end method

.method public onInitialized()V
    .locals 0

    .prologue
    .line 57
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 59
    return-void
.end method

.method public setColor(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/high16 v3, 0x437f0000    # 255.0f

    .line 63
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;->mColorString:Ljava/lang/String;

    .line 64
    const-string v0, "#"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 65
    const/high16 v1, 0xff0000

    and-int/2addr v1, v0

    shr-int/lit8 v1, v1, 0x10

    int-to-float v1, v1

    div-float/2addr v1, v3

    .line 66
    const v2, 0xff00

    and-int/2addr v2, v0

    shr-int/lit8 v2, v2, 0x8

    int-to-float v2, v2

    div-float/2addr v2, v3

    .line 67
    and-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 68
    const/4 v3, 0x4

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v1, v3, v4

    const/4 v1, 0x1

    aput v2, v3, v1

    const/4 v1, 0x2

    aput v0, v3, v1

    const/4 v0, 0x3

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v3, v0

    .line 69
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;->mColorLocation:I

    invoke-virtual {p0, v0, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageOverlayColorBlendFilter;->setFloatVec4(I[F)V

    .line 70
    return-void
.end method
