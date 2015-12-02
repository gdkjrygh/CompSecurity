.class public Lcom/facebook/messages/ipc/c;
.super Ljava/lang/Object;
.source "FrozenNewMessageNotificationFactory.java"


# instance fields
.field private final a:Ljavax/inject/a;
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
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/messages/ipc/c;->a:Ljavax/inject/a;

    .line 22
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/GroupMessageInfo;)Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;
    .locals 5
    .param p1    # Lcom/facebook/messages/model/threads/GroupMessageInfo;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 48
    if-nez p1, :cond_0

    .line 49
    const/4 v0, 0x0

    .line 56
    :goto_0
    return-object v0

    .line 51
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 52
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/GroupMessageInfo;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 53
    new-instance v3, Lcom/facebook/messages/ipc/FrozenParticipant;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lcom/facebook/messages/ipc/FrozenParticipant;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 56
    :cond_1
    new-instance v0, Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/GroupMessageInfo;->a()I

    move-result v2

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/GroupMessageInfo;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/GroupMessageInfo;->d()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;-><init>(ILcom/google/common/a/es;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;Landroid/app/PendingIntent;)Lcom/facebook/messages/ipc/FrozenNewMessageNotification;
    .locals 15

    .prologue
    .line 26
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v4

    .line 27
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v3

    .line 30
    :goto_0
    new-instance v0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/messages/ipc/c;->a:Ljavax/inject/a;

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->z()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/c;->name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->H()Lcom/facebook/messages/model/threads/GroupMessageInfo;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/facebook/messages/ipc/c;->a(Lcom/facebook/messages/model/threads/GroupMessageInfo;)Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    move-result-object v14

    move-object/from16 v7, p2

    invoke-direct/range {v0 .. v14}, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/messages/ipc/FrozenGroupMessageInfo;)V

    return-object v0

    .line 27
    :cond_0
    const/4 v3, 0x0

    goto :goto_0

    .line 30
    :cond_1
    const/4 v4, 0x0

    goto :goto_1
.end method
