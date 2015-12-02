.class public Lcom/facebook/contacts/service/m;
.super Ljava/lang/Object;
.source "DynamicContactDataServiceHandler.java"

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
.field private final b:Lcom/facebook/contacts/data/m;

.field private final c:Lcom/facebook/contacts/data/l;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/contacts/g/g;

.field private final f:Lcom/facebook/contacts/g/a/d;

.field private final g:Lcom/facebook/contacts/a/c;

.field private final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/contacts/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Lcom/facebook/contacts/data/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    const-class v0, Lcom/facebook/contacts/service/m;

    sput-object v0, Lcom/facebook/contacts/service/m;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/contacts/data/m;Lcom/facebook/contacts/data/l;Ljavax/inject/a;Lcom/facebook/contacts/g/g;Lcom/facebook/contacts/g/a/d;Lcom/facebook/contacts/a/c;Ljava/util/Set;Ljavax/inject/a;Lcom/facebook/contacts/data/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/contacts/data/m;",
            "Lcom/facebook/contacts/data/l;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/protocol/aq;",
            ">;",
            "Lcom/facebook/contacts/g/g;",
            "Lcom/facebook/contacts/g/a/d;",
            "Lcom/facebook/contacts/a/c;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/contacts/a/a;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/contacts/data/k;",
            ")V"
        }
    .end annotation

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/facebook/contacts/service/m;->b:Lcom/facebook/contacts/data/m;

    .line 72
    iput-object p2, p0, Lcom/facebook/contacts/service/m;->c:Lcom/facebook/contacts/data/l;

    .line 73
    iput-object p3, p0, Lcom/facebook/contacts/service/m;->d:Ljavax/inject/a;

    .line 74
    iput-object p4, p0, Lcom/facebook/contacts/service/m;->e:Lcom/facebook/contacts/g/g;

    .line 75
    iput-object p5, p0, Lcom/facebook/contacts/service/m;->f:Lcom/facebook/contacts/g/a/d;

    .line 76
    iput-object p6, p0, Lcom/facebook/contacts/service/m;->g:Lcom/facebook/contacts/a/c;

    .line 77
    iput-object p7, p0, Lcom/facebook/contacts/service/m;->h:Ljava/util/Set;

    .line 78
    iput-object p8, p0, Lcom/facebook/contacts/service/m;->i:Ljavax/inject/a;

    .line 79
    iput-object p9, p0, Lcom/facebook/contacts/service/m;->j:Lcom/facebook/contacts/data/k;

    .line 80
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 97
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 98
    const-string v1, "fetchChatContextParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchChatContextParams;

    .line 100
    iget-object v1, p0, Lcom/facebook/contacts/service/m;->d:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/http/protocol/aq;

    .line 101
    iget-object v2, p0, Lcom/facebook/contacts/service/m;->e:Lcom/facebook/contacts/g/g;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchChatContextResult;

    .line 104
    iget-object v1, p0, Lcom/facebook/contacts/service/m;->g:Lcom/facebook/contacts/a/c;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchChatContextResult;->a()Lcom/google/common/a/ev;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/a/c;->a(Ljava/util/Map;)V

    .line 106
    new-instance v1, Lcom/facebook/contacts/server/SyncToCacheResult;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchChatContextResult;->e()Lcom/facebook/fbservice/c/b;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchChatContextResult;->f()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lcom/facebook/contacts/server/SyncToCacheResult;-><init>(Lcom/facebook/fbservice/c/b;J)V

    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/contacts/server/FetchLastActiveResult;
    .locals 7

    .prologue
    const-wide/16 v5, -0x1

    .line 112
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 113
    const-string v1, "syncToCacheParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/SyncToCacheParams;

    .line 115
    iget-object v1, p0, Lcom/facebook/contacts/service/m;->j:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->f:Lcom/facebook/contacts/data/j;

    invoke-virtual {v1, v2, v5, v6}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v1

    .line 119
    invoke-virtual {v0}, Lcom/facebook/contacts/server/SyncToCacheParams;->a()Lcom/facebook/fbservice/service/s;

    move-result-object v0

    sget-object v3, Lcom/facebook/fbservice/service/s;->DO_NOT_CHECK_SERVER:Lcom/facebook/fbservice/service/s;

    if-ne v0, v3, :cond_0

    .line 120
    iget-object v0, p0, Lcom/facebook/contacts/service/m;->c:Lcom/facebook/contacts/data/l;

    invoke-virtual {v0}, Lcom/facebook/contacts/data/l;->a()Lcom/google/common/a/es;

    move-result-object v3

    .line 121
    new-instance v0, Lcom/facebook/contacts/server/FetchLastActiveResult;

    sget-object v4, Lcom/facebook/fbservice/c/b;->FROM_CACHE_STALE:Lcom/facebook/fbservice/c/b;

    invoke-direct {v0, v4, v3, v1, v2}, Lcom/facebook/contacts/server/FetchLastActiveResult;-><init>(Lcom/facebook/fbservice/c/b;Lcom/google/common/a/es;J)V

    .line 170
    :goto_0
    return-object v0

    .line 127
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 128
    cmp-long v0, v1, v5

    if-eqz v0, :cond_1

    sub-long v0, v3, v1

    const-wide/32 v2, 0x1d4c0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 133
    sget-object v0, Lcom/facebook/contacts/server/FetchLastActiveResult;->a:Lcom/facebook/contacts/server/FetchLastActiveResult;

    goto :goto_0

    .line 137
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/service/m;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 141
    invoke-static {}, Lcom/facebook/contacts/server/FetchLastActiveParams;->a()Lcom/facebook/contacts/server/FetchLastActiveParams;

    move-result-object v0

    move-object v1, v0

    .line 146
    :goto_1
    iget-object v0, p0, Lcom/facebook/contacts/service/m;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    .line 147
    iget-object v2, p0, Lcom/facebook/contacts/service/m;->f:Lcom/facebook/contacts/g/a/d;

    invoke-interface {v0, v2, v1}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/FetchLastActiveResult;

    .line 150
    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchLastActiveResult;->a()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/User;

    .line 151
    invoke-virtual {v1}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 152
    iget-object v3, p0, Lcom/facebook/contacts/service/m;->g:Lcom/facebook/contacts/a/c;

    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-virtual {v1}, Lcom/facebook/user/User;->C()Lcom/facebook/user/LastActive;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Lcom/facebook/contacts/a/c;->a(Lcom/facebook/user/UserKey;Lcom/facebook/user/LastActive;)V

    goto :goto_2

    .line 143
    :cond_3
    const/16 v0, 0xf

    invoke-static {v0}, Lcom/facebook/contacts/server/FetchLastActiveParams;->a(I)Lcom/facebook/contacts/server/FetchLastActiveParams;

    move-result-object v0

    move-object v1, v0

    goto :goto_1

    .line 156
    :cond_4
    iget-object v1, p0, Lcom/facebook/contacts/service/m;->b:Lcom/facebook/contacts/data/m;

    invoke-virtual {v0}, Lcom/facebook/contacts/server/FetchLastActiveResult;->a()Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/contacts/data/m;->a(Lcom/google/common/a/es;)V

    .line 159
    iget-object v1, p0, Lcom/facebook/contacts/service/m;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/contacts/a/a;

    .line 160
    invoke-interface {v1}, Lcom/facebook/contacts/a/a;->a()V

    goto :goto_3

    .line 164
    :cond_5
    iget-object v1, p0, Lcom/facebook/contacts/service/m;->j:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->f:Lcom/facebook/contacts/data/j;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/contacts/data/k;->b(Lcom/facebook/common/s/a;J)V

    .line 168
    sget-object v1, Lcom/facebook/contacts/service/m;->a:Ljava/lang/Class;

    const-string v2, "last active data loaded"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 84
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 85
    sget-object v1, Lcom/facebook/contacts/server/d;->p:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 86
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/m;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 89
    :goto_0
    return-object v0

    .line 87
    :cond_0
    sget-object v1, Lcom/facebook/contacts/server/d;->o:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 88
    invoke-direct {p0, p1}, Lcom/facebook/contacts/service/m;->c(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/contacts/server/FetchLastActiveResult;

    move-result-object v0

    .line 89
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 91
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
