.class public Lcom/facebook/orca/share/a;
.super Ljava/lang/Object;
.source "ShareRenderingLogic.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/share/Share;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->q()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->q()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/Share;

    .line 22
    :goto_0
    return-object v0

    .line 19
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->D()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 20
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->D()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/Share;

    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/messages/model/share/Share;)Lcom/facebook/messages/model/share/ShareMedia;
    .locals 4

    .prologue
    .line 26
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/Share;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/ShareMedia;

    .line 27
    const-string v2, "link"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 35
    :cond_1
    :goto_0
    return-object v0

    .line 29
    :cond_2
    const-string v2, "photo"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 31
    const-string v2, "video"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 35
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method
