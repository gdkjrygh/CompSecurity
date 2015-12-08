.class final Lkik/android/i/j;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:J

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:J

.field final synthetic i:Lkik/android/i/i;


# direct methods
.method constructor <init>(Lkik/android/i/i;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IIIJ)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lkik/android/i/j;->i:Lkik/android/i/i;

    iput-object p2, p0, Lkik/android/i/j;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/i/j;->b:Ljava/lang/String;

    iput-wide p4, p0, Lkik/android/i/j;->c:J

    iput-object p6, p0, Lkik/android/i/j;->d:Ljava/lang/String;

    iput p7, p0, Lkik/android/i/j;->e:I

    iput p8, p0, Lkik/android/i/j;->f:I

    iput p9, p0, Lkik/android/i/j;->g:I

    iput-wide p10, p0, Lkik/android/i/j;->h:J

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lkik/android/i/j;->i:Lkik/android/i/i;

    invoke-static {v0}, Lkik/android/i/i;->a(Lkik/android/i/i;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lkik/android/i/j;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 12

    .prologue
    .line 113
    check-cast p1, Ljava/io/File;

    iget-object v0, p0, Lkik/android/i/j;->i:Lkik/android/i/i;

    iget-object v0, v0, Lkik/android/i/i;->a:Lcom/kik/l/ab;

    iget-object v1, p0, Lkik/android/i/j;->b:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/kik/l/ab;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/android/i/j;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lkik/android/i/j;->c:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Lkik/android/i/j;->i:Lkik/android/i/i;

    iget-object v2, v2, Lkik/android/i/i;->a:Lcom/kik/l/ab;

    iget-object v3, p0, Lkik/android/i/j;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/kik/l/ab;->a(Ljava/lang/String;Ljava/lang/String;)Z

    new-instance v2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v3

    const/16 v4, 0x9

    invoke-static {v2, v4}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v4

    const/16 v5, 0x12

    invoke-static {v2, v5}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v5

    const/16 v6, 0x13

    invoke-static {v2, v6}, Lkik/android/util/ct;->a(Landroid/media/MediaMetadataRetriever;I)I

    move-result v6

    iget-object v7, p0, Lkik/android/i/j;->i:Lkik/android/i/i;

    iget-object v7, v7, Lkik/android/i/i;->b:Lcom/kik/android/a;

    const-string v8, "Video Re-encoded"

    invoke-virtual {v7, v8}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v7

    const-string v8, "Original Width"

    iget v9, p0, Lkik/android/i/j;->e:I

    int-to-long v10, v9

    invoke-virtual {v7, v8, v10, v11}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v7

    const-string v8, "Original Height"

    iget v9, p0, Lkik/android/i/j;->f:I

    int-to-long v10, v9

    invoke-virtual {v7, v8, v10, v11}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v7

    const-string v8, "Original Bitrate"

    iget v9, p0, Lkik/android/i/j;->g:I

    int-to-long v10, v9

    invoke-virtual {v7, v8, v10, v11}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v7

    const-string v8, "Original Video Length"

    iget-wide v10, p0, Lkik/android/i/j;->h:J

    invoke-virtual {v7, v8, v10, v11}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v7

    const-string v8, "Original Video Size"

    new-instance v9, Ljava/io/File;

    iget-object v10, p0, Lkik/android/i/j;->b:Ljava/lang/String;

    invoke-direct {v9, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->length()J

    move-result-wide v10

    invoke-virtual {v7, v8, v10, v11}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v7

    const-string v8, "Width"

    int-to-long v10, v5

    invoke-virtual {v7, v8, v10, v11}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v5

    const-string v7, "Height"

    int-to-long v8, v6

    invoke-virtual {v5, v7, v8, v9}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v5

    const-string v6, "Bitrate"

    int-to-long v8, v3

    invoke-virtual {v5, v6, v8, v9}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v5, "Video Length"

    int-to-long v6, v4

    invoke-virtual {v3, v5, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Size"

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v6

    invoke-virtual {v3, v4, v6, v7}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v3

    const-string v4, "Encode Duration"

    invoke-virtual {v3, v4, v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    throw v0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 119
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lkik/android/i/j;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 121
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 126
    if-nez p1, :cond_0

    const-string v0, "unknown"

    .line 127
    :goto_0
    iget-object v1, p0, Lkik/android/i/j;->i:Lkik/android/i/i;

    iget-object v1, v1, Lkik/android/i/i;->b:Lcom/kik/android/a;

    const-string v2, "Video Re-encoding Failed"

    invoke-virtual {v1, v2}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Reason"

    invoke-virtual {v1, v2, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 130
    return-void

    .line 126
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
