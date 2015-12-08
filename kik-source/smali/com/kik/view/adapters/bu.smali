.class final Lcom/kik/view/adapters/bu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/bf$b;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:Lcom/kik/view/adapters/bf;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/bf;Lcom/kik/view/adapters/bf$b;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 438
    iput-object p1, p0, Lcom/kik/view/adapters/bu;->c:Lcom/kik/view/adapters/bf;

    iput-object p2, p0, Lcom/kik/view/adapters/bu;->a:Lcom/kik/view/adapters/bf$b;

    iput-object p3, p0, Lcom/kik/view/adapters/bu;->b:Lkik/a/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    .prologue
    .line 442
    iget-object v0, p0, Lcom/kik/view/adapters/bu;->c:Lcom/kik/view/adapters/bf;

    iget-object v0, v0, Lcom/kik/view/adapters/bf;->s:Landroid/os/Handler;

    new-instance v1, Lcom/kik/view/adapters/bv;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/bv;-><init>(Lcom/kik/view/adapters/bu;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 449
    invoke-static {}, Lkik/android/util/DeviceUtils;->f()I

    .line 450
    return-void
.end method
