.class public Lcom/facebook/zero/b/a;
.super Lcom/facebook/d/d/a;
.source "ZeroDatabaseSupplier.java"

# interfaces
.implements Lcom/facebook/auth/f/a;


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
.field private final b:Lcom/facebook/zero/b/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/zero/b/a;->a:Lcom/google/common/a/es;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/zero/b/c;)V
    .locals 7

    .prologue
    .line 30
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v4

    const-string v5, "zero_rating_db"

    sget-object v6, Lcom/facebook/zero/b/a;->a:Lcom/google/common/a/es;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/d/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 38
    iput-object p4, p0, Lcom/facebook/zero/b/a;->b:Lcom/facebook/zero/b/c;

    .line 39
    return-void
.end method


# virtual methods
.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 43
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/zero/b/a;->b:Lcom/facebook/zero/b/c;

    invoke-virtual {p0}, Lcom/facebook/zero/b/a;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/zero/b/c;->b(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit p0

    return-void

    .line 43
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
