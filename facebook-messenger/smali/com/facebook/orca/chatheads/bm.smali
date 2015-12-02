.class Lcom/facebook/orca/chatheads/bm;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/m;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 610
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bm;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 613
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bm;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->p(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/i/a/a/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 615
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    .line 619
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bm;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->p(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/i/a/a/f;

    move-result-object v0

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->i:Landroid/net/Uri;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 621
    return-void
.end method
