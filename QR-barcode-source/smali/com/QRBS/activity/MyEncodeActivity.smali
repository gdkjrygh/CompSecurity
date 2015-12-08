.class public Lcom/QRBS/activity/MyEncodeActivity;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "MyEncodeActivity.java"


# instance fields
.field bmp:Landroid/graphics/Bitmap;

.field color:Landroid/widget/Button;

.field image:Landroid/widget/ImageView;

.field share:Landroid/widget/Button;

.field text:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public changeBmp(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "b"    # Landroid/graphics/Bitmap;

    .prologue
    .line 112
    iput-object p1, p0, Lcom/QRBS/activity/MyEncodeActivity;->bmp:Landroid/graphics/Bitmap;

    .line 113
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 33
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 34
    const v4, 0x7f03002a

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/MyEncodeActivity;->setContentView(I)V

    .line 36
    invoke-virtual {p0}, Lcom/QRBS/activity/MyEncodeActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 37
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v4, 0x7f0200d4

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 38
    const v4, 0x7f0800b1

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 39
    const v4, 0x7f0800d5

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 40
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 43
    const v4, 0x7f0d0061

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/MyEncodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 44
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v4, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v4}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v4}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 45
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 47
    :cond_0
    const v4, 0x7f0d0092

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/MyEncodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    iput-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->share:Landroid/widget/Button;

    .line 48
    const v4, 0x7f0d0097

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/MyEncodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    iput-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->color:Landroid/widget/Button;

    .line 49
    const v4, 0x7f0d0096

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/MyEncodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->image:Landroid/widget/ImageView;

    .line 50
    const v4, 0x7f0d0059

    invoke-virtual {p0, v4}, Lcom/QRBS/activity/MyEncodeActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->text:Landroid/widget/TextView;

    .line 51
    invoke-virtual {p0}, Lcom/QRBS/activity/MyEncodeActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 52
    .local v3, "i":Landroid/content/Intent;
    if-eqz v3, :cond_2

    .line 53
    const-string v4, "image"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, Landroid/graphics/Bitmap;

    iput-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->bmp:Landroid/graphics/Bitmap;

    .line 54
    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->bmp:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_1

    .line 55
    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->image:Landroid/widget/ImageView;

    iget-object v5, p0, Lcom/QRBS/activity/MyEncodeActivity;->bmp:Landroid/graphics/Bitmap;

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 57
    :cond_1
    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->text:Landroid/widget/TextView;

    const-string v5, "text"

    invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    :cond_2
    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->share:Landroid/widget/Button;

    new-instance v5, Lcom/QRBS/activity/MyEncodeActivity$1;

    invoke-direct {v5, p0}, Lcom/QRBS/activity/MyEncodeActivity$1;-><init>(Lcom/QRBS/activity/MyEncodeActivity;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    iget-object v4, p0, Lcom/QRBS/activity/MyEncodeActivity;->color:Landroid/widget/Button;

    new-instance v5, Lcom/QRBS/activity/MyEncodeActivity$2;

    invoke-direct {v5, p0}, Lcom/QRBS/activity/MyEncodeActivity$2;-><init>(Lcom/QRBS/activity/MyEncodeActivity;)V

    invoke-virtual {v4, v5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 118
    invoke-virtual {p0}, Lcom/QRBS/activity/MyEncodeActivity;->finish()V

    .line 119
    const/4 v0, 0x1

    return v0
.end method
