.class public Lcom/qihoo/security/a/a/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/a/a/a$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final b:I

.field private final c:I

.field private d:J

.field private final e:I

.field private final f:I

.field private g:Z

.field private final h:Landroid/os/Handler;

.field private i:Lcom/qihoo/security/a/a/a$a;


# direct methods
.method public constructor <init>(IIJII)V
    .locals 3

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/a/a/a;->d:J

    .line 61
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/a/a/a;->g:Z

    .line 117
    new-instance v0, Lcom/qihoo/security/a/a/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/a/a/a$1;-><init>(Lcom/qihoo/security/a/a/a;)V

    iput-object v0, p0, Lcom/qihoo/security/a/a/a;->h:Landroid/os/Handler;

    .line 73
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    .line 74
    iput p2, p0, Lcom/qihoo/security/a/a/a;->c:I

    .line 75
    iput p1, p0, Lcom/qihoo/security/a/a/a;->b:I

    .line 76
    iput-wide p3, p0, Lcom/qihoo/security/a/a/a;->d:J

    .line 77
    iput p6, p0, Lcom/qihoo/security/a/a/a;->f:I

    .line 78
    iput p5, p0, Lcom/qihoo/security/a/a/a;->e:I

    .line 79
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/a/a/a;->g:Z

    .line 80
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/a/a/a;)I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/qihoo/security/a/a/a;->b:I

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;I)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/a/a/a;->b(Ljava/util/concurrent/BlockingQueue;I)V

    return-void
.end method

.method private a(Ljava/util/concurrent/BlockingQueue;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 294
    invoke-interface {p1}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 295
    if-nez v0, :cond_0

    .line 335
    :goto_0
    return-void

    .line 298
    :cond_0
    new-instance v1, Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v2

    const/high16 v3, 0x41f00000    # 30.0f

    sub-float/2addr v2, v3

    iget v3, p0, Lcom/qihoo/security/a/a/a;->f:I

    int-to-float v3, v3

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 299
    const-wide/16 v2, 0x2ee

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 300
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 301
    new-instance v2, Lcom/qihoo/security/a/a/a$4;

    invoke-direct {v2, p0, v0, p1}, Lcom/qihoo/security/a/a/a$4;-><init>(Lcom/qihoo/security/a/a/a;Landroid/view/View;Ljava/util/concurrent/BlockingQueue;)V

    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 334
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method private a(Ljava/util/concurrent/BlockingQueue;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 189
    invoke-interface {p1}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 190
    if-nez v0, :cond_0

    .line 237
    :goto_0
    return-void

    .line 194
    :cond_0
    new-instance v1, Landroid/view/animation/TranslateAnimation;

    invoke-direct {v1, v2, v2, v2, v2}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 195
    const-wide/16 v2, 0x1cc

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 197
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    const/high16 v3, 0x3fc00000    # 1.5f

    invoke-direct {v2, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 198
    new-instance v2, Lcom/qihoo/security/a/a/a$2;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/qihoo/security/a/a/a$2;-><init>(Lcom/qihoo/security/a/a/a;Landroid/view/View;Ljava/util/concurrent/BlockingQueue;I)V

    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 236
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/a/a/a;Z)Z
    .locals 0

    .prologue
    .line 21
    iput-boolean p1, p0, Lcom/qihoo/security/a/a/a;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/a/a/a;)Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/a/a/a;Ljava/util/concurrent/BlockingQueue;I)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;I)V

    return-void
.end method

.method private b(Ljava/util/concurrent/BlockingQueue;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue",
            "<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 243
    invoke-interface {p1}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 244
    if-nez v0, :cond_0

    .line 290
    :goto_0
    return-void

    .line 248
    :cond_0
    new-instance v1, Landroid/view/animation/TranslateAnimation;

    invoke-direct {v1, v2, v2, v2, v2}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 249
    const-wide/16 v2, 0x190

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 250
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 251
    new-instance v2, Lcom/qihoo/security/a/a/a$3;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/qihoo/security/a/a/a$3;-><init>(Lcom/qihoo/security/a/a/a;Landroid/view/View;Ljava/util/concurrent/BlockingQueue;I)V

    invoke-virtual {v1, v2}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 289
    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/qihoo/security/a/a/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 142
    iget v0, p0, Lcom/qihoo/security/a/a/a;->b:I

    packed-switch v0, :pswitch_data_0

    .line 153
    :goto_0
    return-void

    .line 144
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {p0, v0}, Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;)V

    goto :goto_0

    .line 147
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/a/a/a;->b(Ljava/util/concurrent/BlockingQueue;I)V

    goto :goto_0

    .line 150
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;I)V

    goto :goto_0

    .line 142
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic d(Lcom/qihoo/security/a/a/a;)J
    .locals 2

    .prologue
    .line 21
    iget-wide v0, p0, Lcom/qihoo/security/a/a/a;->d:J

    return-wide v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 159
    iget v0, p0, Lcom/qihoo/security/a/a/a;->b:I

    packed-switch v0, :pswitch_data_0

    .line 176
    :cond_0
    return-void

    .line 161
    :goto_0
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {p0, v0}, Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;)V

    goto :goto_0

    .line 166
    :goto_1
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/a/a/a;->b(Ljava/util/concurrent/BlockingQueue;I)V

    goto :goto_1

    .line 171
    :goto_2
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/a/a/a;->a(Ljava/util/concurrent/BlockingQueue;I)V

    goto :goto_2

    .line 159
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method static synthetic e(Lcom/qihoo/security/a/a/a;)I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/qihoo/security/a/a/a;->c:I

    return v0
.end method

.method private e()V
    .locals 4

    .prologue
    .line 182
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->h:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/a/a/a;->h:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    iget-wide v2, p0, Lcom/qihoo/security/a/a/a;->d:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 183
    return-void
.end method

.method static synthetic f(Lcom/qihoo/security/a/a/a;)Lcom/qihoo/security/a/a/a$a;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->i:Lcom/qihoo/security/a/a/a$a;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/a/a/a;)Z
    .locals 1

    .prologue
    .line 21
    iget-boolean v0, p0, Lcom/qihoo/security/a/a/a;->g:Z

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    const/4 v0, 0x0

    .line 89
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v0

    goto :goto_0
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 95
    return-void
.end method

.method public a(Lcom/qihoo/security/a/a/a$a;)V
    .locals 0

    .prologue
    .line 340
    iput-object p1, p0, Lcom/qihoo/security/a/a/a;->i:Lcom/qihoo/security/a/a/a$a;

    .line 341
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 359
    iput-boolean p1, p0, Lcom/qihoo/security/a/a/a;->g:Z

    .line 360
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/qihoo/security/a/a/a;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    :goto_0
    return-void

    .line 102
    :cond_0
    iget v0, p0, Lcom/qihoo/security/a/a/a;->c:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 104
    :pswitch_0
    invoke-direct {p0}, Lcom/qihoo/security/a/a/a;->c()V

    goto :goto_0

    .line 107
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/a/a/a;->d()V

    goto :goto_0

    .line 110
    :pswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/a/a/a;->e()V

    goto :goto_0

    .line 102
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
