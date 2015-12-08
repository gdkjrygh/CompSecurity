.class final Lcom/roidapp/imagelib/crop/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/a;

.field private b:Ljava/lang/Runnable;

.field private c:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/crop/a;Ljava/lang/Runnable;Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 547
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/f;->a:Lcom/roidapp/imagelib/crop/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 549
    iput-object p2, p0, Lcom/roidapp/imagelib/crop/f;->b:Ljava/lang/Runnable;

    .line 550
    iput-object p3, p0, Lcom/roidapp/imagelib/crop/f;->c:Landroid/os/Handler;

    .line 551
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 557
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/f;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 561
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/f;->c:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/crop/g;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/crop/g;-><init>(Lcom/roidapp/imagelib/crop/f;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 575
    return-void

    .line 561
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/f;->c:Landroid/os/Handler;

    new-instance v2, Lcom/roidapp/imagelib/crop/g;

    invoke-direct {v2, p0}, Lcom/roidapp/imagelib/crop/g;-><init>(Lcom/roidapp/imagelib/crop/f;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method
