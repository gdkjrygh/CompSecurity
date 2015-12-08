.class public Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NO_FILTER_FRAGMENT_SHADER:Ljava/lang/String; = "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"

.field public static final NO_FILTER_VERTEX_SHADER:Ljava/lang/String; = "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

.field protected static mSrcTexId:I

.field protected static mSrcThumbnailTexId:I


# instance fields
.field protected isCameraRender:Z

.field protected isDarkCorner:Z

.field protected isUseSrcTex:Z

.field private final mFragmentShader:Ljava/lang/String;

.field protected mGLAttribPosition:I

.field protected mGLAttribTextureCoordinate:I

.field protected mGLProgId:I

.field protected mGLUniformTexture:I

.field private mIsInitialized:Z

.field protected mOutputHeight:I

.field protected mOutputWidth:I

.field private final mRunOnDraw:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field protected mUseSrcTex:Z

.field private final mVertexShader:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 70
    const-string v0, "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}"

    const-string v1, "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}"

    invoke-direct {p0, v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->isDarkCorner:Z

    .line 65
    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->isCameraRender:Z

    .line 74
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mRunOnDraw:Ljava/util/LinkedList;

    .line 75
    iput-object p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mVertexShader:Ljava/lang/String;

    .line 76
    iput-object p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mFragmentShader:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public static convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 297
    new-instance v0, Ljava/util/Scanner;

    invoke-direct {v0, p0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V

    const-string v1, "\\A"

    invoke-virtual {v0, v1}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/util/Scanner;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public static loadShader(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 283
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 284
    invoke-virtual {v0, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 286
    invoke-static {v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    .line 287
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 293
    :goto_0
    return-object v0

    .line 290
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 293
    const-string v0, ""

    goto :goto_0
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    .prologue
    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mIsInitialized:Z

    .line 101
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLProgId:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 102
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDestroy()V

    .line 103
    return-void
.end method

.method public getAttribPosition()I
    .locals 1

    .prologue
    .line 173
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribPosition:I

    return v0
.end method

.method public getAttribTextureCoordinate()I
    .locals 1

    .prologue
    .line 177
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribTextureCoordinate:I

    return v0
.end method

.method public getOutputHeight()I
    .locals 1

    .prologue
    .line 165
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mOutputHeight:I

    return v0
.end method

.method public getOutputWidth()I
    .locals 1

    .prologue
    .line 161
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mOutputWidth:I

    return v0
.end method

.method public getProgram()I
    .locals 1

    .prologue
    .line 169
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLProgId:I

    return v0
.end method

.method public getUniformTexture()I
    .locals 1

    .prologue
    .line 181
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLUniformTexture:I

    return v0
.end method

.method public final init()V
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInit()V

    .line 82
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mIsInitialized:Z

    .line 83
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onInitialized()V

    .line 84
    return-void
.end method

.method public isInitialized()Z
    .locals 1

    .prologue
    .line 157
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mIsInitialized:Z

    return v0
.end method

.method public onDestroy()V
    .locals 0

    .prologue
    .line 106
    return-void
.end method

.method public onDraw(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;)V
    .locals 7

    .prologue
    const/16 v2, 0x1406

    const/16 v6, 0xde1

    const/4 v1, 0x2

    const/4 v3, 0x0

    .line 120
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLProgId:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 121
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runPendingOnDrawTasks()V

    .line 122
    iget-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mIsInitialized:Z

    if-nez v0, :cond_0

    .line 143
    :goto_0
    return-void

    .line 126
    :cond_0
    invoke-virtual {p2, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 127
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribPosition:I

    move v4, v3

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 128
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribPosition:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 129
    invoke-virtual {p3, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 130
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribTextureCoordinate:I

    move v4, v3

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 132
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribTextureCoordinate:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 133
    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 134
    const v0, 0x84c0

    invoke-static {v0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 135
    invoke-static {v6, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 136
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLUniformTexture:I

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 138
    :cond_1
    invoke-virtual {p0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->onDrawArraysPre()V

    .line 139
    const/4 v0, 0x5

    const/4 v1, 0x4

    invoke-static {v0, v3, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 140
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribPosition:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 141
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribTextureCoordinate:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    .line 142
    invoke-static {v6, v3}, Landroid/opengl/GLES20;->glBindTexture(II)V

    goto :goto_0
.end method

.method protected onDrawArraysPre()V
    .locals 0

    .prologue
    .line 145
    return-void
.end method

.method public onInit()V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mVertexShader:Ljava/lang/String;

    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mFragmentShader:Ljava/lang/String;

    invoke-static {v0, v1}, Ljp/co/cyberagent/android/gpuimage/OpenGlUtils;->loadProgram(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLProgId:I

    .line 88
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLProgId:I

    const-string v1, "position"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribPosition:I

    .line 89
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLProgId:I

    const-string v1, "inputImageTexture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLUniformTexture:I

    .line 90
    iget v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLProgId:I

    const-string v1, "inputTextureCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mGLAttribTextureCoordinate:I

    .line 92
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mIsInitialized:Z

    .line 94
    return-void
.end method

.method public onInitialized()V
    .locals 0

    .prologue
    .line 97
    return-void
.end method

.method public onOutputSizeChanged(II)V
    .locals 0

    .prologue
    .line 109
    iput p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mOutputWidth:I

    .line 110
    iput p2, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mOutputHeight:I

    .line 111
    return-void
.end method

.method protected runOnDraw(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 276
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mRunOnDraw:Ljava/util/LinkedList;

    monitor-enter v1

    .line 277
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mRunOnDraw:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 278
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected runPendingOnDrawTasks()V
    .locals 2

    .prologue
    .line 149
    iget-object v1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mRunOnDraw:Ljava/util/LinkedList;

    monitor-enter v1

    .line 150
    :goto_0
    :try_start_0
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mRunOnDraw:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    iget-object v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->mRunOnDraw:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 153
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public setDarkCorner(Z)V
    .locals 1

    .prologue
    .line 114
    iput-boolean p1, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->isDarkCorner:Z

    .line 115
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->isCameraRender:Z

    .line 116
    return-void
.end method

.method protected setFloat(IF)V
    .locals 1

    .prologue
    .line 198
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$2;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;IF)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 204
    return-void
.end method

.method protected setFloatArray(I[F)V
    .locals 1

    .prologue
    .line 234
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$6;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$6;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;I[F)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 240
    return-void
.end method

.method protected setFloatVec2(I[F)V
    .locals 1

    .prologue
    .line 207
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$3;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$3;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;I[F)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 213
    return-void
.end method

.method protected setFloatVec3(I[F)V
    .locals 1

    .prologue
    .line 216
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$4;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;I[F)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 222
    return-void
.end method

.method protected setFloatVec4(I[F)V
    .locals 1

    .prologue
    .line 225
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$5;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$5;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;I[F)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 231
    return-void
.end method

.method protected setInteger(II)V
    .locals 1

    .prologue
    .line 189
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$1;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;II)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 195
    return-void
.end method

.method protected setPoint(ILandroid/graphics/PointF;)V
    .locals 1

    .prologue
    .line 243
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;

    invoke-direct {v0, p0, p2, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$7;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;Landroid/graphics/PointF;I)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 253
    return-void
.end method

.method protected setUniformMatrix3f(I[F)V
    .locals 1

    .prologue
    .line 256
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$8;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$8;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;I[F)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 263
    return-void
.end method

.method protected setUniformMatrix4f(I[F)V
    .locals 1

    .prologue
    .line 266
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$9;

    invoke-direct {v0, p0, p1, p2}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter$9;-><init>(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;I[F)V

    invoke-virtual {p0, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;->runOnDraw(Ljava/lang/Runnable;)V

    .line 273
    return-void
.end method
