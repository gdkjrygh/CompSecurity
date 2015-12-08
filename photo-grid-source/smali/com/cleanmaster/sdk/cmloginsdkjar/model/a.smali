.class final Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractList",
        "<TT;>;",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lorg/json/JSONArray;

.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/json/JSONArray;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 651
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 652
    const-string v0, "state"

    invoke-static {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 653
    const-string v0, "itemType"

    invoke-static {p2, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 655
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    .line 656
    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->b:Ljava/lang/Class;

    .line 657
    return-void
.end method

.method private a(I)V
    .locals 1

    .prologue
    .line 765
    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 766
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 768
    :cond_1
    return-void
.end method

.method private a(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 771
    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->getUnderlyingJSONObject(Ljava/lang/Object;)Ljava/lang/Object;
    invoke-static {p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->access$200(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 773
    :try_start_0
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 776
    return-void

    .line 774
    :catch_0
    move-exception v0

    .line 775
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    .prologue
    .line 667
    if-gez p1, :cond_0

    .line 668
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0

    .line 669
    :cond_0
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 670
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Only adding items at the end of the list is supported."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 673
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a(ILjava/lang/Object;)V

    .line 674
    return-void
.end method

.method public final castToListOf(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U::",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;",
            ">(",
            "Ljava/lang/Class",
            "<TU;>;)",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList",
            "<TU;>;"
        }
    .end annotation

    .prologue
    .line 725
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->b:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 726
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->b:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 732
    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    invoke-static {v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->createList(Lorg/json/JSONArray;Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObjectList;

    move-result-object p0

    goto :goto_0

    .line 734
    :cond_1
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t cast GraphObjectCollection of non-CmObject type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->b:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkCmObjectException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 746
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 692
    if-nez p1, :cond_1

    .line 701
    :cond_0
    :goto_0
    return v0

    .line 694
    :cond_1
    if-ne p0, p1, :cond_2

    .line 695
    const/4 v0, 0x1

    goto :goto_0

    .line 696
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 700
    check-cast p1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;

    .line 701
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    iget-object v1, p1, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .prologue
    .line 707
    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a(I)V

    .line 709
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    .line 713
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->b:Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject$Factory;->coerceValueToExpectedType(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/reflect/ParameterizedType;)Ljava/lang/Object;

    move-result-object v0

    .line 715
    return-object v0
.end method

.method public final getInnerJSONArray()Lorg/json/JSONArray;
    .locals 1

    .prologue
    .line 741
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 687
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->hashCode()I

    move-result v0

    return v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 751
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 756
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 761
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)TT;"
        }
    .end annotation

    .prologue
    .line 678
    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a(I)V

    .line 680
    invoke-virtual {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 681
    invoke-direct {p0, p1, p2}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a(ILjava/lang/Object;)V

    .line 682
    return-object v0
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 720
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 661
    const-string v0, "CmObjectList{itemType=%s, state=%s}"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->b:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/a;->a:Lorg/json/JSONArray;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
