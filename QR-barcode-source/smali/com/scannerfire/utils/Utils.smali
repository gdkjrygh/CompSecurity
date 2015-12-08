.class public Lcom/scannerfire/utils/Utils;
.super Ljava/lang/Object;
.source "Utils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scannerfire/utils/Utils$MODE;
    }
.end annotation


# static fields
.field private static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I = null

.field protected static final CODE_ACTION:I = 0x2

.field protected static final CODE_CLIPBOARD:I = 0x4

.field protected static final CODE_DELETE:I = 0x1

.field protected static final CODE_SEE:I = 0x0

.field protected static final CODE_SHARE:I = 0x3

.field public static final DEBUG:Z = false

.field public static final QR_DIM:I = 0x15e

.field private static final TAG:Ljava/lang/String; = "Util"

.field private static lastElem:I


# instance fields
.field private lastPD:Landroid/app/ProgressDialog;


# direct methods
.method static synthetic $SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I
    .locals 3

    .prologue
    .line 63
    sget-object v0, Lcom/scannerfire/utils/Utils;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/scannerfire/utils/Utils$MODE;->values()[Lcom/scannerfire/utils/Utils$MODE;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_calendar:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_8

    :goto_1
    :try_start_1
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_contact:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_7

    :goto_2
    :try_start_2
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_email:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_6

    :goto_3
    :try_start_3
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_geo:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_5

    :goto_4
    :try_start_4
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_isbn:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :goto_5
    :try_start_5
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_phone:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_3

    :goto_6
    :try_start_6
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_product:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_2

    :goto_7
    :try_start_7
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_1

    :goto_8
    :try_start_8
    sget-object v1, Lcom/scannerfire/utils/Utils$MODE;->_url:Lcom/scannerfire/utils/Utils$MODE;

    invoke-virtual {v1}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_0

    :goto_9
    sput-object v0, Lcom/scannerfire/utils/Utils;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_9

    :catch_1
    move-exception v1

    goto :goto_8

    :catch_2
    move-exception v1

    goto :goto_7

    :catch_3
    move-exception v1

    goto :goto_6

    :catch_4
    move-exception v1

    goto :goto_5

    :catch_5
    move-exception v1

    goto :goto_4

    :catch_6
    move-exception v1

    goto :goto_3

    :catch_7
    move-exception v1

    goto :goto_2

    :catch_8
    move-exception v1

    goto :goto_1
.end method

.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 80
    const/4 v0, -0x1

    sput v0, Lcom/scannerfire/utils/Utils;->lastElem:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p0, "uri"    # Ljava/lang/String;
    .param p1, "defaultScheme"    # Ljava/lang/String;

    .prologue
    .line 716
    const-string v2, "uri:"

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "uri:"

    const-string v3, ""

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 717
    :cond_0
    const-string v2, "URI:"

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "URI:"

    const-string v3, ""

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 719
    :cond_1
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 720
    .local v1, "u":Landroid/net/Uri;
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    if-eqz p1, :cond_2

    .end local p1    # "defaultScheme":Ljava/lang/String;
    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 722
    :goto_1
    return-object v2

    .line 720
    .restart local p1    # "defaultScheme":Ljava/lang/String;
    :cond_2
    const-string p1, ""

    goto :goto_0

    .line 721
    :cond_3
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 722
    .local v0, "scheme":Ljava/lang/String;
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1
.end method

.method public static computeSampleSize(Landroid/graphics/BitmapFactory$Options;I)I
    .locals 4
    .param p0, "options"    # Landroid/graphics/BitmapFactory$Options;
    .param p1, "i"    # I

    .prologue
    .line 84
    iget v2, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v3, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 85
    .local v0, "j":I
    const/4 v1, 0x1

    .line 88
    .local v1, "k":I
    :goto_0
    shl-int/lit8 v2, v1, 0x1

    div-int v2, v0, v2

    if-gt v2, p1, :cond_0

    .line 90
    return v1

    .line 92
    :cond_0
    shl-int/lit8 v1, v1, 0x1

    .line 93
    goto :goto_0
.end method

.method public static copyToClipboard(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "s"    # Ljava/lang/String;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    .line 660
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-ge v2, v3, :cond_0

    .line 661
    const-string v2, "clipboard"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/ClipboardManager;

    .line 662
    .local v1, "clipboard":Landroid/text/ClipboardManager;
    invoke-virtual {v1, p1}, Landroid/text/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 668
    .end local v1    # "clipboard":Landroid/text/ClipboardManager;
    :goto_0
    const v2, 0x7f080154

    const/4 v3, 0x0

    invoke-static {p0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 669
    return-void

    .line 664
    :cond_0
    const-string v2, "clipboard"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    .line 665
    .local v1, "clipboard":Landroid/content/ClipboardManager;
    const-string v2, "Copied Text"

    invoke-static {v2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    .line 666
    .local v0, "clip":Landroid/content/ClipData;
    invoke-virtual {v1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    goto :goto_0
.end method

.method public static createQuickMenu(Landroid/app/Activity;Lcom/scannerfire/model/QRModel;Landroid/view/View;ILcom/scannerfire/model/CustomListAdapter;)Lcom/QRBS/QuickAction/QuickActionPopup;
    .locals 16
    .param p0, "startA"    # Landroid/app/Activity;
    .param p1, "model"    # Lcom/scannerfire/model/QRModel;
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "arrayAdapter"    # Lcom/scannerfire/model/CustomListAdapter;

    .prologue
    .line 551
    new-instance v15, Lcom/QRBS/QuickAction/QuickActionPopup;

    invoke-direct/range {v15 .. v16}, Lcom/QRBS/QuickAction/QuickActionPopup;-><init>(Landroid/content/Context;)V

    .line 553
    .local v15, "quickaction":Lcom/QRBS/QuickAction/QuickActionPopup;
    new-instance v9, Lcom/QRBS/QuickAction/QuickActionItem;

    const/4 v1, 0x0

    .line 554
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v7, 0x7f08014a

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f02010b

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 553
    invoke-direct {v9, v1, v2, v7}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 556
    .local v9, "actionitem":Lcom/QRBS/QuickAction/QuickActionItem;
    new-instance v10, Lcom/QRBS/QuickAction/QuickActionItem;

    const/4 v1, 0x1

    .line 557
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v7, 0x7f080147

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0200be

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 556
    invoke-direct {v10, v1, v2, v7}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 559
    .local v10, "actionitem1":Lcom/QRBS/QuickAction/QuickActionItem;
    invoke-virtual/range {p1 .. p1}, Lcom/scannerfire/model/QRModel;->getResult()Lcom/google/zxing/Result;

    move-result-object v3

    .line 561
    .local v3, "result":Lcom/google/zxing/Result;
    invoke-static {v3}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v5

    .line 562
    .local v5, "parsed":Lcom/google/zxing/client/result/ParsedResult;
    invoke-static {v5}, Lcom/scannerfire/utils/ResultParser;->getParsedResult(Lcom/google/zxing/client/result/ParsedResult;)Lcom/scannerfire/utils/Utils$MODE;

    move-result-object v6

    .line 563
    .local v6, "mode":Lcom/scannerfire/utils/Utils$MODE;
    new-instance v4, Lcom/scannerfire/utils/ResultUtils;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Lcom/scannerfire/utils/ResultUtils;-><init>(Landroid/app/Activity;)V

    .line 564
    .local v4, "ru":Lcom/scannerfire/utils/ResultUtils;
    invoke-virtual {v4, v6}, Lcom/scannerfire/utils/ResultUtils;->getCustomString(Lcom/scannerfire/utils/Utils$MODE;)Ljava/lang/String;

    move-result-object v14

    .line 565
    .local v14, "custom":Ljava/lang/String;
    const/4 v11, 0x0

    .line 566
    .local v11, "actionitem2":Lcom/QRBS/QuickAction/QuickActionItem;
    if-eqz v14, :cond_0

    .line 567
    new-instance v11, Lcom/QRBS/QuickAction/QuickActionItem;

    .end local v11    # "actionitem2":Lcom/QRBS/QuickAction/QuickActionItem;
    const/4 v1, 0x2

    invoke-virtual {v4, v6}, Lcom/scannerfire/utils/ResultUtils;->getIconFromMode(Lcom/scannerfire/utils/Utils$MODE;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-direct {v11, v1, v14, v2}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 569
    .restart local v11    # "actionitem2":Lcom/QRBS/QuickAction/QuickActionItem;
    :cond_0
    new-instance v12, Lcom/QRBS/QuickAction/QuickActionItem;

    const/4 v1, 0x3

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v7, 0x7f080112

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 570
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f02010e

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 569
    invoke-direct {v12, v1, v2, v7}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 571
    .local v12, "actionitem3":Lcom/QRBS/QuickAction/QuickActionItem;
    new-instance v13, Lcom/QRBS/QuickAction/QuickActionItem;

    const/4 v1, 0x4

    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v7, 0x7f08013d

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 572
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0200d8

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 571
    invoke-direct {v13, v1, v2, v7}, Lcom/QRBS/QuickAction/QuickActionItem;-><init>(ILjava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 575
    .local v13, "actionitem4":Lcom/QRBS/QuickAction/QuickActionItem;
    new-instance v15, Lcom/QRBS/QuickAction/QuickActionPopup;

    .end local v15    # "quickaction":Lcom/QRBS/QuickAction/QuickActionPopup;
    invoke-direct/range {v15 .. v16}, Lcom/QRBS/QuickAction/QuickActionPopup;-><init>(Landroid/content/Context;)V

    .line 576
    .restart local v15    # "quickaction":Lcom/QRBS/QuickAction/QuickActionPopup;
    invoke-virtual {v15, v9}, Lcom/QRBS/QuickAction/QuickActionPopup;->addActionItem(Lcom/QRBS/QuickAction/QuickActionItem;)V

    .line 577
    invoke-virtual {v15, v10}, Lcom/QRBS/QuickAction/QuickActionPopup;->addActionItem(Lcom/QRBS/QuickAction/QuickActionItem;)V

    .line 578
    if-eqz v11, :cond_1

    invoke-virtual {v15, v11}, Lcom/QRBS/QuickAction/QuickActionPopup;->addActionItem(Lcom/QRBS/QuickAction/QuickActionItem;)V

    .line 579
    :cond_1
    invoke-virtual {v15, v12}, Lcom/QRBS/QuickAction/QuickActionPopup;->addActionItem(Lcom/QRBS/QuickAction/QuickActionItem;)V

    .line 580
    invoke-virtual {v15, v13}, Lcom/QRBS/QuickAction/QuickActionPopup;->addActionItem(Lcom/QRBS/QuickAction/QuickActionItem;)V

    .line 581
    move-object/from16 v0, p2

    invoke-virtual {v15, v0}, Lcom/QRBS/QuickAction/QuickActionPopup;->show(Landroid/view/View;)V

    .line 582
    const v1, 0x7f040006

    invoke-virtual {v15, v1}, Lcom/QRBS/QuickAction/QuickActionPopup;->setAnimStyle(I)V

    .line 583
    new-instance v1, Lcom/scannerfire/utils/Utils$2;

    move-object/from16 v2, p0

    move-object/from16 v7, p4

    move/from16 v8, p3

    invoke-direct/range {v1 .. v8}, Lcom/scannerfire/utils/Utils$2;-><init>(Landroid/app/Activity;Lcom/google/zxing/Result;Lcom/scannerfire/utils/ResultUtils;Lcom/google/zxing/client/result/ParsedResult;Lcom/scannerfire/utils/Utils$MODE;Lcom/scannerfire/model/CustomListAdapter;I)V

    invoke-virtual {v15, v1}, Lcom/QRBS/QuickAction/QuickActionPopup;->setOnActionItemClickListener(Lcom/QRBS/QuickAction/QuickActionPopup$OnActionItemClickListener;)V

    .line 653
    return-object v15
.end method

.method public static decodeBitmap(Landroid/graphics/Bitmap;)Lcom/google/zxing/Result;
    .locals 7
    .param p0, "bMap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 288
    const/4 v3, 0x0

    .line 291
    .local v3, "result":Lcom/google/zxing/Result;
    :try_start_0
    new-instance v5, Lcom/QRBS/camera/RGBLuminanceSource;

    invoke-direct {v5, p0}, Lcom/QRBS/camera/RGBLuminanceSource;-><init>(Landroid/graphics/Bitmap;)V

    .line 292
    .local v5, "source":Lcom/google/zxing/LuminanceSource;
    new-instance v0, Lcom/google/zxing/BinaryBitmap;

    new-instance v6, Lcom/google/zxing/common/HybridBinarizer;

    invoke-direct {v6, v5}, Lcom/google/zxing/common/HybridBinarizer;-><init>(Lcom/google/zxing/LuminanceSource;)V

    invoke-direct {v0, v6}, Lcom/google/zxing/BinaryBitmap;-><init>(Lcom/google/zxing/Binarizer;)V

    .line 293
    .local v0, "bitmap":Lcom/google/zxing/BinaryBitmap;
    new-instance v2, Lcom/google/zxing/MultiFormatReader;

    invoke-direct {v2}, Lcom/google/zxing/MultiFormatReader;-><init>()V

    .line 294
    .local v2, "reader":Lcom/google/zxing/Reader;
    invoke-interface {v2, v0}, Lcom/google/zxing/Reader;->decode(Lcom/google/zxing/BinaryBitmap;)Lcom/google/zxing/Result;
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/zxing/ChecksumException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/zxing/FormatException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v3

    move-object v4, v3

    .line 308
    .end local v0    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .end local v2    # "reader":Lcom/google/zxing/Reader;
    .end local v3    # "result":Lcom/google/zxing/Result;
    .end local v5    # "source":Lcom/google/zxing/LuminanceSource;
    .local v4, "result":Lcom/google/zxing/Result;
    :goto_0
    return-object v4

    .line 296
    .end local v4    # "result":Lcom/google/zxing/Result;
    .restart local v3    # "result":Lcom/google/zxing/Result;
    :catch_0
    move-exception v1

    .line 298
    .local v1, "e":Lcom/google/zxing/NotFoundException;
    invoke-virtual {v1}, Lcom/google/zxing/NotFoundException;->printStackTrace()V

    .end local v1    # "e":Lcom/google/zxing/NotFoundException;
    :goto_1
    move-object v4, v3

    .line 308
    .end local v3    # "result":Lcom/google/zxing/Result;
    .restart local v4    # "result":Lcom/google/zxing/Result;
    goto :goto_0

    .line 299
    .end local v4    # "result":Lcom/google/zxing/Result;
    .restart local v3    # "result":Lcom/google/zxing/Result;
    :catch_1
    move-exception v1

    .line 301
    .local v1, "e":Lcom/google/zxing/ChecksumException;
    invoke-virtual {v1}, Lcom/google/zxing/ChecksumException;->printStackTrace()V

    goto :goto_1

    .line 302
    .end local v1    # "e":Lcom/google/zxing/ChecksumException;
    :catch_2
    move-exception v1

    .line 304
    .local v1, "e":Lcom/google/zxing/FormatException;
    invoke-virtual {v1}, Lcom/google/zxing/FormatException;->printStackTrace()V

    goto :goto_1
.end method

.method public static getAutomaticRedPref(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 228
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_automat"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;I)Landroid/graphics/Bitmap;
    .locals 8
    .param p0, "contentresolver"    # Landroid/content/ContentResolver;
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "i"    # I

    .prologue
    const/4 v0, 0x0

    .line 98
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 102
    .local v4, "options":Landroid/graphics/BitmapFactory$Options;
    const/4 v5, 0x1

    :try_start_0
    iput-boolean v5, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 103
    new-instance v5, Ljava/io/BufferedInputStream;

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 v6, 0x0

    invoke-static {v5, v6, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 104
    invoke-static {v4, p2}, Lcom/scannerfire/utils/Utils;->computeSampleSize(Landroid/graphics/BitmapFactory$Options;I)I

    move-result v3

    .line 105
    .local v3, "j":I
    const/4 v5, 0x0

    iput-boolean v5, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 106
    iput v3, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 107
    new-instance v5, Ljava/io/BufferedInputStream;

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 v6, 0x0

    invoke-static {v5, v6, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    .line 119
    .end local v3    # "j":I
    :goto_0
    return-object v0

    .line 109
    :catch_0
    move-exception v2

    .line 111
    .local v2, "filenotfoundexception":Ljava/io/FileNotFoundException;
    const-string v5, "Util"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "FileNotFound "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 114
    .end local v2    # "filenotfoundexception":Ljava/io/FileNotFoundException;
    :catch_1
    move-exception v1

    .line 116
    .local v1, "exception":Ljava/lang/Exception;
    const-string v5, "Util"

    const-string v6, "Unexpected exception"

    invoke-static {v5, v6, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static getClipboardPref(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 172
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_automatic_clipboard"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getContinuousPref(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 192
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_continuous"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getCustomUrlPref(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 177
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_custom_url"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getExtraData(Lcom/google/zxing/client/result/ParsedResult;)Landroid/os/Bundle;
    .locals 5
    .param p0, "pr"    # Lcom/google/zxing/client/result/ParsedResult;

    .prologue
    .line 342
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .local v1, "extra":Landroid/os/Bundle;
    move-object v0, p0

    .line 343
    check-cast v0, Lcom/google/zxing/client/result/AddressBookParsedResult;

    .line 344
    .local v0, "addressResult":Lcom/google/zxing/client/result/AddressBookParsedResult;
    const-string v2, "names"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNames()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 345
    const-string v2, "emails"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getEmails()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 346
    const-string v2, "phones"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getPhoneNumbers()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 347
    const-string v2, "org"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getOrg()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    const-string v2, "title"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    const-string v2, "indirizzi"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getAddresses()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 351
    const-string v2, "siti"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getURLs()[Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 352
    const-string v2, "note"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getNote()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    const-string v2, ""

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DISPLAY "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getDisplayResult()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 354
    return-object v1
.end method

.method public static getLastElem()I
    .locals 1

    .prologue
    .line 702
    sget v0, Lcom/scannerfire/utils/Utils;->lastElem:I

    return v0
.end method

.method public static getSoundPref(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 233
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_sound"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getStartScanPref(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 197
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_start_scan"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;
    .locals 22
    .param p0, "mode"    # Lcom/scannerfire/utils/Utils$MODE;
    .param p1, "r"    # Lcom/google/zxing/Result;

    .prologue
    .line 379
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v15

    .line 380
    .local v15, "text":Ljava/lang/String;
    const-string v16, ""

    .line 382
    .local v16, "text2":Ljava/lang/String;
    invoke-static {}, Lcom/scannerfire/utils/Utils;->$SWITCH_TABLE$com$scannerfire$utils$Utils$MODE()[I

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lcom/scannerfire/utils/Utils$MODE;->ordinal()I

    move-result v18

    aget v17, v17, v18

    packed-switch v17, :pswitch_data_0

    .line 541
    move-object/from16 v16, v15

    .line 544
    :cond_0
    :goto_0
    return-object v16

    .line 384
    :pswitch_0
    invoke-static/range {p1 .. p1}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v10

    .line 385
    .local v10, "pr":Lcom/google/zxing/client/result/ParsedResult;
    if-eqz v10, :cond_0

    move-object v4, v10

    .line 386
    check-cast v4, Lcom/google/zxing/client/result/AddressBookParsedResult;

    .line 387
    .local v4, "addressResult":Lcom/google/zxing/client/result/AddressBookParsedResult;
    if-eqz v4, :cond_0

    .line 389
    invoke-virtual {v4}, Lcom/google/zxing/client/result/AddressBookParsedResult;->getDisplayResult()Ljava/lang/String;

    move-result-object v16

    .line 420
    goto :goto_0

    .line 422
    .end local v4    # "addressResult":Lcom/google/zxing/client/result/AddressBookParsedResult;
    .end local v10    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v17

    const-string v18, "MATMSG:"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_1

    .line 423
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/scannerfire/model/MatMsg;->getMatMsgFromString(Ljava/lang/String;)Lcom/scannerfire/model/MatMsg;

    move-result-object v9

    .line 424
    .local v9, "m":Lcom/scannerfire/model/MatMsg;
    invoke-static {}, Lcom/scannerfire/model/MatMsg;->getBODY()Ljava/lang/String;

    move-result-object v16

    .line 425
    goto :goto_0

    .line 426
    .end local v9    # "m":Lcom/scannerfire/model/MatMsg;
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lcom/scannerfire/model/Mail;->getMailFromString(Ljava/lang/String;)Lcom/scannerfire/model/Mail;

    move-result-object v9

    .line 427
    .local v9, "m":Lcom/scannerfire/model/Mail;
    invoke-static {}, Lcom/scannerfire/model/Mail;->getString()Ljava/lang/String;

    move-result-object v16

    .line 429
    goto :goto_0

    .line 431
    .end local v9    # "m":Lcom/scannerfire/model/Mail;
    :pswitch_2
    move-object/from16 v16, v15

    .line 432
    const-string v17, "geo:"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_2

    .line 433
    const-string v17, "geo:"

    const-string v18, ""

    invoke-virtual/range {v16 .. v18}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v16

    .line 435
    :cond_2
    const-string v17, "GEO:"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_3

    .line 436
    const-string v17, "GEO:"

    const-string v18, ""

    invoke-virtual/range {v16 .. v18}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v16

    .line 439
    :cond_3
    const-string v17, "?q="

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_0

    .line 440
    const-string v17, "?q="

    const-string v18, " "

    invoke-virtual/range {v16 .. v18}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v16

    .line 442
    goto :goto_0

    .line 444
    :pswitch_3
    move-object/from16 v16, v15

    .line 445
    const-string v17, "tel:"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_4

    .line 446
    const-string v17, "tel:"

    const-string v18, ""

    invoke-virtual/range {v16 .. v18}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v16

    .line 448
    :cond_4
    const-string v17, "TEL:"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_0

    .line 449
    const-string v17, "TEL:"

    const-string v18, ""

    invoke-virtual/range {v16 .. v18}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v16

    .line 451
    goto/16 :goto_0

    .line 453
    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v16

    .line 454
    goto/16 :goto_0

    .line 456
    :pswitch_5
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v16

    .line 457
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v17

    const-string v18, "uri:"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v17

    const-string v18, "uri:"

    const-string v19, ""

    invoke-virtual/range {v17 .. v19}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 458
    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v17

    const-string v18, "URI:"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v17

    if-eqz v17, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v17

    const-string v18, "URI:"

    const-string v19, ""

    invoke-virtual/range {v17 .. v19}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 459
    goto/16 :goto_0

    .line 463
    :pswitch_6
    const-string v17, "\n|(:)"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 464
    .local v14, "split":[Ljava/lang/String;
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_1
    array-length v0, v14

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v8, v0, :cond_0

    .line 465
    aget-object v17, v14, v8

    const-string v18, "DTSTART"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_8

    .line 467
    add-int/lit8 v17, v8, 0x1

    aget-object v11, v14, v17

    .line 468
    .local v11, "s1":Ljava/lang/String;
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_7

    .line 464
    .end local v11    # "s1":Ljava/lang/String;
    :cond_6
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 469
    .restart local v11    # "s1":Ljava/lang/String;
    :cond_7
    const-string v17, "T"

    const-string v18, ""

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    .line 470
    const-string v17, "00Z"

    const-string v18, ""

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    .line 471
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    .line 472
    .local v5, "current":Ljava/util/Locale;
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v17, "yyyyMMddHHmm"

    move-object/from16 v0, v17

    invoke-direct {v12, v0, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 473
    .local v12, "sdf":Ljava/text/SimpleDateFormat;
    new-instance v13, Ljava/text/SimpleDateFormat;

    const-string v17, "yyyy/MM/dd HH:mm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v18

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v13, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 476
    .local v13, "sdf2":Ljava/text/SimpleDateFormat;
    :try_start_0
    invoke-virtual {v12, v11}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 477
    .local v6, "date":Ljava/util/Date;
    const-string v17, ""

    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "START "

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    move-object/from16 v0, v18

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 478
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, "\n"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v16

    .line 486
    .end local v5    # "current":Ljava/util/Locale;
    .end local v6    # "date":Ljava/util/Date;
    .end local v11    # "s1":Ljava/lang/String;
    .end local v12    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v13    # "sdf2":Ljava/text/SimpleDateFormat;
    :cond_8
    :goto_3
    aget-object v17, v14, v8

    const-string v18, "DTEND"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_9

    .line 488
    add-int/lit8 v17, v8, 0x1

    aget-object v11, v14, v17

    .line 489
    .restart local v11    # "s1":Ljava/lang/String;
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_6

    .line 490
    const-string v17, "T"

    const-string v18, ""

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    .line 491
    const-string v17, "00Z"

    const-string v18, ""

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v11, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    .line 492
    new-instance v12, Ljava/text/SimpleDateFormat;

    const-string v17, "yyyyMMddHHmm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v18

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v12, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 493
    .restart local v12    # "sdf":Ljava/text/SimpleDateFormat;
    new-instance v13, Ljava/text/SimpleDateFormat;

    const-string v17, "yyyy/MM/dd HH:mm"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v18

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-direct {v13, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 496
    .restart local v13    # "sdf2":Ljava/text/SimpleDateFormat;
    :try_start_1
    invoke-virtual {v12, v11}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 497
    .restart local v6    # "date":Ljava/util/Date;
    const-string v17, ""

    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "END "

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v20

    move-object/from16 v0, v18

    move-wide/from16 v1, v20

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 498
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, "\n"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v16

    .line 505
    .end local v6    # "date":Ljava/util/Date;
    .end local v11    # "s1":Ljava/lang/String;
    .end local v12    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v13    # "sdf2":Ljava/text/SimpleDateFormat;
    :cond_9
    :goto_4
    aget-object v17, v14, v8

    const-string v18, "LOCATION"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_a

    .line 507
    const-string v17, ""

    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "Luogo "

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v19, v8, 0x1

    aget-object v19, v14, v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 508
    add-int/lit8 v17, v8, 0x1

    aget-object v17, v14, v17

    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_6

    .line 509
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v18, v8, 0x1

    aget-object v18, v14, v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, "\n"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 512
    :cond_a
    aget-object v17, v14, v8

    const-string v18, "DESCRIPTION"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_b

    .line 514
    const-string v17, ""

    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "Descrizione "

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v19, v8, 0x1

    aget-object v19, v14, v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 515
    add-int/lit8 v17, v8, 0x1

    aget-object v17, v14, v17

    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_6

    .line 516
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v18, v8, 0x1

    aget-object v18, v14, v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, "\n"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 520
    :cond_b
    aget-object v17, v14, v8

    const-string v18, "SUMMARY"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_6

    .line 522
    const-string v17, ""

    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "Titolo "

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v19, v8, 0x1

    aget-object v19, v14, v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 523
    add-int/lit8 v17, v8, 0x1

    aget-object v17, v14, v17

    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v17

    if-nez v17, :cond_6

    .line 524
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v18, v8, 0x1

    aget-object v18, v14, v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, "\n"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    goto/16 :goto_2

    .line 479
    .restart local v5    # "current":Ljava/util/Locale;
    .restart local v11    # "s1":Ljava/lang/String;
    .restart local v12    # "sdf":Ljava/text/SimpleDateFormat;
    .restart local v13    # "sdf2":Ljava/text/SimpleDateFormat;
    :catch_0
    move-exception v7

    .line 481
    .local v7, "e":Ljava/text/ParseException;
    invoke-virtual {v7}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_3

    .line 499
    .end local v5    # "current":Ljava/util/Locale;
    .end local v7    # "e":Ljava/text/ParseException;
    :catch_1
    move-exception v7

    .line 501
    .restart local v7    # "e":Ljava/text/ParseException;
    invoke-virtual {v7}, Ljava/text/ParseException;->printStackTrace()V

    goto/16 :goto_4

    .line 533
    .end local v7    # "e":Ljava/text/ParseException;
    .end local v8    # "i":I
    .end local v11    # "s1":Ljava/lang/String;
    .end local v12    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v13    # "sdf2":Ljava/text/SimpleDateFormat;
    .end local v14    # "split":[Ljava/lang/String;
    :pswitch_7
    move-object/from16 v16, v15

    .line 534
    goto/16 :goto_0

    .line 537
    :pswitch_8
    move-object/from16 v16, v15

    .line 538
    goto/16 :goto_0

    .line 382
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method

.method public static getVibratePref(Landroid/content/Context;)Z
    .locals 3
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 223
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_vibrate"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static launchResultActivity(Landroid/content/Context;Landroid/os/Bundle;Landroid/graphics/Bitmap;)V
    .locals 5
    .param p0, "c"    # Landroid/content/Context;
    .param p1, "b"    # Landroid/os/Bundle;
    .param p2, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 359
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/QRBS/activity/MyResultActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 360
    .local v2, "i":Landroid/content/Intent;
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 361
    .local v0, "baos":Ljava/io/ByteArrayOutputStream;
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v4, 0x64

    invoke-virtual {p2, v3, v4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 362
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    .line 363
    .local v1, "bytetopass":[B
    const-string v3, "picture"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 364
    invoke-virtual {v2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 365
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 366
    return-void
.end method

.method public static makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;
    .locals 9
    .param p0, "result"    # Lcom/google/zxing/Result;

    .prologue
    .line 314
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 315
    .local v0, "b":Landroid/os/Bundle;
    const-string v7, "TEXT"

    invoke-virtual {p0}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    const-string v7, "format"

    invoke-virtual {p0}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    invoke-virtual {p0}, Lcom/google/zxing/Result;->getTimestamp()J

    move-result-wide v4

    .line 318
    .local v4, "time":J
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v8, "MM/dd/yyyy HH:mm"

    invoke-direct {v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 319
    .local v1, "date":Ljava/lang/String;
    const-string v7, "details"

    invoke-virtual {v0, v7, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    invoke-static {p0}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v3

    .line 322
    .local v3, "pr":Lcom/google/zxing/client/result/ParsedResult;
    invoke-virtual {v3}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v6

    .line 323
    .local v6, "type":Ljava/lang/String;
    const-string v7, "type"

    invoke-virtual {v0, v7, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    invoke-virtual {p0}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v2

    .line 326
    .local v2, "label":Ljava/lang/String;
    const-string v7, "URI"

    if-ne v6, v7, :cond_0

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_url:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 327
    :cond_0
    const-string v7, "ADDRESSBOOK"

    if-ne v6, v7, :cond_1

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_contact:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 328
    :cond_1
    const-string v7, "GEO"

    if-ne v6, v7, :cond_2

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_geo:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 329
    :cond_2
    const-string v7, "TEL"

    if-ne v6, v7, :cond_3

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_phone:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 330
    :cond_3
    const-string v7, "TEXT"

    if-ne v6, v7, :cond_4

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 331
    :cond_4
    const-string v7, "EMAIL_ADDRESS"

    if-ne v6, v7, :cond_5

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_email:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 332
    :cond_5
    const-string v7, "CALENDAR"

    if-ne v6, v7, :cond_6

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_calendar:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 333
    :cond_6
    const-string v7, "PRODUCT"

    if-ne v6, v7, :cond_7

    sget-object v7, Lcom/scannerfire/utils/Utils$MODE;->_product:Lcom/scannerfire/utils/Utils$MODE;

    invoke-static {v7, p0}, Lcom/scannerfire/utils/Utils;->getTextFromResult(Lcom/scannerfire/utils/Utils$MODE;Lcom/google/zxing/Result;)Ljava/lang/String;

    move-result-object v2

    .line 335
    :cond_7
    const-string v7, "label"

    invoke-virtual {v0, v7, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    const-string v7, "ADDRESSBOOK"

    if-ne v6, v7, :cond_8

    .line 337
    const-string v7, "extraData"

    invoke-static {v3}, Lcom/scannerfire/utils/Utils;->getExtraData(Lcom/google/zxing/client/result/ParsedResult;)Landroid/os/Bundle;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 338
    :cond_8
    return-object v0
.end method

.method public static final md5(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "s"    # Ljava/lang/String;

    .prologue
    .line 677
    :try_start_0
    const-string v5, "MD5"

    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 678
    .local v0, "digest":Ljava/security/MessageDigest;
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 679
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    .line 682
    .local v4, "messageDigest":[B
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 683
    .local v2, "hexString":Ljava/lang/StringBuffer;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    array-length v5, v4

    if-lt v3, v5, :cond_0

    .line 689
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    .line 694
    .end local v0    # "digest":Ljava/security/MessageDigest;
    .end local v2    # "hexString":Ljava/lang/StringBuffer;
    .end local v3    # "i":I
    .end local v4    # "messageDigest":[B
    :goto_1
    return-object v5

    .line 684
    .restart local v0    # "digest":Ljava/security/MessageDigest;
    .restart local v2    # "hexString":Ljava/lang/StringBuffer;
    .restart local v3    # "i":I
    .restart local v4    # "messageDigest":[B
    :cond_0
    aget-byte v5, v4, v3

    and-int/lit16 v5, v5, 0xff

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    .line 685
    .local v1, "h":Ljava/lang/String;
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x2

    if-lt v5, v6, :cond_1

    .line 687
    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 683
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 686
    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "0"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_2

    .line 691
    .end local v0    # "digest":Ljava/security/MessageDigest;
    .end local v1    # "h":Ljava/lang/String;
    .end local v2    # "hexString":Ljava/lang/StringBuffer;
    .end local v3    # "i":I
    .end local v4    # "messageDigest":[B
    :catch_0
    move-exception v5

    .line 694
    const-string v5, ""

    goto :goto_1
.end method

.method public static saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V
    .locals 6
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "result"    # Lcom/google/zxing/Result;

    .prologue
    .line 369
    new-instance v2, Lcom/scannerfire/db/DbAdapter;

    invoke-direct {v2, p0}, Lcom/scannerfire/db/DbAdapter;-><init>(Landroid/content/Context;)V

    .line 370
    .local v2, "dba":Lcom/scannerfire/db/DbAdapter;
    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->open()Lcom/scannerfire/db/DbAdapter;

    .line 371
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 372
    .local v0, "c":Ljava/util/Calendar;
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "dd-MM-yyyy"

    invoke-direct {v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 373
    .local v1, "date":Ljava/lang/String;
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "HH:mm:ss"

    invoke-direct {v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 374
    .local v3, "time":Ljava/lang/String;
    invoke-virtual {v2, p1, v3, v1}, Lcom/scannerfire/db/DbAdapter;->createRecord(Lcom/google/zxing/Result;Ljava/lang/String;Ljava/lang/String;)J

    .line 375
    invoke-virtual {v2}, Lcom/scannerfire/db/DbAdapter;->close()V

    .line 376
    return-void
.end method

.method public static setLastElem(I)V
    .locals 0
    .param p0, "i"    # I

    .prologue
    .line 698
    sput p0, Lcom/scannerfire/utils/Utils;->lastElem:I

    .line 699
    return-void
.end method

.method public static showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 283
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 284
    return-void
.end method


# virtual methods
.method public checkConnectivity(Landroid/app/Activity;)Z
    .locals 11
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 124
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .local v0, "arraylist":Ljava/util/ArrayList;
    const-string v6, "connectivity"

    invoke-virtual {p1, v6}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 126
    .local v1, "connectivitymanager":Landroid/net/ConnectivityManager;
    invoke-virtual {v1, v8}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v3

    .line 127
    .local v3, "networkinfo":Landroid/net/NetworkInfo;
    if-eqz v3, :cond_0

    .line 129
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    :cond_0
    invoke-virtual {v1, v7}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v4

    .line 132
    .local v4, "networkinfo1":Landroid/net/NetworkInfo;
    if-eqz v4, :cond_1

    .line 134
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_1
    const/4 v6, 0x6

    invoke-virtual {v1, v6}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v5

    .line 137
    .local v5, "networkinfo2":Landroid/net/NetworkInfo;
    if-eqz v5, :cond_2

    .line 139
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    :cond_2
    const-string v6, ""

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "size"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    const/4 v2, 0x0

    .line 145
    .local v2, "i":I
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lt v2, v6, :cond_3

    move v6, v7

    .line 151
    :goto_1
    return v6

    .line 149
    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/net/NetworkInfo;

    invoke-virtual {v6}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v6

    sget-object v9, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v6, v9, :cond_4

    move v6, v8

    .line 151
    goto :goto_1

    .line 153
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 154
    goto :goto_0
.end method

.method public clearScreen()V
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/scannerfire/utils/Utils;->lastPD:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/scannerfire/utils/Utils;->lastPD:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 163
    :cond_0
    return-void
.end method

.method public getCopyToClipboardPref(Landroid/content/Context;)Z
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 167
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_clipboard"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public getPlaySoundPref(Landroid/content/Context;)Z
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 182
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_sound"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public getRedirectPref(Landroid/content/Context;)Z
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 187
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "preference_automat"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public getScreenDensity(Landroid/app/Activity;)F
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 202
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 203
    .local v0, "displaymetrics":Landroid/util/DisplayMetrics;
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 204
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    return v1
.end method

.method public getTimeDetails()Ljava/lang/String;
    .locals 11

    .prologue
    .line 209
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 210
    .local v0, "calendar":Ljava/util/Calendar;
    const/16 v9, 0xb

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 211
    .local v1, "i":I
    const/16 v9, 0xc

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 212
    .local v3, "j":I
    const/16 v9, 0xd

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 213
    .local v5, "k":I
    const/4 v9, 0x5

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 214
    .local v6, "l":I
    const/4 v9, 0x2

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v9

    add-int/lit8 v2, v9, 0x1

    .line 215
    .local v2, "i1":I
    const/4 v9, 0x1

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 216
    .local v4, "j1":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, "/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 217
    .local v7, "s":Ljava/lang/String;
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, ":"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, ":"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 218
    .local v8, "s1":Ljava/lang/String;
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    return-object v9
.end method

.method public getVibrator(Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 239
    const-string v0, "vibrator"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    return-object v0
.end method

.method public makeAlertDialog(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/Intent;Z)Landroid/app/AlertDialog$Builder;
    .locals 3
    .param p1, "app"    # Landroid/app/Activity;
    .param p2, "s"    # Ljava/lang/String;
    .param p3, "s1"    # Ljava/lang/String;
    .param p4, "flag"    # Z
    .param p5, "intent"    # Landroid/content/Intent;
    .param p6, "finish"    # Z

    .prologue
    .line 244
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 245
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v0, p4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 246
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 247
    invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 248
    const-string v1, "OK"

    new-instance v2, Lcom/scannerfire/utils/Utils$1;

    invoke-direct {v2, p0, p1, p5, p6}, Lcom/scannerfire/utils/Utils$1;-><init>(Lcom/scannerfire/utils/Utils;Landroid/app/Activity;Landroid/content/Intent;Z)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 267
    return-object v0
.end method

.method public showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "s"    # Ljava/lang/String;
    .param p3, "s1"    # Ljava/lang/String;

    .prologue
    .line 274
    invoke-virtual {p0}, Lcom/scannerfire/utils/Utils;->clearScreen()V

    .line 275
    const/4 v1, 0x1

    invoke-static {p1, p2, p3, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Landroid/app/ProgressDialog;

    move-result-object v0

    .line 276
    .local v0, "progressdialog":Landroid/app/ProgressDialog;
    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 277
    iput-object v0, p0, Lcom/scannerfire/utils/Utils;->lastPD:Landroid/app/ProgressDialog;

    .line 278
    return-object v0
.end method
