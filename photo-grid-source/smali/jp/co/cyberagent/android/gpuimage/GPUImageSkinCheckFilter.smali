.class public Ljp/co/cyberagent/android/gpuimage/GPUImageSkinCheckFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.source "SourceFile"


# static fields
.field public static final SKINCHECK_FRAGMENT_SHADER:Ljava/lang/String; = " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float r = textureColor.r;    lowp float g = textureColor.g;    lowp float b = textureColor.b;   if ((r > 95.0/255.0 && g > 40.0/255.0 && b >20.0/255.0         && (r > b))                                 ){      gl_FragColor = textureColor;      } else {               gl_FragColor = vec4(0, 0, 0, 0);          } }"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 31
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, " varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n \n void main()\n {\n    lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    lowp float r = textureColor.r;    lowp float g = textureColor.g;    lowp float b = textureColor.b;   if ((r > 95.0/255.0 && g > 40.0/255.0 && b >20.0/255.0         && (r > b))                                 ){      gl_FragColor = textureColor;      } else {               gl_FragColor = vec4(0, 0, 0, 0);          } }"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    return-void
.end method


# virtual methods
.method public onInit()V
    .locals 0

    .prologue
    .line 36
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 37
    return-void
.end method

.method public onInitialized()V
    .locals 0

    .prologue
    .line 41
    invoke-super {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 42
    return-void
.end method
