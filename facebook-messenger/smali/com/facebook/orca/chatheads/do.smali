.class Lcom/facebook/orca/chatheads/do;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 654
    iput-object p1, p0, Lcom/facebook/orca/chatheads/do;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 657
    iget-object v0, p0, Lcom/facebook/orca/chatheads/do;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->d(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/chatheads/ek;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 658
    iget-object v0, p0, Lcom/facebook/orca/chatheads/do;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->d(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/chatheads/ek;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ek;->b()V

    .line 659
    iget-object v0, p0, Lcom/facebook/orca/chatheads/do;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->d(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/orca/chatheads/ek;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ek;->c()V

    .line 661
    :cond_0
    return-void
.end method
