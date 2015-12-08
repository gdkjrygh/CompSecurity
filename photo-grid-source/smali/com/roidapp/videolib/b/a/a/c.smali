.class public final Lcom/roidapp/videolib/b/a/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/b/a/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/roidapp/videolib/b/a/a/c;->a:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lcom/roidapp/videolib/b/a/a/c;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    .line 35
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/videolib/b/a/b;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/videolib/b/a/b;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation

    .prologue
    .line 39
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/videolib/b/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 41
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roidapp/videolib/b/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 43
    iget-object v0, p0, Lcom/roidapp/videolib/b/a/a/c;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v4, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    .line 44
    new-instance v5, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 45
    iget-object v0, p0, Lcom/roidapp/videolib/b/a/a/c;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v6, p0, Lcom/roidapp/videolib/b/a/a/c;->a:Landroid/content/Context;

    const-string v7, "screen"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    invoke-static {v0, v2, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 50
    invoke-virtual {v5, v6}, Ljp/co/cyberagent/android/a/ab;->a(Landroid/graphics/Bitmap;)V

    .line 54
    :cond_0
    new-instance v6, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v6}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 55
    if-eqz v0, :cond_1

    .line 56
    iget-object v0, p0, Lcom/roidapp/videolib/b/a/a/c;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v7, p0, Lcom/roidapp/videolib/b/a/a/c;->a:Landroid/content/Context;

    const-string v8, "acv"

    invoke-virtual {v4, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 57
    invoke-virtual {v6, v0}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 63
    :cond_1
    new-instance v7, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v7}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 64
    const-string v8, "saturation"

    invoke-virtual {v4, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v8

    invoke-virtual {v7, v8}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 71
    new-instance v8, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v8}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 72
    if-eqz v0, :cond_2

    .line 73
    iget-object v0, p0, Lcom/roidapp/videolib/b/a/a/c;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v9, p0, Lcom/roidapp/videolib/b/a/a/c;->a:Landroid/content/Context;

    const-string v10, "overlay"

    invoke-virtual {v4, v10}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v9, v10}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 75
    invoke-static {v0, v2, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 76
    invoke-virtual {v8, v0}, Ljp/co/cyberagent/android/a/y;->a(Landroid/graphics/Bitmap;)V

    .line 80
    :cond_2
    new-instance v0, Ljp/co/cyberagent/android/a/x;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/x;-><init>()V

    .line 81
    iget-object v9, p0, Lcom/roidapp/videolib/b/a/a/c;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v10, p0, Lcom/roidapp/videolib/b/a/a/c;->a:Landroid/content/Context;

    const-string v11, "normal"

    invoke-virtual {v4, v11}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v9, v10, v4}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    invoke-static {v4, v2, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 84
    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/a/x;->a(Landroid/graphics/Bitmap;)V

    .line 91
    :cond_3
    new-instance v2, Ljp/co/cyberagent/android/a/h;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/h;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    new-instance v2, Ljp/co/cyberagent/android/a/h;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/h;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    return-object v1
.end method
