.class public Ltwitter4j/internal/org/json/JSONObject;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final NULL:Ljava/lang/Object;


# instance fields
.field private map:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 138
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject$Null;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONObject$Null;-><init>(Ltwitter4j/internal/org/json/JSONObject$1;)V

    sput-object v0, Ltwitter4j/internal/org/json/JSONObject;->NULL:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    .line 146
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 270
    invoke-direct {p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>()V

    .line 271
    invoke-direct {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->populateMap(Ljava/lang/Object;)V

    .line 272
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;[Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 288
    invoke-direct {p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>()V

    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 290
    const/4 v0, 0x0

    :goto_0
    array-length v2, p2

    if-ge v0, v2, :cond_0

    .line 291
    aget-object v2, p2, v0

    .line 293
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Ltwitter4j/internal/org/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 297
    :cond_0
    return-void

    :catch_0
    move-exception v2

    goto :goto_1
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 311
    new-instance v0, Ltwitter4j/internal/org/json/JSONTokener;

    invoke-direct {v0, p1}, Ltwitter4j/internal/org/json/JSONTokener;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ltwitter4j/internal/org/json/JSONTokener;)V

    .line 312
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 10

    .prologue
    .line 323
    invoke-direct {p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>()V

    .line 324
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {p1, p2, v0}, Ljava/util/ResourceBundle;->getBundle(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/ClassLoader;)Ljava/util/ResourceBundle;

    move-result-object v4

    .line 329
    invoke-virtual {v4}, Ljava/util/ResourceBundle;->getKeys()Ljava/util/Enumeration;

    move-result-object v5

    .line 330
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 331
    invoke-interface {v5}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    .line 332
    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v0, v1

    .line 338
    check-cast v0, Ljava/lang/String;

    const-string v2, "\\."

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 339
    array-length v0, v6

    add-int/lit8 v7, v0, -0x1

    .line 341
    const/4 v0, 0x0

    move v2, v0

    move-object v3, p0

    :goto_1
    if-ge v2, v7, :cond_3

    .line 342
    aget-object v8, v6, v2

    .line 343
    invoke-virtual {v3, v8}, Ltwitter4j/internal/org/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 344
    instance-of v9, v0, Ltwitter4j/internal/org/json/JSONObject;

    if-eqz v9, :cond_2

    check-cast v0, Ltwitter4j/internal/org/json/JSONObject;

    .line 345
    :goto_2
    if-nez v0, :cond_1

    .line 346
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    invoke-direct {v0}, Ltwitter4j/internal/org/json/JSONObject;-><init>()V

    .line 347
    invoke-virtual {v3, v8, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 341
    :cond_1
    add-int/lit8 v2, v2, 0x1

    move-object v3, v0

    goto :goto_1

    .line 344
    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    .line 351
    :cond_3
    aget-object v0, v6, v7

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    goto :goto_0

    .line 354
    :cond_4
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 4

    .prologue
    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 236
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    .line 237
    if-eqz p1, :cond_1

    .line 238
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 239
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 241
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 242
    if-eqz v2, :cond_0

    .line 243
    iget-object v3, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ltwitter4j/internal/org/json/JSONObject;->wrap(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 247
    :cond_1
    return-void
.end method

.method public constructor <init>(Ltwitter4j/internal/org/json/JSONObject;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 160
    invoke-direct {p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>()V

    .line 161
    const/4 v0, 0x0

    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    .line 163
    :try_start_0
    aget-object v1, p2, v0

    aget-object v2, p2, v0

    invoke-virtual {p1, v2}, Ltwitter4j/internal/org/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ltwitter4j/internal/org/json/JSONObject;->putOnce(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 167
    :cond_0
    return-void

    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public constructor <init>(Ltwitter4j/internal/org/json/JSONTokener;)V
    .locals 3

    .prologue
    .line 178
    invoke-direct {p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>()V

    .line 182
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextClean()C

    move-result v0

    const/16 v1, 0x7b

    if-eq v0, v1, :cond_1

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "A JSONObject text must begin with \'{\' found:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextClean()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 217
    :cond_0
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->back()V

    .line 186
    :cond_1
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextClean()C

    move-result v0

    .line 187
    sparse-switch v0, :sswitch_data_0

    .line 193
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->back()V

    .line 194
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 199
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextClean()C

    move-result v1

    .line 200
    const/16 v2, 0x3d

    if-ne v1, v2, :cond_3

    .line 201
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->next()C

    move-result v1

    const/16 v2, 0x3e

    if-eq v1, v2, :cond_2

    .line 202
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->back()V

    .line 207
    :cond_2
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ltwitter4j/internal/org/json/JSONObject;->putOnce(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 211
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextClean()C

    move-result v0

    sparse-switch v0, :sswitch_data_1

    .line 222
    const-string v0, "Expected a \',\' or \'}\'"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 189
    :sswitch_0
    const-string v0, "A JSONObject text must end with \'}\'"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 204
    :cond_3
    const/16 v2, 0x3a

    if-eq v1, v2, :cond_2

    .line 205
    const-string v0, "Expected a \':\' after a key"

    invoke-virtual {p1, v0}, Ltwitter4j/internal/org/json/JSONTokener;->syntaxError(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONException;

    move-result-object v0

    throw v0

    .line 214
    :sswitch_1
    invoke-virtual {p1}, Ltwitter4j/internal/org/json/JSONTokener;->nextClean()C

    move-result v0

    const/16 v1, 0x7d

    if-ne v0, v1, :cond_0

    .line 220
    :sswitch_2
    return-void

    .line 187
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x7d -> :sswitch_2
    .end sparse-switch

    .line 211
    :sswitch_data_1
    .sparse-switch
        0x2c -> :sswitch_1
        0x3b -> :sswitch_1
        0x7d -> :sswitch_2
    .end sparse-switch
.end method

.method public static numberToString(Ljava/lang/Number;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 582
    if-nez p0, :cond_0

    .line 583
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    const-string v1, "Null pointer"

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 585
    :cond_0
    invoke-static {p0}, Ltwitter4j/internal/org/json/JSONObject;->testValidity(Ljava/lang/Object;)V

    .line 589
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 590
    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-lez v1, :cond_2

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_2

    const/16 v1, 0x45

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_2

    .line 592
    :goto_0
    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 593
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 595
    :cond_1
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 596
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 599
    :cond_2
    return-object v0
.end method

.method private populateMap(Ljava/lang/Object;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 615
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 619
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-eqz v0, :cond_4

    move v0, v3

    .line 621
    :goto_0
    if-eqz v0, :cond_5

    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    .line 623
    :goto_1
    array-length v2, v0

    if-ge v1, v2, :cond_9

    .line 625
    :try_start_0
    aget-object v4, v0, v1

    .line 626
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 627
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    .line 628
    const-string v2, ""

    .line 629
    const-string v6, "get"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 630
    const-string v2, "getClass"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "getDeclaringClass"

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 632
    :cond_0
    const-string v2, ""

    .line 639
    :cond_1
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_3

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    if-nez v5, :cond_3

    .line 642
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v3, :cond_8

    .line 643
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    .line 649
    :cond_2
    :goto_3
    const/4 v5, 0x0

    invoke-virtual {v4, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 650
    if-eqz v4, :cond_3

    .line 651
    iget-object v5, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-static {v4}, Ltwitter4j/internal/org/json/JSONObject;->wrap(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 623
    :cond_3
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    move v0, v1

    .line 619
    goto :goto_0

    .line 621
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    goto :goto_1

    .line 634
    :cond_6
    const/4 v2, 0x3

    :try_start_1
    invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 636
    :cond_7
    const-string v6, "is"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 637
    const/4 v2, 0x2

    invoke-virtual {v5, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 644
    :cond_8
    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v5

    if-nez v5, :cond_2

    .line 645
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v2

    goto :goto_3

    .line 658
    :cond_9
    return-void

    :catch_0
    move-exception v2

    goto :goto_4
.end method

.method public static quote(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .prologue
    const/16 v8, 0x5c

    const/16 v7, 0x22

    const/4 v0, 0x0

    .line 823
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 824
    :cond_0
    const-string v0, "\"\""

    .line 876
    :goto_0
    return-object v0

    .line 831
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    .line 832
    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v3, 0x4

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 834
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v1, v0

    .line 835
    :goto_1
    if-ge v0, v3, :cond_6

    .line 837
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 838
    sparse-switch v2, :sswitch_data_0

    .line 866
    const/16 v1, 0x20

    if-lt v2, v1, :cond_3

    const/16 v1, 0x80

    if-lt v2, v1, :cond_2

    const/16 v1, 0xa0

    if-lt v2, v1, :cond_3

    :cond_2
    const/16 v1, 0x2000

    if-lt v2, v1, :cond_5

    const/16 v1, 0x2100

    if-ge v2, v1, :cond_5

    .line 868
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "000"

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 869
    const-string v5, "\\u"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x4

    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    :goto_2
    add-int/lit8 v0, v0, 0x1

    move v1, v2

    goto :goto_1

    .line 841
    :sswitch_0
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 842
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 845
    :sswitch_1
    const/16 v5, 0x3c

    if-ne v1, v5, :cond_4

    .line 846
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 848
    :cond_4
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 851
    :sswitch_2
    const-string v1, "\\b"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 854
    :sswitch_3
    const-string v1, "\\t"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 857
    :sswitch_4
    const-string v1, "\\n"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 860
    :sswitch_5
    const-string v1, "\\f"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 863
    :sswitch_6
    const-string v1, "\\r"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 871
    :cond_5
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 875
    :cond_6
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 876
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 838
    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0x9 -> :sswitch_3
        0xa -> :sswitch_4
        0xc -> :sswitch_5
        0xd -> :sswitch_6
        0x22 -> :sswitch_0
        0x2f -> :sswitch_1
        0x5c -> :sswitch_0
    .end sparse-switch
.end method

.method public static stringToValue(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .prologue
    const/16 v5, 0x30

    const/16 v4, 0x2e

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 908
    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 954
    :cond_0
    :goto_0
    return-object p0

    .line 911
    :cond_1
    const-string v0, "true"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 912
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    .line 914
    :cond_2
    const-string v0, "false"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 915
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    .line 917
    :cond_3
    const-string v0, "null"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 918
    sget-object p0, Ltwitter4j/internal/org/json/JSONObject;->NULL:Ljava/lang/Object;

    goto :goto_0

    .line 930
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 931
    if-lt v0, v5, :cond_5

    const/16 v1, 0x39

    if-le v0, v1, :cond_6

    :cond_5
    if-eq v0, v4, :cond_6

    const/16 v1, 0x2d

    if-eq v0, v1, :cond_6

    const/16 v1, 0x2b

    if-ne v0, v1, :cond_0

    .line 932
    :cond_6
    if-ne v0, v5, :cond_8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v3, :cond_8

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x78

    if-eq v0, v1, :cond_7

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x58

    if-ne v0, v1, :cond_8

    .line 935
    :cond_7
    const/4 v0, 0x2

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 940
    :cond_8
    const/16 v0, 0x2e

    :try_start_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_9

    const/16 v0, 0x65

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_9

    const/16 v0, 0x45

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-ltz v0, :cond_a

    .line 942
    :cond_9
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p0

    goto :goto_0

    .line 944
    :cond_a
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p0}, Ljava/lang/Long;-><init>(Ljava/lang/String;)V

    .line 945
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v1

    int-to-long v4, v1

    cmp-long v1, v2, v4

    if-nez v1, :cond_b

    .line 946
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object p0

    goto/16 :goto_0

    :cond_b
    move-object p0, v0

    .line 948
    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto/16 :goto_0
.end method

.method public static testValidity(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 965
    if-eqz p0, :cond_3

    .line 966
    instance-of v0, p0, Ljava/lang/Double;

    if-eqz v0, :cond_1

    move-object v0, p0

    .line 967
    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->isInfinite()Z

    move-result v0

    if-nez v0, :cond_0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->isNaN()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 968
    :cond_0
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    const-string v1, "JSON does not allow non-finite numbers."

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 971
    :cond_1
    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_3

    move-object v0, p0

    .line 972
    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->isInfinite()Z

    move-result v0

    if-nez v0, :cond_2

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->isNaN()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 973
    :cond_2
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    const-string v1, "JSON does not allow non-finite numbers."

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 978
    :cond_3
    return-void
.end method

.method public static valueToString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1113
    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1114
    :cond_0
    const-string v0, "null"

    .line 1132
    :goto_0
    return-object v0

    .line 1116
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 1117
    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Ltwitter4j/internal/org/json/JSONObject;->numberToString(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1119
    :cond_2
    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_3

    instance-of v0, p0, Ltwitter4j/internal/org/json/JSONObject;

    if-nez v0, :cond_3

    instance-of v0, p0, Ltwitter4j/internal/org/json/JSONArray;

    if-eqz v0, :cond_4

    .line 1121
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1123
    :cond_4
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_5

    .line 1124
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    check-cast p0, Ljava/util/Map;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1126
    :cond_5
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_6

    .line 1127
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1129
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1130
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1132
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static valueToString(Ljava/lang/Object;II)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1153
    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1154
    :cond_0
    const-string v0, "null"

    .line 1177
    :goto_0
    return-object v0

    .line 1156
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    if-eqz v0, :cond_2

    .line 1157
    check-cast p0, Ljava/lang/Number;

    invoke-static {p0}, Ltwitter4j/internal/org/json/JSONObject;->numberToString(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1159
    :cond_2
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 1160
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1162
    :cond_3
    instance-of v0, p0, Ltwitter4j/internal/org/json/JSONObject;

    if-eqz v0, :cond_4

    .line 1163
    check-cast p0, Ltwitter4j/internal/org/json/JSONObject;

    invoke-virtual {p0, p1, p2}, Ltwitter4j/internal/org/json/JSONObject;->toString(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1165
    :cond_4
    instance-of v0, p0, Ltwitter4j/internal/org/json/JSONArray;

    if-eqz v0, :cond_5

    .line 1166
    check-cast p0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-virtual {p0, p1, p2}, Ltwitter4j/internal/org/json/JSONArray;->toString(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1168
    :cond_5
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_6

    .line 1169
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    check-cast p0, Ljava/util/Map;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, p1, p2}, Ltwitter4j/internal/org/json/JSONObject;->toString(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1171
    :cond_6
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_7

    .line 1172
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p1, p2}, Ltwitter4j/internal/org/json/JSONArray;->toString(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1174
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1175
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, p2}, Ltwitter4j/internal/org/json/JSONArray;->toString(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1177
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static wrap(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1195
    if-nez p0, :cond_1

    .line 1196
    :try_start_0
    sget-object p0, Ltwitter4j/internal/org/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 1226
    :cond_0
    :goto_0
    return-object p0

    .line 1198
    :cond_1
    instance-of v0, p0, Ltwitter4j/internal/org/json/JSONObject;

    if-nez v0, :cond_0

    instance-of v0, p0, Ltwitter4j/internal/org/json/JSONArray;

    if-nez v0, :cond_0

    sget-object v0, Ltwitter4j/internal/org/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Byte;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Character;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Short;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Long;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Float;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/Double;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1208
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    .line 1209
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/util/Collection;)V

    move-object p0, v0

    goto :goto_0

    .line 1211
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1212
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    .line 1214
    :cond_3
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 1215
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    check-cast p0, Ljava/util/Map;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/util/Map;)V

    move-object p0, v0

    goto :goto_0

    .line 1217
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    .line 1218
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1219
    :goto_1
    const-string v1, "java."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "javax."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    if-nez v0, :cond_7

    .line 1222
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    .line 1218
    :cond_6
    const-string v0, ""

    goto :goto_1

    .line 1224
    :cond_7
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    invoke-direct {v0, p0}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    goto/16 :goto_0

    .line 1226
    :catch_0
    move-exception v0

    const/4 p0, 0x0

    goto/16 :goto_0
.end method


# virtual methods
.method public append(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;
    .locals 3

    .prologue
    .line 369
    invoke-static {p2}, Ltwitter4j/internal/org/json/JSONObject;->testValidity(Ljava/lang/Object;)V

    .line 370
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 371
    if-nez v0, :cond_0

    .line 372
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v0}, Ltwitter4j/internal/org/json/JSONArray;-><init>()V

    invoke-virtual {v0, p2}, Ltwitter4j/internal/org/json/JSONArray;->put(Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 379
    :goto_0
    return-object p0

    .line 373
    :cond_0
    instance-of v1, v0, Ltwitter4j/internal/org/json/JSONArray;

    if-eqz v1, :cond_1

    .line 374
    check-cast v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-virtual {v0, p2}, Ltwitter4j/internal/org/json/JSONArray;->put(Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONArray;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    goto :goto_0

    .line 376
    :cond_1
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] is not a JSONArray."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 390
    if-nez p1, :cond_0

    .line 391
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    const-string v1, "Null key."

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 393
    :cond_0
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 394
    if-nez v0, :cond_1

    .line 395
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] not found."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 398
    :cond_1
    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 410
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 411
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    const-string v2, "false"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 414
    :cond_0
    const/4 v0, 0x0

    .line 418
    :goto_0
    return v0

    .line 415
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_3

    check-cast v1, Ljava/lang/String;

    const-string v0, "true"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 418
    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    .line 420
    :cond_3
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] is not a Boolean."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getInt(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 433
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 435
    :try_start_0
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 439
    :catch_0
    move-exception v0

    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] is not an int."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getJSONArray(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONArray;
    .locals 3

    .prologue
    .line 454
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 455
    instance-of v1, v0, Ltwitter4j/internal/org/json/JSONArray;

    if-eqz v1, :cond_0

    .line 456
    check-cast v0, Ltwitter4j/internal/org/json/JSONArray;

    return-object v0

    .line 458
    :cond_0
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] is not a JSONArray."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getJSONObject(Ljava/lang/String;)Ltwitter4j/internal/org/json/JSONObject;
    .locals 3

    .prologue
    .line 472
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 473
    instance-of v1, v0, Ltwitter4j/internal/org/json/JSONObject;

    if-eqz v1, :cond_0

    .line 474
    check-cast v0, Ltwitter4j/internal/org/json/JSONObject;

    return-object v0

    .line 476
    :cond_0
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] is not a JSONObject."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getLong(Ljava/lang/String;)J
    .locals 3

    .prologue
    .line 490
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 492
    :try_start_0
    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    goto :goto_0

    .line 496
    :catch_0
    move-exception v0

    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSONObject["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "] is not a long."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 509
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 510
    sget-object v1, Ltwitter4j/internal/org/json/JSONObject;->NULL:Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public has(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 521
    iget-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isNull(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 533
    sget-object v0, Ltwitter4j/internal/org/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public keys()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public length()I
    .locals 1

    .prologue
    .line 553
    iget-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public names()Ltwitter4j/internal/org/json/JSONArray;
    .locals 3

    .prologue
    .line 565
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v0}, Ltwitter4j/internal/org/json/JSONArray;-><init>()V

    .line 566
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 567
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 568
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ltwitter4j/internal/org/json/JSONArray;->put(Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONArray;

    goto :goto_0

    .line 570
    :cond_0
    invoke-virtual {v0}, Ltwitter4j/internal/org/json/JSONArray;->length()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method public opt(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 610
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public put(Ljava/lang/String;D)Ltwitter4j/internal/org/json/JSONObject;
    .locals 2

    .prologue
    .line 699
    new-instance v0, Ljava/lang/Double;

    invoke-direct {v0, p2, p3}, Ljava/lang/Double;-><init>(D)V

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 700
    return-object p0
.end method

.method public put(Ljava/lang/String;I)Ltwitter4j/internal/org/json/JSONObject;
    .locals 1

    .prologue
    .line 713
    new-instance v0, Ljava/lang/Integer;

    invoke-direct {v0, p2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 714
    return-object p0
.end method

.method public put(Ljava/lang/String;J)Ltwitter4j/internal/org/json/JSONObject;
    .locals 2

    .prologue
    .line 727
    new-instance v0, Ljava/lang/Long;

    invoke-direct {v0, p2, p3}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 728
    return-object p0
.end method

.method public put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;
    .locals 2

    .prologue
    .line 760
    if-nez p1, :cond_0

    .line 761
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    const-string v1, "Null key."

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 763
    :cond_0
    if-eqz p2, :cond_1

    .line 764
    invoke-static {p2}, Ltwitter4j/internal/org/json/JSONObject;->testValidity(Ljava/lang/Object;)V

    .line 765
    iget-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 769
    :goto_0
    return-object p0

    .line 767
    :cond_1
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public put(Ljava/lang/String;Ljava/util/Collection;)Ltwitter4j/internal/org/json/JSONObject;
    .locals 1

    .prologue
    .line 685
    new-instance v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-direct {v0, p2}, Ltwitter4j/internal/org/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 686
    return-object p0
.end method

.method public put(Ljava/lang/String;Ljava/util/Map;)Ltwitter4j/internal/org/json/JSONObject;
    .locals 1

    .prologue
    .line 742
    new-instance v0, Ltwitter4j/internal/org/json/JSONObject;

    invoke-direct {v0, p2}, Ltwitter4j/internal/org/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 743
    return-object p0
.end method

.method public put(Ljava/lang/String;Z)Ltwitter4j/internal/org/json/JSONObject;
    .locals 1

    .prologue
    .line 670
    if-eqz p2, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_0
    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 671
    return-object p0

    .line 670
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0
.end method

.method public putOnce(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;
    .locals 3

    .prologue
    .line 784
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 785
    invoke-virtual {p0, p1}, Ltwitter4j/internal/org/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 786
    new-instance v0, Ltwitter4j/internal/org/json/JSONException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Duplicate key \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 788
    :cond_0
    invoke-virtual {p0, p1, p2}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 790
    :cond_1
    return-object p0
.end method

.method public putOpt(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;
    .locals 0

    .prologue
    .line 806
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 807
    invoke-virtual {p0, p1, p2}, Ltwitter4j/internal/org/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Ltwitter4j/internal/org/json/JSONObject;

    .line 809
    :cond_0
    return-object p0
.end method

.method public remove(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 887
    iget-object v0, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public sortedKeys()Ljava/util/Iterator;
    .locals 2

    .prologue
    .line 897
    new-instance v0, Ljava/util/TreeSet;

    iget-object v1, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 994
    :try_start_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 995
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "{"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 997
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 998
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    .line 999
    const/16 v2, 0x2c

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1001
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 1002
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1003
    const/16 v3, 0x3a

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1004
    iget-object v3, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ltwitter4j/internal/org/json/JSONObject;->valueToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1009
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    :goto_1
    return-object v0

    .line 1006
    :cond_1
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1007
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_1
.end method

.method public toString(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1028
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ltwitter4j/internal/org/json/JSONObject;->toString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method toString(II)Ljava/lang/String;
    .locals 9

    .prologue
    const/16 v8, 0x20

    const/16 v7, 0xa

    const/4 v0, 0x0

    const/4 v6, 0x1

    .line 1048
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONObject;->length()I

    move-result v1

    .line 1049
    if-nez v1, :cond_0

    .line 1050
    const-string v0, "{}"

    .line 1086
    :goto_0
    return-object v0

    .line 1052
    :cond_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONObject;->sortedKeys()Ljava/util/Iterator;

    move-result-object v2

    .line 1053
    add-int v3, p2, p1

    .line 1055
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "{"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1056
    if-ne v1, v6, :cond_3

    .line 1057
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 1058
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    const-string v1, ": "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1060
    iget-object v1, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1, p2}, Ltwitter4j/internal/org/json/JSONObject;->valueToString(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1085
    :cond_1
    const/16 v0, 0x7d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1086
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1073
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1074
    const-string v1, ": "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1075
    iget-object v1, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1, v3}, Ltwitter4j/internal/org/json/JSONObject;->valueToString(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1063
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1064
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 1065
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v6, :cond_4

    .line 1066
    const-string v1, ",\n"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    move v1, v0

    .line 1070
    :goto_2
    if-ge v1, v3, :cond_2

    .line 1071
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1070
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1068
    :cond_4
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1078
    :cond_5
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v1, v6, :cond_1

    .line 1079
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1080
    :goto_3
    if-ge v0, p2, :cond_1

    .line 1081
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1080
    add-int/lit8 v0, v0, 0x1

    goto :goto_3
.end method

.method public write(Ljava/io/Writer;)Ljava/io/Writer;
    .locals 3

    .prologue
    .line 1242
    const/4 v0, 0x0

    .line 1243
    :try_start_0
    invoke-virtual {p0}, Ltwitter4j/internal/org/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    .line 1244
    const/16 v2, 0x7b

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V

    .line 1246
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1247
    if-eqz v0, :cond_0

    .line 1248
    const/16 v0, 0x2c

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V

    .line 1250
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 1251
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ltwitter4j/internal/org/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 1252
    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Ljava/io/Writer;->write(I)V

    .line 1253
    iget-object v2, p0, Ltwitter4j/internal/org/json/JSONObject;->map:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1254
    instance-of v2, v0, Ltwitter4j/internal/org/json/JSONObject;

    if-eqz v2, :cond_1

    .line 1255
    check-cast v0, Ltwitter4j/internal/org/json/JSONObject;

    invoke-virtual {v0, p1}, Ltwitter4j/internal/org/json/JSONObject;->write(Ljava/io/Writer;)Ljava/io/Writer;

    .line 1261
    :goto_1
    const/4 v0, 0x1

    .line 1262
    goto :goto_0

    .line 1256
    :cond_1
    instance-of v2, v0, Ltwitter4j/internal/org/json/JSONArray;

    if-eqz v2, :cond_2

    .line 1257
    check-cast v0, Ltwitter4j/internal/org/json/JSONArray;

    invoke-virtual {v0, p1}, Ltwitter4j/internal/org/json/JSONArray;->write(Ljava/io/Writer;)Ljava/io/Writer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 1265
    :catch_0
    move-exception v0

    .line 1266
    new-instance v1, Ltwitter4j/internal/org/json/JSONException;

    invoke-direct {v1, v0}, Ltwitter4j/internal/org/json/JSONException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 1259
    :cond_2
    :try_start_1
    invoke-static {v0}, Ltwitter4j/internal/org/json/JSONObject;->valueToString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    goto :goto_1

    .line 1263
    :cond_3
    const/16 v0, 0x7d

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1264
    return-object p1
.end method
