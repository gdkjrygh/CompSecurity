.class final Lcom/roidapp/photogrid/release/ph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/videolib/core/a/b;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ml;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/roidapp/photogrid/release/pg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/pg;Lcom/roidapp/photogrid/release/ml;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ph;->a:Lcom/roidapp/photogrid/release/ml;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/ph;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/pg;->a(Lcom/roidapp/photogrid/release/pg;J)J

    .line 79
    return-void
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/release/pg;->a(Lcom/roidapp/photogrid/release/pg;I)I

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->a(Lcom/roidapp/photogrid/release/pg;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 87
    :goto_0
    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->a:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/photogrid/release/ml;->b(II)V

    goto :goto_0
.end method

.method public final a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->b:Landroid/app/Activity;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Video/VideoActivity/Save/Failed/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/pg;->d(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "(Product Model:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",SDK:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V

    .line 122
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 123
    const/16 v1, 0x15

    iput v1, v0, Landroid/os/Message;->what:I

    .line 124
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 125
    iput p2, v0, Landroid/os/Message;->arg2:I

    .line 126
    iput-object p5, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 127
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ph;->a:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 128
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->b(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/pg;->b(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lcom/roidapp/photogrid/common/ae;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 93
    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->b(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    move-result-object p1

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->c(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    .line 98
    :cond_1
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    iput-object p1, v0, Lcom/roidapp/photogrid/release/pg;->e:Ljava/lang/String;

    .line 101
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 103
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ph;->b:Landroid/app/Activity;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Video/VideoActivity/Save/Success/"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/pg;->d(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/pg;->e(Lcom/roidapp/photogrid/release/pg;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/pg;->f(Lcom/roidapp/photogrid/release/pg;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->g(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "none/"

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/pg;->h(Lcom/roidapp/photogrid/release/pg;)Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/pg;->i(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/pg;->j(Lcom/roidapp/photogrid/release/pg;)Lcom/roidapp/videolib/b/u;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->k(Lcom/roidapp/photogrid/release/pg;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "BackgroundOn/"

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->l(Lcom/roidapp/photogrid/release/pg;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "BorderOn/"

    :goto_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/pg;->m(Lcom/roidapp/photogrid/release/pg;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "/signshow/"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/pg;->n(Lcom/roidapp/photogrid/release/pg;)Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 113
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->c:Lcom/roidapp/photogrid/release/pg;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ph;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/photogrid/release/pg;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 114
    return-void

    .line 103
    :cond_2
    const-string v0, "has/"

    goto/16 :goto_0

    :cond_3
    const-string v0, "BackgroundOff/"

    goto :goto_1

    :cond_4
    const-string v0, "BorderOff/"

    goto :goto_2

    :cond_5
    const-string v0, ""

    goto :goto_3
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 133
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ph;->a:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 135
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 136
    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    .line 137
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ph;->a:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 139
    return-void
.end method
