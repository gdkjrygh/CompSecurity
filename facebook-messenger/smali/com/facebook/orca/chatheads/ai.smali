.class Lcom/facebook/orca/chatheads/ai;
.super Lcom/facebook/orca/threadview/cb;
.source "ChatHeadView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ag;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ag;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ai;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-direct {p0, p2}, Lcom/facebook/orca/threadview/cb;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ai;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->l()V

    .line 104
    return-void
.end method

.method public a(Lcom/facebook/push/mqtt/cj;)V
    .locals 1

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ai;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->l()V

    .line 99
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ai;->a:Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->l()V

    .line 113
    return-void
.end method

.method public d()V
    .locals 0

    .prologue
    .line 108
    return-void
.end method
