.class public final Lcom/roidapp/cloudlib/sns/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/bumptech/glide/load/b/b/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/cloudlib/sns/c;->a:Lcom/bumptech/glide/load/b/b/s;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    .prologue
    .line 17
    if-eqz p0, :cond_1

    .line 18
    new-instance v1, Ljava/io/File;

    invoke-static {}, Lcom/roidapp/baselib/d/a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v2, "images"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 20
    sget-object v0, Lcom/roidapp/cloudlib/sns/c;->a:Lcom/bumptech/glide/load/b/b/s;

    if-nez v0, :cond_0

    new-instance v0, Lcom/bumptech/glide/load/b/b/s;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/b/s;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/sns/c;->a:Lcom/bumptech/glide/load/b/b/s;

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/roidapp/cloudlib/sns/c;->a:Lcom/bumptech/glide/load/b/b/s;

    new-instance v3, Lcom/bumptech/glide/h/c;

    invoke-direct {v3, p0}, Lcom/bumptech/glide/h/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/b/b/s;->a(Lcom/bumptech/glide/load/c;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ".0"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 22
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 25
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
