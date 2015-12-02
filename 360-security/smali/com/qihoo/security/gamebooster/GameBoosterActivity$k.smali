.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;
.super Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "k"
.end annotation


# instance fields
.field d:Lcom/qihoo/security/ui/result/AdvData;

.field e:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 1

    .prologue
    .line 1341
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;-><init>()V

    .line 1342
    const/4 v0, 0x6

    iput v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->a:I

    .line 1343
    iput-object p2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->e:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    .line 1344
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    .line 1345
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V
    .locals 4

    .prologue
    .line 1357
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V

    .line 1358
    if-nez p1, :cond_0

    .line 1380
    :goto_0
    return-void

    .line 1361
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    .line 1362
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->icon:Ljava/lang/String;

    .line 1363
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->c()Ljava/lang/String;

    move-result-object v2

    .line 1364
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->t(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 1365
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->t(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1367
    :cond_1
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->q(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1368
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->q(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1370
    :cond_2
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->u(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    .line 1371
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->u(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    move-result-object v0

    const v2, 0x7f02015d

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    .line 1373
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    iget v0, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    if-nez v0, :cond_4

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->v(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_4

    .line 1375
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->v(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/NativeAd;->a(Landroid/view/View;)V

    .line 1376
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->e:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v1, v1, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->v(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/facebook/ads/NativeAd;Landroid/view/View;)V

    .line 1378
    :cond_4
    iget-object v0, p1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1379
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->e:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderHotAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    goto :goto_0
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1384
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1385
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1386
    return-object v0
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1348
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    if-nez v0, :cond_0

    .line 1349
    const-string/jumbo v0, ""

    .line 1351
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->d:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->btnDesc:Ljava/lang/String;

    goto :goto_0
.end method
