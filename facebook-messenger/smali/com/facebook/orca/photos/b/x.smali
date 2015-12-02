.class public Lcom/facebook/orca/photos/b/x;
.super Ljava/lang/Object;
.source "PhotoUploadServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private final c:Lcom/facebook/http/protocol/i;

.field private final d:Lcom/facebook/orca/protocol/methods/ab;

.field private final e:Lcom/facebook/common/time/a;

.field private final f:Lcom/facebook/orca/photos/b/h;

.field private final g:Lcom/facebook/orca/j/c;

.field private final h:Lcom/facebook/ui/media/b/a;

.field private final i:Lcom/facebook/common/executors/a;

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/j/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/facebook/orca/photos/b/a;

.field private final l:Lcom/facebook/orca/photos/b/aa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/orca/photos/b/x;

    sput-object v0, Lcom/facebook/orca/photos/b/x;->a:Ljava/lang/Class;

    .line 42
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/photos/b/x;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/http/protocol/i;Lcom/facebook/orca/protocol/methods/ab;Lcom/facebook/orca/j/c;Lcom/facebook/ui/media/b/a;Lcom/facebook/common/time/a;Lcom/facebook/orca/photos/b/h;Lcom/facebook/common/executors/a;Ljavax/inject/a;Lcom/facebook/orca/photos/b/a;Lcom/facebook/orca/photos/b/aa;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/protocol/i;",
            "Lcom/facebook/orca/protocol/methods/ab;",
            "Lcom/facebook/orca/j/c;",
            "Lcom/facebook/ui/media/b/a;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/orca/photos/b/h;",
            "Lcom/facebook/common/executors/a;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/j/a/a/a;",
            ">;",
            "Lcom/facebook/orca/photos/b/a;",
            "Lcom/facebook/orca/photos/b/aa;",
            ")V"
        }
    .end annotation

    .prologue
    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/facebook/orca/photos/b/x;->c:Lcom/facebook/http/protocol/i;

    .line 69
    iput-object p2, p0, Lcom/facebook/orca/photos/b/x;->d:Lcom/facebook/orca/protocol/methods/ab;

    .line 70
    iput-object p3, p0, Lcom/facebook/orca/photos/b/x;->g:Lcom/facebook/orca/j/c;

    .line 71
    iput-object p4, p0, Lcom/facebook/orca/photos/b/x;->h:Lcom/facebook/ui/media/b/a;

    .line 72
    iput-object p5, p0, Lcom/facebook/orca/photos/b/x;->e:Lcom/facebook/common/time/a;

    .line 73
    iput-object p6, p0, Lcom/facebook/orca/photos/b/x;->f:Lcom/facebook/orca/photos/b/h;

    .line 74
    iput-object p7, p0, Lcom/facebook/orca/photos/b/x;->i:Lcom/facebook/common/executors/a;

    .line 75
    iput-object p8, p0, Lcom/facebook/orca/photos/b/x;->j:Ljavax/inject/a;

    .line 76
    iput-object p9, p0, Lcom/facebook/orca/photos/b/x;->k:Lcom/facebook/orca/photos/b/a;

    .line 77
    iput-object p10, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    .line 78
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/photos/b/x;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->e:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method private a(Lcom/facebook/ui/media/attachments/MediaResource;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 136
    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v1

    .line 137
    if-nez v1, :cond_1

    .line 138
    sget-object v0, Lcom/facebook/orca/photos/b/x;->b:Lcom/facebook/debug/log/l;

    sget-object v1, Lcom/facebook/orca/photos/b/x;->a:Ljava/lang/Class;

    const-string v2, "A mediaResource didn\'t have a filename"

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 199
    :cond_0
    :goto_0
    return-void

    .line 141
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->g:Lcom/facebook/orca/j/c;

    invoke-virtual {v0, v1, v6}, Lcom/facebook/orca/j/c;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 143
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_2

    .line 146
    new-instance v2, Lcom/facebook/nativejpeg/b;

    invoke-direct {v2}, Lcom/facebook/nativejpeg/b;-><init>()V

    .line 147
    iput-boolean v6, v2, Lcom/facebook/nativejpeg/b;->inJustDecodeBounds:Z

    .line 148
    invoke-static {v1, v2}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/lang/String;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;

    .line 149
    iget v3, v2, Lcom/facebook/nativejpeg/b;->outWidth:I

    if-eqz v3, :cond_2

    iget v2, v2, Lcom/facebook/nativejpeg/b;->outHeight:I

    if-nez v2, :cond_0

    .line 157
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/photos/b/aa;->c(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 161
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/photos/b/aa;->b(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->g:Lcom/facebook/orca/j/c;

    const-string v2, "resize_"

    const-string v3, ".jpg"

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/io/File;

    move-result-object v2

    .line 165
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->k:Lcom/facebook/orca/photos/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/b/a;->a()Lcom/facebook/orca/photos/b/e;

    move-result-object v3

    .line 167
    invoke-virtual {v3}, Lcom/facebook/orca/photos/b/e;->a()I

    move-result v0

    invoke-virtual {v3}, Lcom/facebook/orca/photos/b/e;->b()I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 168
    new-instance v4, Lcom/facebook/j/a/a/c;

    invoke-virtual {v3}, Lcom/facebook/orca/photos/b/e;->c()I

    move-result v5

    invoke-direct {v4, v0, v0, v5}, Lcom/facebook/j/a/a/c;-><init>(III)V

    .line 172
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/j/a/a/a;

    invoke-virtual {p1}, Lcom/facebook/ui/media/attachments/MediaResource;->d()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v5}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6, v4}, Lcom/facebook/j/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/j/a/a/c;)Lcom/facebook/j/a/a/c;

    move-result-object v0

    .line 177
    iget-object v4, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v4, p1, v3, v0, v2}, Lcom/facebook/orca/photos/b/aa;->a(Lcom/facebook/ui/media/attachments/MediaResource;Lcom/facebook/orca/photos/b/e;Lcom/facebook/j/a/a/c;Ljava/io/File;)V

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->g:Lcom/facebook/orca/j/c;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v0

    .line 186
    invoke-virtual {v2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    .line 187
    if-nez v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/photos/b/aa;->d(Lcom/facebook/ui/media/attachments/MediaResource;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 190
    :catch_0
    move-exception v0

    .line 192
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 194
    iget-object v1, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v1, p1, v0}, Lcom/facebook/orca/photos/b/aa;->a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/Throwable;)V

    .line 196
    const-class v1, Ljava/lang/Exception;

    invoke-static {v0, v1}, Lcom/google/common/base/Throwables;->propagateIfPossible(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 197
    invoke-static {v0}, Lcom/google/common/base/Throwables;->propagate(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0
.end method

.method private b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 91
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 92
    const-string v2, "mediaResource"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 93
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v2

    sget-object v3, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-eq v2, v3, :cond_0

    .line 94
    sget-object v0, Lcom/facebook/fbservice/service/t;->OTHER:Lcom/facebook/fbservice/service/t;

    const-string v1, "MediaResource is not a photo."

    invoke-static {v0, v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 132
    :goto_0
    return-object v0

    .line 97
    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/photos/b/x;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 99
    new-instance v4, Lcom/facebook/http/protocol/l;

    invoke-direct {v4}, Lcom/facebook/http/protocol/l;-><init>()V

    .line 100
    new-instance v2, Lcom/facebook/orca/photos/b/z;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lcom/facebook/orca/photos/b/z;-><init>(Lcom/facebook/orca/photos/b/x;Lcom/facebook/ui/media/attachments/MediaResource;Lcom/facebook/orca/photos/b/y;)V

    invoke-virtual {v4, v2}, Lcom/facebook/http/protocol/l;->a(Lcom/facebook/http/protocol/h;)V

    move v2, v1

    move v3, v1

    .line 106
    :goto_1
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/photos/b/aa;->a(Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 107
    iget-object v1, p0, Lcom/facebook/orca/photos/b/x;->c:Lcom/facebook/http/protocol/i;

    iget-object v5, p0, Lcom/facebook/orca/photos/b/x;->d:Lcom/facebook/orca/protocol/methods/ab;

    new-instance v6, Lcom/facebook/orca/protocol/methods/ac;

    const/4 v7, 0x0

    invoke-direct {v6, v0, v7}, Lcom/facebook/orca/protocol/methods/ac;-><init>(Lcom/facebook/ui/media/attachments/MediaResource;I)V

    invoke-interface {v1, v5, v6, v4}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;Lcom/facebook/http/protocol/l;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 111
    iget-object v5, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v5, v0, v1}, Lcom/facebook/orca/photos/b/aa;->a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    iget-object v2, p0, Lcom/facebook/orca/photos/b/x;->f:Lcom/facebook/orca/photos/b/h;

    new-instance v3, Lcom/facebook/orca/photos/b/w;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v4}, Lcom/facebook/orca/photos/b/w;-><init>(Lcom/facebook/ui/media/attachments/MediaResource;Z)V

    invoke-virtual {v2, v3}, Lcom/facebook/orca/photos/b/h;->a(Lcom/facebook/c/a/a;)V

    .line 132
    invoke-static {v1}, Lcom/facebook/fbservice/service/OperationResult;->a(Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 114
    :catch_0
    move-exception v1

    .line 115
    iget-object v5, p0, Lcom/facebook/orca/photos/b/x;->l:Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {v5, v0, v1, v3}, Lcom/facebook/orca/photos/b/aa;->a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/Exception;I)V

    .line 120
    const/4 v5, 0x5

    if-ge v3, v5, :cond_1

    .line 121
    add-int/lit8 v3, v3, 0x1

    .line 123
    int-to-long v1, v2

    int-to-long v5, v3

    const-wide/16 v7, 0x3e8

    mul-long/2addr v5, v7

    add-long/2addr v1, v5

    long-to-int v1, v1

    .line 124
    iget-object v2, p0, Lcom/facebook/orca/photos/b/x;->i:Lcom/facebook/common/executors/a;

    int-to-long v5, v1

    invoke-interface {v2, v5, v6}, Lcom/facebook/common/executors/a;->a(J)V

    move v2, v1

    .line 128
    goto :goto_1

    .line 126
    :cond_1
    throw v1
.end method

.method static synthetic b(Lcom/facebook/orca/photos/b/x;)Lcom/facebook/orca/photos/b/h;
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/photos/b/x;->f:Lcom/facebook/orca/photos/b/h;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 82
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 83
    sget-object v1, Lcom/facebook/orca/server/aq;->L:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 84
    invoke-direct {p0, p1}, Lcom/facebook/orca/photos/b/x;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 86
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
