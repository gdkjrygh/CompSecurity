.class public Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageMixBlendFilter;
.source "SourceFile"


# static fields
.field public static final ALPHA_BLEND_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor.a);\n }"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor.a);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMixBlendFilter;-><init>(Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    .prologue
    .line 44
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor.a);\n }"

    invoke-direct {p0, v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageMixBlendFilter;-><init>(Ljava/lang/String;F)V

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->mUseSrcTex:Z

    .line 46
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .prologue
    .line 49
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n uniform lowp float mixturePercent;\n\n void main()\n {\n   lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n   lowp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n\n   gl_FragColor = vec4(mix(textureColor.rgb, textureColor2.rgb, textureColor2.a * mixturePercent), textureColor.a);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMixBlendFilter;-><init>(Ljava/lang/String;)V

    .line 50
    iput-boolean p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->mUseSrcTex:Z

    .line 51
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageAlphaBlendFilter;->isUseSrcTex:Z

    .line 52
    return-void
.end method
