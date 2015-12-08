.class public final Lcom/roidapp/cloudlib/template/b/c;
.super Lcom/roidapp/cloudlib/ah;
.source "SourceFile"


# instance fields
.field protected c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/template/b/a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Lcom/roidapp/cloudlib/template/b/k;

.field private i:Lcom/roidapp/cloudlib/template/b/a;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/template/b/a;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 58
    invoke-interface {p1}, Lcom/roidapp/cloudlib/template/b/a;->a()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/ah;-><init>(Landroid/content/Context;)V

    .line 47
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/template/b/c;->d:Z

    .line 48
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/template/b/c;->e:Z

    .line 49
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/template/b/c;->f:Z

    .line 50
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/template/b/c;->g:Z

    .line 59
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->c:Ljava/lang/ref/WeakReference;

    .line 60
    new-instance v0, Lcom/roidapp/cloudlib/template/b/k;

    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->a:Ljava/lang/ref/WeakReference;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, v2}, Lcom/roidapp/cloudlib/template/b/k;-><init>(Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    .line 61
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->g:Z

    if-nez v0, :cond_0

    .line 68
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->g:Z

    .line 69
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    .line 71
    :cond_0
    return-void
.end method

.method protected final a(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v2, 0x0

    .line 214
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2327

    if-ne v0, v1, :cond_1

    .line 215
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->h()V

    .line 351
    :cond_0
    :goto_0
    return-void

    .line 217
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x2326

    if-ne v0, v1, :cond_2

    .line 218
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->g()V

    goto :goto_0

    .line 221
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/b/a;

    iput-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    .line 222
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->g:Z

    if-eqz v0, :cond_4

    .line 223
    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/template/b/c;->removeMessages(I)V

    .line 224
    iput-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    goto :goto_0

    .line 227
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1094
    :sswitch_0
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->d:Z

    if-nez v0, :cond_0

    .line 1095
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 1096
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->b()V

    .line 1097
    iput-boolean v4, p0, Lcom/roidapp/cloudlib/template/b/c;->d:Z

    goto :goto_0

    .line 1139
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 1140
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    .line 1141
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v2

    const-string v1, "local"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v2, v1}, Lcom/roidapp/cloudlib/template/b;->a(Ljava/util/List;)V

    .line 1142
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->b()Lcom/roidapp/cloudlib/template/a;

    move-result-object v1

    const-string v2, "favourite"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/a;->a(Ljava/util/List;)V

    .line 1143
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->g()V

    goto :goto_0

    .line 2103
    :sswitch_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->e:Z

    if-nez v0, :cond_0

    .line 2104
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 2105
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->c()V

    .line 2106
    iput-boolean v4, p0, Lcom/roidapp/cloudlib/template/b/c;->e:Z

    goto :goto_0

    .line 2148
    :sswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2149
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v1, v0}, Lcom/roidapp/cloudlib/template/b/a;->a(Ljava/util/List;)V

    goto/16 :goto_0

    .line 3111
    :sswitch_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 3112
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/b/k;->a(I)V

    goto/16 :goto_0

    .line 3154
    :sswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 3155
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v1, v0}, Lcom/roidapp/cloudlib/template/b/a;->c(Ljava/util/List;)V

    goto/16 :goto_0

    .line 4116
    :sswitch_6
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->f:Z

    if-nez v0, :cond_0

    .line 4117
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 4118
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->d()V

    .line 4119
    iput-boolean v4, p0, Lcom/roidapp/cloudlib/template/b/c;->f:Z

    goto/16 :goto_0

    .line 4160
    :sswitch_7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 4161
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v1, v0}, Lcom/roidapp/cloudlib/template/b/a;->b(Ljava/util/List;)V

    goto/16 :goto_0

    .line 5124
    :sswitch_8
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 5125
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->e()V

    goto/16 :goto_0

    .line 5129
    :sswitch_9
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 5130
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/b/k;->b(I)V

    goto/16 :goto_0

    .line 5134
    :sswitch_a
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->b(Z)V

    .line 5135
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->f()V

    goto/16 :goto_0

    .line 5180
    :sswitch_b
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 5181
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/k;->c(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto/16 :goto_0

    .line 5201
    :sswitch_c
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 5202
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b;->b(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 5203
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->n_()V

    goto/16 :goto_0

    .line 6166
    :sswitch_d
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 6167
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/k;->b(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 6168
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "download/"

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 6186
    :sswitch_e
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 6187
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 6188
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/cloudlib/template/b/k;->a(J)V

    .line 6189
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v4}, Lcom/roidapp/cloudlib/template/b/a;->a(Z)V

    .line 6190
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->n_()V

    goto/16 :goto_0

    .line 7173
    :sswitch_f
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 7174
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 7175
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b/k;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto/16 :goto_0

    .line 7195
    :sswitch_10
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/d;

    if-eqz v0, :cond_0

    .line 7196
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/d;

    invoke-interface {v1, v0}, Lcom/roidapp/cloudlib/template/b/a;->a(Lcom/roidapp/cloudlib/template/d;)V

    goto/16 :goto_0

    .line 309
    :sswitch_11
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->n_()V

    goto/16 :goto_0

    .line 314
    :sswitch_12
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0, v2}, Lcom/roidapp/cloudlib/template/b/a;->a(Z)V

    .line 315
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/template/b/a;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 320
    :sswitch_13
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, [Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 321
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 322
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    aget-object v2, v0, v2

    invoke-interface {v1, v2}, Lcom/roidapp/cloudlib/template/b/a;->a(Ljava/lang/Object;)V

    .line 323
    aget-object v1, v0, v4

    instance-of v1, v1, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v1, :cond_0

    .line 324
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->a()Lcom/roidapp/cloudlib/template/b;

    move-result-object v1

    aget-object v0, v0, v4

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/template/b;->b(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 325
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->n_()V

    goto/16 :goto_0

    .line 331
    :sswitch_14
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/template/b/a;->b(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 335
    :sswitch_15
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/template/b/a;->c(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 7208
    :sswitch_16
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->a()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7209
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/template/b/a;->a()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;)V

    goto/16 :goto_0

    .line 343
    :sswitch_17
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    if-eqz v0, :cond_0

    .line 345
    const-string v0, "Unlock/NO_AD/Template"

    invoke-static {v0, v3}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    iget-object v1, p0, Lcom/roidapp/cloudlib/template/b/c;->i:Lcom/roidapp/cloudlib/template/b/a;

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-interface {v1, v0}, Lcom/roidapp/cloudlib/template/b/a;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto/16 :goto_0

    .line 227
    :sswitch_data_0
    .sparse-switch
        0x2310 -> :sswitch_0
        0x2312 -> :sswitch_2
        0x2313 -> :sswitch_3
        0x2314 -> :sswitch_6
        0x2315 -> :sswitch_7
        0x2316 -> :sswitch_14
        0x2317 -> :sswitch_8
        0x2318 -> :sswitch_a
        0x2319 -> :sswitch_d
        0x2320 -> :sswitch_e
        0x2321 -> :sswitch_12
        0x2322 -> :sswitch_b
        0x2323 -> :sswitch_c
        0x2324 -> :sswitch_f
        0x2325 -> :sswitch_10
        0x2328 -> :sswitch_13
        0x2329 -> :sswitch_15
        0x2330 -> :sswitch_4
        0x2331 -> :sswitch_5
        0x2332 -> :sswitch_9
        0x2400 -> :sswitch_16
        0x2401 -> :sswitch_11
        0x2402 -> :sswitch_17
        0x23611 -> :sswitch_1
    .end sparse-switch
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 74
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->g:Z

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 78
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->d:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 82
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->e:Z

    return v0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 86
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/template/b/c;->f:Z

    return v0
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/roidapp/cloudlib/template/b/c;->h:Lcom/roidapp/cloudlib/template/b/k;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/k;->a()Z

    move-result v0

    return v0
.end method
