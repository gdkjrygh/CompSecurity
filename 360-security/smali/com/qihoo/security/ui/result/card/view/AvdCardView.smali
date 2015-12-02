.class public Lcom/qihoo/security/ui/result/card/view/AvdCardView;
.super Lcom/qihoo/security/ui/result/card/view/CardView;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field protected a:Lcom/qihoo/security/ui/result/AdvData;

.field protected b:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/ui/result/card/view/AvdCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/ui/result/card/view/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    iput-object p1, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->c:Landroid/content/Context;

    .line 47
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    .line 97
    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/facebook/ads/NativeAd;->a(Landroid/view/View;)V

    .line 99
    :cond_0
    return-void
.end method

.method public a(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 57
    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 58
    instance-of v0, p1, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;

    if-eqz v0, :cond_1

    .line 59
    check-cast p1, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;

    invoke-virtual {p1, p2, v1}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->b(Ljava/lang/String;I)V

    .line 64
    :cond_0
    :goto_0
    return-void

    .line 60
    :cond_1
    instance-of v0, p1, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    if-eqz v0, :cond_0

    .line 61
    check-cast p1, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    invoke-virtual {p1, p2, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    goto :goto_0
.end method

.method protected a(Landroid/widget/RatingBar;)V
    .locals 2

    .prologue
    .line 87
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget v0, v0, Lcom/qihoo/security/ui/result/AdvData;->starLevel:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget v0, v0, Lcom/qihoo/security/ui/result/AdvData;->starLevel:F

    invoke-virtual {p1, v0}, Landroid/widget/RatingBar;->setRating(F)V

    .line 92
    :goto_0
    return-void

    .line 90
    :cond_0
    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0}, Landroid/widget/RatingBar;->setRating(F)V

    goto :goto_0
.end method

.method public a(Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->btnDesc:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->btnDesc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->btnName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->btnName:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :goto_0
    return-void

    .line 82
    :cond_1
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c01c4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public getAssertRemoteImageViews()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/widget/ImageView/AssertRemoteImageView;",
            ">;"
        }
    .end annotation

    .prologue
    .line 133
    const/4 v0, 0x0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 103
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    :cond_0
    :goto_0
    return-void

    .line 106
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 112
    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v1

    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V

    .line 114
    invoke-static {}, Lcom/qihoo/security/ui/result/f;->a()Lcom/qihoo/security/ui/result/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/f;->b()Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    if-eqz v0, :cond_2

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    goto :goto_0

    .line 123
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 124
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/result/a;->a(Lcom/qihoo/security/ui/result/AdvData;)V

    goto :goto_0

    .line 127
    :cond_3
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c00c4

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0
.end method

.method public setDescriptionText(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->des:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 71
    :cond_0
    :goto_0
    return-void

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->des:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setTitleText(Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 54
    :cond_0
    :goto_0
    return-void

    .line 53
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/result/card/view/AvdCardView;->a:Lcom/qihoo/security/ui/result/AdvData;

    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->title:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
