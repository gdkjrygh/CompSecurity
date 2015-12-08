.class public Lcom/QRBS/activity/Licenza;
.super Lcom/actionbarsherlock/app/SherlockFragmentActivity;
.source "Licenza.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 10
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    const v8, 0x7f0800b1

    const/4 v9, 0x1

    .line 21
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    const v6, 0x7f03002e

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/Licenza;->setContentView(I)V

    .line 23
    invoke-virtual {p0}, Lcom/QRBS/activity/Licenza;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 24
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v6, 0x7f0200d4

    invoke-virtual {v0, v6}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 25
    invoke-virtual {v0, v8}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 26
    invoke-virtual {p0}, Lcom/QRBS/activity/Licenza;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f0800f4

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 27
    invoke-virtual {v0, v9}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 30
    const v6, 0x7f0d0061

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/Licenza;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 31
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v6, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v6}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v6}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 32
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 34
    invoke-virtual {p0}, Lcom/QRBS/activity/Licenza;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v6

    const-string v7, "a.otf"

    invoke-static {v6, v7}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    .line 35
    .local v5, "typeface":Landroid/graphics/Typeface;
    const v6, 0x7f0d009e

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/Licenza;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 36
    .local v3, "textview":Landroid/widget/TextView;
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 37
    const v6, 0x7f0d009f

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/Licenza;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 38
    .local v4, "textview1":Landroid/widget/TextView;
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 39
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/QRBS/activity/Licenza;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 40
    invoke-virtual {p0}, Lcom/QRBS/activity/Licenza;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0800f5

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 39
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/QRBS/activity/Licenza;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0800f6

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 42
    const-string v7, "https://github.com/zxing/zxing"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 43
    invoke-virtual {p0}, Lcom/QRBS/activity/Licenza;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0800f7

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\n"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 44
    const-string v7, "http://www.apache.org/licenses/LICENSE-2.0"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 41
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    invoke-static {v4, v9}, Landroid/text/util/Linkify;->addLinks(Landroid/widget/TextView;I)Z

    .line 46
    return-void
.end method
