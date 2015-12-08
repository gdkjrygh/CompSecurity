.class final Lcom/roidapp/photogrid/cloud/bx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/br;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/br;)V
    .locals 0

    .prologue
    .line 370
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    const/4 v1, 0x0

    .line 373
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    const-string v0, "SNS"

    const-string v2, "click"

    const-string v3, "share/openhashtags"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 374
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "share/openhashtags"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v0, v2, v3, v4, v5}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 375
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    const-string v2, "input_method"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 376
    if-eqz v0, :cond_0

    .line 377
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->f(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 382
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    iget-object v0, v0, Lcom/roidapp/photogrid/cloud/br;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v0

    .line 383
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->g(Lcom/roidapp/photogrid/cloud/br;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    .line 384
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->i()I

    move-result v2

    sub-int/2addr v0, v2

    .line 385
    const/4 v2, 0x2

    new-array v2, v2, [I

    .line 386
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    iget-object v3, v3, Lcom/roidapp/photogrid/cloud/br;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v3, v2}, Landroid/widget/RelativeLayout;->getLocationOnScreen([I)V

    .line 387
    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v4}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    const/4 v5, 0x1

    aget v2, v2, v5

    sub-int v2, v4, v2

    add-int/2addr v2, v0

    invoke-static {v3, v2}, Lcom/roidapp/photogrid/cloud/br;->b(Lcom/roidapp/photogrid/cloud/br;I)I

    .line 389
    :goto_0
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/cloud/br;->h(Lcom/roidapp/photogrid/cloud/br;)Landroid/widget/CheckBox;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 390
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(I)V

    .line 391
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/br;->c(Lcom/roidapp/photogrid/cloud/br;)Lcom/roidapp/photogrid/cloud/BaseShareActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/bx;->a:Lcom/roidapp/photogrid/cloud/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/br;->g(Lcom/roidapp/photogrid/cloud/br;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->b(I)V

    .line 393
    return-void

    :cond_1
    move v0, v1

    goto :goto_0
.end method
