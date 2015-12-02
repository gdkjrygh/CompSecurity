.class Lcom/facebook/orca/chatheads/bb;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ba;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ba;)V
    .locals 0

    .prologue
    .line 2419
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bb;->a:Lcom/facebook/orca/chatheads/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 2422
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bb;->a:Lcom/facebook/orca/chatheads/ba;

    iget-object v0, v0, Lcom/facebook/orca/chatheads/ba;->b:Lcom/facebook/orca/chatheads/al;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/bb;->a:Lcom/facebook/orca/chatheads/ba;

    iget-object v1, v1, Lcom/facebook/orca/chatheads/ba;->a:Lcom/facebook/orca/chatheads/ag;

    const-string v2, "fling_to_close"

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;Ljava/lang/String;)V

    .line 2423
    return-void
.end method
