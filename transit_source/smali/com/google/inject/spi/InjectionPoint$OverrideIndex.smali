.class Lcom/google/inject/spi/InjectionPoint$OverrideIndex;
.super Ljava/lang/Object;
.source "InjectionPoint.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/spi/InjectionPoint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OverrideIndex"
.end annotation


# instance fields
.field bySignature:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/inject/spi/InjectionPoint$Signature;",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/InjectionPoint$InjectableMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field final injectableMembers:Lcom/google/inject/spi/InjectionPoint$InjectableMembers;

.field lastMethod:Ljava/lang/reflect/Method;

.field lastSignature:Lcom/google/inject/spi/InjectionPoint$Signature;

.field position:Lcom/google/inject/spi/InjectionPoint$Position;


# direct methods
.method constructor <init>(Lcom/google/inject/spi/InjectionPoint$InjectableMembers;)V
    .locals 1
    .param p1, "injectableMembers"    # Lcom/google/inject/spi/InjectionPoint$InjectableMembers;

    .prologue
    .line 523
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 521
    sget-object v0, Lcom/google/inject/spi/InjectionPoint$Position;->TOP:Lcom/google/inject/spi/InjectionPoint$Position;

    iput-object v0, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->position:Lcom/google/inject/spi/InjectionPoint$Position;

    .line 524
    iput-object p1, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->injectableMembers:Lcom/google/inject/spi/InjectionPoint$InjectableMembers;

    .line 525
    return-void
.end method


# virtual methods
.method add(Lcom/google/inject/spi/InjectionPoint$InjectableMethod;)V
    .locals 4
    .param p1, "injectableMethod"    # Lcom/google/inject/spi/InjectionPoint$InjectableMethod;

    .prologue
    .line 602
    iget-object v2, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->injectableMembers:Lcom/google/inject/spi/InjectionPoint$InjectableMembers;

    invoke-virtual {v2, p1}, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;->add(Lcom/google/inject/spi/InjectionPoint$InjectableMember;)V

    .line 603
    iget-object v2, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->position:Lcom/google/inject/spi/InjectionPoint$Position;

    sget-object v3, Lcom/google/inject/spi/InjectionPoint$Position;->BOTTOM:Lcom/google/inject/spi/InjectionPoint$Position;

    if-eq v2, v3, :cond_0

    invoke-virtual {p1}, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->isFinal()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 619
    :cond_0
    :goto_0
    return-void

    .line 608
    :cond_1
    iget-object v2, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->bySignature:Ljava/util/Map;

    if-eqz v2, :cond_0

    .line 610
    iget-object v2, p1, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->method:Ljava/lang/reflect/Method;

    iget-object v3, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->lastMethod:Ljava/lang/reflect/Method;

    if-ne v2, v3, :cond_3

    iget-object v1, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->lastSignature:Lcom/google/inject/spi/InjectionPoint$Signature;

    .line 612
    .local v1, "signature":Lcom/google/inject/spi/InjectionPoint$Signature;
    :goto_1
    iget-object v2, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->bySignature:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 613
    .local v0, "methods":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    if-nez v0, :cond_2

    .line 614
    new-instance v0, Ljava/util/ArrayList;

    .end local v0    # "methods":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 615
    .restart local v0    # "methods":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    iget-object v2, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->bySignature:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    :cond_2
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 610
    .end local v0    # "methods":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    .end local v1    # "signature":Lcom/google/inject/spi/InjectionPoint$Signature;
    :cond_3
    new-instance v1, Lcom/google/inject/spi/InjectionPoint$Signature;

    iget-object v2, p1, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->method:Ljava/lang/reflect/Method;

    invoke-direct {v1, v2}, Lcom/google/inject/spi/InjectionPoint$Signature;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_1
.end method

.method removeIfOverriddenBy(Ljava/lang/reflect/Method;ZLcom/google/inject/spi/InjectionPoint$InjectableMethod;)Z
    .locals 12
    .param p1, "method"    # Ljava/lang/reflect/Method;
    .param p2, "alwaysRemove"    # Z
    .param p3, "injectableMethod"    # Lcom/google/inject/spi/InjectionPoint$InjectableMethod;

    .prologue
    const/4 v8, 0x0

    .line 549
    iget-object v9, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->position:Lcom/google/inject/spi/InjectionPoint$Position;

    sget-object v10, Lcom/google/inject/spi/InjectionPoint$Position;->TOP:Lcom/google/inject/spi/InjectionPoint$Position;

    if-ne v9, v10, :cond_1

    move v5, v8

    .line 594
    :cond_0
    return v5

    .line 554
    :cond_1
    iget-object v9, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->bySignature:Ljava/util/Map;

    if-nez v9, :cond_4

    .line 557
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    iput-object v9, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->bySignature:Ljava/util/Map;

    .line 558
    iget-object v9, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->injectableMembers:Lcom/google/inject/spi/InjectionPoint$InjectableMembers;

    iget-object v2, v9, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;->head:Lcom/google/inject/spi/InjectionPoint$InjectableMember;

    .local v2, "member":Lcom/google/inject/spi/InjectionPoint$InjectableMember;
    :goto_0
    if-eqz v2, :cond_4

    .line 560
    instance-of v9, v2, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;

    if-nez v9, :cond_3

    .line 559
    :cond_2
    :goto_1
    iget-object v2, v2, Lcom/google/inject/spi/InjectionPoint$InjectableMember;->next:Lcom/google/inject/spi/InjectionPoint$InjectableMember;

    goto :goto_0

    :cond_3
    move-object v0, v2

    .line 561
    check-cast v0, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;

    .line 562
    .local v0, "im":Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    invoke-virtual {v0}, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->isFinal()Z

    move-result v9

    if-nez v9, :cond_2

    .line 563
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 564
    .local v3, "methods":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 565
    iget-object v9, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->bySignature:Ljava/util/Map;

    new-instance v10, Lcom/google/inject/spi/InjectionPoint$Signature;

    iget-object v11, v0, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->method:Ljava/lang/reflect/Method;

    invoke-direct {v10, v11}, Lcom/google/inject/spi/InjectionPoint$Signature;-><init>(Ljava/lang/reflect/Method;)V

    invoke-interface {v9, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 569
    .end local v0    # "im":Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    .end local v2    # "member":Lcom/google/inject/spi/InjectionPoint$InjectableMember;
    .end local v3    # "methods":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    :cond_4
    iput-object p1, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->lastMethod:Ljava/lang/reflect/Method;

    .line 570
    new-instance v6, Lcom/google/inject/spi/InjectionPoint$Signature;

    invoke-direct {v6, p1}, Lcom/google/inject/spi/InjectionPoint$Signature;-><init>(Ljava/lang/reflect/Method;)V

    iput-object v6, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->lastSignature:Lcom/google/inject/spi/InjectionPoint$Signature;

    .line 571
    .local v6, "signature":Lcom/google/inject/spi/InjectionPoint$Signature;
    iget-object v9, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->bySignature:Ljava/util/Map;

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 572
    .restart local v3    # "methods":Ljava/util/List;, "Ljava/util/List<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    const/4 v5, 0x0

    .line 573
    .local v5, "removed":Z
    if-eqz v3, :cond_0

    .line 574
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 575
    .local v1, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/google/inject/spi/InjectionPoint$InjectableMethod;>;"
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 576
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;

    .line 577
    .local v4, "possiblyOverridden":Lcom/google/inject/spi/InjectionPoint$InjectableMethod;
    iget-object v9, v4, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->method:Ljava/lang/reflect/Method;

    # invokes: Lcom/google/inject/spi/InjectionPoint;->overrides(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z
    invoke-static {p1, v9}, Lcom/google/inject/spi/InjectionPoint;->access$000(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 578
    iget-boolean v9, v4, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->jsr330:Z

    if-eqz v9, :cond_6

    iget-boolean v9, v4, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->overrodeGuiceInject:Z

    if-eqz v9, :cond_9

    :cond_6
    const/4 v7, 0x1

    .line 580
    .local v7, "wasGuiceInject":Z
    :goto_3
    if-eqz p3, :cond_7

    .line 581
    iput-boolean v7, p3, Lcom/google/inject/spi/InjectionPoint$InjectableMethod;->overrodeGuiceInject:Z

    .line 586
    :cond_7
    if-nez p2, :cond_8

    if-nez v7, :cond_5

    .line 587
    :cond_8
    const/4 v5, 0x1

    .line 588
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 589
    iget-object v9, p0, Lcom/google/inject/spi/InjectionPoint$OverrideIndex;->injectableMembers:Lcom/google/inject/spi/InjectionPoint$InjectableMembers;

    invoke-virtual {v9, v4}, Lcom/google/inject/spi/InjectionPoint$InjectableMembers;->remove(Lcom/google/inject/spi/InjectionPoint$InjectableMember;)V

    goto :goto_2

    .end local v7    # "wasGuiceInject":Z
    :cond_9
    move v7, v8

    .line 578
    goto :goto_3
.end method
