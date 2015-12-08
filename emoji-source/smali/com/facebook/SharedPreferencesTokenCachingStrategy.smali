.class public Lcom/facebook/SharedPreferencesTokenCachingStrategy;
.super Lcom/facebook/TokenCachingStrategy;
.source "SharedPreferencesTokenCachingStrategy.java"


# static fields
.field private static final DEFAULT_CACHE_KEY:Ljava/lang/String; = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"

.field private static final JSON_VALUE:Ljava/lang/String; = "value"

.field private static final JSON_VALUE_ENUM_TYPE:Ljava/lang/String; = "enumType"

.field private static final JSON_VALUE_TYPE:Ljava/lang/String; = "valueType"

.field private static final TAG:Ljava/lang/String;

.field private static final TYPE_BOOLEAN:Ljava/lang/String; = "bool"

.field private static final TYPE_BOOLEAN_ARRAY:Ljava/lang/String; = "bool[]"

.field private static final TYPE_BYTE:Ljava/lang/String; = "byte"

.field private static final TYPE_BYTE_ARRAY:Ljava/lang/String; = "byte[]"

.field private static final TYPE_CHAR:Ljava/lang/String; = "char"

.field private static final TYPE_CHAR_ARRAY:Ljava/lang/String; = "char[]"

.field private static final TYPE_DOUBLE:Ljava/lang/String; = "double"

.field private static final TYPE_DOUBLE_ARRAY:Ljava/lang/String; = "double[]"

.field private static final TYPE_ENUM:Ljava/lang/String; = "enum"

.field private static final TYPE_FLOAT:Ljava/lang/String; = "float"

.field private static final TYPE_FLOAT_ARRAY:Ljava/lang/String; = "float[]"

.field private static final TYPE_INTEGER:Ljava/lang/String; = "int"

.field private static final TYPE_INTEGER_ARRAY:Ljava/lang/String; = "int[]"

.field private static final TYPE_LONG:Ljava/lang/String; = "long"

.field private static final TYPE_LONG_ARRAY:Ljava/lang/String; = "long[]"

.field private static final TYPE_SHORT:Ljava/lang/String; = "short"

.field private static final TYPE_SHORT_ARRAY:Ljava/lang/String; = "short[]"

.field private static final TYPE_STRING:Ljava/lang/String; = "string"

.field private static final TYPE_STRING_LIST:Ljava/lang/String; = "stringList"


# instance fields
.field private cache:Landroid/content/SharedPreferences;

.field private cacheKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    const-class v0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/SharedPreferencesTokenCachingStrategy;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 89
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "cacheKey"    # Ljava/lang/String;

    .prologue
    .line 103
    invoke-direct {p0}, Lcom/facebook/TokenCachingStrategy;-><init>()V

    .line 104
    const-string v1, "context"

    invoke-static {p1, v1}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-static {p2}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p2, "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"

    .end local p2    # "cacheKey":Ljava/lang/String;
    :cond_0
    iput-object p2, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cacheKey:Ljava/lang/String;

    .line 111
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 112
    .local v0, "applicationContext":Landroid/content/Context;
    if-eqz v0, :cond_1

    move-object p1, v0

    .line 114
    :cond_1
    iget-object v1, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cacheKey:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;

    .line 117
    return-void
.end method

.method private deserializeKey(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 20
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "bundle"    # Landroid/os/Bundle;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 292
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "{}"

    move-object/from16 v0, v17

    move-object/from16 v1, p1

    move-object/from16 v2, v18

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 293
    .local v12, "jsonString":Ljava/lang/String;
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10, v12}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 295
    .local v10, "json":Lorg/json/JSONObject;
    const-string v17, "valueType"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 297
    .local v16, "valueType":Ljava/lang/String;
    const-string v17, "bool"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1

    .line 298
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v17

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 398
    :cond_0
    :goto_0
    return-void

    .line 299
    :cond_1
    const-string v17, "bool[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_3

    .line 300
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 301
    .local v11, "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [Z

    .line 302
    .local v4, "array":[Z
    const/4 v9, 0x0

    .local v9, "i":I
    :goto_1
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_2

    .line 303
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getBoolean(I)Z

    move-result v17

    aput-boolean v17, v4, v9

    .line 302
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 305
    :cond_2
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putBooleanArray(Ljava/lang/String;[Z)V

    goto :goto_0

    .line 306
    .end local v4    # "array":[Z
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_3
    const-string v17, "byte"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_4

    .line 307
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    int-to-byte v0, v0

    move/from16 v17, v0

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    goto :goto_0

    .line 308
    :cond_4
    const-string v17, "byte[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_6

    .line 309
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 310
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [B

    .line 311
    .local v4, "array":[B
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_2
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_5

    .line 312
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getInt(I)I

    move-result v17

    move/from16 v0, v17

    int-to-byte v0, v0

    move/from16 v17, v0

    aput-byte v17, v4, v9

    .line 311
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 314
    :cond_5
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    goto/16 :goto_0

    .line 315
    .end local v4    # "array":[B
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_6
    const-string v17, "short"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    .line 316
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move/from16 v0, v17

    int-to-short v0, v0

    move/from16 v17, v0

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    goto/16 :goto_0

    .line 317
    :cond_7
    const-string v17, "short[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_9

    .line 318
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 319
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [S

    .line 320
    .local v4, "array":[S
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_3
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_8

    .line 321
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getInt(I)I

    move-result v17

    move/from16 v0, v17

    int-to-short v0, v0

    move/from16 v17, v0

    aput-short v17, v4, v9

    .line 320
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 323
    :cond_8
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V

    goto/16 :goto_0

    .line 324
    .end local v4    # "array":[S
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_9
    const-string v17, "int"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_a

    .line 325
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v17

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 326
    :cond_a
    const-string v17, "int[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    .line 327
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 328
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [I

    .line 329
    .local v4, "array":[I
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_4
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_b

    .line 330
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getInt(I)I

    move-result v17

    aput v17, v4, v9

    .line 329
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 332
    :cond_b
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putIntArray(Ljava/lang/String;[I)V

    goto/16 :goto_0

    .line 333
    .end local v4    # "array":[I
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_c
    const-string v17, "long"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    .line 334
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v18

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move-wide/from16 v2, v18

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_0

    .line 335
    :cond_d
    const-string v17, "long[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_f

    .line 336
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 337
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [J

    .line 338
    .local v4, "array":[J
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_5
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_e

    .line 339
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v18

    aput-wide v18, v4, v9

    .line 338
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    .line 341
    :cond_e
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putLongArray(Ljava/lang/String;[J)V

    goto/16 :goto_0

    .line 342
    .end local v4    # "array":[J
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_f
    const-string v17, "float"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    .line 343
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v17, v0

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    goto/16 :goto_0

    .line 344
    :cond_10
    const-string v17, "float[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    .line 345
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 346
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [F

    .line 347
    .local v4, "array":[F
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_6
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_11

    .line 348
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v18

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v17, v0

    aput v17, v4, v9

    .line 347
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 350
    :cond_11
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    goto/16 :goto_0

    .line 351
    .end local v4    # "array":[F
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_12
    const-string v17, "double"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    .line 352
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move-wide/from16 v2, v18

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    goto/16 :goto_0

    .line 353
    :cond_13
    const-string v17, "double[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    .line 354
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 355
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [D

    .line 356
    .local v4, "array":[D
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_7
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_14

    .line 357
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v18

    aput-wide v18, v4, v9

    .line 356
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    .line 359
    :cond_14
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putDoubleArray(Ljava/lang/String;[D)V

    goto/16 :goto_0

    .line 360
    .end local v4    # "array":[D
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_15
    const-string v17, "char"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    .line 361
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 362
    .local v5, "charString":Ljava/lang/String;
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v17

    const/16 v18, 0x1

    move/from16 v0, v17

    move/from16 v1, v18

    if-ne v0, v1, :cond_0

    .line 363
    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v17

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    goto/16 :goto_0

    .line 365
    .end local v5    # "charString":Ljava/lang/String;
    :cond_16
    const-string v17, "char[]"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    .line 366
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 367
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v17

    move/from16 v0, v17

    new-array v4, v0, [C

    .line 368
    .local v4, "array":[C
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_8
    array-length v0, v4

    move/from16 v17, v0

    move/from16 v0, v17

    if-ge v9, v0, :cond_18

    .line 369
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 370
    .restart local v5    # "charString":Ljava/lang/String;
    if-eqz v5, :cond_17

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v17

    const/16 v18, 0x1

    move/from16 v0, v17

    move/from16 v1, v18

    if-ne v0, v1, :cond_17

    .line 371
    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    move-result v17

    aput-char v17, v4, v9

    .line 368
    :cond_17
    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    .line 374
    .end local v5    # "charString":Ljava/lang/String;
    :cond_18
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    goto/16 :goto_0

    .line 375
    .end local v4    # "array":[C
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    :cond_19
    const-string v17, "string"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1a

    .line 376
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, p2

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 377
    :cond_1a
    const-string v17, "stringList"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1d

    .line 378
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 379
    .restart local v11    # "jsonArray":Lorg/json/JSONArray;
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v14

    .line 380
    .local v14, "numStrings":I
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 381
    .local v15, "stringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const/4 v9, 0x0

    .restart local v9    # "i":I
    :goto_9
    if-ge v9, v14, :cond_1c

    .line 382
    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 383
    .local v13, "jsonStringValue":Ljava/lang/Object;
    sget-object v17, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    move-object/from16 v0, v17

    if-ne v13, v0, :cond_1b

    const/4 v13, 0x0

    .end local v13    # "jsonStringValue":Ljava/lang/Object;
    :goto_a
    invoke-virtual {v15, v9, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 381
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    .line 383
    .restart local v13    # "jsonStringValue":Ljava/lang/Object;
    :cond_1b
    check-cast v13, Ljava/lang/String;

    goto :goto_a

    .line 385
    .end local v13    # "jsonStringValue":Ljava/lang/Object;
    :cond_1c
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v15}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    .line 386
    .end local v9    # "i":I
    .end local v11    # "jsonArray":Lorg/json/JSONArray;
    .end local v14    # "numStrings":I
    .end local v15    # "stringList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    :cond_1d
    const-string v17, "enum"

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_0

    .line 388
    :try_start_0
    const-string v17, "enumType"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 390
    .local v7, "enumType":Ljava/lang/String;
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    .line 392
    .local v6, "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Enum;>;"
    const-string v17, "value"

    move-object/from16 v0, v17

    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-static {v6, v0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v8

    .line 393
    .local v8, "enumValue":Ljava/lang/Enum;, "Ljava/lang/Enum<*>;"
    move-object/from16 v0, p2

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v8}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_0

    .line 394
    .end local v6    # "enumClass":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/Enum;>;"
    .end local v7    # "enumType":Ljava/lang/String;
    .end local v8    # "enumValue":Ljava/lang/Enum;, "Ljava/lang/Enum<*>;"
    :catch_0
    move-exception v17

    goto/16 :goto_0

    .line 395
    :catch_1
    move-exception v17

    goto/16 :goto_0
.end method

.method private serializeKey(Ljava/lang/String;Landroid/os/Bundle;Landroid/content/SharedPreferences$Editor;)V
    .locals 12
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "bundle"    # Landroid/os/Bundle;
    .param p3, "editor"    # Landroid/content/SharedPreferences$Editor;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x0

    .line 178
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 179
    .local v5, "value":Ljava/lang/Object;
    if-nez v5, :cond_1

    .line 288
    .end local v5    # "value":Ljava/lang/Object;
    :cond_0
    :goto_0
    return-void

    .line 184
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_1
    const/4 v4, 0x0

    .line 185
    .local v4, "supportedType":Ljava/lang/String;
    const/4 v1, 0x0

    .line 186
    .local v1, "jsonArray":Lorg/json/JSONArray;
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 188
    .local v0, "json":Lorg/json/JSONObject;
    instance-of v9, v5, Ljava/lang/Byte;

    if-eqz v9, :cond_4

    .line 189
    const-string v4, "byte"

    .line 190
    const-string v8, "value"

    check-cast v5, Ljava/lang/Byte;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Byte;->intValue()I

    move-result v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 277
    :cond_2
    :goto_1
    if-eqz v4, :cond_0

    .line 278
    const-string v8, "valueType"

    invoke-virtual {v0, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 279
    if-eqz v1, :cond_3

    .line 282
    const-string v8, "value"

    invoke-virtual {v0, v8, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 285
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    .line 286
    .local v2, "jsonString":Ljava/lang/String;
    invoke-interface {p3, p1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 191
    .end local v2    # "jsonString":Ljava/lang/String;
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_4
    instance-of v9, v5, Ljava/lang/Short;

    if-eqz v9, :cond_5

    .line 192
    const-string v4, "short"

    .line 193
    const-string v8, "value"

    check-cast v5, Ljava/lang/Short;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Short;->intValue()I

    move-result v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_1

    .line 194
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_5
    instance-of v9, v5, Ljava/lang/Integer;

    if-eqz v9, :cond_6

    .line 195
    const-string v4, "int"

    .line 196
    const-string v8, "value"

    check-cast v5, Ljava/lang/Integer;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_1

    .line 197
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_6
    instance-of v9, v5, Ljava/lang/Long;

    if-eqz v9, :cond_7

    .line 198
    const-string v4, "long"

    .line 199
    const-string v8, "value"

    check-cast v5, Ljava/lang/Long;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v0, v8, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    goto :goto_1

    .line 200
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_7
    instance-of v9, v5, Ljava/lang/Float;

    if-eqz v9, :cond_8

    .line 201
    const-string v4, "float"

    .line 202
    const-string v8, "value"

    check-cast v5, Ljava/lang/Float;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v0, v8, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    goto :goto_1

    .line 203
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_8
    instance-of v9, v5, Ljava/lang/Double;

    if-eqz v9, :cond_9

    .line 204
    const-string v4, "double"

    .line 205
    const-string v8, "value"

    check-cast v5, Ljava/lang/Double;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v0, v8, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    goto :goto_1

    .line 206
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_9
    instance-of v9, v5, Ljava/lang/Boolean;

    if-eqz v9, :cond_a

    .line 207
    const-string v4, "bool"

    .line 208
    const-string v8, "value"

    check-cast v5, Ljava/lang/Boolean;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto/16 :goto_1

    .line 209
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_a
    instance-of v9, v5, Ljava/lang/Character;

    if-eqz v9, :cond_b

    .line 210
    const-string v4, "char"

    .line 211
    const-string v8, "value"

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_1

    .line 212
    :cond_b
    instance-of v9, v5, Ljava/lang/String;

    if-eqz v9, :cond_c

    .line 213
    const-string v4, "string"

    .line 214
    const-string v8, "value"

    check-cast v5, Ljava/lang/String;

    .end local v5    # "value":Ljava/lang/Object;
    invoke-virtual {v0, v8, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_1

    .line 215
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_c
    instance-of v9, v5, Ljava/lang/Enum;

    if-eqz v9, :cond_d

    .line 216
    const-string v4, "enum"

    .line 217
    const-string v8, "value"

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 218
    const-string v8, "enumType"

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_1

    .line 222
    :cond_d
    new-instance v1, Lorg/json/JSONArray;

    .end local v1    # "jsonArray":Lorg/json/JSONArray;
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 223
    .restart local v1    # "jsonArray":Lorg/json/JSONArray;
    instance-of v9, v5, [B

    if-eqz v9, :cond_e

    .line 224
    const-string v4, "byte[]"

    .line 225
    check-cast v5, [B

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [B

    array-length v9, v5

    :goto_2
    if-ge v8, v9, :cond_2

    aget-byte v6, v5, v8

    .line 226
    .local v6, "v":B
    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 225
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 228
    .end local v6    # "v":B
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_e
    instance-of v9, v5, [S

    if-eqz v9, :cond_f

    .line 229
    const-string v4, "short[]"

    .line 230
    check-cast v5, [S

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [S

    array-length v9, v5

    :goto_3
    if-ge v8, v9, :cond_2

    aget-short v6, v5, v8

    .line 231
    .local v6, "v":S
    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 230
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 233
    .end local v6    # "v":S
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_f
    instance-of v9, v5, [I

    if-eqz v9, :cond_10

    .line 234
    const-string v4, "int[]"

    .line 235
    check-cast v5, [I

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [I

    array-length v9, v5

    :goto_4
    if-ge v8, v9, :cond_2

    aget v6, v5, v8

    .line 236
    .local v6, "v":I
    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 235
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 238
    .end local v6    # "v":I
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_10
    instance-of v9, v5, [J

    if-eqz v9, :cond_11

    .line 239
    const-string v4, "long[]"

    .line 240
    check-cast v5, [J

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [J

    array-length v9, v5

    :goto_5
    if-ge v8, v9, :cond_2

    aget-wide v6, v5, v8

    .line 241
    .local v6, "v":J
    invoke-virtual {v1, v6, v7}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    .line 240
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    .line 243
    .end local v6    # "v":J
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_11
    instance-of v9, v5, [F

    if-eqz v9, :cond_12

    .line 244
    const-string v4, "float[]"

    .line 245
    check-cast v5, [F

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [F

    array-length v9, v5

    :goto_6
    if-ge v8, v9, :cond_2

    aget v6, v5, v8

    .line 246
    .local v6, "v":F
    float-to-double v10, v6

    invoke-virtual {v1, v10, v11}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;

    .line 245
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    .line 248
    .end local v6    # "v":F
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_12
    instance-of v9, v5, [D

    if-eqz v9, :cond_13

    .line 249
    const-string v4, "double[]"

    .line 250
    check-cast v5, [D

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [D

    array-length v9, v5

    :goto_7
    if-ge v8, v9, :cond_2

    aget-wide v6, v5, v8

    .line 251
    .local v6, "v":D
    invoke-virtual {v1, v6, v7}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;

    .line 250
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 253
    .end local v6    # "v":D
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_13
    instance-of v9, v5, [Z

    if-eqz v9, :cond_14

    .line 254
    const-string v4, "bool[]"

    .line 255
    check-cast v5, [Z

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [Z

    array-length v9, v5

    :goto_8
    if-ge v8, v9, :cond_2

    aget-boolean v6, v5, v8

    .line 256
    .local v6, "v":Z
    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->put(Z)Lorg/json/JSONArray;

    .line 255
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    .line 258
    .end local v6    # "v":Z
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_14
    instance-of v9, v5, [C

    if-eqz v9, :cond_15

    .line 259
    const-string v4, "char[]"

    .line 260
    check-cast v5, [C

    .end local v5    # "value":Ljava/lang/Object;
    check-cast v5, [C

    array-length v9, v5

    :goto_9
    if-ge v8, v9, :cond_2

    aget-char v6, v5, v8

    .line 261
    .local v6, "v":C
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 260
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    .line 263
    .end local v6    # "v":C
    .restart local v5    # "value":Ljava/lang/Object;
    :cond_15
    instance-of v8, v5, Ljava/util/List;

    if-eqz v8, :cond_17

    .line 264
    const-string v4, "stringList"

    move-object v3, v5

    .line 266
    check-cast v3, Ljava/util/List;

    .line 267
    .local v3, "stringList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 268
    .local v6, "v":Ljava/lang/String;
    if-nez v6, :cond_16

    sget-object v6, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .end local v6    # "v":Ljava/lang/String;
    :cond_16
    invoke-virtual {v1, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_a

    .line 273
    .end local v3    # "stringList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_17
    const/4 v1, 0x0

    goto/16 :goto_1
.end method


# virtual methods
.method public clear()V
    .locals 1

    .prologue
    .line 173
    iget-object v0, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 174
    return-void
.end method

.method public load()Landroid/os/Bundle;
    .locals 9

    .prologue
    .line 125
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 127
    .local v3, "settings":Landroid/os/Bundle;
    iget-object v4, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;

    invoke-interface {v4}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    .line 129
    .local v0, "allCachedEntries":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;*>;"
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 131
    .local v2, "key":Ljava/lang/String;
    :try_start_0
    invoke-direct {p0, v2, v3}, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->deserializeKey(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 132
    :catch_0
    move-exception v1

    .line 134
    .local v1, "e":Lorg/json/JSONException;
    sget-object v4, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;

    const/4 v5, 0x5

    sget-object v6, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->TAG:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Error reading cached value for key: \'"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\' -- "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v5, v6, v7}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V

    .line 136
    const/4 v3, 0x0

    .line 140
    .end local v1    # "e":Lorg/json/JSONException;
    .end local v2    # "key":Ljava/lang/String;
    .end local v3    # "settings":Landroid/os/Bundle;
    :cond_0
    return-object v3
.end method

.method public save(Landroid/os/Bundle;)V
    .locals 8
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 151
    const-string v3, "bundle"

    invoke-static {p1, v3}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    iget-object v3, p0, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->cache:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 155
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 157
    .local v2, "key":Ljava/lang/String;
    :try_start_0
    invoke-direct {p0, v2, p1, v1}, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->serializeKey(Ljava/lang/String;Landroid/os/Bundle;Landroid/content/SharedPreferences$Editor;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 158
    :catch_0
    move-exception v0

    .line 160
    .local v0, "e":Lorg/json/JSONException;
    sget-object v3, Lcom/facebook/LoggingBehavior;->CACHE:Lcom/facebook/LoggingBehavior;

    const/4 v4, 0x5

    sget-object v5, Lcom/facebook/SharedPreferencesTokenCachingStrategy;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error processing value for key: \'"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\' -- "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lcom/facebook/internal/Logger;->log(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;)V

    .line 167
    .end local v0    # "e":Lorg/json/JSONException;
    .end local v2    # "key":Ljava/lang/String;
    :goto_1
    return-void

    .line 166
    :cond_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1
.end method
