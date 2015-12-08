.class final Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;
.super Lcom/google/zxing/client/android/result/supplement/SupplementalInfoRetriever;
.source "BookResultInfoRetriever.java"


# instance fields
.field private final context:Landroid/content/Context;

.field private final isbn:Ljava/lang/String;

.field private final source:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Lcom/google/zxing/client/android/history/HistoryManager;Landroid/content/Context;)V
    .locals 1
    .param p1, "textView"    # Landroid/widget/TextView;
    .param p2, "isbn"    # Ljava/lang/String;
    .param p3, "historyManager"    # Lcom/google/zxing/client/android/history/HistoryManager;
    .param p4, "context"    # Landroid/content/Context;

    .prologue
    .line 46
    invoke-direct {p0, p1, p3}, Lcom/google/zxing/client/android/result/supplement/SupplementalInfoRetriever;-><init>(Landroid/widget/TextView;Lcom/google/zxing/client/android/history/HistoryManager;)V

    .line 47
    iput-object p2, p0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->isbn:Ljava/lang/String;

    .line 48
    sget v0, Lcom/google/zxing/client/android/R$string;->msg_google_books:I

    invoke-virtual {p4, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->source:Ljava/lang/String;

    .line 49
    iput-object p4, p0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->context:Landroid/content/Context;

    .line 50
    return-void
.end method


# virtual methods
.method retrieveSupplementalInfo()V
    .locals 23
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 55
    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "https://www.googleapis.com/books/v1/volumes?q=isbn:"

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->isbn:Ljava/lang/String;

    move-object/from16 v19, v0

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 56
    sget-object v19, Lcom/google/zxing/client/android/HttpHelper$ContentType;->JSON:Lcom/google/zxing/client/android/HttpHelper$ContentType;

    .line 55
    invoke-static/range {v18 .. v19}, Lcom/google/zxing/client/android/HttpHelper;->downloadViaHttp(Ljava/lang/String;Lcom/google/zxing/client/android/HttpHelper$ContentType;)Ljava/lang/CharSequence;

    move-result-object v9

    .line 58
    .local v9, "contents":Ljava/lang/CharSequence;
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v18

    if-nez v18, :cond_1

    .line 103
    :cond_0
    :goto_0
    return-void

    .line 64
    :cond_1
    const/4 v5, 0x0

    .line 68
    .local v5, "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    :try_start_0
    new-instance v18, Lorg/json/JSONTokener;

    invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lorg/json/JSONObject;

    .line 69
    .local v16, "topLevel":Lorg/json/JSONObject;
    const-string v18, "items"

    move-object/from16 v0, v16

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    .line 70
    .local v12, "items":Lorg/json/JSONArray;
    if-eqz v12, :cond_0

    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v12, v0}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v18

    if-nez v18, :cond_0

    .line 74
    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v12, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Lorg/json/JSONObject;

    const-string v19, "volumeInfo"

    invoke-virtual/range {v18 .. v19}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v17

    .line 75
    .local v17, "volumeInfo":Lorg/json/JSONObject;
    if-eqz v17, :cond_0

    .line 79
    const-string v18, "title"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 80
    .local v15, "title":Ljava/lang/String;
    const-string v18, "pageCount"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 82
    .local v14, "pages":Ljava/lang/String;
    const-string v18, "authors"

    invoke-virtual/range {v17 .. v18}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 83
    .local v7, "authorsArray":Lorg/json/JSONArray;
    if-eqz v7, :cond_2

    const/16 v18, 0x0

    move/from16 v0, v18

    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v18

    if-nez v18, :cond_2

    .line 84
    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v18

    move/from16 v0, v18

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .end local v5    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .local v6, "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    const/4 v11, 0x0

    .local v11, "i":I
    :goto_1
    :try_start_1
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v18

    move/from16 v0, v18

    if-lt v11, v0, :cond_4

    move-object v5, v6

    .line 94
    .end local v6    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .end local v11    # "i":I
    .restart local v5    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    :cond_2
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .local v13, "newTexts":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    invoke-static {v15, v13}, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->maybeAddText(Ljava/lang/String;Ljava/util/Collection;)V

    .line 96
    invoke-static {v5, v13}, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->maybeAddTextSeries(Ljava/util/Collection;Ljava/util/Collection;)V

    .line 97
    if-eqz v14, :cond_3

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v18

    if-nez v18, :cond_5

    :cond_3
    const/16 v18, 0x0

    :goto_2
    move-object/from16 v0, v18

    invoke-static {v0, v13}, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->maybeAddText(Ljava/lang/String;Ljava/util/Collection;)V

    .line 99
    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "http://www.google."

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->context:Landroid/content/Context;

    move-object/from16 v19, v0

    invoke-static/range {v19 .. v19}, Lcom/google/zxing/client/android/LocaleManager;->getBookSearchCountryTLD(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    .line 100
    const-string v19, "/search?tbm=bks&source=zxing&q="

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    .line 99
    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 102
    .local v8, "baseBookUri":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->isbn:Ljava/lang/String;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->source:Ljava/lang/String;

    move-object/from16 v20, v0

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v18

    move/from16 v0, v18

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    invoke-interface {v13, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v18

    check-cast v18, [Ljava/lang/String;

    new-instance v21, Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v22

    invoke-direct/range {v21 .. v22}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->isbn:Ljava/lang/String;

    move-object/from16 v22, v0

    invoke-virtual/range {v21 .. v22}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v18

    move-object/from16 v4, v21

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/zxing/client/android/result/supplement/BookResultInfoRetriever;->append(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 86
    .end local v5    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .end local v8    # "baseBookUri":Ljava/lang/String;
    .end local v13    # "newTexts":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .restart local v6    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .restart local v11    # "i":I
    :cond_4
    :try_start_2
    invoke-virtual {v7, v11}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, v18

    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 85
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_1

    .line 90
    .end local v6    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .end local v7    # "authorsArray":Lorg/json/JSONArray;
    .end local v11    # "i":I
    .end local v12    # "items":Lorg/json/JSONArray;
    .end local v14    # "pages":Ljava/lang/String;
    .end local v15    # "title":Ljava/lang/String;
    .end local v16    # "topLevel":Lorg/json/JSONObject;
    .end local v17    # "volumeInfo":Lorg/json/JSONObject;
    .restart local v5    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    :catch_0
    move-exception v10

    .line 91
    .local v10, "e":Lorg/json/JSONException;
    :goto_3
    new-instance v18, Ljava/io/IOException;

    invoke-virtual {v10}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v18

    .line 97
    .end local v10    # "e":Lorg/json/JSONException;
    .restart local v7    # "authorsArray":Lorg/json/JSONArray;
    .restart local v12    # "items":Lorg/json/JSONArray;
    .restart local v13    # "newTexts":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .restart local v14    # "pages":Ljava/lang/String;
    .restart local v15    # "title":Ljava/lang/String;
    .restart local v16    # "topLevel":Lorg/json/JSONObject;
    .restart local v17    # "volumeInfo":Lorg/json/JSONObject;
    :cond_5
    new-instance v18, Ljava/lang/StringBuilder;

    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v19, "pp."

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    goto/16 :goto_2

    .line 90
    .end local v5    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .end local v13    # "newTexts":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .restart local v6    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .restart local v11    # "i":I
    :catch_1
    move-exception v10

    move-object v5, v6

    .end local v6    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    .restart local v5    # "authors":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/String;>;"
    goto :goto_3
.end method
