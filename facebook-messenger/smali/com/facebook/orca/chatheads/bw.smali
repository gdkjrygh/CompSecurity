.class abstract Lcom/facebook/orca/chatheads/bw;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic d:Lcom/facebook/orca/chatheads/al;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bw;->d:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/am;)V
    .locals 0

    .prologue
    .line 275
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/bw;-><init>(Lcom/facebook/orca/chatheads/al;)V

    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method public final run()V
    .locals 1

    .prologue
    .line 279
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bw;->d:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 284
    :goto_0
    return-void

    .line 283
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/bw;->a()V

    goto :goto_0
.end method
