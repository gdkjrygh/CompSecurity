.class public Lcom/facebook/messages/model/threads/f;
.super Ljava/lang/Object;
.source "MessageUtil.java"


# instance fields
.field private a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/messages/model/threads/f;->a:Ljavax/inject/a;

    .line 23
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 2

    .prologue
    .line 26
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    const/16 v1, 0x384

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 2

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/messages/model/threads/f;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
