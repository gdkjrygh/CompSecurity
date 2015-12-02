.class Lcom/facebook/base/c/bd;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid/os/Handler;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 664
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 664
    invoke-direct {p0}, Lcom/facebook/base/c/bd;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Handler;
    .locals 2

    .prologue
    .line 668
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 664
    invoke-virtual {p0}, Lcom/facebook/base/c/bd;->a()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method
