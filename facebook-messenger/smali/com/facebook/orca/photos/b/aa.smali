.class public Lcom/facebook/orca/photos/b/aa;
.super Ljava/lang/Object;
.source "PhotoUploadServiceHandlerLogger.java"


# instance fields
.field private final a:Lcom/facebook/analytics/av;

.field private final b:Lcom/facebook/common/e/h;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/j/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/common/base/Stopwatch;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/common/e/h;Ljavax/inject/a;Lcom/google/common/base/Stopwatch;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/common/e/h;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/j/a/a/a;",
            ">;",
            "Lcom/google/common/base/Stopwatch;",
            ")V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    .line 63
    iput-object p2, p0, Lcom/facebook/orca/photos/b/aa;->b:Lcom/facebook/common/e/h;

    .line 64
    iput-object p3, p0, Lcom/facebook/orca/photos/b/aa;->c:Ljavax/inject/a;

    .line 65
    iput-object p4, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    .line 66
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;
    .locals 4

    .prologue
    .line 204
    new-instance v0, Lcom/facebook/analytics/cb;

    invoke-direct {v0, p1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 205
    const-string v1, "compose"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 206
    invoke-virtual {p2}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v1

    .line 207
    invoke-direct {p0, v1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 208
    const-string v3, "uuid"

    invoke-virtual {v0, v3, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 209
    const-string v3, "offline_threading_id"

    invoke-virtual {v0, v3, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 210
    const-string v2, "attachment_id"

    invoke-virtual {v0, v2, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 211
    return-object v0
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 216
    const/4 v0, 0x0

    const/16 v1, 0x5f

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 2

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->c:Ljavax/inject/a;

    instance-of v0, v0, Lcom/facebook/orca/photos/b/f;

    if-nez v0, :cond_0

    .line 235
    :goto_0
    return-void

    .line 232
    :cond_0
    const-string v1, "native_resizer"

    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->c:Ljavax/inject/a;

    check-cast v0, Lcom/facebook/orca/photos/b/f;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/b/f;->f()Z

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Z)Lcom/facebook/analytics/cb;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 5

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->reset()Lcom/google/common/base/Stopwatch;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->start()Lcom/google/common/base/Stopwatch;

    .line 75
    const-string v0, "media_upload_unpublished_start"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 77
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 78
    const-string v2, "upload_size"

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 79
    iget-object v1, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 80
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;Lcom/facebook/orca/photos/b/e;Lcom/facebook/j/a/a/c;Ljava/io/File;)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 142
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->stop()Lcom/google/common/base/Stopwatch;

    .line 143
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 144
    new-instance v1, Lcom/facebook/nativejpeg/b;

    invoke-direct {v1}, Lcom/facebook/nativejpeg/b;-><init>()V

    .line 145
    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/facebook/nativejpeg/b;->inJustDecodeBounds:Z

    .line 146
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/lang/String;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;

    .line 148
    const-string v2, "media_upload_resize_end"

    invoke-direct {p0, v2, p1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;

    move-result-object v2

    .line 150
    const-string v3, "original_size"

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 151
    const-string v0, "resized_size"

    invoke-virtual {p4}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v3, 0x32

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 153
    invoke-virtual {p2}, Lcom/facebook/orca/photos/b/e;->a()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p2}, Lcom/facebook/orca/photos/b/e;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    const-string v3, "requested_dims"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 155
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 156
    iget v3, v1, Lcom/facebook/nativejpeg/b;->outWidth:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "x"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v1, v1, Lcom/facebook/nativejpeg/b;->outHeight:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    const-string v1, "original_dims"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 158
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 159
    invoke-virtual {p3}, Lcom/facebook/j/a/a/c;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "x"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p3}, Lcom/facebook/j/a/a/c;->b()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 163
    const-string v1, "resized_dims"

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 164
    const-string v0, "resized_quality"

    invoke-virtual {p3}, Lcom/facebook/j/a/a/c;->c()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 165
    const-string v0, "elapsed_time"

    iget-object v1, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v1}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v3

    invoke-virtual {v2, v0, v3, v4}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 166
    invoke-direct {p0, v2}, Lcom/facebook/orca/photos/b/aa;->a(Lcom/facebook/analytics/cb;)V

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 168
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/Exception;I)V
    .locals 4

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->stop()Lcom/google/common/base/Stopwatch;

    .line 109
    const-string v0, "media_upload_unpublished_failure"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 111
    const-string v1, "elapsed_time"

    iget-object v2, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v2}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 112
    const-string v1, "retry_count"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    .line 113
    const-string v1, "exception_info"

    invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 114
    iget-object v1, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 115
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 89
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->stop()Lcom/google/common/base/Stopwatch;

    .line 90
    const-string v0, "media_upload_unpublished_end"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 92
    const-string v1, "elapsed_time"

    iget-object v2, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v2}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 93
    const-string v1, "unpublished_fbid"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 94
    iget-object v1, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 95
    return-void
.end method

.method public a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->stop()Lcom/google/common/base/Stopwatch;

    .line 179
    const-string v0, "media_upload_resize_end"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;

    move-result-object v1

    .line 181
    const-string v0, "elapsed_time"

    iget-object v2, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v2}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 182
    instance-of v0, p2, Ljava/lang/Error;

    if-eqz v0, :cond_0

    .line 183
    const-string v2, "exception_info"

    move-object v0, p2

    check-cast v0, Ljava/lang/Error;

    invoke-virtual {v0}, Ljava/lang/Error;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 187
    :goto_0
    const-string v0, "elapsed_time"

    iget-object v2, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v2}, Lcom/google/common/base/Stopwatch;->elapsedMillis()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    .line 188
    invoke-direct {p0, v1}, Lcom/facebook/orca/photos/b/aa;->a(Lcom/facebook/analytics/cb;)V

    .line 189
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 192
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->b:Lcom/facebook/common/e/h;

    const-string v1, "orca_upload_resize_failure"

    invoke-interface {v0, v1, p2}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 193
    return-void

    .line 185
    :cond_0
    const-string v2, "exception_info"

    move-object v0, p2

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto :goto_0
.end method

.method public b(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 2

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->d:Lcom/google/common/base/Stopwatch;

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->reset()Lcom/google/common/base/Stopwatch;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Stopwatch;->start()Lcom/google/common/base/Stopwatch;

    .line 124
    const-string v0, "media_upload_resize_start"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 126
    iget-object v1, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 127
    return-void
.end method

.method public c(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 2

    .prologue
    .line 196
    const-string v0, "media_upload_resize_delete"

    invoke-direct {p0, v0, p1}, Lcom/facebook/orca/photos/b/aa;->a(Ljava/lang/String;Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 198
    iget-object v1, p0, Lcom/facebook/orca/photos/b/aa;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 199
    return-void
.end method

.method public d(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 3

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/orca/photos/b/aa;->b:Lcom/facebook/common/e/h;

    const-string v1, "orca_upload_rename_failure"

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/e/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    return-void
.end method
