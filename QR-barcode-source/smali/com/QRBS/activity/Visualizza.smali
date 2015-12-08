.class public Lcom/QRBS/activity/Visualizza;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "Visualizza.java"


# instance fields
.field b:Landroid/os/Bundle;

.field t:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 23
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    const v4, 0x7f030042

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/Visualizza;->setContentView(I)V

    .line 26
    invoke-virtual {p0}, Lcom/QRBS/activity/Visualizza;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 27
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v4, 0x7f0200d4

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 28
    const v4, 0x7f0800b1

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 29
    const v4, 0x7f0800d8

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 30
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 33
    const v4, 0x7f0d0061

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/Visualizza;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 34
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v4, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v4}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v4}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 35
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 37
    const v4, 0x7f0d00e9

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/Visualizza;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lcom/QRBS/activity/Visualizza;->t:Landroid/widget/TextView;

    .line 38
    invoke-virtual {p0}, Lcom/QRBS/activity/Visualizza;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "bundle"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    iput-object v4, p0, Lcom/QRBS/activity/Visualizza;->b:Landroid/os/Bundle;

    .line 39
    iget-object v4, p0, Lcom/QRBS/activity/Visualizza;->b:Landroid/os/Bundle;

    if-eqz v4, :cond_0

    .line 40
    iget-object v4, p0, Lcom/QRBS/activity/Visualizza;->b:Landroid/os/Bundle;

    const-string v5, "label"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 41
    .local v3, "label":Ljava/lang/String;
    iget-object v4, p0, Lcom/QRBS/activity/Visualizza;->t:Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .end local v3    # "label":Ljava/lang/String;
    :cond_0
    return-void
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/QRBS/activity/Visualizza;->getSupportMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0009

    invoke-virtual {v0, v1, p1}, Lcom/actionbarsherlock/view/MenuInflater;->inflate(ILcom/actionbarsherlock/view/Menu;)V

    .line 50
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 6
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v5, 0x1

    .line 56
    invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    .line 72
    :goto_0
    return v5

    .line 58
    :sswitch_0
    iget-object v3, p0, Lcom/QRBS/activity/Visualizza;->b:Landroid/os/Bundle;

    const-string v4, "label"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 59
    .local v1, "label":Ljava/lang/String;
    iget-object v3, p0, Lcom/QRBS/activity/Visualizza;->b:Landroid/os/Bundle;

    const-string v4, "TEXT"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 60
    .local v2, "text":Ljava/lang/String;
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {v0, p0}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 61
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    invoke-virtual {v0, v2, v1}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 64
    .end local v0    # "eu":Lcom/scannerfire/utils/EncodeUtils;
    .end local v1    # "label":Ljava/lang/String;
    .end local v2    # "text":Ljava/lang/String;
    :sswitch_1
    invoke-virtual {p0}, Lcom/QRBS/activity/Visualizza;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/QRBS/activity/Visualizza;->t:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->copyToClipboard(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 68
    :sswitch_2
    invoke-virtual {p0}, Lcom/QRBS/activity/Visualizza;->finish()V

    goto :goto_0

    .line 56
    :sswitch_data_0
    .sparse-switch
        0x102002c -> :sswitch_2
        0x7f0d00be -> :sswitch_0
        0x7f0d00f5 -> :sswitch_1
    .end sparse-switch
.end method
