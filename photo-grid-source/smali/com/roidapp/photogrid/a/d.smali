.class public final Lcom/roidapp/photogrid/a/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field b:Ljava/lang/String;

.field c:Z

.field d:Z

.field e:Z

.field f:Ljava/lang/String;

.field g:Landroid/content/Context;

.field h:Lcom/a/d/a/a;

.field i:Landroid/content/ServiceConnection;

.field j:I

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Lcom/roidapp/photogrid/a/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-boolean v1, p0, Lcom/roidapp/photogrid/a/d;->a:Z

    .line 76
    const-string v0, "IabHelper"

    iput-object v0, p0, Lcom/roidapp/photogrid/a/d;->b:Ljava/lang/String;

    .line 79
    iput-boolean v1, p0, Lcom/roidapp/photogrid/a/d;->c:Z

    .line 82
    iput-boolean v1, p0, Lcom/roidapp/photogrid/a/d;->d:Z

    .line 86
    iput-boolean v1, p0, Lcom/roidapp/photogrid/a/d;->e:Z

    .line 90
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/a/d;->f:Ljava/lang/String;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/a/d;->l:Ljava/lang/String;

    .line 162
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    .line 163
    iput-object p2, p0, Lcom/roidapp/photogrid/a/d;->l:Ljava/lang/String;

    .line 164
    const-string v0, "IAB helper created."

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 165
    return-void
.end method

.method private a(Landroid/os/Bundle;)I
    .locals 4

    .prologue
    .line 818
    if-nez p1, :cond_0

    const/4 v0, -0x1

    .line 825
    :goto_0
    return v0

    .line 819
    :cond_0
    const-string v0, "RESPONSE_CODE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 820
    if-nez v0, :cond_1

    .line 821
    const-string v0, "Bundle with null response code, assuming OK (known issue)"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 822
    const/4 v0, 0x0

    goto :goto_0

    .line 824
    :cond_1
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    .line 825
    :cond_2
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    goto :goto_0

    .line 827
    :cond_3
    const-string v1, "Unexpected type for bundle response code."

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 828
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 829
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected type for bundle response code: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private a(Lcom/roidapp/photogrid/a/n;Ljava/lang/String;)I
    .locals 12

    .prologue
    const/4 v4, 0x0

    .line 866
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Querying owned items, item type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 867
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Package name: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 869
    const/4 v0, 0x0

    move-object v1, v0

    move v0, v4

    .line 872
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Calling getPurchases with continuation token: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 873
    iget-object v2, p0, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    if-nez v2, :cond_1

    .line 874
    const/16 v4, -0x3f0

    .line 925
    :cond_0
    :goto_1
    return v4

    .line 876
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    const/4 v3, 0x3

    iget-object v5, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v3, v5, p2, v1}, Lcom/a/d/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 877
    invoke-direct {p0, v6}, Lcom/roidapp/photogrid/a/d;->a(Landroid/os/Bundle;)I

    move-result v1

    .line 878
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Owned items response: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 879
    if-eqz v1, :cond_2

    .line 880
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "getPurchases() failed: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/roidapp/photogrid/a/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    move v4, v1

    .line 881
    goto :goto_1

    .line 883
    :cond_2
    const-string v1, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 886
    :cond_3
    const-string v0, "Bundle returned from getPurchases() doesn\'t contain required fields."

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 887
    const/16 v4, -0x3ea

    goto :goto_1

    .line 890
    :cond_4
    const-string v1, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    .line 892
    const-string v1, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v8

    .line 894
    const-string v1, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v6, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    move v3, v4

    move v5, v0

    .line 897
    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_7

    .line 898
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 899
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 900
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 901
    iget-object v10, p0, Lcom/roidapp/photogrid/a/d;->l:Ljava/lang/String;

    invoke-static {v10, v0, v1}, Lcom/roidapp/photogrid/a/p;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 902
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Sku is owned: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 903
    new-instance v2, Lcom/roidapp/photogrid/a/o;

    invoke-direct {v2, p2, v0, v1}, Lcom/roidapp/photogrid/a/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2057
    iget-object v1, v2, Lcom/roidapp/photogrid/a/o;->h:Ljava/lang/String;

    .line 905
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 906
    const-string v1, "BUG: empty/null token!"

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->e(Ljava/lang/String;)V

    .line 907
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v10, "Purchase data: "

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 2089
    :cond_5
    iget-object v0, p1, Lcom/roidapp/photogrid/a/n;->b:Ljava/util/Map;

    .line 3053
    iget-object v1, v2, Lcom/roidapp/photogrid/a/o;->d:Ljava/lang/String;

    .line 2089
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v5

    .line 897
    :goto_3
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    move v5, v1

    goto :goto_2

    .line 914
    :cond_6
    const-string v2, "Purchase signature verification **FAILED**. Not adding item."

    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/a/d;->e(Ljava/lang/String;)V

    .line 915
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "   Purchase data: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 916
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "   Signature: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 917
    const/4 v1, 0x1

    goto :goto_3

    .line 921
    :cond_7
    const-string v0, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 922
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Continuation token: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 923
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 925
    if-eqz v5, :cond_0

    const/16 v4, -0x3eb

    goto/16 :goto_1

    :cond_8
    move-object v1, v0

    move v0, v5

    goto/16 :goto_0
.end method

.method private a(Ljava/lang/String;Lcom/roidapp/photogrid/a/n;Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/photogrid/a/n;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 930
    const-string v0, "Querying SKU details."

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 931
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 932
    invoke-virtual {p2, p1}, Lcom/roidapp/photogrid/a/n;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 933
    if-eqz p3, :cond_0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 935
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 936
    const-string v0, "queryPrices: nothing to do because there are no SKUs."

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    move v0, v1

    .line 965
    :goto_0
    return v0

    .line 940
    :cond_1
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 941
    const-string v3, "ITEM_ID_LIST"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 942
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4, p1, v2}, Lcom/a/d/a/a;->a(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    .line 945
    const-string v2, "DETAILS_LIST"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 946
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Landroid/os/Bundle;)I

    move-result v0

    .line 947
    if-eqz v0, :cond_2

    .line 948
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getSkuDetails() failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/photogrid/a/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 952
    :cond_2
    const-string v0, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 953
    const/16 v0, -0x3ea

    goto :goto_0

    .line 957
    :cond_3
    const-string v2, "DETAILS_LIST"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 960
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 961
    new-instance v3, Lcom/roidapp/photogrid/a/q;

    invoke-direct {v3, p1, v0}, Lcom/roidapp/photogrid/a/q;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 962
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "Got sku details: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 3085
    iget-object v0, p2, Lcom/roidapp/photogrid/a/n;->a:Ljava/util/Map;

    .line 4048
    iget-object v4, v3, Lcom/roidapp/photogrid/a/q;->b:Ljava/lang/String;

    .line 3085
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    move v0, v1

    .line 965
    goto :goto_0
.end method

.method public static a(I)Ljava/lang/String;
    .locals 3

    .prologue
    .line 781
    const-string v0, "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned"

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 785
    const-string v1, "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt"

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 796
    const/16 v2, -0x3e8

    if-gt p0, v2, :cond_1

    .line 797
    rsub-int v0, p0, -0x3e8

    .line 798
    if-ltz v0, :cond_0

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v0, v1, v0

    .line 804
    :goto_0
    return-object v0

    .line 799
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":Unknown IAB Helper Error"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 801
    :cond_1
    if-ltz p0, :cond_2

    array-length v1, v0

    if-lt p0, v1, :cond_3

    .line 802
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":Unknown"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 804
    :cond_3
    aget-object v0, v0, p0

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 810
    iget-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->c:Z

    if-nez v0, :cond_0

    .line 811
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Illegal state for operation ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "): IAB helper is not set up."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 812
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "IAB helper is not set up. Can\'t perform operation: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 814
    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 850
    iget-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->e:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t start async operation ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") because another async operation("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/a/d;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") is in progress."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 852
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/a/d;->f:Ljava/lang/String;

    .line 853
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->e:Z

    .line 854
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Starting async operation: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 855
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1011
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "In-app billing error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1012
    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 1015
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "In-app billing warning: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1016
    return-void
.end method


# virtual methods
.method public final a(ZLjava/util/List;)Lcom/roidapp/photogrid/a/n;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/roidapp/photogrid/a/n;"
        }
    .end annotation

    .prologue
    .line 575
    :try_start_0
    const-string v0, "queryInventory"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->b(Ljava/lang/String;)V

    .line 576
    new-instance v0, Lcom/roidapp/photogrid/a/n;

    invoke-direct {v0}, Lcom/roidapp/photogrid/a/n;-><init>()V

    .line 577
    const-string v1, "inapp"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Lcom/roidapp/photogrid/a/n;Ljava/lang/String;)I

    move-result v1

    .line 578
    if-eqz v1, :cond_0

    .line 579
    new-instance v0, Lcom/roidapp/photogrid/a/c;

    const-string v2, "Error refreshing inventory (querying owned items)."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/c;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2

    .line 605
    :catch_0
    move-exception v0

    .line 606
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 607
    new-instance v1, Lcom/roidapp/photogrid/a/c;

    const/16 v2, -0x3e9

    const-string v3, "Remote exception while refreshing inventory."

    invoke-direct {v1, v2, v3, v0}, Lcom/roidapp/photogrid/a/c;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 582
    :cond_0
    if-eqz p1, :cond_1

    .line 583
    :try_start_1
    const-string v1, "inapp"

    invoke-direct {p0, v1, v0, p2}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;Lcom/roidapp/photogrid/a/n;Ljava/util/List;)I

    move-result v1

    .line 584
    if-eqz v1, :cond_1

    .line 585
    new-instance v0, Lcom/roidapp/photogrid/a/c;

    const-string v2, "Error refreshing inventory (querying prices of items)."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/c;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2

    .line 608
    :catch_1
    move-exception v0

    .line 609
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 610
    new-instance v1, Lcom/roidapp/photogrid/a/c;

    const/16 v2, -0x3ea

    const-string v3, "Error parsing JSON response while refreshing inventory."

    invoke-direct {v1, v2, v3, v0}, Lcom/roidapp/photogrid/a/c;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    throw v1

    .line 590
    :cond_1
    :try_start_2
    iget-boolean v1, p0, Lcom/roidapp/photogrid/a/d;->d:Z

    if-eqz v1, :cond_3

    .line 591
    const-string v1, "subs"

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Lcom/roidapp/photogrid/a/n;Ljava/lang/String;)I

    move-result v1

    .line 592
    if-eqz v1, :cond_2

    .line 593
    new-instance v0, Lcom/roidapp/photogrid/a/c;

    const-string v2, "Error refreshing inventory (querying owned subscriptions)."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/c;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 612
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    .line 613
    new-instance v0, Lcom/roidapp/photogrid/a/c;

    const/16 v1, -0x3f0

    const-string v2, "Error refreshing inventory (querying prices of subscriptions)."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/c;-><init>(ILjava/lang/String;)V

    throw v0

    .line 596
    :cond_2
    if-eqz p1, :cond_3

    .line 597
    :try_start_3
    const-string v1, "subs"

    invoke-direct {p0, v1, v0, p2}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;Lcom/roidapp/photogrid/a/n;Ljava/util/List;)I

    move-result v1

    .line 598
    if-eqz v1, :cond_3

    .line 599
    new-instance v0, Lcom/roidapp/photogrid/a/c;

    const-string v2, "Error refreshing inventory (querying prices of subscriptions)."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/c;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_2

    .line 604
    :cond_3
    return-object v0
.end method

.method public final a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 314
    const-string v0, "Disposing."

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 315
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->c:Z

    .line 316
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->i:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_1

    .line 317
    const-string v0, "Unbinding from service."

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 320
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->i:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 325
    :cond_0
    :goto_0
    iput-object v2, p0, Lcom/roidapp/photogrid/a/d;->i:Landroid/content/ServiceConnection;

    .line 326
    iput-object v2, p0, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    .line 327
    iput-object v2, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    .line 329
    :cond_1
    return-void

    .line 322
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ILcom/roidapp/photogrid/a/i;Ljava/lang/String;)V
    .locals 9

    .prologue
    const/16 v8, -0x3e9

    const/4 v7, 0x0

    .line 399
    iget-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->c:Z

    if-nez v0, :cond_0

    .line 400
    const-string v0, "Illegal state for operation (launchPurchaseFlow): IAB helper is not set up."

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 401
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const-string v1, "IAB helper is not set up."

    invoke-direct {v0, v8, v1}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 402
    invoke-interface {p5, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    .line 457
    :goto_0
    return-void

    .line 407
    :cond_0
    :try_start_0
    const-string v0, "launchPurchaseFlow"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    const-string v0, "subs"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->d:Z

    if-nez v0, :cond_1

    .line 415
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const/16 v1, -0x3f1

    const-string v2, "Subscriptions are not available."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 417
    invoke-interface {p5, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    goto :goto_0

    .line 409
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_0

    .line 422
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Constructing buy intent for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", item type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 423
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    move-object v3, p2

    move-object v4, p3

    move-object v5, p6

    invoke-interface/range {v0 .. v5}, Lcom/a/d/a/a;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 424
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Landroid/os/Bundle;)I

    move-result v1

    .line 425
    if-eqz v1, :cond_2

    .line 426
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Unable to buy item, Error response: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/roidapp/photogrid/a/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 428
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const-string v2, "Unable to buy item"

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 429
    const/4 v1, 0x0

    invoke-interface {p5, v0, v1}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V
    :try_end_1
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 443
    :catch_1
    move-exception v0

    .line 444
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SendIntentException while launching purchase flow for sku "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 445
    invoke-virtual {v0}, Landroid/content/IntentSender$SendIntentException;->printStackTrace()V

    .line 447
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const/16 v1, -0x3ec

    const-string v2, "Failed to send intent."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 448
    invoke-interface {p5, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    goto/16 :goto_0

    .line 433
    :cond_2
    :try_start_2
    const-string v1, "BUY_INTENT"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    .line 434
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Launching buy intent for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ". Request code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 435
    iput p4, p0, Lcom/roidapp/photogrid/a/d;->j:I

    .line 436
    iput-object p5, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    .line 437
    iput-object p3, p0, Lcom/roidapp/photogrid/a/d;->k:Ljava/lang/String;

    .line 438
    invoke-virtual {v0}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v1

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v0, p1

    move v2, p4

    invoke-virtual/range {v0 .. v6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    :try_end_2
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    .line 450
    :catch_2
    move-exception v0

    .line 451
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RemoteException while launching purchase flow for sku "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 452
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 454
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const-string v1, "Remote exception while starting purchase flow"

    invoke-direct {v0, v8, v1}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 455
    invoke-interface {p5, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    goto/16 :goto_0
.end method

.method public final a(Lcom/roidapp/photogrid/a/j;)V
    .locals 4

    .prologue
    .line 201
    iget-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "IAB helper is already set up."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 204
    :cond_0
    const-string v0, "Starting in-app billing setup."

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 205
    new-instance v0, Lcom/roidapp/photogrid/a/e;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/a/e;-><init>(Lcom/roidapp/photogrid/a/d;Lcom/roidapp/photogrid/a/j;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/a/d;->i:Landroid/content/ServiceConnection;

    .line 282
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 283
    const-string v0, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 285
    const-string v0, "com.android.vending"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 287
    const/4 v0, 0x0

    .line 289
    iget-object v2, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 290
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 293
    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 295
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->g:Landroid/content/Context;

    iget-object v2, p0, Lcom/roidapp/photogrid/a/d;->i:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 305
    :goto_0
    return-void

    .line 300
    :cond_2
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const/4 v1, 0x3

    const-string v2, "Billing service unavailable on device."

    invoke-direct {v0, v1, v2}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/roidapp/photogrid/a/j;->a(Lcom/roidapp/photogrid/a/l;)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/photogrid/a/k;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/photogrid/a/k;",
            ")V"
        }
    .end annotation

    .prologue
    .line 644
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 645
    const-string v1, "queryInventory"

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->b(Ljava/lang/String;)V

    .line 646
    const-string v1, "refresh inventory"

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->c(Ljava/lang/String;)V

    .line 647
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/a/g;

    invoke-direct {v2, p0, v0, p1}, Lcom/roidapp/photogrid/a/g;-><init>(Lcom/roidapp/photogrid/a/d;Landroid/os/Handler;Lcom/roidapp/photogrid/a/k;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 669
    return-void
.end method

.method final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1007
    iget-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1008
    :cond_0
    return-void
.end method

.method public final a(IILandroid/content/Intent;)Z
    .locals 9

    .prologue
    const/4 v6, -0x1

    const/16 v8, -0x3ea

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v7, 0x0

    .line 474
    iget v0, p0, Lcom/roidapp/photogrid/a/d;->j:I

    if-eq p1, v0, :cond_0

    .line 552
    :goto_0
    return v1

    .line 476
    :cond_0
    const-string v0, "handleActivityResult"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->b(Ljava/lang/String;)V

    .line 479
    invoke-virtual {p0}, Lcom/roidapp/photogrid/a/d;->b()V

    .line 481
    if-nez p3, :cond_2

    .line 482
    const-string v0, "Null data in IAB activity result."

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 483
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const-string v1, "Null data in IAB result"

    invoke-direct {v0, v8, v1}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 484
    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    invoke-interface {v1, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    :cond_1
    move v1, v2

    .line 485
    goto :goto_0

    .line 1835
    :cond_2
    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v3, "RESPONSE_CODE"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 1836
    if-nez v0, :cond_5

    .line 1837
    const-string v0, "Intent with no response code, assuming OK (known issue)"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    move v0, v1

    .line 489
    :goto_1
    const-string v3, "INAPP_PURCHASE_DATA"

    invoke-virtual {p3, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 490
    const-string v4, "INAPP_DATA_SIGNATURE"

    invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 492
    if-ne p2, v6, :cond_d

    if-nez v0, :cond_d

    .line 493
    const-string v0, "Successful resultcode from purchase activity."

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Purchase data: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 495
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Data signature: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 496
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Extras: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 497
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Expected item type: "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/roidapp/photogrid/a/d;->k:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 499
    if-eqz v3, :cond_3

    if-nez v4, :cond_8

    .line 500
    :cond_3
    const-string v0, "BUG: either purchaseData or dataSignature is null."

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 501
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Extras: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 502
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const/16 v1, -0x3f0

    const-string v3, "IAB returned null purchaseData or dataSignature"

    invoke-direct {v0, v1, v3}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 503
    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    invoke-interface {v1, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    :cond_4
    move v1, v2

    .line 504
    goto/16 :goto_0

    .line 1840
    :cond_5
    instance-of v3, v0, Ljava/lang/Integer;

    if-eqz v3, :cond_6

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto/16 :goto_1

    .line 1841
    :cond_6
    instance-of v3, v0, Ljava/lang/Long;

    if-eqz v3, :cond_7

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    long-to-int v0, v4

    goto/16 :goto_1

    .line 1843
    :cond_7
    const-string v1, "Unexpected type for intent response code."

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 1844
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 1845
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected type for intent response code: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 509
    :cond_8
    :try_start_0
    new-instance v0, Lcom/roidapp/photogrid/a/o;

    iget-object v5, p0, Lcom/roidapp/photogrid/a/d;->k:Ljava/lang/String;

    invoke-direct {v0, v5, v3, v4}, Lcom/roidapp/photogrid/a/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2053
    iget-object v5, v0, Lcom/roidapp/photogrid/a/o;->d:Ljava/lang/String;

    .line 513
    iget-object v6, p0, Lcom/roidapp/photogrid/a/d;->l:Ljava/lang/String;

    invoke-static {v6, v3, v4}, Lcom/roidapp/photogrid/a/p;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 514
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Purchase signature verification FAILED for sku "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 515
    new-instance v1, Lcom/roidapp/photogrid/a/l;

    const/16 v3, -0x3eb

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Signature verification failed for sku "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 516
    iget-object v3, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v3, :cond_9

    iget-object v3, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    invoke-interface {v3, v1, v0}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    :cond_9
    move v1, v2

    .line 517
    goto/16 :goto_0

    .line 519
    :cond_a
    const-string v3, "Purchase signature successfully verified."

    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 529
    iget-object v3, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v3, :cond_b

    .line 530
    iget-object v3, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    new-instance v4, Lcom/roidapp/photogrid/a/l;

    const-string v5, "Success"

    invoke-direct {v4, v1, v5}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    invoke-interface {v3, v4, v0}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    :cond_b
    :goto_2
    move v1, v2

    .line 552
    goto/16 :goto_0

    .line 521
    :catch_0
    move-exception v0

    .line 522
    const-string v1, "Failed to parse purchase data."

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 523
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 524
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const-string v1, "Failed to parse purchase data."

    invoke-direct {v0, v8, v1}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 525
    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    invoke-interface {v1, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    :cond_c
    move v1, v2

    .line 526
    goto/16 :goto_0

    .line 533
    :cond_d
    if-ne p2, v6, :cond_e

    .line 535
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Result code was OK but in-app billing response was not OK: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/photogrid/a/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 536
    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v1, :cond_b

    .line 537
    new-instance v1, Lcom/roidapp/photogrid/a/l;

    const-string v3, "Problem purchashing item."

    invoke-direct {v1, v0, v3}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 538
    iget-object v0, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    invoke-interface {v0, v1, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    goto :goto_2

    .line 541
    :cond_e
    if-nez p2, :cond_f

    .line 542
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Purchase canceled - Response: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roidapp/photogrid/a/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 543
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const/16 v1, -0x3ed

    const-string v3, "User canceled."

    invoke-direct {v0, v1, v3}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 544
    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    invoke-interface {v1, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    goto :goto_2

    .line 547
    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Purchase failed. Result code: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ". Response: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Lcom/roidapp/photogrid/a/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/a/d;->d(Ljava/lang/String;)V

    .line 549
    new-instance v0, Lcom/roidapp/photogrid/a/l;

    const/16 v1, -0x3ee

    const-string v3, "Unknown purchase response."

    invoke-direct {v0, v1, v3}, Lcom/roidapp/photogrid/a/l;-><init>(ILjava/lang/String;)V

    .line 550
    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->m:Lcom/roidapp/photogrid/a/i;

    invoke-interface {v1, v0, v7}, Lcom/roidapp/photogrid/a/i;->a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V

    goto/16 :goto_2
.end method

.method final b()V
    .locals 2

    .prologue
    .line 858
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ending async operation: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/a/d;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 859
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/a/d;->f:Ljava/lang/String;

    .line 860
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/a/d;->e:Z

    .line 861
    return-void
.end method
