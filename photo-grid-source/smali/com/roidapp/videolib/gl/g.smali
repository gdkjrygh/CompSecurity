.class public final Lcom/roidapp/videolib/gl/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[F

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-string v0, "GPUTransition"

    sput-object v0, Lcom/roidapp/videolib/gl/g;->b:Ljava/lang/String;

    .line 23
    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/roidapp/videolib/gl/g;->a:[F

    return-void

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static a(FF)F
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 319
    cmpl-float v1, p0, v0

    if-nez v1, :cond_0

    .line 322
    :goto_0
    return p1

    :cond_0
    move p1, v0

    goto :goto_0
.end method

.method public static a(Landroid/graphics/Bitmap;IZ)I
    .locals 7

    .prologue
    const/4 v6, 0x1

    const v5, 0x47012f00    # 33071.0f

    const v4, 0x46180400    # 9729.0f

    const/16 v3, 0xde1

    const/4 v2, 0x0

    .line 31
    new-array v0, v6, [I

    .line 32
    aput p1, v0, v2

    .line 33
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 34
    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    .line 35
    invoke-static {v6, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 36
    const-string v1, "glGenTextures"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 37
    aget v1, v0, v2

    invoke-static {v3, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 38
    const-string v1, "glBindTexture"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 39
    const/16 v1, 0x2800

    invoke-static {v3, v1, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 41
    const-string v1, "glTexParameterf"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 42
    const/16 v1, 0x2801

    invoke-static {v3, v1, v4}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 44
    const-string v1, "glTexParameterf"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 45
    const/16 v1, 0x2802

    invoke-static {v3, v1, v5}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 47
    const-string v1, "glTexParameterf"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 48
    const/16 v1, 0x2803

    invoke-static {v3, v1, v5}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 50
    const-string v1, "glTexParameterf"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 52
    invoke-static {v3, v2, p0, v2}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    .line 53
    const-string v1, "texImage2D"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 62
    :cond_0
    :goto_0
    if-eqz p2, :cond_1

    .line 63
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 64
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 69
    :cond_1
    aget v0, v0, v2

    return v0

    .line 55
    :cond_2
    invoke-static {v3, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 56
    const-string v1, "glBindTexture"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 57
    invoke-static {v3, v2, v2, v2, p0}, Landroid/opengl/GLUtils;->texSubImage2D(IIIILandroid/graphics/Bitmap;)V

    .line 58
    const-string v1, "texSubImage2D"

    invoke-static {v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 59
    aput p1, v0, v2

    goto :goto_0
.end method

.method private static a(Ljava/lang/String;I)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 267
    const/4 v1, 0x1

    new-array v2, v1, [I

    .line 268
    invoke-static {p1}, Landroid/opengl/GLES20;->glCreateShader(I)I

    move-result v1

    .line 269
    invoke-static {v1, p0}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 270
    invoke-static {v1}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 271
    const v3, 0x8b81

    invoke-static {v1, v3, v2, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 272
    aget v2, v2, v0

    if-nez v2, :cond_0

    .line 273
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Compilation\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 283
    const/4 v1, 0x1

    new-array v2, v1, [I

    .line 284
    const v1, 0x8b31

    invoke-static {p0, v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;I)I

    move-result v3

    .line 285
    if-nez v3, :cond_1

    .line 309
    :cond_0
    :goto_0
    return v0

    .line 289
    :cond_1
    const v1, 0x8b30

    invoke-static {p1, v1}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;I)I

    move-result v4

    .line 290
    if-eqz v4, :cond_0

    .line 295
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v1

    .line 297
    invoke-static {v1, v3}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 298
    invoke-static {v1, v4}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 300
    invoke-static {v1}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    .line 302
    const v5, 0x8b82

    invoke-static {v1, v5, v2, v0}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 303
    aget v2, v2, v0

    if-lez v2, :cond_0

    .line 307
    invoke-static {v3}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 308
    invoke-static {v4}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    move v0, v1

    .line 309
    goto :goto_0
.end method

.method public static a(Ljava/nio/ByteBuffer;III)I
    .locals 10

    .prologue
    .line 189
    const/4 v0, 0x1

    new-array v9, v0, [I

    .line 190
    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    .line 191
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v9, v1}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 192
    const/16 v0, 0xde1

    const/4 v1, 0x0

    aget v1, v9, v1

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 193
    const/16 v0, 0xde1

    const/16 v1, 0x2800

    const v2, 0x46180400    # 9729.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 195
    const/16 v0, 0xde1

    const/16 v1, 0x2801

    const v2, 0x46180400    # 9729.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 197
    const/16 v0, 0xde1

    const/16 v1, 0x2802

    const v2, 0x47012f00    # 33071.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 199
    const/16 v0, 0xde1

    const/16 v1, 0x2803

    const v2, 0x47012f00    # 33071.0f

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 201
    const/16 v0, 0xde1

    const/4 v1, 0x0

    const/16 v2, 0x1908

    const/4 v5, 0x0

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    move v3, p1

    move v4, p2

    move-object v8, p0

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 209
    :goto_0
    const/4 v0, 0x0

    aget v0, v9, v0

    return v0

    .line 204
    :cond_0
    const/16 v0, 0xde1

    invoke-static {v0, p3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 205
    const/16 v0, 0xde1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    move v4, p1

    move v5, p2

    move-object v8, p0

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexSubImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 207
    const/4 v0, 0x0

    aput p3, v9, v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 152
    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    sget-object v1, Lcom/roidapp/videolib/gl/g;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ": glError "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 156
    :cond_0
    return-void
.end method

.method public static a(Ljava/nio/FloatBuffer;)[F
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/16 v6, 0x8

    const/4 v2, 0x0

    .line 326
    new-array v3, v6, [F

    .line 327
    invoke-virtual {p0, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 328
    invoke-virtual {p0, v3}, Ljava/nio/FloatBuffer;->get([F)Ljava/nio/FloatBuffer;

    .line 329
    const/high16 v0, 0x3f800000    # 1.0f

    move v1, v2

    .line 330
    :goto_0
    if-ge v1, v6, :cond_0

    .line 331
    aget v4, v3, v1

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-eqz v4, :cond_1

    .line 332
    aget v0, v3, v1

    .line 336
    :cond_0
    new-array v1, v6, [F

    aget v4, v3, v2

    aput v4, v1, v2

    aget v2, v3, v7

    invoke-static {v2, v0}, Lcom/roidapp/videolib/gl/g;->a(FF)F

    move-result v2

    aput v2, v1, v7

    aget v2, v3, v8

    aput v2, v1, v8

    aget v2, v3, v9

    invoke-static {v2, v0}, Lcom/roidapp/videolib/gl/g;->a(FF)F

    move-result v2

    aput v2, v1, v9

    const/4 v2, 0x4

    const/4 v4, 0x4

    aget v4, v3, v4

    aput v4, v1, v2

    const/4 v2, 0x5

    const/4 v4, 0x5

    aget v4, v3, v4

    invoke-static {v4, v0}, Lcom/roidapp/videolib/gl/g;->a(FF)F

    move-result v4

    aput v4, v1, v2

    const/4 v2, 0x6

    const/4 v4, 0x6

    aget v4, v3, v4

    aput v4, v1, v2

    const/4 v2, 0x7

    const/4 v4, 0x7

    aget v3, v3, v4

    invoke-static {v3, v0}, Lcom/roidapp/videolib/gl/g;->a(FF)F

    move-result v0

    aput v0, v1, v2

    .line 339
    return-object v1

    .line 330
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
