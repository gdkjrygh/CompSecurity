.class public Lcom/facebook/orca/threadview/k;
.super Ljava/lang/Object;
.source "MessageDeliveredReadStateDisplayUtil.java"


# static fields
.field private static final a:Lcom/facebook/debug/log/l;

.field private static final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/threadview/k;->a:Lcom/facebook/debug/log/l;

    .line 36
    const-class v0, Lcom/facebook/orca/threadview/k;

    sput-object v0, Lcom/facebook/orca/threadview/k;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/threadview/k;->c:Ljavax/inject/a;

    .line 42
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)J
    .locals 4

    .prologue
    .line 401
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 402
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    .line 404
    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    goto :goto_0
.end method

.method private a(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Lcom/facebook/messages/model/threads/Message;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ")",
            "Lcom/facebook/orca/threadview/i;"
        }
    .end annotation

    .prologue
    .line 82
    invoke-direct/range {p0 .. p5}, Lcom/facebook/orca/threadview/k;->b(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/i;

    move-result-object v0

    .line 97
    return-object v0
.end method

.method private a(Ljava/lang/String;Lcom/facebook/orca/threadview/i;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/UserKey;Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/threadview/i;",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            "Lcom/facebook/messages/model/threads/Message;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/facebook/user/UserKey;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/16 v4, 0xa

    .line 229
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x1f4

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 230
    const-string v0, "logMessageDeliveredReadInfo\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    if-eqz p2, :cond_2

    .line 233
    const-string v0, "type: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->d()Lcom/facebook/orca/threadview/j;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 237
    const-string v0, "receiptTimestampMs: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->e()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 241
    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->c()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 242
    const-string v0, "deliveree: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->c()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 247
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->b()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 248
    const-string v0, "sender: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->b()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->a()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 254
    const-string v0, "readers:\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    invoke-virtual {p2}, Lcom/facebook/orca/threadview/i;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    .line 257
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 261
    :cond_2
    if-eqz p3, :cond_3

    .line 262
    const-string v0, "threadParticipant: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 264
    :cond_3
    if-eqz p4, :cond_4

    .line 265
    const-string v0, "message: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 266
    const-string v0, "message sender: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p4}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 267
    const-string v0, "getSentOrServerTimestamp: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0, p4}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 272
    :cond_4
    if-eqz p5, :cond_5

    .line 273
    const-string v0, "threadSummary: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 275
    :cond_5
    if-eqz p6, :cond_6

    .line 276
    const-string v0, "loggedInUserKey: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 278
    :cond_6
    if-eqz p7, :cond_7

    .line 279
    const-string v0, "readThreadParticipants:\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    invoke-interface {p7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 281
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 284
    :cond_7
    sget-object v0, Lcom/facebook/orca/threadview/k;->a:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/threadview/k;->b:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 285
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z
    .locals 1

    .prologue
    .line 332
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/k;->d(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/k;->c(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/k;->b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/orca/threads/ThreadSummary;)Z
    .locals 1

    .prologue
    .line 317
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/facebook/user/UserKey;Lcom/facebook/orca/threads/ThreadParticipant;)Z
    .locals 1

    .prologue
    .line 382
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/threads/ThreadParticipant;",
            ">;",
            "Lcom/facebook/messages/model/threads/Message;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ")",
            "Lcom/facebook/orca/threadview/i;"
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/threadview/k;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/user/UserKey;

    .line 111
    if-nez v6, :cond_1

    .line 112
    const/4 v2, 0x0

    .line 218
    :cond_0
    return-object v2

    .line 114
    :cond_1
    const/4 v2, 0x0

    .line 116
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 118
    :cond_2
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 119
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 120
    invoke-direct {p0, v6, v3}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/user/UserKey;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 121
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 125
    :cond_3
    invoke-direct {p0, p4, v3, p5}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/orca/threads/ThreadSummary;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 127
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/i;->d()Lcom/facebook/orca/threadview/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    if-eq v0, v1, :cond_4

    .line 129
    const-string v1, "isMessageSentByThreadParticipantInGroup"

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/k;->a(Ljava/lang/String;Lcom/facebook/orca/threadview/i;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/UserKey;Ljava/util/Set;)V

    .line 138
    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/i;->d()Lcom/facebook/orca/threadview/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    if-ne v0, v1, :cond_6

    :cond_5
    const/4 v0, 0x1

    :goto_1
    const-string v1, "messageDeliveredReadInfo should be null or of type READER"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 142
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 143
    invoke-interface {p2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 138
    :cond_6
    const/4 v0, 0x0

    goto :goto_1

    .line 145
    :cond_7
    invoke-direct {p0, p4, v3, p5}, Lcom/facebook/orca/threadview/k;->b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/orca/threads/ThreadSummary;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 150
    if-eqz v2, :cond_8

    .line 151
    const-string v1, "isMessageSentByThreadParticipantInCanonical"

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/k;->a(Ljava/lang/String;Lcom/facebook/orca/threadview/i;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/UserKey;Ljava/util/Set;)V

    .line 160
    :cond_8
    if-nez v2, :cond_9

    const/4 v0, 0x1

    :goto_2
    const-string v1, "messageDeliveredReadInfo should be null"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 163
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 164
    invoke-interface {p2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 165
    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threadview/i;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threadview/i;

    move-result-object v2

    goto :goto_0

    .line 160
    :cond_9
    const/4 v0, 0x0

    goto :goto_2

    .line 168
    :cond_a
    invoke-direct {p0, p4, v3}, Lcom/facebook/orca/threadview/k;->e(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 170
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/i;->d()Lcom/facebook/orca/threadview/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    if-eq v0, v1, :cond_b

    .line 172
    const-string v1, "isMessageReadByThreadParticipant"

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/threadview/k;->a(Ljava/lang/String;Lcom/facebook/orca/threadview/i;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/user/UserKey;Ljava/util/Set;)V

    .line 181
    :cond_b
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lcom/facebook/orca/threadview/i;->d()Lcom/facebook/orca/threadview/j;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    if-ne v0, v1, :cond_e

    :cond_c
    const/4 v0, 0x1

    :goto_3
    const-string v1, "messageDeliveredReadInfo should be null or of type READER"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 185
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 186
    invoke-interface {p2, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 187
    if-nez v2, :cond_d

    .line 188
    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/orca/threadview/i;->a(J)Lcom/facebook/orca/threadview/i;

    move-result-object v2

    .line 191
    :cond_d
    new-instance v0, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v3

    invoke-direct {v0, v1, v3, v4}, Lcom/facebook/orca/threadview/RowReceiptParticipant;-><init>(Lcom/facebook/messages/model/threads/ParticipantInfo;J)V

    invoke-virtual {v2, v0}, Lcom/facebook/orca/threadview/i;->a(Lcom/facebook/orca/threadview/RowReceiptParticipant;)V

    goto/16 :goto_0

    .line 181
    :cond_e
    const/4 v0, 0x0

    goto :goto_3

    .line 200
    :cond_f
    invoke-virtual {p5}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 203
    :cond_10
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 205
    invoke-direct {p0, v6, v0}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/user/UserKey;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 206
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_4

    .line 209
    :cond_11
    invoke-direct {p0, p4, v0, p5}, Lcom/facebook/orca/threadview/k;->c(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/orca/threads/ThreadSummary;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 210
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 211
    if-nez v2, :cond_10

    .line 212
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threadview/i;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threadview/i;

    move-result-object v2

    goto :goto_4
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z
    .locals 2

    .prologue
    .line 344
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 345
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

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

.method private b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/orca/threads/ThreadSummary;)Z
    .locals 1

    .prologue
    .line 325
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private c(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z
    .locals 2

    .prologue
    .line 355
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 356
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->e()Ljava/lang/String;

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

.method private c(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;Lcom/facebook/orca/threads/ThreadSummary;)Z
    .locals 2

    .prologue
    .line 367
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z
    .locals 2

    .prologue
    .line 375
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

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

.method private e(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadParticipant;)Z
    .locals 4

    .prologue
    .line 388
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v0

    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/k;->a(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "sent"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/ThreadSummary;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/threadview/i;",
            ">;"
        }
    .end annotation

    .prologue
    .line 48
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v1

    .line 50
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v2

    .line 52
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/kl;->a(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v3

    .line 55
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v6

    .line 56
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/messages/model/threads/Message;

    .line 57
    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->t()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    move-object v5, p2

    .line 60
    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/threadview/k;->a(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/i;

    move-result-object v0

    .line 67
    if-eqz v0, :cond_0

    .line 68
    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 71
    :cond_1
    return-object v6
.end method
