.class public final Lcom/roidapp/baselib/gl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/gl/GPUTestView;


# direct methods
.method public constructor <init>(Lcom/roidapp/baselib/gl/GPUTestView;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/roidapp/baselib/gl/b;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 177
    return-void
.end method


# virtual methods
.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 0

    .prologue
    .line 183
    return-void
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    .prologue
    .line 189
    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 2

    .prologue
    .line 207
    iget-object v0, p0, Lcom/roidapp/baselib/gl/b;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    const/16 v1, 0x1f00

    invoke-interface {p1, v1}, Ljavax/microedition/khronos/opengles/GL10;->glGetString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Lcom/roidapp/baselib/gl/GPUTestView;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "vendor "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/baselib/gl/b;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    invoke-static {v1}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Lcom/roidapp/baselib/gl/GPUTestView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    const/16 v0, 0x1f02

    invoke-interface {p1, v0}, Ljavax/microedition/khronos/opengles/GL10;->glGetString(I)Ljava/lang/String;

    .line 213
    iget-object v0, p0, Lcom/roidapp/baselib/gl/b;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    const/16 v1, 0x1f01

    invoke-interface {p1, v1}, Ljavax/microedition/khronos/opengles/GL10;->glGetString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->b(Lcom/roidapp/baselib/gl/GPUTestView;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Model "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/baselib/gl/b;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    invoke-static {v1}, Lcom/roidapp/baselib/gl/GPUTestView;->b(Lcom/roidapp/baselib/gl/GPUTestView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    iget-object v0, p0, Lcom/roidapp/baselib/gl/b;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    iget-object v1, p0, Lcom/roidapp/baselib/gl/b;->a:Lcom/roidapp/baselib/gl/GPUTestView;

    invoke-static {v1}, Lcom/roidapp/baselib/gl/GPUTestView;->b(Lcom/roidapp/baselib/gl/GPUTestView;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/GPUTestView;->a(Ljava/lang/String;)V

    .line 217
    return-void
.end method
