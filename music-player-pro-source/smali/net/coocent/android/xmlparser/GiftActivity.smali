.class public Lnet/coocent/android/xmlparser/GiftActivity;
.super Landroid/app/Activity;
.source "GiftActivity.java"

# interfaces
.implements Lnet/coocent/android/xmlparser/LoadAppInfoListener;


# static fields
.field public static final NET_LOADING:I = 0x7

.field private static final startAnim:I = 0x0

.field private static final stopAnim:I = 0x1


# instance fields
.field private giftGridView:Landroid/widget/GridView;

.field private giftListViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

.field private handler:Landroid/os/Handler;

.field private iv_gift_loading:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 38
    new-instance v0, Lnet/coocent/android/xmlparser/GiftActivity$1;

    invoke-direct {v0, p0}, Lnet/coocent/android/xmlparser/GiftActivity$1;-><init>(Lnet/coocent/android/xmlparser/GiftActivity;)V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity;->handler:Landroid/os/Handler;

    .line 17
    return-void
.end method

.method static synthetic access$0(Lnet/coocent/android/xmlparser/GiftActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;

    return-object v0
.end method

.method private findView()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 57
    sget v2, Lnet/coocent/promotionsdk/R$id;->iv_gift_loading:I

    invoke-virtual {p0, v2}, Lnet/coocent/android/xmlparser/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, Lnet/coocent/android/xmlparser/GiftActivity;->iv_gift_loading:Landroid/widget/ImageView;

    .line 58
    sget v2, Lnet/coocent/promotionsdk/R$id;->lvGift:I

    invoke-virtual {p0, v2}, Lnet/coocent/android/xmlparser/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/GridView;

    iput-object v2, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftGridView:Landroid/widget/GridView;

    .line 59
    invoke-static {}, Lnet/coocent/android/xmlparser/PromotionSDK;->GetAppInfoList()Ljava/util/ArrayList;

    move-result-object v0

    .line 60
    .local v0, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    if-nez v0, :cond_0

    .line 61
    iget-object v2, p0, Lnet/coocent/android/xmlparser/GiftActivity;->handler:Landroid/os/Handler;

    invoke-virtual {v2, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 62
    new-instance v1, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;

    invoke-direct {v1, p0, p0}, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;-><init>(Lnet/coocent/android/xmlparser/LoadAppInfoListener;Landroid/content/Context;)V

    .line 63
    .local v1, "task":Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "http://www.coocent.net/coocentPromotion/yonggift/giftList.xml"

    aput-object v3, v2, v4

    invoke-virtual {v1, v2}, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 65
    .end local v1    # "task":Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;
    :cond_0
    new-instance v2, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    iget-object v3, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftGridView:Landroid/widget/GridView;

    invoke-direct {v2, p0, v0, v3}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Landroid/widget/GridView;)V

    iput-object v2, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftListViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    .line 66
    iget-object v2, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftGridView:Landroid/widget/GridView;

    iget-object v3, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftListViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    invoke-virtual {v2, v3}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 67
    iget-object v2, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftGridView:Landroid/widget/GridView;

    .line 68
    iget-object v3, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftListViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    .line 67
    invoke-static {v2, v3}, Lnet/coocent/android/xmlparser/PromotionSDK;->setListOnItemClickListner(Landroid/widget/GridView;Lnet/coocent/android/xmlparser/GiftGridViewAdapter;)V

    .line 70
    sget v2, Lnet/coocent/promotionsdk/R$id;->back:I

    invoke-virtual {p0, v2}, Lnet/coocent/android/xmlparser/GiftActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lnet/coocent/android/xmlparser/GiftActivity$2;

    invoke-direct {v3, p0}, Lnet/coocent/android/xmlparser/GiftActivity$2;-><init>(Lnet/coocent/android/xmlparser/GiftActivity;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    return-void
.end method


# virtual methods
.method public onAppInfoLoaded(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 80
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity;->giftListViewAdapter:Lnet/coocent/android/xmlparser/GiftGridViewAdapter;

    invoke-virtual {v0, p1}, Lnet/coocent/android/xmlparser/GiftGridViewAdapter;->changeData(Ljava/util/ArrayList;)V

    .line 81
    iget-object v0, p0, Lnet/coocent/android/xmlparser/GiftActivity;->handler:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 82
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 30
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnet/coocent/android/xmlparser/GiftActivity;->requestWindowFeature(I)Z

    .line 31
    sget v0, Lnet/coocent/promotionsdk/R$layout;->activity_gift:I

    invoke-virtual {p0, v0}, Lnet/coocent/android/xmlparser/GiftActivity;->setContentView(I)V

    .line 33
    invoke-direct {p0}, Lnet/coocent/android/xmlparser/GiftActivity;->findView()V

    .line 35
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 36
    return-void
.end method
