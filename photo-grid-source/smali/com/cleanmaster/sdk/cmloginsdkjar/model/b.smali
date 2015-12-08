.class final Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;
.super Lcom/cleanmaster/sdk/cmloginsdkjar/model/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/cleanmaster/sdk/cmloginsdkjar/model/d",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 473
    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/d;-><init>(Ljava/lang/Object;)V

    .line 474
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->b:Ljava/lang/Class;

    .line 475
    return-void
.end method

.method private a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 635
    const/4 v0, 0x0

    aget-object v0, p1, v0

    check-cast v0, Ljava/lang/String;

    .line 636
    const/4 v1, 0x1

    aget-object v1, p1, v1

    .line 637
    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->getUnderlyingJSONObject(Ljava/lang/Object;)Ljava/lang/Object;
    invoke-static {v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->access$200(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 639
    :try_start_0
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 643
    const/4 v0, 0x0

    return-object v0

    .line 640
    :catch_0
    move-exception v0

    .line 641
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 484
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    .line 486
    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 487
    invoke-virtual {p0, p2, p3}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 2628
    :cond_0
    :goto_0
    return-object v4

    .line 488
    :cond_1
    const-class v1, Ljava/util/Map;

    if-ne v0, v1, :cond_12

    .line 1500
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1501
    const-string v1, "clear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1502
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    .line 2012
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 2013
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2014
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2015
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 1504
    :cond_2
    const-string v1, "containsKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1505
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v1, p3, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_0

    .line 1506
    :cond_3
    const-string v1, "containsValue"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1507
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v4, p3, v3

    .line 2021
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 2022
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 2023
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 2024
    if-eqz v1, :cond_4

    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    move v0, v2

    .line 1507
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_0

    :cond_5
    move v0, v3

    .line 2028
    goto :goto_2

    .line 1508
    :cond_6
    const-string v1, "entrySet"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 1509
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    .line 2059
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 2062
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 2063
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2064
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 2065
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 2066
    new-instance v5, Lcom/cleanmaster/sdk/cmloginsdkjar/model/f;

    invoke-direct {v5, v1, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/f;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1510
    :cond_7
    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1511
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v1, p3, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 1512
    :cond_8
    const-string v1, "isEmpty"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 1513
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-nez v0, :cond_9

    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto/16 :goto_0

    :cond_9
    move v2, v3

    goto :goto_4

    .line 1514
    :cond_a
    const-string v1, "keySet"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 1515
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/e;->a(Lorg/json/JSONObject;)Ljava/util/Set;

    move-result-object v4

    goto/16 :goto_0

    .line 1516
    :cond_b
    const-string v1, "put"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1517
    invoke-direct {p0, p3}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 1518
    :cond_c
    const-string v1, "putAll"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 1520
    aget-object v0, p3, v3

    instance-of v0, v0, Ljava/util/Map;

    if-eqz v0, :cond_d

    .line 1522
    aget-object v0, p3, v3

    check-cast v0, Ljava/util/Map;

    move-object v1, v0

    .line 1529
    :goto_5
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/e;->a(Lorg/json/JSONObject;Ljava/util/Map;)V

    goto/16 :goto_0

    .line 1524
    :cond_d
    aget-object v0, p3, v3

    instance-of v0, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    if-eqz v0, :cond_0

    .line 1525
    aget-object v0, p3, v3

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->asMap()Ljava/util/Map;

    move-result-object v0

    move-object v1, v0

    goto :goto_5

    .line 1531
    :cond_e
    const-string v1, "remove"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 1532
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v1, p3, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 1534
    :cond_f
    const-string v1, "size"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 1535
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto/16 :goto_0

    .line 1536
    :cond_10
    const-string v1, "values"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 1537
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/e;->b(Lorg/json/JSONObject;)Ljava/util/Collection;

    move-result-object v4

    goto/16 :goto_0

    .line 1540
    :cond_11
    invoke-virtual {p0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 490
    :cond_12
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    if-ne v0, v1, :cond_1c

    .line 2544
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2545
    const-string v1, "cast"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 2547
    aget-object v0, p3, v3

    check-cast v0, Ljava/lang/Class;

    .line 2549
    if-eqz v0, :cond_13

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_13

    move-object v4, p1

    .line 2551
    goto/16 :goto_0

    .line 2553
    :cond_13
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v1, Lorg/json/JSONObject;

    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createGraphObjectProxy(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;
    invoke-static {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->access$000(Ljava/lang/Class;Lorg/json/JSONObject;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v4

    goto/16 :goto_0

    .line 2554
    :cond_14
    const-string v1, "getInnerJSONObject"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 2555
    invoke-static {p1}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;

    move-result-object v0

    .line 2556
    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;

    .line 2557
    iget-object v4, v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    goto/16 :goto_0

    .line 2558
    :cond_15
    const-string v1, "asMap"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 2559
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createGraphObjectProxyForMap(Lorg/json/JSONObject;)Ljava/util/Map;
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->access$100(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v4

    goto/16 :goto_0

    .line 2560
    :cond_16
    const-string v1, "getProperty"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 2561
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v1, p3, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 2562
    :cond_17
    const-string v1, "getPropertyAs"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 2563
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v1, p3, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 2564
    aget-object v0, p3, v2

    check-cast v0, Ljava/lang/Class;

    .line 2566
    invoke-static {v1, v0, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 2567
    :cond_18
    const-string v1, "getPropertyAsList"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    .line 2568
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v1, p3, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 2569
    aget-object v0, p3, v2

    check-cast v0, Ljava/lang/Class;

    .line 2571
    new-instance v2, Lcom/cleanmaster/sdk/cmloginsdkjar/model/c;

    invoke-direct {v2, p0, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/c;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;Ljava/lang/Class;)V

    .line 2587
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    invoke-static {v1, v0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 2588
    :cond_19
    const-string v1, "setProperty"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 2589
    invoke-direct {p0, p3}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 2590
    :cond_1a
    const-string v1, "removeProperty"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 2591
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    aget-object v1, p3, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 2595
    :cond_1b
    invoke-virtual {p0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 492
    :cond_1c
    const-class v1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 2599
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2600
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    .line 2602
    const/4 v5, 0x3

    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->convertCamelCaseToLowercaseWithUnderscores(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2605
    if-nez v1, :cond_1d

    .line 2607
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 2609
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    .line 2611
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 2613
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_20

    .line 2614
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 2617
    :goto_6
    invoke-static {v1, v2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 2620
    :cond_1d
    if-ne v1, v2, :cond_1e

    .line 2622
    aget-object v0, p3, v3

    .line 2626
    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->getUnderlyingJSONObject(Ljava/lang/Object;)Ljava/lang/Object;
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->access$200(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 2627
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/json/JSONObject;

    invoke-virtual {v0, v5, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_0

    .line 2631
    :cond_1e
    invoke-virtual {p0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    .line 496
    :cond_1f
    invoke-virtual {p0, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a(Ljava/lang/reflect/Method;)Ljava/lang/Object;

    move-result-object v4

    goto/16 :goto_0

    :cond_20
    move-object v0, v4

    goto :goto_6
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 479
    const-string v0, "CmObject{graphObjectClass=%s, state=%s}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->b:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/b;->a:Ljava/lang/Object;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
