.class Lcom/facebook/orca/chatheads/av;
.super Lcom/facebook/orca/chatheads/bw;
.source "ChatHeadWindowManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 1

    .prologue
    .line 1229
    iput-object p1, p0, Lcom/facebook/orca/chatheads/av;->a:Lcom/facebook/orca/chatheads/al;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/bw;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/am;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 1232
    iget-object v0, p0, Lcom/facebook/orca/chatheads/av;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/av;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->l(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1236
    :cond_0
    :goto_0
    return-void

    .line 1235
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/av;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->m(Lcom/facebook/orca/chatheads/al;)V

    goto :goto_0
.end method
