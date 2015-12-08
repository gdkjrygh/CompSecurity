.class public Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;
.source "SourceFile"


# static fields
.field public static final COLOR_GRAY_DODGE_BLEND_FRAGMENT_SHADER:Ljava/lang/String; = "precision mediump float;\n \n varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n\t  const highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n     vec4 base = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 overlay = texture2D(inputImageTexture, textureCoordinate);\n  \t  float luminance = dot(base.rgb, W);\n\t  base = vec4(luminance);\t\n\t  vec4 result = base + base*overlay / (vec4(1.0)-overlay);\n\t  result.r = clamp(result.r, 0.0,1.0);\n\t  result.g = clamp(result.g, 0.0,1.0);\n\t  result.b = clamp(result.b, 0.0,1.0);\n     gl_FragColor = vec4(result.rgb, 1.0);\n }"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;-><init>(Z)V

    .line 28
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 31
    const-string v1, "precision mediump float;\n \n varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n\t  const highp vec3 W = vec3(0.2125, 0.7154, 0.0721);\n     vec4 base = texture2D(inputImageTexture2, textureCoordinate2);\n     vec4 overlay = texture2D(inputImageTexture, textureCoordinate);\n  \t  float luminance = dot(base.rgb, W);\n\t  base = vec4(luminance);\t\n\t  vec4 result = base + base*overlay / (vec4(1.0)-overlay);\n\t  result.r = clamp(result.r, 0.0,1.0);\n\t  result.g = clamp(result.g, 0.0,1.0);\n\t  result.b = clamp(result.b, 0.0,1.0);\n     gl_FragColor = vec4(result.rgb, 1.0);\n }"

    invoke-direct {p0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;-><init>(Ljava/lang/String;)V

    .line 32
    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;->mUseSrcTex:Z

    .line 33
    if-nez p1, :cond_0

    :goto_0
    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorGrayDodgeBlendFilter;->isUseSrcTex:Z

    .line 34
    return-void

    .line 33
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
