.class public Lcom/facebook/orca/sms/a/b;
.super Landroid/database/ContentObserver;
.source "ExternalSmsOperationsObserver.java"


# instance fields
.field private final a:Landroid/content/ContentResolver;

.field private final b:Lcom/facebook/orca/g/aa;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/facebook/orca/notify/at;

.field private final f:Lcom/facebook/orca/sms/a/a;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Lcom/facebook/orca/g/aa;Lcom/facebook/orca/notify/at;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/sms/a/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/ContentResolver;",
            "Lcom/facebook/orca/g/aa;",
            "Lcom/facebook/orca/notify/at;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/sms/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 38
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 39
    iput-object p1, p0, Lcom/facebook/orca/sms/a/b;->a:Landroid/content/ContentResolver;

    .line 40
    iput-object p2, p0, Lcom/facebook/orca/sms/a/b;->b:Lcom/facebook/orca/g/aa;

    .line 41
    iput-object p4, p0, Lcom/facebook/orca/sms/a/b;->c:Ljavax/inject/a;

    .line 42
    iput-object p5, p0, Lcom/facebook/orca/sms/a/b;->d:Ljavax/inject/a;

    .line 43
    iput-object p3, p0, Lcom/facebook/orca/sms/a/b;->e:Lcom/facebook/orca/notify/at;

    .line 44
    iput-object p6, p0, Lcom/facebook/orca/sms/a/b;->f:Lcom/facebook/orca/sms/a/a;

    .line 45
    return-void
.end method

.method private a()Ljava/util/Set;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    .line 72
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 73
    sget-object v0, Landroid_src/c/j;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "simple"

    const-string v2, "true"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/sms/a/b;->a:Landroid/content/ContentResolver;

    new-array v2, v8, [Ljava/lang/String;

    const-string v4, "_id"

    aput-object v4, v2, v7

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 86
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    const-string v0, "_id"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 90
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/sms/a/b;->b:Lcom/facebook/orca/g/aa;

    invoke-virtual {v0}, Lcom/facebook/orca/g/aa;->e()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "SELECT thread_id FROM threads WHERE folder=? ORDER BY thread_id"

    new-array v2, v8, [Ljava/lang/String;

    sget-object v3, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v3}, Lcom/facebook/orca/threads/FolderName;->b()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 97
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 99
    :goto_1
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 100
    const-string v2, "thread_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 101
    invoke-static {v2}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    .line 104
    :catchall_1
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 108
    invoke-interface {v0, v6}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 109
    return-object v0
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .prologue
    .line 139
    const/4 v0, 0x0

    return v0
.end method

.method public onChange(Z)V
    .locals 2

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/orca/sms/a/b;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/sms/a/b;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 68
    :cond_0
    :goto_0
    return-void

    .line 57
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/sms/a/b;->e:Lcom/facebook/orca/notify/at;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/at;->a()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 64
    invoke-direct {p0}, Lcom/facebook/orca/sms/a/b;->a()Ljava/util/Set;

    move-result-object v0

    .line 65
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 66
    iget-object v1, p0, Lcom/facebook/orca/sms/a/b;->f:Lcom/facebook/orca/sms/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/a/a;->a(Ljava/util/Set;)V

    goto :goto_0
.end method
