.class public Lcom/facebook/orca/g/t;
.super Ljava/lang/Object;
.source "DbSendHandler.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/orca/g/aa;

.field private final c:Lcom/facebook/orca/g/n;

.field private final d:Lcom/facebook/orca/g/h;

.field private final e:Lcom/facebook/orca/g/b;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/g/aa;Lcom/facebook/orca/g/n;Lcom/facebook/orca/g/h;Lcom/facebook/orca/g/b;)V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-class v0, Lcom/facebook/orca/g/t;

    iput-object v0, p0, Lcom/facebook/orca/g/t;->a:Ljava/lang/Class;

    .line 37
    iput-object p1, p0, Lcom/facebook/orca/g/t;->b:Lcom/facebook/orca/g/aa;

    .line 38
    iput-object p2, p0, Lcom/facebook/orca/g/t;->c:Lcom/facebook/orca/g/n;

    .line 39
    iput-object p3, p0, Lcom/facebook/orca/g/t;->d:Lcom/facebook/orca/g/h;

    .line 40
    iput-object p4, p0, Lcom/facebook/orca/g/t;->e:Lcom/facebook/orca/g/b;

    .line 41
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/SendError;)V
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/g/t;->a(Lcom/facebook/messages/model/threads/SendError;Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/SendError;Ljava/lang/String;)V
    .locals 5
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/orca/g/t;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 89
    invoke-static {}, Lcom/facebook/d/d/e;->a()Lcom/facebook/d/d/f;

    move-result-object v1

    .line 90
    const-string v2, "msg_type"

    const/16 v3, 0x384

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 92
    if-eqz p2, :cond_0

    .line 93
    const-string v2, "thread_id"

    invoke-static {v2, p2}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 96
    :cond_0
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 97
    const-string v3, "msg_type"

    const/16 v4, 0x385

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 98
    const-string v3, "send_error"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/SendError;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v3, "messages"

    invoke-virtual {v1}, Lcom/facebook/d/d/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/facebook/d/d/f;->b()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v2, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 101
    return-void
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)V
    .locals 5

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/orca/g/t;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 105
    const-string v1, "msg_id"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v1

    .line 107
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 108
    const-string v3, "send_error"

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->K()Lcom/facebook/messages/model/threads/SendError;

    move-result-object v4

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/SendError;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    const-string v3, "messages"

    invoke-virtual {v1}, Lcom/facebook/d/d/j;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/facebook/d/d/j;->b()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v2, v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 110
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/fbservice/service/OperationResult;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 50
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/NewMessageResult;

    .line 51
    iget-object v1, p0, Lcom/facebook/orca/g/t;->c:Lcom/facebook/orca/g/n;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/n;->a(Lcom/facebook/orca/server/NewMessageResult;)Lcom/facebook/orca/server/NewMessageResult;

    move-result-object v0

    .line 52
    iget-object v1, p0, Lcom/facebook/orca/g/t;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {v1, p1}, Lcom/facebook/orca/g/h;->c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 53
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "result"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 54
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "threadId"

    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p2}, Lcom/facebook/fbservice/service/OperationResult;->g()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "hasMoreQueuedMessages"

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 56
    return-object p2

    .line 55
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/g/t;->d:Lcom/facebook/orca/g/h;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/g/h;->c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/orca/g/t;->e:Lcom/facebook/orca/g/b;

    invoke-virtual {v0}, Lcom/facebook/orca/g/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 81
    :goto_0
    return-void

    .line 79
    :cond_0
    sget-object v0, Lcom/facebook/messages/model/threads/SendError;->e:Lcom/facebook/messages/model/threads/SendError;

    invoke-direct {p0, v0}, Lcom/facebook/orca/g/t;->a(Lcom/facebook/messages/model/threads/SendError;)V

    .line 80
    iget-object v0, p0, Lcom/facebook/orca/g/t;->e:Lcom/facebook/orca/g/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/b;->a(Z)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    .line 60
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 61
    iget-object v1, p0, Lcom/facebook/orca/g/t;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v1}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    .line 62
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 64
    :try_start_0
    sget-object v2, Lcom/facebook/messages/model/threads/SendError;->d:Lcom/facebook/messages/model/threads/SendError;

    invoke-direct {p0, v2, v0}, Lcom/facebook/orca/g/t;->a(Lcom/facebook/messages/model/threads/SendError;Ljava/lang/String;)V

    .line 65
    invoke-direct {p0, p1}, Lcom/facebook/orca/g/t;->b(Lcom/facebook/messages/model/threads/Message;)V

    .line 66
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 73
    return-void

    .line 67
    :catch_0
    move-exception v0

    .line 68
    :try_start_1
    iget-object v2, p0, Lcom/facebook/orca/g/t;->a:Ljava/lang/Class;

    const-string v3, "SQLException"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method
