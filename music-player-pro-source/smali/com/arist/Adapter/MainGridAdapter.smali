.class public Lcom/arist/Adapter/MainGridAdapter;
.super Landroid/widget/BaseAdapter;
.source "MainGridAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/arist/Adapter/MainGridAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private btnInfos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/ButtonInfo;",
            ">;"
        }
    .end annotation
.end field

.field private inflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/ButtonInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 28
    .local p2, "btnInfos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/ButtonInfo;>;"
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 29
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/Adapter/MainGridAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 30
    invoke-virtual {p0, p2}, Lcom/arist/Adapter/MainGridAdapter;->setData(Ljava/util/ArrayList;)V

    .line 31
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/arist/Adapter/MainGridAdapter;->btnInfos:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 40
    iget-object v0, p0, Lcom/arist/Adapter/MainGridAdapter;->btnInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 45
    iget-object v0, p0, Lcom/arist/Adapter/MainGridAdapter;->btnInfos:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/entity/ButtonInfo;

    invoke-virtual {v0}, Lcom/arist/entity/ButtonInfo;->getBtnResId()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v4, 0x0

    .line 51
    if-nez p2, :cond_0

    .line 52
    iget-object v2, p0, Lcom/arist/Adapter/MainGridAdapter;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f03000b

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 53
    new-instance v0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;

    invoke-direct {v0, p0, v4}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;-><init>(Lcom/arist/Adapter/MainGridAdapter;Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)V

    .line 55
    .local v0, "holder":Lcom/arist/Adapter/MainGridAdapter$ViewHolder;
    const v2, 0x7f0d0041

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 54
    invoke-static {v0, v2}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->access$1(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;Landroid/widget/ImageView;)V

    .line 57
    const v2, 0x7f0d0042

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 56
    invoke-static {v0, v2}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->access$2(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 59
    const v2, 0x7f0d0043

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 58
    invoke-static {v0, v2}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->access$3(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;Landroid/widget/TextView;)V

    .line 60
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 63
    :goto_0
    iget-object v2, p0, Lcom/arist/Adapter/MainGridAdapter;->btnInfos:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/arist/entity/ButtonInfo;

    .line 64
    .local v1, "info":Lcom/arist/entity/ButtonInfo;
    # getter for: Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->ivButtonInfo:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->access$4(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)Landroid/widget/ImageView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/arist/entity/ButtonInfo;->getBtnResId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 65
    # getter for: Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->tvButtonInfoTitle:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->access$5(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/arist/entity/ButtonInfo;->getBtnTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    # getter for: Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->tvButtonInfoDes:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;->access$6(Lcom/arist/Adapter/MainGridAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v1}, Lcom/arist/entity/ButtonInfo;->getBtnDes()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    return-object p2

    .line 62
    .end local v0    # "holder":Lcom/arist/Adapter/MainGridAdapter$ViewHolder;
    .end local v1    # "info":Lcom/arist/entity/ButtonInfo;
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/arist/Adapter/MainGridAdapter$ViewHolder;

    .restart local v0    # "holder":Lcom/arist/Adapter/MainGridAdapter$ViewHolder;
    goto :goto_0
.end method

.method public setData(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/ButtonInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    .local p1, "btnInfos":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/ButtonInfo;>;"
    if-eqz p1, :cond_0

    .line 23
    iput-object p1, p0, Lcom/arist/Adapter/MainGridAdapter;->btnInfos:Ljava/util/ArrayList;

    .line 26
    :goto_0
    return-void

    .line 25
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/arist/Adapter/MainGridAdapter;->btnInfos:Ljava/util/ArrayList;

    goto :goto_0
.end method
