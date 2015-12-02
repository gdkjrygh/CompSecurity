.class public Lcom/facebook/common/json/jsonmirror/a/k;
.super Lcom/facebook/common/json/jsonmirror/a/c;
.source "JMStaticKeysDict.java"


# static fields
.field protected static final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/common/json/jsonmirror/b;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field public final g:Z

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/common/w/s",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;>;"
        }
    .end annotation
.end field

.field private final k:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor",
            "<+",
            "Lcom/facebook/common/json/jsonmirror/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/common/json/jsonmirror/a/k;

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    .line 128
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/common/json/jsonmirror/a/k;->h:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/Map;Z)V
    .locals 3
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
            "Lcom/facebook/common/w/s",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;>;Z)V"
        }
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/common/json/jsonmirror/a/c;-><init>()V

    .line 47
    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/k;->k:Ljava/lang/reflect/Constructor;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    iget-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/k;->k:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 53
    iput-object p2, p0, Lcom/facebook/common/json/jsonmirror/a/k;->j:Ljava/util/Map;

    .line 54
    iput-boolean p3, p0, Lcom/facebook/common/json/jsonmirror/a/k;->g:Z

    .line 55
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    new-instance v0, Lcom/facebook/common/json/jsonmirror/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "You need to add a no-argument constructor to class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/common/json/jsonmirror/a/k;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to use it with jsonmirror."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/f;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .prologue
    .line 136
    const/4 v1, 0x0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 140
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/k;->h:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 141
    if-eqz v0, :cond_0

    .line 142
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    move-object v3, v0

    move-object v0, v1

    .line 148
    :goto_0
    if-nez v0, :cond_1

    move-object v1, v2

    .line 153
    :goto_1
    if-eqz v1, :cond_1

    if-nez v0, :cond_1

    .line 156
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 160
    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 161
    invoke-interface {v3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_1

    .line 144
    :cond_0
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 145
    sget-object v3, Lcom/facebook/common/json/jsonmirror/a/k;->h:Ljava/util/Map;

    invoke-interface {v3, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v3, v0

    move-object v0, v1

    goto :goto_0

    .line 168
    :cond_1
    if-nez v0, :cond_2

    .line 169
    new-instance v0, Lcom/facebook/common/json/jsonmirror/e;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cannot find field "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " in class "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/common/json/jsonmirror/e;-><init>(Ljava/lang/String;)V

    throw v0

    .line 172
    :cond_2
    return-object v0

    .line 162
    :catch_0
    move-exception v4

    goto :goto_2
.end method

.method public static a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 96
    const/4 v0, 0x0

    .line 97
    invoke-static {p0, p1}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 99
    if-eqz v1, :cond_0

    .line 101
    :try_start_0
    invoke-virtual {v1, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    const/4 v0, 0x1

    .line 108
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 109
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to write to field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 111
    :cond_1
    return-void

    .line 103
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private static b(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 114
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 115
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 116
    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 117
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 119
    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/common/json/jsonmirror/b;
    .locals 3

    .prologue
    .line 70
    :try_start_0
    iget-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/k;->k:Ljava/lang/reflect/Constructor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/json/jsonmirror/b;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 80
    :goto_0
    return-object v0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    sget-object v1, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    const-string v2, "Illegal argument exception"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    .line 73
    :catch_1
    move-exception v0

    .line 74
    sget-object v1, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    const-string v2, "Instantiation exception"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 75
    :catch_2
    move-exception v0

    .line 76
    sget-object v1, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    const-string v2, "Illegal access exception"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 77
    :catch_3
    move-exception v0

    .line 78
    sget-object v1, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    const-string v2, "Invocation target exception"

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/common/w/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/common/w/s",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/common/json/jsonmirror/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/common/json/jsonmirror/a/k;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/s;

    return-object v0
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;D)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 224
    const/4 v0, 0x0

    .line 225
    invoke-static {p1, p2}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 227
    if-eqz v2, :cond_1

    .line 228
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    .line 230
    :try_start_0
    const-class v4, Ljava/lang/Double;

    if-eq v3, v4, :cond_0

    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v3, v4, :cond_3

    .line 231
    :cond_0
    invoke-virtual {v2, p1, p3, p4}, Ljava/lang/reflect/Field;->setDouble(Ljava/lang/Object;D)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 242
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 243
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to write to field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 245
    :cond_2
    return-void

    .line 233
    :cond_3
    :try_start_1
    const-class v4, Ljava/lang/Float;

    if-eq v3, v4, :cond_4

    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v3, v4, :cond_1

    .line 234
    :cond_4
    double-to-float v3, p3

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v1

    .line 235
    goto :goto_0

    .line 237
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;J)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 198
    const/4 v0, 0x0

    .line 199
    invoke-static {p1, p2}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 201
    if-eqz v2, :cond_1

    .line 202
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    .line 204
    :try_start_0
    const-class v4, Ljava/lang/Long;

    if-eq v3, v4, :cond_0

    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v3, v4, :cond_3

    .line 205
    :cond_0
    invoke-virtual {v2, p1, p3, p4}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 216
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 217
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to write to field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 219
    :cond_2
    return-void

    .line 207
    :cond_3
    :try_start_1
    const-class v4, Ljava/lang/Integer;

    if-eq v3, v4, :cond_4

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v3, v4, :cond_1

    .line 208
    :cond_4
    long-to-int v3, p3

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v1

    .line 209
    goto :goto_0

    .line 211
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Lcom/facebook/common/json/jsonmirror/b;)V
    .locals 0

    .prologue
    .line 262
    invoke-static {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/Object;)V

    .line 263
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 250
    invoke-static {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/Object;)V

    .line 251
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/json/jsonmirror/b;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 256
    invoke-static {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/Object;)V

    .line 257
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/json/jsonmirror/b;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 268
    invoke-static {p1, p2, p3}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Ljava/lang/Object;)V

    .line 269
    return-void
.end method

.method public a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-static {p1, p2}, Lcom/facebook/common/json/jsonmirror/a/k;->a(Lcom/facebook/common/json/jsonmirror/b;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 181
    if-eqz v1, :cond_0

    .line 183
    :try_start_0
    invoke-virtual {v1, p1, p3}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    const/4 v0, 0x1

    .line 190
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 191
    sget-object v0, Lcom/facebook/common/json/jsonmirror/a/k;->i:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to write to field "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 193
    :cond_1
    return-void

    .line 185
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 85
    iget-boolean v0, p0, Lcom/facebook/common/json/jsonmirror/a/k;->g:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 90
    const-string v0, "%s<%s, %s>"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "JMStaticKeysDict"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/facebook/common/json/jsonmirror/a/k;->k:Ljava/lang/reflect/Constructor;

    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/json/jsonmirror/a/k;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/facebook/common/json/jsonmirror/a/k;->j:Ljava/util/Map;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
