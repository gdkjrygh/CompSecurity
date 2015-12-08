.class public final Lcom/roidapp/videolib/b/a/a/b;
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
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/roidapp/videolib/b/a/a/b;->a:Landroid/content/Context;

    .line 32
    iput-object p2, p0, Lcom/roidapp/videolib/b/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    .line 33
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/videolib/b/a/b;)Ljava/util/List;
    .locals 9
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
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    new-instance v2, Ljp/co/cyberagent/android/a/x;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/x;-><init>()V

    .line 39
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/videolib/b/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 40
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roidapp/videolib/b/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 42
    iget-object v4, p0, Lcom/roidapp/videolib/b/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v4, v4, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    .line 43
    iget-object v5, p0, Lcom/roidapp/videolib/b/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v6, p0, Lcom/roidapp/videolib/b/a/a/b;->a:Landroid/content/Context;

    const-string v7, "normal"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v5

    .line 44
    if-eqz v5, :cond_0

    .line 45
    invoke-static {v5, v3, v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 46
    invoke-virtual {v2, v5}, Ljp/co/cyberagent/android/a/x;->a(Landroid/graphics/Bitmap;)V

    .line 51
    :cond_0
    new-instance v5, Ljp/co/cyberagent/android/a/y;

    invoke-direct {v5}, Ljp/co/cyberagent/android/a/y;-><init>()V

    .line 52
    iget-object v6, p0, Lcom/roidapp/videolib/b/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v7, p0, Lcom/roidapp/videolib/b/a/a/b;->a:Landroid/content/Context;

    const-string v8, "overlay"

    invoke-virtual {v4, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    invoke-static {v6, v3, v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 55
    invoke-virtual {v5, v0}, Ljp/co/cyberagent/android/a/y;->a(Landroid/graphics/Bitmap;)V

    .line 59
    :cond_1
    new-instance v0, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 60
    iget-object v3, p0, Lcom/roidapp/videolib/b/a/a/b;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v6, p0, Lcom/roidapp/videolib/b/a/a/b;->a:Landroid/content/Context;

    const-string v7, "acv"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 61
    if-eqz v3, :cond_2

    invoke-virtual {v0, v3}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 62
    :cond_2
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    new-instance v3, Ljp/co/cyberagent/android/a/p;

    invoke-direct {v3}, Ljp/co/cyberagent/android/a/p;-><init>()V

    .line 65
    const-string v6, "hue"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    invoke-virtual {v3, v6}, Ljp/co/cyberagent/android/a/p;->a(F)V

    .line 67
    new-instance v6, Ljp/co/cyberagent/android/a/aa;

    invoke-direct {v6}, Ljp/co/cyberagent/android/a/aa;-><init>()V

    .line 68
    const-string v7, "saturation"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Lcom/roidapp/imagelib/filter/bi;->f(I)F

    move-result v4

    invoke-virtual {v6, v4}, Ljp/co/cyberagent/android/a/aa;->a(F)V

    .line 70
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    return-object v1
.end method
