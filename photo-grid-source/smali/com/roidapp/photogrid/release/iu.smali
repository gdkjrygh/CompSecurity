.class final Lcom/roidapp/photogrid/release/iu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageEditor;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 925
    iput-object p1, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .prologue
    const/high16 v4, 0x3f400000    # 0.75f

    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 927
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->s(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v0

    .line 928
    add-int/lit8 v5, v0, -0x1

    .line 930
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v5

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->w:Z

    .line 932
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move v0, v1

    move v2, v1

    .line 950
    :goto_0
    :try_start_0
    iget-object v4, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/ImageEditor;->v(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 951
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v4, v0, v2, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 989
    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_4

    .line 990
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 991
    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->a:I

    iput v2, v1, Landroid/os/Message;->what:I

    .line 992
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 993
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 999
    :goto_2
    return-void

    .line 935
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageEditor;->s(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;)[I

    move-result-object v0

    .line 936
    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x6

    .line 937
    const/4 v4, 0x1

    aget v0, v0, v4

    add-int/lit8 v0, v0, 0x6

    .line 938
    goto :goto_0

    .line 940
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v0

    .line 941
    int-to-float v2, v0

    mul-float/2addr v2, v4

    float-to-int v2, v2

    .line 942
    goto :goto_0

    .line 944
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v2

    .line 945
    int-to-float v0, v2

    mul-float/2addr v0, v4

    float-to-int v0, v0

    goto :goto_0

    .line 953
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    move-result-object v4

    iget-object v6, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v6, v6, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v5

    invoke-virtual {v4, v6, v0, v2}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_1

    .line 956
    :catch_0
    move-exception v4

    .line 957
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v6

    if-nez v6, :cond_1

    .line 958
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 961
    :cond_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 963
    :try_start_2
    iget-object v6, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v6}, Lcom/roidapp/photogrid/release/ImageEditor;->v(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 964
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v6, v6, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v6, v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v5, v0, v2, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    .line 976
    :goto_3
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/OutOfMemoryError;->printStackTrace()V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    .line 978
    :catch_1
    move-exception v2

    :goto_4
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_2

    .line 979
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v3

    .line 982
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v3, 0xa2

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;I)I

    .line 983
    iget-object v2, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->i()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 984
    iget-object v2, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v2, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    .line 985
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 986
    invoke-virtual {v4}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_1

    .line 966
    :cond_3
    :try_start_4
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    move-result-object v6

    iget-object v7, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v7, v7, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v7, v5

    invoke-virtual {v6, v5, v0, v2}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_2

    move-result-object v0

    goto :goto_3

    .line 995
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    const/16 v2, 0xa3

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;I)I

    .line 996
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {}, Lcom/roidapp/photogrid/release/ImageEditor;->i()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 997
    iget-object v0, p0, Lcom/roidapp/photogrid/release/iu;->a:Lcom/roidapp/photogrid/release/ImageEditor;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z

    goto/16 :goto_2

    .line 978
    :catch_2
    move-exception v0

    move-object v0, v3

    goto :goto_4

    .line 932
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
