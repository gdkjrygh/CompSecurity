.class final Lcom/roidapp/videolib/a/c;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/a/b;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/a/b;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 97
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 157
    :cond_0
    :goto_0
    return-void

    .line 99
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/b;->a()V

    goto :goto_0

    .line 103
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-interface {v0, v1, v2}, Lcom/roidapp/videolib/core/a/b;->a(II)V

    goto :goto_0

    .line 109
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->b(Lcom/roidapp/videolib/a/b;)Landroid/os/Handler;

    move-result-object v0

    const v1, 0xabcde

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 110
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->c(Lcom/roidapp/videolib/a/b;)Z

    .line 112
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/b;->b()V

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->d(Lcom/roidapp/videolib/a/b;)V

    goto :goto_0

    .line 119
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->e(Lcom/roidapp/videolib/a/b;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->e(Lcom/roidapp/videolib/a/b;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 120
    :goto_1
    if-eqz v0, :cond_2

    .line 122
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    invoke-static {v0}, Lcom/roidapp/videolib/e;->b(Landroid/content/Context;)V

    .line 124
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 125
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    .line 126
    iget-object v1, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v1}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v1

    if-eqz v0, :cond_5

    const-string v2, "videoPath"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-interface {v1, v0}, Lcom/roidapp/videolib/core/a/b;->a(Ljava/lang/String;)V

    .line 129
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->d(Lcom/roidapp/videolib/a/b;)V

    goto/16 :goto_0

    :cond_4
    move-object v0, v5

    .line 119
    goto :goto_1

    :cond_5
    move-object v0, v5

    .line 126
    goto :goto_2

    .line 133
    :sswitch_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    const v1, 0xee07

    if-ne v0, v1, :cond_6

    .line 135
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->e(Lcom/roidapp/videolib/a/b;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->e(Lcom/roidapp/videolib/a/b;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 136
    :goto_3
    if-eqz v0, :cond_6

    .line 137
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Z)V

    .line 140
    :cond_6
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 141
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v6

    .line 142
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    if-eqz v6, :cond_a

    const-string v3, "eclass"

    invoke-virtual {v6, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_4
    if-eqz v6, :cond_b

    const-string v4, "emsg"

    invoke-virtual {v6, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_5
    if-eqz v6, :cond_7

    const-string v5, "errorpath"

    invoke-virtual {v6, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_7
    invoke-interface/range {v0 .. v5}, Lcom/roidapp/videolib/core/a/b;->a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    :cond_8
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->d(Lcom/roidapp/videolib/a/b;)V

    goto/16 :goto_0

    :cond_9
    move-object v0, v5

    .line 135
    goto :goto_3

    :cond_a
    move-object v3, v5

    .line 142
    goto :goto_4

    :cond_b
    move-object v4, v5

    goto :goto_5

    .line 151
    :sswitch_5
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->f(Lcom/roidapp/videolib/a/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/roidapp/videolib/a/c;->a:Lcom/roidapp/videolib/a/b;

    invoke-static {v0}, Lcom/roidapp/videolib/a/b;->a(Lcom/roidapp/videolib/a/b;)Lcom/roidapp/videolib/core/a/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/b;->b()V

    goto/16 :goto_0

    .line 97
    :sswitch_data_0
    .sparse-switch
        0xbb00 -> :sswitch_0
        0xbb01 -> :sswitch_1
        0xbb02 -> :sswitch_3
        0xbb03 -> :sswitch_4
        0xbb04 -> :sswitch_2
        0xabcde -> :sswitch_5
    .end sparse-switch
.end method
