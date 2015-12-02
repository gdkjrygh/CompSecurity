.class Lcom/facebook/fbservice/service/c;
.super Ljava/lang/Object;
.source "BlueService.java"

# interfaces
.implements Ljavax/inject/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/a",
        "<",
        "Lcom/facebook/common/executors/i;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 330
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 331
    iput-object p1, p0, Lcom/facebook/fbservice/service/c;->a:Ljava/lang/String;

    .line 332
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/executors/i;
    .locals 3

    .prologue
    .line 336
    new-instance v0, Landroid/os/HandlerThread;

    iget-object v1, p0, Lcom/facebook/fbservice/service/c;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 337
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 338
    new-instance v1, Lcom/facebook/common/executors/j;

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v1, v2}, Lcom/facebook/common/executors/j;-><init>(Landroid/os/Handler;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 326
    invoke-virtual {p0}, Lcom/facebook/fbservice/service/c;->a()Lcom/facebook/common/executors/i;

    move-result-object v0

    return-object v0
.end method
