.class final Lkik/android/util/bz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/kik/android/a$f;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/kik/android/a$f;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lkik/android/util/bz;->a:Ljava/lang/String;

    iput-object p2, p0, Lkik/android/util/bz;->b:Lcom/kik/android/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 142
    const/16 v0, 0x10

    invoke-static {v0}, Lcom/kik/sdkutils/y;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 146
    :try_start_0
    iget-object v1, p0, Lkik/android/util/bz;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 148
    iget-object v1, p0, Lkik/android/util/bz;->b:Lcom/kik/android/a$f;

    const-string v2, "Width"

    const/16 v3, 0x12

    invoke-static {v0, v3}, Lkik/android/util/ct;->b(Landroid/media/MediaMetadataRetriever;I)J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Height"

    const/16 v3, 0x13

    invoke-static {v0, v3}, Lkik/android/util/ct;->b(Landroid/media/MediaMetadataRetriever;I)J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Bitrate"

    const/16 v3, 0x14

    invoke-static {v0, v3}, Lkik/android/util/ct;->b(Landroid/media/MediaMetadataRetriever;I)J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;J)Lcom/kik/android/a$f;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    :goto_0
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 158
    :cond_0
    iget-object v0, p0, Lkik/android/util/bz;->b:Lcom/kik/android/a$f;

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 159
    return-void

    :catch_0
    move-exception v1

    goto :goto_0
.end method
