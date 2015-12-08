.class Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$2;
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
    iput-object p1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$2;->this$1:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    iput-object p2, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$2;->val$fav_info:Lcom/hmobile/model/FavoriteInfo;

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 286
    :try_start_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$2;->val$fav_info:Lcom/hmobile/model/FavoriteInfo;

    invoke-virtual {v1}, Lcom/hmobile/model/FavoriteInfo;->delete()Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    :goto_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter$2;->this$1:Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;

    # getter for: Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->this$0:Lcom/hmobile/biblekjv/FavoritesActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;->access$0(Lcom/hmobile/biblekjv/FavoritesActivity$FavoriteListAdapter;)Lcom/hmobile/biblekjv/FavoritesActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/FavoritesActivity;->LoadViewForFavorite()V

    .line 291
    return-void

    .line 287
    :catch_0
    move-exception v0

    .line 288
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method
