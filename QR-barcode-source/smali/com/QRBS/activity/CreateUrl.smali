.class public Lcom/QRBS/activity/CreateUrl;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "CreateUrl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/activity/CreateUrl$MyTask;
    }
.end annotation


# instance fields
.field activity:Landroid/app/Activity;

.field encode:Landroid/widget/Button;

.field encodeTiny:Landroid/widget/Button;

.field private prog:Landroid/app/ProgressDialog;

.field text:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/CreateUrl;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0, p1}, Lcom/QRBS/activity/CreateUrl;->compute(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$1(Lcom/QRBS/activity/CreateUrl;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/QRBS/activity/CreateUrl;->prog:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic access$2(Lcom/QRBS/activity/CreateUrl;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/QRBS/activity/CreateUrl;->prog:Landroid/app/ProgressDialog;

    return-void
.end method

.method private compute(Ljava/lang/String;)V
    .locals 25
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 97
    new-instance v3, Lcom/google/zxing/qrcode/QRCodeWriter;

    invoke-direct {v3}, Lcom/google/zxing/qrcode/QRCodeWriter;-><init>()V

    .line 98
    .local v3, "writer":Lcom/google/zxing/qrcode/QRCodeWriter;
    const/high16 v18, -0x1000000

    .line 99
    .local v18, "colorBack":I
    const/16 v19, -0x1

    .line 103
    .local v19, "colorFront":I
    :try_start_0
    new-instance v8, Ljava/util/EnumMap;

    const-class v4, Lcom/google/zxing/EncodeHintType;

    invoke-direct {v8, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 104
    .local v8, "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    sget-object v4, Lcom/google/zxing/EncodeHintType;->CHARACTER_SET:Lcom/google/zxing/EncodeHintType;

    const-string v5, "UTF-8"

    invoke-virtual {v8, v4, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    sget-object v5, Lcom/google/zxing/BarcodeFormat;->QR_CODE:Lcom/google/zxing/BarcodeFormat;

    const/16 v6, 0x15e

    const/16 v7, 0x15e

    move-object/from16 v4, p1

    invoke-virtual/range {v3 .. v8}, Lcom/google/zxing/qrcode/QRCodeWriter;->encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILjava/util/Map;)Lcom/google/zxing/common/BitMatrix;

    move-result-object v17

    .line 106
    .local v17, "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    move-result v12

    .line 107
    .local v12, "width":I
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    move-result v16

    .line 108
    .local v16, "height":I
    mul-int v4, v12, v16

    new-array v10, v4, [I

    .line 109
    .local v10, "pixels":[I
    const/16 v24, 0x0

    .local v24, "y":I
    :goto_0
    move/from16 v0, v24

    move/from16 v1, v16

    if-lt v0, v1, :cond_0

    .line 119
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move/from16 v0, v16

    invoke-static {v12, v0, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 120
    .local v9, "bitmap":Landroid/graphics/Bitmap;
    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v15, v12

    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 121
    new-instance v21, Landroid/content/Intent;

    const-class v4, Lcom/QRBS/activity/MyEncodeActivity;

    move-object/from16 v0, v21

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 122
    .local v21, "i":Landroid/content/Intent;
    const-string v4, "image"

    move-object/from16 v0, v21

    invoke-virtual {v0, v4, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 123
    const-string v4, "text"

    move-object/from16 v0, v21

    move-object/from16 v1, p1

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 124
    const-string v4, "parametro"

    move-object/from16 v0, v21

    move-object/from16 v1, p1

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/CreateUrl;->startActivity(Landroid/content/Intent;)V

    .line 132
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v9    # "bitmap":Landroid/graphics/Bitmap;
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v21    # "i":Landroid/content/Intent;
    .end local v24    # "y":I
    :goto_1
    return-void

    .line 111
    .restart local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .restart local v10    # "pixels":[I
    .restart local v12    # "width":I
    .restart local v16    # "height":I
    .restart local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .restart local v24    # "y":I
    :cond_0
    mul-int v22, v24, v12

    .line 112
    .local v22, "offset":I
    const/16 v23, 0x0

    .local v23, "x":I
    :goto_2
    move/from16 v0, v23

    if-lt v0, v12, :cond_1

    .line 109
    add-int/lit8 v24, v24, 0x1

    goto :goto_0

    .line 115
    :cond_1
    add-int v5, v22, v23

    move-object/from16 v0, v17

    move/from16 v1, v23

    move/from16 v2, v24

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v4

    if-eqz v4, :cond_2

    move/from16 v4, v18

    :goto_3
    aput v4, v10, v5
    :try_end_0
    .catch Lcom/google/zxing/WriterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    add-int/lit8 v23, v23, 0x1

    goto :goto_2

    :cond_2
    move/from16 v4, v19

    .line 115
    goto :goto_3

    .line 127
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v22    # "offset":I
    .end local v23    # "x":I
    .end local v24    # "y":I
    :catch_0
    move-exception v20

    .line 129
    .local v20, "e":Lcom/google/zxing/WriterException;
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/WriterException;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 41
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    const v3, 0x7f030026

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateUrl;->setContentView(I)V

    .line 44
    iput-object p0, p0, Lcom/QRBS/activity/CreateUrl;->activity:Landroid/app/Activity;

    .line 46
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateUrl;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 47
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 48
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 49
    const v3, 0x7f0800d0

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 50
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 53
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateUrl;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 54
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 55
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 57
    const v3, 0x7f0d008d

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateUrl;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/CreateUrl;->text:Landroid/widget/EditText;

    .line 58
    const v3, 0x7f0d0079

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateUrl;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateUrl;->encode:Landroid/widget/Button;

    .line 59
    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl;->encode:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateUrl$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateUrl$1;-><init>(Lcom/QRBS/activity/CreateUrl;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    const v3, 0x7f0d008e

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/CreateUrl;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    iput-object v3, p0, Lcom/QRBS/activity/CreateUrl;->encodeTiny:Landroid/widget/Button;

    .line 74
    iget-object v3, p0, Lcom/QRBS/activity/CreateUrl;->encodeTiny:Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/CreateUrl$2;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/CreateUrl$2;-><init>(Lcom/QRBS/activity/CreateUrl;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 166
    invoke-virtual {p0}, Lcom/QRBS/activity/CreateUrl;->finish()V

    .line 167
    const/4 v0, 0x1

    return v0
.end method
