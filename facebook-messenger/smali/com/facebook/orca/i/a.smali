.class public Lcom/facebook/orca/i/a;
.super Lcom/facebook/orca/server/a;
.source "DispatchServiceHandler.java"


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
.field private final b:Lcom/facebook/fbservice/service/v;

.field private final c:Lcom/facebook/fbservice/service/v;

.field private final d:Lcom/facebook/orca/threads/g;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    const-class v0, Lcom/facebook/orca/i/a;

    sput-object v0, Lcom/facebook/orca/i/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/sms/bj;Lcom/facebook/orca/protocol/a;Lcom/facebook/orca/threads/g;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/sms/bj;",
            "Lcom/facebook/orca/protocol/a;",
            "Lcom/facebook/orca/threads/g;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 58
    const-string v0, "DispatchServiceHandler"

    invoke-direct {p0, v0}, Lcom/facebook/orca/server/a;-><init>(Ljava/lang/String;)V

    .line 59
    new-instance v0, Lcom/facebook/fbservice/service/v;

    new-instance v1, Lcom/facebook/fbservice/service/ai;

    invoke-direct {v1}, Lcom/facebook/fbservice/service/ai;-><init>()V

    invoke-direct {v0, p1, v1}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    iput-object v0, p0, Lcom/facebook/orca/i/a;->c:Lcom/facebook/fbservice/service/v;

    .line 62
    new-instance v0, Lcom/facebook/fbservice/service/v;

    new-instance v1, Lcom/facebook/fbservice/service/ai;

    invoke-direct {v1}, Lcom/facebook/fbservice/service/ai;-><init>()V

    invoke-direct {v0, p2, v1}, Lcom/facebook/fbservice/service/v;-><init>(Lcom/facebook/fbservice/service/f;Lcom/facebook/fbservice/service/e;)V

    iput-object v0, p0, Lcom/facebook/orca/i/a;->b:Lcom/facebook/fbservice/service/v;

    .line 65
    iput-object p3, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    .line 66
    iput-object p4, p0, Lcom/facebook/orca/i/a;->e:Ljavax/inject/a;

    .line 67
    iput-object p5, p0, Lcom/facebook/orca/i/a;->f:Ljavax/inject/a;

    .line 68
    return-void
.end method

.method private a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;
    .locals 1

    .prologue
    .line 265
    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderName;->a()Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/fbservice/service/v;
    .locals 3

    .prologue
    .line 269
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/FolderType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/facebook/orca/threads/FolderType;->c:Lcom/facebook/orca/threads/FolderType;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/FolderType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/i/a;->b:Lcom/facebook/fbservice/service/v;

    .line 273
    :goto_0
    return-object v0

    .line 271
    :cond_1
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->d:Lcom/facebook/orca/threads/FolderType;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/FolderType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 272
    iget-object v0, p0, Lcom/facebook/orca/i/a;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/i/a;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 273
    iget-object v0, p0, Lcom/facebook/orca/i/a;->c:Lcom/facebook/fbservice/service/v;

    goto :goto_0

    .line 275
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Trying to handle sms when it is disabled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 278
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected Folder Type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/FolderType;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method protected b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 74
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 75
    const-string v1, "fetchThreadListParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 76
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadListParams;->b()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 77
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 78
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 85
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 86
    const-string v1, "fetchMoreThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    .line 87
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 88
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 89
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 96
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 97
    const-string v1, "fetchThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 98
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 99
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 100
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 101
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 138
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 139
    const-string v1, "createThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    .line 140
    const/4 v1, 0x0

    .line 141
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v2, v1

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/RecipientInfo;

    .line 142
    invoke-virtual {v1}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v1

    sget-object v4, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    if-ne v1, v4, :cond_3

    .line 143
    add-int/lit8 v1, v2, 0x1

    :goto_1
    move v2, v1

    goto :goto_0

    .line 148
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne v2, v0, :cond_1

    .line 149
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->d:Lcom/facebook/orca/threads/FolderType;

    .line 156
    :goto_2
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 157
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 150
    :cond_1
    if-nez v2, :cond_2

    .line 151
    sget-object v0, Lcom/facebook/orca/threads/FolderType;->b:Lcom/facebook/orca/threads/FolderType;

    goto :goto_2

    .line 153
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t mix the user types being sent to"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move v1, v2

    goto :goto_1
.end method

.method protected f(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lcom/facebook/orca/i/a;->b:Lcom/facebook/fbservice/service/v;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected h(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 120
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 121
    const-string v1, "addMembersParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/AddMembersParams;

    .line 122
    invoke-virtual {v0}, Lcom/facebook/orca/server/AddMembersParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 123
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 125
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected i(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 177
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 178
    const-string v1, "removeMemberParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/RemoveMemberParams;

    .line 179
    invoke-virtual {v0}, Lcom/facebook/orca/server/RemoveMemberParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 180
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 181
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 182
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 189
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 190
    const-string v1, "markThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/MarkThreadParams;

    .line 191
    invoke-virtual {v0}, Lcom/facebook/orca/server/MarkThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 192
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 193
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 194
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 201
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 202
    const-string v1, "deleteThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteThreadParams;

    .line 203
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 204
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 205
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 206
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 213
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 214
    const-string v1, "deleteMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteMessagesParams;

    .line 215
    invoke-virtual {v0}, Lcom/facebook/orca/server/DeleteMessagesParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 216
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 217
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 218
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 225
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 226
    const-string v1, "modifyThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ModifyThreadParams;

    .line 227
    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    .line 228
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 229
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 230
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected q(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 237
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 238
    const-string v1, "folderName"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 239
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 240
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected s(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/facebook/orca/i/a;->b:Lcom/facebook/fbservice/service/v;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected t(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 164
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 165
    const-string v1, "fetchMoreMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    .line 167
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMoreMessagesParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    .line 168
    iget-object v1, p0, Lcom/facebook/orca/i/a;->d:Lcom/facebook/orca/threads/g;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 169
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 170
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected u(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 2

    .prologue
    .line 108
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 109
    const-string v1, "fetchMultipleThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    .line 111
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->a()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 112
    invoke-direct {p0, v0}, Lcom/facebook/orca/i/a;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/fbservice/service/v;

    move-result-object v0

    .line 113
    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected v(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 247
    iget-object v0, p0, Lcom/facebook/orca/i/a;->b:Lcom/facebook/fbservice/service/v;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected w(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 255
    iget-object v0, p0, Lcom/facebook/orca/i/a;->b:Lcom/facebook/fbservice/service/v;

    invoke-virtual {v0, p1}, Lcom/facebook/fbservice/service/v;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
