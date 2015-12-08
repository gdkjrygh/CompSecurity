.class Lcom/localytics/android/AmpSessionHandler$11;
.super Lcom/localytics/android/AmpCallable;
.source "AmpSessionHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/AmpSessionHandler;->getJavaScriptClientCallbacks(Ljava/util/Map;)Ljava/util/Map;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/localytics/android/AmpSessionHandler;


# direct methods
.method constructor <init>(Lcom/localytics/android/AmpSessionHandler;)V
    .locals 0

    .prologue
    .line 608
    iput-object p1, p0, Lcom/localytics/android/AmpSessionHandler$11;->this$0:Lcom/localytics/android/AmpSessionHandler;

    invoke-direct {p0}, Lcom/localytics/android/AmpCallable;-><init>()V

    return-void
.end method

.method private convertDimensionsToAttributes(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 798
    .local p1, "customDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 800
    .local v0, "attributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz p1, :cond_a

    .line 802
    const/4 v3, 0x0

    .line 803
    .local v3, "index":I
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 805
    .local v1, "element":Ljava/lang/String;
    if-nez v3, :cond_1

    .line 807
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 846
    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 847
    goto :goto_0

    .line 809
    :cond_1
    const/4 v4, 0x1

    if-ne v4, v3, :cond_2

    .line 811
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 813
    :cond_2
    const/4 v4, 0x2

    if-ne v4, v3, :cond_3

    .line 815
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 817
    :cond_3
    const/4 v4, 0x3

    if-ne v4, v3, :cond_4

    .line 819
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 821
    :cond_4
    const/4 v4, 0x4

    if-ne v4, v3, :cond_5

    .line 823
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 825
    :cond_5
    const/4 v4, 0x5

    if-ne v4, v3, :cond_6

    .line 827
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 829
    :cond_6
    const/4 v4, 0x6

    if-ne v4, v3, :cond_7

    .line 831
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 833
    :cond_7
    const/4 v4, 0x7

    if-ne v4, v3, :cond_8

    .line 835
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 837
    :cond_8
    const/16 v4, 0x8

    if-ne v4, v3, :cond_9

    .line 839
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 841
    :cond_9
    const/16 v4, 0x9

    if-ne v4, v3, :cond_0

    .line 843
    sget-object v4, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 850
    .end local v1    # "element":Ljava/lang/String;
    .end local v2    # "i$":Ljava/util/Iterator;
    .end local v3    # "index":I
    :cond_a
    return-object v0
.end method


# virtual methods
.method call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25
    .param p1, "params"    # [Ljava/lang/Object;

    .prologue
    .line 612
    const/16 v19, 0x0

    aget-object v10, p1, v19

    check-cast v10, Ljava/lang/String;

    .line 613
    .local v10, "event":Ljava/lang/String;
    const/16 v19, 0x1

    aget-object v3, p1, v19

    check-cast v3, Ljava/lang/String;

    .line 614
    .local v3, "attributes":Ljava/lang/String;
    const/16 v19, 0x2

    aget-object v4, p1, v19

    check-cast v4, Ljava/lang/String;

    .line 615
    .local v4, "customDimensions":Ljava/lang/String;
    const/16 v19, 0x3

    aget-object v19, p1, v19

    check-cast v19, Ljava/lang/Long;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 617
    .local v5, "customerValueIncrease":J
    const/4 v14, 0x0

    .line 620
    .local v14, "nativeAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
    :try_start_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19

    if-nez v19, :cond_0

    .line 622
    new-instance v19, Lorg/json/JSONObject;

    move-object/from16 v0, v19

    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lcom/localytics/android/JsonHelper;->toMap(Lorg/json/JSONObject;)Ljava/util/Map;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v14

    .line 634
    :cond_0
    const/4 v15, 0x0

    .line 637
    .local v15, "nativeCustomDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_1
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v19

    if-nez v19, :cond_1

    .line 639
    new-instance v19, Lorg/json/JSONArray;

    move-object/from16 v0, v19

    invoke-direct {v0, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static/range {v19 .. v19}, Lcom/localytics/android/JsonHelper;->toList(Lorg/json/JSONArray;)Ljava/util/List;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v15

    .line 653
    :cond_1
    if-nez v10, :cond_4

    .line 655
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "event cannot be null"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 625
    .end local v15    # "nativeCustomDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :catch_0
    move-exception v7

    .line 627
    .local v7, "e":Lorg/json/JSONException;
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_2

    .line 629
    const-string v19, "Localytics"

    const-string v20, "[JavaScriptClient]: Failed to parse the json object in tagEventNative"

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 631
    :cond_2
    const/16 v19, 0x0

    .line 784
    .end local v7    # "e":Lorg/json/JSONException;
    :goto_0
    return-object v19

    .line 642
    .restart local v15    # "nativeCustomDimensions":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :catch_1
    move-exception v7

    .line 644
    .restart local v7    # "e":Lorg/json/JSONException;
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_3

    .line 646
    const-string v19, "Localytics"

    const-string v20, "[JavaScriptClient]: Failed to parse the json object in tagEventNative"

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 648
    :cond_3
    const/16 v19, 0x0

    goto :goto_0

    .line 658
    .end local v7    # "e":Lorg/json/JSONException;
    :cond_4
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v19

    if-nez v19, :cond_5

    .line 660
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "event cannot be empty"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 663
    :cond_5
    if-eqz v3, :cond_c

    .line 669
    invoke-interface {v14}, Ljava/util/Map;->isEmpty()Z

    move-result v19

    if-eqz v19, :cond_6

    .line 671
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_6

    .line 673
    const-string v19, "Localytics"

    const-string v20, "attributes is empty.  Did the caller make an error?"

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 677
    :cond_6
    invoke-interface {v14}, Ljava/util/Map;->size()I

    move-result v19

    const/16 v20, 0x32

    move/from16 v0, v19

    move/from16 v1, v20

    if-le v0, v1, :cond_7

    .line 679
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_7

    .line 681
    const-string v19, "Localytics"

    const-string v20, "attributes size is %d, exceeding the maximum size of %d.  Did the caller make an error?"

    const/16 v21, 0x2

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    invoke-interface {v14}, Ljava/util/Map;->size()I

    move-result v23

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    const/16 v22, 0x1

    const/16 v23, 0x32

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 685
    :cond_7
    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .local v12, "i$":Ljava/util/Iterator;
    :cond_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 687
    .local v9, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 688
    .local v13, "key":Ljava/lang/String;
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/lang/String;

    .line 690
    .local v18, "value":Ljava/lang/String;
    if-nez v13, :cond_9

    .line 692
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "attributes cannot contain null keys"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 694
    :cond_9
    if-nez v18, :cond_a

    .line 696
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "attributes cannot contain null values"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 698
    :cond_a
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v19

    if-nez v19, :cond_b

    .line 700
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "attributes cannot contain empty keys"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 702
    :cond_b
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v19

    if-nez v19, :cond_8

    .line 704
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "attributes cannot contain empty values"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 709
    .end local v9    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v12    # "i$":Ljava/util/Iterator;
    .end local v13    # "key":Ljava/lang/String;
    .end local v18    # "value":Ljava/lang/String;
    :cond_c
    if-eqz v15, :cond_11

    .line 715
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v19

    if-eqz v19, :cond_d

    .line 717
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_d

    .line 719
    const-string v19, "Localytics"

    const-string v20, "customDimensions is empty.  Did the caller make an error?"

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 723
    :cond_d
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v19

    const/16 v20, 0xa

    move/from16 v0, v19

    move/from16 v1, v20

    if-le v0, v1, :cond_e

    .line 725
    sget-boolean v19, Lcom/localytics/android/Constants;->IS_LOGGABLE:Z

    if-eqz v19, :cond_e

    .line 727
    const-string v19, "Localytics"

    const-string v20, "customDimensions size is %d, exceeding the maximum size of %d.  Did the caller make an error?"

    const/16 v21, 0x2

    move/from16 v0, v21

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v21, v0

    const/16 v22, 0x0

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v23

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    const/16 v22, 0x1

    const/16 v23, 0xa

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v23

    aput-object v23, v21, v22

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v19 .. v20}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 731
    :cond_e
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .restart local v12    # "i$":Ljava/util/Iterator;
    :cond_f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_11

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 733
    .local v8, "element":Ljava/lang/Object;
    if-nez v8, :cond_10

    .line 735
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "customDimensions cannot contain null elements"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 737
    :cond_10
    check-cast v8, Ljava/lang/String;

    .end local v8    # "element":Ljava/lang/Object;
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v19

    if-nez v19, :cond_f

    .line 739
    new-instance v19, Ljava/lang/IllegalArgumentException;

    const-string v20, "customDimensions cannot contain empty elements"

    invoke-direct/range {v19 .. v20}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v19

    .line 745
    .end local v12    # "i$":Ljava/util/Iterator;
    :cond_11
    const-string v19, "%s:%s"

    const/16 v20, 0x2

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler$11;->this$0:Lcom/localytics/android/AmpSessionHandler;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler;->mContext:Landroid/content/Context;

    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v22

    aput-object v22, v20, v21

    const/16 v21, 0x1

    aput-object v10, v20, v21

    invoke-static/range {v19 .. v20}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 747
    .local v11, "eventString":Ljava/lang/String;
    if-nez v14, :cond_12

    if-nez v15, :cond_12

    .line 749
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler$11;->this$0:Lcom/localytics/android/AmpSessionHandler;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler$11;->this$0:Lcom/localytics/android/AmpSessionHandler;

    move-object/from16 v20, v0

    const/16 v21, 0x3

    const/16 v22, 0x3

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    aput-object v11, v22, v23

    const/16 v23, 0x1

    const/16 v24, 0x0

    aput-object v24, v22, v23

    const/16 v23, 0x2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v24

    aput-object v24, v22, v23

    invoke-virtual/range {v20 .. v22}, Lcom/localytics/android/AmpSessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Lcom/localytics/android/AmpSessionHandler;->sendMessage(Landroid/os/Message;)Z

    .line 784
    :goto_1
    const/16 v19, 0x0

    goto/16 :goto_0

    .line 757
    :cond_12
    new-instance v17, Ljava/util/TreeMap;

    invoke-direct/range {v17 .. v17}, Ljava/util/TreeMap;-><init>()V

    .line 759
    .local v17, "remappedAttributes":Ljava/util/TreeMap;, "Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz v3, :cond_13

    .line 761
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler$11;->this$0:Lcom/localytics/android/AmpSessionHandler;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler;->mContext:Landroid/content/Context;

    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v16

    .line 762
    .local v16, "packageName":Ljava/lang/String;
    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v19

    invoke-interface/range {v19 .. v19}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    .restart local v12    # "i$":Ljava/util/Iterator;
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_13

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    .line 764
    .restart local v9    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v19, "%s:%s"

    const/16 v20, 0x2

    move/from16 v0, v20

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v20, v0

    const/16 v21, 0x0

    aput-object v16, v20, v21

    const/16 v21, 0x1

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v22

    aput-object v22, v20, v21

    invoke-static/range {v19 .. v20}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v19

    check-cast v19, Ljava/lang/String;

    move-object/from16 v0, v17

    move-object/from16 v1, v20

    move-object/from16 v2, v19

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 768
    .end local v9    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Object;>;"
    .end local v12    # "i$":Ljava/util/Iterator;
    .end local v16    # "packageName":Ljava/lang/String;
    :cond_13
    if-eqz v4, :cond_14

    .line 770
    move-object/from16 v0, p0

    invoke-direct {v0, v15}, Lcom/localytics/android/AmpSessionHandler$11;->convertDimensionsToAttributes(Ljava/util/List;)Ljava/util/Map;

    move-result-object v19

    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 781
    :cond_14
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler$11;->this$0:Lcom/localytics/android/AmpSessionHandler;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/localytics/android/AmpSessionHandler$11;->this$0:Lcom/localytics/android/AmpSessionHandler;

    move-object/from16 v20, v0

    const/16 v21, 0x3

    const/16 v22, 0x3

    move/from16 v0, v22

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v22, v0

    const/16 v23, 0x0

    aput-object v11, v22, v23

    const/16 v23, 0x1

    aput-object v17, v22, v23

    const/16 v23, 0x2

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v24

    aput-object v24, v22, v23

    invoke-virtual/range {v20 .. v22}, Lcom/localytics/android/AmpSessionHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v20

    invoke-virtual/range {v19 .. v20}, Lcom/localytics/android/AmpSessionHandler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_1
.end method
