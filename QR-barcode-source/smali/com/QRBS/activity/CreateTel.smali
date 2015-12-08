.class public Lcom/QRBS/activity/CreateTel;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CreateTel.java"


# instance fields
.field final PICK_CONTACT_REQUEST:I

.field encode:Landroid/widget/Button;

.field pick:Landroid/widget/Button;

.field text:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lcom/QRBS/activity/CreateTel;->PICK_CONTACT_REQUEST:I

    .line 23
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CreateTel;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/QRBS/activity/CreateTel;->pickContact()V

    return-void
.end method

.method private pickContact()V
    .locals 3

    .prologue
    .line 71
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.PICK"

    const-string v2, "content://contacts"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 72
    .local v0, "pickContactIntent":Landroid/content/Intent;
    const-string v1, "vnd.android.cursor.dir/phone_v2"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/QRBS/activity/CreateTel;->startActivityForResult(Landroid/content/Intent;I)V

    .line 75
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 80
    if-nez p1, :cond_0

    .line 82
    const/4 v3, -0x1

    if-ne p2, v3, :cond_0

    .line 85
    const-string v3, ""

    const-string v4, "CHECK POINT"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 87
    .local v0, "contactUri":Landroid/net/Uri;
    new-instance v1, Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {v1, p0}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 88
    .local v1, "eu":Lcom/scannerfire/utils/EncodeUtils;
    invoke-virtual {v1, v0}, Lcom/scannerfire/utils/EncodeUtils;->getTel(Landroid/net/Uri;)[Ljava/lang/String;

    move-result-object v2

    .line 89
    .local v2, "ss":[Ljava/lang/String;
    const/4 v3, 0x0

    aget-object v3, v2, v3

    const/4 v4, 0x1

    aget-object v4, v2, v4

    invoke-virtual {v1, v3, v4}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .end local v0    # "contactUri":Landroid/net/Uri;
    .end local v1    # "eu":Lcom/scannerfire/utils/EncodeUtils;
    .end local v2    # "ss":[Ljava/lang/String;
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 31
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 32
    const v3, 0x7f030025

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateTel;->setContentView(I)V

    .line 34
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateTel;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 35
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 36
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 37
    const v3, 0x7f0800cf

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 38
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 41
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateTel;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 42
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 43
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 45
    const v3, 0x7f0d008c

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateTel;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateTel;->text:Landroid/widget/EditText;

    .line 46
    const v3, 0x7f0d0079

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateTel;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateTel;->encode:Landroid/widget/Button;

    .line 47
    const v3, 0x7f0d0078

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateTel;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateTel;->pick:Landroid/widget/Button;

    .line 49
    iget-object v3, p0, Lcom/QRBS/activity/CreateTel;->encode:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateTel$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateTel$1;-><init>(Lcom/QRBS/activity/CreateTel;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object v3, p0, Lcom/QRBS/activity/CreateTel;->pick:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateTel$2;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateTel$2;-><init>(Lcom/QRBS/activity/CreateTel;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 97
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateTel;->finish()V

    .line 98
    const/4 v0, 0x1

    return v0
.end method
