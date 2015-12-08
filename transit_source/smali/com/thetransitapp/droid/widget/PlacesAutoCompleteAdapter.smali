.class public Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;
.super Landroid/support/v4/widget/CursorAdapter;
.source "PlacesAutoCompleteAdapter.java"

# interfaces
.implements Landroid/widget/Filterable;


# static fields
.field private static final API_KEY_1:Ljava/lang/String; = "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE"

.field private static final API_KEY_2:Ljava/lang/String; = "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY"

.field private static final COLUMNS:[Ljava/lang/String;

.field private static final LOG_TAG:Ljava/lang/String; = "ExampleApp"

.field private static final OUT_JSON:Ljava/lang/String; = "/json"

.field private static final PLACES_API_BASE:Ljava/lang/String; = "https://maps.googleapis.com/maps/api/place"

.field private static final TYPE_AUTOCOMPLETE:Ljava/lang/String; = "/autocomplete"


# instance fields
.field private current:Lcom/google/android/gms/maps/model/LatLng;

.field private currentLocation:Ljava/lang/String;

.field private location:Lcom/google/android/gms/maps/model/LatLng;

.field private textViewResourceId:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 35
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_id"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "suggest_text_1"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    .line 36
    const-string v2, "suggest_text_2"

    aput-object v2, v0, v1

    .line 35
    sput-object v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->COLUMNS:[Ljava/lang/String;

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "textViewResourceId"    # I

    .prologue
    .line 56
    new-instance v0, Landroid/database/MatrixCursor;

    sget-object v1, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->COLUMNS:[Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    .line 58
    iput p2, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->textViewResourceId:I

    .line 59
    const v0, 0x7f0a0042

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->currentLocation:Ljava/lang/String;

    .line 60
    return-void
.end method

.method static synthetic access$0(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;Ljava/lang/String;)Landroid/database/MatrixCursor;
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->autocomplete(Ljava/lang/String;)Landroid/database/MatrixCursor;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$1(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->current:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method static synthetic access$2()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->COLUMNS:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$3(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->currentLocation:Ljava/lang/String;

    return-object v0
.end method

.method private autocomplete(Ljava/lang/String;)Landroid/database/MatrixCursor;
    .locals 21
    .param p1, "input"    # Ljava/lang/String;

    .prologue
    .line 131
    new-instance v4, Landroid/database/MatrixCursor;

    sget-object v17, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->COLUMNS:[Ljava/lang/String;

    move-object/from16 v0, v17

    invoke-direct {v4, v0}, Landroid/database/MatrixCursor;-><init>([Ljava/lang/String;)V

    .line 133
    .local v4, "cursor":Landroid/database/MatrixCursor;
    const/4 v3, 0x0

    .line 134
    .local v3, "conn":Ljava/net/HttpURLConnection;
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 136
    .local v10, "jsonResults":Ljava/lang/StringBuilder;
    :try_start_0
    new-instance v15, Ljava/lang/StringBuilder;

    const-string v17, "https://maps.googleapis.com/maps/api/place/autocomplete/json"

    move-object/from16 v0, v17

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .local v15, "sb":Ljava/lang/StringBuilder;
    new-instance v13, Ljava/util/Random;

    invoke-direct {v13}, Ljava/util/Random;-><init>()V

    .line 139
    .local v13, "r":Ljava/util/Random;
    invoke-virtual {v13}, Ljava/util/Random;->nextBoolean()Z

    move-result v17

    if-eqz v17, :cond_3

    const-string v11, "AIzaSyDQzN6bZalwK_oAspvs9VUjVC2BSz-tQJE"

    .line 141
    .local v11, "key":Ljava/lang/String;
    :goto_0
    new-instance v17, Ljava/lang/StringBuilder;

    const-string v18, "?sensor=false&key="

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v17

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    new-instance v17, Ljava/lang/StringBuilder;

    const-string v18, "&input="

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v18, "utf8"

    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->location:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v17, v0

    if-eqz v17, :cond_0

    .line 146
    const-string v17, "&location="

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->location:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->latitude:D

    move-wide/from16 v17, v0

    move-wide/from16 v0, v17

    invoke-virtual {v15, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 148
    const-string v17, ","

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->location:Lcom/google/android/gms/maps/model/LatLng;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-wide v0, v0, Lcom/google/android/gms/maps/model/LatLng;->longitude:D

    move-wide/from16 v17, v0

    move-wide/from16 v0, v17

    invoke-virtual {v15, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 150
    const-string v17, "&radius=5000"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    :cond_0
    const-string v17, "Calling URL"

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v17 .. v18}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    new-instance v16, Ljava/net/URL;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    invoke-direct/range {v16 .. v17}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 154
    .local v16, "url":Ljava/net/URL;
    invoke-virtual/range {v16 .. v16}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v17

    move-object/from16 v0, v17

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v3, v0

    .line 155
    new-instance v7, Ljava/io/InputStreamReader;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-direct {v7, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 159
    .local v7, "in":Ljava/io/InputStreamReader;
    const/16 v17, 0x400

    move/from16 v0, v17

    new-array v2, v0, [C

    .line 160
    .local v2, "buff":[C
    :goto_1
    invoke-virtual {v7, v2}, Ljava/io/InputStreamReader;->read([C)I
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v14

    .local v14, "read":I
    const/16 v17, -0x1

    move/from16 v0, v17

    if-ne v14, v0, :cond_4

    .line 170
    if-eqz v3, :cond_1

    .line 171
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 177
    :cond_1
    :try_start_1
    new-instance v9, Lorg/json/JSONObject;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-direct {v9, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 179
    .local v9, "jsonObj":Lorg/json/JSONObject;
    const-string v17, "status"

    const-string v18, ""

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v9, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v18, "OVER_QUERY_LIMIT"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_6

    .line 180
    const/16 v17, 0x3

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    const-string v19, "-2"

    aput-object v19, v17, v18

    const/16 v18, 0x1

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/CursorAdapter;->mContext:Landroid/content/Context;

    move-object/from16 v19, v0

    const v20, 0x7f0a009f

    invoke-virtual/range {v19 .. v20}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    const/16 v18, 0x2

    const-string v19, ""

    aput-object v19, v17, v18

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 195
    .end local v2    # "buff":[C
    .end local v7    # "in":Ljava/io/InputStreamReader;
    .end local v9    # "jsonObj":Lorg/json/JSONObject;
    .end local v11    # "key":Ljava/lang/String;
    .end local v13    # "r":Ljava/util/Random;
    .end local v14    # "read":I
    .end local v15    # "sb":Ljava/lang/StringBuilder;
    .end local v16    # "url":Ljava/net/URL;
    :cond_2
    :goto_2
    return-object v4

    .line 139
    .restart local v13    # "r":Ljava/util/Random;
    .restart local v15    # "sb":Ljava/lang/StringBuilder;
    :cond_3
    :try_start_2
    const-string v11, "AIzaSyAxkB78JcpBz-QrxAu69Vb0qBa1Qt9dtFY"

    goto/16 :goto_0

    .line 161
    .restart local v2    # "buff":[C
    .restart local v7    # "in":Ljava/io/InputStreamReader;
    .restart local v11    # "key":Ljava/lang/String;
    .restart local v14    # "read":I
    .restart local v16    # "url":Ljava/net/URL;
    :cond_4
    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-virtual {v10, v2, v0, v14}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 163
    .end local v2    # "buff":[C
    .end local v7    # "in":Ljava/io/InputStreamReader;
    .end local v11    # "key":Ljava/lang/String;
    .end local v13    # "r":Ljava/util/Random;
    .end local v14    # "read":I
    .end local v15    # "sb":Ljava/lang/StringBuilder;
    .end local v16    # "url":Ljava/net/URL;
    :catch_0
    move-exception v5

    .line 164
    .local v5, "e":Ljava/net/MalformedURLException;
    :try_start_3
    const-string v17, "ExampleApp"

    const-string v18, "Error processing Places API URL"

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-static {v0, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    if-eqz v3, :cond_2

    .line 171
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_2

    .line 166
    .end local v5    # "e":Ljava/net/MalformedURLException;
    :catch_1
    move-exception v5

    .line 167
    .local v5, "e":Ljava/io/IOException;
    :try_start_4
    const-string v17, "ExampleApp"

    const-string v18, "Error connecting to Places API"

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-static {v0, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 170
    if-eqz v3, :cond_2

    .line 171
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_2

    .line 169
    .end local v5    # "e":Ljava/io/IOException;
    :catchall_0
    move-exception v17

    .line 170
    if-eqz v3, :cond_5

    .line 171
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 173
    :cond_5
    throw v17

    .line 182
    .restart local v2    # "buff":[C
    .restart local v7    # "in":Ljava/io/InputStreamReader;
    .restart local v9    # "jsonObj":Lorg/json/JSONObject;
    .restart local v11    # "key":Ljava/lang/String;
    .restart local v13    # "r":Ljava/util/Random;
    .restart local v14    # "read":I
    .restart local v15    # "sb":Ljava/lang/StringBuilder;
    .restart local v16    # "url":Ljava/net/URL;
    :cond_6
    :try_start_5
    const-string v17, "predictions"

    move-object/from16 v0, v17

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    .line 186
    .local v12, "predsJsonArray":Lorg/json/JSONArray;
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_3
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    if-ge v6, v0, :cond_2

    .line 187
    invoke-virtual {v12, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    .line 188
    .local v8, "item":Lorg/json/JSONObject;
    const/16 v17, 0x3

    move/from16 v0, v17

    new-array v0, v0, [Ljava/lang/String;

    move-object/from16 v17, v0

    const/16 v18, 0x0

    new-instance v19, Ljava/lang/StringBuilder;

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v20

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    const/16 v18, 0x1

    const-string v19, "description"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    const/16 v18, 0x2

    const-string v19, "reference"

    move-object/from16 v0, v19

    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    aput-object v19, v17, v18

    move-object/from16 v0, v17

    invoke-virtual {v4, v0}, Landroid/database/MatrixCursor;->addRow([Ljava/lang/Object;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_2

    .line 186
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 191
    .end local v6    # "i":I
    .end local v8    # "item":Lorg/json/JSONObject;
    .end local v9    # "jsonObj":Lorg/json/JSONObject;
    .end local v12    # "predsJsonArray":Lorg/json/JSONArray;
    :catch_2
    move-exception v5

    .line 192
    .local v5, "e":Lorg/json/JSONException;
    const-string v17, "ExampleApp"

    const-string v18, "Cannot process JSON results"

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-static {v0, v1, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_2
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 6
    .param p1, "view"    # Landroid/view/View;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "cursor"    # Landroid/database/Cursor;

    .prologue
    const/4 v5, 0x0

    .line 71
    const-string v3, "_id"

    invoke-interface {p3, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 72
    .local v0, "idIndex":I
    const-string v3, "suggest_text_1"

    invoke-interface {p3, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    .local v1, "textIndex":I
    move-object v2, p1

    .line 74
    check-cast v2, Landroid/widget/TextView;

    .line 75
    .local v2, "tv":Landroid/widget/TextView;
    invoke-interface {p3, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    const-string v3, "-1"

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 79
    const v3, 0x7f0200a1

    invoke-virtual {v2, v3, v5, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 85
    :goto_0
    return-void

    .line 80
    :cond_0
    const-string v3, "-2"

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 81
    const v3, -0x5e5e5f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 83
    :cond_1
    invoke-virtual {v2, v5, v5, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    goto :goto_0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    .prologue
    .line 89
    new-instance v0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;

    invoke-direct {v0, p0}, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter$1;-><init>(Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;)V

    .line 127
    .local v0, "filter":Landroid/widget/Filter;
    return-object v0
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "cursor"    # Landroid/database/Cursor;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    .line 64
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 66
    .local v0, "inflater":Landroid/view/LayoutInflater;
    iget v1, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->textViewResourceId:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    return-object v1
.end method

.method public setCurrent(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0
    .param p1, "current"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 50
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->current:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public setLocation(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0
    .param p1, "location"    # Lcom/google/android/gms/maps/model/LatLng;

    .prologue
    .line 52
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/PlacesAutoCompleteAdapter;->location:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method
