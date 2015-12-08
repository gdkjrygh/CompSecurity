.class final Lcom/roidapp/photogrid/cloud/ct;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V
    .locals 1

    .prologue
    .line 388
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/ct;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 389
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/ct;->b:Ljava/lang/ref/WeakReference;

    .line 390
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 392
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 424
    :cond_0
    :goto_0
    return-void

    .line 394
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ct;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 395
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ct;->a:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->a()V

    goto :goto_0

    .line 399
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/ct;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    .line 400
    if-eqz v0, :cond_0

    .line 403
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 404
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/roidapp/baselib/gl/c;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 406
    const/16 v1, 0x10

    :try_start_0
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roidapp/baselib/gl/GPUTestView;

    .line 407
    if-eqz v1, :cond_1

    .line 408
    invoke-virtual {v1}, Lcom/roidapp/baselib/gl/GPUTestView;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 409
    if-eqz v2, :cond_1

    .line 410
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 417
    :cond_1
    :goto_1
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 419
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/c;->a(Z)V

    goto :goto_0

    .line 415
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/ClassCastException;->printStackTrace()V

    goto :goto_1

    .line 421
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/c;->a(Z)V

    goto :goto_0

    .line 392
    :sswitch_data_0
    .sparse-switch
        0x236 -> :sswitch_0
        0x1230 -> :sswitch_1
    .end sparse-switch
.end method
