.class Lcom/facebook/orca/chatheads/ax;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 345
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ax;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ax;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ax;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->l(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 352
    :cond_0
    :goto_0
    return-void

    .line 351
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ax;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->m(Lcom/facebook/orca/chatheads/al;)V

    goto :goto_0
.end method
