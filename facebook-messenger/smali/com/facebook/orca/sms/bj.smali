.class public Lcom/facebook/orca/sms/bj;
.super Lcom/facebook/orca/server/a;
.source "MmsSmsServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


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
.field private final b:Lcom/facebook/orca/sms/aa;

.field private final c:Lcom/facebook/orca/sms/z;

.field private final d:Lcom/facebook/orca/sms/bi;

.field private final e:Lcom/facebook/orca/sms/y;

.field private final f:Lcom/facebook/prefs/shared/d;

.field private final g:Lcom/facebook/orca/sms/af;

.field private final h:Lcom/facebook/common/e/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 48
    const-class v0, Lcom/facebook/orca/sms/bj;

    sput-object v0, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/sms/aa;Lcom/facebook/orca/sms/z;Lcom/facebook/orca/sms/bi;Lcom/facebook/orca/sms/y;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/sms/af;Lcom/facebook/common/e/h;)V
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/server/a;-><init>(Ljava/lang/String;)V

    .line 67
    iput-object p1, p0, Lcom/facebook/orca/sms/bj;->b:Lcom/facebook/orca/sms/aa;

    .line 68
    iput-object p2, p0, Lcom/facebook/orca/sms/bj;->c:Lcom/facebook/orca/sms/z;

    .line 69
    iput-object p3, p0, Lcom/facebook/orca/sms/bj;->d:Lcom/facebook/orca/sms/bi;

    .line 70
    iput-object p4, p0, Lcom/facebook/orca/sms/bj;->e:Lcom/facebook/orca/sms/y;

    .line 71
    iput-object p5, p0, Lcom/facebook/orca/sms/bj;->f:Lcom/facebook/prefs/shared/d;

    .line 72
    iput-object p6, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    .line 73
    iput-object p7, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    .line 74
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 7

    .prologue
    const-wide/16 v5, 0xa

    .line 78
    sget-object v0, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 80
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 81
    sget-object v2, Lcom/facebook/orca/server/aq;->w:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 82
    invoke-virtual {p0, p1}, Lcom/facebook/orca/sms/bj;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 87
    invoke-virtual {v1, v5, v6}, Lcom/facebook/debug/d/e;->a(J)J

    return-object v0

    .line 84
    :cond_0
    :try_start_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown operation type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    :catchall_0
    move-exception v0

    invoke-virtual {v1, v5, v6}, Lcom/facebook/debug/d/e;->a(J)J

    throw v0
.end method

.method protected b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 279
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 280
    const-string v1, "outgoingMessage"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 282
    iget-object v1, p0, Lcom/facebook/orca/sms/bj;->d:Lcom/facebook/orca/sms/bi;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/bi;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/server/NewMessageResult;

    move-result-object v0

    .line 284
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 95
    const-string v0, "MmsSmsServiceHandler.handleFetchThreadList"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 97
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 98
    const-string v2, "fetchThreadListParams"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 99
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->b:Lcom/facebook/orca/sms/aa;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/aa;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    .line 101
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 106
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "failed to fetch MmsSms ThreadList"

    invoke-interface {v2, v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method

.method protected c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 114
    const-string v0, "MmsSmsServiceHandler.handleFetchMoreThreads"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 116
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 117
    const-string v2, "fetchMoreThreadsParams"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    .line 119
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->b:Lcom/facebook/orca/sms/aa;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/aa;->a(Lcom/facebook/orca/server/FetchMoreThreadsParams;)Lcom/facebook/orca/server/FetchMoreThreadsResult;

    move-result-object v0

    .line 121
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 126
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    .line 122
    :catch_0
    move-exception v0

    .line 123
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "failed to fetch more MmsSms Threads"

    invoke-interface {v2, v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method

.method protected d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 134
    const-string v0, "MmsSmsServiceHandler.handleFetchThread"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 136
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 137
    const-string v2, "fetchThreadParams"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 138
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->c:Lcom/facebook/orca/sms/z;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/z;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 140
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 145
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    .line 141
    :catch_0
    move-exception v0

    .line 142
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "failed to fetch MmsSms Thread"

    invoke-interface {v2, v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 143
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method

.method protected e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 261
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 262
    const-string v1, "createThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    .line 264
    const/4 v2, 0x0

    .line 266
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/sms/bj;->d:Lcom/facebook/orca/sms/bi;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/bi;->a(Lcom/facebook/orca/server/SendMessageByRecipientsParams;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v1

    .line 268
    const/4 v2, 0x1

    .line 269
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 274
    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    invoke-virtual {v0}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    invoke-virtual {v3, v0, v2}, Lcom/facebook/orca/sms/af;->a(IZ)V

    return-object v1

    .line 270
    :catch_0
    move-exception v1

    .line 271
    :try_start_1
    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "failed to create MmsSms Thread"

    invoke-interface {v3, v4, v5, v1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 272
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    :catchall_0
    move-exception v1

    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    invoke-virtual {v0}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    invoke-virtual {v3, v0, v2}, Lcom/facebook/orca/sms/af;->a(IZ)V

    throw v1
.end method

.method protected j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 200
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 201
    const-string v1, "markThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/MarkThreadParams;

    .line 202
    invoke-virtual {v0}, Lcom/facebook/orca/server/MarkThreadParams;->a()Ljava/lang/String;

    move-result-object v1

    .line 203
    invoke-virtual {v0}, Lcom/facebook/orca/server/MarkThreadParams;->b()Lcom/facebook/orca/server/ai;

    move-result-object v2

    .line 204
    sget-object v3, Lcom/facebook/orca/server/ai;->READ:Lcom/facebook/orca/server/ai;

    if-ne v2, v3, :cond_0

    invoke-virtual {v0}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    invoke-static {v1}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v0

    .line 206
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->e:Lcom/facebook/orca/sms/y;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/sms/y;->c(J)V

    .line 208
    :cond_0
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 215
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 216
    const-string v1, "deleteThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteThreadParams;

    .line 217
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteThreadParams;->a()Ljava/lang/String;

    move-result-object v2

    .line 218
    invoke-static {v2}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v3

    .line 220
    const/4 v1, 0x0

    .line 222
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/sms/bj;->e:Lcom/facebook/orca/sms/y;

    invoke-virtual {v0, v3, v4}, Lcom/facebook/orca/sms/y;->d(J)V

    .line 223
    const/4 v1, 0x1

    .line 224
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 229
    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    invoke-virtual {v3, v2, v1}, Lcom/facebook/orca/sms/af;->b(Ljava/lang/String;Z)V

    return-object v0

    .line 225
    :catch_0
    move-exception v0

    .line 226
    :try_start_1
    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v4, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "failed to delete MmsSms thread"

    invoke-interface {v3, v4, v5, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 229
    :catchall_0
    move-exception v0

    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    invoke-virtual {v3, v2, v1}, Lcom/facebook/orca/sms/af;->b(Ljava/lang/String;Z)V

    throw v0
.end method

.method protected n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 237
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 238
    const-string v1, "deleteMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteMessagesParams;

    .line 240
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteMessagesParams;->b()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 243
    :try_start_0
    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->e:Lcom/facebook/orca/sms/y;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/sms/y;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 244
    const/4 v3, 0x1

    .line 249
    iget-object v5, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    invoke-virtual {v5, v0, v3}, Lcom/facebook/orca/sms/af;->c(Ljava/lang/String;Z)V

    move v0, v1

    :goto_1
    move v1, v0

    .line 251
    goto :goto_0

    .line 245
    :catch_0
    move-exception v3

    .line 246
    :try_start_1
    iget-object v5, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v6, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "failed to delete MmsSms messages"

    invoke-interface {v5, v6, v7, v3}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 247
    add-int/lit8 v1, v1, 0x1

    .line 249
    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    invoke-virtual {v3, v0, v2}, Lcom/facebook/orca/sms/af;->c(Ljava/lang/String;Z)V

    move v0, v1

    .line 250
    goto :goto_1

    .line 249
    :catchall_0
    move-exception v1

    iget-object v3, p0, Lcom/facebook/orca/sms/bj;->g:Lcom/facebook/orca/sms/af;

    invoke-virtual {v3, v0, v2}, Lcom/facebook/orca/sms/af;->c(Ljava/lang/String;Z)V

    throw v1

    .line 252
    :cond_0
    if-lez v1, :cond_1

    .line 253
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Some Mms or Sms message deletes failed"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 255
    :cond_1
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 302
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 303
    const-string v1, "modifyThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ModifyThreadParams;

    .line 305
    new-instance v1, Lcom/facebook/orca/server/ac;

    invoke-direct {v1}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lcom/facebook/orca/sms/bj;->c:Lcom/facebook/orca/sms/z;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/z;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 312
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected q(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 291
    iget-object v0, p0, Lcom/facebook/orca/sms/bj;->f:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 292
    sget-object v1, Lcom/facebook/orca/prefs/n;->e:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 293
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 294
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected t(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 180
    const-string v0, "MmsSmsServiceHandler.handleFetchMoreMessages"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 182
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 183
    const-string v2, "fetchMoreMessagesParams"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    .line 185
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->c:Lcom/facebook/orca/sms/z;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/z;->a(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    .line 187
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 192
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    return-object v0

    .line 188
    :catch_0
    move-exception v0

    .line 189
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "failed to fetch more MmsSms messages"

    invoke-interface {v2, v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 190
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0
.end method

.method protected u(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 153
    const-string v0, "MmsSmsServiceHandler.handleFetchMultipleThreads"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 155
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 156
    const-string v2, "fetchMultipleThreadsParams"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    .line 158
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 160
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 162
    iget-object v4, p0, Lcom/facebook/orca/sms/bj;->c:Lcom/facebook/orca/sms/z;

    invoke-virtual {v4, v0}, Lcom/facebook/orca/sms/z;->a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v0

    .line 164
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 168
    :catch_0
    move-exception v0

    .line 169
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/sms/bj;->h:Lcom/facebook/common/e/h;

    sget-object v3, Lcom/facebook/orca/sms/bj;->a:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "failed to fetch multiple MmsSms Threads"

    invoke-interface {v2, v3, v4, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 170
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    throw v0

    .line 166
    :cond_0
    :try_start_2
    new-instance v0, Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/orca/server/FetchMultipleThreadsResult;-><init>(Lcom/google/common/a/es;)V

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    .line 172
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    return-object v0
.end method
