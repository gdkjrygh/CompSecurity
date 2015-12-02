.class public Lcom/facebook/orca/f/i;
.super Ljava/lang/Object;
.source "CacheInsertThreadsHandler.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/orca/f/ad;

.field private final c:Lcom/facebook/orca/f/z;

.field private final d:Lcom/facebook/orca/prefs/av;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/z;Lcom/facebook/orca/prefs/av;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const-class v0, Lcom/facebook/orca/f/i;

    iput-object v0, p0, Lcom/facebook/orca/f/i;->a:Ljava/lang/Class;

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/f/i;->c:Lcom/facebook/orca/f/z;

    .line 43
    iput-object p3, p0, Lcom/facebook/orca/f/i;->d:Lcom/facebook/orca/prefs/av;

    .line 44
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchMoreThreadsResult;)V
    .locals 5

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->c()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/util/Collection;)V

    .line 88
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreThreadsResult;->f()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;J)V

    .line 92
    return-void
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadListResult;)V
    .locals 6

    .prologue
    .line 52
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 53
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->c()Lcom/google/common/a/es;

    move-result-object v1

    .line 54
    iget-object v2, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/util/Collection;)V

    .line 55
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->h()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/FolderCounts;)V

    .line 56
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->f()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;JZ)V

    .line 61
    return-void
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadParams;Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 4

    .prologue
    .line 103
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 104
    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 105
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/ad;->a(Ljava/util/Collection;)V

    .line 107
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/f/i;->c:Lcom/facebook/orca/f/z;

    invoke-virtual {v1}, Lcom/facebook/orca/f/z;->a()V

    .line 108
    if-eqz v0, :cond_1

    .line 109
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 112
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v1

    if-lez v1, :cond_1

    .line 113
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 118
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/f/i;->d:Lcom/facebook/orca/prefs/av;

    invoke-virtual {v0}, Lcom/facebook/orca/prefs/av;->a()V

    .line 119
    return-void
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 4

    .prologue
    .line 127
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 128
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/ad;->a(Ljava/util/Collection;)V

    .line 129
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 130
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 131
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;J)V
    .locals 7

    .prologue
    .line 69
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/ad;->e(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v3

    .line 70
    if-eqz v3, :cond_0

    .line 72
    new-instance v0, Lcom/facebook/orca/threads/FolderCounts;

    invoke-virtual {v3}, Lcom/facebook/orca/threads/FolderCounts;->a()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v3}, Lcom/facebook/orca/threads/FolderCounts;->d()J

    move-result-wide v5

    move-wide v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threads/FolderCounts;-><init>(IIJJ)V

    .line 77
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/FolderCounts;)V

    .line 79
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1, p2, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 141
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 142
    if-eqz v0, :cond_0

    .line 143
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/compose/MessageDraft;)V

    .line 145
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/DeleteMessagesParams;Lcom/facebook/orca/server/DeleteMessagesResult;)V
    .locals 3

    .prologue
    .line 186
    invoke-virtual {p2}, Lcom/facebook/orca/server/DeleteMessagesParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-virtual {p2}, Lcom/facebook/orca/server/DeleteMessagesParams;->b()Lcom/google/common/a/fi;

    move-result-object v1

    .line 188
    iget-object v2, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;Ljava/util/Set;)V

    .line 189
    invoke-virtual {p3}, Lcom/facebook/orca/server/DeleteMessagesResult;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 190
    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/f/i;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V

    .line 192
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/MarkThreadParams;)V
    .locals 4

    .prologue
    .line 154
    invoke-virtual {p2}, Lcom/facebook/orca/server/MarkThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 155
    invoke-virtual {p2}, Lcom/facebook/orca/server/MarkThreadParams;->b()Lcom/facebook/orca/server/ai;

    move-result-object v1

    .line 156
    sget-object v2, Lcom/facebook/orca/server/ai;->READ:Lcom/facebook/orca/server/ai;

    if-ne v1, v2, :cond_1

    invoke-virtual {p2}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 157
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p2}, Lcom/facebook/orca/server/MarkThreadParams;->d()J

    move-result-wide v2

    invoke-virtual {v1, p1, v0, v2, v3}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;J)V

    .line 163
    :cond_0
    :goto_0
    return-void

    .line 158
    :cond_1
    sget-object v2, Lcom/facebook/orca/server/ai;->ARCHIVED:Lcom/facebook/orca/server/ai;

    if-ne v1, v2, :cond_2

    invoke-virtual {p2}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 159
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/orca/f/ad;->c(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V

    goto :goto_0

    .line 160
    :cond_2
    sget-object v2, Lcom/facebook/orca/server/ai;->SPAM:Lcom/facebook/orca/server/ai;

    if-ne v1, v2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/server/MarkThreadParams;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 161
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/orca/f/ad;->c(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/NewMessageResult;)V
    .locals 3

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p2}, Lcom/facebook/orca/server/NewMessageResult;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/orca/server/NewMessageResult;->c()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 205
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/f/ad;->c(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V

    .line 173
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;Lcom/facebook/orca/compose/MessageDraft;)V
    .locals 2

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 228
    if-eqz v0, :cond_0

    .line 229
    iget-object v1, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {v1, v0, p3}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/compose/MessageDraft;)V

    .line 231
    :cond_0
    return-void
.end method

.method public b(Lcom/facebook/orca/server/FetchThreadResult;)V
    .locals 4

    .prologue
    .line 213
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->f()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/f/i;->b:Lcom/facebook/orca/f/ad;

    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->c()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/util/Collection;)V

    .line 217
    return-void
.end method
