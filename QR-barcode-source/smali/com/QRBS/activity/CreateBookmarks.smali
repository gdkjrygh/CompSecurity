.class public Lcom/QRBS/activity/CreateBookmarks;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CreateBookmarks.java"


# instance fields
.field encode:Landroid/widget/Button;

.field pick:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 27
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    const v3, 0x7f030021

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateBookmarks;->setContentView(I)V

    .line 30
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateBookmarks;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 31
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 32
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 33
    const v3, 0x7f0800cc

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 34
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 37
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateBookmarks;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 38
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 39
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 41
    const v3, 0x7f0d0078

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateBookmarks;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateBookmarks;->pick:Landroid/widget/Button;

    .line 42
    iget-object v3, p0, Lcom/QRBS/activity/CreateBookmarks;->pick:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateBookmarks$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateBookmarks$1;-><init>(Lcom/QRBS/activity/CreateBookmarks;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    const v3, 0x7f0d0079

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateBookmarks;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateBookmarks;->encode:Landroid/widget/Button;

    .line 51
    iget-object v3, p0, Lcom/QRBS/activity/CreateBookmarks;->encode:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateBookmarks$2;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateBookmarks$2;-><init>(Lcom/QRBS/activity/CreateBookmarks;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateBookmarks;->finish()V

    .line 75
    const/4 v0, 0x1

    return v0
.end method
