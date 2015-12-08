.class Lcom/jirbo/adcolony/AdColonyNativeAdView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/jirbo/adcolony/AdColonyNativeAdView;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/AdColonyNativeAdView;)V
    .locals 0

    .prologue
    .line 309
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x3

    const/4 v4, 0x1

    .line 312
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 314
    if-nez v0, :cond_1

    .line 316
    new-array v0, v1, [F

    .line 317
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    invoke-static {v1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    .line 318
    const/4 v1, 0x2

    aget v2, v0, v1

    const v3, 0x3f4ccccd    # 0.8f

    mul-float/2addr v2, v3

    aput v2, v0, v1

    .line 319
    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/widget/Button;->setBackgroundColor(I)V

    .line 350
    :cond_0
    :goto_0
    return v4

    .line 321
    :cond_1
    if-ne v0, v1, :cond_2

    .line 324
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 326
    :cond_2
    if-ne v0, v4, :cond_0

    .line 328
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-boolean v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->J:Z

    if-eqz v0, :cond_3

    .line 330
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    sget-object v1, Lcom/jirbo/adcolony/AdColonyIAPEngagement;->OVERLAY:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    iput-object v1, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->an:Lcom/jirbo/adcolony/AdColonyIAPEngagement;

    .line 331
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iput-boolean v4, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->u:Z

    goto :goto_0

    .line 334
    :cond_3
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ac:Ljava/lang/String;

    const-string v1, "install"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ac:Ljava/lang/String;

    const-string v1, "url"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 336
    :cond_4
    sget-object v0, Lcom/jirbo/adcolony/a;->l:Lcom/jirbo/adcolony/d;

    iget-object v0, v0, Lcom/jirbo/adcolony/d;->d:Lcom/jirbo/adcolony/u;

    const-string v1, "native_overlay_click"

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyNativeAdView;->K:Lcom/jirbo/adcolony/AdColonyInterstitialAd;

    invoke-virtual {v0, v1, v2}, Lcom/jirbo/adcolony/u;->b(Ljava/lang/String;Lcom/jirbo/adcolony/AdColonyAd;)V

    .line 339
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    iget-object v2, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v2, v2, Lcom/jirbo/adcolony/AdColonyNativeAdView;->ab:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 340
    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 348
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyNativeAdView;->Z:Landroid/widget/Button;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyNativeAdView$1;->a:Lcom/jirbo/adcolony/AdColonyNativeAdView;

    iget v1, v1, Lcom/jirbo/adcolony/AdColonyNativeAdView;->at:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundColor(I)V

    goto :goto_0

    .line 344
    :catch_0
    move-exception v0

    invoke-static {}, Lcom/jirbo/adcolony/a;->b()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "Unable to open store."

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1
.end method
