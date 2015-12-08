.class public Lcom/roidapp/baselib/gl/GPUTestView;
.super Landroid/opengl/GLSurfaceView;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;)V

    .line 49
    invoke-direct {p0}, Lcom/roidapp/baselib/gl/GPUTestView;->a()V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0, p1, p2}, Landroid/opengl/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 54
    invoke-direct {p0}, Lcom/roidapp/baselib/gl/GPUTestView;->a()V

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/gl/GPUTestView;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/baselib/gl/GPUTestView;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/baselib/gl/GPUTestView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/roidapp/baselib/gl/GPUTestView;->a:Ljava/lang/String;

    return-object p1
.end method

.method private a()V
    .locals 2

    .prologue
    .line 144
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/gl/GPUTestView;->setEGLContextClientVersion(I)V

    .line 1082
    new-instance v0, Lcom/roidapp/baselib/gl/a;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/gl/a;-><init>(Lcom/roidapp/baselib/gl/GPUTestView;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/gl/GPUTestView;->setEGLConfigChooser(Landroid/opengl/GLSurfaceView$EGLConfigChooser;)V

    .line 147
    invoke-virtual {p0}, Lcom/roidapp/baselib/gl/GPUTestView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 149
    new-instance v0, Lcom/roidapp/baselib/gl/b;

    invoke-direct {v0, p0}, Lcom/roidapp/baselib/gl/b;-><init>(Lcom/roidapp/baselib/gl/GPUTestView;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/gl/GPUTestView;->setRenderer(Landroid/opengl/GLSurfaceView$Renderer;)V

    .line 150
    return-void
.end method

.method static synthetic b(Lcom/roidapp/baselib/gl/GPUTestView;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/roidapp/baselib/gl/GPUTestView;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/baselib/gl/GPUTestView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/roidapp/baselib/gl/GPUTestView;->b:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public final a(Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/roidapp/baselib/gl/GPUTestView;->c:Landroid/os/Handler;

    .line 154
    invoke-virtual {p0}, Lcom/roidapp/baselib/gl/GPUTestView;->requestRender()V

    .line 155
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 166
    iget-object v0, p0, Lcom/roidapp/baselib/gl/GPUTestView;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/roidapp/baselib/gl/GPUTestView;->c:Landroid/os/Handler;

    const/16 v1, 0x1230

    invoke-static {v0, v1, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/roidapp/baselib/gl/GPUTestView;->c:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 170
    :cond_0
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 0

    .prologue
    .line 69
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onAttachedToWindow()V

    .line 70
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 75
    :try_start_0
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onDetachedFromWindow()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    :goto_0
    return-void

    .line 77
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onPause()V
    .locals 0

    .prologue
    .line 59
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onPause()V

    .line 60
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 64
    invoke-super {p0}, Landroid/opengl/GLSurfaceView;->onResume()V

    .line 65
    return-void
.end method
