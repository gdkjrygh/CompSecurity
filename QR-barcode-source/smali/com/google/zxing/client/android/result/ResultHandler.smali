.class public abstract Lcom/google/zxing/client/android/result/ResultHandler;
.super Ljava/lang/Object;
.source "ResultHandler.java"


# static fields
.field private static final ADDRESS_TYPE_STRINGS:[Ljava/lang/String;

.field private static final ADDRESS_TYPE_VALUES:[I

.field private static final EMAIL_TYPE_STRINGS:[Ljava/lang/String;

.field private static final EMAIL_TYPE_VALUES:[I

.field private static final GOOGLE_SHOPPER_ACTIVITY:Ljava/lang/String; = "com.google.android.apps.shopper.results.SearchResultsActivity"

.field private static final GOOGLE_SHOPPER_PACKAGE:Ljava/lang/String; = "com.google.android.apps.shopper"

.field private static final MARKET_REFERRER_SUFFIX:Ljava/lang/String; = "&referrer=utm_source%3Dbarcodescanner%26utm_medium%3Dapps%26utm_campaign%3Dscan"

.field private static final MARKET_URI_PREFIX:Ljava/lang/String; = "market://details?id="

.field public static final MAX_BUTTON_COUNT:I = 0x4

.field private static final NO_TYPE:I = -0x1

.field private static final PHONE_TYPE_STRINGS:[Ljava/lang/String;

.field private static final PHONE_TYPE_VALUES:[I

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final customProductSearch:Ljava/lang/String;

.field private final rawResult:Lcom/google/zxing/Result;

.field private final result:Lcom/google/zxing/client/result/ParsedResult;

.field private final shopperMarketListener:Landroid/content/DialogInterface$OnClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x6

    const/4 v6, 0x3

    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x2

    .line 62
    const-class v0, Lcom/google/zxing/client/android/result/ResultHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->TAG:Ljava/lang/String;

    .line 71
    new-array v0, v6, [Ljava/lang/String;

    const-string v1, "home"

    aput-object v1, v0, v4

    const-string v1, "work"

    aput-object v1, v0, v5

    const-string v1, "mobile"

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->EMAIL_TYPE_STRINGS:[Ljava/lang/String;

    .line 72
    new-array v0, v7, [Ljava/lang/String;

    const-string v1, "home"

    aput-object v1, v0, v4

    const-string v1, "work"

    aput-object v1, v0, v5

    const-string v1, "mobile"

    aput-object v1, v0, v3

    const-string v1, "fax"

    aput-object v1, v0, v6

    const/4 v1, 0x4

    const-string v2, "pager"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "main"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->PHONE_TYPE_STRINGS:[Ljava/lang/String;

    .line 73
    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "home"

    aput-object v1, v0, v4

    const-string v1, "work"

    aput-object v1, v0, v5

    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->ADDRESS_TYPE_STRINGS:[Ljava/lang/String;

    .line 74
    new-array v0, v6, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->EMAIL_TYPE_VALUES:[I

    .line 79
    new-array v0, v7, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->PHONE_TYPE_VALUES:[I

    .line 87
    new-array v0, v3, [I

    fill-array-data v0, :array_2

    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->ADDRESS_TYPE_VALUES:[I

    .line 93
    return-void

    .line 74
    nop

    :array_0
    .array-data 4
        0x1
        0x2
        0x4
    .end array-data

    .line 79
    :array_1
    .array-data 4
        0x1
        0x3
        0x2
        0x4
        0x6
        0xc
    .end array-data

    .line 87
    :array_2
    .array-data 4
        0x1
        0x2
    .end array-data
.end method

.method constructor <init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "result"    # Lcom/google/zxing/client/result/ParsedResult;

    .prologue
    .line 110
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/zxing/client/android/result/ResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V

    .line 111
    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V
    .locals 2
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "result"    # Lcom/google/zxing/client/result/ParsedResult;
    .param p3, "rawResult"    # Lcom/google/zxing/Result;

    .prologue
    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    new-instance v1, Lcom/google/zxing/client/android/result/ResultHandler$1;

    invoke-direct {v1, p0}, Lcom/google/zxing/client/android/result/ResultHandler$1;-><init>(Lcom/google/zxing/client/android/result/ResultHandler;)V

    iput-object v1, p0, Lcom/google/zxing/client/android/result/ResultHandler;->shopperMarketListener:Landroid/content/DialogInterface$OnClickListener;

    .line 114
    iput-object p2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->result:Lcom/google/zxing/client/result/ParsedResult;

    .line 115
    iput-object p1, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    .line 116
    iput-object p3, p0, Lcom/google/zxing/client/android/result/ResultHandler;->rawResult:Lcom/google/zxing/Result;

    .line 117
    invoke-direct {p0}, Lcom/google/zxing/client/android/result/ResultHandler;->parseCustomSearchURL()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/google/zxing/client/android/result/ResultHandler;->customProductSearch:Ljava/lang/String;

    .line 121
    sget v1, Lcom/google/zxing/client/android/R$id;->shopper_button:I

    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 122
    .local v0, "shopperButton":Landroid/view/View;
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 123
    return-void
.end method

.method private static doToContractType(Ljava/lang/String;[Ljava/lang/String;[I)I
    .locals 4
    .param p0, "typeString"    # Ljava/lang/String;
    .param p1, "types"    # [Ljava/lang/String;
    .param p2, "values"    # [I

    .prologue
    const/4 v2, -0x1

    .line 318
    if-nez p0, :cond_1

    .line 327
    :cond_0
    :goto_0
    return v2

    .line 321
    :cond_1
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    array-length v3, p1

    if-ge v0, v3, :cond_0

    .line 322
    aget-object v1, p1, v0

    .line 323
    .local v1, "type":Ljava/lang/String;
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 324
    :cond_2
    aget v2, p2, v0

    goto :goto_0

    .line 321
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private parseCustomSearchURL()Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 520
    iget-object v3, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 521
    .local v1, "prefs":Landroid/content/SharedPreferences;
    const-string v3, "preferences_custom_product_search"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 523
    .local v0, "customProductSearch":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    move-object v0, v2

    .line 526
    .end local v0    # "customProductSearch":Ljava/lang/String;
    :cond_0
    return-object v0
.end method

.method private static putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "intent"    # Landroid/content/Intent;
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 514
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 515
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 517
    :cond_0
    return-void
.end method

.method private static toAddressContractType(Ljava/lang/String;)I
    .locals 2
    .param p0, "typeString"    # Ljava/lang/String;

    .prologue
    .line 314
    sget-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->ADDRESS_TYPE_STRINGS:[Ljava/lang/String;

    sget-object v1, Lcom/google/zxing/client/android/result/ResultHandler;->ADDRESS_TYPE_VALUES:[I

    invoke-static {p0, v0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->doToContractType(Ljava/lang/String;[Ljava/lang/String;[I)I

    move-result v0

    return v0
.end method

.method private static toEmailContractType(Ljava/lang/String;)I
    .locals 2
    .param p0, "typeString"    # Ljava/lang/String;

    .prologue
    .line 306
    sget-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->EMAIL_TYPE_STRINGS:[Ljava/lang/String;

    sget-object v1, Lcom/google/zxing/client/android/result/ResultHandler;->EMAIL_TYPE_VALUES:[I

    invoke-static {p0, v0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->doToContractType(Ljava/lang/String;[Ljava/lang/String;[I)I

    move-result v0

    return v0
.end method

.method private static toPhoneContractType(Ljava/lang/String;)I
    .locals 2
    .param p0, "typeString"    # Ljava/lang/String;

    .prologue
    .line 310
    sget-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->PHONE_TYPE_STRINGS:[Ljava/lang/String;

    sget-object v1, Lcom/google/zxing/client/android/result/ResultHandler;->PHONE_TYPE_VALUES:[I

    invoke-static {p0, v0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->doToContractType(Ljava/lang/String;[Ljava/lang/String;[I)I

    move-result v0

    return v0
.end method


# virtual methods
.method public final addContact([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 14
    .param p1, "names"    # [Ljava/lang/String;
    .param p2, "nicknames"    # [Ljava/lang/String;
    .param p3, "pronunciation"    # Ljava/lang/String;
    .param p4, "phoneNumbers"    # [Ljava/lang/String;
    .param p5, "phoneTypes"    # [Ljava/lang/String;
    .param p6, "emails"    # [Ljava/lang/String;
    .param p7, "emailTypes"    # [Ljava/lang/String;
    .param p8, "note"    # Ljava/lang/String;
    .param p9, "instantMessenger"    # Ljava/lang/String;
    .param p10, "address"    # Ljava/lang/String;
    .param p11, "addressType"    # Ljava/lang/String;
    .param p12, "org"    # Ljava/lang/String;
    .param p13, "title"    # Ljava/lang/String;
    .param p14, "urls"    # [Ljava/lang/String;
    .param p15, "birthday"    # Ljava/lang/String;
    .param p16, "geo"    # [Ljava/lang/String;

    .prologue
    .line 234
    new-instance v4, Landroid/content/Intent;

    const-string v10, "android.intent.action.INSERT_OR_EDIT"

    sget-object v11, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v4, v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 235
    .local v4, "intent":Landroid/content/Intent;
    const-string v10, "vnd.android.cursor.item/contact"

    invoke-virtual {v4, v10}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    const-string v11, "name"

    if-eqz p1, :cond_5

    const/4 v10, 0x0

    aget-object v10, p1, v10

    :goto_0
    invoke-static {v4, v11, v10}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    const-string v10, "phonetic_name"

    move-object/from16 v0, p3

    invoke-static {v4, v10, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    if-eqz p4, :cond_6

    move-object/from16 v0, p4

    array-length v10, v0

    :goto_1
    sget-object v11, Lcom/google/zxing/client/android/Contents;->PHONE_KEYS:[Ljava/lang/String;

    array-length v11, v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 241
    .local v6, "phoneCount":I
    const/4 v9, 0x0

    .local v9, "x":I
    :goto_2
    if-lt v9, v6, :cond_7

    .line 251
    if-eqz p6, :cond_9

    move-object/from16 v0, p6

    array-length v10, v0

    :goto_3
    sget-object v11, Lcom/google/zxing/client/android/Contents;->EMAIL_KEYS:[Ljava/lang/String;

    array-length v11, v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 252
    .local v3, "emailCount":I
    const/4 v9, 0x0

    :goto_4
    if-lt v9, v3, :cond_a

    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .local v2, "aggregatedNotes":Ljava/lang/StringBuilder;
    if-eqz p14, :cond_0

    .line 265
    move-object/from16 v0, p14

    array-length v11, v0

    const/4 v10, 0x0

    :goto_5
    if-lt v10, v11, :cond_c

    .line 271
    :cond_0
    const/4 v10, 0x2

    new-array v11, v10, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object p15, v11, v10

    const/4 v10, 0x1

    aput-object p8, v11, v10

    array-length v12, v11

    const/4 v10, 0x0

    :goto_6
    if-lt v10, v12, :cond_e

    .line 276
    if-eqz p2, :cond_1

    .line 277
    move-object/from16 v0, p2

    array-length v11, v0

    const/4 v10, 0x0

    :goto_7
    if-lt v10, v11, :cond_10

    .line 283
    :cond_1
    if-eqz p16, :cond_2

    .line 284
    const/16 v10, 0xa

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v10

    const/4 v11, 0x0

    aget-object v11, p16, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const/16 v11, 0x2c

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v10

    const/4 v11, 0x1

    aget-object v11, p16, v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-lez v10, :cond_3

    .line 289
    const-string v10, "notes"

    const/4 v11, 0x1

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v4, v10, v11}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    :cond_3
    const-string v10, "im_handle"

    move-object/from16 v0, p9

    invoke-static {v4, v10, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const-string v10, "postal"

    move-object/from16 v0, p10

    invoke-static {v4, v10, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    if-eqz p11, :cond_4

    .line 295
    invoke-static/range {p11 .. p11}, Lcom/google/zxing/client/android/result/ResultHandler;->toAddressContractType(Ljava/lang/String;)I

    move-result v7

    .line 296
    .local v7, "type":I
    if-ltz v7, :cond_4

    .line 297
    const-string v10, "postal_type"

    invoke-virtual {v4, v10, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 300
    .end local v7    # "type":I
    :cond_4
    const-string v10, "company"

    move-object/from16 v0, p12

    invoke-static {v4, v10, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    const-string v10, "job_title"

    move-object/from16 v0, p13

    invoke-static {v4, v10, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    invoke-virtual {p0, v4}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 303
    return-void

    .line 236
    .end local v2    # "aggregatedNotes":Ljava/lang/StringBuilder;
    .end local v3    # "emailCount":I
    .end local v6    # "phoneCount":I
    .end local v9    # "x":I
    :cond_5
    const/4 v10, 0x0

    goto/16 :goto_0

    .line 240
    :cond_6
    const/4 v10, 0x0

    goto/16 :goto_1

    .line 242
    .restart local v6    # "phoneCount":I
    .restart local v9    # "x":I
    :cond_7
    sget-object v10, Lcom/google/zxing/client/android/Contents;->PHONE_KEYS:[Ljava/lang/String;

    aget-object v10, v10, v9

    aget-object v11, p4, v9

    invoke-static {v4, v10, v11}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    if-eqz p5, :cond_8

    move-object/from16 v0, p5

    array-length v10, v0

    if-ge v9, v10, :cond_8

    .line 244
    aget-object v10, p5, v9

    invoke-static {v10}, Lcom/google/zxing/client/android/result/ResultHandler;->toPhoneContractType(Ljava/lang/String;)I

    move-result v7

    .line 245
    .restart local v7    # "type":I
    if-ltz v7, :cond_8

    .line 246
    sget-object v10, Lcom/google/zxing/client/android/Contents;->PHONE_TYPE_KEYS:[Ljava/lang/String;

    aget-object v10, v10, v9

    invoke-virtual {v4, v10, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 241
    .end local v7    # "type":I
    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 251
    :cond_9
    const/4 v10, 0x0

    goto/16 :goto_3

    .line 253
    .restart local v3    # "emailCount":I
    :cond_a
    sget-object v10, Lcom/google/zxing/client/android/Contents;->EMAIL_KEYS:[Ljava/lang/String;

    aget-object v10, v10, v9

    aget-object v11, p6, v9

    invoke-static {v4, v10, v11}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    if-eqz p7, :cond_b

    move-object/from16 v0, p7

    array-length v10, v0

    if-ge v9, v10, :cond_b

    .line 255
    aget-object v10, p7, v9

    invoke-static {v10}, Lcom/google/zxing/client/android/result/ResultHandler;->toEmailContractType(Ljava/lang/String;)I

    move-result v7

    .line 256
    .restart local v7    # "type":I
    if-ltz v7, :cond_b

    .line 257
    sget-object v10, Lcom/google/zxing/client/android/Contents;->EMAIL_TYPE_KEYS:[Ljava/lang/String;

    aget-object v10, v10, v9

    invoke-virtual {v4, v10, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 252
    .end local v7    # "type":I
    :cond_b
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_4

    .line 265
    .restart local v2    # "aggregatedNotes":Ljava/lang/StringBuilder;
    :cond_c
    aget-object v8, p14, v10

    .line 266
    .local v8, "url":Ljava/lang/String;
    if-eqz v8, :cond_d

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_d

    .line 267
    const/16 v12, 0xa

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    :cond_d
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_5

    .line 271
    .end local v8    # "url":Ljava/lang/String;
    :cond_e
    aget-object v1, v11, v10

    .line 272
    .local v1, "aNote":Ljava/lang/String;
    if-eqz v1, :cond_f

    .line 273
    const/16 v13, 0xa

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    :cond_f
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_6

    .line 277
    .end local v1    # "aNote":Ljava/lang/String;
    :cond_10
    aget-object v5, p2, v10

    .line 278
    .local v5, "nickname":Ljava/lang/String;
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_11

    .line 279
    const/16 v12, 0xa

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    :cond_11
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_7
.end method

.method final addEmailOnlyContact([Ljava/lang/String;[Ljava/lang/String;)V
    .locals 17
    .param p1, "emails"    # [Ljava/lang/String;
    .param p2, "emailTypes"    # [Ljava/lang/String;

    .prologue
    .line 212
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    invoke-virtual/range {v0 .. v16}, Lcom/google/zxing/client/android/result/ResultHandler;->addContact([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 213
    return-void
.end method

.method final addPhoneOnlyContact([Ljava/lang/String;[Ljava/lang/String;)V
    .locals 17
    .param p1, "phoneNumbers"    # [Ljava/lang/String;
    .param p2, "phoneTypes"    # [Ljava/lang/String;

    .prologue
    .line 208
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    invoke-virtual/range {v0 .. v16}, Lcom/google/zxing/client/android/result/ResultHandler;->addContact([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 209
    return-void
.end method

.method public areContentsSecure()Z
    .locals 1

    .prologue
    .line 167
    const/4 v0, 0x0

    return v0
.end method

.method final dialPhone(Ljava/lang/String;)V
    .locals 4
    .param p1, "phoneNumber"    # Ljava/lang/String;

    .prologue
    .line 386
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DIAL"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "tel:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 387
    return-void
.end method

.method final dialPhoneFromUri(Ljava/lang/String;)V
    .locals 3
    .param p1, "uri"    # Ljava/lang/String;

    .prologue
    .line 390
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DIAL"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 391
    return-void
.end method

.method final fillInCustomSearchURL(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 530
    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->customProductSearch:Ljava/lang/String;

    if-nez v2, :cond_1

    move-object v1, p1

    .line 546
    :cond_0
    :goto_0
    return-object v1

    .line 534
    :cond_1
    :try_start_0
    const-string v2, "UTF-8"

    invoke-static {p1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p1

    .line 538
    :goto_1
    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->customProductSearch:Ljava/lang/String;

    const-string v3, "%s"

    invoke-virtual {v2, v3, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 539
    .local v1, "url":Ljava/lang/String;
    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->rawResult:Lcom/google/zxing/Result;

    if-eqz v2, :cond_0

    .line 540
    const-string v2, "%f"

    iget-object v3, p0, Lcom/google/zxing/client/android/result/ResultHandler;->rawResult:Lcom/google/zxing/Result;

    invoke-virtual {v3}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 541
    const-string v2, "%t"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 542
    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->rawResult:Lcom/google/zxing/Result;

    invoke-static {v2}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v0

    .line 543
    .local v0, "parsedResultAgain":Lcom/google/zxing/client/result/ParsedResult;
    const-string v2, "%t"

    invoke-virtual {v0}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 535
    .end local v0    # "parsedResultAgain":Lcom/google/zxing/client/result/ParsedResult;
    .end local v1    # "url":Ljava/lang/String;
    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method final getActivity()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    return-object v0
.end method

.method public abstract getButtonCount()I
.end method

.method public abstract getButtonText(I)I
.end method

.method final getDirections(DD)V
    .locals 5
    .param p1, "latitude"    # D
    .param p3, "longitude"    # D

    .prologue
    .line 412
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "http://maps.google."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 413
    iget-object v3, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-static {v3}, Lcom/google/zxing/client/android/LocaleManager;->getCountryTLD(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/maps?f=d&daddr="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x2c

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 412
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 414
    return-void
.end method

.method public getDisplayContents()Ljava/lang/CharSequence;
    .locals 3

    .prologue
    .line 187
    iget-object v1, p0, Lcom/google/zxing/client/android/result/ResultHandler;->result:Lcom/google/zxing/client/result/ParsedResult;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResult;->getDisplayResult()Ljava/lang/String;

    move-result-object v0

    .line 188
    .local v0, "contents":Ljava/lang/String;
    const-string v1, "\r"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method public abstract getDisplayTitle()I
.end method

.method public final getResult()Lcom/google/zxing/client/result/ParsedResult;
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/google/zxing/client/android/result/ResultHandler;->result:Lcom/google/zxing/client/result/ParsedResult;

    return-object v0
.end method

.method public final getType()Lcom/google/zxing/client/result/ParsedResultType;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lcom/google/zxing/client/android/result/ResultHandler;->result:Lcom/google/zxing/client/result/ParsedResult;

    invoke-virtual {v0}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v0

    return-object v0
.end method

.method public abstract handleButtonPress(I)V
.end method

.method final hasCustomProductSearch()Z
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/google/zxing/client/android/result/ResultHandler;->customProductSearch:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final launchIntent(Landroid/content/Intent;)V
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 503
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/google/zxing/client/android/result/ResultHandler;->rawLaunchIntent(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 511
    :goto_0
    return-void

    .line 504
    :catch_0
    move-exception v1

    .line 505
    .local v1, "ignored":Landroid/content/ActivityNotFoundException;
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 506
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    sget v2, Lcom/google/zxing/client/android/R$string;->app_name:I

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 507
    sget v2, Lcom/google/zxing/client/android/R$string;->msg_intent_failed:I

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 508
    sget v2, Lcom/google/zxing/client/android/R$string;->button_ok:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 509
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method final openBookSearch(Ljava/lang/String;)V
    .locals 3
    .param p1, "isbn"    # Ljava/lang/String;

    .prologue
    .line 424
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://books.google."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-static {v2}, Lcom/google/zxing/client/android/LocaleManager;->getBookSearchCountryTLD(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 425
    const-string v2, "/books?vid=isbn"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 424
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 426
    .local v0, "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 427
    return-void
.end method

.method final openGoogleShopper(Ljava/lang/String;)V
    .locals 6
    .param p1, "query"    # Ljava/lang/String;

    .prologue
    .line 461
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.SEARCH"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 462
    .local v2, "intent":Landroid/content/Intent;
    const-string v4, "com.google.android.apps.shopper"

    const-string v5, "com.google.android.apps.shopper.results.SearchResultsActivity"

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 463
    const-string v4, "query"

    invoke-virtual {v2, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 466
    iget-object v4, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 467
    .local v3, "pm":Landroid/content/pm/PackageManager;
    const/high16 v4, 0x10000

    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 469
    .local v0, "availableApps":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 471
    iget-object v4, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-virtual {v4, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 482
    :goto_0
    return-void

    .line 474
    :cond_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v4, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-direct {v1, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 475
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    sget v4, Lcom/google/zxing/client/android/R$string;->msg_google_shopper_missing:I

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 476
    sget v4, Lcom/google/zxing/client/android/R$string;->msg_install_google_shopper:I

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 477
    sget v4, Lcom/google/zxing/client/android/R$drawable;->shopper_icon:I

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    .line 478
    sget v4, Lcom/google/zxing/client/android/R$string;->button_ok:I

    iget-object v5, p0, Lcom/google/zxing/client/android/result/ResultHandler;->shopperMarketListener:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v1, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 479
    sget v4, Lcom/google/zxing/client/android/R$string;->button_cancel:I

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 480
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method final openMap(Ljava/lang/String;)V
    .locals 3
    .param p1, "geoURI"    # Ljava/lang/String;

    .prologue
    .line 394
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 395
    return-void
.end method

.method final openProductSearch(Ljava/lang/String;)V
    .locals 3
    .param p1, "upc"    # Ljava/lang/String;

    .prologue
    .line 418
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://www.google."

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-static {v2}, Lcom/google/zxing/client/android/LocaleManager;->getProductSearchCountryTLD(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 419
    const-string v2, "/m/products?q="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&source=zxing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 418
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 420
    .local v0, "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 421
    return-void
.end method

.method final openURL(Ljava/lang/String;)V
    .locals 5
    .param p1, "url"    # Ljava/lang/String;

    .prologue
    .line 439
    const-string v2, "HTTP://"

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 440
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "http"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x4

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 444
    :cond_0
    :goto_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 446
    .local v1, "intent":Landroid/content/Intent;
    :try_start_0
    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 450
    :goto_1
    return-void

    .line 441
    .end local v1    # "intent":Landroid/content/Intent;
    :cond_1
    const-string v2, "HTTPS://"

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 442
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "https"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x5

    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 447
    .restart local v1    # "intent":Landroid/content/Intent;
    :catch_0
    move-exception v0

    .line 448
    .local v0, "ignored":Landroid/content/ActivityNotFoundException;
    sget-object v2, Lcom/google/zxing/client/android/result/ResultHandler;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Nothing available to handle "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method final rawLaunchIntent(Landroid/content/Intent;)V
    .locals 3
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    .line 491
    if-eqz p1, :cond_0

    .line 492
    const/high16 v0, 0x80000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 493
    sget-object v0, Lcom/google/zxing/client/android/result/ResultHandler;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Launching intent: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " with extras: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    iget-object v0, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 496
    :cond_0
    return-void
.end method

.method final searchBookContents(Ljava/lang/String;)V
    .locals 3
    .param p1, "isbnOrUrl"    # Ljava/lang/String;

    .prologue
    .line 430
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.zxing.client.android.SEARCH_BOOK_CONTENTS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 431
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    const-class v2, Lcom/google/zxing/client/android/book/SearchBookContentsActivity;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 432
    const-string v1, "ISBN"

    invoke-static {v0, v1, p1}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 434
    return-void
.end method

.method final searchMap(Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 5
    .param p1, "address"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 404
    move-object v0, p1

    .line 405
    .local v0, "query":Ljava/lang/String;
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 406
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 408
    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "geo:0,0?q="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 409
    return-void
.end method

.method final sendEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "address"    # Ljava/lang/String;
    .param p2, "subject"    # Ljava/lang/String;
    .param p3, "body"    # Ljava/lang/String;

    .prologue
    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mailto:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/google/zxing/client/android/result/ResultHandler;->sendEmailFromUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    return-void
.end method

.method final sendEmailFromUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "email"    # Ljava/lang/String;
    .param p3, "subject"    # Ljava/lang/String;
    .param p4, "body"    # Ljava/lang/String;

    .prologue
    .line 341
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 342
    .local v0, "intent":Landroid/content/Intent;
    if-eqz p2, :cond_0

    .line 343
    const-string v1, "android.intent.extra.EMAIL"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 345
    :cond_0
    const-string v1, "android.intent.extra.SUBJECT"

    invoke-static {v0, v1, p3}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    const-string v1, "android.intent.extra.TEXT"

    invoke-static {v0, v1, p4}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 348
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 349
    return-void
.end method

.method final sendMMS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "phoneNumber"    # Ljava/lang/String;
    .param p2, "subject"    # Ljava/lang/String;
    .param p3, "body"    # Ljava/lang/String;

    .prologue
    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mmsto:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p3}, Lcom/google/zxing/client/android/result/ResultHandler;->sendMMSFromUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    return-void
.end method

.method final sendMMSFromUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "subject"    # Ljava/lang/String;
    .param p3, "body"    # Ljava/lang/String;

    .prologue
    .line 373
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 375
    .local v0, "intent":Landroid/content/Intent;
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 376
    :cond_0
    const-string v1, "subject"

    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    sget v3, Lcom/google/zxing/client/android/R$string;->msg_default_mms_subject:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    :goto_0
    const-string v1, "sms_body"

    invoke-static {v0, v1, p3}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    const-string v1, "compose_mode"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 382
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 383
    return-void

    .line 378
    :cond_1
    const-string v1, "subject"

    invoke-static {v0, v1, p2}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method final sendSMS(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "phoneNumber"    # Ljava/lang/String;
    .param p2, "body"    # Ljava/lang/String;

    .prologue
    .line 357
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "smsto:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/google/zxing/client/android/result/ResultHandler;->sendSMSFromUri(Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    return-void
.end method

.method final sendSMSFromUri(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "body"    # Ljava/lang/String;

    .prologue
    .line 361
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 362
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "sms_body"

    invoke-static {v0, v1, p2}, Lcom/google/zxing/client/android/result/ResultHandler;->putExtra(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    const-string v1, "compose_mode"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 365
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 366
    return-void
.end method

.method final shareByEmail(Ljava/lang/String;)V
    .locals 4
    .param p1, "contents"    # Ljava/lang/String;

    .prologue
    .line 331
    const-string v0, "mailto:"

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    sget v3, Lcom/google/zxing/client/android/R$string;->msg_share_subject_line:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2, p1}, Lcom/google/zxing/client/android/result/ResultHandler;->sendEmailFromUri(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    return-void
.end method

.method final shareBySMS(Ljava/lang/String;)V
    .locals 4
    .param p1, "contents"    # Ljava/lang/String;

    .prologue
    .line 352
    const-string v0, "smsto:"

    new-instance v1, Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    sget v3, Lcom/google/zxing/client/android/R$string;->msg_share_subject_line:I

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, ":\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 353
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 352
    invoke-virtual {p0, v0, v1}, Lcom/google/zxing/client/android/result/ResultHandler;->sendSMSFromUri(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    return-void
.end method

.method final showGoogleShopperButton(Landroid/view/View$OnClickListener;)V
    .locals 3
    .param p1, "listener"    # Landroid/view/View$OnClickListener;

    .prologue
    .line 176
    iget-object v1, p0, Lcom/google/zxing/client/android/result/ResultHandler;->activity:Landroid/app/Activity;

    sget v2, Lcom/google/zxing/client/android/R$id;->shopper_button:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 177
    .local v0, "shopperButton":Landroid/view/View;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 178
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    return-void
.end method

.method final webSearch(Ljava/lang/String;)V
    .locals 2
    .param p1, "query"    # Ljava/lang/String;

    .prologue
    .line 453
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.WEB_SEARCH"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 454
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "query"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 455
    invoke-virtual {p0, v0}, Lcom/google/zxing/client/android/result/ResultHandler;->launchIntent(Landroid/content/Intent;)V

    .line 456
    return-void
.end method
