.class public final Lcom/google/zxing/client/android/result/ResultHandlerFactory;
.super Ljava/lang/Object;
.source "ResultHandlerFactory.java"


# static fields
.field private static synthetic $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType:[I


# direct methods
.method static synthetic $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType()[I
    .locals 3

    .prologue
    .line 29
    sget-object v0, Lcom/google/zxing/client/android/result/ResultHandlerFactory;->$SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/zxing/client/result/ParsedResultType;->values()[Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->ADDRESSBOOK:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_a

    :goto_1
    :try_start_1
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->CALENDAR:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_9

    :goto_2
    :try_start_2
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->EMAIL_ADDRESS:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_8

    :goto_3
    :try_start_3
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->GEO:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_7

    :goto_4
    :try_start_4
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->ISBN:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/16 v2, 0xb

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_6

    :goto_5
    :try_start_5
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->PRODUCT:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :goto_6
    :try_start_6
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->SMS:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_4

    :goto_7
    :try_start_7
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->TEL:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_3

    :goto_8
    :try_start_8
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->TEXT:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_2

    :goto_9
    :try_start_9
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->URI:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_1

    :goto_a
    :try_start_a
    sget-object v1, Lcom/google/zxing/client/result/ParsedResultType;->WIFI:Lcom/google/zxing/client/result/ParsedResultType;

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    const/16 v2, 0xa

    aput v2, v0, v1
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_0

    :goto_b
    sput-object v0, Lcom/google/zxing/client/android/result/ResultHandlerFactory;->$SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_b

    :catch_1
    move-exception v1

    goto :goto_a

    :catch_2
    move-exception v1

    goto :goto_9

    :catch_3
    move-exception v1

    goto :goto_8

    :catch_4
    move-exception v1

    goto :goto_7

    :catch_5
    move-exception v1

    goto :goto_6

    :catch_6
    move-exception v1

    goto :goto_5

    :catch_7
    move-exception v1

    goto :goto_4

    :catch_8
    move-exception v1

    goto :goto_3

    :catch_9
    move-exception v1

    goto :goto_2

    :catch_a
    move-exception v1

    goto :goto_1
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public static makeResultHandler(Lcom/google/zxing/client/android/CaptureActivity;Lcom/google/zxing/Result;)Lcom/google/zxing/client/android/result/ResultHandler;
    .locals 3
    .param p0, "activity"    # Lcom/google/zxing/client/android/CaptureActivity;
    .param p1, "rawResult"    # Lcom/google/zxing/Result;

    .prologue
    .line 34
    invoke-static {p1}, Lcom/google/zxing/client/android/result/ResultHandlerFactory;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v0

    .line 35
    .local v0, "result":Lcom/google/zxing/client/result/ParsedResult;
    invoke-static {}, Lcom/google/zxing/client/android/result/ResultHandlerFactory;->$SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType()[I

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 57
    :pswitch_0
    new-instance v1, Lcom/google/zxing/client/android/result/TextResultHandler;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/zxing/client/android/result/TextResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V

    :goto_0
    return-object v1

    .line 37
    :pswitch_1
    new-instance v1, Lcom/google/zxing/client/android/result/AddressBookResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/AddressBookResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 39
    :pswitch_2
    new-instance v1, Lcom/google/zxing/client/android/result/EmailAddressResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/EmailAddressResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 41
    :pswitch_3
    new-instance v1, Lcom/google/zxing/client/android/result/ProductResultHandler;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/zxing/client/android/result/ProductResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V

    goto :goto_0

    .line 43
    :pswitch_4
    new-instance v1, Lcom/google/zxing/client/android/result/URIResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/URIResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 45
    :pswitch_5
    new-instance v1, Lcom/google/zxing/client/android/result/WifiResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/WifiResultHandler;-><init>(Lcom/google/zxing/client/android/CaptureActivity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 47
    :pswitch_6
    new-instance v1, Lcom/google/zxing/client/android/result/GeoResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/GeoResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 49
    :pswitch_7
    new-instance v1, Lcom/google/zxing/client/android/result/TelResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/TelResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 51
    :pswitch_8
    new-instance v1, Lcom/google/zxing/client/android/result/SMSResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/SMSResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 53
    :pswitch_9
    new-instance v1, Lcom/google/zxing/client/android/result/CalendarResultHandler;

    invoke-direct {v1, p0, v0}, Lcom/google/zxing/client/android/result/CalendarResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;)V

    goto :goto_0

    .line 55
    :pswitch_a
    new-instance v1, Lcom/google/zxing/client/android/result/ISBNResultHandler;

    invoke-direct {v1, p0, v0, p1}, Lcom/google/zxing/client/android/result/ISBNResultHandler;-><init>(Landroid/app/Activity;Lcom/google/zxing/client/result/ParsedResult;Lcom/google/zxing/Result;)V

    goto :goto_0

    .line 35
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_5
        :pswitch_a
    .end packed-switch
.end method

.method private static parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;
    .locals 1
    .param p0, "rawResult"    # Lcom/google/zxing/Result;

    .prologue
    .line 62
    invoke-static {p0}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v0

    return-object v0
.end method
