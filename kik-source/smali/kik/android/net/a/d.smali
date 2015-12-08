.class final Lkik/android/net/a/d;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/net/a/c;


# direct methods
.method constructor <init>(Lkik/android/net/a/c;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 186
    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->a(Lkik/android/net/a/c;)Z

    .line 187
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 175
    check-cast p1, Ljava/io/File;

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    sget v1, Lkik/android/net/a/c$a;->c:I

    invoke-static {v0, v1}, Lkik/android/net/a/c;->a(Lkik/android/net/a/c;I)I

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0, p1}, Lkik/android/net/a/c;->a(Lkik/android/net/a/c;Ljava/io/File;)Ljava/io/File;

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    iget-object v1, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v1}, Lkik/android/net/a/c;->b(Lkik/android/net/a/c;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/net/a/c;->a(Lkik/android/net/a/c;Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->c(Lkik/android/net/a/c;)Lkik/a/d/a/a;

    move-result-object v0

    iget-object v1, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v1}, Lkik/android/net/a/c;->b(Lkik/android/net/a/c;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/io/File;)V

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->d(Lkik/android/net/a/c;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    iget-object v2, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v2}, Lkik/android/net/a/c;->b(Lkik/android/net/a/c;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/a/d/a/a;->a(Ljava/io/File;)V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->b(Lkik/android/net/a/c;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/ct;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkik/android/util/r;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x50

    invoke-static {v0, v1, v2}, Lcom/kik/m/k;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v1

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->c(Lkik/android/net/a/c;)Lkik/a/d/a/a;

    move-result-object v0

    const-string v2, "preview"

    new-instance v3, Lkik/a/d/d;

    invoke-direct {v3, v1}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v0, v2, v3}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->d(Lkik/android/net/a/c;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    const-string v3, "preview"

    new-instance v4, Lkik/a/d/d;

    invoke-direct {v4, v1}, Lkik/a/d/d;-><init>([B)V

    invoke-virtual {v0, v3, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;Lkik/a/d/o;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Thumbnail regeneration failed after transcoding"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->c(Lkik/android/net/a/c;)Lkik/a/d/a/a;

    move-result-object v0

    invoke-virtual {v0, v5}, Lkik/a/d/a/a;->a(Z)V

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->d(Lkik/android/net/a/c;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    invoke-virtual {v0, v5}, Lkik/a/d/a/a;->a(Z)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->e(Lkik/android/net/a/c;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    iget-object v1, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-virtual {v0, v1}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    :cond_3
    :goto_3
    return-void

    :cond_4
    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->e(Lkik/android/net/a/c;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-virtual {v0}, Lkik/android/net/a/c;->i()V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-static {v0}, Lkik/android/net/a/c;->e(Lkik/android/net/a/c;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    invoke-virtual {v0}, Lkik/android/net/a/c;->j()V

    goto :goto_3
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 180
    iget-object v0, p0, Lkik/android/net/a/d;->a:Lkik/android/net/a/c;

    sget v1, Lkik/android/net/a/c$a;->a:I

    invoke-static {v0, v1}, Lkik/android/net/a/c;->a(Lkik/android/net/a/c;I)I

    .line 181
    return-void
.end method
