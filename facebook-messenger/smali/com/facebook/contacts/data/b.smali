.class public Lcom/facebook/contacts/data/b;
.super Lcom/facebook/d/d/a;
.source "ContactsDatabaseSupplier.java"

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
.field private final b:Lcom/facebook/contacts/data/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 23
    const-string v0, "users_db"

    const-string v1, "users_db2"

    invoke-static {v0, v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/data/b;->a:Lcom/google/common/a/es;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/facebook/contacts/data/c;)V
    .locals 7

    .prologue
    .line 33
    invoke-static {p4}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v4

    const-string v5, "contacts_db2"

    sget-object v6, Lcom/facebook/contacts/data/b;->a:Lcom/google/common/a/es;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/d/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/d/b/a;Lcom/google/common/a/es;Ljava/lang/String;Lcom/google/common/a/es;)V

    .line 41
    iput-object p4, p0, Lcom/facebook/contacts/data/b;->b:Lcom/facebook/contacts/data/c;

    .line 42
    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 55
    const v0, 0x19000

    return v0
.end method

.method public declared-synchronized b()V
    .locals 1

    .prologue
    .line 50
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/contacts/data/b;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit p0

    return-void

    .line 50
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 45
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/contacts/data/b;->b:Lcom/facebook/contacts/data/c;

    invoke-virtual {p0}, Lcom/facebook/contacts/data/b;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/data/c;->b(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit p0

    return-void

    .line 45
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
