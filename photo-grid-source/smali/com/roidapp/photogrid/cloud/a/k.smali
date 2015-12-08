.class public final Lcom/roidapp/photogrid/cloud/a/k;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 1

    .prologue
    .line 14
    const/4 v0, 0x5

    invoke-direct {p0, p1, v0, p2}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 19
    iget-boolean v1, p0, Lcom/roidapp/photogrid/cloud/a/k;->f:Z

    if-nez v1, :cond_0

    if-nez p1, :cond_1

    .line 33
    :cond_0
    :goto_0
    return-object v0

    .line 21
    :cond_1
    if-eqz p2, :cond_3

    .line 22
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/roidapp/photogrid/cloud/a/k;

    if-nez v1, :cond_3

    .line 27
    :goto_1
    if-nez v0, :cond_2

    .line 28
    const v0, 0x7f030012

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 29
    :cond_2
    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    move-object v0, p2

    goto :goto_1
.end method
