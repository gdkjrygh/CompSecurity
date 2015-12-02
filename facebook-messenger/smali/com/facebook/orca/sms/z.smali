.class public Lcom/facebook/orca/sms/z;
.super Ljava/lang/Object;
.source "MmsSmsFetchThreadHandler.java"


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
.field private final b:Lcom/facebook/orca/sms/y;

.field private c:Lcom/facebook/orca/sms/bk;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/orca/sms/aa;

    sput-object v0, Lcom/facebook/orca/sms/z;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/sms/y;Lcom/facebook/orca/sms/bk;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/orca/sms/z;->b:Lcom/facebook/orca/sms/y;

    .line 33
    iput-object p2, p0, Lcom/facebook/orca/sms/z;->c:Lcom/facebook/orca/sms/bk;

    .line 34
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchMoreMessagesParams;)Lcom/facebook/orca/server/FetchMoreMessagesResult;
    .locals 7

    .prologue
    .line 101
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    .line 102
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->c()J

    move-result-wide v2

    .line 103
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->d()I

    move-result v4

    .line 105
    sget-object v5, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    .line 107
    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    .line 108
    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 109
    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/facebook/orca/sms/z;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/y;->b(Ljava/lang/String;)J

    move-result-wide v0

    .line 111
    invoke-static {v0, v1}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v0

    .line 113
    :cond_0
    if-nez v0, :cond_1

    .line 114
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Trying to fetch an unknown MmsSms thread"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 117
    :cond_1
    invoke-static {v0}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v0

    .line 118
    invoke-static {v0, v1, v4, v2, v3}, Lcom/facebook/orca/sms/b;->b(JIJ)Lcom/facebook/orca/sms/b;

    move-result-object v0

    .line 123
    iget-object v1, p0, Lcom/facebook/orca/sms/z;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/y;->a(Lcom/facebook/orca/sms/b;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 125
    new-instance v1, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    const-wide/16 v2, -0x1

    invoke-direct {v1, v5, v0, v2, v3}, Lcom/facebook/orca/server/FetchMoreMessagesResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/MessagesCollection;J)V

    return-object v1
.end method

.method public a(Lcom/facebook/orca/server/FetchThreadParams;)Lcom/facebook/orca/server/FetchThreadResult;
    .locals 14

    .prologue
    const-wide/16 v6, -0x1

    const/4 v1, 0x0

    const/4 v12, 0x1

    const/4 v5, 0x0

    .line 38
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v11

    .line 40
    sget-object v8, Lcom/facebook/fbservice/c/b;->NO_DATA:Lcom/facebook/fbservice/c/b;

    .line 42
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    .line 45
    invoke-virtual {v11}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 46
    invoke-virtual {v11}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v9

    .line 47
    iget-object v0, p0, Lcom/facebook/orca/sms/z;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v0, v9, v10}, Lcom/facebook/orca/sms/y;->a(J)Lcom/facebook/orca/sms/e;

    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lcom/facebook/orca/sms/e;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    .line 50
    invoke-virtual {v0}, Lcom/facebook/orca/sms/e;->b()Lcom/google/common/a/es;

    move-result-object v4

    .line 51
    invoke-virtual {v0}, Lcom/facebook/orca/sms/e;->b()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-ne v3, v12, :cond_6

    .line 52
    invoke-virtual {v0}, Lcom/facebook/orca/sms/e;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    :goto_0
    move-object v5, v0

    .line 72
    :goto_1
    if-nez v2, :cond_3

    invoke-virtual {v11}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-nez v0, :cond_3

    .line 73
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Couldn\'t find thread"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 54
    :cond_0
    invoke-virtual {v11}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 55
    invoke-virtual {v11}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    .line 56
    iget-object v2, p0, Lcom/facebook/orca/sms/z;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/y;->a(Ljava/lang/String;)Lcom/facebook/orca/sms/e;

    move-result-object v2

    .line 58
    invoke-virtual {v2}, Lcom/facebook/orca/sms/e;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v9

    .line 59
    invoke-virtual {v2}, Lcom/facebook/orca/sms/e;->b()Lcom/google/common/a/es;

    move-result-object v4

    .line 60
    invoke-virtual {v2}, Lcom/facebook/orca/sms/e;->b()Lcom/google/common/a/es;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    if-ne v3, v12, :cond_1

    .line 61
    invoke-virtual {v2}, Lcom/facebook/orca/sms/e;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    move-object v5, v0

    .line 65
    :goto_2
    if-eqz v9, :cond_5

    .line 66
    invoke-virtual {v9}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v2

    :goto_3
    move-object v13, v9

    move-wide v9, v2

    move-object v2, v13

    .line 68
    goto :goto_1

    .line 63
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/sms/z;->c:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v5

    goto :goto_2

    .line 69
    :cond_2
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Trying to fetch an MmsSms thread without a threadId or a phone number"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_3
    if-eqz v2, :cond_4

    cmp-long v0, v9, v6

    if-eqz v0, :cond_4

    .line 77
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->g()J

    move-result-wide v6

    .line 78
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadParams;->f()I

    move-result v1

    .line 79
    sget-object v0, Lcom/facebook/fbservice/c/b;->FROM_CACHE_UP_TO_DATE:Lcom/facebook/fbservice/c/b;

    .line 81
    invoke-static {v9, v10, v1, v6, v7}, Lcom/facebook/orca/sms/b;->a(JIJ)Lcom/facebook/orca/sms/b;

    move-result-object v1

    .line 86
    iget-object v3, p0, Lcom/facebook/orca/sms/z;->b:Lcom/facebook/orca/sms/y;

    invoke-virtual {v3, v1}, Lcom/facebook/orca/sms/y;->a(Lcom/facebook/orca/sms/b;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    move-object v3, v1

    move-object v1, v0

    .line 89
    :goto_4
    new-instance v0, Lcom/facebook/orca/server/FetchThreadResult;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/FetchThreadResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;Lcom/facebook/user/User;J)V

    return-object v0

    :cond_4
    move-object v3, v1

    move-object v1, v8

    goto :goto_4

    :cond_5
    move-wide v2, v6

    goto :goto_3

    :cond_6
    move-object v0, v1

    goto/16 :goto_0
.end method
