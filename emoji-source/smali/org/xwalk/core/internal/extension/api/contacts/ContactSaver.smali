.class public Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;
.super Ljava/lang/Object;
.source "ContactSaver.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ContactSaver"


# instance fields
.field private mContact:Lorg/json/JSONObject;

.field private mId:Ljava/lang/String;

.field private mIsUpdate:Z

.field private mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

.field private mOps:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/ContentProviderOperation;",
            ">;"
        }
    .end annotation
.end field

.field private mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 1
    .param p1, "resolver"    # Landroid/content/ContentResolver;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    invoke-direct {v0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    .line 48
    return-void
.end method

.method private PutToContact(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 200
    if-nez p1, :cond_0

    .line 206
    :goto_0
    return-void

    .line 202
    :cond_0
    :try_start_0
    iget-object v1, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 203
    :catch_0
    move-exception v0

    .line 204
    .local v0, "e":Lorg/json/JSONException;
    const-string v1, "ContactSaver"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to set "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " for contact"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private buildByArray(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .param p1, "mimeType"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 156
    .local p3, "dataEntries":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-boolean v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mIsUpdate:Z

    if-eqz v3, :cond_0

    .line 157
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    invoke-virtual {v3, v4, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->cleanByMimeType(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 160
    .local v1, "entry":Ljava/lang/String;
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newInsertContactOrFieldBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 161
    .local v0, "builder":Landroid/content/ContentProviderOperation$Builder;
    if-nez v0, :cond_2

    .line 165
    .end local v0    # "builder":Landroid/content/ContentProviderOperation$Builder;
    .end local v1    # "entry":Ljava/lang/String;
    :cond_1
    return-void

    .line 162
    .restart local v0    # "builder":Landroid/content/ContentProviderOperation$Builder;
    .restart local v1    # "entry":Ljava/lang/String;
    :cond_2
    invoke-virtual {v0, p2, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 163
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private buildByArray(Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;)V
    .locals 17
    .param p1, "contactMap"    # Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    .prologue
    .line 94
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    move-object/from16 v0, p1

    iget-object v15, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mName:Ljava/lang/String;

    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_1

    .line 152
    :cond_0
    :goto_0
    return-void

    .line 110
    :cond_1
    move-object/from16 v0, p0

    iget-boolean v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mIsUpdate:Z

    if-eqz v14, :cond_2

    .line 111
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    move-object/from16 v0, p0

    iget-object v15, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v0, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mMimeType:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v14 .. v16}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->cleanByMimeType(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    :cond_2
    :try_start_0
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    move-object/from16 v0, p1

    iget-object v15, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mName:Ljava/lang/String;

    invoke-virtual {v14, v15}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 115
    .local v5, "fields":Lorg/json/JSONArray;
    const/4 v6, 0x0

    .local v6, "i":I
    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-ge v6, v14, :cond_0

    .line 116
    new-instance v9, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v14

    invoke-direct {v9, v14}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;-><init>(Lorg/json/JSONObject;)V

    .line 117
    .local v9, "json":Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;
    const-string v14, "types"

    invoke-virtual {v9, v14}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getStringArray(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    .line 118
    .local v12, "typeList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    if-eqz v12, :cond_8

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-nez v14, :cond_8

    .line 120
    const/4 v14, 0x0

    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 121
    .local v11, "type":Ljava/lang/String;
    move-object/from16 v0, p1

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mTypeValueMap:Ljava/util/Map;

    invoke-interface {v14, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    .line 123
    .local v8, "iType":Ljava/lang/Integer;
    move-object/from16 v0, p1

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mMimeType:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newInsertContactOrFieldBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v1

    .line 124
    .local v1, "builder":Landroid/content/ContentProviderOperation$Builder;
    if-eqz v1, :cond_0

    .line 126
    const-string v14, "preferred"

    invoke-virtual {v9, v14}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getBoolean(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 127
    move-object/from16 v0, p1

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mTypeMap:Ljava/util/Map;

    const-string v15, "isPrimary"

    invoke-interface {v14, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    const/4 v15, 0x1

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v1, v14, v15}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 128
    move-object/from16 v0, p1

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mTypeMap:Ljava/util/Map;

    const-string v15, "isSuperPrimary"

    invoke-interface {v14, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    const/4 v15, 0x1

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v1, v14, v15}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 130
    :cond_3
    if-eqz v8, :cond_4

    .line 131
    move-object/from16 v0, p1

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mTypeMap:Ljava/util/Map;

    const-string v15, "type"

    invoke-interface {v14, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v1, v14, v8}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 133
    :cond_4
    move-object/from16 v0, p1

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mDataMap:Ljava/util/Map;

    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .local v7, "i$":Ljava/util/Iterator;
    :cond_5
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 134
    .local v4, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v9, v14}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 135
    .local v13, "value":Ljava/lang/String;
    move-object/from16 v0, p1

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mName:Ljava/lang/String;

    const-string v15, "impp"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    .line 136
    const/16 v14, 0x3a

    invoke-virtual {v13, v14}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 138
    .local v2, "colonIdx":I
    const/4 v14, -0x1

    if-eq v14, v2, :cond_5

    .line 139
    const/4 v14, 0x0

    invoke-virtual {v13, v14, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 140
    .local v10, "protocol":Ljava/lang/String;
    const-string v14, "data5"

    sget-object v15, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->imProtocolMap:Ljava/util/Map;

    invoke-interface {v15, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v1, v14, v15}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 142
    add-int/lit8 v14, v2, 0x1

    invoke-virtual {v13, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v13

    .line 144
    .end local v2    # "colonIdx":I
    .end local v10    # "protocol":Ljava/lang/String;
    :cond_6
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v1, v14, v13}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 149
    .end local v1    # "builder":Landroid/content/ContentProviderOperation$Builder;
    .end local v4    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v5    # "fields":Lorg/json/JSONArray;
    .end local v6    # "i":I
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v8    # "iType":Ljava/lang/Integer;
    .end local v9    # "json":Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;
    .end local v11    # "type":Ljava/lang/String;
    .end local v12    # "typeList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v13    # "value":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 150
    .local v3, "e":Lorg/json/JSONException;
    const-string v14, "ContactSaver"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v16, "Failed to parse json data of "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    move-object/from16 v0, p1

    iget-object v0, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mName:Ljava/lang/String;

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    const-string v16, ": "

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v3}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 146
    .end local v3    # "e":Lorg/json/JSONException;
    .restart local v1    # "builder":Landroid/content/ContentProviderOperation$Builder;
    .restart local v5    # "fields":Lorg/json/JSONArray;
    .restart local v6    # "i":I
    .restart local v7    # "i$":Ljava/util/Iterator;
    .restart local v8    # "iType":Ljava/lang/Integer;
    .restart local v9    # "json":Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;
    .restart local v11    # "type":Ljava/lang/String;
    .restart local v12    # "typeList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    :cond_7
    :try_start_1
    move-object/from16 v0, p0

    iget-object v14, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v1}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 115
    .end local v1    # "builder":Landroid/content/ContentProviderOperation$Builder;
    .end local v7    # "i$":Ljava/util/Iterator;
    .end local v8    # "iType":Ljava/lang/Integer;
    .end local v11    # "type":Ljava/lang/String;
    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_1
.end method

.method private buildByArray(Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .param p1, "contactMap"    # Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;
    .param p2, "data"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 168
    .local p3, "dataEntries":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    iget-object v1, p1, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p1, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mMimeType:Ljava/lang/String;

    invoke-direct {p0, v0, p2, p3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByArray(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 171
    :cond_0
    return-void
.end method

.method private buildByContactMapList()V
    .locals 5

    .prologue
    .line 189
    sget-object v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->contactMapList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;

    .line 190
    .local v0, "contactMap":Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;
    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mTypeMap:Ljava/util/Map;

    if-eqz v2, :cond_0

    .line 191
    invoke-direct {p0, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByArray(Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;)V

    goto :goto_0

    .line 193
    :cond_0
    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mDataMap:Ljava/util/Map;

    const-string v3, "data"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    iget-object v4, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;->mName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getStringArray(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, v0, v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByArray(Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    .line 197
    .end local v0    # "contactMap":Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants$ContactMap;
    :cond_1
    return-void
.end method

.method private buildByDate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "mimeType"    # Ljava/lang/String;
    .param p3, "data"    # Ljava/lang/String;
    .param p4, "type"    # Ljava/lang/String;
    .param p5, "dateType"    # I

    .prologue
    .line 174
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 182
    :goto_0
    return-void

    .line 176
    :cond_0
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    invoke-virtual {v3, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 177
    .local v2, "fullDateString":Ljava/lang/String;
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    invoke-virtual {v3, v2}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->dateTrim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 178
    .local v1, "dateString":Ljava/lang/String;
    invoke-direct {p0, p2}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 179
    .local v0, "builder":Landroid/content/ContentProviderOperation$Builder;
    invoke-virtual {v0, p3, v1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 180
    if-eqz p4, :cond_1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, p4, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 181
    :cond_1
    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method private buildByEvent(Ljava/lang/String;I)V
    .locals 6
    .param p1, "eventName"    # Ljava/lang/String;
    .param p2, "eventType"    # I

    .prologue
    .line 185
    const-string v2, "vnd.android.cursor.item/contact_event"

    const-string v3, "data1"

    const-string v4, "data2"

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByDate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 186
    return-void
.end method

.method private newBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
    .locals 1
    .param p1, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 88
    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mIsUpdate:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newUpdateBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newInsertBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    goto :goto_0
.end method

.method private newInsertBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
    .locals 3
    .param p1, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 61
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 62
    .local v0, "builder":Landroid/content/ContentProviderOperation$Builder;
    const-string v1, "raw_contact_id"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withValueBackReference(Ljava/lang/String;I)Landroid/content/ContentProviderOperation$Builder;

    .line 63
    const-string v1, "mimetype"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 64
    return-object v0
.end method

.method private newInsertContactOrFieldBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
    .locals 1
    .param p1, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 82
    iget-boolean v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mIsUpdate:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newInsertFieldBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newInsertBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    goto :goto_0
.end method

.method private newInsertFieldBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
    .locals 5
    .param p1, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 69
    iget-object v2, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getRawId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 70
    .local v1, "rawId":Ljava/lang/String;
    if-nez v1, :cond_0

    .line 71
    const-string v2, "ContactSaver"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to create builder to insert field of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    const/4 v0, 0x0

    .line 77
    :goto_0
    return-object v0

    .line 74
    :cond_0
    sget-object v2, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v2}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 75
    .local v0, "builder":Landroid/content/ContentProviderOperation$Builder;
    const-string v2, "raw_contact_id"

    iget-object v3, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getRawId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 76
    const-string v2, "mimetype"

    invoke-virtual {v0, v2, p1}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    goto :goto_0
.end method

.method private newUpdateBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;
    .locals 5
    .param p1, "mimeType"    # Ljava/lang/String;

    .prologue
    .line 52
    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v1}, Landroid/content/ContentProviderOperation;->newUpdate(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 53
    .local v0, "builder":Landroid/content/ContentProviderOperation$Builder;
    const-string v1, "contact_id=? AND mimetype=?"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentProviderOperation$Builder;->withSelection(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    .line 56
    return-object v0
.end method


# virtual methods
.method public save(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 14
    .param p1, "saveString"    # Ljava/lang/String;

    .prologue
    .line 209
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    iput-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    .line 211
    :try_start_0
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    new-instance v10, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    iget-object v11, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    invoke-direct {v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;-><init>(Lorg/json/JSONObject;)V

    iput-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    .line 219
    const/4 v0, 0x0

    .line 220
    .local v0, "builder":Landroid/content/ContentProviderOperation$Builder;
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    const-string v11, "id"

    invoke-virtual {v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    .line 221
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v11, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    invoke-virtual {v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->hasID(Ljava/lang/String;)Z

    move-result v10

    iput-boolean v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mIsUpdate:Z

    .line 223
    const/4 v9, 0x0

    .line 224
    .local v9, "oldRawIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    iget-boolean v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mIsUpdate:Z

    if-nez v10, :cond_0

    .line 225
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    invoke-virtual {v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getCurrentRawIds()Ljava/util/Set;

    move-result-object v9

    .line 226
    const/4 v10, 0x0

    iput-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    .line 227
    sget-object v10, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-static {v10}, Landroid/content/ContentProviderOperation;->newInsert(Landroid/net/Uri;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 228
    const-string v10, "account_type"

    const/4 v11, 0x0

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 229
    const-string v10, "account_name"

    const/4 v11, 0x0

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 230
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    :cond_0
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    const-string v11, "name"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 243
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    const-string v11, "name"

    invoke-virtual {v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 244
    .local v6, "name":Lorg/json/JSONObject;
    new-instance v7, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    invoke-direct {v7, v6}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;-><init>(Lorg/json/JSONObject;)V

    .line 245
    .local v7, "nameJson":Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;
    const-string v10, "vnd.android.cursor.item/name"

    invoke-direct {p0, v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 246
    const-string v10, "data1"

    const-string v11, "displayName"

    invoke-virtual {v7, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 248
    const-string v10, "data3"

    const-string v11, "familyNames"

    invoke-virtual {v7, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getFirstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 249
    const-string v10, "data2"

    const-string v11, "givenNames"

    invoke-virtual {v7, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getFirstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 250
    const-string v10, "data5"

    const-string v11, "additionalNames"

    invoke-virtual {v7, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getFirstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 251
    const-string v10, "data4"

    const-string v11, "honorificPrefixes"

    invoke-virtual {v7, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getFirstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 252
    const-string v10, "data6"

    const-string v11, "honorificSuffixes"

    invoke-virtual {v7, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getFirstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 253
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    const-string v10, "nicknames"

    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 257
    const-string v10, "vnd.android.cursor.item/nickname"

    invoke-direct {p0, v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 258
    const-string v10, "data1"

    const-string v11, "nicknames"

    invoke-virtual {v7, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getFirstValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v10, v11}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 259
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .end local v6    # "name":Lorg/json/JSONObject;
    .end local v7    # "nameJson":Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;
    :cond_1
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    const-string v11, "categories"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 264
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 265
    .local v3, "groupIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    const-string v11, "categories"

    invoke-virtual {v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getStringArray(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .local v5, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 266
    .local v4, "groupTitle":Ljava/lang/String;
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    invoke-virtual {v10, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getEnsuredGroupId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 212
    .end local v0    # "builder":Landroid/content/ContentProviderOperation$Builder;
    .end local v3    # "groupIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v4    # "groupTitle":Ljava/lang/String;
    .end local v5    # "i$":Ljava/util/Iterator;
    .end local v9    # "oldRawIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :catch_0
    move-exception v1

    .line 213
    .local v1, "e":Lorg/json/JSONException;
    const-string v10, "ContactSaver"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Failed to parse json data: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v1}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 315
    .end local v1    # "e":Lorg/json/JSONException;
    :goto_1
    return-object v10

    .line 268
    .restart local v0    # "builder":Landroid/content/ContentProviderOperation$Builder;
    .restart local v3    # "groupIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v5    # "i$":Ljava/util/Iterator;
    .restart local v9    # "oldRawIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_2
    const-string v10, "vnd.android.cursor.item/group_membership"

    const-string v11, "data1"

    invoke-direct {p0, v10, v11, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByArray(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 271
    .end local v3    # "groupIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v5    # "i$":Ljava/util/Iterator;
    :cond_3
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    const-string v11, "gender"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 272
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mJson:Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    const-string v11, "gender"

    invoke-virtual {v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 273
    .local v2, "gender":Ljava/lang/String;
    const/4 v10, 0x5

    new-array v10, v10, [Ljava/lang/String;

    const/4 v11, 0x0

    const-string v12, "male"

    aput-object v12, v10, v11

    const/4 v11, 0x1

    const-string v12, "female"

    aput-object v12, v10, v11

    const/4 v11, 0x2

    const-string v12, "other"

    aput-object v12, v10, v11

    const/4 v11, 0x3

    const-string v12, "none"

    aput-object v12, v10, v11

    const/4 v11, 0x4

    const-string v12, "unknown"

    aput-object v12, v10, v11

    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 274
    const-string v10, "vnd.android.cursor.item/contact_custom_gender"

    invoke-direct {p0, v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->newBuilder(Ljava/lang/String;)Landroid/content/ContentProviderOperation$Builder;

    move-result-object v0

    .line 275
    const-string v10, "data1"

    invoke-virtual {v0, v10, v2}, Landroid/content/ContentProviderOperation$Builder;->withValue(Ljava/lang/String;Ljava/lang/Object;)Landroid/content/ContentProviderOperation$Builder;

    .line 276
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v0}, Landroid/content/ContentProviderOperation$Builder;->build()Landroid/content/ContentProviderOperation;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .end local v2    # "gender":Ljava/lang/String;
    :cond_4
    const-string v10, "birthday"

    const/4 v11, 0x3

    invoke-direct {p0, v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByEvent(Ljava/lang/String;I)V

    .line 281
    const-string v10, "anniversary"

    const/4 v11, 0x1

    invoke-direct {p0, v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByEvent(Ljava/lang/String;I)V

    .line 283
    invoke-direct {p0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->buildByContactMapList()V

    .line 287
    :try_start_1
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v10, v10, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->mResolver:Landroid/content/ContentResolver;

    const-string v11, "com.android.contacts"

    iget-object v12, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mOps:Ljava/util/ArrayList;

    invoke-virtual {v10, v11, v12}, Landroid/content/ContentResolver;->applyBatch(Ljava/lang/String;Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 300
    iget-boolean v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mIsUpdate:Z

    if-nez v10, :cond_9

    .line 301
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    invoke-virtual {v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getCurrentRawIds()Ljava/util/Set;

    move-result-object v8

    .line 302
    .local v8, "newRawIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-nez v8, :cond_7

    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1

    .line 288
    .end local v8    # "newRawIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :catch_1
    move-exception v1

    .line 289
    .local v1, "e":Ljava/lang/Exception;
    instance-of v10, v1, Landroid/os/RemoteException;

    if-nez v10, :cond_5

    instance-of v10, v1, Landroid/content/OperationApplicationException;

    if-nez v10, :cond_5

    instance-of v10, v1, Ljava/lang/SecurityException;

    if-eqz v10, :cond_6

    .line 292
    :cond_5
    const-string v10, "ContactSaver"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Failed to apply batch: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 293
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    goto/16 :goto_1

    .line 295
    :cond_6
    new-instance v10, Ljava/lang/RuntimeException;

    invoke-direct {v10, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v10

    .line 303
    .end local v1    # "e":Ljava/lang/Exception;
    .restart local v8    # "newRawIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_7
    invoke-interface {v8, v9}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 304
    invoke-interface {v8}, Ljava/util/Set;->size()I

    move-result v10

    const/4 v11, 0x1

    if-eq v10, v11, :cond_8

    .line 305
    const-string v10, "ContactSaver"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Something wrong after batch applied, new raw ids are: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    goto/16 :goto_1

    .line 309
    :cond_8
    iget-object v11, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v11, v10}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    .line 310
    const-string v10, "id"

    iget-object v11, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    invoke-direct {p0, v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->PutToContact(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .end local v8    # "newRawIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_9
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x12

    if-lt v10, v11, :cond_a

    .line 313
    const-string v10, "lastUpdated"

    iget-object v11, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v12, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mId:Ljava/lang/String;

    invoke-static {v12}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getLastUpdated(J)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {p0, v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->PutToContact(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    :cond_a
    iget-object v10, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactSaver;->mContact:Lorg/json/JSONObject;

    goto/16 :goto_1
.end method
