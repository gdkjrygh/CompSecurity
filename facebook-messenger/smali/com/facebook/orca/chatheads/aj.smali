.class Lcom/facebook/orca/chatheads/aj;
.super Ljava/lang/Object;
.source "ChatHeadView.java"

# interfaces
.implements Lcom/facebook/orca/threadview/cl;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ag;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ag;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lcom/facebook/orca/chatheads/aj;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aj;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-static {v0, p1}, Lcom/facebook/orca/chatheads/ag;->a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 215
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/cn;)V
    .locals 0

    .prologue
    .line 206
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cm;)V
    .locals 0

    .prologue
    .line 228
    return-void
.end method

.method public a(Lcom/facebook/orca/threadview/cn;Lcom/facebook/orca/threadview/cp;)V
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aj;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-static {v0, p2}, Lcom/facebook/orca/chatheads/ag;->a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/orca/threadview/cp;)V

    .line 211
    return-void
.end method

.method public a(Lcom/facebook/user/User;)V
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Lcom/facebook/orca/chatheads/aj;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-static {v0, p1}, Lcom/facebook/orca/chatheads/ag;->a(Lcom/facebook/orca/chatheads/ag;Lcom/facebook/user/User;)V

    .line 220
    return-void
.end method

.method public b(Lcom/facebook/orca/threadview/cn;)V
    .locals 0

    .prologue
    .line 224
    return-void
.end method
