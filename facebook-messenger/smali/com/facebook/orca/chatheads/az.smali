.class Lcom/facebook/orca/chatheads/az;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 1784
    iput-object p1, p0, Lcom/facebook/orca/chatheads/az;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 1787
    iget-object v0, p0, Lcom/facebook/orca/chatheads/az;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->l(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1793
    :goto_0
    return-void

    .line 1791
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/az;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ak;->a(I)Lcom/facebook/orca/chatheads/ag;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->getThreadViewSpec()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 1792
    iget-object v1, p0, Lcom/facebook/orca/chatheads/az;->a:Lcom/facebook/orca/chatheads/al;

    const-string v2, "bubble_click"

    invoke-static {v1, v0, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)Lcom/google/common/d/a/s;

    goto :goto_0
.end method
