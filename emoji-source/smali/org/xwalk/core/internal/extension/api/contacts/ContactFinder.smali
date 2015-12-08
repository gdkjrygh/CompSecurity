.class public Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;
.super Ljava/lang/Object;
.source "ContactFinder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$1;,
        Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;,
        Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ContactFinder"


# instance fields
.field private mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 1
    .param p1, "resolver"    # Landroid/content/ContentResolver;

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    invoke-direct {v0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    .line 47
    return-void
.end method

.method private addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2
    .param p1, "o"    # Lorg/json/JSONObject;
    .param p2, "c"    # Landroid/database/Cursor;
    .param p3, "jsonName"    # Ljava/lang/String;
    .param p4, "dataName"    # Ljava/lang/String;

    .prologue
    .line 137
    invoke-interface {p2, p4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 138
    .local v0, "nameString":Ljava/lang/String;
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->ensureAddArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    return-object v1
.end method

.method private addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 2
    .param p1, "o"    # Lorg/json/JSONObject;
    .param p2, "c"    # Landroid/database/Cursor;
    .param p3, "jsonName"    # Ljava/lang/String;
    .param p4, "dataName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .prologue
    .line 130
    .local p5, "typeValuesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    invoke-interface {p2, p4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p5, v1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getKeyFromValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 132
    .local v0, "nameString":Ljava/lang/String;
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->ensureAddArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    return-object v1
.end method

.method private addString(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 2
    .param p1, "array"    # Lorg/json/JSONArray;
    .param p2, "c"    # Landroid/database/Cursor;
    .param p3, "dataName"    # Ljava/lang/String;

    .prologue
    .line 122
    if-nez p1, :cond_0

    new-instance p1, Lorg/json/JSONArray;

    .end local p1    # "array":Lorg/json/JSONArray;
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 123
    .restart local p1    # "array":Lorg/json/JSONArray;
    :cond_0
    invoke-interface {p2, p3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 124
    .local v0, "value":Ljava/lang/String;
    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 125
    :cond_1
    return-object p1
.end method

.method private addString(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6
    .param p1, "o"    # Lorg/json/JSONObject;
    .param p2, "c"    # Landroid/database/Cursor;
    .param p3, "jsonName"    # Ljava/lang/String;
    .param p4, "dataName"    # Ljava/lang/String;

    .prologue
    .line 112
    :try_start_0
    invoke-interface {p2, p4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {p2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 113
    .local v2, "value":Ljava/lang/String;
    if-nez p1, :cond_0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .end local p1    # "o":Lorg/json/JSONObject;
    .local v1, "o":Lorg/json/JSONObject;
    move-object p1, v1

    .line 114
    .end local v1    # "o":Lorg/json/JSONObject;
    .restart local p1    # "o":Lorg/json/JSONObject;
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {p1, p3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    .end local v2    # "value":Ljava/lang/String;
    :cond_1
    :goto_0
    return-object p1

    .line 115
    :catch_0
    move-exception v0

    .line 116
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "ContactFinder"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "addString - Failed to build json data: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private addTypeArray(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONArray;
    .locals 14
    .param p1, "array"    # Lorg/json/JSONArray;
    .param p2, "c"    # Landroid/database/Cursor;
    .param p3, "data"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Landroid/database/Cursor;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .prologue
    .line 159
    .local p4, "typeMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    .local p5, "typeValuesMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
    if-nez p1, :cond_0

    :try_start_0
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .end local p1    # "array":Lorg/json/JSONArray;
    .local v7, "array":Lorg/json/JSONArray;
    move-object p1, v7

    .line 160
    .end local v7    # "array":Lorg/json/JSONArray;
    .restart local p1    # "array":Lorg/json/JSONArray;
    :cond_0
    const-string v1, "isSuperPrimary"

    move-object/from16 v0, p4

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 161
    .local v11, "primary":Ljava/lang/String;
    move-object/from16 v0, p2

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "1"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v9, "true"

    .line 163
    .local v9, "preferred":Ljava/lang/String;
    :goto_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 164
    .local v2, "o":Lorg/json/JSONObject;
    const-string v1, "preferred"

    invoke-virtual {v2, v1, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 165
    const-string v4, "types"

    const-string v1, "type"

    move-object/from16 v0, p4

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v1, p0

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    invoke-direct/range {v1 .. v6}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 166
    invoke-interface/range {p2 .. p3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 167
    .local v13, "value":Ljava/lang/String;
    const-string v1, "mimetype"

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "vnd.android.cursor.item/im"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 168
    const-string v1, "data5"

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    .line 169
    .local v12, "protocol":I
    sget-object v1, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->imProtocolMap:Ljava/util/Map;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getKeyFromValue(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 170
    .local v10, "prefix":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v3, 0x3a

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 172
    .end local v10    # "prefix":Ljava/lang/String;
    .end local v12    # "protocol":I
    :cond_1
    const-string v1, "value"

    invoke-virtual {v2, v1, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 177
    .end local v2    # "o":Lorg/json/JSONObject;
    .end local v9    # "preferred":Ljava/lang/String;
    .end local v11    # "primary":Ljava/lang/String;
    .end local v13    # "value":Ljava/lang/String;
    :goto_1
    return-object p1

    .line 161
    .restart local v11    # "primary":Ljava/lang/String;
    :cond_2
    const-string v9, "false"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 174
    .end local v11    # "primary":Ljava/lang/String;
    :catch_0
    move-exception v8

    .line 175
    .local v8, "e":Lorg/json/JSONException;
    const-string v1, "ContactFinder"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addTypeArray - Failed to build json data: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v8}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method private createFindIDOption(Ljava/lang/String;)Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;
    .locals 16
    .param p1, "findString"    # Ljava/lang/String;

    .prologue
    .line 346
    new-instance v5, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    move-object/from16 v0, p1

    invoke-direct {v5, v0}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;-><init>(Ljava/lang/String;)V

    .line 347
    .local v5, "findJson":Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;
    if-eqz p1, :cond_1

    const-string v12, "value"

    invoke-virtual {v5, v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 348
    .local v9, "value":Ljava/lang/String;
    :goto_0
    if-eqz v9, :cond_0

    const-string v12, ""

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_0

    const-string v12, ""

    move-object/from16 v0, p1

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 349
    :cond_0
    new-instance v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct {v12, v13, v14, v15}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    :goto_1
    return-object v12

    .line 347
    .end local v9    # "value":Ljava/lang/String;
    :cond_1
    const/4 v9, 0x0

    goto :goto_0

    .line 351
    .restart local v9    # "value":Ljava/lang/String;
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 352
    .local v1, "args":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v12, "fields"

    invoke-virtual {v5, v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getStringArray(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    .line 353
    .local v4, "fields":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v12, "operator"

    invoke-virtual {v5, v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 354
    .local v8, "operator":Ljava/lang/String;
    if-nez v8, :cond_3

    .line 355
    new-instance v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct {v12, v13, v14, v15}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 356
    :cond_3
    const-string v12, "is"

    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 357
    const-string v8, " = "

    .line 365
    :goto_2
    const-string v10, ""

    .line 366
    .local v10, "where":Ljava/lang/String;
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .local v6, "i$":Ljava/util/Iterator;
    :cond_4
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 368
    .local v3, "field":Ljava/lang/String;
    sget-object v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->findFieldMap:Ljava/util/Map;

    invoke-interface {v12, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 370
    .local v2, "column":Ljava/lang/String;
    if-eqz v2, :cond_4

    .line 371
    sget-object v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->contactDataMap:Ljava/util/Map;

    invoke-interface {v12, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    .line 373
    .local v7, "name":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    iget-object v12, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " ? AND "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "mimetype"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " = ? or "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 374
    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 375
    iget-object v12, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-interface {v1, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 358
    .end local v2    # "column":Ljava/lang/String;
    .end local v3    # "field":Ljava/lang/String;
    .end local v6    # "i$":Ljava/util/Iterator;
    .end local v7    # "name":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v10    # "where":Ljava/lang/String;
    :cond_5
    const-string v12, "contains"

    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 359
    const-string v8, " LIKE "

    .line 360
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "%"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "%"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_2

    .line 362
    :cond_6
    const-string v12, "ContactFinder"

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "find - Wrong Operator: ["

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    const-string v14, "], should be \'is\' or \'contains\'"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 363
    const/4 v12, 0x0

    goto/16 :goto_1

    .line 377
    .restart local v6    # "i$":Ljava/util/Iterator;
    .restart local v10    # "where":Ljava/lang/String;
    :cond_7
    const-string v12, ""

    if-ne v10, v12, :cond_8

    new-instance v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct {v12, v13, v14, v15}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 379
    :cond_8
    const/4 v12, 0x0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v13

    add-int/lit8 v13, v13, -0x3

    invoke-virtual {v10, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 380
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v12

    new-array v12, v12, [Ljava/lang/String;

    invoke-interface {v1, v12}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Ljava/lang/String;

    .line 381
    .local v11, "whereArgs":[Ljava/lang/String;
    new-instance v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;

    const/4 v13, 0x0

    invoke-direct {v12, v10, v11, v13}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;-><init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method private ensureAddArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 6
    .param p1, "o"    # Lorg/json/JSONObject;
    .param p2, "c"    # Landroid/database/Cursor;
    .param p3, "jsonName"    # Ljava/lang/String;
    .param p4, "nameString"    # Ljava/lang/String;

    .prologue
    .line 144
    if-nez p1, :cond_0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .end local p1    # "o":Lorg/json/JSONObject;
    .local v2, "o":Lorg/json/JSONObject;
    move-object p1, v2

    .line 145
    .end local v2    # "o":Lorg/json/JSONObject;
    .restart local p1    # "o":Lorg/json/JSONObject;
    :cond_0
    if-eqz p4, :cond_1

    .line 146
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 147
    .local v1, "nameArray":Lorg/json/JSONArray;
    invoke-virtual {v1, p4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 148
    invoke-virtual {p1, p3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    .end local v1    # "nameArray":Lorg/json/JSONArray;
    :cond_1
    :goto_0
    return-object p1

    .line 150
    :catch_0
    move-exception v0

    .line 151
    .local v0, "e":Lorg/json/JSONException;
    const-string v3, "ContactFinder"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ensureAddArrayTop - Failed to build json data: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private getContactIds(Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;)Ljava/util/Set;
    .locals 11
    .param p1, "findOption"    # Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v10, 0x0

    .line 181
    const/4 v8, 0x0

    .line 182
    .local v8, "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const/4 v6, 0x0

    .line 184
    .local v6, "c":Landroid/database/Cursor;
    :try_start_0
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v0, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->mResolver:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x0

    iget-object v3, p1, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;->mWhere:Ljava/lang/String;

    iget-object v4, p1, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;->mWhereArgs:[Ljava/lang/String;

    iget-object v5, p1, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;->mSortOrder:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 186
    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    .end local v8    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .local v9, "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :goto_0
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 188
    const-string v0, "contact_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 191
    :catch_0
    move-exception v7

    move-object v8, v9

    .line 192
    .end local v9    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .local v7, "e":Ljava/lang/SecurityException;
    .restart local v8    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :goto_1
    :try_start_2
    const-string v0, "ContactFinder"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getContactIds: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v7}, Ljava/lang/SecurityException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 195
    if-eqz v6, :cond_0

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_0
    move-object v9, v10

    .end local v7    # "e":Ljava/lang/SecurityException;
    :goto_2
    return-object v9

    .end local v8    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .restart local v9    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :cond_1
    if-eqz v6, :cond_2

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_2
    move-object v8, v9

    .end local v9    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .restart local v8    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    goto :goto_2

    :catchall_0
    move-exception v0

    :goto_3
    if-eqz v6, :cond_3

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v0

    .end local v8    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .restart local v9    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    :catchall_1
    move-exception v0

    move-object v8, v9

    .end local v9    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    .restart local v8    # "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    goto :goto_3

    .line 191
    :catch_1
    move-exception v7

    goto :goto_1
.end method

.method private getContacts(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lorg/json/JSONArray;
    .locals 27
    .param p2, "sortOrder"    # Ljava/lang/String;
    .param p3, "sortByMimeType"    # Ljava/lang/String;
    .param p4, "resultsLimit"    # Ljava/lang/Long;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ")",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .prologue
    .line 236
    .local p1, "contactIds":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    const/4 v5, 0x0

    .line 237
    .local v5, "where":Ljava/lang/String;
    const/4 v6, 0x0

    .line 238
    .local v6, "whereArgs":[Ljava/lang/String;
    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->size()I

    move-result v2

    if-eqz v2, :cond_0

    .line 239
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "contact_id in ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->makeQuestionMarkList(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 240
    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/String;

    move-object/from16 v0, p1

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    .end local v6    # "whereArgs":[Ljava/lang/String;
    check-cast v6, [Ljava/lang/String;

    .line 242
    .restart local v6    # "whereArgs":[Ljava/lang/String;
    :cond_0
    const/4 v9, 0x0

    .line 243
    .local v9, "c":Landroid/database/Cursor;
    const/4 v14, 0x0

    .line 245
    .local v14, "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    iget-object v2, v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->mResolver:Landroid/content/ContentResolver;

    sget-object v3, Landroid/provider/ContactsContract$Data;->CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x0

    move-object/from16 v7, p2

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 246
    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 249
    .end local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .local v15, "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    if-eqz p2, :cond_5

    .line 250
    :cond_1
    :goto_0
    :try_start_1
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 253
    const-string v2, "mimetype"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 254
    .local v22, "mime":Ljava/lang/String;
    move-object/from16 v0, v22

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 255
    const-string v2, "contact_id"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v20

    .line 256
    .local v20, "id":J
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;-><init>(Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$1;)V

    invoke-interface {v15, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 324
    .end local v20    # "id":J
    .end local v22    # "mime":Ljava/lang/String;
    :catch_0
    move-exception v16

    move-object v14, v15

    .line 325
    .end local v15    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .local v16, "e":Ljava/lang/Exception;
    :goto_1
    :try_start_2
    move-object/from16 v0, v16

    instance-of v2, v0, Ljava/lang/NumberFormatException;

    if-nez v2, :cond_2

    move-object/from16 v0, v16

    instance-of v2, v0, Ljava/lang/SecurityException;

    if-eqz v2, :cond_1b

    .line 326
    :cond_2
    const-string v2, "ContactFinder"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getContacts: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 327
    new-instance v24, Lorg/json/JSONArray;

    invoke-direct/range {v24 .. v24}, Lorg/json/JSONArray;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 332
    if-eqz v9, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 342
    .end local v16    # "e":Ljava/lang/Exception;
    :cond_3
    :goto_2
    return-object v24

    .line 258
    .end local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v15    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    :cond_4
    :try_start_3
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    .line 262
    :cond_5
    :goto_3
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_18

    .line 263
    const-string v2, "contact_id"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v20

    .line 264
    .restart local v20    # "id":J
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;

    const/4 v4, 0x0

    move-object/from16 v0, p0

    invoke-direct {v3, v0, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;-><init>(Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$1;)V

    invoke-interface {v15, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    :cond_6
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;

    .line 266
    .local v13, "d":Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->lastUpdated:Ljava/lang/String;

    if-nez v2, :cond_7

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x12

    if-lt v2, v3, :cond_7

    .line 267
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    move-wide/from16 v0, v20

    invoke-virtual {v2, v0, v1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getLastUpdated(J)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->lastUpdated:Ljava/lang/String;

    .line 269
    :cond_7
    const-string v2, "mimetype"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 270
    .restart local v22    # "mime":Ljava/lang/String;
    const-string v2, "vnd.android.cursor.item/name"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 271
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    const-string v3, "displayName"

    const-string v4, "data1"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addString(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    .line 272
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    const-string v3, "honorificPrefixes"

    const-string v4, "data4"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    .line 273
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    const-string v3, "givenNames"

    const-string v4, "data2"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    .line 274
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    const-string v3, "additionalNames"

    const-string v4, "data5"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    .line 275
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    const-string v3, "familyNames"

    const-string v4, "data3"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    .line 276
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    const-string v3, "honorificSuffixes"

    const-string v4, "data6"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_3

    .line 332
    .end local v13    # "d":Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;
    .end local v20    # "id":J
    .end local v22    # "mime":Ljava/lang/String;
    :catchall_0
    move-exception v2

    move-object v14, v15

    .end local v15    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    :goto_4
    if-eqz v9, :cond_8

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v2

    .line 277
    .end local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v13    # "d":Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;
    .restart local v15    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v20    # "id":J
    .restart local v22    # "mime":Ljava/lang/String;
    :cond_9
    :try_start_4
    const-string v2, "vnd.android.cursor.item/nickname"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 278
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    const-string v3, "nicknames"

    const-string v4, "data1"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3, v4}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addArrayTop(Lorg/json/JSONObject;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->oName:Lorg/json/JSONObject;

    goto/16 :goto_3

    .line 279
    :cond_a
    const-string v2, "vnd.android.cursor.item/email_v2"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 280
    iget-object v8, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aEmails:Lorg/json/JSONArray;

    const-string v10, "data1"

    sget-object v11, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->emailTypeMap:Ljava/util/Map;

    sget-object v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->emailTypeValuesMap:Ljava/util/Map;

    move-object/from16 v7, p0

    invoke-direct/range {v7 .. v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addTypeArray(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aEmails:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 283
    :cond_b
    const-string v2, "vnd.android.cursor.item/photo"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 284
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aPhotos:Lorg/json/JSONArray;

    const-string v3, "data15"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addString(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aPhotos:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 285
    :cond_c
    const-string v2, "vnd.android.cursor.item/website"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 286
    iget-object v8, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aUrls:Lorg/json/JSONArray;

    const-string v10, "data1"

    sget-object v11, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->websiteTypeMap:Ljava/util/Map;

    sget-object v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->websiteTypeValuesMap:Ljava/util/Map;

    move-object/from16 v7, p0

    invoke-direct/range {v7 .. v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addTypeArray(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aUrls:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 289
    :cond_d
    const-string v2, "vnd.android.cursor.item/group_membership"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 290
    move-object/from16 v0, p0

    iget-object v2, v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->mUtils:Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;

    const-string v3, "data1"

    invoke-interface {v9, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v9, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactUtils;->getGroupTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v25

    .line 292
    .local v25, "title":Ljava/lang/String;
    if-eqz v25, :cond_5

    .line 293
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aCategories:Lorg/json/JSONArray;

    if-nez v2, :cond_e

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aCategories:Lorg/json/JSONArray;

    .line 294
    :cond_e
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aCategories:Lorg/json/JSONArray;

    move-object/from16 v0, v25

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 296
    .end local v25    # "title":Ljava/lang/String;
    :cond_f
    const-string v2, "vnd.android.cursor.item/postal-address_v2"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 297
    iget-object v8, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aAddresses:Lorg/json/JSONArray;

    const-string v10, "data1"

    sget-object v11, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->addressTypeMap:Ljava/util/Map;

    sget-object v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->addressTypeValuesMap:Ljava/util/Map;

    move-object/from16 v7, p0

    invoke-direct/range {v7 .. v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addTypeArray(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aAddresses:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 300
    :cond_10
    const-string v2, "vnd.android.cursor.item/phone_v2"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    .line 301
    iget-object v8, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aNumbers:Lorg/json/JSONArray;

    const-string v10, "data1"

    sget-object v11, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->phoneTypeMap:Ljava/util/Map;

    sget-object v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->phoneTypeValuesMap:Ljava/util/Map;

    move-object/from16 v7, p0

    invoke-direct/range {v7 .. v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addTypeArray(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aNumbers:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 304
    :cond_11
    const-string v2, "vnd.android.cursor.item/organization"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 305
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aOrganizations:Lorg/json/JSONArray;

    const-string v3, "data1"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addString(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aOrganizations:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 306
    :cond_12
    const-string v2, "vnd.android.cursor.item/organization"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 307
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aJobTitles:Lorg/json/JSONArray;

    const-string v3, "data4"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addString(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aJobTitles:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 308
    :cond_13
    const-string v2, "vnd.android.cursor.item/contact_event"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 309
    const-string v2, "data2"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v26

    .line 310
    .local v26, "type":I
    const/4 v2, 0x3

    move/from16 v0, v26

    if-ne v0, v2, :cond_14

    .line 311
    const-string v2, "data1"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->birthday:Ljava/lang/String;

    goto/16 :goto_3

    .line 312
    :cond_14
    const/4 v2, 0x1

    move/from16 v0, v26

    if-ne v0, v2, :cond_5

    .line 313
    const-string v2, "data1"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->anniversary:Ljava/lang/String;

    goto/16 :goto_3

    .line 315
    .end local v26    # "type":I
    :cond_15
    const-string v2, "vnd.android.cursor.item/note"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    .line 316
    iget-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aNotes:Lorg/json/JSONArray;

    const-string v3, "data1"

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v9, v3}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addString(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aNotes:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 317
    :cond_16
    const-string v2, "vnd.android.cursor.item/im"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 318
    iget-object v8, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aImpp:Lorg/json/JSONArray;

    const-string v10, "data1"

    sget-object v11, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->imTypeMap:Ljava/util/Map;

    sget-object v12, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->imTypeValuesMap:Ljava/util/Map;

    move-object/from16 v7, p0

    invoke-direct/range {v7 .. v12}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->addTypeArray(Lorg/json/JSONArray;Landroid/database/Cursor;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lorg/json/JSONArray;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->aImpp:Lorg/json/JSONArray;

    goto/16 :goto_3

    .line 320
    :cond_17
    const-string v2, "vnd.android.cursor.item/contact_custom_gender"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 321
    const-string v2, "data1"

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v13, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->gender:Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_3

    .line 332
    .end local v13    # "d":Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;
    .end local v20    # "id":J
    .end local v22    # "mime":Ljava/lang/String;
    :cond_18
    if-eqz v9, :cond_19

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    .line 335
    :cond_19
    const/16 v18, 0x0

    .line 336
    .local v18, "i":I
    new-instance v24, Lorg/json/JSONArray;

    invoke-direct/range {v24 .. v24}, Lorg/json/JSONArray;-><init>()V

    .line 337
    .local v24, "returnArray":Lorg/json/JSONArray;
    invoke-interface {v15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v19

    .local v19, "i$":Ljava/util/Iterator;
    :goto_5
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/Map$Entry;

    .line 338
    .local v17, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    if-eqz p4, :cond_1c

    add-int/lit8 v18, v18, 0x1

    move/from16 v0, v18

    int-to-long v2, v0

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    cmp-long v2, v2, v10

    if-lez v2, :cond_1c

    .end local v17    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    :cond_1a
    move-object v14, v15

    .line 342
    .end local v15    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    goto/16 :goto_2

    .line 329
    .end local v18    # "i":I
    .end local v19    # "i$":Ljava/util/Iterator;
    .end local v24    # "returnArray":Lorg/json/JSONArray;
    .restart local v16    # "e":Ljava/lang/Exception;
    :cond_1b
    :try_start_5
    new-instance v2, Ljava/lang/RuntimeException;

    move-object/from16 v0, v16

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 332
    .end local v16    # "e":Ljava/lang/Exception;
    :catchall_1
    move-exception v2

    goto/16 :goto_4

    .line 339
    .end local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v15    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v17    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .restart local v18    # "i":I
    .restart local v19    # "i$":Ljava/util/Iterator;
    .restart local v24    # "returnArray":Lorg/json/JSONArray;
    :cond_1c
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;

    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v2, v10, v11}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;->ensurePut(J)Lorg/json/JSONObject;

    move-result-object v23

    .line 340
    .local v23, "o":Lorg/json/JSONObject;
    move-object/from16 v0, v24

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_5

    .line 324
    .end local v15    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .end local v17    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    .end local v18    # "i":I
    .end local v19    # "i$":Ljava/util/Iterator;
    .end local v23    # "o":Lorg/json/JSONObject;
    .end local v24    # "returnArray":Lorg/json/JSONArray;
    .restart local v14    # "dataMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Long;Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$ContactData;>;"
    :catch_1
    move-exception v16

    goto/16 :goto_1
.end method

.method private getSortOrder(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p2, "sortOrder"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .local p1, "sortBy":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v6, 0x0

    .line 206
    if-nez p2, :cond_0

    .line 221
    :goto_0
    return-object v6

    .line 208
    :cond_0
    const-string v4, ""

    .line 209
    .local v4, "suffix":Ljava/lang/String;
    const-string v5, "ascending"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 210
    const-string v4, " ASC"

    .line 215
    :cond_1
    :goto_1
    const-string v2, ""

    .line 216
    .local v2, "order":Ljava/lang/String;
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 217
    .local v3, "s":Ljava/lang/String;
    sget-object v5, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->contactDataMap:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Pair;

    .line 218
    .local v0, "fields":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
    if-eqz v0, :cond_2

    .line 219
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v5, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, ","

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 220
    goto :goto_2

    .line 211
    .end local v0    # "fields":Landroid/util/Pair;, "Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v1    # "i$":Ljava/util/Iterator;
    .end local v2    # "order":Ljava/lang/String;
    .end local v3    # "s":Ljava/lang/String;
    :cond_3
    const-string v5, "descending"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 212
    const-string v4, " DESC"

    goto :goto_1

    .line 221
    .restart local v1    # "i$":Ljava/util/Iterator;
    .restart local v2    # "order":Ljava/lang/String;
    :cond_4
    const-string v5, ""

    if-eq v2, v5, :cond_5

    const/4 v5, 0x0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v2, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    :goto_3
    move-object v6, v5

    goto :goto_0

    :cond_5
    move-object v5, v6

    goto :goto_3
.end method


# virtual methods
.method public find(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 10
    .param p1, "findString"    # Ljava/lang/String;

    .prologue
    const/4 v8, 0x0

    .line 386
    invoke-direct {p0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->createFindIDOption(Ljava/lang/String;)Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;

    move-result-object v7

    invoke-direct {p0, v7}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->getContactIds(Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder$FindOption;)Ljava/util/Set;

    move-result-object v1

    .line 387
    .local v1, "ids":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
    if-nez v1, :cond_0

    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 395
    :goto_0
    return-object v7

    .line 388
    :cond_0
    new-instance v0, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;

    invoke-direct {v0, p1}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;-><init>(Ljava/lang/String;)V

    .line 389
    .local v0, "findJson":Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;
    const-string v7, "sortBy"

    invoke-virtual {v0, v7}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getStringArray(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 390
    .local v6, "sortBy":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v7, "sortOrder"

    invoke-virtual {v0, v7}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v6, v7}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->getSortOrder(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 391
    .local v2, "order":Ljava/lang/String;
    if-nez v2, :cond_1

    move-object v3, v8

    .line 393
    .local v3, "orderMimeType":Ljava/lang/String;
    :goto_1
    const-string v7, "resultsLimit"

    invoke-virtual {v0, v7}, Lorg/xwalk/core/internal/extension/api/contacts/ContactJson;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 394
    .local v4, "resultsLimit":Ljava/lang/String;
    if-nez v4, :cond_2

    move-object v5, v8

    .line 395
    .local v5, "resultsLimitLong":Ljava/lang/Long;
    :goto_2
    invoke-direct {p0, v1, v2, v3, v5}, Lorg/xwalk/core/internal/extension/api/contacts/ContactFinder;->getContacts(Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lorg/json/JSONArray;

    move-result-object v7

    goto :goto_0

    .line 391
    .end local v3    # "orderMimeType":Ljava/lang/String;
    .end local v4    # "resultsLimit":Ljava/lang/String;
    .end local v5    # "resultsLimitLong":Ljava/lang/Long;
    :cond_1
    sget-object v7, Lorg/xwalk/core/internal/extension/api/contacts/ContactConstants;->contactDataMap:Ljava/util/Map;

    const/4 v9, 0x0

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Pair;

    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    move-object v3, v7

    goto :goto_1

    .line 394
    .restart local v3    # "orderMimeType":Ljava/lang/String;
    .restart local v4    # "resultsLimit":Ljava/lang/String;
    :cond_2
    invoke-static {v4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v5

    goto :goto_2
.end method
