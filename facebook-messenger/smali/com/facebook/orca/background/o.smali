.class public Lcom/facebook/orca/background/o;
.super Lcom/facebook/backgroundtasks/a;
.source "SyncLastActiveForTopContactsBackgroundTask.java"


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
.field private final b:Lcom/facebook/auth/b/b;

.field private final c:Lcom/facebook/contacts/data/k;

.field private final d:Lcom/facebook/fbservice/ops/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/orca/background/o;

    sput-object v0, Lcom/facebook/orca/background/o;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/contacts/data/k;Lcom/facebook/fbservice/ops/k;)V
    .locals 1

    .prologue
    .line 43
    const-string v0, "SYNC_LAST_ACTIVE_FOR_TOP_CONTACTS"

    invoke-direct {p0, v0}, Lcom/facebook/backgroundtasks/a;-><init>(Ljava/lang/String;)V

    .line 44
    iput-object p1, p0, Lcom/facebook/orca/background/o;->b:Lcom/facebook/auth/b/b;

    .line 45
    iput-object p2, p0, Lcom/facebook/orca/background/o;->c:Lcom/facebook/contacts/data/k;

    .line 46
    iput-object p3, p0, Lcom/facebook/orca/background/o;->d:Lcom/facebook/fbservice/ops/k;

    .line 47
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 56
    iget-object v1, p0, Lcom/facebook/orca/background/o;->b:Lcom/facebook/auth/b/b;

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-nez v1, :cond_1

    .line 63
    :cond_0
    :goto_0
    return v0

    .line 60
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/background/o;->c:Lcom/facebook/contacts/data/k;

    sget-object v2, Lcom/facebook/contacts/data/i;->f:Lcom/facebook/contacts/data/j;

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/facebook/contacts/data/k;->a(Lcom/facebook/common/s/a;J)J

    move-result-wide v1

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long v1, v3, v1

    const-wide/32 v3, 0xa4cb80

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public c()Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/backgroundtasks/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 68
    sget-object v0, Lcom/facebook/orca/background/o;->a:Ljava/lang/Class;

    const-string v1, "Starting SyncTopLastActive"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 69
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 70
    const-string v1, "syncToCacheParams"

    new-instance v2, Lcom/facebook/contacts/server/SyncToCacheParams;

    sget-object v3, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-direct {v2, v3}, Lcom/facebook/contacts/server/SyncToCacheParams;-><init>(Lcom/facebook/fbservice/service/s;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/background/o;->d:Lcom/facebook/fbservice/ops/k;

    sget-object v2, Lcom/facebook/contacts/server/d;->o:Lcom/facebook/fbservice/service/OperationType;

    invoke-interface {v1, v2, v0}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->a()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 75
    new-instance v1, Lcom/facebook/backgroundtasks/r;

    sget-object v2, Lcom/facebook/orca/background/o;->a:Ljava/lang/Class;

    invoke-direct {v1, v2}, Lcom/facebook/backgroundtasks/r;-><init>(Ljava/lang/Class;)V

    .line 76
    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 77
    return-object v1
.end method

.method public g()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;>;"
        }
    .end annotation

    .prologue
    .line 51
    const-class v0, Lcom/facebook/orca/background/MessagesTaskTag;

    invoke-static {v0}, Lcom/google/common/a/fi;->b(Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
