.class final Lcom/roidapp/photogrid/release/mn;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/mm;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/mm;)V
    .locals 0

    .prologue
    .line 100
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/16 v1, 0xf

    .line 102
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 159
    :goto_0
    return-void

    .line 104
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->a()V

    goto :goto_0

    .line 107
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/mm;->c(II)V

    goto :goto_0

    .line 111
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 112
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 115
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/mp;->N()V

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v1, v0, Lcom/roidapp/photogrid/release/mm;->h:Landroid/app/Activity;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 122
    :sswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    if-eqz v0, :cond_1

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/mp;->N()V

    .line 126
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v1, v0, Lcom/roidapp/photogrid/release/mm;->h:Landroid/app/Activity;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 129
    :sswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    if-eqz v0, :cond_2

    .line 131
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->v:Lcom/roidapp/photogrid/release/mp;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/mp;->N()V

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v1, v0, Lcom/roidapp/photogrid/release/mm;->h:Landroid/app/Activity;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->c(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 136
    :sswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0, v2, v2}, Lcom/roidapp/photogrid/release/mm;->a(ZZ)V

    goto/16 :goto_0

    .line 139
    :sswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->h()V

    goto/16 :goto_0

    .line 142
    :sswitch_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->e(I)V

    goto/16 :goto_0

    .line 149
    :sswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->e(I)V

    goto/16 :goto_0

    .line 152
    :sswitch_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/mm;->a(ZZ)V

    goto/16 :goto_0

    .line 155
    :sswitch_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mn;->a:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->g()V

    goto/16 :goto_0

    .line 102
    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x4 -> :sswitch_6
        0x6 -> :sswitch_7
        0x7 -> :sswitch_8
        0x2bc -> :sswitch_3
        0x2bd -> :sswitch_4
        0x2be -> :sswitch_2
        0x2bf -> :sswitch_5
        0x2014 -> :sswitch_a
        0x2015 -> :sswitch_b
        0x2016 -> :sswitch_9
    .end sparse-switch
.end method
