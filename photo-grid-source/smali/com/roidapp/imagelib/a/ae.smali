.class final Lcom/roidapp/imagelib/a/ae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/aa;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/aa;)V
    .locals 0

    .prologue
    .line 817
    iput-object p1, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 820
    :try_start_0
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v2, v2, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 821
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 822
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, ".PhotoGrid_camera_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 823
    iget-object v3, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v3, v3, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-static {p1, v1, v2}, Lcom/roidapp/imagelib/b/d;->a([BLjava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 825
    iget-object v1, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v1, v1, Lcom/roidapp/imagelib/a/aa;->a:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    .line 827
    packed-switch v1, :pswitch_data_0

    .line 841
    :goto_0
    :pswitch_0
    new-instance v1, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 843
    iget-object v3, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    invoke-static {v3}, Lcom/roidapp/imagelib/a/aa;->a(Lcom/roidapp/imagelib/a/aa;)I

    move-result v3

    invoke-static {v3, v1}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    .line 844
    iget v3, v1, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v3, v6, :cond_1

    .line 845
    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v0, v1

    rem-int/lit16 v0, v0, 0x168

    move v1, v0

    .line 850
    :goto_1
    const/4 v0, 0x0

    .line 851
    sparse-switch v1, :sswitch_data_0

    .line 864
    :goto_2
    if-eqz v0, :cond_0

    .line 865
    new-instance v1, Landroid/media/ExifInterface;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 866
    const-string v3, "Orientation"

    invoke-virtual {v1, v3, v0}, Landroid/media/ExifInterface;->setAttribute(Ljava/lang/String;Ljava/lang/String;)V

    .line 867
    invoke-virtual {v1}, Landroid/media/ExifInterface;->saveAttributes()V

    .line 869
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v0, v0, Lcom/roidapp/imagelib/a/aa;->g:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 870
    iget-object v1, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v1, v1, Lcom/roidapp/imagelib/a/aa;->g:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 881
    :goto_3
    return-void

    .line 832
    :pswitch_1
    const/16 v0, 0x5a

    .line 833
    goto :goto_0

    .line 835
    :pswitch_2
    const/16 v0, 0xb4

    .line 836
    goto :goto_0

    .line 838
    :pswitch_3
    const/16 v0, 0x10e

    goto :goto_0

    .line 848
    :cond_1
    iget v1, v1, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int v0, v1, v0

    add-int/lit16 v0, v0, 0x168

    rem-int/lit16 v0, v0, 0x168

    move v1, v0

    goto :goto_1

    .line 853
    :sswitch_0
    const-string v0, "6"

    goto :goto_2

    .line 856
    :sswitch_1
    const-string v0, "3"

    goto :goto_2

    .line 859
    :sswitch_2
    const-string v0, "8"
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 872
    :catch_0
    move-exception v0

    .line 873
    :try_start_1
    iget-object v1, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v1, v1, Lcom/roidapp/imagelib/a/aa;->g:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 874
    iget-object v2, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v2, v2, Lcom/roidapp/imagelib/a/aa;->g:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 875
    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 880
    :catchall_0
    move-exception v0

    throw v0

    .line 876
    :catch_1
    move-exception v0

    .line 877
    :try_start_2
    iget-object v1, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v1, v1, Lcom/roidapp/imagelib/a/aa;->g:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 878
    iget-object v2, p0, Lcom/roidapp/imagelib/a/ae;->a:Lcom/roidapp/imagelib/a/aa;

    iget-object v2, v2, Lcom/roidapp/imagelib/a/aa;->g:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 879
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 827
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 851
    :sswitch_data_0
    .sparse-switch
        0x5a -> :sswitch_0
        0xb4 -> :sswitch_1
        0x10e -> :sswitch_2
    .end sparse-switch
.end method
