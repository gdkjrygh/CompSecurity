.class final Lcom/roidapp/imagelib/a/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/i;

.field private b:I

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/a/i;I)V
    .locals 1

    .prologue
    .line 1078
    iput-object p1, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1074
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/imagelib/a/x;->b:I

    .line 1075
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/a/x;->c:Ljava/lang/String;

    .line 1079
    iput p2, p0, Lcom/roidapp/imagelib/a/x;->b:I

    .line 1080
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 1084
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->z(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    .line 1085
    array-length v1, v0

    if-nez v1, :cond_0

    .line 1086
    const-string v0, "CameraPreivewFragment"

    const-string v1, "genMinLengths_0"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1087
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/genMinLengths_0"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1088
    iget-object v0, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "The load length array is 0."

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/a/x;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1120
    :goto_0
    return-void

    .line 1092
    :cond_0
    iget v1, p0, Lcom/roidapp/imagelib/a/x;->b:I

    array-length v2, v0

    if-lt v1, v2, :cond_1

    .line 1093
    const-string v0, "CameraPreivewFragment"

    const-string v1, "final OOM !!!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1094
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "CameraPreivewFragment/SaveOOM"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1095
    iget-object v0, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/imagelib/a/x;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 1099
    :cond_1
    const/4 v1, 0x0

    .line 1103
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/a/i;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v2}, Lcom/roidapp/imagelib/a/i;->z(Lcom/roidapp/imagelib/a/i;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/imagelib/a/x;->b:I

    aget-object v3, v0, v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget v4, p0, Lcom/roidapp/imagelib/a/x;->b:I

    aget-object v4, v0, v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget v5, p0, Lcom/roidapp/imagelib/a/x;->b:I

    aget-object v0, v0, v5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/2addr v0, v4

    invoke-static {v2, v3, v0}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1107
    iget-object v0, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1119
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_0

    .line 1108
    :catch_0
    move-exception v0

    .line 1109
    :try_start_1
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1110
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1111
    iget-object v0, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 1112
    iget-object v0, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    iget v3, p0, Lcom/roidapp/imagelib/a/x;->b:I

    add-int/lit8 v3, v3, 0x1

    invoke-static {v0, v1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 1113
    iget-object v1, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    invoke-static {v1}, Lcom/roidapp/imagelib/a/i;->s(Lcom/roidapp/imagelib/a/i;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1119
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    .line 1114
    :catch_1
    move-exception v0

    .line 1115
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1116
    invoke-static {v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 1117
    iget-object v1, p0, Lcom/roidapp/imagelib/a/x;->a:Lcom/roidapp/imagelib/a/i;

    iget-object v2, p0, Lcom/roidapp/imagelib/a/x;->c:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lcom/roidapp/imagelib/a/i;->a(Lcom/roidapp/imagelib/a/i;Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1119
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0
.end method
