.class final Lcom/roidapp/photogrid/release/gz;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/release/ge;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/release/ge;)V
    .locals 1

    .prologue
    .line 875
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 876
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/gz;->a:Ljava/lang/ref/WeakReference;

    .line 877
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/release/ge;B)V
    .locals 0

    .prologue
    .line 872
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/gz;-><init>(Lcom/roidapp/photogrid/release/ge;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 881
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gz;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 934
    :goto_0
    return-void

    .line 883
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gz;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ge;

    .line 884
    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->p(Lcom/roidapp/photogrid/release/ge;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 885
    :cond_1
    iput-object v1, p0, Lcom/roidapp/photogrid/release/gz;->a:Ljava/lang/ref/WeakReference;

    goto :goto_0

    .line 888
    :cond_2
    iget v2, p1, Landroid/os/Message;->what:I

    packed-switch v2, :pswitch_data_0

    .line 933
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    goto :goto_0

    .line 897
    :pswitch_0
    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;I)V

    goto :goto_1

    .line 904
    :pswitch_1
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;Ljava/io/File;)V

    goto :goto_1

    .line 907
    :pswitch_2
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;Ljava/io/File;)V

    goto :goto_1

    .line 910
    :pswitch_3
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f07004e

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_1

    .line 913
    :pswitch_4
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f070171

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_1

    .line 916
    :pswitch_5
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f07028e

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_1

    .line 919
    :pswitch_6
    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070170

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_4
    const-string v1, ""

    goto :goto_2

    .line 922
    :pswitch_7
    iget v2, p1, Landroid/os/Message;->arg1:I

    if-eq v2, v3, :cond_5

    iget v2, p1, Landroid/os/Message;->arg2:I

    if-ne v2, v3, :cond_3

    .line 925
    :cond_5
    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->q(Lcom/roidapp/photogrid/release/ge;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->q(Lcom/roidapp/photogrid/release/ge;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/gv;

    .line 926
    :cond_6
    if-eqz v1, :cond_7

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-ne v1, v2, :cond_3

    .line 927
    :cond_7
    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->r(Lcom/roidapp/photogrid/release/ge;)V

    goto/16 :goto_1

    .line 888
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method
