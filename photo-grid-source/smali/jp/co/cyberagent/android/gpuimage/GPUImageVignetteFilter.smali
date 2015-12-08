.class public Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final VIGNETTING_FRAGMENT_SHADER:Ljava/lang/String; = " uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n \n uniform lowp vec2 vignetteCenter;\n uniform lowp vec3 vignetteColor;\n uniform highp float vignetteStart;\n uniform highp float vignetteEnd;\n \n void main()\n {\n     /*\n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(0.5,0.5));\n     rgb *= (1.0 - smoothstep(vignetteStart, vignetteEnd, d));\n     gl_FragColor = vec4(vec3(rgb),1.0);\n      */\n     \n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(vignetteCenter.x, vignetteCenter.y));\n     lowp float percent = smoothstep(vignetteStart, vignetteEnd, d);\n     gl_FragColor = vec4(mix(rgb.x, vignetteColor.x, percent), mix(rgb.y, vignetteColor.y, percent), mix(rgb.z, vignetteColor.z, percent), 1.0);\n }"


# instance fields
.field private mVignetteCenter:Landroid/graphics/PointF;

.field private mVignetteCenterLocation:I

.field private mVignetteColor:[F

.field private mVignetteColorLocation:I

.field private mVignetteEnd:F

.field private mVignetteEndLocation:I

.field private mVignetteStart:F

.field private mVignetteStartLocation:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    .line 62
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    const/4 v1, 0x3

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const v2, 0x3e99999a    # 0.3f

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-direct {p0, v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;-><init>(Landroid/graphics/PointF;[FFF)V

    .line 63
    return-void

    .line 62
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public constructor <init>(Landroid/graphics/PointF;[FFF)V
    .locals 2

    .prologue
    .line 66
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, " uniform sampler2D inputImageTexture;\n varying highp vec2 textureCoordinate;\n \n uniform lowp vec2 vignetteCenter;\n uniform lowp vec3 vignetteColor;\n uniform highp float vignetteStart;\n uniform highp float vignetteEnd;\n \n void main()\n {\n     /*\n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(0.5,0.5));\n     rgb *= (1.0 - smoothstep(vignetteStart, vignetteEnd, d));\n     gl_FragColor = vec4(vec3(rgb),1.0);\n      */\n     \n     lowp vec3 rgb = texture2D(inputImageTexture, textureCoordinate).rgb;\n     lowp float d = distance(textureCoordinate, vec2(vignetteCenter.x, vignetteCenter.y));\n     lowp float percent = smoothstep(vignetteStart, vignetteEnd, d);\n     gl_FragColor = vec4(mix(rgb.x, vignetteColor.x, percent), mix(rgb.y, vignetteColor.y, percent), mix(rgb.z, vignetteColor.z, percent), 1.0);\n }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteCenter:Landroid/graphics/PointF;

    .line 68
    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteColor:[F

    .line 69
    iput p3, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteStart:F

    .line 70
    iput p4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteEnd:F

    .line 72
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 2

    .prologue
    .line 76
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 77
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->getProgram()I

    move-result v0

    const-string v1, "vignetteCenter"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteCenterLocation:I

    .line 78
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->getProgram()I

    move-result v0

    const-string v1, "vignetteColor"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteColorLocation:I

    .line 79
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->getProgram()I

    move-result v0

    const-string v1, "vignetteStart"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteStartLocation:I

    .line 80
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->getProgram()I

    move-result v0

    const-string v1, "vignetteEnd"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteEndLocation:I

    .line 82
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteCenter:Landroid/graphics/PointF;

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setVignetteCenter(Landroid/graphics/PointF;)V

    .line 83
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteColor:[F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setVignetteColor([F)V

    .line 84
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteStart:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setVignetteStart(F)V

    .line 85
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteEnd:F

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setVignetteEnd(F)V

    .line 86
    return-void
.end method

.method public setVignetteCenter(Landroid/graphics/PointF;)V
    .locals 2

    .prologue
    .line 90
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteCenter:Landroid/graphics/PointF;

    .line 91
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteCenterLocation:I

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteCenter:Landroid/graphics/PointF;

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setPoint(ILandroid/graphics/PointF;)V

    .line 92
    return-void
.end method

.method public setVignetteColor([F)V
    .locals 2

    .prologue
    .line 95
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteColor:[F

    .line 96
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteColorLocation:I

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteColor:[F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setFloatVec3(I[F)V

    .line 97
    return-void
.end method

.method public setVignetteEnd(F)V
    .locals 2

    .prologue
    .line 105
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteEnd:F

    .line 106
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteEndLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteEnd:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setFloat(IF)V

    .line 107
    return-void
.end method

.method public setVignetteStart(F)V
    .locals 2

    .prologue
    .line 100
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteStart:F

    .line 101
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteStartLocation:I

    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->mVignetteStart:F

    invoke-virtual {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageVignetteFilter;->setFloat(IF)V

    .line 102
    return-void
.end method
