.class final Lcom/roidapp/baselib/gl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$EGLConfigChooser;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/gl/GPUTestView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/gl/GPUTestView;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/roidapp/baselib/gl/a;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final chooseConfig(Ljavax/microedition/khronos/egl/EGL10;Ljavax/microedition/khronos/egl/EGLDisplay;)Ljavax/microedition/khronos/egl/EGLConfig;
    .locals 12

    .prologue
    const/4 v0, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 87
    new-array v5, v0, [I

    .line 91
    const/16 v0, 0xf

    new-array v2, v0, [I

    fill-array-data v2, :array_0

    .line 102
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    invoke-interface {p1, p2, v0}, Ljavax/microedition/khronos/egl/EGL10;->eglInitialize(Ljavax/microedition/khronos/egl/EGLDisplay;[I)Z

    move-result v0

    .line 103
    if-nez v0, :cond_0

    .line 104
    const-string v0, "GPUTestView"

    const-string v1, "default eglInitialize failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 105
    iget-object v0, p0, Lcom/roidapp/baselib/gl/a;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Ljava/lang/String;)V

    .line 136
    :goto_0
    return-object v3

    :cond_0
    move-object v0, p1

    move-object v1, p2

    .line 111
    invoke-interface/range {v0 .. v5}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    .line 113
    aget v0, v5, v4

    .line 114
    if-gez v0, :cond_1

    .line 115
    const-string v0, "GPUTestView"

    const-string v1, "default eglChooseConfig failed step1"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    iget-object v0, p0, Lcom/roidapp/baselib/gl/a;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 120
    :cond_1
    new-array v9, v0, [Ljavax/microedition/khronos/egl/EGLConfig;

    .line 123
    const/4 v10, 0x1

    move-object v6, p1

    move-object v7, p2

    move-object v8, v2

    move-object v11, v5

    :try_start_0
    invoke-interface/range {v6 .. v11}, Ljavax/microedition/khronos/egl/EGL10;->eglChooseConfig(Ljavax/microedition/khronos/egl/EGLDisplay;[I[Ljavax/microedition/khronos/egl/EGLConfig;I[I)Z

    move-result v0

    .line 124
    if-nez v0, :cond_2

    .line 125
    const-string v0, "GPUTestView"

    const-string v1, "default eglChooseConfig failed step2"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    iget-object v0, p0, Lcom/roidapp/baselib/gl/a;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 130
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 131
    iget-object v0, p0, Lcom/roidapp/baselib/gl/a;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    const-string v1, "N/A"

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 136
    :cond_2
    aget-object v3, v9, v4

    goto :goto_0

    .line 91
    :array_0
    .array-data 4
        0x3025
        0x10
        0x3026
        0x0
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3021
        0x8
        0x3040
        0x4
        0x3038
    .end array-data

    .line 102
    :array_1
    .array-data 4
        0x2
        0x0
    .end array-data
.end method
