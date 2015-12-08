.class public Ljp/co/cyberagent/android/gpuimage/GPUImageAddFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;
.source "SourceFile"


# static fields
.field public static final ADD_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb + textureColor2.rgb, textureColor.a*textureColor2.a);\n }"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    const-string v0, "varying highp vec2 textureCoordinate;\n varying highp vec2 textureCoordinate2;\n\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n \n void main()\n {\n     highp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     highp vec4 textureColor2 = texture2D(inputImageTexture2, textureCoordinate2);\n     gl_FragColor = vec4(textureColor.rgb + textureColor2.rgb, textureColor.a*textureColor2.a);\n }"

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoInputFilter;-><init>(Ljava/lang/String;)V

    .line 22
    return-void
.end method
