.class final Lcom/roidapp/baselib/g/c;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/baselib/g/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/baselib/g/a;)V
    .locals 1

    .prologue
    .line 176
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 177
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/baselib/g/c;->a:Ljava/lang/ref/WeakReference;

    .line 178
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/baselib/g/a;B)V
    .locals 0

    .prologue
    .line 170
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/g/c;-><init>(Lcom/roidapp/baselib/g/a;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 186
    .line 1181
    iget-object v0, p0, Lcom/roidapp/baselib/g/c;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/baselib/g/c;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/g/a;

    .line 187
    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/baselib/g/a;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 188
    :cond_0
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 208
    :cond_1
    :goto_1
    return-void

    .line 1181
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 190
    :pswitch_0
    invoke-virtual {v0}, Lcom/roidapp/baselib/g/a;->dismiss()V

    .line 192
    invoke-static {v0}, Lcom/roidapp/baselib/g/a;->a(Lcom/roidapp/baselib/g/a;)Lcom/roidapp/baselib/g/b;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 193
    invoke-static {v0}, Lcom/roidapp/baselib/g/a;->a(Lcom/roidapp/baselib/g/a;)Lcom/roidapp/baselib/g/b;

    move-result-object v1

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v0}, Lcom/roidapp/baselib/g/b;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 196
    :pswitch_1
    invoke-static {v0}, Lcom/roidapp/baselib/g/a;->b(Lcom/roidapp/baselib/g/a;)V

    goto :goto_1

    .line 199
    :pswitch_2
    invoke-static {v0}, Lcom/roidapp/baselib/g/a;->c(Lcom/roidapp/baselib/g/a;)Landroid/widget/ProgressBar;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 200
    invoke-static {v0}, Lcom/roidapp/baselib/g/a;->c(Lcom/roidapp/baselib/g/a;)Landroid/widget/ProgressBar;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 202
    :cond_3
    invoke-static {v0}, Lcom/roidapp/baselib/g/a;->d(Lcom/roidapp/baselib/g/a;)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 203
    invoke-static {v0}, Lcom/roidapp/baselib/g/a;->d(Lcom/roidapp/baselib/g/a;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 188
    nop

    :pswitch_data_0
    .packed-switch 0xcbc1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
