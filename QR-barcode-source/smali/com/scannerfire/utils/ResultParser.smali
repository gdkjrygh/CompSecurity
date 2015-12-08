.class public Lcom/scannerfire/utils/ResultParser;
.super Ljava/lang/Object;
.source "ResultParser.java"


# static fields
.field private static synthetic $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType:[I


# direct methods
.method static synthetic $SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType()[I
    .locals 3

    .prologue
    .line 6
    sget-object v0, Lcom/scannerfire/utils/ResultParser;->$SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType:[I

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
    sput-object v0, Lcom/scannerfire/utils/ResultParser;->$SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType:[I

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

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getParsedResult(Lcom/google/zxing/client/result/ParsedResult;)Lcom/scannerfire/utils/Utils$MODE;
    .locals 2
    .param p0, "parsed"    # Lcom/google/zxing/client/result/ParsedResult;

    .prologue
    .line 30
    invoke-static {}, Lcom/scannerfire/utils/ResultParser;->$SWITCH_TABLE$com$google$zxing$client$result$ParsedResultType()[I

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/zxing/client/result/ParsedResultType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 54
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    :goto_0
    return-object v0

    .line 32
    :pswitch_0
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_contact:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 34
    :pswitch_1
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_email:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 36
    :pswitch_2
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_calendar:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 38
    :pswitch_3
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_geo:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 40
    :pswitch_4
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_isbn:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 42
    :pswitch_5
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_product:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 44
    :pswitch_6
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 46
    :pswitch_7
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_phone:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 48
    :pswitch_8
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 50
    :pswitch_9
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_url:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 52
    :pswitch_a
    sget-object v0, Lcom/scannerfire/utils/Utils$MODE;->_text:Lcom/scannerfire/utils/Utils$MODE;

    goto :goto_0

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_3
        :pswitch_7
        :pswitch_6
        :pswitch_2
        :pswitch_a
        :pswitch_4
    .end packed-switch
.end method

.method private isContact(Ljava/lang/String;)Z
    .locals 1
    .param p1, "contents"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 10
    const-string v0, "BEGIN:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isGeolocalization(Ljava/lang/String;)Z
    .locals 1
    .param p1, "contents"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 24
    const-string v0, "geo:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    const/4 v0, 0x1

    .line 26
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private isUrl(Ljava/lang/String;)Z
    .locals 1
    .param p1, "contents"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 17
    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "www."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    :cond_0
    const/4 v0, 0x1

    .line 19
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
