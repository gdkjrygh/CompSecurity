.class public Lcom/facebook/orca/threadview/ai;
.super Lcom/facebook/orca/threadview/ac;
.source "RowTypingItem.java"


# instance fields
.field private final a:Lcom/facebook/messages/model/threads/ParticipantInfo;


# direct methods
.method public constructor <init>(Lcom/facebook/messages/model/threads/ParticipantInfo;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/facebook/orca/threadview/ac;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/orca/threadview/ai;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 18
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x5

    return v0
.end method

.method public b()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/facebook/orca/threadview/ai;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 36
    instance-of v0, p1, Lcom/facebook/orca/threadview/ai;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/ai;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    check-cast p1, Lcom/facebook/orca/threadview/ai;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ai;->b()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 31
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/ai;->a()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RowTypingItem{otherUser="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/ai;->a:Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
