.class final Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;
.super Lcom/google/zxing/client/android/result/supplement/SupplementalInfoRetriever;
.source "AmazonInfoRetriever.java"


# instance fields
.field private final country:Ljava/lang/String;

.field private final productID:Ljava/lang/String;

.field private final type:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Lcom/google/zxing/client/android/history/HistoryManager;Landroid/content/Context;)V
    .locals 2
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "type"    # Ljava/lang/String;
    .param p3, "productID"    # Ljava/lang/String;
    .param p4, "historyManager"    # Lcom/google/zxing/client/android/history/HistoryManager;
    .param p5, "context"    # Landroid/content/Context;

    .prologue
    .line 48
    invoke-direct {p0, p1, p4}, Lcom/google/zxing/client/android/result/supplement/SupplementalInfoRetriever;-><init>(Landroid/widget/TextView;Lcom/google/zxing/client/android/history/HistoryManager;)V

    .line 49
    invoke-static {p5}, Lcom/google/zxing/client/android/LocaleManager;->getCountry(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 50
    .local v0, "country":Ljava/lang/String;
    const-string v1, "ISBN"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 51
    const-string p2, "EAN"

    .line 53
    :cond_0
    iput-object p2, p0, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->type:Ljava/lang/String;

    .line 54
    iput-object p3, p0, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->productID:Ljava/lang/String;

    .line 55
    iput-object v0, p0, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->country:Ljava/lang/String;

    .line 56
    return-void
.end method

.method private static assertTextNext(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 2
    .param p0, "xpp"    # Lorg/xmlpull/v1/XmlPullParser;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 126
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 127
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 129
    :cond_0
    return-void
.end method

.method private static buildParser(Ljava/lang/CharSequence;)Lorg/xmlpull/v1/XmlPullParser;
    .locals 4
    .param p0, "contents"    # Ljava/lang/CharSequence;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .prologue
    .line 132
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v0

    .line 133
    .local v0, "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V

    .line 134
    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v1

    .line 135
    .local v1, "xpp":Lorg/xmlpull/v1/XmlPullParser;
    new-instance v2, Ljava/io/StringReader;

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/Reader;)V

    .line 136
    return-object v1
.end method


# virtual methods
.method retrieveSupplementalInfo()V
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 62
    new-instance v17, Ljava/lang/StringBuilder;

    const-string v18, "https://bsplus.srowen.com/ss?c="

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->country:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, "&t="

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->type:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, "&i="

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->productID:Ljava/lang/String;

    move-object/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 63
    sget-object v18, Lcom/google/zxing/client/android/HttpHelper$ContentType;->XML:Lcom/google/zxing/client/android/HttpHelper$ContentType;

    .line 62
    invoke-static/range {v17 .. v18}, Lcom/google/zxing/client/android/HttpHelper;->downloadViaHttp(Ljava/lang/String;Lcom/google/zxing/client/android/HttpHelper$ContentType;)Ljava/lang/CharSequence;

    move-result-object v5

    .line 65
    .local v5, "contents":Ljava/lang/CharSequence;
    const/4 v6, 0x0

    .line 66
    .local v6, "detailPageURL":Ljava/lang/String;
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .local v4, "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    const/4 v14, 0x0

    .line 68
    .local v14, "title":Ljava/lang/String;
    const/4 v9, 0x0

    .line 69
    .local v9, "formattedPrice":Ljava/lang/String;
    const/4 v7, 0x0

    .line 72
    .local v7, "error":Z
    :try_start_0
    invoke-static {v5}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->buildParser(Ljava/lang/CharSequence;)Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v15

    .line 74
    .local v15, "xpp":Lorg/xmlpull/v1/XmlPullParser;
    const/4 v12, 0x0

    .line 75
    .local v12, "seenItem":Z
    const/4 v13, 0x0

    .line 76
    .local v13, "seenLowestNewPrice":Z
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v8

    .local v8, "eventType":I
    :goto_0
    const/16 v17, 0x1

    move/from16 v0, v17

    if-ne v8, v0, :cond_2

    .line 113
    :cond_0
    :goto_1
    if-nez v7, :cond_1

    if-nez v6, :cond_a

    .line 123
    :cond_1
    :goto_2
    return-void

    .line 77
    :cond_2
    const/16 v17, 0x2

    move/from16 v0, v17

    if-ne v8, v0, :cond_3

    .line 78
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    .line 79
    .local v10, "name":Ljava/lang/String;
    const-string v17, "Item"

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_4

    .line 80
    if-nez v12, :cond_0

    .line 83
    const/4 v12, 0x1

    .line 76
    .end local v10    # "name":Ljava/lang/String;
    :cond_3
    :goto_3
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v8

    goto :goto_0

    .line 85
    .restart local v10    # "name":Ljava/lang/String;
    :cond_4
    const-string v17, "DetailPageURL"

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_5

    .line 86
    invoke-static {v15}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->assertTextNext(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 87
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v6

    .line 88
    goto :goto_3

    :cond_5
    const-string v17, "Author"

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_6

    .line 89
    invoke-static {v15}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->assertTextNext(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 90
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 109
    .end local v8    # "eventType":I
    .end local v10    # "name":Ljava/lang/String;
    .end local v12    # "seenItem":Z
    .end local v13    # "seenLowestNewPrice":Z
    .end local v15    # "xpp":Lorg/xmlpull/v1/XmlPullParser;
    :catch_0
    move-exception v16

    .line 110
    .local v16, "xppe":Lorg/xmlpull/v1/XmlPullParserException;
    new-instance v17, Ljava/io/IOException;

    invoke-virtual/range {v16 .. v16}, Lorg/xmlpull/v1/XmlPullParserException;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v17

    .line 91
    .end local v16    # "xppe":Lorg/xmlpull/v1/XmlPullParserException;
    .restart local v8    # "eventType":I
    .restart local v10    # "name":Ljava/lang/String;
    .restart local v12    # "seenItem":Z
    .restart local v13    # "seenLowestNewPrice":Z
    .restart local v15    # "xpp":Lorg/xmlpull/v1/XmlPullParser;
    :cond_6
    :try_start_1
    const-string v17, "Title"

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    .line 92
    invoke-static {v15}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->assertTextNext(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 93
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v14

    .line 94
    goto :goto_3

    :cond_7
    const-string v17, "LowestNewPrice"

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_8

    .line 95
    const/4 v13, 0x1

    .line 96
    goto :goto_3

    :cond_8
    const-string v17, "FormattedPrice"

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_9

    .line 97
    if-eqz v13, :cond_3

    .line 98
    invoke-static {v15}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->assertTextNext(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 99
    invoke-interface {v15}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v9

    .line 100
    const/4 v13, 0x0

    .line 102
    goto :goto_3

    :cond_9
    const-string v17, "Errors"

    move-object/from16 v0, v17

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v17

    if-eqz v17, :cond_3

    .line 103
    const/4 v7, 0x1

    .line 104
    goto/16 :goto_1

    .line 117
    .end local v10    # "name":Ljava/lang/String;
    :cond_a
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .local v11, "newTexts":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    invoke-static {v14, v11}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->maybeAddText(Ljava/lang/String;Ljava/util/Collection;)V

    .line 119
    invoke-static {v4, v11}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->maybeAddTextSeries(Ljava/util/Collection;Ljava/util/Collection;)V

    .line 120
    invoke-static {v9, v11}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->maybeAddText(Ljava/lang/String;Ljava/util/Collection;)V

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->productID:Ljava/lang/String;

    move-object/from16 v18, v0

    const-string v19, "Amazon"

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v17

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    invoke-interface {v11, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v17

    check-cast v17, [Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    move-object/from16 v3, v17

    invoke-virtual {v0, v1, v2, v3, v6}, Lcom/google/zxing/client/android/result/supplement/AmazonInfoRetriever;->append(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2
.end method
