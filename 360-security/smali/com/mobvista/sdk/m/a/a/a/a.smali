.class public abstract Lcom/mobvista/sdk/m/a/a/a/a;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Lcom/mobvista/sdk/m/a/a/a/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Lcom/mobvista/sdk/m/a/a/a/b;

    invoke-virtual {p0}, Lcom/mobvista/sdk/m/a/a/a/a;->a()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x258

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/mobvista/sdk/m/a/a/a/b;-><init>(Lcom/mobvista/sdk/m/a/a/a/a;Landroid/content/Context;Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/a;->a:Lcom/mobvista/sdk/m/a/a/a/b;

    .line 15
    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/lang/String;
.end method

.method protected abstract a(Landroid/database/sqlite/SQLiteDatabase;)V
.end method

.method public final declared-synchronized b()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .prologue
    .line 18
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/a;->a:Lcom/mobvista/sdk/m/a/a/a/b;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/b;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected abstract b(Landroid/database/sqlite/SQLiteDatabase;)V
.end method

.method public final declared-synchronized c()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .prologue
    .line 22
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/a/a/a;->a:Lcom/mobvista/sdk/m/a/a/a/b;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/a/a/a/b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
