.class Lcom/localytics/android/SessionHandler$4;
.super Ljava/lang/Object;
.source "SessionHandler.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/SessionHandler;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/localytics/android/SessionHandler;

.field final synthetic val$attributes:Ljava/util/Map;

.field final synthetic val$clv:Ljava/lang/Long;

.field final synthetic val$event:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/localytics/android/SessionHandler;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 482
    iput-object p1, p0, Lcom/localytics/android/SessionHandler$4;->this$0:Lcom/localytics/android/SessionHandler;

    iput-object p2, p0, Lcom/localytics/android/SessionHandler$4;->val$event:Ljava/lang/String;

    iput-object p3, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    iput-object p4, p0, Lcom/localytics/android/SessionHandler$4;->val$clv:Ljava/lang/Long;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 485
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v1, v1, Lcom/localytics/android/SessionHandler;->mProvider:Lcom/localytics/android/LocalyticsProvider;

    invoke-static {v1}, Lcom/localytics/android/SessionHandler;->getOpenSessionId(Lcom/localytics/android/LocalyticsProvider;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 487
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$event:Ljava/lang/String;

    iget-object v3, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    iget-object v4, p0, Lcom/localytics/android/SessionHandler$4;->val$clv:Ljava/lang/Long;

    invoke-virtual {v1, v2, v3, v4}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V

    .line 561
    :goto_0
    return-void

    .line 495
    :cond_0
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    if-nez v1, :cond_2

    .line 497
    const/4 v0, 0x0

    .line 557
    .local v0, "openCloseAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->this$0:Lcom/localytics/android/SessionHandler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Lcom/localytics/android/SessionHandler;->open(ZLjava/util/Map;)V

    .line 558
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->this$0:Lcom/localytics/android/SessionHandler;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$event:Ljava/lang/String;

    iget-object v3, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    iget-object v4, p0, Lcom/localytics/android/SessionHandler$4;->val$clv:Ljava/lang/Long;

    invoke-virtual {v1, v2, v3, v4}, Lcom/localytics/android/SessionHandler;->tagEvent(Ljava/lang/String;Ljava/util/Map;Ljava/lang/Long;)V

    .line 559
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->this$0:Lcom/localytics/android/SessionHandler;

    invoke-virtual {v1, v0}, Lcom/localytics/android/SessionHandler;->close(Ljava/util/Map;)V

    goto :goto_0

    .line 499
    .end local v0    # "openCloseAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_2
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 510
    :cond_3
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 511
    .restart local v0    # "openCloseAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 513
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_1:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    :cond_4
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 517
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_2:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    :cond_5
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 521
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_3:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    :cond_6
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 525
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_4:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    :cond_7
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 529
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_5:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    :cond_8
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 533
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_6:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    :cond_9
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 537
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_7:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 539
    :cond_a
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 541
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_8:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    :cond_b
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 545
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_9:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    :cond_c
    iget-object v1, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v2, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 549
    sget-object v1, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    iget-object v2, p0, Lcom/localytics/android/SessionHandler$4;->val$attributes:Ljava/util/Map;

    sget-object v3, Lcom/localytics/android/LocalyticsProvider$AttributesDbColumns;->ATTRIBUTE_CUSTOM_DIMENSION_10:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 554
    .end local v0    # "openCloseAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_d
    const/4 v0, 0x0

    .restart local v0    # "openCloseAttributes":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    goto/16 :goto_1
.end method
