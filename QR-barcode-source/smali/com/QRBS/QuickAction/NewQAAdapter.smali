.class public Lcom/QRBS/QuickAction/NewQAAdapter;
.super Landroid/widget/BaseAdapter;
.source "NewQAAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private data:[Ljava/lang/String;

.field private mInflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 16
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/QRBS/QuickAction/NewQAAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 17
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/QRBS/QuickAction/NewQAAdapter;->data:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "item"    # I

    .prologue
    .line 30
    iget-object v0, p0, Lcom/QRBS/QuickAction/NewQAAdapter;->data:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 35
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 42
    if-nez p2, :cond_0

    .line 43
    iget-object v1, p0, Lcom/QRBS/QuickAction/NewQAAdapter;->mInflater:Landroid/view/LayoutInflater;

    const v2, 0x7f03002f

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 45
    new-instance v0, Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;

    invoke-direct {v0}, Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;-><init>()V

    .line 47
    .local v0, "holder":Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;
    const v1, 0x7f0d00a1

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;->mTitleText:Landroid/widget/TextView;

    .line 49
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 54
    :goto_0
    iget-object v1, v0, Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;->mTitleText:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/QRBS/QuickAction/NewQAAdapter;->data:[Ljava/lang/String;

    aget-object v2, v2, p1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    return-object p2

    .line 51
    .end local v0    # "holder":Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;

    .restart local v0    # "holder":Lcom/QRBS/QuickAction/NewQAAdapter$ViewHolder;
    goto :goto_0
.end method

.method public setData([Ljava/lang/String;)V
    .locals 0
    .param p1, "data"    # [Ljava/lang/String;

    .prologue
    .line 20
    iput-object p1, p0, Lcom/QRBS/QuickAction/NewQAAdapter;->data:[Ljava/lang/String;

    .line 21
    return-void
.end method
