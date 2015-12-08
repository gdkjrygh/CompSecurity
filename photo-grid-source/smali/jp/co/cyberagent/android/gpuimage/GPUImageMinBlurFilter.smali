.class public Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;
.super Ljp/co/cyberagent/android/gpuimage/GPUImageTwoPassTextureSamplingFilter;
.source "SourceFile"


# static fields
.field public static final ONE_FRAGMENT_SHADER:Ljava/lang/String; = "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float radius;\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\n\nvoid main()\n{\n\tvec4 baseColor;\n   vec2 offsetCoordinate = vec2(-radius*texelWidthOffset,-radius*texelHeightOffset); \n   baseColor = texture2D(inputImageTexture, centerTextureCoordinate+offsetCoordinate); \n\tfor(float i=-radius+1.0; i <= radius; i+=1.0)\n\t{\n\t\tvec2 offsetCoordinate = vec2(i*texelWidthOffset,i*texelHeightOffset); \n   \tlowp vec4 fragmentColor = texture2D(inputImageTexture, centerTextureCoordinate+offsetCoordinate); \n\t\tbaseColor.r = min(baseColor.r, fragmentColor.r); \n\t\tbaseColor.g = min(baseColor.g, fragmentColor.g); \n       baseColor.b = min(baseColor.b, fragmentColor.b); \n\t\t\n\t}\n;\ngl_FragColor = baseColor;\n}\n"

.field public static final TWO_FRAGMENT_SHADER:Ljava/lang/String; = "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n"

.field public static final VERTEX_SHADER:Ljava/lang/String; = "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"


# instance fields
.field private blurSize:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 114
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;-><init>(F)V

    .line 115
    return-void
.end method

.method public constructor <init>(F)V
    .locals 4

    .prologue
    .line 119
    const-string v0, "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"

    const-string v1, "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n"

    const-string v2, "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"

    const-string v3, "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n"

    invoke-direct {p0, v0, v1, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageTwoPassTextureSamplingFilter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->blurSize:F

    .line 120
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->blurSize:F

    .line 121
    return-void
.end method


# virtual methods
.method public getHorizontalTexelOffsetRatio()F
    .locals 1

    .prologue
    .line 164
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getVerticalTexelOffsetRatio()F
    .locals 1

    .prologue
    .line 159
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->blurSize:F

    return v0
.end method

.method protected initTexelOffsets()V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    .line 140
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->mFilters:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 141
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v1

    const-string v2, "texelWidthOffset"

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v1

    .line 142
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v2

    const-string v3, "texelHeightOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 143
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v3

    const-string v4, "radius"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 144
    iget v4, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->mOutputWidth:I

    int-to-float v4, v4

    div-float v4, v6, v4

    invoke-virtual {v0, v1, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 145
    invoke-virtual {v0, v2, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 146
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->blurSize:F

    invoke-virtual {v0, v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 148
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->mFilters:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 149
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v1

    const-string v2, "texelWidthOffset"

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v1

    .line 150
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v2

    const-string v3, "texelHeightOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 151
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->getProgram()I

    move-result v3

    const-string v4, "radius"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 152
    invoke-virtual {v0, v1, v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 153
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->mOutputHeight:I

    int-to-float v1, v1

    div-float v1, v6, v1

    invoke-virtual {v0, v2, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 154
    iget v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->blurSize:F

    invoke-virtual {v0, v3, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->setFloat(IF)V

    .line 155
    return-void
.end method

.method public setBlurSize(F)V
    .locals 1

    .prologue
    .line 129
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->blurSize:F

    .line 130
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter$1;

    invoke-direct {v0, p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageMinBlurFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 136
    return-void
.end method
