.class final Lcom/roidapp/photogrid/filter/selfiecam/y;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private b:Lcom/roidapp/photogrid/filter/selfiecam/v;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/filter/selfiecam/v;)V
    .locals 1

    .prologue
    .line 403
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 404
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/y;->a:Landroid/view/LayoutInflater;

    .line 405
    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/y;->b:Lcom/roidapp/photogrid/filter/selfiecam/v;

    .line 406
    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 410
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/y;->b:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v0}, Lcom/roidapp/photogrid/filter/selfiecam/v;->a()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 415
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/y;->b:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v0, p1}, Lcom/roidapp/photogrid/filter/selfiecam/v;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 420
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 426
    if-nez p2, :cond_0

    .line 427
    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/z;

    invoke-direct {v1, v3}, Lcom/roidapp/photogrid/filter/selfiecam/z;-><init>(B)V

    .line 428
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/y;->a:Landroid/view/LayoutInflater;

    const v2, 0x7f030122

    invoke-virtual {v0, v2, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 429
    const v0, 0x7f0d03f7

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcom/roidapp/photogrid/filter/selfiecam/z;->a:Landroid/widget/TextView;

    .line 430
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 435
    :goto_0
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/filter/selfiecam/y;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 436
    iget-object v1, v1, Lcom/roidapp/photogrid/filter/selfiecam/z;->a:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 437
    return-object p2

    .line 432
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/filter/selfiecam/z;

    move-object v1, v0

    goto :goto_0
.end method
