.class Lcom/yong/gift/GiftListViewAdapter$1;
.super Ljava/lang/Object;
.source "GiftListViewAdapter.java"

# interfaces
.implements Lcom/yong/gift/AsyncGiftImageLoader$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yong/gift/GiftListViewAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/ListView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/gift/GiftListViewAdapter;

.field private final synthetic val$lvNetMusics:Landroid/widget/ListView;


# direct methods
.method constructor <init>(Lcom/yong/gift/GiftListViewAdapter;Landroid/widget/ListView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/gift/GiftListViewAdapter$1;->this$0:Lcom/yong/gift/GiftListViewAdapter;

    iput-object p2, p0, Lcom/yong/gift/GiftListViewAdapter$1;->val$lvNetMusics:Landroid/widget/ListView;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public imageLoaded(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 41
    iget-object v1, p0, Lcom/yong/gift/GiftListViewAdapter$1;->val$lvNetMusics:Landroid/widget/ListView;

    invoke-virtual {v1, p1}, Landroid/widget/ListView;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 42
    .local v0, "iv":Landroid/widget/ImageView;
    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 44
    :cond_0
    return-void
.end method
