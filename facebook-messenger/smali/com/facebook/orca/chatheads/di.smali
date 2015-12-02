.class Lcom/facebook/orca/chatheads/di;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Lcom/facebook/common/hardware/t;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/facebook/orca/chatheads/di;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/facebook/orca/chatheads/di;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->a(Lcom/facebook/orca/chatheads/dh;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/facebook/orca/chatheads/di;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->b(Lcom/facebook/orca/chatheads/dh;)V

    .line 208
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 210
    return-void
.end method
