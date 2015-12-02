.class Lcom/facebook/orca/chatheads/ds;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Lcom/facebook/orca/compose/am;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 888
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ds;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 3

    .prologue
    .line 891
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 894
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ds;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->j(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/b/a/b;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v1

    const-string v2, "launch_media_picker"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/b/a/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 897
    :cond_0
    return-void
.end method
