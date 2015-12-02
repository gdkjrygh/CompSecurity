.class public abstract Lcom/facebook/d/d/d;
.super Ljava/lang/Object;
.source "SharedSQLiteSchemaPart.java"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/facebook/d/d/c;


# direct methods
.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    if-lt p2, v0, :cond_0

    :goto_0
    const-string v1, "Version must be positive"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 30
    iput-object p1, p0, Lcom/facebook/d/d/d;->a:Ljava/lang/String;

    .line 31
    iput p2, p0, Lcom/facebook/d/d/d;->b:I

    .line 32
    return-void

    .line 29
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/d/d/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract a(Landroid/database/sqlite/SQLiteDatabase;)V
.end method

.method protected abstract a(Landroid/database/sqlite/SQLiteDatabase;II)V
.end method

.method declared-synchronized a(Lcom/facebook/d/d/c;)V
    .locals 2

    .prologue
    .line 40
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/d/d/d;->c:Lcom/facebook/d/d/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/d/d/d;->c:Lcom/facebook/d/d/c;

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const-string v1, "SharedSQLiteDbPart initialized more than once"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 44
    iput-object p1, p0, Lcom/facebook/d/d/d;->c:Lcom/facebook/d/d/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    monitor-exit p0

    return-void

    .line 40
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 62
    iget v0, p0, Lcom/facebook/d/d/d;->b:I

    return v0
.end method
