.class public final Lkik/android/b/ab;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/b/ab$a;
    }
.end annotation


# instance fields
.field private a:Lkik/android/b/ab$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lkik/android/b/ab$a;

    invoke-direct {v0, p0, p1, p2}, Lkik/android/b/ab$a;-><init>(Lkik/android/b/ab;Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/b/ab;->a:Lkik/android/b/ab$a;

    .line 20
    iget-object v0, p0, Lkik/android/b/ab;->a:Lkik/android/b/ab$a;

    invoke-virtual {v0}, Lkik/android/b/ab$a;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 21
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    .line 25
    iget-object v1, p0, Lkik/android/b/ab;->a:Lkik/android/b/ab$a;

    monitor-enter v1

    .line 26
    :try_start_0
    iget-object v0, p0, Lkik/android/b/ab;->a:Lkik/android/b/ab$a;

    invoke-virtual {v0}, Lkik/android/b/ab$a;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v2, "appTable"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 27
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
