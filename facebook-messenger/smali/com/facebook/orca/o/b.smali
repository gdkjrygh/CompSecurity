.class public Lcom/facebook/orca/o/b;
.super Ljava/lang/Object;
.source "SendServiceHandler.java"

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
.field private final b:Lcom/facebook/orca/f/z;

.field private final c:Lcom/facebook/orca/f/ad;

.field private final d:Lcom/facebook/orca/app/g;

.field private final e:Lcom/facebook/orca/g/t;

.field private final f:Lcom/facebook/orca/sms/bj;

.field private final g:Lcom/facebook/orca/protocol/a;

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/o/b;

    sput-object v0, Lcom/facebook/orca/o/b;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/f/z;Lcom/facebook/orca/f/ad;Lcom/facebook/orca/app/g;Lcom/facebook/orca/g/t;Lcom/facebook/orca/sms/bj;Lcom/facebook/orca/protocol/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/f/z;",
            "Lcom/facebook/orca/f/ad;",
            "Lcom/facebook/orca/app/g;",
            "Lcom/facebook/orca/g/t;",
            "Lcom/facebook/orca/sms/bj;",
            "Lcom/facebook/orca/protocol/a;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/facebook/orca/o/b;->b:Lcom/facebook/orca/f/z;

    .line 56
    iput-object p2, p0, Lcom/facebook/orca/o/b;->c:Lcom/facebook/orca/f/ad;

    .line 57
    iput-object p3, p0, Lcom/facebook/orca/o/b;->d:Lcom/facebook/orca/app/g;

    .line 58
    iput-object p4, p0, Lcom/facebook/orca/o/b;->e:Lcom/facebook/orca/g/t;

    .line 59
    iput-object p5, p0, Lcom/facebook/orca/o/b;->f:Lcom/facebook/orca/sms/bj;

    .line 60
    iput-object p6, p0, Lcom/facebook/orca/o/b;->g:Lcom/facebook/orca/protocol/a;

    .line 61
    iput-object p7, p0, Lcom/facebook/orca/o/b;->h:Ljavax/inject/a;

    .line 62
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/t;Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 155
    sget-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

    if-ne p1, v0, :cond_0

    .line 156
    sget-object v0, Lcom/facebook/messages/model/threads/SendError;->f:Lcom/facebook/messages/model/threads/SendError;

    .line 157
    new-instance v1, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v1}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v1, p2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/16 v1, 0x385

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 163
    iget-object v1, p0, Lcom/facebook/orca/o/b;->e:Lcom/facebook/orca/g/t;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/g/t;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 165
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/fbservice/service/t;)Z
    .locals 1

    .prologue
    .line 150
    sget-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_NOT_COMPLETE:Lcom/facebook/fbservice/service/t;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 7

    .prologue
    const-wide/16 v5, 0xa

    .line 66
    const-string v0, "SendServiceHandler"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 68
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 69
    sget-object v2, Lcom/facebook/orca/server/aq;->w:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 70
    invoke-virtual {p0, p1}, Lcom/facebook/orca/o/b;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 75
    invoke-virtual {v1, v5, v6}, Lcom/facebook/debug/d/e;->a(J)J

    return-object v0

    .line 72
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

    .line 75
    :catchall_0
    move-exception v0

    invoke-virtual {v1, v5, v6}, Lcom/facebook/debug/d/e;->a(J)J

    throw v0
.end method

.method protected b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/orca/o/b;->e:Lcom/facebook/orca/g/t;

    invoke-virtual {v0}, Lcom/facebook/orca/g/t;->a()V

    .line 81
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    .line 82
    const-string v0, "threadId"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/o/b;->b:Lcom/facebook/orca/f/z;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/f/z;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 86
    iget-object v2, p0, Lcom/facebook/orca/o/b;->e:Lcom/facebook/orca/g/t;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/g/t;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v4

    .line 87
    if-nez v4, :cond_0

    .line 88
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 145
    :goto_0
    return-object v0

    .line 91
    :cond_0
    const-string v2, "userKeyInCanonicalThread"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const-string v0, "outgoingMessage"

    invoke-virtual {v1, v0, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 97
    :try_start_0
    invoke-static {v3}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 98
    iget-object v0, p0, Lcom/facebook/orca/o/b;->f:Lcom/facebook/orca/sms/bj;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/bj;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 104
    :goto_2
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->d()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/o/b;->a(Lcom/facebook/fbservice/service/t;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 105
    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->d()Lcom/facebook/fbservice/service/t;

    move-result-object v1

    invoke-direct {p0, v1, v4}, Lcom/facebook/orca/o/b;->a(Lcom/facebook/fbservice/service/t;Lcom/facebook/messages/model/threads/Message;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    iget-object v1, p0, Lcom/facebook/orca/o/b;->d:Lcom/facebook/orca/app/g;

    invoke-virtual {v1, v3}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 91
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 100
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/o/b;->g:Lcom/facebook/orca/protocol/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_2

    .line 109
    :cond_3
    iget-object v1, p0, Lcom/facebook/orca/o/b;->e:Lcom/facebook/orca/g/t;

    invoke-virtual {v1, v3, v0}, Lcom/facebook/orca/g/t;->a(Ljava/lang/String;Lcom/facebook/fbservice/service/OperationResult;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v2

    .line 111
    invoke-virtual {v2}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/NewMessageResult;

    .line 112
    if-eqz v0, :cond_4

    .line 113
    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 114
    iget-object v1, p0, Lcom/facebook/orca/o/b;->c:Lcom/facebook/orca/f/ad;

    sget-object v5, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v6

    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->c()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v7

    invoke-virtual {v1, v5, v6, v7}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 126
    :goto_3
    iget-object v1, p0, Lcom/facebook/orca/o/b;->h:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Lcom/facebook/orca/threads/FolderName;->e:Lcom/facebook/orca/threads/FolderName;

    if-ne v1, v5, :cond_4

    .line 127
    iget-object v5, p0, Lcom/facebook/orca/o/b;->c:Lcom/facebook/orca/f/ad;

    iget-object v1, p0, Lcom/facebook/orca/o/b;->h:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v6

    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->c()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    invoke-virtual {v5, v1, v6, v0}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/o/b;->d:Lcom/facebook/orca/app/g;

    invoke-virtual {v0, v3}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    move-object v0, v2

    goto/16 :goto_0

    .line 119
    :cond_5
    :try_start_2
    iget-object v1, p0, Lcom/facebook/orca/o/b;->c:Lcom/facebook/orca/f/ad;

    sget-object v5, Lcom/facebook/orca/threads/FolderName;->b:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v6

    invoke-virtual {v0}, Lcom/facebook/orca/server/NewMessageResult;->c()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v7

    invoke-virtual {v1, v5, v6, v7}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 134
    :catch_0
    move-exception v0

    .line 135
    :try_start_3
    sget-object v1, Lcom/facebook/messages/model/threads/SendError;->g:Lcom/facebook/messages/model/threads/SendError;

    .line 136
    new-instance v2, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v2}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v2, v4}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const/16 v2, 0x385

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 142
    iget-object v2, p0, Lcom/facebook/orca/o/b;->e:Lcom/facebook/orca/g/t;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/g/t;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 143
    new-instance v2, Lcom/facebook/orca/o/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/o/a;-><init>(Ljava/lang/Throwable;Lcom/facebook/messages/model/threads/Message;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/facebook/orca/o/b;->d:Lcom/facebook/orca/app/g;

    invoke-virtual {v1, v3}, Lcom/facebook/orca/app/g;->a(Ljava/lang/String;)V

    throw v0
.end method
