.class public Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;
.super Landroid/widget/BaseAdapter;
.source "FavoritesActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/FavoritesActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FavoriteListAdapter"
.end annotation


# instance fields
.field m_list:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/FavoriteInfo;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/hmobile/biblekjv/FavoritesActivity;


# direct methods
.method public constructor <init>(Lcom/hmobile/biblekjv/FavoritesActivity;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/FavoriteInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 219
    .local p2, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/FavoriteInfo;>;"
    iput-object p1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->this$0:Lcom/hmobile/biblekjv/FavoritesActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 217
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->m_list:Ljava/util/ArrayList;

    .line 220
    iput-object p2, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->m_list:Ljava/util/ArrayList;

    .line 221
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;)Lcom/hmobile/biblekjv/FavoritesActivity;
    .locals 1

    .prologue
    .line 216
    iget-object v0, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->this$0:Lcom/hmobile/biblekjv/FavoritesActivity;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 230
    iget-object v0, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 235
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 241
    move-object v4, p2

    .line 242
    .local v4, "rowView":Landroid/view/View;
    new-instance v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;

    invoke-direct {v2}, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;-><init>()V

    .line 243
    .local v2, "holder":Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;
    if-nez v4, :cond_0

    .line 244
    iget-object v5, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->this$0:Lcom/hmobile/biblekjv/FavoritesActivity;

    invoke-virtual {v5}, Lcom/hmobile/biblekjv/FavoritesActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    .line 245
    .local v3, "li":Landroid/view/LayoutInflater;
    const v5, 0x7f03001c

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 247
    invoke-virtual {v4, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 249
    const v5, 0x7f0e0099

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 248
    iput-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->txtFavoriteVerse:Landroid/widget/TextView;

    .line 251
    const v5, 0x7f0e006c

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    .line 250
    iput-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->txtTitle:Landroid/widget/TextView;

    .line 253
    const v5, 0x7f0e0098

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 252
    iput-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->rlFavorite:Landroid/widget/RelativeLayout;

    .line 255
    const v5, 0x7f0e009a

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    .line 254
    iput-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->imgDisLike:Landroid/widget/ImageView;

    .line 260
    .end local v3    # "li":Landroid/view/LayoutInflater;
    :goto_0
    iget-object v5, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->m_list:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/FavoriteInfo;

    .line 262
    .local v1, "fav_info":Lcom/hmobile/model/FavoriteInfo;
    iget-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->txtFavoriteVerse:Landroid/widget/TextView;

    iget-object v6, v1, Lcom/hmobile/model/FavoriteInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 264
    iget v5, v1, Lcom/hmobile/model/FavoriteInfo;->BookId:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 263
    invoke-static {v6, v7}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v0

    .line 265
    .local v0, "bookname":Ljava/lang/String;
    iget-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->txtTitle:Landroid/widget/TextView;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v1, Lcom/hmobile/model/FavoriteInfo;->ChapterNumber:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 266
    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v1, Lcom/hmobile/model/FavoriteInfo;->VerseNumber:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 265
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    iget-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->rlFavorite:Landroid/widget/RelativeLayout;

    new-instance v6, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;

    invoke-direct {v6, p0, v1}, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;-><init>(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;Lcom/hmobile/model/FavoriteInfo;)V

    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    iget-object v5, v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;->imgDisLike:Landroid/widget/ImageView;

    new-instance v6, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$2;

    invoke-direct {v6, p0, v1}, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$2;-><init>(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;Lcom/hmobile/model/FavoriteInfo;)V

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 293
    return-object v4

    .line 257
    .end local v0    # "bookname":Ljava/lang/String;
    .end local v1    # "fav_info":Lcom/hmobile/model/FavoriteInfo;
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    .end local v2    # "holder":Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;
    check-cast v2, Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;

    .restart local v2    # "holder":Lcom/hmobile/biblekjv/FavoritesActivity$ViewHolderForFavorite;
    goto :goto_0
.end method
