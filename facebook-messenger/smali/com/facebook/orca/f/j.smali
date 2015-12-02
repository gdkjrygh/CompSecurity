.class public Lcom/facebook/orca/f/j;
.super Lcom/facebook/orca/server/a;
.source "CacheServiceHandler.java"


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
.field private final b:Lcom/facebook/orca/f/ad;

.field private final c:Lcom/facebook/orca/f/z;

.field private final d:Lcom/facebook/orca/app/g;

.field private final e:Lcom/facebook/orca/f/g;

.field private final f:Lcom/facebook/orca/f/i;

.field private final g:Lcom/facebook/orca/threads/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const-class v0, Lcom/facebook/orca/f/j;

    sput-object v0, Lcom/facebook/orca/f/j;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/z;Lcom/facebook/orca/app/g;Lcom/facebook/orca/f/g;Lcom/facebook/orca/f/i;Lcom/facebook/orca/threads/g;)V
    .locals 1

    .prologue
    .line 58
    const-string v0, "CacheServiceHandler"

    invoke-direct {p0, v0}, Lcom/facebook/orca/server/a;-><init>(Ljava/lang/String;)V

    .line 59
    iput-object p1, p0, Lcom/facebook/orca/f/j;->b:Lcom/facebook/orca/f/ad;

    .line 60
    iput-object p2, p0, Lcom/facebook/orca/f/j;->c:Lcom/facebook/orca/f/z;

    .line 61
    iput-object p3, p0, Lcom/facebook/orca/f/j;->d:Lcom/facebook/orca/app/g;

    .line 62
    iput-object p4, p0, Lcom/facebook/orca/f/j;->e:Lcom/facebook/orca/f/g;

    .line 63
    iput-object p5, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    .line 64
    iput-object p6, p0, Lcom/facebook/orca/f/j;->g:Lcom/facebook/orca/threads/g;

    .line 65
    return-void
.end method


# virtual methods
.method protected b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 72
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    .line 73
    const-string v0, "fetchThreadListParams"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 74
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    .line 76
    sget-object v1, Lcom/facebook/orca/f/j;->a:Ljava/lang/Class;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "handleFetchThreadList with freshness="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/fbservice/service/s;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 78
    iget-object v1, p0, Lcom/facebook/orca/f/j;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/server/FetchThreadListParams;)Lcom/facebook/orca/server/FetchThreadListParams;

    move-result-object v1

    .line 80
    if-eq v0, v1, :cond_0

    .line 84
    const-string v0, "fetchThreadListParams"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 85
    sget-object v0, Lcom/facebook/orca/f/j;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleFetchThreadList upgraded to "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    move-object v0, v1

    .line 87
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/facebook/orca/f/j;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v1, v3, v0}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/fbservice/service/s;)Z

    move-result v0

    .line 92
    sget-object v1, Lcom/facebook/orca/f/j;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleFetchThreadList canServeFromCache="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 95
    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/f/j;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadListResult;

    move-result-object v0

    .line 98
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 105
    :goto_0
    return-object v0

    .line 100
    :cond_1
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 101
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 102
    iget-object v2, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadListResult;)V

    move-object v0, v1

    goto :goto_0
.end method

.method protected c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 113
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 114
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    .line 115
    iget-object v2, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchMoreThreadsResult;)V

    .line 116
    return-object v1
.end method

.method protected d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 124
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 125
    const-string v1, "fetchThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 126
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    .line 127
    iget-object v2, p0, Lcom/facebook/orca/f/j;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    .line 129
    iget-object v2, p0, Lcom/facebook/orca/f/j;->e:Lcom/facebook/orca/f/g;

    invoke-virtual {v2, p1, v1}, Lcom/facebook/orca/f/g;->a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/server/FetchThreadResult;

    move-result-object v1

    .line 132
    if-eqz v1, :cond_0

    .line 133
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 141
    :goto_0
    return-object v0

    .line 135
    :cond_0
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 136
    invoke-virtual {v2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchThreadResult;

    .line 137
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchThreadResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v3

    sget-object v4, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    if-eq v3, v4, :cond_1

    .line 138
    iget-object v3, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v0, v1}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;)V

    :cond_1
    move-object v0, v2

    goto :goto_0
.end method

.method protected e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 149
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 150
    const-string v1, "createThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    .line 151
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 152
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 153
    iget-object v2, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 154
    return-object v1
.end method

.method protected f(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 162
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 163
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendBroadcastResult;

    .line 164
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendBroadcastResult;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 165
    iget-object v3, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/server/FetchThreadResult;)V

    goto :goto_0

    .line 167
    :cond_0
    return-object v1
.end method

.method protected g(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 175
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 176
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 177
    const-string v2, "outgoingMessage"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 178
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    .line 179
    iget-object v3, p0, Lcom/facebook/orca/f/j;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v2

    .line 180
    iget-object v3, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v2, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;)V

    .line 181
    return-object v1
.end method

.method protected h(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 189
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 190
    const-string v1, "addMembersParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/AddMembersParams;

    .line 191
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 192
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 193
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 194
    if-eqz v2, :cond_0

    .line 195
    iget-object v3, p0, Lcom/facebook/orca/f/j;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v4

    invoke-virtual {v3, v2, v4, v5}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 196
    iget-object v2, p0, Lcom/facebook/orca/f/j;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/ad;->a(Ljava/util/Collection;)V

    .line 197
    iget-object v0, p0, Lcom/facebook/orca/f/j;->c:Lcom/facebook/orca/f/z;

    invoke-virtual {v0}, Lcom/facebook/orca/f/z;->a()V

    .line 199
    :cond_0
    return-object v1
.end method

.method protected i(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 207
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 208
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 209
    iget-object v2, p0, Lcom/facebook/orca/f/j;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 212
    iget-object v2, p0, Lcom/facebook/orca/f/j;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/ad;->a(Ljava/util/Collection;)V

    .line 213
    iget-object v0, p0, Lcom/facebook/orca/f/j;->c:Lcom/facebook/orca/f/z;

    invoke-virtual {v0}, Lcom/facebook/orca/f/z;->a()V

    .line 214
    return-object v1
.end method

.method protected j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 222
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 223
    const-string v1, "markThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/MarkThreadParams;

    .line 229
    invoke-virtual {v0}, Lcom/facebook/orca/server/MarkThreadParams;->a()Ljava/lang/String;

    move-result-object v1

    .line 230
    invoke-virtual {v0}, Lcom/facebook/orca/server/MarkThreadParams;->b()Lcom/facebook/orca/server/ai;

    move-result-object v2

    .line 231
    iget-object v3, p0, Lcom/facebook/orca/f/j;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    .line 232
    iget-object v4, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v4, v3, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/MarkThreadParams;)V

    .line 235
    sget-object v3, Lcom/facebook/orca/server/ai;->ARCHIVED:Lcom/facebook/orca/server/ai;

    if-eq v2, v3, :cond_0

    sget-object v3, Lcom/facebook/orca/server/ai;->SPAM:Lcom/facebook/orca/server/ai;

    if-ne v2, v3, :cond_1

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    iget-object v0, p0, Lcom/facebook/orca/f/j;->d:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/app/g;->c(Ljava/lang/String;)V

    .line 239
    :cond_1
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected k(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 247
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 249
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ReceiptResult;

    .line 250
    invoke-virtual {v0}, Lcom/facebook/orca/server/ReceiptResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 251
    if-eqz v2, :cond_0

    .line 252
    iget-object v3, p0, Lcom/facebook/orca/f/j;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ReceiptResult;->f()J

    move-result-wide v4

    invoke-virtual {v3, v2, v4, v5}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 254
    iget-object v0, p0, Lcom/facebook/orca/f/j;->d:Lcom/facebook/orca/app/g;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 256
    :cond_0
    return-object v1
.end method

.method protected l(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 264
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 266
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ReceiptResult;

    .line 267
    invoke-virtual {v0}, Lcom/facebook/orca/server/ReceiptResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 268
    if-eqz v2, :cond_0

    .line 269
    iget-object v3, p0, Lcom/facebook/orca/f/j;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/server/ReceiptResult;->f()J

    move-result-wide v4

    invoke-virtual {v3, v2, v4, v5}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 271
    iget-object v0, p0, Lcom/facebook/orca/f/j;->d:Lcom/facebook/orca/app/g;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    .line 273
    :cond_0
    return-object v1
.end method

.method protected m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 281
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 282
    const-string v1, "deleteThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteThreadParams;

    .line 283
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 284
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 285
    iget-object v2, p0, Lcom/facebook/orca/f/j;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v2

    .line 286
    iget-object v3, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v2, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V

    .line 287
    return-object v1
.end method

.method protected n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 295
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 296
    const-string v1, "deleteMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteMessagesParams;

    .line 297
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 298
    invoke-virtual {v2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/DeleteMessagesResult;

    .line 299
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteMessagesParams;->a()Ljava/lang/String;

    move-result-object v3

    .line 300
    iget-object v4, p0, Lcom/facebook/orca/f/j;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v4, v3}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    .line 301
    iget-object v4, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v4, v3, v0, v1}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/DeleteMessagesParams;Lcom/facebook/orca/server/DeleteMessagesResult;)V

    .line 305
    return-object v2
.end method

.method protected o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 313
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 314
    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 315
    iget-object v2, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/i;->b(Lcom/facebook/orca/server/FetchThreadResult;)V

    .line 316
    return-object v1
.end method

.method protected p(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 324
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 325
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 326
    const-string v2, "threadId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 327
    const-string v3, "draft"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/MessageDraft;

    .line 328
    iget-object v3, p0, Lcom/facebook/orca/f/j;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v3

    .line 329
    iget-object v4, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v4, v3, v2, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V

    .line 330
    return-object v1
.end method

.method protected q(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 338
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 339
    const-string v1, "folderName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 340
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 341
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 342
    iget-object v4, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v4, v0, v2, v3}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;J)V

    .line 343
    return-object v1
.end method

.method protected r(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 6

    .prologue
    .line 353
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 354
    const-string v1, "threadId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    invoke-interface {p2, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 359
    invoke-virtual {v2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/NewMessageResult;

    .line 361
    if-eqz v0, :cond_2

    .line 362
    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 363
    sget-object v1, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    .line 364
    sget-object v4, Lcom/facebook/messages/model/threads/c;->SMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/facebook/messages/model/threads/c;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, Lcom/facebook/messages/model/threads/c;->MMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->A()Lcom/facebook/messages/model/threads/c;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/facebook/messages/model/threads/c;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 366
    :cond_0
    sget-object v1, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    .line 368
    :cond_1
    iget-object v3, p0, Lcom/facebook/orca/f/j;->f:Lcom/facebook/orca/f/i;

    invoke-virtual {v3, v1, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/NewMessageResult;)V

    .line 371
    :cond_2
    return-object v2
.end method
