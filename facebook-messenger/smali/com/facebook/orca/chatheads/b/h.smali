.class Lcom/facebook/orca/chatheads/b/h;
.super Ljava/lang/Object;
.source "ChatHeadNuxBubbleWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/b/j;

.field final synthetic b:Lcom/facebook/orca/chatheads/b/f;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/b/f;Lcom/facebook/orca/chatheads/b/j;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/h;->b:Lcom/facebook/orca/chatheads/b/f;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/b/h;->a:Lcom/facebook/orca/chatheads/b/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/h;->b:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->c()V

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/h;->a:Lcom/facebook/orca/chatheads/b/j;

    if-eqz v0, :cond_0

    .line 65
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/h;->a:Lcom/facebook/orca/chatheads/b/j;

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/b/j;->a()V

    .line 67
    :cond_0
    return-void
.end method
