.class public Lcom/QRBS/activity/CreateGps;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CreateGps.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;
    }
.end annotation


# static fields
.field protected static final PICK_CONTACT:I


# instance fields
.field activity:Landroid/app/Activity;

.field address:Landroid/widget/EditText;

.field current:Landroid/widget/Button;

.field encode:Landroid/widget/Button;

.field private geoCoder:Landroid/location/Geocoder;

.field lat:Landroid/widget/EditText;

.field locationListener:Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;

.field locationManager:Landroid/location/LocationManager;

.field lon:Landroid/widget/EditText;

.field maps:Landroid/widget/Button;

.field pick:Landroid/widget/Button;

.field prog:Landroid/app/ProgressDialog;

.field search:Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CreateGps;)Landroid/location/Geocoder;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps;->geoCoder:Landroid/location/Geocoder;

    return-object v0
.end method

.method static synthetic access$1(Lcom/QRBS/activity/CreateGps;)V
    .locals 0

    .prologue
    .line 272
    invoke-direct {p0}, Lcom/QRBS/activity/CreateGps;->showGPSDisabledAlertToUser()V

    return-void
.end method

.method private showGPSDisabledAlertToUser()V
    .locals 5

    .prologue
    .line 273
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 274
    .local v1, "alertDialogBuilder":Landroid/app/AlertDialog$Builder;
    const v2, 0x7f080106

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 275
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 276
    const v3, 0x7f080107

    .line 277
    new-instance v4, Lcom/QRBS/activity/CreateGps$6;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateGps$6;-><init>(Lcom/QRBS/activity/CreateGps;)V

    .line 276
    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 284
    const v2, 0x7f0800b7

    .line 285
    new-instance v3, Lcom/QRBS/activity/CreateGps$7;

    invoke-direct {v3, p0}, Lcom/QRBS/activity/CreateGps$7;-><init>(Lcom/QRBS/activity/CreateGps;)V

    .line 284
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 290
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 291
    .local v0, "alert":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 292
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8
    .param p1, "reqCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    const/4 v2, 0x0

    .line 213
    invoke-super {p0, p1, p2, p3}, Lcom/actionbarsherlock/app/SherlockActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 215
    packed-switch p1, :pswitch_data_0

    .line 233
    :cond_0
    :goto_0
    return-void

    .line 217
    :pswitch_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 218
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    .local v1, "contactData":Landroid/net/Uri;
    move-object v0, p0

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    .line 220
    invoke-virtual/range {v0 .. v5}, Lcom/QRBS/activity/CreateGps;->managedQuery(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 221
    .local v6, "c":Landroid/database/Cursor;
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 223
    :try_start_0
    const-string v0, "data1"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 224
    .local v7, "street":Ljava/lang/String;
    const-string v0, ""

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Address ->"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps;->address:Landroid/widget/EditText;

    invoke-virtual {v0, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 227
    .end local v7    # "street":Ljava/lang/String;
    :catch_0
    move-exception v0

    goto :goto_0

    .line 215
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 55
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    const v3, 0x7f030024

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->setContentView(I)V

    .line 57
    iput-object p0, p0, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    .line 59
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateGps;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 60
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 61
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 62
    const v3, 0x7f0800cd

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 63
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 66
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 67
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 68
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 70
    new-instance v3, Landroid/location/Geocoder;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->geoCoder:Landroid/location/Geocoder;

    .line 71
    const v3, 0x7f0d0086

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->address:Landroid/widget/EditText;

    .line 72
    const v3, 0x7f0d0088

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    .line 73
    const v3, 0x7f0d0089

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    .line 74
    const v3, 0x7f0d0087

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageButton;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->search:Landroid/widget/ImageButton;

    .line 75
    const v3, 0x7f0d0079

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->encode:Landroid/widget/Button;

    .line 76
    const v3, 0x7f0d008a

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->current:Landroid/widget/Button;

    .line 77
    const v3, 0x7f0d008b

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->maps:Landroid/widget/Button;

    .line 78
    const v3, 0x7f0d0078

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateGps;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateGps;->pick:Landroid/widget/Button;

    .line 80
    iget-object v3, p0, Lcom/QRBS/activity/CreateGps;->search:Landroid/widget/ImageButton;

    new-instance v4, Lcom/QRBS/activity/CreateGps$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateGps$1;-><init>(Lcom/QRBS/activity/CreateGps;)V

    invoke-virtual {v3, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v3, p0, Lcom/QRBS/activity/CreateGps;->encode:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateGps$2;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateGps$2;-><init>(Lcom/QRBS/activity/CreateGps;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    iget-object v3, p0, Lcom/QRBS/activity/CreateGps;->current:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateGps$3;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateGps$3;-><init>(Lcom/QRBS/activity/CreateGps;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    iget-object v3, p0, Lcom/QRBS/activity/CreateGps;->maps:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateGps$4;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateGps$4;-><init>(Lcom/QRBS/activity/CreateGps;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    iget-object v3, p0, Lcom/QRBS/activity/CreateGps;->pick:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateGps$5;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateGps$5;-><init>(Lcom/QRBS/activity/CreateGps;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 296
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateGps;->finish()V

    .line 297
    const/4 v0, 0x1

    return v0
.end method
