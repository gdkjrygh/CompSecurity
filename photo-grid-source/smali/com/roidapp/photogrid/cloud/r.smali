.class final Lcom/roidapp/photogrid/cloud/r;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/cloud/BaseShareActivity;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)V
    .locals 1

    .prologue
    .line 1765
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1766
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/r;->a:Ljava/lang/ref/WeakReference;

    .line 1767
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/r;)Z
    .locals 1

    .prologue
    .line 1755
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/r;->b:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/r;)Ljava/lang/ref/WeakReference;
    .locals 1

    .prologue
    .line 1755
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/r;->a:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 1770
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/r;->b:Z

    .line 1771
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v6, 0x0

    .line 1775
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/r;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/r;->a:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_2

    .line 1776
    :cond_0
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/r;->a:Ljava/lang/ref/WeakReference;

    .line 1846
    :cond_1
    :goto_0
    return-void

    .line 1779
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/r;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    .line 1780
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1781
    :cond_3
    iput-object v2, p0, Lcom/roidapp/photogrid/cloud/r;->a:Ljava/lang/ref/WeakReference;

    goto :goto_0

    .line 1784
    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1786
    :pswitch_0
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .line 1787
    if-eqz v2, :cond_1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1788
    new-instance v7, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/photogrid/cloud/q;

    iget v3, p1, Landroid/os/Message;->arg1:I

    iget-boolean v4, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->j:Z

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->c(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Z

    move-result v5

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/cloud/q;-><init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;IZZB)V

    invoke-direct {v7, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v7}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 1791
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/c/x;

    .line 1792
    if-eqz v0, :cond_1

    .line 1793
    iget-object v2, v0, Lcom/roidapp/baselib/c/x;->a:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    .line 1794
    if-eqz v2, :cond_5

    .line 1795
    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->d(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Landroid/widget/ImageView;

    move-result-object v3

    .line 1796
    if-eqz v3, :cond_5

    .line 1797
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1798
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1801
    :cond_5
    iget-object v0, v0, Lcom/roidapp/baselib/c/x;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    .line 1809
    if-eqz v0, :cond_1

    .line 1810
    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/a/q;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1811
    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e(Lcom/roidapp/photogrid/cloud/BaseShareActivity;)Lcom/roidapp/photogrid/cloud/a/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/cloud/a/q;->a(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 1827
    :pswitch_2
    iget-object v0, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 1828
    iget-object v0, v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->e:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1830
    :cond_6
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 1831
    iget v2, p1, Landroid/os/Message;->arg1:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_7

    const-string v2, "image/png"

    :goto_1
    invoke-static {v1, v0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    const-string v2, "image/jpeg"

    goto :goto_1

    .line 1835
    :pswitch_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/photogrid/cloud/m;

    .line 1836
    if-eqz v0, :cond_1

    .line 1837
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/cloud/m;

    invoke-direct {v2, p0, v0, v6}, Lcom/roidapp/photogrid/cloud/m;-><init>(Lcom/roidapp/photogrid/cloud/r;Lcom/roidapp/photogrid/cloud/m;B)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 1843
    :pswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/cloudlib/template/TemplateInfo;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(Lcom/roidapp/photogrid/cloud/BaseShareActivity;Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    goto/16 :goto_0

    .line 1784
    nop

    :pswitch_data_0
    .packed-switch 0xcc01
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
