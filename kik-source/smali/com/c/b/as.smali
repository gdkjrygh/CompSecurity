.class public abstract Lcom/c/b/as;
.super Lcom/c/b/a;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/as$g;,
        Lcom/c/b/as$h;,
        Lcom/c/b/as$f;,
        Lcom/c/b/as$c;,
        Lcom/c/b/as$d;,
        Lcom/c/b/as$e;,
        Lcom/c/b/as$a;,
        Lcom/c/b/as$b;
    }
.end annotation


# static fields
.field protected static d:Z


# instance fields
.field protected e:Lcom/c/b/by;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    sput-boolean v0, Lcom/c/b/as;->d:Z

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 77
    invoke-direct {p0}, Lcom/c/b/a;-><init>()V

    .line 78
    invoke-static {}, Lcom/c/b/by;->e()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as;->e:Lcom/c/b/by;

    .line 79
    return-void
.end method

.method protected constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    .line 81
    invoke-direct {p0}, Lcom/c/b/a;-><init>()V

    .line 82
    invoke-virtual {p1}, Lcom/c/b/as$a;->f()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as;->e:Lcom/c/b/by;

    .line 83
    return-void
.end method

.method public static a(Ljava/lang/Class;Lcom/c/b/bd;)Lcom/c/b/as$h;
    .locals 2

    .prologue
    .line 1381
    new-instance v0, Lcom/c/b/as$h;

    sget v1, Lcom/c/b/an$a;->a:I

    invoke-direct {v0, p0, p1, v1}, Lcom/c/b/as$h;-><init>(Ljava/lang/Class;Lcom/c/b/bd;I)V

    return-object v0
.end method

.method static synthetic a(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    invoke-static {p0, p1, p2}, Lcom/c/b/as;->b(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 1

    .prologue
    .line 63
    invoke-static {p0, p1, p2}, Lcom/c/b/as;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/as;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 63
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/c/b/as;->a(Z)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private a(Z)Ljava/util/Map;
    .locals 5

    .prologue
    .line 121
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 123
    invoke-virtual {p0}, Lcom/c/b/as;->c_()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;)Lcom/c/b/ak$a;

    move-result-object v0

    .line 124
    invoke-virtual {v0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 125
    invoke-virtual {v0}, Lcom/c/b/ak$f;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 126
    invoke-virtual {p0, v0}, Lcom/c/b/as;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 127
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 128
    invoke-virtual {v2, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 131
    :cond_1
    invoke-virtual {p0, v0}, Lcom/c/b/as;->a(Lcom/c/b/ak$f;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 132
    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v1

    sget-object v4, Lcom/c/b/ak$f$a;->f:Lcom/c/b/ak$f$a;

    if-ne v1, v4, :cond_2

    .line 134
    invoke-virtual {p0}, Lcom/c/b/as;->c_()Lcom/c/b/as$g;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/c/b/as$g$a;->b(Lcom/c/b/as;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {p0, v0}, Lcom/c/b/as;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 141
    :cond_3
    return-object v2
.end method

.method private static varargs b(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 1713
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 1714
    :catch_0
    move-exception v0

    .line 1715
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1718
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 1720
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_0

    .line 1721
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 1722
    :cond_0
    instance-of v1, v0, Ljava/lang/Error;

    if-eqz v1, :cond_1

    .line 1723
    check-cast v0, Ljava/lang/Error;

    throw v0

    .line 1725
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static varargs b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    .prologue
    .line 1701
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 1702
    :catch_0
    move-exception v0

    .line 1703
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Generated message class \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" missing method \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method K()Ljava/util/Map;
    .locals 1

    .prologue
    .line 191
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/c/b/as;->a(Z)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected L()V
    .locals 0

    .prologue
    .line 281
    return-void
.end method

.method protected abstract a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
.end method

.method public a(Lcom/c/b/h;)V
    .locals 1

    .prologue
    .line 259
    invoke-virtual {p0}, Lcom/c/b/as;->K()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/c/b/bh;->a(Lcom/c/b/bd;Ljava/util/Map;Lcom/c/b/h;)V

    .line 260
    return-void
.end method

.method public a()Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 146
    invoke-virtual {p0}, Lcom/c/b/as;->c_()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;)Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 148
    invoke-virtual {v0}, Lcom/c/b/ak$f;->m()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 149
    invoke-virtual {p0, v0}, Lcom/c/b/as;->a(Lcom/c/b/ak$f;)Z

    move-result v3

    if-nez v3, :cond_1

    move v0, v1

    .line 171
    :goto_0
    return v0

    .line 154
    :cond_1
    invoke-virtual {v0}, Lcom/c/b/ak$f;->f()Lcom/c/b/ak$f$a;

    move-result-object v3

    sget-object v4, Lcom/c/b/ak$f$a;->i:Lcom/c/b/ak$f$a;

    if-ne v3, v4, :cond_0

    .line 155
    invoke-virtual {v0}, Lcom/c/b/ak$f;->o()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 157
    invoke-virtual {p0, v0}, Lcom/c/b/as;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 158
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    .line 159
    invoke-interface {v0}, Lcom/c/b/bd;->a()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 160
    goto :goto_0

    .line 164
    :cond_3
    invoke-virtual {p0, v0}, Lcom/c/b/as;->a(Lcom/c/b/ak$f;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v0}, Lcom/c/b/as;->b(Lcom/c/b/ak$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bd;

    invoke-interface {v0}, Lcom/c/b/bd;->a()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 165
    goto :goto_0

    .line 171
    :cond_4
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a(Lcom/c/b/ak$f;)Z
    .locals 1

    .prologue
    .line 207
    invoke-virtual {p0}, Lcom/c/b/as;->c_()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/c/b/as$g$a;->c(Lcom/c/b/as;)Z

    move-result v0

    return v0
.end method

.method protected a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z
    .locals 1

    .prologue
    .line 254
    invoke-virtual {p2, p4, p1}, Lcom/c/b/by$a;->a(ILcom/c/b/g;)Z

    move-result v0

    return v0
.end method

.method public b()I
    .locals 2

    .prologue
    .line 264
    iget v0, p0, Lcom/c/b/as;->a:I

    .line 265
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 271
    :goto_0
    return v0

    .line 269
    :cond_0
    invoke-virtual {p0}, Lcom/c/b/as;->K()Ljava/util/Map;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/c/b/bh;->a(Lcom/c/b/bd;Ljava/util/Map;)I

    move-result v0

    iput v0, p0, Lcom/c/b/as;->a:I

    .line 271
    iget v0, p0, Lcom/c/b/as;->a:I

    goto :goto_0
.end method

.method public b(Lcom/c/b/ak$f;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 212
    invoke-virtual {p0}, Lcom/c/b/as;->c_()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;Lcom/c/b/ak$f;)Lcom/c/b/as$g$a;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/c/b/as$g$a;->a(Lcom/c/b/as;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected abstract c_()Lcom/c/b/as$g;
.end method

.method public d_()Ljava/util/Map;
    .locals 1

    .prologue
    .line 176
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/c/b/as;->a(Z)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 109
    invoke-virtual {p0}, Lcom/c/b/as;->c_()Lcom/c/b/as$g;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/as$g;->a(Lcom/c/b/as$g;)Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/c/b/by;
    .locals 2

    .prologue
    .line 241
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is supposed to be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t()Lcom/c/b/bk;
    .locals 2

    .prologue
    .line 86
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This is supposed to be overridden by subclasses."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
