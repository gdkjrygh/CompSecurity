.class public Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;
.super Landroid/widget/BaseAdapter;
.source "SearchResultActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SearchResultActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SpinnerAdapter"
.end annotation


# instance fields
.field m_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/SearchResultActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/SearchResultActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 308
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    iput-object p1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 306
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->m_list:Ljava/util/ArrayList;

    .line 309
    iput-object p2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->m_list:Ljava/util/ArrayList;

    .line 310
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 314
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 319
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 324
    iget-object v0, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 331
    move-object v2, p2

    .line 332
    .local v2, "rowView":Landroid/view/View;
    new-instance v0, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;

    iget-object v4, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-direct {v0, v4}, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;-><init>(Lcom/hmobile/biblekjv/SearchResultActivity;)V

    .line 333
    .local v0, "holder":Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;
    if-nez v2, :cond_0

    .line 334
    iget-object v4, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    invoke-virtual {v4}, Lcom/hmobile/biblekjv/SearchResultActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    .line 335
    .local v1, "li":Landroid/view/LayoutInflater;
    const v4, 0x7f030030

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 336
    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 338
    const v4, 0x7f0e006c

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 337
    iput-object v4, v0, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;->txtBookName:Landroid/widget/TextView;

    .line 340
    const v4, 0x7f0e0122

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 339
    iput-object v4, v0, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;->rl_spinner_item:Landroid/widget/RelativeLayout;

    .line 345
    .end local v1    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v4, p0, Lcom/hmobile/biblekjv/SearchResultActivity$SpinnerAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 346
    .local v3, "s":Ljava/lang/String;
    iget-object v4, v0, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;->txtBookName:Landroid/widget/TextView;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 348
    return-object v2

    .line 342
    .end local v3    # "s":Ljava/lang/String;
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "holder":Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;
    check-cast v0, Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;

    .restart local v0    # "holder":Lcom/hmobile/biblekjv/SearchResultActivity$ViewHolderForSpinner;
    goto :goto_0
.end method
