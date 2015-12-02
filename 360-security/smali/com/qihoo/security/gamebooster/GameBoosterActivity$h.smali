.class public Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;
.super Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/GameBoosterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# direct methods
.method public constructor <init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V
    .locals 1

    .prologue
    .line 1210
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;-><init>(Lcom/qihoo/security/gamebooster/GameBoosterActivity;)V

    .line 1211
    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->a:I

    .line 1212
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 1226
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    instance-of v0, v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    if-eqz v0, :cond_0

    .line 1227
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 1228
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1229
    const/4 v0, 0x3

    .line 1232
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V
    .locals 2

    .prologue
    .line 1216
    invoke-super {p0, p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$g;->a(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)V

    .line 1217
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1218
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->d(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1219
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->n(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;Ljava/lang/Object;)V

    .line 1220
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->o(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Lcom/qihoo/security/widget/ImageView/FlashRemoteImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity;->a(Lcom/qihoo/security/widget/ImageView/RemoteImageView;Ljava/lang/Object;)V

    .line 1221
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->f:Ljava/lang/Object;

    invoke-static {p1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;->p(Lcom/qihoo/security/gamebooster/GameBoosterActivity$n;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/gamebooster/GameBoosterActivity$h;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 1222
    return-void
.end method
