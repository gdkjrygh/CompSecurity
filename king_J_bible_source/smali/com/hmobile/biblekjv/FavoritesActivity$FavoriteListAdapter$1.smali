.class Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;
.super Ljava/lang/Object;
.source "FavoritesActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

.field private final synthetic val$fav_info:Lcom/hmobile/model/FavoriteInfo;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;Lcom/hmobile/model/FavoriteInfo;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->this$1:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->val$fav_info:Lcom/hmobile/model/FavoriteInfo;

    .line 267
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 271
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->this$1:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    # getter for: Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->this$0:Lcom/hmobile/biblekjv/FavoritesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->access$0(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;)Lcom/hmobile/biblekjv/FavoritesActivity;

    move-result-object v1

    .line 272
    const-class v2, Lcom/hmobile/biblekjv/MainBookActivity;

    .line 271
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 273
    .local v0, "i":Landroid/content/Intent;
    const-string v1, "isFromFavorite"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 274
    const-string v1, "book_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->val$fav_info:Lcom/hmobile/model/FavoriteInfo;

    iget v2, v2, Lcom/hmobile/model/FavoriteInfo;->BookId:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 275
    const-string v1, "chap_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->val$fav_info:Lcom/hmobile/model/FavoriteInfo;

    iget v2, v2, Lcom/hmobile/model/FavoriteInfo;->ChapterNumber:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 276
    const-string v1, "verse_id"

    iget-object v2, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->val$fav_info:Lcom/hmobile/model/FavoriteInfo;

    iget v2, v2, Lcom/hmobile/model/FavoriteInfo;->VerseNumber:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 277
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->this$1:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    # getter for: Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->this$0:Lcom/hmobile/biblekjv/FavoritesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->access$0(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;)Lcom/hmobile/biblekjv/FavoritesActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/FavoritesActivity;->startActivity(Landroid/content/Intent;)V

    .line 278
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$1;->this$1:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    # getter for: Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->this$0:Lcom/hmobile/biblekjv/FavoritesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->access$0(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;)Lcom/hmobile/biblekjv/FavoritesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/FavoritesActivity;->finish()V

    .line 279
    return-void
.end method
