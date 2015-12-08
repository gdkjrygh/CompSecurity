.class abstract Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
.super Lcom/facebook/widget/FacebookDialog$Builder;
.source "FacebookDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/FacebookDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "OpenGraphDialogBuilderBase"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<CONCRETE:",
        "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase",
        "<*>;>",
        "Lcom/facebook/widget/FacebookDialog$Builder",
        "<TCONCRETE;>;"
    }
.end annotation


# instance fields
.field private action:Lcom/facebook/model/OpenGraphAction;

.field private actionType:Ljava/lang/String;

.field private dataErrorsFatal:Z

.field private previewPropertyName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/model/OpenGraphAction;Ljava/lang/String;)V
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "action"    # Lcom/facebook/model/OpenGraphAction;
    .param p3, "previewPropertyName"    # Ljava/lang/String;

    .prologue
    .line 1472
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$Builder;-><init>(Landroid/app/Activity;)V

    .line 1474
    const-string v0, "action"

    invoke-static {p2, v0}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1475
    invoke-interface {p2}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "action.getType()"

    invoke-static {v0, v1}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1476
    const-string v0, "previewPropertyName"

    invoke-static {p3, v0}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1477
    invoke-interface {p2, p3}, Lcom/facebook/model/OpenGraphAction;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1478
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1479
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "A property named \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" was not found on the action.  The name of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1480
    const-string v2, "the preview property must match the name of an action property."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1479
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1478
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1483
    :cond_0
    iput-object p2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    .line 1484
    invoke-interface {p2}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    .line 1485
    iput-object p3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    .line 1486
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/model/OpenGraphAction;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "action"    # Lcom/facebook/model/OpenGraphAction;
    .param p3, "actionType"    # Ljava/lang/String;
    .param p4, "previewPropertyName"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1439
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    invoke-direct {p0, p1}, Lcom/facebook/widget/FacebookDialog$Builder;-><init>(Landroid/app/Activity;)V

    .line 1441
    const-string v1, "action"

    invoke-static {p2, v1}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1442
    const-string v1, "actionType"

    invoke-static {p3, v1}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1443
    const-string v1, "previewPropertyName"

    invoke-static {p4, v1}, Lcom/facebook/internal/Validate;->notNullOrEmpty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1444
    invoke-interface {p2, p4}, Lcom/facebook/model/OpenGraphAction;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 1445
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1446
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "A property named \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" was not found on the action.  The name of "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1447
    const-string v3, "the preview property must match the name of an action property."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1446
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1445
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1449
    :cond_0
    invoke-interface {p2}, Lcom/facebook/model/OpenGraphAction;->getType()Ljava/lang/String;

    move-result-object v0

    .line 1450
    .local v0, "typeOnAction":Ljava/lang/String;
    invoke-static {v0}, Lcom/facebook/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1451
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "\'actionType\' must match the type of \'action\' if it is specified. Consider using OpenGraphDialogBuilderBase(Activity activity, OpenGraphAction action, String previewPropertyName) instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1455
    :cond_1
    iput-object p2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    .line 1456
    iput-object p3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    .line 1457
    iput-object p4, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    .line 1458
    return-void
.end method

.method private flattenChildrenOfGraphObject(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6
    .param p1, "graphObject"    # Lorg/json/JSONObject;

    .prologue
    .line 1819
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1822
    .end local p1    # "graphObject":Lorg/json/JSONObject;
    .local v1, "graphObject":Lorg/json/JSONObject;
    :try_start_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v3

    .line 1823
    .local v3, "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 1834
    return-object v1

    .line 1824
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1826
    .local v2, "key":Ljava/lang/String;
    const-string v5, "image"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1827
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 1829
    .local v4, "object":Ljava/lang/Object;
    invoke-direct {p0, v4}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 1830
    invoke-virtual {v1, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 1835
    .end local v2    # "key":Ljava/lang/String;
    .end local v3    # "keys":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
    .end local v4    # "object":Ljava/lang/Object;
    :catch_0
    move-exception v0

    move-object p1, v1

    .line 1836
    .end local v1    # "graphObject":Lorg/json/JSONObject;
    .local v0, "e":Lorg/json/JSONException;
    .restart local p1    # "graphObject":Lorg/json/JSONObject;
    :goto_1
    new-instance v5, Lcom/facebook/FacebookException;

    invoke-direct {v5, v0}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/Throwable;)V

    throw v5

    .line 1835
    .end local v0    # "e":Lorg/json/JSONException;
    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private flattenObject(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1, "object"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .prologue
    .line 1841
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    if-nez p1, :cond_1

    .line 1842
    const/4 p1, 0x0

    .line 1869
    .end local p1    # "object":Ljava/lang/Object;
    :cond_0
    :goto_0
    return-object p1

    .line 1845
    .restart local p1    # "object":Ljava/lang/Object;
    :cond_1
    instance-of v5, p1, Lorg/json/JSONObject;

    if-eqz v5, :cond_3

    move-object v2, p1

    .line 1846
    check-cast v2, Lorg/json/JSONObject;

    .line 1849
    .local v2, "jsonObject":Lorg/json/JSONObject;
    const-string v5, "fbsdk:create_object"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1852
    const-string v5, "id"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1853
    const-string v5, "id"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1854
    :cond_2
    const-string v5, "url"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1855
    const-string v5, "url"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1857
    .end local v2    # "jsonObject":Lorg/json/JSONObject;
    :cond_3
    instance-of v5, p1, Lorg/json/JSONArray;

    if-eqz v5, :cond_0

    move-object v1, p1

    .line 1858
    check-cast v1, Lorg/json/JSONArray;

    .line 1859
    .local v1, "jsonArray":Lorg/json/JSONArray;
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 1860
    .local v4, "newArray":Lorg/json/JSONArray;
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    .line 1862
    .local v3, "length":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_1
    if-lt v0, v3, :cond_4

    move-object p1, v4

    .line 1866
    goto :goto_0

    .line 1863
    :cond_4
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenObject(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1862
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private updateActionAttachmentUrls(Ljava/util/List;Z)V
    .locals 7
    .param p2, "isUserGenerated"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 1603
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p1, "attachmentUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v4}, Lcom/facebook/model/OpenGraphAction;->getImage()Ljava/util/List;

    move-result-object v0

    .line 1604
    .local v0, "attachments":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    if-nez v0, :cond_0

    .line 1605
    new-instance v0, Ljava/util/ArrayList;

    .end local v0    # "attachments":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1608
    .restart local v0    # "attachments":Ljava/util/List;, "Ljava/util/List<Lorg/json/JSONObject;>;"
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 1620
    iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v4, v0}, Lcom/facebook/model/OpenGraphAction;->setImage(Ljava/util/List;)V

    .line 1621
    return-void

    .line 1608
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1609
    .local v3, "url":Ljava/lang/String;
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 1611
    .local v2, "jsonObject":Lorg/json/JSONObject;
    :try_start_0
    const-string v5, "url"

    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1612
    if-eqz p2, :cond_2

    .line 1613
    const-string v5, "user_generated"

    const/4 v6, 0x1

    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1618
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1615
    :catch_0
    move-exception v1

    .line 1616
    .local v1, "e":Lorg/json/JSONException;
    new-instance v4, Lcom/facebook/FacebookException;

    const-string v5, "Unable to attach images"

    invoke-direct {v4, v5, v1}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
.end method


# virtual methods
.method protected getMethodArguments()Landroid/os/Bundle;
    .locals 5

    .prologue
    .line 1801
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1803
    .local v2, "methodArgs":Landroid/os/Bundle;
    const-string v3, "PREVIEW_PROPERTY_NAME"

    iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    invoke-virtual {p0, v2, v3, v4}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1804
    const-string v3, "ACTION_TYPE"

    iget-object v4, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    invoke-virtual {p0, v2, v3, v4}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1805
    const-string v3, "DATA_FAILURES_FATAL"

    iget-boolean v4, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->dataErrorsFatal:Z

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1807
    iget-object v3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v3}, Lcom/facebook/model/OpenGraphAction;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 1808
    .local v0, "jsonAction":Lorg/json/JSONObject;
    invoke-direct {p0, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenChildrenOfGraphObject(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1810
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1811
    .local v1, "jsonString":Ljava/lang/String;
    const-string v3, "ACTION"

    invoke-virtual {p0, v2, v3, v1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1813
    return-object v2
.end method

.method protected setBundleExtras(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4
    .param p1, "extras"    # Landroid/os/Bundle;

    .prologue
    .line 1786
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    const-string v2, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME"

    iget-object v3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->previewPropertyName:Ljava/lang/String;

    invoke-virtual {p0, p1, v2, v3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1787
    const-string v2, "com.facebook.platform.extra.ACTION_TYPE"

    iget-object v3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->actionType:Ljava/lang/String;

    invoke-virtual {p0, p1, v2, v3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1788
    const-string v2, "com.facebook.platform.extra.DATA_FAILURES_FATAL"

    iget-boolean v3, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->dataErrorsFatal:Z

    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1790
    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    invoke-interface {v2}, Lcom/facebook/model/OpenGraphAction;->getInnerJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 1791
    .local v0, "jsonAction":Lorg/json/JSONObject;
    invoke-direct {p0, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->flattenChildrenOfGraphObject(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    .line 1793
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1794
    .local v1, "jsonString":Ljava/lang/String;
    const-string v2, "com.facebook.platform.extra.ACTION"

    invoke-virtual {p0, p1, v2, v1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->putExtra(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 1796
    return-object p1
.end method

.method public setDataErrorsFatal(Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .param p1, "dataErrorsFatal"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1496
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    iput-boolean p1, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->dataErrorsFatal:Z

    .line 1498
    move-object v0, p0

    .line 1499
    .local v0, "result":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "TCONCRETE;"
    return-object v0
.end method

.method public setImageAttachmentFilesForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1567
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p1, "bitmapFiles":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentFilesForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 4
    .param p2, "isUserGenerated"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1589
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p1, "bitmapFiles":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    const-string v2, "bitmapFiles"

    invoke-static {p1, v2}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1590
    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v2, :cond_0

    .line 1591
    new-instance v2, Lcom/facebook/FacebookException;

    const-string v3, "Can not set attachments prior to setting action."

    invoke-direct {v2, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1594
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachmentFiles(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1595
    .local v0, "attachmentUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, v0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateActionAttachmentUrls(Ljava/util/List;Z)V

    .line 1598
    move-object v1, p0

    .line 1599
    .local v1, "result":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "TCONCRETE;"
    return-object v1
.end method

.method public setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .param p1, "objectProperty"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1711
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p2, "bitmapFiles":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentFilesForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 4
    .param p1, "objectProperty"    # Ljava/lang/String;
    .param p3, "isUserGenerated"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1740
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p2, "bitmapFiles":Ljava/util/List;, "Ljava/util/List<Ljava/io/File;>;"
    const-string v2, "objectProperty"

    invoke-static {p1, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1741
    const-string v2, "bitmapFiles"

    invoke-static {p2, v2}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1742
    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v2, :cond_0

    .line 1743
    new-instance v2, Lcom/facebook/FacebookException;

    const-string v3, "Can not set attachments prior to setting action."

    invoke-direct {v2, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1746
    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachmentFiles(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1747
    .local v0, "attachmentUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0, p1, v0, p3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateObjectAttachmentUrls(Ljava/lang/String;Ljava/util/List;Z)V

    .line 1750
    move-object v1, p0

    .line 1751
    .local v1, "result":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "TCONCRETE;"
    return-object v1
.end method

.method public setImageAttachmentsForAction(Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1517
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p1, "bitmaps":Ljava/util/List;, "Ljava/util/List<Landroid/graphics/Bitmap;>;"
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentsForAction(Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 4
    .param p2, "isUserGenerated"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1539
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p1, "bitmaps":Ljava/util/List;, "Ljava/util/List<Landroid/graphics/Bitmap;>;"
    const-string v2, "bitmaps"

    invoke-static {p1, v2}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1540
    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v2, :cond_0

    .line 1541
    new-instance v2, Lcom/facebook/FacebookException;

    const-string v3, "Can not set attachments prior to setting action."

    invoke-direct {v2, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1544
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachments(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1545
    .local v0, "attachmentUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-direct {p0, v0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateActionAttachmentUrls(Ljava/util/List;Z)V

    .line 1548
    move-object v1, p0

    .line 1549
    .local v1, "result":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "TCONCRETE;"
    return-object v1
.end method

.method public setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 1
    .param p1, "objectProperty"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1645
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p2, "bitmaps":Ljava/util/List;, "Ljava/util/List<Landroid/graphics/Bitmap;>;"
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;

    move-result-object v0

    return-object v0
.end method

.method public setImageAttachmentsForObject(Ljava/lang/String;Ljava/util/List;Z)Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;
    .locals 4
    .param p1, "objectProperty"    # Ljava/lang/String;
    .param p3, "isUserGenerated"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TCONCRETE;"
        }
    .end annotation

    .prologue
    .line 1675
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p2, "bitmaps":Ljava/util/List;, "Ljava/util/List<Landroid/graphics/Bitmap;>;"
    const-string v2, "objectProperty"

    invoke-static {p1, v2}, Lcom/facebook/internal/Validate;->notNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1676
    const-string v2, "bitmaps"

    invoke-static {p2, v2}, Lcom/facebook/internal/Validate;->containsNoNulls(Ljava/util/Collection;Ljava/lang/String;)V

    .line 1677
    iget-object v2, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    if-nez v2, :cond_0

    .line 1678
    new-instance v2, Lcom/facebook/FacebookException;

    const-string v3, "Can not set attachments prior to setting action."

    invoke-direct {v2, v3}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 1681
    :cond_0
    invoke-virtual {p0, p2}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->addImageAttachments(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 1682
    .local v0, "attachmentUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-virtual {p0, p1, v0, p3}, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->updateObjectAttachmentUrls(Ljava/lang/String;Ljava/util/List;Z)V

    .line 1685
    move-object v1, p0

    .line 1686
    .local v1, "result":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "TCONCRETE;"
    return-object v1
.end method

.method updateObjectAttachmentUrls(Ljava/lang/String;Ljava/util/List;Z)V
    .locals 8
    .param p1, "objectProperty"    # Ljava/lang/String;
    .param p3, "isUserGenerated"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 1757
    .local p0, "this":Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;, "Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase<TCONCRETE;>;"
    .local p2, "attachmentUrls":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :try_start_0
    iget-object v5, p0, Lcom/facebook/widget/FacebookDialog$OpenGraphDialogBuilderBase;->action:Lcom/facebook/model/OpenGraphAction;

    const-class v6, Lcom/facebook/model/OpenGraphObject;

    invoke-interface {v5, p1, v6}, Lcom/facebook/model/OpenGraphAction;->getPropertyAs(Ljava/lang/String;Ljava/lang/Class;)Lcom/facebook/model/GraphObject;

    move-result-object v3

    check-cast v3, Lcom/facebook/model/OpenGraphObject;

    .line 1758
    .local v3, "object":Lcom/facebook/model/OpenGraphObject;
    if-nez v3, :cond_0

    .line 1759
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Action does not contain a property \'"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\'"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_0
    .catch Lcom/facebook/FacebookGraphObjectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1761
    .end local v3    # "object":Lcom/facebook/model/OpenGraphObject;
    :catch_0
    move-exception v1

    .line 1762
    .local v1, "exception":Lcom/facebook/FacebookGraphObjectException;
    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Property \'"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\' is not a graph object"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 1764
    .end local v1    # "exception":Lcom/facebook/FacebookGraphObjectException;
    .restart local v3    # "object":Lcom/facebook/model/OpenGraphObject;
    :cond_0
    invoke-interface {v3}, Lcom/facebook/model/OpenGraphObject;->getCreateObject()Z

    move-result v5

    if-nez v5, :cond_1

    .line 1765
    new-instance v5, Ljava/lang/IllegalArgumentException;

    .line 1766
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "The Open Graph object in \'"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\' is not marked for creation"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1765
    invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 1769
    :cond_1
    invoke-interface {v3}, Lcom/facebook/model/OpenGraphObject;->getImage()Lcom/facebook/model/GraphObjectList;

    move-result-object v0

    .line 1770
    .local v0, "attachments":Lcom/facebook/model/GraphObjectList;, "Lcom/facebook/model/GraphObjectList<Lcom/facebook/model/GraphObject;>;"
    if-nez v0, :cond_2

    .line 1771
    const-class v5, Lcom/facebook/model/GraphObject;

    invoke-static {v5}, Lcom/facebook/model/GraphObject$Factory;->createList(Ljava/lang/Class;)Lcom/facebook/model/GraphObjectList;

    move-result-object v0

    .line 1773
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_3

    .line 1781
    invoke-interface {v3, v0}, Lcom/facebook/model/OpenGraphObject;->setImage(Lcom/facebook/model/GraphObjectList;)V

    .line 1782
    return-void

    .line 1773
    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1774
    .local v4, "url":Ljava/lang/String;
    invoke-static {}, Lcom/facebook/model/GraphObject$Factory;->create()Lcom/facebook/model/GraphObject;

    move-result-object v2

    .line 1775
    .local v2, "graphObject":Lcom/facebook/model/GraphObject;
    const-string v6, "url"

    invoke-interface {v2, v6, v4}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1776
    if-eqz p3, :cond_4

    .line 1777
    const-string v6, "user_generated"

    const/4 v7, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v2, v6, v7}, Lcom/facebook/model/GraphObject;->setProperty(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1779
    :cond_4
    invoke-interface {v0, v2}, Lcom/facebook/model/GraphObjectList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method
