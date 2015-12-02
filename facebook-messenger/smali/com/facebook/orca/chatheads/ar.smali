.class Lcom/facebook/orca/chatheads/ar;
.super Lcom/facebook/orca/chatheads/bw;
.source "ChatHeadWindowManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 1

    .prologue
    .line 1028
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ar;->a:Lcom/facebook/orca/chatheads/al;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/bw;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/am;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 1031
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ar;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1032
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ar;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->f()V

    .line 1034
    :cond_0
    return-void
.end method
