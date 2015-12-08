.class public Lcom/hmobile/activerecorbase/EntitiesHelper;
.super Ljava/lang/Object;
.source "EntitiesHelper.java"


# static fields
.field private static final AR_BASE_CLASS_NAME:Ljava/lang/String;

.field private static final AR_PK_FIELD_JAVA_NAME:Ljava/lang/String; = "id"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 12
    sput-object v0, Lcom/hmobile/activerecorbase/EntitiesHelper;->AR_BASE_CLASS_NAME:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static copyDataFields(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Hashtable;Ljava/util/Hashtable;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:",
            "Ljava/lang/Object;",
            "T1:",
            "Ljava/lang/Object;",
            ">(TT1;TT2;",
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;",
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 190
    .local p0, "dst":Ljava/lang/Object;, "TT1;"
    .local p1, "src":Ljava/lang/Object;, "TT2;"
    .local p2, "dstFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    .local p3, "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    invoke-virtual {p3}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    .line 241
    return-void

    .line 190
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    .line 192
    .local v2, "srcField":Ljava/lang/reflect/Field;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    .line 194
    .local v3, "srcFieldName":Ljava/lang/String;
    const-string v8, "id"

    invoke-virtual {v3, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 200
    invoke-virtual {p2, v3}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 203
    invoke-virtual {p2, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    .line 206
    .local v0, "dstField":Ljava/lang/reflect/Field;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    .line 207
    .local v4, "srcFldTypeName":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 208
    .local v1, "dstFldTypeName":Ljava/lang/String;
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 214
    const-string v8, "long"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 216
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v6

    .line 217
    .local v6, "srcValue":J
    invoke-virtual {v0, p0, v6, v7}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 219
    .end local v6    # "srcValue":J
    :cond_2
    const-string v8, "int"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 220
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v6

    .line 221
    .local v6, "srcValue":I
    invoke-virtual {v0, p0, v6}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    goto :goto_0

    .line 222
    .end local v6    # "srcValue":I
    :cond_3
    const-string v8, "short"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 223
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->getShort(Ljava/lang/Object;)S

    move-result v6

    .line 224
    .local v6, "srcValue":S
    invoke-virtual {v0, p0, v6}, Ljava/lang/reflect/Field;->setShort(Ljava/lang/Object;S)V

    goto :goto_0

    .line 225
    .end local v6    # "srcValue":S
    :cond_4
    const-string v8, "float"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 226
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->getFloat(Ljava/lang/Object;)F

    move-result v6

    .line 227
    .local v6, "srcValue":F
    invoke-virtual {v0, p0, v6}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V

    goto :goto_0

    .line 228
    .end local v6    # "srcValue":F
    :cond_5
    const-string v8, "double"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 229
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->getDouble(Ljava/lang/Object;)D

    move-result-wide v6

    .line 230
    .local v6, "srcValue":D
    invoke-virtual {v0, p0, v6, v7}, Ljava/lang/reflect/Field;->setDouble(Ljava/lang/Object;D)V

    goto/16 :goto_0

    .line 231
    .end local v6    # "srcValue":D
    :cond_6
    const-string v8, "boolean"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 232
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v6

    .line 233
    .local v6, "srcValue":Z
    invoke-virtual {v0, p0, v6}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    .line 235
    .end local v6    # "srcValue":Z
    :cond_7
    invoke-virtual {v2, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 236
    .local v6, "srcValue":Ljava/lang/Object;
    invoke-virtual {v0, p0, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0
.end method

.method public static copyFields(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(TT1;TT2;)TT1;"
        }
    .end annotation

    .prologue
    .local p0, "dst":Ljava/lang/Object;, "TT1;"
    .local p1, "src":Ljava/lang/Object;, "TT2;"
    const/4 v11, 0x2

    const/4 v4, 0x0

    const/4 v10, 0x1

    const/4 v6, 0x0

    .line 26
    if-nez p1, :cond_0

    .line 27
    sget-object v5, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: null source object"

    new-array v8, v10, [Ljava/lang/Object;

    .line 28
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v6

    .line 27
    invoke-static {v5, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 70
    .end local p0    # "dst":Ljava/lang/Object;, "TT1;"
    :goto_0
    return-object p0

    .line 31
    .restart local p0    # "dst":Ljava/lang/Object;, "TT1;"
    :cond_0
    if-nez p0, :cond_1

    .line 32
    sget-object v5, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: null destination object"

    new-array v8, v10, [Ljava/lang/Object;

    .line 33
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v6

    .line 32
    invoke-static {v5, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 34
    goto :goto_0

    .line 38
    :cond_1
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 39
    .local v0, "dstFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    array-length v8, v7

    move v5, v6

    :goto_1
    if-lt v5, v8, :cond_2

    .line 44
    new-instance v3, Ljava/util/Hashtable;

    invoke-direct {v3}, Ljava/util/Hashtable;-><init>()V

    .line 45
    .local v3, "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    array-length v8, v7

    move v5, v6

    :goto_2
    if-lt v5, v8, :cond_3

    .line 50
    :try_start_0
    invoke-static {p0, p1, v0, v3}, Lcom/hmobile/activerecorbase/EntitiesHelper;->copyPkFields(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Hashtable;Ljava/util/Hashtable;)V

    .line 51
    invoke-static {p0, p1, v0, v3}, Lcom/hmobile/activerecorbase/EntitiesHelper;->copyDataFields(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Hashtable;Ljava/util/Hashtable;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    goto :goto_0

    .line 52
    :catch_0
    move-exception v1

    .line 53
    .local v1, "e":Ljava/lang/SecurityException;
    sget-object v5, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: %s"

    new-array v8, v11, [Ljava/lang/Object;

    .line 54
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-virtual {v1}, Ljava/lang/SecurityException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v10

    .line 53
    invoke-static {v5, v1, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 55
    goto :goto_0

    .line 39
    .end local v1    # "e":Ljava/lang/SecurityException;
    .end local v3    # "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    :cond_2
    aget-object v2, v7, v5

    .line 40
    .local v2, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 45
    .end local v2    # "field":Ljava/lang/reflect/Field;
    .restart local v3    # "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    :cond_3
    aget-object v2, v7, v5

    .line 46
    .restart local v2    # "field":Ljava/lang/reflect/Field;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 56
    .end local v2    # "field":Ljava/lang/reflect/Field;
    :catch_1
    move-exception v1

    .line 57
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    sget-object v5, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: %s"

    new-array v8, v11, [Ljava/lang/Object;

    .line 58
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v10

    .line 57
    invoke-static {v5, v1, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 59
    goto/16 :goto_0

    .line 60
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    :catch_2
    move-exception v1

    .line 61
    .local v1, "e":Ljava/lang/NoSuchFieldException;
    sget-object v5, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: %s"

    new-array v8, v11, [Ljava/lang/Object;

    .line 62
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-virtual {v1}, Ljava/lang/NoSuchFieldException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v10

    .line 61
    invoke-static {v5, v1, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 63
    goto/16 :goto_0

    .line 64
    .end local v1    # "e":Ljava/lang/NoSuchFieldException;
    :catch_3
    move-exception v1

    .line 65
    .local v1, "e":Ljava/lang/IllegalAccessException;
    sget-object v5, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: %s"

    new-array v8, v11, [Ljava/lang/Object;

    .line 66
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v6

    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v10

    .line 65
    invoke-static {v5, v1, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 67
    goto/16 :goto_0
.end method

.method public static copyFieldsWithoutID(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(TT1;TT2;)TT1;"
        }
    .end annotation

    .prologue
    .local p0, "dst":Ljava/lang/Object;, "TT1;"
    .local p1, "src":Ljava/lang/Object;, "TT2;"
    const/4 v4, 0x0

    const/4 v8, 0x1

    const/4 v5, 0x0

    .line 84
    if-nez p1, :cond_0

    .line 85
    sget-object v6, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: null source object"

    new-array v8, v8, [Ljava/lang/Object;

    .line 86
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v5

    .line 85
    invoke-static {v6, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 117
    .end local p0    # "dst":Ljava/lang/Object;, "TT1;"
    :goto_0
    return-object p0

    .line 89
    .restart local p0    # "dst":Ljava/lang/Object;, "TT1;"
    :cond_0
    if-nez p0, :cond_1

    .line 90
    sget-object v6, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    const-string v7, "(%t) %s error: null source object"

    new-array v8, v8, [Ljava/lang/Object;

    .line 91
    const-class v9, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v8, v5

    .line 90
    invoke-static {v6, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    move-object p0, v4

    .line 92
    goto :goto_0

    .line 96
    :cond_1
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 97
    .local v0, "dstFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    array-length v7, v6

    move v4, v5

    :goto_1
    if-lt v4, v7, :cond_2

    .line 102
    new-instance v3, Ljava/util/Hashtable;

    invoke-direct {v3}, Ljava/util/Hashtable;-><init>()V

    .line 103
    .local v3, "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    array-length v7, v6

    move v4, v5

    :goto_2
    if-lt v4, v7, :cond_3

    .line 108
    :try_start_0
    invoke-static {p0, p1, v0, v3}, Lcom/hmobile/activerecorbase/EntitiesHelper;->copyDataFields(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Hashtable;Ljava/util/Hashtable;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 109
    :catch_0
    move-exception v1

    .line 110
    .local v1, "e":Ljava/lang/IllegalArgumentException;
    invoke-virtual {v1}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    .line 111
    const/4 p0, 0x0

    goto :goto_0

    .line 97
    .end local v1    # "e":Ljava/lang/IllegalArgumentException;
    .end local v3    # "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    :cond_2
    aget-object v2, v6, v4

    .line 98
    .local v2, "field":Ljava/lang/reflect/Field;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 103
    .end local v2    # "field":Ljava/lang/reflect/Field;
    .restart local v3    # "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    :cond_3
    aget-object v2, v6, v4

    .line 104
    .restart local v2    # "field":Ljava/lang/reflect/Field;
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 112
    .end local v2    # "field":Ljava/lang/reflect/Field;
    :catch_1
    move-exception v1

    .line 113
    .local v1, "e":Ljava/lang/IllegalAccessException;
    invoke-virtual {v1}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    .line 114
    const/4 p0, 0x0

    goto :goto_0
.end method

.method private static copyPkFields(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Hashtable;Ljava/util/Hashtable;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:",
            "Ljava/lang/Object;",
            "T1:",
            "Ljava/lang/Object;",
            ">(TT1;TT2;",
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;",
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;,
            Ljava/lang/NoSuchFieldException;,
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .prologue
    .line 137
    .local p0, "dst":Ljava/lang/Object;, "TT1;"
    .local p1, "src":Ljava/lang/Object;, "TT2;"
    .local p2, "dstFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    .local p3, "srcFields":Ljava/util/Hashtable;, "Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/reflect/Field;>;"
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    .line 138
    sget-object v7, Lcom/hmobile/activerecorbase/EntitiesHelper;->AR_BASE_CLASS_NAME:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v5, 0x1

    .line 139
    .local v5, "srcIsAR":Z
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    .line 140
    sget-object v7, Lcom/hmobile/activerecorbase/EntitiesHelper;->AR_BASE_CLASS_NAME:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/4 v2, 0x1

    .line 141
    .local v2, "dstIsAR":Z
    :goto_1
    const-string v6, "id"

    invoke-virtual {p2, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/4 v0, 0x1

    .line 143
    .local v0, "dstHasId":Z
    :goto_2
    const-string v6, "id"

    invoke-virtual {p3, v6}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/4 v3, 0x1

    .line 146
    .local v3, "srcHasId":Z
    :goto_3
    if-eqz v5, :cond_5

    if-eqz v2, :cond_5

    .line 147
    check-cast p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .end local p0    # "dst":Ljava/lang/Object;, "TT1;"
    check-cast p1, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .end local p1    # "src":Ljava/lang/Object;, "TT2;"
    iget-wide v6, p1, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    iput-wide v6, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    .line 183
    :cond_0
    :goto_4
    return-void

    .line 138
    .end local v0    # "dstHasId":Z
    .end local v2    # "dstIsAR":Z
    .end local v3    # "srcHasId":Z
    .end local v5    # "srcIsAR":Z
    .restart local p0    # "dst":Ljava/lang/Object;, "TT1;"
    .restart local p1    # "src":Ljava/lang/Object;, "TT2;"
    :cond_1
    const/4 v5, 0x0

    goto :goto_0

    .line 140
    .restart local v5    # "srcIsAR":Z
    :cond_2
    const/4 v2, 0x0

    goto :goto_1

    .line 142
    .restart local v2    # "dstIsAR":Z
    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    .line 144
    .restart local v0    # "dstHasId":Z
    :cond_4
    const/4 v3, 0x0

    goto :goto_3

    .line 148
    .restart local v3    # "srcHasId":Z
    :cond_5
    if-eqz v5, :cond_7

    if-eqz v0, :cond_7

    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v7, "id"

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 150
    .local v1, "dstId":Ljava/lang/reflect/Field;
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "long"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 151
    check-cast p1, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .end local p1    # "src":Ljava/lang/Object;, "TT2;"
    iget-wide v6, p1, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    invoke-virtual {v1, p0, v6, v7}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    goto :goto_4

    .line 153
    .restart local p1    # "src":Ljava/lang/Object;, "TT2;"
    :cond_6
    sget-object v6, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    .line 154
    const-string v7, "(%t) %s.copyPkFields(): field \'%s.%s\' must have type \'long\'. Copy operation skipped"

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    .line 155
    const-class v10, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    .line 156
    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x2

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    .line 153
    invoke-static {v6, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 157
    new-instance v6, Ljava/lang/IllegalArgumentException;

    .line 159
    const-string v7, "Field \'%s.%s\' must have type \'long\'. Copy operation skipped"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    .line 160
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    .line 158
    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 157
    invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 162
    .end local v1    # "dstId":Ljava/lang/reflect/Field;
    :cond_7
    if-eqz v3, :cond_a

    if-eqz v2, :cond_a

    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v7, "id"

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 164
    .local v4, "srcId":Ljava/lang/reflect/Field;
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "long"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 165
    check-cast p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .end local p0    # "dst":Ljava/lang/Object;, "TT1;"
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v6

    iput-wide v6, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    goto/16 :goto_4

    .line 166
    .restart local p0    # "dst":Ljava/lang/Object;, "TT1;"
    :cond_8
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "int"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 167
    check-cast p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;

    .end local p0    # "dst":Ljava/lang/Object;, "TT1;"
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v6

    int-to-long v6, v6

    iput-wide v6, p0, Lcom/hmobile/activerecorbase/ActiveRecordBase;->_id:J

    goto/16 :goto_4

    .line 169
    .restart local p0    # "dst":Ljava/lang/Object;, "TT1;"
    :cond_9
    sget-object v6, Lcom/hmobile/activerecorbase/ARConst;->TAG:Ljava/lang/String;

    .line 170
    const-string v7, "%s.copyPkFields(): field \'%s.%s\' must have type \'long\' or \'int\'. Copy operation skipped"

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    .line 171
    const-class v10, Lcom/hmobile/activerecorbase/EntitiesHelper;

    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    .line 172
    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x2

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    .line 169
    invoke-static {v6, v7, v8}, Lcom/hmobile/activerecorbase/Logg;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 173
    new-instance v6, Ljava/lang/IllegalArgumentException;

    .line 175
    const-string v7, "Field \'%s.%s\' must have type \'long\' or \'int\'. Copy operation skipped"

    const/4 v8, 0x2

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    .line 176
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    .line 174
    invoke-static {v7, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 173
    invoke-direct {v6, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 178
    .end local v4    # "srcId":Ljava/lang/reflect/Field;
    :cond_a
    if-eqz v3, :cond_0

    if-eqz v0, :cond_0

    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v7, "id"

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    .line 180
    .restart local v4    # "srcId":Ljava/lang/reflect/Field;
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-string v7, "id"

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 181
    .restart local v1    # "dstId":Ljava/lang/reflect/Field;
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-virtual {v1, p0, v6, v7}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    goto/16 :goto_4
.end method
