.class Lcom/facebook/orca/chatheads/bg;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/dt;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 2930
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bg;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 2

    .prologue
    .line 2943
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bg;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->h()Lcom/facebook/messages/threads/model/b;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/b;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 2944
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 2938
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bg;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 2939
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 2933
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bg;->a:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Ljava/lang/String;)V

    .line 2934
    return-void
.end method
