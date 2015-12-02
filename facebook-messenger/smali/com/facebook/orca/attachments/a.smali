.class public Lcom/facebook/orca/attachments/a;
.super Ljava/lang/Object;
.source "AttachmentDataFactory.java"


# static fields
.field private static final a:Ljava/util/regex/Pattern;

.field private static final b:Ljava/util/regex/Pattern;


# instance fields
.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/content/Context;

.field private final f:Lcom/facebook/orca/j/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    const-string v0, "_[ts]\\.jpg$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/attachments/a;->a:Ljava/util/regex/Pattern;

    .line 47
    const-string v0, "\\/[ts]([^/]+\\.jpg)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/attachments/a;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Landroid/content/Context;Lcom/facebook/orca/j/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/facebook/orca/j/c;",
            ")V"
        }
    .end annotation

    .prologue
    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/facebook/orca/attachments/a;->c:Ljavax/inject/a;

    .line 62
    iput-object p2, p0, Lcom/facebook/orca/attachments/a;->d:Ljavax/inject/a;

    .line 63
    iput-object p3, p0, Lcom/facebook/orca/attachments/a;->e:Landroid/content/Context;

    .line 64
    iput-object p4, p0, Lcom/facebook/orca/attachments/a;->f:Lcom/facebook/orca/j/c;

    .line 65
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Landroid/net/Uri;
    .locals 3
    .param p2    # Lcom/facebook/messages/model/threads/TitanAttachmentInfo;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 375
    iget-object v0, p0, Lcom/facebook/orca/attachments/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->a()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 376
    const-string v1, "method/messaging.getAttachment"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 377
    const-string v1, "mid"

    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 378
    if-eqz p2, :cond_0

    .line 379
    const-string v1, "aid"

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 384
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->a(Landroid/net/Uri$Builder;)V

    .line 385
    const-string v1, "format"

    const-string v2, "binary"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 386
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    .line 382
    :cond_0
    const-string v1, "aid"

    const-string v2, "1"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Lcom/facebook/orca/attachments/ImageAttachmentData;
    .locals 4
    .param p2    # Lcom/facebook/messages/model/threads/TitanAttachmentInfo;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 313
    const/4 v1, 0x0

    .line 314
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 317
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 318
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v2

    sget-object v3, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v2, v3, :cond_1

    .line 319
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    .line 323
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, p2}, Lcom/facebook/orca/attachments/a;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Landroid/net/Uri;

    move-result-object v1

    .line 324
    new-instance v2, Lcom/facebook/orca/attachments/g;

    invoke-direct {v2}, Lcom/facebook/orca/attachments/g;-><init>()V

    invoke-virtual {v2, v1}, Lcom/facebook/orca/attachments/g;->b(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/orca/attachments/g;->a(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/g;->c(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    .line 329
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 330
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->f()Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v1

    .line 331
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;->a()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/attachments/g;->a(I)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/g;->b(I)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/g;->a(Ljava/lang/String;)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    .line 336
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/attachments/g;->g()Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method private a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/attachments/ImageAttachmentData;
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    .line 265
    .line 268
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "file"

    invoke-static {v0, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 271
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 272
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    .line 273
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 277
    :goto_0
    if-nez v0, :cond_0

    .line 278
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 279
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 280
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    .line 284
    :cond_0
    if-nez v0, :cond_2

    move-object v0, v1

    .line 292
    :goto_1
    return-object v0

    .line 289
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v0

    .line 292
    :cond_2
    new-instance v1, Lcom/facebook/orca/attachments/g;

    invoke-direct {v1}, Lcom/facebook/orca/attachments/g;-><init>()V

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/g;->a(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/attachments/g;->b(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/g;->a(I)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/g;->b(I)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/g;->g()Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v1

    goto :goto_0
.end method

.method private a(Landroid/net/Uri$Builder;)V
    .locals 2

    .prologue
    .line 405
    iget-object v0, p0, Lcom/facebook/orca/attachments/a;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 406
    if-eqz v0, :cond_0

    .line 407
    const-string v1, "access_token"

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 409
    :cond_0
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Z
    .locals 2

    .prologue
    .line 439
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d()Ljava/lang/String;

    move-result-object v0

    .line 440
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c()Ljava/lang/String;

    move-result-object v1

    .line 441
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/attachments/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, v1}, Lcom/facebook/orca/attachments/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 457
    if-eqz p1, :cond_0

    const-string v0, "image/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    const/4 v0, 0x1

    .line 460
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 472
    if-eqz p2, :cond_0

    const-string v0, "audio/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "audioclip-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 474
    const/4 v0, 0x1

    .line 476
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Lcom/facebook/orca/attachments/AudioAttachmentData;
    .locals 4

    .prologue
    .line 342
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/attachments/a;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Landroid/net/Uri;

    move-result-object v0

    .line 343
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/orca/d/d;->a(Ljava/lang/String;)J

    move-result-wide v1

    .line 344
    new-instance v3, Lcom/facebook/orca/attachments/AudioAttachmentData;

    invoke-direct {v3, v1, v2, v0}, Lcom/facebook/orca/attachments/AudioAttachmentData;-><init>(JLandroid/net/Uri;)V

    return-object v3
.end method

.method private b(Lcom/facebook/messages/model/share/ShareMedia;)Lcom/facebook/orca/attachments/ImageAttachmentData;
    .locals 3

    .prologue
    .line 301
    invoke-direct {p0, p1}, Lcom/facebook/orca/attachments/a;->c(Lcom/facebook/messages/model/share/ShareMedia;)Landroid/net/Uri;

    move-result-object v0

    .line 302
    invoke-direct {p0, p1}, Lcom/facebook/orca/attachments/a;->d(Lcom/facebook/messages/model/share/ShareMedia;)Landroid/net/Uri;

    move-result-object v1

    .line 303
    new-instance v2, Lcom/facebook/orca/attachments/g;

    invoke-direct {v2}, Lcom/facebook/orca/attachments/g;-><init>()V

    invoke-virtual {v2, v0}, Lcom/facebook/orca/attachments/g;->a(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/g;->b(Landroid/net/Uri;)Lcom/facebook/orca/attachments/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/g;->g()Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    return-object v0
.end method

.method private b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/attachments/OtherAttachmentData;
    .locals 5

    .prologue
    .line 360
    iget-object v0, p0, Lcom/facebook/orca/attachments/a;->f:Lcom/facebook/orca/j/c;

    const-string v1, "mms_media"

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/File;

    move-result-object v0

    .line 364
    iget-object v1, p0, Lcom/facebook/orca/attachments/a;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v1

    .line 365
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 366
    invoke-static {v1, v2}, Lcom/google/common/b/a;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 367
    new-instance v1, Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/google/common/c/a;->a(J)I

    move-result v3

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/facebook/orca/attachments/OtherAttachmentData;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/net/Uri;)V

    return-object v1
.end method

.method private b(Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Z
    .locals 2

    .prologue
    .line 464
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d()Ljava/lang/String;

    move-result-object v0

    .line 465
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c()Ljava/lang/String;

    move-result-object v1

    .line 466
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/attachments/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(Lcom/facebook/messages/model/share/ShareMedia;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 412
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMedia;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Lcom/facebook/orca/attachments/OtherAttachmentData;
    .locals 5

    .prologue
    .line 349
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/facebook/orca/attachments/a;->a(Ljava/lang/String;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Landroid/net/Uri;

    move-result-object v0

    .line 350
    new-instance v1, Lcom/facebook/orca/attachments/OtherAttachmentData;

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->e()I

    move-result v3

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/facebook/orca/attachments/OtherAttachmentData;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/net/Uri;)V

    return-object v1
.end method

.method private c(Lcom/facebook/ui/media/attachments/MediaResource;)Z
    .locals 1

    .prologue
    .line 452
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->e()Ljava/lang/String;

    move-result-object v0

    .line 453
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(Lcom/facebook/messages/model/share/ShareMedia;)Landroid/net/Uri;
    .locals 3

    .prologue
    .line 417
    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMedia;->d()Ljava/lang/String;

    move-result-object v0

    .line 418
    sget-object v1, Lcom/facebook/orca/attachments/a;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 419
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 420
    const-string v0, "_n.jpg"

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 424
    :cond_0
    sget-object v1, Lcom/facebook/orca/attachments/a;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 425
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 426
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 429
    :cond_1
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Landroid/net/Uri;
    .locals 3

    .prologue
    .line 390
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 391
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->s()Landroid/net/Uri;

    move-result-object v0

    .line 399
    :goto_0
    return-object v0

    .line 393
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/attachments/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/c/i;

    invoke-interface {v0}, Lcom/facebook/http/c/i;->a()Landroid/net/Uri$Builder;

    move-result-object v0

    .line 394
    const-string v1, "method/messaging.getAttachment"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 395
    const-string v1, "tid"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 396
    const-string v1, "hash"

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 397
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->a(Landroid/net/Uri$Builder;)V

    .line 398
    const-string v1, "format"

    const-string v2, "binary"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 399
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/facebook/messages/model/share/ShareMedia;)Lcom/facebook/orca/attachments/ImageAttachmentData;
    .locals 2

    .prologue
    .line 258
    const-string v0, "photo"

    invoke-virtual {p1}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    invoke-direct {p0, p1}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/messages/model/share/ShareMedia;)Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    .line 261
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 68
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    move v0, v1

    .line 110
    :goto_0
    return v0

    .line 72
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->q()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    .line 77
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    .line 81
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c()Ljava/lang/String;

    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    const-string v4, "image/"

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 83
    goto :goto_0

    .line 87
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 88
    sget-object v4, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/facebook/ui/media/attachments/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v1

    .line 89
    goto :goto_0

    .line 93
    :cond_5
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 94
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 95
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    sget-object v4, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v0, v4, :cond_6

    move v0, v1

    .line 96
    goto/16 :goto_0

    :cond_7
    move v0, v2

    .line 110
    goto/16 :goto_0
.end method

.method public b(Lcom/facebook/messages/model/threads/Message;)Lcom/google/common/a/es;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/attachments/ImageAttachmentData;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 114
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    .line 115
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    .line 169
    :goto_0
    return-object v0

    .line 118
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->q()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 123
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 126
    :cond_1
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 129
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 130
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v0, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 131
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v4

    .line 132
    if-nez v4, :cond_4

    .line 136
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v0

    move-object v2, v0

    .line 143
    :cond_2
    :goto_2
    if-nez v1, :cond_7

    .line 144
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    .line 145
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;->c()Ljava/lang/String;

    move-result-object v3

    .line 146
    if-eqz v3, :cond_3

    const-string v4, "image/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 147
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_3

    .line 139
    :cond_4
    const/4 v0, 0x1

    .line 140
    invoke-virtual {v2, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 151
    :cond_5
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 152
    sget-object v3, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/ui/media/attachments/g;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 153
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/attachments/ImageAttachmentData;

    move-result-object v0

    .line 154
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_4

    .line 169
    :cond_7
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto/16 :goto_0

    :cond_8
    move v1, v0

    goto :goto_2
.end method

.method public c(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 173
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v1

    .line 174
    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    .line 178
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v1, v0}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Z

    move-result v0

    goto :goto_0
.end method

.method public d(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 182
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    .line 183
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-eq v3, v1, :cond_0

    .line 186
    :goto_0
    return v2

    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    sget-object v3, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_1
    move v2, v0

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method public e(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/attachments/AudioAttachmentData;
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 190
    invoke-virtual {p0, p1}, Lcom/facebook/orca/attachments/a;->c(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Lcom/facebook/orca/attachments/AudioAttachmentData;

    move-result-object v0

    .line 196
    :goto_0
    return-object v0

    .line 192
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/orca/attachments/a;->d(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 194
    new-instance v1, Lcom/facebook/orca/attachments/AudioAttachmentData;

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->g()J

    move-result-wide v3

    invoke-direct {v1, v3, v4, v2}, Lcom/facebook/orca/attachments/AudioAttachmentData;-><init>(JLandroid/net/Uri;)V

    move-object v0, v1

    goto :goto_0

    :cond_1
    move-object v0, v2

    .line 196
    goto :goto_0
.end method

.method public f(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 207
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 224
    :goto_0
    return v0

    .line 212
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    .line 213
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    .line 214
    goto :goto_0

    .line 218
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 219
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->c(Lcom/facebook/ui/media/attachments/MediaResource;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    .line 220
    goto :goto_0

    :cond_4
    move v0, v1

    .line 224
    goto :goto_0
.end method

.method public g(Lcom/facebook/messages/model/threads/Message;)Lcom/google/common/a/es;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/attachments/OtherAttachmentData;",
            ">;"
        }
    .end annotation

    .prologue
    .line 233
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 254
    :goto_0
    return-object v0

    .line 238
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 239
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->p()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo;

    .line 240
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 241
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/attachments/a;->c(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/TitanAttachmentInfo;)Lcom/facebook/orca/attachments/OtherAttachmentData;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 245
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->o()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 246
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->c(Lcom/facebook/ui/media/attachments/MediaResource;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 248
    :try_start_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/attachments/a;->b(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/attachments/OtherAttachmentData;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 249
    :catch_0
    move-exception v0

    goto :goto_2

    .line 254
    :cond_4
    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method
