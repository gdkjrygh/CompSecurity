.class Lcom/facebook/orca/chatheads/b/g;
.super Ljava/lang/Object;
.source "ChatHeadNuxBubbleWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/b/f;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/b/f;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/g;->a:Lcom/facebook/orca/chatheads/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/g;->a:Lcom/facebook/orca/chatheads/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/f;->b()V

    .line 50
    return-void
.end method
