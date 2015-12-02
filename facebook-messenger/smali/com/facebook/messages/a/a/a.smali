.class public Lcom/facebook/messages/a/a/a;
.super Ljava/lang/Object;
.source "ContactPickerServerSuppliedParams.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Lcom/facebook/abtest/qe/c;

.field private final b:Lcom/facebook/common/e/h;

.field private c:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private d:Lcom/google/common/base/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/abtest/qe/c;Lcom/facebook/common/e/h;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object v0, p0, Lcom/facebook/messages/a/a/a;->c:Lcom/google/common/base/Optional;

    .line 34
    iput-object v0, p0, Lcom/facebook/messages/a/a/a;->d:Lcom/google/common/base/Optional;

    .line 40
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/abtest/qe/c;

    iput-object v0, p0, Lcom/facebook/messages/a/a/a;->a:Lcom/facebook/abtest/qe/c;

    .line 41
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/messages/a/a/a;->b:Lcom/facebook/common/e/h;

    .line 42
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/messages/a/a/a;->a:Lcom/facebook/abtest/qe/c;

    const-string v1, "messaging_composer_text"

    new-instance v2, Lcom/facebook/messages/a/a/b;

    invoke-direct {v2, p0}, Lcom/facebook/messages/a/a/b;-><init>(Lcom/facebook/messages/a/a/a;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/abtest/qe/c;->a(Ljava/lang/String;Lcom/facebook/abtest/qe/data/d;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 60
    new-instance v1, Lcom/facebook/messages/a/a/c;

    invoke-direct {v1, p0}, Lcom/facebook/messages/a/a/c;-><init>(Lcom/facebook/messages/a/a/a;)V

    invoke-static {v0, v1}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 71
    return-void
.end method

.method declared-synchronized a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 1

    .prologue
    .line 74
    monitor-enter p0

    :try_start_0
    const-string v0, "recipient_label"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/a/a/a;->c:Lcom/google/common/base/Optional;

    .line 75
    const-string v0, "recipient_placeholder"

    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/messages/a/a/a;->d:Lcom/google/common/base/Optional;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    monitor-exit p0

    return-void

    .line 74
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized b()Lcom/google/common/base/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 82
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/messages/a/a/a;->c:Lcom/google/common/base/Optional;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Lcom/google/common/base/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Optional",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 86
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/messages/a/a/a;->d:Lcom/google/common/base/Optional;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
