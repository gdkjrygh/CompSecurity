.class final Lcom/roidapp/photogrid/cloud/at;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/PGShareActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/PGShareActivity;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .prologue
    const-wide/16 v8, 0x1

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 209
    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "share/openhashtags"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const-string v1, "SNS"

    const-string v2, "click"

    const-string v3, "share/openhashtags"

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 211
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 212
    if-eqz v0, :cond_0

    .line 213
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->f(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 215
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->d()Z

    move-result v0

    .line 216
    if-eqz v0, :cond_1

    .line 217
    new-array v0, v7, [I

    .line 218
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->g(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->getLocationOnScreen([I)V

    .line 219
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    aget v0, v0, v6

    sub-int v0, v2, v0

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b(Lcom/roidapp/photogrid/cloud/PGShareActivity;I)I

    .line 226
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->h(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/CheckBox;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 227
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->p_()V

    .line 228
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->i(Lcom/roidapp/photogrid/cloud/PGShareActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(I)V

    .line 229
    return-void

    .line 221
    :cond_1
    new-array v0, v7, [I

    .line 222
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->a(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->getLocationOnScreen([I)V

    .line 223
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b(Lcom/roidapp/photogrid/cloud/PGShareActivity;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getHeight()I

    move-result v1

    .line 224
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/at;->a:Lcom/roidapp/photogrid/cloud/PGShareActivity;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    aget v0, v0, v6

    sub-int v0, v3, v0

    add-int/2addr v0, v1

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/cloud/PGShareActivity;->b(Lcom/roidapp/photogrid/cloud/PGShareActivity;I)I

    goto :goto_0
.end method
