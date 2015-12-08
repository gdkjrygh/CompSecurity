.class public Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;
.super Landroid/widget/BaseAdapter;
.source "MostLikeShareActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/MostLikeShareActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LikeShareAdapter"
.end annotation


# instance fields
.field m_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/MostLikeShareActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 194
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/LikeShareInfo;>;"
    iput-object p1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 192
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->m_list:Ljava/util/ArrayList;

    .line 195
    iput-object p2, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->m_list:Ljava/util/ArrayList;

    .line 196
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;)Lcom/hmobile/biblekjv/MostLikeShareActivity;
    .locals 1

    .prologue
    .line 191
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 200
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 205
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 210
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 216
    move-object v5, p2

    .line 217
    .local v5, "rowView":Landroid/view/View;
    new-instance v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;

    invoke-direct {v2}, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;-><init>()V

    .line 218
    .local v2, "holder":Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;
    if-nez v5, :cond_1

    .line 219
    iget-object v7, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    invoke-virtual {v7}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v4

    .line 220
    .local v4, "li":Landroid/view/LayoutInflater;
    const v7, 0x7f030024

    const/4 v8, 0x0

    invoke-virtual {v4, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 221
    invoke-virtual {v5, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 223
    const v7, 0x7f0e00ac

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 222
    iput-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->txtVerse:Landroid/widget/TextView;

    .line 225
    const v7, 0x7f0e00ad

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 224
    iput-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->txtBookInfo:Landroid/widget/TextView;

    .line 227
    const v7, 0x7f0e00ae

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    .line 226
    iput-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->txtLikeShare:Landroid/widget/TextView;

    .line 229
    const v7, 0x7f0e00ab

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    .line 228
    iput-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->rlLikeItem:Landroid/widget/RelativeLayout;

    .line 235
    .end local v4    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v7, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/hmobile/model/LikeShareInfo;

    .line 236
    .local v3, "info":Lcom/hmobile/model/LikeShareInfo;
    if-eqz v3, :cond_0

    .line 247
    iget-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->txtBookInfo:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    iget-object v9, v3, Lcom/hmobile/model/LikeShareInfo;->book:Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v9, " "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget-object v9, v3, Lcom/hmobile/model/LikeShareInfo;->chapter:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ":"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    .line 248
    iget-object v9, v3, Lcom/hmobile/model/LikeShareInfo;->verse:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 247
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->txtVerse:Landroid/widget/TextView;

    iget-object v8, v3, Lcom/hmobile/model/LikeShareInfo;->verseinfo:Ljava/lang/String;

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    iget-object v7, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;->this$0:Lcom/hmobile/biblekjv/MostLikeShareActivity;

    # getter for: Lcom/hmobile/biblekjv/MostLikeShareActivity;->islike:Z
    invoke-static {v7}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->access$0(Lcom/hmobile/biblekjv/MostLikeShareActivity;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 251
    iget-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->txtLikeShare:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    iget v9, v3, Lcom/hmobile/model/LikeShareInfo;->likes:I

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 255
    :cond_0
    :goto_1
    iget-object v7, v3, Lcom/hmobile/model/LikeShareInfo;->book:Ljava/lang/String;

    invoke-static {v7}, Lcom/hmobile/model/BookInfo;->getBookIdByName(Ljava/lang/String;)I

    move-result v0

    .line 256
    .local v0, "book_id":I
    iget-object v7, v3, Lcom/hmobile/model/LikeShareInfo;->chapter:Ljava/lang/String;

    invoke-static {v7}, Lcom/hmobile/common/Utils;->ConvertToInt(Ljava/lang/String;)I

    move-result v1

    .line 257
    .local v1, "chap_id":I
    iget-object v7, v3, Lcom/hmobile/model/LikeShareInfo;->verse:Ljava/lang/String;

    invoke-static {v7}, Lcom/hmobile/common/Utils;->ConvertToInt(Ljava/lang/String;)I

    move-result v6

    .line 259
    .local v6, "verse_id":I
    iget-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->rlLikeItem:Landroid/widget/RelativeLayout;

    new-instance v8, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;

    invoke-direct {v8, p0, v0, v1, v6}, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter$1;-><init>(Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;III)V

    invoke-virtual {v7, v8}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 274
    return-object v5

    .line 232
    .end local v0    # "book_id":I
    .end local v1    # "chap_id":I
    .end local v3    # "info":Lcom/hmobile/model/LikeShareInfo;
    .end local v6    # "verse_id":I
    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    .end local v2    # "holder":Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;
    check-cast v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;

    .restart local v2    # "holder":Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;
    goto :goto_0

    .line 253
    .restart local v3    # "info":Lcom/hmobile/model/LikeShareInfo;
    :cond_2
    iget-object v7, v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;->txtLikeShare:Landroid/widget/TextView;

    new-instance v8, Ljava/lang/StringBuilder;

    iget v9, v3, Lcom/hmobile/model/LikeShareInfo;->shares:I

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method
