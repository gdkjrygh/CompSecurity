.class final Lcom/roidapp/photogrid/filter/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/aq;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;)V
    .locals 0

    .prologue
    .line 807
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 816
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    mul-int v1, p1, p1

    invoke-static {v0, p1, v1}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 818
    return-object v0
.end method

.method public final a()[Ljava/lang/Integer;
    .locals 3

    .prologue
    .line 811
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 823
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 824
    const-string v1, "FILTER_OPTIMIZATION"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 2

    .prologue
    .line 829
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 834
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 839
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/d;->a:Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 840
    const-string v1, "WATER_MARK"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
