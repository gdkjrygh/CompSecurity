.class public Lorg/apache/cordova/globalization/Globalization;
.super Lorg/apache/cordova/CordovaPlugin;
.source "Globalization.java"


# static fields
.field public static final CURRENCY:Ljava/lang/String; = "currency"

.field public static final CURRENCYCODE:Ljava/lang/String; = "currencyCode"

.field public static final DATE:Ljava/lang/String; = "date"

.field public static final DATESTRING:Ljava/lang/String; = "dateString"

.field public static final DATETOSTRING:Ljava/lang/String; = "dateToString"

.field public static final DAYS:Ljava/lang/String; = "days"

.field public static final FORMATLENGTH:Ljava/lang/String; = "formatLength"

.field public static final FULL:Ljava/lang/String; = "full"

.field public static final GETCURRENCYPATTERN:Ljava/lang/String; = "getCurrencyPattern"

.field public static final GETDATENAMES:Ljava/lang/String; = "getDateNames"

.field public static final GETDATEPATTERN:Ljava/lang/String; = "getDatePattern"

.field public static final GETFIRSTDAYOFWEEK:Ljava/lang/String; = "getFirstDayOfWeek"

.field public static final GETLOCALENAME:Ljava/lang/String; = "getLocaleName"

.field public static final GETNUMBERPATTERN:Ljava/lang/String; = "getNumberPattern"

.field public static final GETPREFERREDLANGUAGE:Ljava/lang/String; = "getPreferredLanguage"

.field public static final ISDAYLIGHTSAVINGSTIME:Ljava/lang/String; = "isDayLightSavingsTime"

.field public static final ITEM:Ljava/lang/String; = "item"

.field public static final LONG:Ljava/lang/String; = "long"

.field public static final MEDIUM:Ljava/lang/String; = "medium"

.field public static final MONTHS:Ljava/lang/String; = "months"

.field public static final NARROW:Ljava/lang/String; = "narrow"

.field public static final NUMBER:Ljava/lang/String; = "number"

.field public static final NUMBERSTRING:Ljava/lang/String; = "numberString"

.field public static final NUMBERTOSTRING:Ljava/lang/String; = "numberToString"

.field public static final OPTIONS:Ljava/lang/String; = "options"

.field public static final PERCENT:Ljava/lang/String; = "percent"

.field public static final SELECTOR:Ljava/lang/String; = "selector"

.field public static final STRINGTODATE:Ljava/lang/String; = "stringToDate"

.field public static final STRINGTONUMBER:Ljava/lang/String; = "stringToNumber"

.field public static final TIME:Ljava/lang/String; = "time"

.field public static final TYPE:Ljava/lang/String; = "type"

.field public static final WIDE:Ljava/lang/String; = "wide"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Lorg/apache/cordova/CordovaPlugin;-><init>()V

    return-void
.end method

.method private getCurrencyPattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 7
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 583
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 586
    .local v4, "obj":Lorg/json/JSONObject;
    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "currencyCode"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 589
    .local v0, "code":Ljava/lang/String;
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-static {v5}, Ljava/text/DecimalFormat;->getCurrencyInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v2

    check-cast v2, Ljava/text/DecimalFormat;

    .line 592
    .local v2, "fmt":Ljava/text/DecimalFormat;
    invoke-static {v0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v1

    .line 593
    .local v1, "currency":Ljava/util/Currency;
    invoke-virtual {v2, v1}, Ljava/text/DecimalFormat;->setCurrency(Ljava/util/Currency;)V

    .line 596
    const-string v5, "pattern"

    invoke-virtual {v2}, Ljava/text/DecimalFormat;->toPattern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 597
    const-string v5, "code"

    invoke-virtual {v1}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 598
    const-string v5, "fraction"

    invoke-virtual {v2}, Ljava/text/DecimalFormat;->getMinimumFractionDigits()I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 599
    const-string v5, "rounding"

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 600
    const-string v5, "decimal"

    invoke-virtual {v2}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v6

    invoke-virtual {v6}, Ljava/text/DecimalFormatSymbols;->getDecimalSeparator()C

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 601
    const-string v5, "grouping"

    invoke-virtual {v2}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v6

    invoke-virtual {v6}, Ljava/text/DecimalFormatSymbols;->getGroupingSeparator()C

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 603
    return-object v4

    .line 604
    .end local v0    # "code":Ljava/lang/String;
    .end local v1    # "currency":Ljava/util/Currency;
    .end local v2    # "fmt":Ljava/text/DecimalFormat;
    :catch_0
    move-exception v3

    .line 605
    .local v3, "ge":Ljava/lang/Exception;
    new-instance v5, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v6, "FORMATTING_ERROR"

    invoke-direct {v5, v6}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method private getDateNames(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 16
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 371
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 373
    .local v8, "obj":Lorg/json/JSONObject;
    new-instance v11, Lorg/json/JSONArray;

    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 374
    .local v11, "value":Lorg/json/JSONArray;
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 377
    .local v6, "namesList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v10, 0x0

    .line 378
    .local v10, "type":I
    const/4 v3, 0x0

    .line 381
    .local v3, "item":I
    const/4 v12, 0x0

    :try_start_0
    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    invoke-virtual {v12}, Lorg/json/JSONObject;->length()I

    move-result v12

    if-lez v12, :cond_1

    .line 383
    const/4 v12, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    const-string v13, "options"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    const-string v13, "type"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_0

    .line 384
    const/4 v12, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    const-string v13, "options"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    const-string v13, "type"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 385
    .local v9, "t":Ljava/lang/String;
    const-string v12, "narrow"

    invoke-virtual {v9, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_0

    add-int/lit8 v10, v10, 0x1

    .line 388
    .end local v9    # "t":Ljava/lang/String;
    :cond_0
    const/4 v12, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    const-string v13, "options"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    const-string v13, "item"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1

    .line 389
    const/4 v12, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    const-string v13, "options"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    const-string v13, "item"

    invoke-virtual {v12, v13}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 390
    .restart local v9    # "t":Ljava/lang/String;
    const-string v12, "days"

    invoke-virtual {v9, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_1

    add-int/lit8 v3, v3, 0xa

    .line 394
    .end local v9    # "t":Ljava/lang/String;
    :cond_1
    add-int v4, v3, v10

    .line 395
    .local v4, "method":I
    const/4 v12, 0x1

    if-ne v4, v12, :cond_2

    .line 396
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    const/4 v13, 0x2

    const/4 v14, 0x1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v15

    invoke-virtual {v12, v13, v14, v15}, Ljava/util/Calendar;->getDisplayNames(IILjava/util/Locale;)Ljava/util/Map;

    move-result-object v7

    .line 406
    .local v7, "namesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    :goto_0
    invoke-interface {v7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 407
    .local v5, "name":Ljava/lang/String;
    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 424
    .end local v4    # "method":I
    .end local v5    # "name":Ljava/lang/String;
    .end local v7    # "namesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    :catch_0
    move-exception v1

    .line 425
    .local v1, "ge":Ljava/lang/Exception;
    new-instance v12, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v13, "UNKNOWN_ERROR"

    invoke-direct {v12, v13}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v12

    .line 397
    .end local v1    # "ge":Ljava/lang/Exception;
    .restart local v4    # "method":I
    :cond_2
    const/16 v12, 0xa

    if-ne v4, v12, :cond_3

    .line 398
    :try_start_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    const/4 v13, 0x7

    const/4 v14, 0x2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v15

    invoke-virtual {v12, v13, v14, v15}, Ljava/util/Calendar;->getDisplayNames(IILjava/util/Locale;)Ljava/util/Map;

    move-result-object v7

    .restart local v7    # "namesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    goto :goto_0

    .line 399
    .end local v7    # "namesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    :cond_3
    const/16 v12, 0xb

    if-ne v4, v12, :cond_4

    .line 400
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    const/4 v13, 0x7

    const/4 v14, 0x1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v15

    invoke-virtual {v12, v13, v14, v15}, Ljava/util/Calendar;->getDisplayNames(IILjava/util/Locale;)Ljava/util/Map;

    move-result-object v7

    .restart local v7    # "namesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    goto :goto_0

    .line 402
    .end local v7    # "namesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    :cond_4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    const/4 v13, 0x2

    const/4 v14, 0x2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v15

    invoke-virtual {v12, v13, v14, v15}, Ljava/util/Calendar;->getDisplayNames(IILjava/util/Locale;)Ljava/util/Map;

    move-result-object v7

    .restart local v7    # "namesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    goto :goto_0

    .line 411
    :cond_5
    new-instance v12, Lorg/apache/cordova/globalization/Globalization$1;

    move-object/from16 v0, p0

    invoke-direct {v12, v0, v7}, Lorg/apache/cordova/globalization/Globalization$1;-><init>(Lorg/apache/cordova/globalization/Globalization;Ljava/util/Map;)V

    invoke-static {v6, v12}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 418
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v12

    if-ge v2, v12, :cond_6

    .line 419
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 418
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 423
    :cond_6
    const-string v12, "value"

    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v12

    return-object v12
.end method

.method private getDatePattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 12
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 309
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 312
    .local v6, "obj":Lorg/json/JSONObject;
    :try_start_0
    iget-object v9, p0, Lorg/apache/cordova/globalization/Globalization;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v9}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v9

    invoke-static {v9}, Landroid/text/format/DateFormat;->getDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v1

    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 313
    .local v1, "fmtDate":Ljava/text/SimpleDateFormat;
    iget-object v9, p0, Lorg/apache/cordova/globalization/Globalization;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v9}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v9

    invoke-static {v9}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v3

    check-cast v3, Ljava/text/SimpleDateFormat;

    .line 315
    .local v3, "fmtTime":Ljava/text/SimpleDateFormat;
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/text/SimpleDateFormat;->toLocalizedPattern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v3}, Ljava/text/SimpleDateFormat;->toLocalizedPattern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 318
    .local v0, "fmt":Ljava/lang/String;
    const/4 v9, 0x0

    invoke-virtual {p1, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    const-string v10, "options"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 321
    const/4 v9, 0x0

    invoke-virtual {p1, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    const-string v10, "options"

    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 323
    .local v5, "innerOptions":Lorg/json/JSONObject;
    const-string v9, "formatLength"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 324
    const-string v9, "formatLength"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 325
    .local v2, "fmtOpt":Ljava/lang/String;
    const-string v9, "medium"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 326
    iget-object v9, p0, Lorg/apache/cordova/globalization/Globalization;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v9}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v9

    invoke-static {v9}, Landroid/text/format/DateFormat;->getMediumDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v1

    .end local v1    # "fmtDate":Ljava/text/SimpleDateFormat;
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 333
    .end local v2    # "fmtOpt":Ljava/lang/String;
    .restart local v1    # "fmtDate":Ljava/text/SimpleDateFormat;
    :cond_0
    :goto_0
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/text/SimpleDateFormat;->toLocalizedPattern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, " "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v3}, Ljava/text/SimpleDateFormat;->toLocalizedPattern()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 334
    const-string v9, "selector"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 335
    const-string v9, "selector"

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 336
    .local v7, "selOpt":Ljava/lang/String;
    const-string v9, "date"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 337
    invoke-virtual {v1}, Ljava/text/SimpleDateFormat;->toLocalizedPattern()Ljava/lang/String;

    move-result-object v0

    .line 346
    .end local v5    # "innerOptions":Lorg/json/JSONObject;
    .end local v7    # "selOpt":Ljava/lang/String;
    :cond_1
    :goto_1
    invoke-static {}, Landroid/text/format/Time;->getCurrentTimezone()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v8

    .line 348
    .local v8, "tz":Ljava/util/TimeZone;
    const-string v9, "pattern"

    invoke-virtual {v6, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 349
    const-string v9, "timezone"

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v8, v10, v11}, Ljava/util/TimeZone;->getDisplayName(ZI)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 350
    const-string v9, "utc_offset"

    invoke-virtual {v8}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v10

    div-int/lit16 v10, v10, 0x3e8

    invoke-virtual {v6, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 351
    const-string v9, "dst_offset"

    invoke-virtual {v8}, Ljava/util/TimeZone;->getDSTSavings()I

    move-result v10

    div-int/lit16 v10, v10, 0x3e8

    invoke-virtual {v6, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 352
    return-object v6

    .line 327
    .end local v8    # "tz":Ljava/util/TimeZone;
    .restart local v2    # "fmtOpt":Ljava/lang/String;
    .restart local v5    # "innerOptions":Lorg/json/JSONObject;
    :cond_2
    const-string v9, "long"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "full"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 328
    :cond_3
    iget-object v9, p0, Lorg/apache/cordova/globalization/Globalization;->cordova:Lorg/apache/cordova/CordovaInterface;

    invoke-interface {v9}, Lorg/apache/cordova/CordovaInterface;->getActivity()Landroid/app/Activity;

    move-result-object v9

    invoke-static {v9}, Landroid/text/format/DateFormat;->getLongDateFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v1

    .end local v1    # "fmtDate":Ljava/text/SimpleDateFormat;
    check-cast v1, Ljava/text/SimpleDateFormat;

    .restart local v1    # "fmtDate":Ljava/text/SimpleDateFormat;
    goto/16 :goto_0

    .line 338
    .end local v2    # "fmtOpt":Ljava/lang/String;
    .restart local v7    # "selOpt":Ljava/lang/String;
    :cond_4
    const-string v9, "time"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 339
    invoke-virtual {v3}, Ljava/text/SimpleDateFormat;->toLocalizedPattern()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1

    .line 354
    .end local v0    # "fmt":Ljava/lang/String;
    .end local v1    # "fmtDate":Ljava/text/SimpleDateFormat;
    .end local v3    # "fmtTime":Ljava/text/SimpleDateFormat;
    .end local v5    # "innerOptions":Lorg/json/JSONObject;
    .end local v7    # "selOpt":Ljava/lang/String;
    :catch_0
    move-exception v4

    .line 355
    .local v4, "ge":Ljava/lang/Exception;
    new-instance v9, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v10, "PATTERN_ERROR"

    invoke-direct {v9, v10}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v9
.end method

.method private getDateToString(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 8
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 233
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 235
    .local v4, "obj":Lorg/json/JSONObject;
    :try_start_0
    new-instance v0, Ljava/util/Date;

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "date"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {v0, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 238
    .local v0, "date":Ljava/util/Date;
    invoke-direct {p0, p1}, Lorg/apache/cordova/globalization/Globalization;->getDatePattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v1

    .line 239
    .local v1, "datePattern":Lorg/json/JSONObject;
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v5, "pattern"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 242
    .local v2, "fmt":Ljava/text/SimpleDateFormat;
    const-string v5, "value"

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    return-object v5

    .line 243
    .end local v0    # "date":Ljava/util/Date;
    .end local v1    # "datePattern":Lorg/json/JSONObject;
    .end local v2    # "fmt":Ljava/text/SimpleDateFormat;
    :catch_0
    move-exception v3

    .line 244
    .local v3, "ge":Ljava/lang/Exception;
    new-instance v5, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v6, "FORMATTING_ERROR"

    invoke-direct {v5, v6}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method private getFirstDayOfWeek(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 5
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 462
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 464
    .local v1, "obj":Lorg/json/JSONObject;
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result v2

    .line 465
    .local v2, "value":I
    const-string v3, "value"

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    return-object v3

    .line 466
    .end local v2    # "value":I
    :catch_0
    move-exception v0

    .line 467
    .local v0, "ge":Ljava/lang/Exception;
    new-instance v3, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v4, "UNKNOWN_ERROR"

    invoke-direct {v3, v4}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method private getIsDayLightSavingsTime(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 8
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 439
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 440
    .local v3, "obj":Lorg/json/JSONObject;
    const/4 v1, 0x0

    .line 442
    .local v1, "dst":Z
    :try_start_0
    new-instance v0, Ljava/util/Date;

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "date"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-direct {v0, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 444
    .local v0, "date":Ljava/util/Date;
    invoke-static {}, Landroid/text/format/Time;->getCurrentTimezone()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    .line 445
    .local v4, "tz":Ljava/util/TimeZone;
    invoke-virtual {v4, v0}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result v1

    .line 447
    const-string v5, "dst"

    invoke-virtual {v3, v5, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    return-object v5

    .line 448
    .end local v0    # "date":Ljava/util/Date;
    .end local v4    # "tz":Ljava/util/TimeZone;
    :catch_0
    move-exception v2

    .line 449
    .local v2, "ge":Ljava/lang/Exception;
    new-instance v5, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v6, "UNKNOWN_ERROR"

    invoke-direct {v5, v6}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method private getLocaleName()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 196
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 198
    .local v1, "obj":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "value"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {p0, v3}, Lorg/apache/cordova/globalization/Globalization;->toBcp47Language(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    return-object v1

    .line 200
    :catch_0
    move-exception v0

    .line 201
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v3, "UNKNOWN_ERROR"

    invoke-direct {v2, v3}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private getNumberFormatInstance(Lorg/json/JSONArray;)Ljava/text/DecimalFormat;
    .locals 5
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 616
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-static {v3}, Ljava/text/DecimalFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v1

    check-cast v1, Ljava/text/DecimalFormat;

    .line 618
    .local v1, "fmt":Ljava/text/DecimalFormat;
    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_0

    .line 620
    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "options"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const-string v4, "type"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 621
    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "options"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const-string v4, "type"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 622
    .local v2, "fmtOpt":Ljava/lang/String;
    const-string v3, "currency"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 623
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-static {v3}, Ljava/text/DecimalFormat;->getCurrencyInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/text/DecimalFormat;

    move-object v1, v0

    .line 631
    .end local v2    # "fmtOpt":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v1

    .line 624
    .restart local v2    # "fmtOpt":Ljava/lang/String;
    :cond_1
    const-string v3, "percent"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 625
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-static {v3}, Ljava/text/DecimalFormat;->getPercentInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/text/DecimalFormat;

    move-object v1, v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 630
    .end local v2    # "fmtOpt":Ljava/lang/String;
    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method private getNumberPattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 7
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 530
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 533
    .local v3, "obj":Lorg/json/JSONObject;
    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-static {v5}, Ljava/text/DecimalFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    check-cast v0, Ljava/text/DecimalFormat;

    .line 534
    .local v0, "fmt":Ljava/text/DecimalFormat;
    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v5

    invoke-virtual {v5}, Ljava/text/DecimalFormatSymbols;->getDecimalSeparator()C

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v4

    .line 536
    .local v4, "symbol":Ljava/lang/String;
    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    move-result v5

    if-lez v5, :cond_0

    .line 538
    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "options"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/json/JSONObject;

    const-string v6, "type"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 539
    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "options"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/json/JSONObject;

    const-string v6, "type"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 540
    .local v1, "fmtOpt":Ljava/lang/String;
    const-string v5, "currency"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 541
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-static {v5}, Ljava/text/DecimalFormat;->getCurrencyInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    .end local v0    # "fmt":Ljava/text/DecimalFormat;
    check-cast v0, Ljava/text/DecimalFormat;

    .line 542
    .restart local v0    # "fmt":Ljava/text/DecimalFormat;
    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v5

    invoke-virtual {v5}, Ljava/text/DecimalFormatSymbols;->getCurrencySymbol()Ljava/lang/String;

    move-result-object v4

    .line 551
    .end local v1    # "fmtOpt":Ljava/lang/String;
    :cond_0
    :goto_0
    const-string v5, "pattern"

    invoke-virtual {v0}, Ljava/text/DecimalFormat;->toPattern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 552
    const-string v5, "symbol"

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 553
    const-string v5, "fraction"

    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getMinimumFractionDigits()I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 554
    const-string v5, "rounding"

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 555
    const-string v5, "positive"

    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getPositivePrefix()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 556
    const-string v5, "negative"

    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getNegativePrefix()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 557
    const-string v5, "decimal"

    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v6

    invoke-virtual {v6}, Ljava/text/DecimalFormatSymbols;->getDecimalSeparator()C

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 558
    const-string v5, "grouping"

    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v6

    invoke-virtual {v6}, Ljava/text/DecimalFormatSymbols;->getGroupingSeparator()C

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 560
    return-object v3

    .line 543
    .restart local v1    # "fmtOpt":Ljava/lang/String;
    :cond_1
    const-string v5, "percent"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 544
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-static {v5}, Ljava/text/DecimalFormat;->getPercentInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    .end local v0    # "fmt":Ljava/text/DecimalFormat;
    check-cast v0, Ljava/text/DecimalFormat;

    .line 545
    .restart local v0    # "fmt":Ljava/text/DecimalFormat;
    invoke-virtual {v0}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    move-result-object v5

    invoke-virtual {v5}, Ljava/text/DecimalFormatSymbols;->getPercent()C

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    goto :goto_0

    .line 561
    .end local v0    # "fmt":Ljava/text/DecimalFormat;
    .end local v1    # "fmtOpt":Ljava/lang/String;
    .end local v4    # "symbol":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 562
    .local v2, "ge":Ljava/lang/Exception;
    new-instance v5, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v6, "PATTERN_ERROR"

    invoke-direct {v5, v6}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method private getNumberToString(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 6
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 479
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 480
    .local v2, "obj":Lorg/json/JSONObject;
    const-string v3, ""

    .line 482
    .local v3, "value":Ljava/lang/String;
    :try_start_0
    invoke-direct {p0, p1}, Lorg/apache/cordova/globalization/Globalization;->getNumberFormatInstance(Lorg/json/JSONArray;)Ljava/text/DecimalFormat;

    move-result-object v0

    .line 483
    .local v0, "fmt":Ljava/text/DecimalFormat;
    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "number"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/text/DecimalFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 484
    const-string v4, "value"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    return-object v4

    .line 485
    .end local v0    # "fmt":Ljava/text/DecimalFormat;
    :catch_0
    move-exception v1

    .line 486
    .local v1, "ge":Ljava/lang/Exception;
    new-instance v4, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v5, "FORMATTING_ERROR"

    invoke-direct {v4, v5}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method private getPreferredLanguage()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 215
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 217
    .local v1, "obj":Lorg/json/JSONObject;
    :try_start_0
    const-string v2, "value"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {p0, v3}, Lorg/apache/cordova/globalization/Globalization;->toBcp47Language(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    return-object v1

    .line 219
    :catch_0
    move-exception v0

    .line 220
    .local v0, "e":Ljava/lang/Exception;
    new-instance v2, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v3, "UNKNOWN_ERROR"

    invoke-direct {v2, v3}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private getStringToNumber(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 6
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 499
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 502
    .local v2, "obj":Lorg/json/JSONObject;
    :try_start_0
    invoke-direct {p0, p1}, Lorg/apache/cordova/globalization/Globalization;->getNumberFormatInstance(Lorg/json/JSONArray;)Ljava/text/DecimalFormat;

    move-result-object v0

    .line 503
    .local v0, "fmt":Ljava/text/DecimalFormat;
    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "numberString"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/text/DecimalFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v3

    .line 504
    .local v3, "value":Ljava/lang/Number;
    const-string v4, "value"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    return-object v4

    .line 505
    .end local v0    # "fmt":Ljava/text/DecimalFormat;
    .end local v3    # "value":Ljava/lang/Number;
    :catch_0
    move-exception v1

    .line 506
    .local v1, "ge":Ljava/lang/Exception;
    new-instance v4, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v5, "PARSING_ERROR"

    invoke-direct {v4, v5}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method private getStringtoDate(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 8
    .param p1, "options"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/cordova/globalization/GlobalizationError;
        }
    .end annotation

    .prologue
    .line 264
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 268
    .local v3, "obj":Lorg/json/JSONObject;
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-direct {p0, p1}, Lorg/apache/cordova/globalization/Globalization;->getDatePattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "pattern"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 271
    .local v1, "fmt":Ljava/text/DateFormat;
    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "dateString"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 274
    .local v0, "date":Ljava/util/Date;
    new-instance v4, Landroid/text/format/Time;

    invoke-direct {v4}, Landroid/text/format/Time;-><init>()V

    .line 275
    .local v4, "time":Landroid/text/format/Time;
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Landroid/text/format/Time;->set(J)V

    .line 278
    const-string v5, "year"

    iget v6, v4, Landroid/text/format/Time;->year:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 279
    const-string v5, "month"

    iget v6, v4, Landroid/text/format/Time;->month:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 280
    const-string v5, "day"

    iget v6, v4, Landroid/text/format/Time;->monthDay:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 281
    const-string v5, "hour"

    iget v6, v4, Landroid/text/format/Time;->hour:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 282
    const-string v5, "minute"

    iget v6, v4, Landroid/text/format/Time;->minute:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 283
    const-string v5, "second"

    iget v6, v4, Landroid/text/format/Time;->second:I

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 284
    const-string v5, "millisecond"

    const-wide/16 v6, 0x0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    return-object v3

    .line 286
    .end local v0    # "date":Ljava/util/Date;
    .end local v1    # "fmt":Ljava/text/DateFormat;
    .end local v4    # "time":Landroid/text/format/Time;
    :catch_0
    move-exception v2

    .line 287
    .local v2, "ge":Ljava/lang/Exception;
    new-instance v5, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v6, "PARSING_ERROR"

    invoke-direct {v5, v6}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v5
.end method

.method private toBcp47Language(Ljava/util/Locale;)Ljava/lang/String;
    .locals 7
    .param p1, "loc"    # Ljava/util/Locale;

    .prologue
    const/16 v6, 0x2d

    .line 141
    const/16 v0, 0x2d

    .line 142
    .local v0, "SEP":C
    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    .line 143
    .local v2, "language":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    .line 144
    .local v3, "region":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/util/Locale;->getVariant()Ljava/lang/String;

    move-result-object v4

    .line 148
    .local v4, "variant":Ljava/lang/String;
    const-string v5, "no"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "NO"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "NY"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 149
    const-string v2, "nn"

    .line 150
    const-string v3, "NO"

    .line 151
    const-string v4, ""

    .line 154
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "\\p{Alpha}{2,8}"

    invoke-virtual {v2, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 155
    :cond_1
    const-string v2, "und"

    .line 166
    :cond_2
    :goto_0
    const-string v5, "\\p{Alpha}{2}|\\p{Digit}{3}"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 167
    const-string v3, ""

    .line 171
    :cond_3
    const-string v5, "\\p{Alnum}{5,8}|\\p{Digit}\\p{Alnum}{3}"

    invoke-virtual {v4, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 172
    const-string v4, ""

    .line 175
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .local v1, "bcp47Tag":Ljava/lang/StringBuilder;
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    .line 177
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    :cond_5
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_6

    .line 180
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5

    .line 157
    .end local v1    # "bcp47Tag":Ljava/lang/StringBuilder;
    :cond_7
    const-string v5, "iw"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 158
    const-string v2, "he"

    goto :goto_0

    .line 159
    :cond_8
    const-string v5, "in"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 160
    const-string v2, "id"

    goto :goto_0

    .line 161
    :cond_9
    const-string v5, "ji"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 162
    const-string v2, "yi"

    goto :goto_0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Lorg/apache/cordova/CallbackContext;)Z
    .locals 6
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "data"    # Lorg/json/JSONArray;
    .param p3, "callbackContext"    # Lorg/apache/cordova/CallbackContext;

    .prologue
    .line 91
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 94
    .local v2, "obj":Lorg/json/JSONObject;
    :try_start_0
    const-string v3, "getLocaleName"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 95
    invoke-direct {p0}, Lorg/apache/cordova/globalization/Globalization;->getLocaleName()Lorg/json/JSONObject;

    move-result-object v2

    .line 126
    :goto_0
    invoke-virtual {p3, v2}, Lorg/apache/cordova/CallbackContext;->success(Lorg/json/JSONObject;)V

    .line 132
    :goto_1
    const/4 v3, 0x1

    :goto_2
    return v3

    .line 96
    :cond_0
    const-string v3, "getPreferredLanguage"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 97
    invoke-direct {p0}, Lorg/apache/cordova/globalization/Globalization;->getPreferredLanguage()Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    .line 98
    :cond_1
    const-string v3, "dateToString"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 99
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getDateToString(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    .line 100
    :cond_2
    const-string v3, "stringToDate"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 101
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getStringtoDate(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    .line 102
    :cond_3
    const-string v3, "getDatePattern"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 103
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getDatePattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    .line 104
    :cond_4
    const-string v3, "getDateNames"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 105
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x9

    if-ge v3, v4, :cond_5

    .line 106
    new-instance v3, Lorg/apache/cordova/globalization/GlobalizationError;

    const-string v4, "UNKNOWN_ERROR"

    invoke-direct {v3, v4}, Lorg/apache/cordova/globalization/GlobalizationError;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Lorg/apache/cordova/globalization/GlobalizationError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 127
    :catch_0
    move-exception v1

    .line 128
    .local v1, "ge":Lorg/apache/cordova/globalization/GlobalizationError;
    new-instance v3, Lorg/apache/cordova/PluginResult;

    sget-object v4, Lorg/apache/cordova/PluginResult$Status;->ERROR:Lorg/apache/cordova/PluginResult$Status;

    invoke-virtual {v1}, Lorg/apache/cordova/globalization/GlobalizationError;->toJson()Lorg/json/JSONObject;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;Lorg/json/JSONObject;)V

    invoke-virtual {p3, v3}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto :goto_1

    .line 108
    .end local v1    # "ge":Lorg/apache/cordova/globalization/GlobalizationError;
    :cond_5
    :try_start_1
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getDateNames(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    .line 110
    :cond_6
    const-string v3, "isDayLightSavingsTime"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 111
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getIsDayLightSavingsTime(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    .line 112
    :cond_7
    const-string v3, "getFirstDayOfWeek"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 113
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getFirstDayOfWeek(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto :goto_0

    .line 114
    :cond_8
    const-string v3, "numberToString"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 115
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getNumberToString(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    .line 116
    :cond_9
    const-string v3, "stringToNumber"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 117
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getStringToNumber(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    .line 118
    :cond_a
    const-string v3, "getNumberPattern"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 119
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getNumberPattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v2

    goto/16 :goto_0

    .line 120
    :cond_b
    const-string v3, "getCurrencyPattern"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 121
    invoke-direct {p0, p2}, Lorg/apache/cordova/globalization/Globalization;->getCurrencyPattern(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/apache/cordova/globalization/GlobalizationError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    goto/16 :goto_0

    .line 123
    :cond_c
    const/4 v3, 0x0

    goto/16 :goto_2

    .line 129
    :catch_1
    move-exception v0

    .line 130
    .local v0, "e":Ljava/lang/Exception;
    new-instance v3, Lorg/apache/cordova/PluginResult;

    sget-object v4, Lorg/apache/cordova/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/PluginResult$Status;

    invoke-direct {v3, v4}, Lorg/apache/cordova/PluginResult;-><init>(Lorg/apache/cordova/PluginResult$Status;)V

    invoke-virtual {p3, v3}, Lorg/apache/cordova/CallbackContext;->sendPluginResult(Lorg/apache/cordova/PluginResult;)V

    goto/16 :goto_1
.end method
