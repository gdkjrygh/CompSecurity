.class public final Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final dateFormats:[Ljava/text/SimpleDateFormat;

.field private static final verifiedGraphObjectClasses:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet",
            "<",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    .line 95
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->verifiedGraphObjectClasses:Ljava/util/HashSet;

    .line 96
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/text/SimpleDateFormat;

    const/4 v1, 0x0

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    aput-object v2, v0, v1

    const/4 v1, 0x2

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    aput-object v2, v0, v1

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->dateFormats:[Ljava/text/SimpleDateFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    return-void
.end method

.method static synthetic access$000(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 1

    .prologue
    .line 94
    invoke-static {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 94
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createGraphObjectProxyForMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 94
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->getUnderlyingJSONObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class",
            "<TU;>;",
            "Ljava/lang/reflect/ParameterizedType;",
            ")TU;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 270
    if-nez p0, :cond_4

    .line 271
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 273
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    .line 362
    :cond_0
    :goto_0
    return-object p0

    .line 275
    :cond_1
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 277
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    goto :goto_0

    .line 279
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 281
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    .line 284
    :cond_3
    const/4 p0, 0x0

    goto :goto_0

    .line 288
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    .line 289
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 295
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_0

    .line 302
    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 307
    const-class v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 310
    check-cast p0, Lorg/json/JSONObject;

    invoke-static {p1, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object p0

    goto :goto_0

    .line 312
    :cond_5
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 315
    check-cast p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-interface {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object p0

    goto :goto_0

    .line 318
    :cond_6
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t create CmObject from "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 320
    :cond_7
    const-class v2, Ljava/lang/Iterable;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    const-class v2, Ljava/util/List;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 322
    :cond_8
    if-nez p2, :cond_9

    .line 323
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "can\'t infer generic type of: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 326
    :cond_9
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    .line 328
    if-eqz v2, :cond_a

    array-length v4, v2

    if-ne v4, v5, :cond_a

    aget-object v4, v2, v1

    instance-of v4, v4, Ljava/lang/Class;

    if-nez v4, :cond_b

    .line 330
    :cond_a
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    const-string v2, "Expect collection properties to be of a type with exactly one generic parameter."

    invoke-direct {v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 333
    :cond_b
    aget-object v1, v2, v1

    check-cast v1, Ljava/lang/Class;

    .line 335
    const-class v2, Lorg/json/JSONArray;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 336
    check-cast p0, Lorg/json/JSONArray;

    .line 338
    invoke-static {p0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    move-result-object p0

    goto/16 :goto_0

    .line 341
    :cond_c
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t create Collection from "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 343
    :cond_d
    const-class v2, Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 344
    const-class v2, Ljava/lang/Double;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_e

    const-class v2, Ljava/lang/Float;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 347
    :cond_e
    const-string v2, "%f"

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p0, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    .line 349
    :cond_f
    const-class v2, Ljava/lang/Number;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 351
    const-string v2, "%d"

    new-array v3, v5, [Ljava/lang/Object;

    aput-object p0, v3, v1

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    .line 354
    :cond_10
    const-class v2, Ljava/util/Date;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 355
    const-class v2, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 356
    sget-object v4, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->dateFormats:[Ljava/text/SimpleDateFormat;

    array-length v5, v4

    move v2, v1

    :goto_1
    if-ge v2, v5, :cond_12

    aget-object v6, v4, v2

    .line 358
    :try_start_0
    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    move-object v1, v0

    invoke-virtual {v6, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 359
    if-eqz v1, :cond_11

    move-object p0, v1

    .line 362
    goto/16 :goto_0

    :catch_0
    move-exception v1

    .line 356
    :cond_11
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 370
    :cond_12
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t convert type"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method static convertCamelCaseToLowercaseWithUnderscores(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 375
    const-string v0, "([a-z])([A-Z])"

    const-string v1, "$1_$2"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 376
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static create()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 1

    .prologue
    .line 137
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->create(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    return-object v0
.end method

.method public static create(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 149
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    return-object v0
.end method

.method public static create(Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 1

    .prologue
    .line 113
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-static {p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->create(Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    return-object v0
.end method

.method public static create(Lorg/json/JSONObject;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 126
    invoke-static {p1, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    return-object v0
.end method

.method private static createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lorg/json/JSONObject;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 199
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->verifyCanProxyClass(Ljava/lang/Class;)V

    .line 201
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    .line 202
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;

    invoke-direct {v1, p1, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;-><init>(Lorg/json/JSONObject;Ljava/lang/Class;)V

    .line 205
    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v2, v0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    .line 207
    return-object v0
.end method

.method private static createGraphObjectProxyForMap(Lorg/json/JSONObject;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 211
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/util/Map;

    aput-object v2, v0, v1

    .line 212
    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;

    const-class v2, Ljava/util/Map;

    invoke-direct {v1, p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;-><init>(Lorg/json/JSONObject;Ljava/lang/Class;)V

    .line 215
    const-class v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v2, v0, v1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 218
    return-object v0
.end method

.method public static createList(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 195
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {v0, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    move-result-object v0

    return-object v0
.end method

.method public static createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/json/JSONArray;",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 183
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;

    invoke-direct {v0, p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;-><init>(Lorg/json/JSONArray;Ljava/lang/Class;)V

    return-object v0
.end method

.method private static getUnderlyingJSONObject(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    .line 380
    if-nez p0, :cond_1

    .line 381
    const/4 p0, 0x0

    .line 403
    :cond_0
    :goto_0
    return-object p0

    .line 384
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 385
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 386
    check-cast p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    .line 387
    invoke-interface {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object p0

    goto :goto_0

    .line 388
    :cond_2
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 389
    check-cast p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    .line 390
    invoke-interface {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;->getInnerJSONArray()Lorg/json/JSONArray;

    move-result-object p0

    goto :goto_0

    .line 391
    :cond_3
    const-class v1, Ljava/lang/Iterable;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 392
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 393
    check-cast p0, Ljava/lang/Iterable;

    .line 394
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 395
    const-class v3, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 396
    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    .line 398
    :cond_4
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :cond_5
    move-object p0, v1

    .line 401
    goto :goto_0
.end method

.method private static declared-synchronized hasClassBeenVerified(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)Z"
        }
    .end annotation

    .prologue
    .line 222
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->verifiedGraphObjectClasses:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static hasSameId(Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 159
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->asMap()Ljava/util/Map;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->asMap()Ljava/util/Map;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 170
    :cond_0
    :goto_0
    return v0

    .line 162
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 163
    const/4 v0, 0x1

    goto :goto_0

    .line 165
    :cond_2
    const-string v1, "id"

    invoke-interface {p0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 166
    const-string v2, "id"

    invoke-interface {p1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 167
    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_0

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method private static declared-synchronized recordClassHasBeenVerified(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 226
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->verifiedGraphObjectClasses:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    monitor-exit v1

    return-void

    .line 226
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static verifyCanProxyClass(Ljava/lang/Class;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    const/4 v9, 0x3

    .line 230
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->hasClassBeenVerified(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 264
    :goto_0
    return-void

    .line 234
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-nez v0, :cond_1

    .line 235
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Factory can only wrap interfaces, not class: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 239
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    .line 240
    array-length v2, v1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v2, :cond_5

    aget-object v3, v1, v0

    .line 241
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    .line 242
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    .line 243
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    .line 245
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-nez v7, :cond_2

    .line 248
    const/4 v7, 0x1

    if-ne v5, v7, :cond_3

    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v6, v7, :cond_3

    .line 249
    const-string v5, "set"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v9, :cond_4

    .line 240
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 253
    :cond_3
    if-nez v5, :cond_4

    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v6, v5, :cond_4

    .line 254
    const-string v5, "get"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v4, v9, :cond_2

    .line 260
    :cond_4
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Factory can\'t proxy method: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_5
    invoke-static {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->recordClassHasBeenVerified(Ljava/lang/Class;)V

    goto/16 :goto_0
.end method
