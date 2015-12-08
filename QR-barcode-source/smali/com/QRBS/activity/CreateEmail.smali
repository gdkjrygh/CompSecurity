.class public Lcom/QRBS/activity/CreateEmail;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CreateEmail.java"


# instance fields
.field final PICK_CONTACT_REQUEST:I

.field encode:Landroid/widget/Button;

.field pick:Landroid/widget/Button;

.field text:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lcom/QRBS/activity/CreateEmail;->PICK_CONTACT_REQUEST:I

    .line 22
    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CreateEmail;)V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/QRBS/activity/CreateEmail;->pickContact()V

    return-void
.end method

.method private pickContact()V
    .locals 6

    .prologue
    .line 75
    new-instance v1, Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {v1, p0}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 76
    .local v1, "eu":Lcom/scannerfire/utils/EncodeUtils;
    invoke-virtual {v1, p0}, Lcom/scannerfire/utils/EncodeUtils;->getNameEmailDetails(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    .line 77
    .local v0, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v2, v3, :cond_0

    .line 81
    new-instance v2, Landroid/content/Intent;

    .end local v2    # "i":I
    const-class v3, Lcom/QRBS/activity/EmailList;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 82
    .local v2, "i":Landroid/content/Intent;
    const-string v3, "list"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 83
    invoke-virtual {p0, v2}, Lcom/QRBS/activity/CreateEmail;->startActivity(Landroid/content/Intent;)V

    .line 90
    return-void

    .line 78
    .local v2, "i":I
    :cond_0
    const-string v4, ""

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v3, "EMAIL -> "

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 77
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 30
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    const v3, 0x7f030023

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateEmail;->setContentView(I)V

    .line 33
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateEmail;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 34
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 35
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 36
    const v3, 0x7f0800ce

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 37
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 40
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateEmail;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 41
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 42
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 44
    const v3, 0x7f0d0085

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateEmail;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateEmail;->text:Landroid/widget/EditText;

    .line 45
    const v3, 0x7f0d0079

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateEmail;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateEmail;->encode:Landroid/widget/Button;

    .line 46
    const v3, 0x7f0d0078

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateEmail;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateEmail;->pick:Landroid/widget/Button;

    .line 48
    iget-object v3, p0, Lcom/QRBS/activity/CreateEmail;->encode:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateEmail$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateEmail$1;-><init>(Lcom/QRBS/activity/CreateEmail;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    iget-object v3, p0, Lcom/QRBS/activity/CreateEmail;->pick:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateEmail$2;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateEmail$2;-><init>(Lcom/QRBS/activity/CreateEmail;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 117
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateEmail;->finish()V

    .line 118
    const/4 v0, 0x1

    return v0
.end method
