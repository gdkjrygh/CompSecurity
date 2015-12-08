.class public final Lcom/roidapp/photogrid/release/ml;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/PhotoGridActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ref/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/PhotoGridActivity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 69
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ml;->a:Ljava/lang/ref/WeakReference;

    .line 73
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 280
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 281
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 282
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 283
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 284
    return-void
.end method

.method public final a(II)V
    .locals 2

    .prologue
    .line 247
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 248
    if-nez p2, :cond_0

    .line 249
    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->what:I

    .line 253
    :goto_0
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 254
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 255
    return-void

    .line 251
    :cond_0
    const/4 v1, 0x0

    iput v1, v0, Landroid/os/Message;->what:I

    goto :goto_0
.end method

.method public final b(II)V
    .locals 2

    .prologue
    .line 262
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 263
    const/16 v1, 0x13

    iput v1, v0, Landroid/os/Message;->what:I

    .line 264
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 265
    iput p2, v0, Landroid/os/Message;->arg2:I

    .line 266
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 267
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ml;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_1

    .line 239
    :cond_0
    :goto_0
    return-void

    .line 79
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ml;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 80
    if-eqz v0, :cond_0

    .line 83
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 191
    :pswitch_1
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZI)V

    goto :goto_0

    .line 85
    :pswitch_2
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->p()V

    .line 86
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x5

    if-ne v1, v2, :cond_2

    .line 87
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IZ)V

    .line 89
    :cond_2
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->r:Z

    if-eqz v1, :cond_3

    .line 90
    iput-boolean v5, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->r:Z

    .line 91
    iget-object v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 92
    if-eqz v1, :cond_3

    .line 3145
    iget-object v2, v1, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 93
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;I)V

    .line 98
    :cond_3
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    goto :goto_0

    .line 188
    :pswitch_3
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v5, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZI)V

    goto :goto_0

    .line 194
    :pswitch_4
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->r()V

    goto :goto_0

    .line 197
    :pswitch_5
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->u()V

    goto :goto_0

    .line 200
    :pswitch_6
    const-string v1, ""

    .line 201
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v2, :cond_4

    .line 202
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 204
    :cond_4
    iget v2, p1, Landroid/os/Message;->arg1:I

    iget v3, p1, Landroid/os/Message;->arg2:I

    .line 3978
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o()V

    .line 3979
    new-instance v4, Lcom/roidapp/photogrid/release/bg;

    invoke-direct {v4, v0}, Lcom/roidapp/photogrid/release/bg;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v4, v2, v3, v1}, Lcom/roidapp/photogrid/release/bg;->a(IILjava/lang/String;)V

    .line 205
    iget-object v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v1, v1, Lcom/roidapp/photogrid/release/ng;

    if-eqz v1, :cond_0

    .line 206
    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0, v6, v5}, Lcom/roidapp/photogrid/release/mm;->a(ZZ)V

    goto/16 :goto_0

    .line 209
    :pswitch_7
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    goto/16 :goto_0

    .line 212
    :pswitch_8
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n()V

    goto/16 :goto_0

    .line 215
    :pswitch_9
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->u()V

    goto/16 :goto_0

    .line 218
    :pswitch_a
    invoke-virtual {v0, v6, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_0

    .line 221
    :pswitch_b
    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(II)V

    goto/16 :goto_0

    .line 4860
    :pswitch_c
    iget-object v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v1, v1, Lcom/roidapp/photogrid/release/ne;

    if-eqz v1, :cond_0

    .line 4861
    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ne;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ne;->m()V

    goto/16 :goto_0

    .line 227
    :pswitch_d
    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(II)V

    goto/16 :goto_0

    .line 230
    :pswitch_e
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o()V

    goto/16 :goto_0

    .line 233
    :pswitch_f
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Q()V

    goto/16 :goto_0

    .line 83
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_a
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_8
        :pswitch_b
        :pswitch_c
        :pswitch_7
        :pswitch_d
        :pswitch_e
        :pswitch_6
        :pswitch_f
    .end packed-switch
.end method
