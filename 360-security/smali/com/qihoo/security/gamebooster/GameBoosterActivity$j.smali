.class Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;
.super Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "j"
.end annotation


# instance fields
.field c:Lcom/qihoo/security/ui/result/AdvData;

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/ui/result/AdvData;Ljava/lang/String;Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 1

    .prologue
    .line 1296
    invoke-direct {p0, p1, p3}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;-><init>(Lcom/qihoo/security/ui/result/AdvData;Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    .line 1297
    const/4 v0, 0x5

    iput v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;->a:I

    .line 1298
    iput-object p2, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;->f:Ljava/lang/String;

    .line 1299
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;->c:Lcom/qihoo/security/ui/result/AdvData;

    .line 1300
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V
    .locals 3

    .prologue
    .line 1309
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$k;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V

    .line 1310
    if-nez p1, :cond_1

    .line 1328
    :cond_0
    :goto_0
    return-void

    .line 1313
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->btnName:Ljava/lang/String;

    .line 1314
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;->c:Lcom/qihoo/security/ui/result/AdvData;

    iget v1, v1, Lcom/qihoo/security/ui/result/AdvData;->starLevel:F

    .line 1316
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->r(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1317
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->r(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1319
    :cond_2
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->s(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/RatingBar;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1321
    const/4 v0, 0x0

    cmpl-float v0, v1, v0

    if-eqz v0, :cond_3

    .line 1322
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->s(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/RatingBar;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setRating(F)V

    goto :goto_0

    .line 1324
    :cond_3
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->s(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/widget/RatingBar;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setRating(F)V

    goto :goto_0
.end method

.method protected c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1304
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$j;->f:Ljava/lang/String;

    return-object v0
.end method
