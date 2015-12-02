.class Lcom/facebook/base/c/ad;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid/os/HandlerThread;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 1024
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 1024
    invoke-direct {p0}, Lcom/facebook/base/c/ad;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/HandlerThread;
    .locals 2

    .prologue
    .line 1028
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "background_handler_thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 1029
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 1030
    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1024
    invoke-virtual {p0}, Lcom/facebook/base/c/ad;->a()Landroid/os/HandlerThread;

    move-result-object v0

    return-object v0
.end method
