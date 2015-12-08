.class public final Lcom/roidapp/videolib/b/a/a/a;
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
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/roidapp/videolib/b/a/a/a;->a:Landroid/content/Context;

    .line 28
    iput-object p2, p0, Lcom/roidapp/videolib/b/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    .line 29
    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/videolib/b/a/b;)Ljava/util/List;
    .locals 8
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
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/videolib/b/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 37
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/roidapp/videolib/b/a/b;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 39
    iget-object v3, p0, Lcom/roidapp/videolib/b/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v3, v3, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    .line 45
    new-instance v4, Ljp/co/cyberagent/android/a/ab;

    invoke-direct {v4}, Ljp/co/cyberagent/android/a/ab;-><init>()V

    .line 47
    iget-object v5, p0, Lcom/roidapp/videolib/b/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v6, p0, Lcom/roidapp/videolib/b/a/a/a;->a:Landroid/content/Context;

    const-string v7, "screen"

    invoke-virtual {v3, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v5

    .line 48
    invoke-static {v5, v2, v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 49
    invoke-virtual {v4, v0}, Ljp/co/cyberagent/android/a/ab;->a(Landroid/graphics/Bitmap;)V

    .line 52
    new-instance v0, Ljp/co/cyberagent/android/a/ag;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/ag;-><init>()V

    .line 54
    iget-object v2, p0, Lcom/roidapp/videolib/b/a/a/a;->b:Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget-object v5, p0, Lcom/roidapp/videolib/b/a/a/a;->a:Landroid/content/Context;

    const-string v6, "acv"

    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v5, v3}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    .line 55
    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/a/ag;->a(Ljava/io/InputStream;)V

    .line 66
    new-instance v2, Ljp/co/cyberagent/android/a/h;

    invoke-direct {v2}, Ljp/co/cyberagent/android/a/h;-><init>()V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    return-object v1
.end method
