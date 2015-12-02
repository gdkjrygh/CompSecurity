.class public Lcom/facebook/orca/g/aa;
.super Lcom/facebook/d/d/a;
.source "ThreadsDatabaseSupplier.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/orca/g/ap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-string v0, "threads_db"

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/g/aa;->a:Lcom/google/common/a/es;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/orca/g/ap;)V
    .locals 7

    .prologue
    .line 32
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v4

    const-string v5, "threads_db2"

    sget-object v6, Lcom/facebook/orca/g/aa;->a:Lcom/google/common/a/es;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/d/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 40
    iput-object p4, p0, Lcom/facebook/orca/g/aa;->b:Lcom/facebook/orca/g/ap;

    .line 41
    return-void
.end method


# virtual methods
.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 44
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/g/aa;->b:Lcom/facebook/orca/g/ap;

    invoke-virtual {p0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/ap;->b(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    monitor-exit p0

    return-void

    .line 44
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 48
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/g/aa;->b:Lcom/facebook/orca/g/ap;

    invoke-virtual {p0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/g/ap;->c(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit p0

    return-void

    .line 48
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
