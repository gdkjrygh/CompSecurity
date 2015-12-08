.class final Lcom/mopub/mraid/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field private final b:[Landroid/view/View;

.field private final c:Landroid/os/Handler;

.field private d:Ljava/lang/Runnable;

.field private final e:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>(Landroid/os/Handler;[Landroid/view/View;)V
    .locals 1

    .prologue
    .line 381
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 394
    new-instance v0, Lcom/mopub/mraid/s;

    invoke-direct {v0, p0}, Lcom/mopub/mraid/s;-><init>(Lcom/mopub/mraid/r;)V

    iput-object v0, p0, Lcom/mopub/mraid/r;->e:Ljava/lang/Runnable;

    .line 382
    iput-object p1, p0, Lcom/mopub/mraid/r;->c:Landroid/os/Handler;

    .line 383
    iput-object p2, p0, Lcom/mopub/mraid/r;->b:[Landroid/view/View;

    .line 384
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Handler;[Landroid/view/View;B)V
    .locals 0

    .prologue
    .line 375
    invoke-direct {p0, p1, p2}, Lcom/mopub/mraid/r;-><init>(Landroid/os/Handler;[Landroid/view/View;)V

    return-void
.end method

.method static synthetic a(Lcom/mopub/mraid/r;)[Landroid/view/View;
    .locals 1

    .prologue
    .line 375
    iget-object v0, p0, Lcom/mopub/mraid/r;->b:[Landroid/view/View;

    return-object v0
.end method

.method static synthetic b(Lcom/mopub/mraid/r;)V
    .locals 1

    .prologue
    .line 375
    .line 1387
    iget v0, p0, Lcom/mopub/mraid/r;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/mopub/mraid/r;->a:I

    .line 1388
    iget v0, p0, Lcom/mopub/mraid/r;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mopub/mraid/r;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 1389
    iget-object v0, p0, Lcom/mopub/mraid/r;->d:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1390
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mraid/r;->d:Ljava/lang/Runnable;

    .line 375
    :cond_0
    return-void
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lcom/mopub/mraid/r;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mraid/r;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 429
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mraid/r;->d:Ljava/lang/Runnable;

    .line 430
    return-void
.end method

.method final a(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 422
    iput-object p1, p0, Lcom/mopub/mraid/r;->d:Ljava/lang/Runnable;

    .line 423
    iget-object v0, p0, Lcom/mopub/mraid/r;->b:[Landroid/view/View;

    array-length v0, v0

    iput v0, p0, Lcom/mopub/mraid/r;->a:I

    .line 424
    iget-object v0, p0, Lcom/mopub/mraid/r;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mopub/mraid/r;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 425
    return-void
.end method
