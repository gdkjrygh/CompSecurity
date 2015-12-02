.class Lcom/facebook/orca/camera/ab;
.super Lcom/facebook/orca/camera/y;
.source "Util.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/facebook/orca/camera/x;

.field private final b:Landroid/app/ProgressDialog;

.field private final c:Ljava/lang/Runnable;

.field private final d:Landroid/os/Handler;

.field private final e:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/camera/x;Ljava/lang/Runnable;Landroid/app/ProgressDialog;Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 355
    invoke-direct {p0}, Lcom/facebook/orca/camera/y;-><init>()V

    .line 347
    new-instance v0, Lcom/facebook/orca/camera/ac;

    invoke-direct {v0, p0}, Lcom/facebook/orca/camera/ac;-><init>(Lcom/facebook/orca/camera/ab;)V

    iput-object v0, p0, Lcom/facebook/orca/camera/ab;->e:Ljava/lang/Runnable;

    .line 356
    iput-object p1, p0, Lcom/facebook/orca/camera/ab;->a:Lcom/facebook/orca/camera/x;

    .line 357
    iput-object p3, p0, Lcom/facebook/orca/camera/ab;->b:Landroid/app/ProgressDialog;

    .line 358
    iput-object p2, p0, Lcom/facebook/orca/camera/ab;->c:Ljava/lang/Runnable;

    .line 359
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->a:Lcom/facebook/orca/camera/x;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/camera/x;->a(Lcom/facebook/orca/camera/z;)V

    .line 360
    iput-object p4, p0, Lcom/facebook/orca/camera/ab;->d:Landroid/os/Handler;

    .line 361
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/camera/ab;)Lcom/facebook/orca/camera/x;
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->a:Lcom/facebook/orca/camera/x;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/camera/ab;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->b:Landroid/app/ProgressDialog;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/facebook/orca/camera/x;)V
    .locals 2

    .prologue
    .line 376
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->e:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 377
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/camera/ab;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 378
    return-void
.end method

.method public c(Lcom/facebook/orca/camera/x;)V
    .locals 1

    .prologue
    .line 387
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 388
    return-void
.end method

.method public d(Lcom/facebook/orca/camera/x;)V
    .locals 1

    .prologue
    .line 382
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->hide()V

    .line 383
    return-void
.end method

.method public run()V
    .locals 3

    .prologue
    .line 365
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    iget-object v0, p0, Lcom/facebook/orca/camera/ab;->d:Landroid/os/Handler;

    iget-object v1, p0, Lcom/facebook/orca/camera/ab;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 369
    return-void

    .line 367
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/orca/camera/ab;->d:Landroid/os/Handler;

    iget-object v2, p0, Lcom/facebook/orca/camera/ab;->e:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method
