.class Lcom/facebook/orca/threadlist/aj;
.super Ljava/lang/Object;
.source "ThreadListAdapter.java"

# interfaces
.implements Lcom/google/common/base/Supplier;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Supplier",
        "<",
        "Lcom/facebook/orca/threadlist/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/af;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/threadlist/af;)V
    .locals 0

    .prologue
    .line 339
    iput-object p1, p0, Lcom/facebook/orca/threadlist/aj;->a:Lcom/facebook/orca/threadlist/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/threadlist/af;Lcom/facebook/orca/threadlist/ag;)V
    .locals 0

    .prologue
    .line 339
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/aj;-><init>(Lcom/facebook/orca/threadlist/af;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadlist/q;
    .locals 2

    .prologue
    .line 343
    new-instance v0, Lcom/facebook/orca/threadlist/q;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/aj;->a:Lcom/facebook/orca/threadlist/af;

    invoke-static {v1}, Lcom/facebook/orca/threadlist/af;->c(Lcom/facebook/orca/threadlist/af;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadlist/q;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 339
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/aj;->a()Lcom/facebook/orca/threadlist/q;

    move-result-object v0

    return-object v0
.end method
