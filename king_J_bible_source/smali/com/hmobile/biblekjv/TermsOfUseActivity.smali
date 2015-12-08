.class public Lcom/hmobile/biblekjv/TermsOfUseActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "TermsOfUseActivity.java"


# instance fields
.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field private txtContentText:Landroid/widget/TextView;

.field private txtHeader:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->finish()V

    .line 43
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 19
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 20
    const v0, 0x7f030018

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->setContentView(I)V

    .line 22
    const v0, 0x7f0e0089

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->txtContentText:Landroid/widget/TextView;

    .line 23
    const v0, 0x7f0e0087

    invoke-virtual {p0, v0}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->txtHeader:Landroid/widget/TextView;

    .line 25
    iget-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->txtContentText:Landroid/widget/TextView;

    .line 26
    const v1, 0x7f070088

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->txtHeader:Landroid/widget/TextView;

    const v1, 0x7f07004f

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    sget-boolean v0, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v0, :cond_0

    .line 29
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->addAdView()V

    .line 34
    :goto_0
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 35
    iget-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 36
    const v1, 0x7f070092

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 37
    iget-object v0, p0, Lcom/hmobile/biblekjv/TermsOfUseActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v1, "/TermsOfUseActivity"

    invoke-virtual {v0, v1}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 38
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/TermsOfUseActivity;->hideAdView()V

    goto :goto_0
.end method
