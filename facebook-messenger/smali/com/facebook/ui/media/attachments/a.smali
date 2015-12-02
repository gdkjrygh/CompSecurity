.class public Lcom/facebook/ui/media/attachments/a;
.super Ljava/lang/Object;
.source "MediaAttachment.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/ui/media/attachments/MediaResource;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-class v0, Lcom/facebook/ui/media/attachments/a;

    iput-object v0, p0, Lcom/facebook/ui/media/attachments/a;->a:Ljava/lang/Class;

    .line 31
    iput-object p1, p0, Lcom/facebook/ui/media/attachments/a;->b:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/facebook/ui/media/attachments/a;->c:Lcom/facebook/ui/media/attachments/MediaResource;

    .line 33
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/a;->c:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 34
    const-string v1, "content"

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "file"

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 35
    return-void

    .line 34
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/a;->c:Lcom/facebook/ui/media/attachments/MediaResource;

    return-object v0
.end method

.method public b()Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/a;->c:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 55
    const-string v1, "content"

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 56
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    .line 58
    :goto_0
    return-object v0

    .line 57
    :cond_0
    const-string v1, "file"

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 58
    new-instance v0, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 60
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected scheme"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()Lcom/google/common/b/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/b/i",
            "<+",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/a;->c:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 71
    const-string v1, "content"

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 72
    new-instance v0, Lcom/facebook/ui/media/attachments/b;

    invoke-direct {v0, p0}, Lcom/facebook/ui/media/attachments/b;-><init>(Lcom/facebook/ui/media/attachments/a;)V

    .line 79
    :goto_0
    return-object v0

    .line 78
    :cond_0
    const-string v1, "file"

    invoke-static {v1, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/facebook/ui/media/attachments/a;->a()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/google/common/b/f;->a(Ljava/io/File;)Lcom/google/common/b/i;

    move-result-object v0

    goto :goto_0

    .line 81
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Unexpected scheme"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .prologue
    .line 92
    sget-object v0, Lcom/facebook/ui/media/attachments/c;->a:[I

    iget-object v1, p0, Lcom/facebook/ui/media/attachments/a;->c:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ui/media/attachments/g;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 104
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/a;->a:Ljava/lang/Class;

    const-string v1, "Unexpected attachment type"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 105
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Unexpected attachment type"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :pswitch_0
    const-string v0, "me/photos"

    .line 97
    :goto_0
    return-object v0

    :pswitch_1
    const-string v0, "me/videos"

    goto :goto_0

    .line 100
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/ui/media/attachments/a;->a:Ljava/lang/Class;

    const-string v1, "Audio shares are not implemented"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 101
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Audio shares are not implemented"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
