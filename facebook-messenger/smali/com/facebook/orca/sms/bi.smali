.class public Lcom/facebook/orca/sms/bi;
.super Ljava/lang/Object;
.source "MmsSmsSendMessageHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/protocol/methods/ad;

.field private final c:Lcom/facebook/orca/threads/q;

.field private final d:Lcom/facebook/orca/sms/y;

.field private final e:Lcom/facebook/orca/sms/u;

.field private final f:Lcom/facebook/orca/sms/br;

.field private final g:Lcom/facebook/orca/sms/bk;

.field private final h:Lcom/facebook/orca/sms/af;

.field private final i:Lcom/facebook/orca/f/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 36
    const-class v0, Lcom/facebook/orca/sms/bi;

    sput-object v0, Lcom/facebook/orca/sms/bi;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/protocol/methods/ad;Lcom/facebook/orca/threads/q;Lcom/facebook/orca/sms/y;Lcom/facebook/orca/sms/u;Lcom/facebook/orca/sms/br;Lcom/facebook/orca/sms/bk;Lcom/facebook/orca/sms/af;Lcom/facebook/orca/f/o;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/facebook/orca/sms/bi;->b:Lcom/facebook/orca/protocol/methods/ad;

    .line 59
    iput-object p2, p0, Lcom/facebook/orca/sms/bi;->c:Lcom/facebook/orca/threads/q;

    .line 60
    iput-object p3, p0, Lcom/facebook/orca/sms/bi;->d:Lcom/facebook/orca/sms/y;

    .line 61
    iput-object p4, p0, Lcom/facebook/orca/sms/bi;->e:Lcom/facebook/orca/sms/u;

    .line 62
    iput-object p5, p0, Lcom/facebook/orca/sms/bi;->f:Lcom/facebook/orca/sms/br;

    .line 63
    iput-object p6, p0, Lcom/facebook/orca/sms/bi;->g:Lcom/facebook/orca/sms/bk;

    .line 64
    iput-object p7, p0, Lcom/facebook/orca/sms/bi;->h:Lcom/facebook/orca/sms/af;

    .line 65
    iput-object p8, p0, Lcom/facebook/orca/sms/bi;->i:Lcom/facebook/orca/f/o;

    .line 66
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Ljava/util/Set;)Lcom/facebook/messages/model/threads/Message;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/messages/model/threads/Message;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    if-gt v0, v7, :cond_0

    .line 163
    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    if-ne v0, v7, :cond_8

    .line 164
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 165
    iget-object v1, p0, Lcom/facebook/orca/sms/bi;->f:Lcom/facebook/orca/sms/br;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/orca/sms/br;->a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 174
    :goto_0
    return-object v0

    .line 133
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/sms/bi;->d:Lcom/facebook/orca/sms/y;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/y;->b()Ljava/util/Set;

    move-result-object v0

    .line 134
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 135
    invoke-static {v2, v3}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v0

    .line 136
    iget-object v2, p0, Lcom/facebook/orca/sms/bi;->i:Lcom/facebook/orca/f/o;

    const-wide/16 v3, -0x1

    invoke-virtual {v2, v0, v3, v4}, Lcom/facebook/orca/f/o;->a(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 142
    :catchall_0
    move-exception v0

    move-object v9, v0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v4

    .line 144
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->I()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 145
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v0

    const-string v1, "trigger"

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v6, v0

    .line 147
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/sms/bi;->h:Lcom/facebook/orca/sms/af;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v4}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/ui/media/attachments/g;->name()Ljava/lang/String;

    move-result-object v4

    if-eqz v5, :cond_5

    move v5, v7

    :goto_3
    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;IILjava/lang/String;ZLjava/lang/String;)V

    .line 162
    :goto_4
    throw v9

    .line 140
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/sms/bi;->e:Lcom/facebook/orca/sms/u;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/sms/u;->a(Lcom/facebook/messages/model/threads/Message;Ljava/util/Set;)Lcom/facebook/messages/model/threads/Message;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v9

    .line 142
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v4

    .line 144
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->I()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 145
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v0

    const-string v1, "trigger"

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v6, v0

    .line 147
    :goto_5
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 148
    iget-object v0, p0, Lcom/facebook/orca/sms/bi;->h:Lcom/facebook/orca/sms/af;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v4}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/ui/media/attachments/g;->name()Ljava/lang/String;

    move-result-object v4

    if-eqz v9, :cond_2

    move v5, v7

    :goto_6
    invoke-virtual/range {v0 .. v6}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;IILjava/lang/String;ZLjava/lang/String;)V

    :goto_7
    move-object v0, v9

    .line 162
    goto/16 :goto_0

    :cond_2
    move v5, v8

    .line 148
    goto :goto_6

    .line 156
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/sms/bi;->h:Lcom/facebook/orca/sms/af;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v2

    if-eqz v9, :cond_4

    :goto_8
    invoke-virtual {v0, v1, v2, v7, v6}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;IZLjava/lang/String;)V

    goto :goto_7

    :cond_4
    move v7, v8

    goto :goto_8

    :cond_5
    move v5, v8

    .line 148
    goto :goto_3

    .line 156
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/sms/bi;->h:Lcom/facebook/orca/sms/af;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v2

    if-eqz v5, :cond_7

    :goto_9
    invoke-virtual {v0, v1, v2, v7, v6}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;IZLjava/lang/String;)V

    goto :goto_4

    :cond_7
    move v7, v8

    goto :goto_9

    .line 167
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    const-string v1, "Trying to send an Sms or Mms to an invalid set of participants: <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    const-string v1, " "

    invoke-static {v1}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    new-instance v1, Landroid_src/mms/d;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid_src/mms/d;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    move-object v6, v5

    goto/16 :goto_2

    :cond_a
    move-object v6, v5

    goto :goto_5
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/SendMessageByRecipientsParams;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 8

    .prologue
    .line 70
    invoke-virtual {p1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 71
    invoke-virtual {p1}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 72
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 73
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/RecipientInfo;

    .line 74
    iget-object v4, p0, Lcom/facebook/orca/sms/bi;->b:Lcom/facebook/orca/protocol/methods/ad;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/protocol/methods/ad;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/facebook/user/UserPhoneNumber;->b()Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 79
    :cond_0
    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/sms/bi;->a(Lcom/facebook/messages/model/threads/Message;Ljava/util/Set;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v0

    .line 81
    iget-object v3, p0, Lcom/facebook/orca/sms/bi;->d:Lcom/facebook/orca/sms/y;

    invoke-virtual {v3, v0, v1}, Lcom/facebook/orca/sms/y;->a(J)Lcom/facebook/orca/sms/e;

    move-result-object v4

    .line 84
    const/4 v3, 0x3

    const-wide/16 v5, -0x1

    invoke-static {v0, v1, v3, v5, v6}, Lcom/facebook/orca/sms/b;->a(JIJ)Lcom/facebook/orca/sms/b;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/facebook/orca/sms/bi;->d:Lcom/facebook/orca/sms/y;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/y;->a(Lcom/facebook/orca/sms/b;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v3

    .line 92
    const/4 v5, 0x0

    .line 93
    invoke-interface {v2}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 94
    iget-object v1, p0, Lcom/facebook/orca/sms/bi;->g:Lcom/facebook/orca/sms/bk;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v5

    .line 96
    :cond_1
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v4}, Lcom/facebook/orca/sms/e;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-virtual {v4}, Lcom/facebook/orca/sms/e;->b()Lcom/google/common/a/es;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    return-object v0
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/server/NewMessageResult;
    .locals 7

    .prologue
    .line 107
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v0

    .line 108
    iget-object v2, p0, Lcom/facebook/orca/sms/bi;->d:Lcom/facebook/orca/sms/y;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/sms/y;->a(J)Lcom/facebook/orca/sms/e;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/facebook/orca/sms/bi;->c:Lcom/facebook/orca/threads/q;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/e;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/q;->c(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/util/List;

    move-result-object v0

    .line 112
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v1

    .line 113
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 114
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 116
    :cond_0
    invoke-direct {p0, p1, v1}, Lcom/facebook/orca/sms/bi;->a(Lcom/facebook/messages/model/threads/Message;Ljava/util/Set;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 117
    new-instance v0, Lcom/facebook/orca/server/NewMessageResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/NewMessageResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;J)V

    return-object v0
.end method
