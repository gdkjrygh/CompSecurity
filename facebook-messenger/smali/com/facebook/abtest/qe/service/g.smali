.class public Lcom/facebook/abtest/qe/service/g;
.super Ljava/lang/Object;
.source "QuickExperimentSyncServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private final a:Lcom/facebook/http/protocol/am;

.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/abtest/qe/g/a;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/abtest/qe/protocol/sync/user/a;

.field private final f:Lcom/facebook/abtest/qe/protocol/sync/full/a;

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/facebook/abtest/qe/b/a;

.field private final i:Lcom/facebook/abtest/qe/b;


# direct methods
.method public constructor <init>(Lcom/facebook/http/protocol/am;Ljavax/inject/a;Lcom/facebook/abtest/qe/g/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/abtest/qe/protocol/sync/user/a;Lcom/facebook/abtest/qe/protocol/sync/full/a;Ljavax/inject/a;Lcom/facebook/abtest/qe/b/a;Lcom/facebook/abtest/qe/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/protocol/am;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/abtest/qe/g/a;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/abtest/qe/protocol/sync/user/a;",
            "Lcom/facebook/abtest/qe/protocol/sync/full/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/abtest/qe/b/a;",
            "Lcom/facebook/abtest/qe/b;",
            ")V"
        }
    .end annotation

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lcom/facebook/abtest/qe/service/g;->a:Lcom/facebook/http/protocol/am;

    .line 60
    iput-object p2, p0, Lcom/facebook/abtest/qe/service/g;->b:Ljavax/inject/a;

    .line 61
    iput-object p3, p0, Lcom/facebook/abtest/qe/service/g;->c:Lcom/facebook/abtest/qe/g/a;

    .line 62
    iput-object p4, p0, Lcom/facebook/abtest/qe/service/g;->d:Lcom/facebook/prefs/shared/d;

    .line 63
    iput-object p5, p0, Lcom/facebook/abtest/qe/service/g;->e:Lcom/facebook/abtest/qe/protocol/sync/user/a;

    .line 64
    iput-object p6, p0, Lcom/facebook/abtest/qe/service/g;->f:Lcom/facebook/abtest/qe/protocol/sync/full/a;

    .line 65
    iput-object p7, p0, Lcom/facebook/abtest/qe/service/g;->g:Ljavax/inject/a;

    .line 66
    iput-object p8, p0, Lcom/facebook/abtest/qe/service/g;->h:Lcom/facebook/abtest/qe/b/a;

    .line 67
    iput-object p9, p0, Lcom/facebook/abtest/qe/service/g;->i:Lcom/facebook/abtest/qe/b;

    .line 68
    return-void
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 9

    .prologue
    const/4 v8, 0x1

    .line 83
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/g;->a:Lcom/facebook/http/protocol/am;

    invoke-interface {v0}, Lcom/facebook/http/protocol/am;->a()Lcom/facebook/http/protocol/j;

    move-result-object v2

    .line 86
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/g;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 87
    if-nez v0, :cond_0

    .line 88
    sget-object v0, Lcom/facebook/fbservice/service/t;->OTHER:Lcom/facebook/fbservice/service/t;

    const-string v1, "No user ID available"

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 146
    :goto_0
    return-object v0

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/g;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 92
    sget-object v1, Lcom/facebook/abtest/qe/data/a;->b:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v0, v1, v3, v4}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 93
    sget-object v1, Lcom/facebook/abtest/qe/data/a;->c:Lcom/facebook/prefs/shared/ae;

    iget-object v3, p0, Lcom/facebook/abtest/qe/service/g;->c:Lcom/facebook/abtest/qe/g/a;

    invoke-virtual {v3}, Lcom/facebook/abtest/qe/g/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    .line 95
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 97
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/g;->h:Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/b/a;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 98
    iget-object v1, p0, Lcom/facebook/abtest/qe/service/g;->i:Lcom/facebook/abtest/qe/b;

    invoke-virtual {v1, v0}, Lcom/facebook/abtest/qe/b;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 99
    new-instance v1, Lcom/facebook/abtest/qe/protocol/sync/c;

    invoke-direct {v1}, Lcom/facebook/abtest/qe/protocol/sync/c;-><init>()V

    invoke-virtual {v1, v0}, Lcom/facebook/abtest/qe/protocol/sync/c;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/c;

    move-result-object v4

    iget-object v1, p0, Lcom/facebook/abtest/qe/service/g;->b:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/facebook/abtest/qe/protocol/sync/c;->b(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/c;

    move-result-object v1

    .line 102
    iget-object v4, p0, Lcom/facebook/abtest/qe/service/g;->h:Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {v4, v0}, Lcom/facebook/abtest/qe/b/a;->a(Ljava/lang/String;)Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    move-result-object v4

    .line 103
    if-eqz v4, :cond_2

    .line 104
    invoke-virtual {v4}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/facebook/abtest/qe/protocol/sync/c;->c(Ljava/lang/String;)Lcom/facebook/abtest/qe/protocol/sync/c;

    .line 107
    :cond_2
    invoke-virtual {v1}, Lcom/facebook/abtest/qe/protocol/sync/c;->a()Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    move-result-object v4

    .line 110
    iget-object v1, p0, Lcom/facebook/abtest/qe/service/g;->e:Lcom/facebook/abtest/qe/protocol/sync/user/a;

    invoke-static {v1, v4}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "sync_user_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 114
    iget-object v1, p0, Lcom/facebook/abtest/qe/service/g;->g:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 115
    iget-object v1, p0, Lcom/facebook/abtest/qe/service/g;->f:Lcom/facebook/abtest/qe/protocol/sync/full/a;

    invoke-static {v1, v4}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sync_meta_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    goto/16 :goto_1

    .line 123
    :cond_3
    const-string v0, "handleGetQEs"

    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 125
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 126
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 127
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 128
    iget-object v0, p0, Lcom/facebook/abtest/qe/service/g;->h:Lcom/facebook/abtest/qe/b/a;

    invoke-virtual {v0}, Lcom/facebook/abtest/qe/b/a;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 129
    iget-object v1, p0, Lcom/facebook/abtest/qe/service/g;->i:Lcom/facebook/abtest/qe/b;

    invoke-virtual {v1, v0}, Lcom/facebook/abtest/qe/b;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "sync_user_"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    .line 132
    if-eqz v1, :cond_5

    .line 133
    invoke-virtual {v3, v0, v8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 134
    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 137
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "sync_meta_"

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/abtest/qe/protocol/sync/full/SyncQuickExperimentMetaInfoResult;

    .line 139
    if-eqz v1, :cond_4

    .line 140
    invoke-virtual {v3, v0, v8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 141
    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_2

    .line 146
    :cond_6
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/util/Pair;

    const/4 v1, 0x0

    const-string v2, "sync_user"

    invoke-static {v2, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "sync_meta"

    invoke-static {v1, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v1

    aput-object v1, v0, v8

    invoke-static {v3, v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;[Landroid/util/Pair;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto/16 :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 72
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 73
    sget-object v1, Lcom/facebook/abtest/qe/service/a;->a:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 74
    invoke-direct {p0, p1}, Lcom/facebook/abtest/qe/service/g;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 76
    :cond_0
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
