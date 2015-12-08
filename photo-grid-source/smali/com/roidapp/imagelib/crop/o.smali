.class final Lcom/roidapp/imagelib/crop/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/j;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 782
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/o;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 783
    iput-object p2, p0, Lcom/roidapp/imagelib/crop/o;->b:Ljava/lang/String;

    .line 784
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 788
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/o;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_0

    .line 789
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/o;->a:Lcom/roidapp/imagelib/crop/j;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "activity is finish"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 800
    :goto_0
    return-void

    .line 793
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/o;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 794
    invoke-static {}, Lcom/roidapp/baselib/a/a;->a()Lcom/roidapp/baselib/a/a;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/o;->b:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 795
    if-nez v0, :cond_1

    .line 796
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/o;->a:Lcom/roidapp/imagelib/crop/j;

    new-instance v1, Ljava/lang/OutOfMemoryError;

    const-string v2, "Out Of Memory"

    invoke-direct {v1, v2}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-static {v0, v1, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 798
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/o;->a:Lcom/roidapp/imagelib/crop/j;

    invoke-static {v1}, Lcom/roidapp/imagelib/crop/j;->h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0
.end method
