.class public Lcom/QRBS/activity/MyResultActivity;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "MyResultActivity.java"


# instance fields
.field a:Landroid/app/Activity;

.field barcode:Landroid/widget/ImageView;

.field bundle:Landroid/os/Bundle;

.field custom:Landroid/widget/Button;

.field details:Landroid/widget/TextView;

.field format:Landroid/widget/TextView;

.field label:Ljava/lang/String;

.field qrtext:Landroid/widget/TextView;

.field share:Landroid/widget/Button;

.field type:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public buildButton(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "TYPE"    # Ljava/lang/String;
    .param p2, "FORMAT"    # Ljava/lang/String;
    .param p3, "text"    # Ljava/lang/String;

    .prologue
    const v6, 0x7f08011a

    const v5, 0x7f080114

    const v4, 0x7f0800bd

    .line 104
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->share:Landroid/widget/Button;

    const v3, 0x7f080112

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 105
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->share:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$1;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$1;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    const-string v2, "CODE_39"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "CODE_128"

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 115
    :cond_0
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    invoke-virtual {v2, v6}, Landroid/widget/Button;->setText(I)V

    .line 116
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$2;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$2;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 435
    :cond_1
    :goto_0
    return-void

    .line 125
    :cond_2
    const-string v2, "URI"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 127
    if-eqz p3, :cond_1

    .line 128
    const-string v2, ""

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "URI -> "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    const-string v2, ""

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SCHEME -> "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    const-string v2, ""

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NEW URI -> "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v4, "http://"

    invoke-static {p3, v4}, Lcom/scannerfire/utils/Utils;->URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    const-string v2, "http://"

    invoke-static {p3, v2}, Lcom/scannerfire/utils/Utils;->URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 134
    .local v0, "correctURI":Ljava/lang/String;
    const-string v2, "market://details?id="

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 136
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f080113

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 137
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$3;

    invoke-direct {v3, p0, v0}, Lcom/QRBS/activity/MyResultActivity$3;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 151
    :cond_3
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setText(I)V

    .line 152
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$4;

    invoke-direct {v3, p0, v0}, Lcom/QRBS/activity/MyResultActivity$4;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 168
    .end local v0    # "correctURI":Ljava/lang/String;
    :cond_4
    const-string v2, "ADDRESSBOOK"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 169
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f0800bf

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 170
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$5;

    invoke-direct {v3, p0}, Lcom/QRBS/activity/MyResultActivity$5;-><init>(Lcom/QRBS/activity/MyResultActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 183
    :cond_5
    const-string v2, "GEO"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 185
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f080115

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 186
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$6;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$6;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 203
    :cond_6
    const-string v2, "TEL"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 205
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f080117

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 206
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$7;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$7;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 220
    :cond_7
    const-string v2, "EMAIL_ADDRESS"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 221
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f0800be

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 222
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$8;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$8;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 231
    :cond_8
    const-string v2, "TEXT"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 233
    invoke-static {p3}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 235
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    invoke-virtual {v2, v5}, Landroid/widget/Button;->setText(I)V

    .line 236
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$9;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$9;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 248
    :cond_9
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V

    .line 249
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$10;

    invoke-direct {v3, p0}, Lcom/QRBS/activity/MyResultActivity$10;-><init>(Lcom/QRBS/activity/MyResultActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 257
    :cond_a
    const-string v2, "CALENDAR"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 258
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f080119

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 259
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$11;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$11;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 373
    :cond_b
    const-string v2, "PRODUCT"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 375
    invoke-virtual {p0}, Lcom/QRBS/activity/MyResultActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/scannerfire/utils/Utils;->getCustomUrlPref(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 377
    .local v1, "customUrl":Ljava/lang/String;
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    const-string v2, "http://"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_c

    const-string v2, "https://"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 379
    :cond_c
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f08011b

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 380
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$12;

    invoke-direct {v3, p0, v1, p3}, Lcom/QRBS/activity/MyResultActivity$12;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 395
    :cond_d
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    invoke-virtual {v2, v6}, Landroid/widget/Button;->setText(I)V

    .line 396
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$13;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$13;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 410
    .end local v1    # "customUrl":Ljava/lang/String;
    :cond_e
    const-string v2, "ISBN"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 411
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    const v3, 0x7f080149

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(I)V

    .line 412
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$14;

    invoke-direct {v3, p0, p3}, Lcom/QRBS/activity/MyResultActivity$14;-><init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 428
    :cond_f
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(I)V

    .line 429
    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    new-instance v3, Lcom/QRBS/activity/MyResultActivity$15;

    invoke-direct {v3, p0}, Lcom/QRBS/activity/MyResultActivity$15;-><init>(Lcom/QRBS/activity/MyResultActivity;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 11
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/16 v10, 0x7d0

    const/16 v9, 0x12c

    const/4 v8, 0x0

    .line 49
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 50
    const v6, 0x7f030037

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->setContentView(I)V

    .line 52
    invoke-virtual {p0}, Lcom/QRBS/activity/MyResultActivity;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 53
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v6, 0x7f0200d4

    invoke-virtual {v0, v6}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 54
    const v6, 0x7f0800b1

    invoke-virtual {v0, v6}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 55
    const v6, 0x7f0800d6

    invoke-virtual {v0, v6}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 56
    const/4 v6, 0x1

    invoke-virtual {v0, v6}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 58
    iput-object p0, p0, Lcom/QRBS/activity/MyResultActivity;->a:Landroid/app/Activity;

    .line 61
    const v6, 0x7f0d0061

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 62
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v6, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v6}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v6}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 63
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 65
    const v6, 0x7f0d00ca

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->qrtext:Landroid/widget/TextView;

    .line 66
    const v6, 0x7f0d00c1

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->barcode:Landroid/widget/ImageView;

    .line 67
    const v6, 0x7f0d00c3

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->format:Landroid/widget/TextView;

    .line 68
    const v6, 0x7f0d00c8

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->details:Landroid/widget/TextView;

    .line 69
    const v6, 0x7f0d00c6

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->type:Landroid/widget/TextView;

    .line 71
    const v6, 0x7f0d00be

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->share:Landroid/widget/Button;

    .line 72
    const v6, 0x7f0d00bd

    invoke-virtual {p0, v6}, Lcom/QRBS/activity/MyResultActivity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/Button;

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->custom:Landroid/widget/Button;

    .line 74
    iget-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->qrtext:Landroid/widget/TextView;

    new-instance v7, Landroid/text/method/ScrollingMovementMethod;

    invoke-direct {v7}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 77
    invoke-virtual {p0}, Lcom/QRBS/activity/MyResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 78
    .local v5, "extra":Landroid/os/Bundle;
    iput-object v5, p0, Lcom/QRBS/activity/MyResultActivity;->bundle:Landroid/os/Bundle;

    .line 79
    if-eqz v5, :cond_2

    .line 80
    const-string v6, "label"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->label:Ljava/lang/String;

    .line 81
    iget-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->qrtext:Landroid/widget/TextView;

    iget-object v7, p0, Lcom/QRBS/activity/MyResultActivity;->label:Ljava/lang/String;

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    const-string v6, "picture"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v3

    .line 83
    .local v3, "b":[B
    if-eqz v3, :cond_1

    .line 84
    array-length v6, v3

    invoke-static {v3, v8, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 85
    .local v4, "bmp":Landroid/graphics/Bitmap;
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    if-gt v6, v10, :cond_0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    if-le v6, v10, :cond_3

    .line 86
    :cond_0
    iget-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->barcode:Landroid/widget/ImageView;

    invoke-static {v4, v9, v9, v8}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 90
    .end local v4    # "bmp":Landroid/graphics/Bitmap;
    :cond_1
    :goto_0
    iget-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->format:Landroid/widget/TextView;

    const-string v7, "format"

    invoke-virtual {v5, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->details:Landroid/widget/TextView;

    const-string v7, "details"

    invoke-virtual {v5, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->type:Landroid/widget/TextView;

    const-string v7, "type"

    invoke-virtual {v5, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    const-string v6, "type"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "format"

    invoke-virtual {v5, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "TEXT"

    invoke-virtual {v5, v8}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v6, v7, v8}, Lcom/QRBS/activity/MyResultActivity;->buildButton(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .end local v3    # "b":[B
    :cond_2
    return-void

    .line 88
    .restart local v3    # "b":[B
    .restart local v4    # "bmp":Landroid/graphics/Bitmap;
    :cond_3
    iget-object v6, p0, Lcom/QRBS/activity/MyResultActivity;->barcode:Landroid/widget/ImageView;

    invoke-virtual {v6, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;

    .prologue
    .line 440
    invoke-virtual {p0}, Lcom/QRBS/activity/MyResultActivity;->getSupportMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0005

    invoke-virtual {v0, v1, p1}, Lcom/actionbarsherlock/view/MenuInflater;->inflate(ILcom/actionbarsherlock/view/Menu;)V

    .line 441
    const/4 v0, 0x1

    return v0
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 3
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v2, 0x1

    .line 447
    invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 457
    :goto_0
    return v2

    .line 449
    :sswitch_0
    invoke-virtual {p0}, Lcom/QRBS/activity/MyResultActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/QRBS/activity/MyResultActivity;->label:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->copyToClipboard(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 453
    :sswitch_1
    invoke-virtual {p0}, Lcom/QRBS/activity/MyResultActivity;->finish()V

    goto :goto_0

    .line 447
    nop

    :sswitch_data_0
    .sparse-switch
        0x102002c -> :sswitch_1
        0x7f0d00f5 -> :sswitch_0
    .end sparse-switch
.end method
