.class final Lcom/roidapp/imagelib/filter/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/filter/aj;

.field private final b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 1024
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1020
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/filter/as;->c:I

    .line 1021
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/as;->d:Ljava/lang/String;

    .line 1025
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/as;->b:Ljava/lang/String;

    .line 1026
    iput p3, p0, Lcom/roidapp/imagelib/filter/as;->c:I

    .line 1027
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 1033
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/aj;->p:[Ljava/lang/Integer;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 1034
    const-string v0, "ImageEditGLESFragment"

    const-string v1, "genMinLengths length 0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1035
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/genMinLengths length 0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1036
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The load length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/as;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1069
    :goto_0
    return-void

    .line 1040
    :cond_0
    iget v0, p0, Lcom/roidapp/imagelib/filter/as;->c:I

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/aj;->p:[Ljava/lang/Integer;

    array-length v1, v1

    if-lt v0, v1, :cond_1

    .line 1041
    const-string v0, "ImageEditGLESFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1042
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1043
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/as;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 1047
    :cond_1
    const/4 v1, 0x0

    .line 1051
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v2, v2, Lcom/roidapp/imagelib/filter/aj;->p:[Ljava/lang/Integer;

    iget v3, p0, Lcom/roidapp/imagelib/filter/as;->c:I

    aget-object v2, v2, v3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v3, v3, Lcom/roidapp/imagelib/filter/aj;->p:[Ljava/lang/Integer;

    iget v4, p0, Lcom/roidapp/imagelib/filter/as;->c:I

    aget-object v3, v3, v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v4, v4, Lcom/roidapp/imagelib/filter/aj;->p:[Ljava/lang/Integer;

    iget v5, p0, Lcom/roidapp/imagelib/filter/as;->c:I

    aget-object v4, v4, v5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/2addr v3, v4

    invoke-static {v0, v2, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1055
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v0

    const/16 v2, 0x404

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1068
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 1056
    :catch_0
    move-exception v0

    .line 1057
    :try_start_1
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1058
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1059
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1060
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x403

    const/4 v2, 0x0

    iget v3, p0, Lcom/roidapp/imagelib/filter/as;->c:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v0, v1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 1061
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/aj;->g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1068
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1062
    :catch_1
    move-exception v0

    .line 1063
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1064
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1065
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/as;->a:Lcom/roidapp/imagelib/filter/aj;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/as;->d:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1068
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0
.end method
