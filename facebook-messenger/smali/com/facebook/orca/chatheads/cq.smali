.class Lcom/facebook/orca/chatheads/cq;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/b/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/cn;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/cn;)V
    .locals 0

    .prologue
    .line 191
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cq;->a:Lcom/facebook/orca/chatheads/cn;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 191
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/cq;-><init>(Lcom/facebook/orca/chatheads/cn;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/b/f;
    .locals 4

    .prologue
    .line 196
    new-instance v3, Lcom/facebook/orca/chatheads/b/f;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Landroid/view/WindowManager;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/cq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    const-class v2, Landroid/os/Handler;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/chatheads/cq;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/chatheads/b/f;-><init>(Landroid/content/Context;Landroid/view/WindowManager;Landroid/os/Handler;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 191
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cq;->a()Lcom/facebook/orca/chatheads/b/f;

    move-result-object v0

    return-object v0
.end method
