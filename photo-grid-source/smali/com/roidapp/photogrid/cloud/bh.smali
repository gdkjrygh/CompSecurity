.class final Lcom/roidapp/photogrid/cloud/bh;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/bf;

.field private b:Lcom/roidapp/photogrid/cloud/p;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/bf;Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 1

    .prologue
    .line 78
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/bh;->a:Lcom/roidapp/photogrid/cloud/bf;

    .line 79
    const v0, 0xbcd2

    invoke-direct {p0, p2, v0, p3}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 81
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/bf;->a(Lcom/roidapp/photogrid/cloud/bf;)Lcom/roidapp/photogrid/cloud/p;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/bh;->b:Lcom/roidapp/photogrid/cloud/p;

    .line 82
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 86
    if-nez p1, :cond_1

    .line 105
    :cond_0
    :goto_0
    return-object v0

    .line 89
    :cond_1
    if-eqz p2, :cond_4

    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Lcom/roidapp/photogrid/cloud/bh;

    if-nez v1, :cond_4

    move-object v1, v0

    .line 95
    :goto_1
    if-eqz v1, :cond_3

    .line 96
    :goto_2
    if-eqz v1, :cond_0

    .line 99
    if-eqz v1, :cond_2

    .line 100
    const v0, 0x7f0d00a7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 101
    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    :cond_2
    invoke-virtual {v1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v1

    .line 105
    goto :goto_0

    .line 95
    :cond_3
    const v1, 0x7f030020

    const/4 v2, 0x0

    invoke-virtual {p1, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, p2

    goto :goto_1
.end method
