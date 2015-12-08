.class public final Lcom/arist/model/lrc/a;
.super Ljava/lang/Object;


# instance fields
.field public a:Z

.field private b:Lcom/arist/model/lrc/DeskLrcView;

.field private c:Landroid/os/Handler;

.field private d:Landroid/graphics/Rect;

.field private e:I

.field private f:I

.field private g:Lcom/arist/model/lrc/d;

.field private h:Ljava/lang/Runnable;

.field private i:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/arist/model/lrc/DeskLrcView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/lrc/a;->a:Z

    new-instance v0, Lcom/arist/model/lrc/b;

    invoke-direct {v0, p0}, Lcom/arist/model/lrc/b;-><init>(Lcom/arist/model/lrc/a;)V

    iput-object v0, p0, Lcom/arist/model/lrc/a;->h:Ljava/lang/Runnable;

    new-instance v0, Lcom/arist/model/lrc/c;

    invoke-direct {v0, p0}, Lcom/arist/model/lrc/c;-><init>(Lcom/arist/model/lrc/a;)V

    iput-object v0, p0, Lcom/arist/model/lrc/a;->i:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/arist/model/lrc/a;->b:Lcom/arist/model/lrc/DeskLrcView;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/arist/model/lrc/a;->c:Landroid/os/Handler;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/arist/model/lrc/a;->d:Landroid/graphics/Rect;

    return-void
.end method

.method static synthetic a(Lcom/arist/model/lrc/a;)Lcom/arist/model/lrc/DeskLrcView;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->b:Lcom/arist/model/lrc/DeskLrcView;

    return-object v0
.end method

.method static synthetic b(Lcom/arist/model/lrc/a;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->c:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/arist/model/lrc/a;)Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->i:Ljava/lang/Runnable;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->d:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final a(Lcom/arist/model/lrc/d;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/a;->g:Lcom/arist/model/lrc/d;

    return-void
.end method

.method public final a(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/arist/model/lrc/a;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/lrc/a;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/arist/model/lrc/a;->i:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/arist/model/lrc/a;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/arist/model/lrc/a;->i:Ljava/lang/Runnable;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/arist/model/lrc/a;->e:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/arist/model/lrc/a;->f:I

    iget-boolean v0, p0, Lcom/arist/model/lrc/a;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->d:Landroid/graphics/Rect;

    iget v1, p0, Lcom/arist/model/lrc/a;->e:I

    iget v2, p0, Lcom/arist/model/lrc/a;->f:I

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->g:Lcom/arist/model/lrc/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->g:Lcom/arist/model/lrc/d;

    invoke-interface {v0}, Lcom/arist/model/lrc/d;->a()V

    goto :goto_0

    :pswitch_1
    iget-boolean v0, p0, Lcom/arist/model/lrc/a;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v1, p0, Lcom/arist/model/lrc/a;->f:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, Lcom/arist/model/lrc/a;->g:Lcom/arist/model/lrc/d;

    if-nez v1, :cond_2

    const/16 v1, 0xa

    if-le v0, v1, :cond_1

    :cond_2
    iget-object v1, p0, Lcom/arist/model/lrc/a;->g:Lcom/arist/model/lrc/d;

    invoke-interface {v1, v0}, Lcom/arist/model/lrc/d;->a(I)V

    goto :goto_0

    :pswitch_2
    iget-boolean v0, p0, Lcom/arist/model/lrc/a;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/arist/model/lrc/a;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/arist/model/lrc/a;->h:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
