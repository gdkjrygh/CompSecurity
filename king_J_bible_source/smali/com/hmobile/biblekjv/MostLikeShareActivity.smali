.class public Lcom/hmobile/biblekjv/MostLikeShareActivity;
.super Lcom/hmobile/biblekjv/BaseActivity;
.source "MostLikeShareActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;,
        Lcom/hmobile/biblekjv/MostLikeShareActivity$ViewHolder;,
        Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;
    }
.end annotation


# instance fields
.field adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

.field async:Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;

.field private btnMostLike:Landroid/widget/Button;

.field private btnMostShare:Landroid/widget/Button;

.field infoLikes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field

.field infoShares:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field

.field infos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field

.field private islike:Z

.field private lstMostLikeShare:Landroid/widget/ListView;

.field private mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

.field private mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

.field private tabView:Lcom/hmobile/tab/TabView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/hmobile/biblekjv/BaseActivity;-><init>()V

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->islike:Z

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infos:Ljava/util/ArrayList;

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoLikes:Ljava/util/ArrayList;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoShares:Ljava/util/ArrayList;

    .line 29
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/MostLikeShareActivity;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->islike:Z

    return v0
.end method

.method static synthetic access$1(Lcom/hmobile/biblekjv/MostLikeShareActivity;Z)V
    .locals 0

    .prologue
    .line 34
    iput-boolean p1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->islike:Z

    return-void
.end method

.method static synthetic access$2(Lcom/hmobile/biblekjv/MostLikeShareActivity;)Landroid/widget/Button;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostLike:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic access$3(Lcom/hmobile/biblekjv/MostLikeShareActivity;)Landroid/widget/Button;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostShare:Landroid/widget/Button;

    return-object v0
.end method


# virtual methods
.method public bindData()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 176
    iget-boolean v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->islike:Z

    if-eqz v0, :cond_1

    .line 177
    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    .line 178
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoLikes:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 179
    new-instance v0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoLikes:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;-><init>(Lcom/hmobile/biblekjv/MostLikeShareActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    .line 180
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->lstMostLikeShare:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 189
    :cond_0
    :goto_0
    return-void

    .line 183
    :cond_1
    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    .line 184
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoShares:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 185
    new-instance v0, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->infoShares:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;-><init>(Lcom/hmobile/biblekjv/MostLikeShareActivity;Ljava/util/ArrayList;)V

    iput-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    .line 186
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->lstMostLikeShare:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->adapter:Lcom/hmobile/biblekjv/MostLikeShareActivity$LikeShareAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 286
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v5, 0x0

    const v4, 0x7f0700b8

    const/4 v3, 0x1

    .line 46
    invoke-super {p0, p1}, Lcom/hmobile/biblekjv/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 47
    new-instance v0, Lcom/hmobile/biblekjv/TabProvider;

    invoke-direct {v0, p0}, Lcom/hmobile/biblekjv/TabProvider;-><init>(Landroid/app/Activity;)V

    .line 48
    .local v0, "tabProvider":Lcom/hmobile/tab/TabHostProvider;
    const-string v1, "main"

    invoke-virtual {v0, v1}, Lcom/hmobile/tab/TabHostProvider;->getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->tabView:Lcom/hmobile/tab/TabView;

    .line 49
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->tabView:Lcom/hmobile/tab/TabView;

    const v2, 0x7f030025

    invoke-virtual {v1, v2}, Lcom/hmobile/tab/TabView;->setCurrentView(I)V

    .line 50
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->tabView:Lcom/hmobile/tab/TabView;

    invoke-virtual {v1, v3}, Lcom/hmobile/tab/TabView;->render(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->setContentView(Landroid/view/View;)V

    .line 52
    invoke-static {p0}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getInstance(Landroid/content/Context;)Lcom/google/analytics/tracking/android/GoogleAnalytics;

    move-result-object v1

    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 55
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->mGaInstance:Lcom/google/analytics/tracking/android/GoogleAnalytics;

    .line 56
    const v2, 0x7f070092

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/GoogleAnalytics;->getTracker(Ljava/lang/String;)Lcom/google/analytics/tracking/android/Tracker;

    move-result-object v1

    .line 55
    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    .line 57
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->mGaTracker:Lcom/google/analytics/tracking/android/Tracker;

    const-string v2, "/MostLikedShared"

    invoke-virtual {v1, v2}, Lcom/google/analytics/tracking/android/Tracker;->sendView(Ljava/lang/String;)V

    .line 59
    const v1, 0x7f0e00b1

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->lstMostLikeShare:Landroid/widget/ListView;

    .line 60
    const v1, 0x7f0e00af

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostLike:Landroid/widget/Button;

    .line 61
    const v1, 0x7f0e00b0

    invoke-virtual {p0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostShare:Landroid/widget/Button;

    .line 63
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostLike:Landroid/widget/Button;

    .line 64
    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 63
    invoke-virtual {p0, v1, v2}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->setFontStyleRoboto(Landroid/widget/Button;Ljava/lang/String;)V

    .line 65
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostShare:Landroid/widget/Button;

    .line 66
    invoke-virtual {p0, v4}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 65
    invoke-virtual {p0, v1, v2}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->setFontStyleRoboto(Landroid/widget/Button;Ljava/lang/String;)V

    .line 71
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostLike:Landroid/widget/Button;

    invoke-virtual {v1, v5, v3}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 72
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostShare:Landroid/widget/Button;

    invoke-virtual {v1, v5, v3}, Landroid/widget/Button;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 73
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostLike:Landroid/widget/Button;

    new-instance v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$1;

    invoke-direct {v2, p0}, Lcom/hmobile/biblekjv/MostLikeShareActivity$1;-><init>(Lcom/hmobile/biblekjv/MostLikeShareActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    iget-object v1, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->btnMostShare:Landroid/widget/Button;

    new-instance v2, Lcom/hmobile/biblekjv/MostLikeShareActivity$2;

    invoke-direct {v2, p0}, Lcom/hmobile/biblekjv/MostLikeShareActivity$2;-><init>(Lcom/hmobile/biblekjv/MostLikeShareActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    sget-boolean v1, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v1, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->addAdView()V

    .line 109
    :goto_0
    return-void

    .line 107
    :cond_0
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/MostLikeShareActivity;->hideAdView()V

    goto :goto_0
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 170
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->async:Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/hmobile/biblekjv/MostLikeShareActivity;->async:Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/hmobile/biblekjv/MostLikeShareActivity$getAllData;->cancel(Z)Z

    .line 172
    :cond_0
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onPause()V

    .line 173
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 113
    invoke-super {p0}, Lcom/hmobile/biblekjv/BaseActivity;->onResume()V

    .line 115
    return-void
.end method
