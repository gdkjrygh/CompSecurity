.class public Lcom/facebook/orca/stickers/ak;
.super Lcom/facebook/d/d/a;
.source "StickersDatabaseSupplier.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# instance fields
.field private final a:Lcom/facebook/orca/stickers/al;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/orca/stickers/al;)V
    .locals 7

    .prologue
    .line 33
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v4

    const-string v5, "stickers_db"

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/d/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 40
    iput-object p4, p0, Lcom/facebook/orca/stickers/ak;->a:Lcom/facebook/orca/stickers/al;

    .line 41
    return-void
.end method


# virtual methods
.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 49
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/stickers/ak;->a:Lcom/facebook/orca/stickers/al;

    invoke-virtual {p0}, Lcom/facebook/orca/stickers/ak;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/stickers/al;->b(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit p0

    return-void

    .line 49
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/facebook/orca/stickers/ak;->b()V

    .line 46
    return-void
.end method
