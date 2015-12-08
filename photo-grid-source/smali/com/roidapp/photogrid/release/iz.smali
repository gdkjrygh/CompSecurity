.class final Lcom/roidapp/photogrid/release/iz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;II)V
    .locals 0

    .prologue
    .line 1174
    iput-object p1, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    iput p2, p0, Lcom/roidapp/photogrid/release/iz;->a:I

    iput p3, p0, Lcom/roidapp/photogrid/release/iz;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/16 v7, 0x90

    const/4 v1, 0x0

    .line 1179
    move v2, v1

    .line 1180
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 1181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, v2

    iget v5, p0, Lcom/roidapp/photogrid/release/iz;->a:I

    iget v6, p0, Lcom/roidapp/photogrid/release/iz;->b:I

    invoke-virtual {v0, v3, v4, v5, v6}, Lcom/roidapp/photogrid/release/ic;->a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1182
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1184
    :cond_0
    const/4 v0, 0x1

    .line 1188
    :goto_1
    if-eqz v0, :cond_2

    .line 1189
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->G(Lcom/roidapp/photogrid/release/ImageEditor;)V

    .line 1190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v1, 0x90

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;I)I

    .line 1191
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1201
    :goto_2
    return-void

    .line 1180
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 1193
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1196
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1197
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->G(Lcom/roidapp/photogrid/release/ImageEditor;)V

    .line 1198
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0, v7}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;I)I

    .line 1199
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iz;->c:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_1
.end method
