.class public final Lcom/roidapp/photogrid/cloud/a/n;
.super Lcom/roidapp/photogrid/cloud/a/w;
.source "SourceFile"


# instance fields
.field private j:Landroid/app/Activity;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/roidapp/photogrid/cloud/a/t;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 20
    const/16 v0, 0x8

    invoke-direct {p0, p1, v0, p2}, Lcom/roidapp/photogrid/cloud/a/w;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 21
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/a/n;->j:Landroid/app/Activity;

    .line 1027
    const v0, 0x7f0203eb

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/n;->a:I

    .line 1028
    const v0, 0x7f07015b

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/n;->b:I

    .line 1029
    const v0, 0x7f07015a

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/n;->g:I

    .line 1030
    const v0, 0x7f070159

    iput v0, p0, Lcom/roidapp/photogrid/cloud/a/n;->h:I

    .line 23
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/a/n;->k:Ljava/lang/String;

    .line 24
    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 13
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/cloud/a/w;->a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/n;->j:Landroid/app/Activity;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/n;->j:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/q;->a(Landroid/app/Activity;)V

    .line 40
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/cloud/a/w;->onClick(Landroid/view/View;)V

    .line 43
    :cond_0
    return-void
.end method
