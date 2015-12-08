.class final Lcom/mopub/mraid/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/mopub/common/VisibleForTesting;
.end annotation


# instance fields
.field private final a:Landroid/os/Handler;

.field private b:Lcom/mopub/mraid/r;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 433
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mopub/mraid/q;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method final varargs a([Landroid/view/View;)Lcom/mopub/mraid/r;
    .locals 3

    .prologue
    .line 437
    new-instance v0, Lcom/mopub/mraid/r;

    iget-object v1, p0, Lcom/mopub/mraid/q;->a:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lcom/mopub/mraid/r;-><init>(Landroid/os/Handler;[Landroid/view/View;B)V

    iput-object v0, p0, Lcom/mopub/mraid/q;->b:Lcom/mopub/mraid/r;

    .line 438
    iget-object v0, p0, Lcom/mopub/mraid/q;->b:Lcom/mopub/mraid/r;

    return-object v0
.end method

.method final a()V
    .locals 1

    .prologue
    .line 442
    iget-object v0, p0, Lcom/mopub/mraid/q;->b:Lcom/mopub/mraid/r;

    if-eqz v0, :cond_0

    .line 443
    iget-object v0, p0, Lcom/mopub/mraid/q;->b:Lcom/mopub/mraid/r;

    invoke-virtual {v0}, Lcom/mopub/mraid/r;->a()V

    .line 444
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mopub/mraid/q;->b:Lcom/mopub/mraid/r;

    .line 446
    :cond_0
    return-void
.end method
