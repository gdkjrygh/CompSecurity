.class public Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;
.super Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field private final g:Lcom/qihoo/security/gamebooster/GameBoosterActivity;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 1

    .prologue
    .line 1049
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;-><init>()V

    .line 1050
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->g:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    .line 1051
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->a:I

    .line 1052
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 1075
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    .line 1076
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->g:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 1078
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->d:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_1

    .line 1079
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->g:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->d:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 1081
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->e:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_2

    .line 1082
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->g:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->e:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 1084
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->f:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_3

    .line 1085
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->g:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->f:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterFolderAllLikeData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-static {v1, v0, v2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 1087
    :cond_3
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 1102
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v0, :cond_0

    .line 1103
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 1104
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1105
    const/4 v0, 0x0

    .line 1108
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/16 v2, 0xfa

    const/16 v1, 0x8

    .line 1056
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$d;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V

    .line 1057
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->b(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1058
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->c(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1059
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1060
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1061
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1063
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->e(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;Ljava/lang/Object;)V

    .line 1064
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->f(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Ljava/lang/Object;)V

    .line 1065
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->g(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 1066
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c()V

    .line 1067
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v0, :cond_0

    .line 1068
    iget-object v0, p1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1072
    :goto_0
    return-void

    .line 1070
    :cond_0
    iget-object v0, p1, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->a:Landroid/view/View;

    invoke-static {v2, v2, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0
.end method

.method protected a(Ljava/lang/Object;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 1090
    instance-of v0, p1, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    .line 1091
    check-cast p1, Lcom/qihoo/security/ui/result/AdvData;

    .line 1092
    iget v0, p1, Lcom/qihoo/security/ui/result/AdvData;->type:I

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 1093
    iget-object v0, p1, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0, p2}, Lcom/facebook/ads/NativeAd;->a(Landroid/view/View;)V

    .line 1094
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->g:Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    iget-object v1, p1, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-static {v0, v1, p2}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity;Lcom/facebook/ads/NativeAd;Landroid/view/View;)V

    .line 1097
    :cond_0
    return-void
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
    .line 1113
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1114
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    .line 1115
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->c:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1117
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->d:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_1

    .line 1118
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->d:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1120
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->e:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_2

    .line 1121
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->e:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1123
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->f:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_3

    .line 1124
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$e;->f:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1126
    :cond_3
    return-object v1
.end method
