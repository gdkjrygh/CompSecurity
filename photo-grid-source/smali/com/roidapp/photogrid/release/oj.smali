.class final Lcom/roidapp/photogrid/release/oj;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/oi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/oi;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 9

    .prologue
    const/16 v1, 0xf

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 52
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 124
    :cond_0
    :goto_0
    return-void

    .line 54
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->a()V

    goto :goto_0

    .line 57
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 58
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 61
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v1, v0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v1, v0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :sswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 73
    iget v5, p1, Landroid/os/Message;->arg1:I

    .line 74
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-ne v0, v2, :cond_2

    .line 75
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget v6, v6, Lcom/roidapp/photogrid/release/oi;->k:I

    invoke-virtual {v0, v1, v5, v6}, Lcom/roidapp/photogrid/release/hx;->a(Landroid/content/Context;II)V

    .line 80
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/hx;->b:Z

    if-eqz v0, :cond_6

    .line 81
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->f()V

    goto :goto_0

    .line 77
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v6, v0, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget v7, v0, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 1347
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v2, :cond_3

    move v1, v2

    .line 1353
    :goto_2
    if-eqz v1, :cond_4

    invoke-static {v6}, Lcom/roidapp/photogrid/release/hw;->bc(Landroid/content/Context;)I

    move-result v0

    .line 1354
    :goto_3
    invoke-static {v5, v7}, Lcom/roidapp/photogrid/release/hx;->a(II)I

    move-result v7

    .line 1355
    if-ge v7, v0, :cond_1

    .line 1357
    if-eqz v1, :cond_5

    .line 1358
    invoke-static {v6, v7}, Lcom/roidapp/photogrid/release/hw;->e(Landroid/content/Context;I)V

    goto :goto_1

    :cond_3
    move v1, v3

    .line 1350
    goto :goto_2

    .line 1353
    :cond_4
    invoke-static {v6}, Lcom/roidapp/photogrid/release/hw;->ba(Landroid/content/Context;)I

    move-result v0

    goto :goto_3

    .line 1360
    :cond_5
    invoke-static {v6, v7}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;I)V

    goto :goto_1

    .line 87
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget v1, v0, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 88
    if-eqz v4, :cond_7

    .line 89
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget v0, v0, Lcom/roidapp/photogrid/release/oi;->k:I

    move v4, v2

    move v2, v3

    :goto_4
    if-ltz v0, :cond_8

    .line 90
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-virtual {v1, v2, v5, v0, v4}, Lcom/roidapp/photogrid/release/hx;->a(Landroid/content/Context;IIZ)I

    move-result v1

    .line 93
    if-nez v1, :cond_9

    .line 89
    add-int/lit8 v2, v0, -0x1

    move v4, v3

    move v8, v1

    move v1, v0

    move v0, v2

    move v2, v8

    goto :goto_4

    .line 98
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget v0, v0, Lcom/roidapp/photogrid/release/oi;->k:I

    move v4, v2

    move v2, v3

    :goto_5
    const/4 v6, 0x5

    if-gt v0, v6, :cond_8

    .line 99
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    invoke-virtual {v1, v2, v5, v0, v4}, Lcom/roidapp/photogrid/release/hx;->a(Landroid/content/Context;IIZ)I

    move-result v1

    .line 102
    if-nez v1, :cond_9

    .line 98
    add-int/lit8 v2, v0, 0x1

    move v4, v3

    move v8, v1

    move v1, v0

    move v0, v2

    move v2, v8

    goto :goto_5

    :cond_8
    move v0, v1

    move v1, v2

    .line 107
    :cond_9
    const-string v2, "test width"

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iput v0, v2, Lcom/roidapp/photogrid/release/oi;->k:I

    .line 110
    if-eqz v1, :cond_a

    .line 111
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/oi;->a(I)V

    goto/16 :goto_0

    .line 113
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->f()V

    goto/16 :goto_0

    .line 117
    :sswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    if-eqz v0, :cond_0

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->j:Lcom/roidapp/photogrid/release/hx;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget v2, v2, Lcom/roidapp/photogrid/release/oi;->o:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/oj;->a:Lcom/roidapp/photogrid/release/oi;

    iget v3, v3, Lcom/roidapp/photogrid/release/oi;->k:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/hx;->a(III)V

    goto/16 :goto_0

    .line 52
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_5
        0x1 -> :sswitch_0
        0x8 -> :sswitch_4
        0x2bc -> :sswitch_2
        0x2bd -> :sswitch_3
        0x2be -> :sswitch_1
    .end sparse-switch
.end method
