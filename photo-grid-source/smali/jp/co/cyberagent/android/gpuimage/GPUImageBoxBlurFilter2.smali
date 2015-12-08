.class public Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageTwoPassTextureSamplingFilter;
.source "SourceFile"


# static fields
.field public static final FRAGMENT_SHADER:Ljava/lang/String; = "precision highp float;\n\nconst int radius = 10;\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\n   highp vec4 fragmentColor = vec4(0.0);\n   for(int i=-radius; i <= radius; i++){       fragmentColor += texture2D(inputImageTexture, centerTextureCoordinate + float(i)*vec2(texelWidthOffset, texelHeightOffset)) / (2.0*float(radius)+1.0);\n   }\ngl_FragColor = fragmentColor;\n}\n"

.field public static final VERTEX_SHADER:Ljava/lang/String; = "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\n\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"


# instance fields
.field private blurSize:F

.field private mHeight:F

.field private mWidth:F


# direct methods
.method public constructor <init>(FII)V
    .locals 4

    .prologue
    .line 55
    const-string v0, "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\n\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"

    const-string v1, "precision highp float;\n\nconst int radius = 10;\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\n   highp vec4 fragmentColor = vec4(0.0);\n   for(int i=-radius; i <= radius; i++){       fragmentColor += texture2D(inputImageTexture, centerTextureCoordinate + float(i)*vec2(texelWidthOffset, texelHeightOffset)) / (2.0*float(radius)+1.0);\n   }\ngl_FragColor = fragmentColor;\n}\n"

    const-string v2, "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\n\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"

    const-string v3, "precision highp float;\n\nconst int radius = 10;\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\n   highp vec4 fragmentColor = vec4(0.0);\n   for(int i=-radius; i <= radius; i++){       fragmentColor += texture2D(inputImageTexture, centerTextureCoordinate + float(i)*vec2(texelWidthOffset, texelHeightOffset)) / (2.0*float(radius)+1.0);\n   }\ngl_FragColor = fragmentColor;\n}\n"

    invoke-direct {p0, v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoPassTextureSamplingFilter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->blurSize:F

    .line 56
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->blurSize:F

    .line 57
    int-to-float v0, p2

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->mWidth:F

    .line 58
    int-to-float v0, p3

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->mHeight:F

    .line 59
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    .prologue
    .line 50
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;-><init>(FII)V

    .line 51
    return-void
.end method


# virtual methods
.method public getHorizontalTexelOffsetRatio()F
    .locals 1

    .prologue
    .line 108
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getVerticalTexelOffsetRatio()F
    .locals 1

    .prologue
    .line 103
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method protected initTexelOffsets()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 63
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->getHorizontalTexelOffsetRatio()F

    move-result v1

    .line 64
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->mFilters:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 65
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v2

    const-string v3, "texelWidthOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 66
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v3

    const-string v4, "texelHeightOffset"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 68
    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->mWidth:F

    div-float/2addr v1, v4

    invoke-virtual {v0, v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 69
    invoke-virtual {v0, v3, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 72
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->getVerticalTexelOffsetRatio()F

    move-result v1

    .line 73
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->mFilters:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 74
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v2

    const-string v3, "texelWidthOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 75
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v3

    const-string v4, "texelHeightOffset"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 77
    invoke-virtual {v0, v2, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 78
    iget v2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->mHeight:F

    div-float/2addr v1, v2

    invoke-virtual {v0, v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 80
    return-void
.end method

.method public onOutputSizeChanged(II)V
    .locals 0

    .prologue
    .line 98
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->initTexelOffsets()V

    .line 99
    return-void
.end method

.method public setBlurSize(F)V
    .locals 1

    .prologue
    .line 87
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->blurSize:F

    .line 88
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2$1;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageBoxBlurFilter2;->runOnDraw(Ljava/lang/Runnable;)V

    .line 94
    return-void
.end method
