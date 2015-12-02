.class public Lcom/facebook/common/json/jsonmirror/JMAutogen;
.super Ljava/lang/Object;
.source "JMAutogen.java"


# static fields
.field protected static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/common/json/jsonmirror/b;",
            ">;",
            "Lcom/facebook/common/json/jsonmirror/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 45
    const-class v0, Lcom/facebook/common/json/jsonmirror/JMAutogen;

    sput-object v0, Lcom/facebook/common/json/jsonmirror/JMAutogen;->b:Ljava/lang/Class;

    .line 97
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    return-void
.end method

.method protected static a(Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;)Lcom/facebook/common/json/jsonmirror/a/c;
    .locals 3

    .prologue
    .line 340
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    .line 341
    invoke-interface {p0}, Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;->valueElementType()Ljava/lang/Class;

    move-result-object v1

    .line 343
    invoke-static {v1}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->b(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v2

    .line 344
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 346
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a/e;

    invoke-interface {p0}, Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;->a()Z

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/common/json/jsonmirror/a/e;-><init>(Ljava/lang/Class;Z)V

    return-object v0
.end method

.method public static declared-synchronized a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/c;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/common/json/jsonmirror/b;",
            ">;)",
            "Lcom/facebook/common/json/jsonmirror/a/c;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 102
    const-class v7, Lcom/facebook/common/json/jsonmirror/JMAutogen;

    monitor-enter v7

    :try_start_0
    sget-object v1, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/json/jsonmirror/a/c;

    .line 103
    if-nez v1, :cond_a

    .line 104
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v8

    .line 107
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v4

    array-length v5, v4

    move v1, v3

    :goto_0
    if-ge v1, v5, :cond_c

    aget-object v6, v4, v1

    .line 108
    instance-of v6, v6, Lcom/facebook/common/json/jsonmirror/JMAutogen$IgnoreUnexpectedJsonFields;

    if-eqz v6, :cond_3

    move v1, v2

    .line 114
    :goto_1
    new-instance v4, Lcom/facebook/common/json/jsonmirror/a/k;

    invoke-direct {v4, p0, v8, v1}, Lcom/facebook/common/json/jsonmirror/a/k;-><init>(Ljava/lang/Class;Ljava/util/Map;Z)V

    .line 115
    sget-object v1, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a:Ljava/util/Map;

    invoke-interface {v1, p0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    invoke-static {p0}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->c(Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v1

    .line 119
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/util/Map$Entry;

    move-object v2, v0

    .line 120
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    .line 121
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/annotation/Annotation;

    .line 123
    instance-of v3, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;

    if-nez v3, :cond_1

    instance-of v3, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$ExplicitType;

    if-nez v3, :cond_1

    instance-of v3, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$EscapedObjectType;

    if-eqz v3, :cond_7

    .line 132
    :cond_1
    instance-of v3, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;

    if-eqz v3, :cond_4

    .line 133
    move-object v0, v2

    check-cast v0, Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;

    move-object v3, v0

    .line 134
    invoke-interface {v3}, Lcom/facebook/common/json/jsonmirror/JMAutogen$InferredType;->jsonFieldName()Ljava/lang/String;

    move-result-object v3

    .line 135
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    move-object v6, v5

    move-object v5, v3

    .line 146
    :goto_3
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v10

    .line 147
    invoke-static {v6}, Lcom/facebook/common/json/jsonmirror/a/a;->a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v3

    .line 149
    if-nez v3, :cond_2

    .line 150
    const-class v1, Lcom/facebook/common/json/jsonmirror/b;

    invoke-virtual {v1, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 152
    invoke-static {v6}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/c;

    move-result-object v3

    .line 160
    :cond_2
    instance-of v1, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$EscapedObjectType;

    if-eqz v1, :cond_b

    .line 161
    new-instance v1, Lcom/facebook/common/json/jsonmirror/a/f;

    sget-object v2, Lcom/facebook/common/json/c;->a:Lcom/facebook/common/json/c;

    invoke-direct {v1, v3, v2}, Lcom/facebook/common/json/jsonmirror/a/f;-><init>(Lcom/facebook/common/json/jsonmirror/a/a;Lcom/fasterxml/jackson/core/JsonFactory;)V

    .line 164
    :goto_4
    const-string v2, "json field [%s] is defined multiple times in the model"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v5, v3, v6

    invoke-static {v2, v3}, Lcom/facebook/common/w/m;->b(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v2, v3}, Lcom/facebook/debug/b/a;->a(Ljava/lang/String;Z)V

    .line 169
    new-instance v2, Lcom/facebook/common/w/s;

    invoke-direct {v2, v10, v1}, Lcom/facebook/common/w/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v8, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    .line 102
    :catchall_0
    move-exception v1

    monitor-exit v7

    throw v1

    .line 107
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 136
    :cond_4
    :try_start_1
    instance-of v3, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$ExplicitType;

    if-eqz v3, :cond_5

    .line 137
    move-object v0, v2

    check-cast v0, Lcom/facebook/common/json/jsonmirror/JMAutogen$ExplicitType;

    move-object v3, v0

    .line 138
    invoke-interface {v3}, Lcom/facebook/common/json/jsonmirror/JMAutogen$ExplicitType;->jsonFieldName()Ljava/lang/String;

    move-result-object v5

    .line 139
    invoke-interface {v3}, Lcom/facebook/common/json/jsonmirror/JMAutogen$ExplicitType;->type()Ljava/lang/Class;

    move-result-object v3

    move-object v6, v3

    .line 140
    goto :goto_3

    .line 141
    :cond_5
    move-object v0, v2

    check-cast v0, Lcom/facebook/common/json/jsonmirror/JMAutogen$EscapedObjectType;

    move-object v3, v0

    .line 142
    invoke-interface {v3}, Lcom/facebook/common/json/jsonmirror/JMAutogen$EscapedObjectType;->jsonFieldName()Ljava/lang/String;

    move-result-object v3

    .line 143
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    move-object v6, v5

    move-object v5, v3

    goto :goto_3

    .line 154
    :cond_6
    new-instance v1, Lcom/facebook/common/json/jsonmirror/f;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "could not infer type for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v1

    .line 170
    :cond_7
    instance-of v3, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;

    if-eqz v3, :cond_8

    .line 171
    check-cast v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;

    .line 177
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    .line 178
    invoke-interface {v2}, Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;->jsonFieldName()Ljava/lang/String;

    move-result-object v3

    .line 179
    invoke-static {v2}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a(Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;)Lcom/facebook/common/json/jsonmirror/a/h;

    move-result-object v2

    .line 181
    invoke-interface {v8, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Lcom/facebook/debug/b/a;->a(Z)V

    .line 182
    new-instance v5, Lcom/facebook/common/w/s;

    invoke-direct {v5, v1, v2}, Lcom/facebook/common/w/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v8, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 183
    :cond_8
    instance-of v3, v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;

    if-eqz v3, :cond_0

    .line 184
    check-cast v2, Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;

    .line 190
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    .line 191
    invoke-interface {v2}, Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;->jsonFieldName()Ljava/lang/String;

    move-result-object v3

    .line 192
    invoke-static {v2}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a(Lcom/facebook/common/json/jsonmirror/JMAutogen$DynamicKeyDictType;)Lcom/facebook/common/json/jsonmirror/a/c;

    move-result-object v2

    .line 194
    invoke-interface {v8, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Lcom/facebook/debug/b/a;->a(Z)V

    .line 195
    new-instance v5, Lcom/facebook/common/w/s;

    invoke-direct {v5, v1, v2}, Lcom/facebook/common/w/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v8, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    .line 199
    :cond_9
    invoke-static {p0, v8}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a(Ljava/lang/Class;Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v1, v4

    .line 202
    :cond_a
    monitor-exit v7

    return-object v1

    :cond_b
    move-object v1, v3

    goto/16 :goto_4

    :cond_c
    move v1, v3

    goto/16 :goto_1
.end method

.method protected static a(Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;)Lcom/facebook/common/json/jsonmirror/a/h;
    .locals 5

    .prologue
    .line 321
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v2

    .line 322
    invoke-interface {p0}, Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;->b()[Ljava/lang/Class;

    move-result-object v1

    .line 324
    array-length v3, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v1, v0

    .line 325
    invoke-static {v4}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->b(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v4

    .line 326
    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 324
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 329
    :cond_0
    new-instance v1, Lcom/facebook/common/json/jsonmirror/a/h;

    invoke-direct {v1, v2}, Lcom/facebook/common/json/jsonmirror/a/h;-><init>(Ljava/util/Set;)V

    .line 330
    invoke-interface {p0}, Lcom/facebook/common/json/jsonmirror/JMAutogen$ListType;->a()I

    move-result v0

    :goto_1
    if-lez v0, :cond_1

    .line 331
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 332
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 333
    new-instance v1, Lcom/facebook/common/json/jsonmirror/a/h;

    invoke-direct {v1, v2}, Lcom/facebook/common/json/jsonmirror/a/h;-><init>(Ljava/util/Set;)V

    .line 330
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 336
    :cond_1
    return-object v1
.end method

.method private static a(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/common/json/jsonmirror/b;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "*>;)V"
        }
    .end annotation

    .prologue
    const/4 v6, 0x2

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 242
    const-string v0, "postprocessJMAutogenFields"

    .line 244
    :try_start_0
    const-string v0, "postprocessJMAutogenFields"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ljava/util/Map;

    aput-object v3, v1, v2

    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 246
    if-eqz v0, :cond_0

    .line 247
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 248
    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 263
    :cond_0
    :goto_0
    return-void

    .line 255
    :catch_0
    move-exception v0

    .line 256
    sget-object v0, Lcom/facebook/common/json/jsonmirror/JMAutogen;->b:Ljava/lang/Class;

    const-string v1, "Can\'t access %s in %s"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "postprocessJMAutogenFields"

    aput-object v3, v2, v5

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 257
    :catch_1
    move-exception v0

    .line 258
    sget-object v0, Lcom/facebook/common/json/jsonmirror/JMAutogen;->b:Ljava/lang/Class;

    const-string v1, "InvocationTargetException while invoking %s on %s"

    new-array v2, v6, [Ljava/lang/Object;

    const-string v3, "postprocessJMAutogenFields"

    aput-object v3, v2, v5

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 251
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public static b(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/facebook/common/json/jsonmirror/a/a;"
        }
    .end annotation

    .prologue
    .line 306
    invoke-static {p0}, Lcom/facebook/common/json/jsonmirror/a/a;->a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/a;

    move-result-object v0

    .line 308
    if-nez v0, :cond_0

    .line 310
    const-class v0, Lcom/facebook/common/json/jsonmirror/b;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 311
    invoke-static {p0}, Lcom/facebook/common/json/jsonmirror/JMAutogen;->a(Ljava/lang/Class;)Lcom/facebook/common/json/jsonmirror/a/c;

    move-result-object v0

    .line 316
    :cond_0
    return-object v0

    .line 313
    :cond_1
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "could not infer type for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static c(Ljava/lang/Class;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .prologue
    .line 207
    new-instance v0, Lcom/facebook/common/json/jsonmirror/a;

    invoke-direct {v0, p0}, Lcom/facebook/common/json/jsonmirror/a;-><init>(Ljava/lang/Class;)V

    .line 230
    sget-object v1, Lcom/facebook/common/w/h;->INCLUDE_SUPERCLASSES:Lcom/facebook/common/w/h;

    sget-object v2, Lcom/facebook/common/w/h;->INCLUDE_FIELDS:Lcom/facebook/common/w/h;

    invoke-static {v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/facebook/common/w/f;->a(Ljava/lang/Class;Lcom/facebook/common/w/g;Ljava/util/EnumSet;)Ljava/util/Map;

    move-result-object v0

    .line 237
    return-object v0
.end method
