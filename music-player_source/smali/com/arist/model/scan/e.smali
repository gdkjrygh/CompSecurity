.class public final Lcom/arist/model/scan/e;
.super Ljava/lang/Thread;


# static fields
.field private static final f:Ljava/lang/Object;


# instance fields
.field a:Landroid/content/ContentResolver;

.field b:J

.field private c:Z

.field private d:Z

.field private e:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/arist/model/scan/e;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;Landroid/os/Handler;Ljava/util/List;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    iput-boolean v0, p0, Lcom/arist/model/scan/e;->c:Z

    iput-boolean v0, p0, Lcom/arist/model/scan/e;->d:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/model/scan/e;->e:Ljava/util/List;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/arist/model/scan/e;->b:J

    iput-object p1, p0, Lcom/arist/model/scan/e;->a:Landroid/content/ContentResolver;

    iput-object p3, p0, Lcom/arist/model/scan/e;->g:Ljava/util/List;

    iput-object p2, p0, Lcom/arist/model/scan/e;->h:Landroid/os/Handler;

    return-void
.end method

.method private a(Ljava/io/File;)V
    .locals 10

    const/4 v6, 0x1

    const/4 v7, 0x0

    iget-boolean v0, p0, Lcom/arist/model/scan/e;->c:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->isHidden()Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v6

    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v1, v0

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/arist/model/scan/e;->b:J

    sub-long v4, v2, v4

    const-wide/16 v8, 0x64

    cmp-long v1, v4, v8

    if-lez v1, :cond_4

    iput-wide v2, p0, Lcom/arist/model/scan/e;->b:J

    :goto_2
    if-eqz v6, :cond_2

    iget-object v1, p0, Lcom/arist/model/scan/e;->h:Landroid/os/Handler;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    :cond_2
    array-length v1, v0

    :goto_3
    if-ge v7, v1, :cond_0

    aget-object v2, v0, v7

    invoke-direct {p0, v2}, Lcom/arist/model/scan/e;->a(Ljava/io/File;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_3
    move v0, v7

    goto :goto_1

    :cond_4
    move v6, v7

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".lrc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/c/a;->F:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/arist/c/c;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".lrc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lcom/arist/c/c;->a(Ljava/io/File;Ljava/io/File;)V

    goto/16 :goto_0

    :cond_6
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0xc800

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/scan/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/arist/model/scan/e;->a:Landroid/content/ContentResolver;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/arist/model/scan/e;->a:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    new-array v2, v6, [Ljava/lang/String;

    const-string v3, "_id"

    aput-object v3, v2, v7

    const-string v3, "_data=?"

    new-array v4, v6, [Ljava/lang/String;

    aput-object v5, v4, v7

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_8

    move v0, v6

    :goto_4
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move v7, v0

    :cond_7
    if-nez v7, :cond_0

    iget-object v0, p0, Lcom/arist/model/scan/e;->e:Ljava/util/List;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    move v0, v7

    goto :goto_4
.end method

.method private b()Ljava/util/List;
    .locals 4

    sget-object v1, Lcom/arist/model/scan/e;->f:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/arist/model/scan/e;->d:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/scan/e;->c:Z

    iget-object v0, p0, Lcom/arist/model/scan/e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/arist/model/scan/e;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/scan/e;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/scan/e;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/arist/model/scan/e;->d:Z

    iget-boolean v0, p0, Lcom/arist/model/scan/e;->c:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    monitor-exit v1

    return-object v0

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lcom/arist/model/scan/e;->a(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/arist/model/scan/e;->e:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/arist/model/scan/e;->c:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/model/scan/e;->a:Landroid/content/ContentResolver;

    return-void
.end method

.method public final run()V
    .locals 4

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/arist/model/scan/e;->b()Ljava/util/List;

    iget-object v0, p0, Lcom/arist/model/scan/e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/String;

    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/arist/model/scan/e;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/scan/e;->h:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/arist/model/scan/e;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v3, v1

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method
