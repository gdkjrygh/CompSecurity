.class public final Ljp/co/cyberagent/android/a/t;
.super Ljp/co/cyberagent/android/a/am;
.source "SourceFile"


# instance fields
.field private F:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 116
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Ljp/co/cyberagent/android/a/t;-><init>(F)V

    .line 117
    return-void
.end method

.method public constructor <init>(F)V
    .locals 4

    .prologue
    .line 121
    const-string v0, "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"

    const-string v1, "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n"

    const-string v2, "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 centerTextureCoordinate;\n\nvoid main()\n{\ngl_Position = position;\n\ncenterTextureCoordinate = inputTextureCoordinate;\n}\n"

    const-string v3, "precision highp float;\n\n\nuniform sampler2D inputImageTexture;\n\nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \n\nvarying vec2 centerTextureCoordinate;\n\nvec4 minColor(vec4 color1, vec4 color2)\n{\n\tvec4 color;\n\tcolor.r = min(color1.r, color2.r); \n   color.g = min(color1.g, color2.g); \n   color.b = min(color1.b, color2.b); \n   return color;\n}\nvec4 minTriColor(vec2 coord, vec4 baseColor)\n{\n   vec4 minc;\n   vec4 baseColorTop = texture2D(inputImageTexture, centerTextureCoordinate-coord); \n   vec4 baseColorBottom = texture2D(inputImageTexture, centerTextureCoordinate+coord); \n   minc = minColor(baseColorTop, baseColor);\n   minc = minColor(baseColorBottom, minc);\n   return minc;\n}\n\nvoid main()\n{\n   vec2 offsetCoordinate = vec2(texelWidthOffset,texelHeightOffset); \n   vec2 offsetCoordinate2 = vec2(2.0*texelWidthOffset,2.0*texelHeightOffset); \n   vec2 offsetCoordinate3 = vec2(3.0*texelWidthOffset,3.0*texelHeightOffset); \n   vec2 offsetCoordinate4 = vec2(4.0*texelWidthOffset,4.0*texelHeightOffset); \n   vec2 offsetCoordinate5 = vec2(5.0*texelWidthOffset,5.0*texelHeightOffset); \n   vec2 offsetCoordinate6 = vec2(6.0*texelWidthOffset,6.0*texelHeightOffset); \n   //vec2 offsetCoordinate7 = vec2(7.0*texelWidthOffset,7.0*texelHeightOffset); \n   vec4 baseColor = texture2D(inputImageTexture, centerTextureCoordinate); \n   baseColor = minTriColor(offsetCoordinate, baseColor);\n   baseColor = minTriColor(offsetCoordinate2, baseColor);\n   baseColor = minTriColor(offsetCoordinate3, baseColor);\n   baseColor = minTriColor(offsetCoordinate4, baseColor);\n   baseColor = minTriColor(offsetCoordinate5, baseColor);\n   baseColor = minTriColor(offsetCoordinate6, baseColor);\n   //baseColor = minTriColor(offsetCoordinate7, baseColor);\n\n   gl_FragColor = baseColor;\n}\n"

    invoke-direct {p0, v0, v1, v2, v3}, Ljp/co/cyberagent/android/a/am;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Ljp/co/cyberagent/android/a/t;->F:F

    .line 122
    iput p1, p0, Ljp/co/cyberagent/android/a/t;->F:F

    .line 123
    return-void
.end method


# virtual methods
.method public final f()F
    .locals 1

    .prologue
    .line 161
    iget v0, p0, Ljp/co/cyberagent/android/a/t;->F:F

    return v0
.end method

.method public final g()F
    .locals 1

    .prologue
    .line 166
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method protected final r()V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    .line 142
    iget-object v0, p0, Ljp/co/cyberagent/android/a/t;->y:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 143
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v1

    const-string v2, "texelWidthOffset"

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v1

    .line 144
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v2

    const-string v3, "texelHeightOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 145
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v3

    const-string v4, "radius"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 146
    iget v4, p0, Ljp/co/cyberagent/android/a/t;->g:I

    int-to-float v4, v4

    div-float v4, v6, v4

    invoke-virtual {v0, v1, v4}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 147
    invoke-virtual {v0, v2, v5}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 148
    iget v1, p0, Ljp/co/cyberagent/android/a/t;->F:F

    invoke-virtual {v0, v3, v1}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 150
    iget-object v0, p0, Ljp/co/cyberagent/android/a/t;->y:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 151
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v1

    const-string v2, "texelWidthOffset"

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v1

    .line 152
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v2

    const-string v3, "texelHeightOffset"

    invoke-static {v2, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v2

    .line 153
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->p()I

    move-result v3

    const-string v4, "radius"

    invoke-static {v3, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v3

    .line 154
    invoke-virtual {v0, v1, v5}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 155
    iget v1, p0, Ljp/co/cyberagent/android/a/t;->h:I

    int-to-float v1, v1

    div-float v1, v6, v1

    invoke-virtual {v0, v2, v1}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 156
    iget v1, p0, Ljp/co/cyberagent/android/a/t;->F:F

    invoke-virtual {v0, v3, v1}, Ljp/co/cyberagent/android/a/h;->a(IF)V

    .line 157
    return-void
.end method
