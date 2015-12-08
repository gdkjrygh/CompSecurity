.class final Lcom/roidapp/photogrid/video/r;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/q;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/q;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/16 v5, 0x2002

    const/16 v4, 0x1001

    const/16 v3, 0x1000

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 160
    iget v2, p1, Landroid/os/Message;->what:I

    sparse-switch v2, :sswitch_data_0

    .line 243
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 164
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->b(Lcom/roidapp/photogrid/video/q;)V

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->c(Lcom/roidapp/photogrid/video/q;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;Lcom/roidapp/photogrid/video/aa;)V

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    invoke-interface {v0, v4, v1}, Lcom/roidapp/photogrid/video/ac;->a(II)V

    goto :goto_0

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 173
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    invoke-interface {v0, v3, v5}, Lcom/roidapp/photogrid/video/ac;->a(II)V

    .line 175
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->e(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->e(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    if-ne v0, v1, :cond_0

    .line 176
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;Lcom/roidapp/photogrid/video/aa;)V

    .line 177
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/ac;->a()V

    goto :goto_0

    .line 185
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 188
    :sswitch_3
    iget v2, p1, Landroid/os/Message;->arg2:I

    if-ne v2, v0, :cond_4

    .line 189
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->c(Lcom/roidapp/photogrid/video/q;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;Lcom/roidapp/photogrid/video/aa;)V

    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    invoke-interface {v0, v4, v1}, Lcom/roidapp/photogrid/video/ac;->a(II)V

    goto/16 :goto_0

    :cond_4
    move v0, v1

    .line 188
    goto :goto_1

    .line 193
    :cond_5
    if-nez v0, :cond_0

    .line 194
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    invoke-interface {v0, v3, v5}, Lcom/roidapp/photogrid/video/ac;->a(II)V

    goto/16 :goto_0

    .line 202
    :sswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->e(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_7

    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/video/ac;->a(I)V

    .line 213
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->f(Lcom/roidapp/photogrid/video/q;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->g(Lcom/roidapp/photogrid/video/q;)I

    move-result v1

    if-ge v0, v1, :cond_8

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->h(Lcom/roidapp/photogrid/video/q;)I

    move-result v0

    .line 215
    :goto_3
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 216
    iget-object v1, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->h(Lcom/roidapp/photogrid/video/q;)I

    move-result v0

    goto :goto_3

    .line 208
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;Lcom/roidapp/photogrid/video/aa;)V

    .line 209
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/ac;->a()V

    goto :goto_2

    .line 221
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->i(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->b(Lcom/roidapp/photogrid/video/q;)V

    .line 223
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->e:Lcom/roidapp/photogrid/video/aa;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;Lcom/roidapp/photogrid/video/aa;)V

    goto/16 :goto_0

    .line 229
    :sswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/video/r;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 160
    nop

    :sswitch_data_0
    .sparse-switch
        0x2001 -> :sswitch_0
        0x2002 -> :sswitch_2
        0x2003 -> :sswitch_1
        0x2004 -> :sswitch_3
        0x3001 -> :sswitch_0
        0x3002 -> :sswitch_4
        0x3003 -> :sswitch_5
    .end sparse-switch
.end method
