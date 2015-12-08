.class final Lcom/c/b/ak$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/ak$b$a;,
        Lcom/c/b/ak$b$b;,
        Lcom/c/b/ak$b$c;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Ljava/util/Set;

.field private c:Z

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1959
    const-class v0, Lcom/c/b/ak;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/c/b/ak$b;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>([Lcom/c/b/ak$g;)V
    .locals 3

    .prologue
    .line 1968
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2001
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ak$b;->d:Ljava/util/Map;

    .line 2003
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ak$b;->e:Ljava/util/Map;

    .line 2005
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/c/b/ak$b;->f:Ljava/util/Map;

    .line 1969
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/c/b/ak$b;->b:Ljava/util/Set;

    .line 1970
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/ak$b;->c:Z

    .line 1972
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 1973
    iget-object v1, p0, Lcom/c/b/ak$b;->b:Ljava/util/Set;

    aget-object v2, p1, v0

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1974
    aget-object v1, p1, v0

    invoke-direct {p0, v1}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$g;)V

    .line 1972
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1977
    :cond_0
    iget-object v0, p0, Lcom/c/b/ak$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$g;

    .line 1979
    :try_start_0
    invoke-virtual {v0}, Lcom/c/b/ak$g;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$g;)V
    :try_end_0
    .catch Lcom/c/b/ak$c; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 1984
    :catch_0
    move-exception v0

    sget-boolean v0, Lcom/c/b/ak$b;->a:Z

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 1987
    :cond_2
    return-void
.end method

.method private a(Ljava/lang/String;I)Lcom/c/b/ak$h;
    .locals 3

    .prologue
    .line 2018
    iget-object v0, p0, Lcom/c/b/ak$b;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$h;

    .line 2019
    if-eqz v0, :cond_2

    .line 2020
    sget v1, Lcom/c/b/ak$b$c;->c:I

    if-eq p2, v1, :cond_1

    sget v1, Lcom/c/b/ak$b$c;->a:I

    if-ne p2, v1, :cond_0

    invoke-static {v0}, Lcom/c/b/ak$b;->b(Lcom/c/b/ak$h;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    sget v1, Lcom/c/b/ak$b$c;->b:I

    if-ne p2, v1, :cond_2

    invoke-static {v0}, Lcom/c/b/ak$b;->c(Lcom/c/b/ak$h;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2038
    :cond_1
    :goto_0
    return-object v0

    .line 2027
    :cond_2
    iget-object v0, p0, Lcom/c/b/ak$b;->b:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$g;

    .line 2028
    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    iget-object v0, v0, Lcom/c/b/ak$b;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$h;

    .line 2029
    if-eqz v0, :cond_3

    .line 2030
    sget v2, Lcom/c/b/ak$b$c;->c:I

    if-eq p2, v2, :cond_1

    sget v2, Lcom/c/b/ak$b$c;->a:I

    if-ne p2, v2, :cond_4

    invoke-static {v0}, Lcom/c/b/ak$b;->b(Lcom/c/b/ak$h;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_4
    sget v2, Lcom/c/b/ak$b$c;->b:I

    if-ne p2, v2, :cond_3

    invoke-static {v0}, Lcom/c/b/ak$b;->c(Lcom/c/b/ak$h;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_0

    .line 2038
    :cond_5
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/c/b/ak$b;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 1959
    iget-object v0, p0, Lcom/c/b/ak$b;->e:Ljava/util/Map;

    return-object v0
.end method

.method private a(Lcom/c/b/ak$g;)V
    .locals 3

    .prologue
    .line 1991
    invoke-virtual {p1}, Lcom/c/b/ak$g;->j()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$g;

    .line 1992
    iget-object v2, p0, Lcom/c/b/ak$b;->b:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1993
    invoke-direct {p0, v0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$g;)V

    goto :goto_0

    .line 1996
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/c/b/ak$b;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 1959
    iget-object v0, p0, Lcom/c/b/ak$b;->f:Ljava/util/Map;

    return-object v0
.end method

.method private static b(Lcom/c/b/ak$h;)Z
    .locals 1

    .prologue
    .line 2043
    instance-of v0, p0, Lcom/c/b/ak$a;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/c/b/ak$d;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Lcom/c/b/ak$h;)Z
    .locals 1

    .prologue
    .line 2049
    instance-of v0, p0, Lcom/c/b/ak$a;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/c/b/ak$d;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/c/b/ak$b$b;

    if-nez v0, :cond_0

    instance-of v0, p0, Lcom/c/b/ak$k;

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method final a(Ljava/lang/String;)Lcom/c/b/ak$h;
    .locals 1

    .prologue
    .line 2010
    sget v0, Lcom/c/b/ak$b$c;->c:I

    invoke-direct {p0, p1, v0}, Lcom/c/b/ak$b;->a(Ljava/lang/String;I)Lcom/c/b/ak$h;

    move-result-object v0

    return-object v0
.end method

.method final a(Ljava/lang/String;Lcom/c/b/ak$h;I)Lcom/c/b/ak$h;
    .locals 9

    .prologue
    const/4 v7, 0x0

    const/4 v6, -0x1

    .line 2069
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2071
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 2072
    invoke-direct {p0, v0, p3}, Lcom/c/b/ak$b;->a(Ljava/lang/String;I)Lcom/c/b/ak$h;

    move-result-object v1

    move-object v8, v0

    move-object v0, v1

    move-object v1, v8

    .line 2134
    :goto_0
    if-nez v0, :cond_0

    .line 2135
    iget-boolean v0, p0, Lcom/c/b/ak$b;->c:Z

    if-eqz v0, :cond_5

    sget v0, Lcom/c/b/ak$b$c;->a:I

    if-ne p3, v0, :cond_5

    .line 2136
    invoke-static {}, Lcom/c/b/ak;->a()Ljava/util/logging/Logger;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The descriptor for message type \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" can not be found and a placeholder is created for it"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 2144
    new-instance v0, Lcom/c/b/ak$a;

    invoke-direct {v0, v1}, Lcom/c/b/ak$a;-><init>(Ljava/lang/String;)V

    .line 2147
    iget-object v1, p0, Lcom/c/b/ak$b;->b:Ljava/util/Set;

    invoke-virtual {v0}, Lcom/c/b/ak$h;->d()Lcom/c/b/ak$g;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 2154
    :cond_0
    return-object v0

    .line 2087
    :cond_1
    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    .line 2089
    if-ne v2, v6, :cond_2

    move-object v0, p1

    .line 2097
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/c/b/ak$h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2102
    :goto_2
    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    .line 2103
    if-ne v4, v6, :cond_3

    .line 2105
    invoke-direct {p0, p1, p3}, Lcom/c/b/ak$b;->a(Ljava/lang/String;I)Lcom/c/b/ak$h;

    move-result-object v0

    move-object v1, p1

    .line 2106
    goto :goto_0

    .line 2092
    :cond_2
    invoke-virtual {p1, v7, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 2108
    :cond_3
    add-int/lit8 v1, v4, 0x1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2111
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2112
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget v5, Lcom/c/b/ak$b$c;->b:I

    invoke-direct {p0, v1, v5}, Lcom/c/b/ak$b;->a(Ljava/lang/String;I)Lcom/c/b/ak$h;

    move-result-object v1

    .line 2115
    if-eqz v1, :cond_4

    .line 2116
    if-eq v2, v6, :cond_6

    .line 2120
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2121
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lcom/c/b/ak$b;->a(Ljava/lang/String;I)Lcom/c/b/ak$h;

    move-result-object v0

    .line 2124
    :goto_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    .line 2129
    :cond_4
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_2

    .line 2150
    :cond_5
    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not defined."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p2, v1, v7}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_6
    move-object v0, v1

    goto :goto_3
.end method

.method final a(Lcom/c/b/ak$e;)V
    .locals 3

    .prologue
    .line 2293
    new-instance v1, Lcom/c/b/ak$b$a;

    invoke-virtual {p1}, Lcom/c/b/ak$e;->e()Lcom/c/b/ak$d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/c/b/ak$e;->a()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/c/b/ak$b$a;-><init>(Lcom/c/b/ak$h;I)V

    .line 2295
    iget-object v0, p0, Lcom/c/b/ak$b;->f:Ljava/util/Map;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$e;

    .line 2296
    if-eqz v0, :cond_0

    .line 2297
    iget-object v2, p0, Lcom/c/b/ak$b;->f:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2301
    :cond_0
    return-void
.end method

.method final a(Lcom/c/b/ak$f;)V
    .locals 4

    .prologue
    .line 2274
    new-instance v1, Lcom/c/b/ak$b$a;

    invoke-virtual {p1}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/c/b/ak$f;->e()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lcom/c/b/ak$b$a;-><init>(Lcom/c/b/ak$h;I)V

    .line 2276
    iget-object v0, p0, Lcom/c/b/ak$b;->e:Ljava/util/Map;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$f;

    .line 2277
    if-eqz v0, :cond_0

    .line 2278
    iget-object v2, p0, Lcom/c/b/ak$b;->e:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2279
    new-instance v1, Lcom/c/b/ak$c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Field number "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/c/b/ak$f;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " has already been used in \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/c/b/ak$f;->t()Lcom/c/b/ak$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/c/b/ak$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" by field \""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/c/b/ak$f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\"."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v1

    .line 2285
    :cond_0
    return-void
.end method

.method final a(Lcom/c/b/ak$h;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 2164
    invoke-virtual {p1}, Lcom/c/b/ak$h;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/c/b/ak$c;

    const-string v2, "Missing name."

    invoke-direct {v0, p1, v2, v1}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_0
    const/4 v0, 0x1

    move v2, v0

    move v0, v1

    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_4

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x80

    if-lt v4, v5, :cond_1

    move v2, v1

    :cond_1
    invoke-static {v4}, Ljava/lang/Character;->isLetter(C)Z

    move-result v5

    if-nez v5, :cond_3

    const/16 v5, 0x5f

    if-eq v4, v5, :cond_3

    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-eqz v4, :cond_2

    if-gtz v0, :cond_3

    :cond_2
    move v2, v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    if-nez v2, :cond_5

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" is not a valid identifier."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v2, v1}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 2166
    :cond_5
    invoke-virtual {p1}, Lcom/c/b/ak$h;->c()Ljava/lang/String;

    move-result-object v2

    .line 2167
    const/16 v0, 0x2e

    invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 2169
    iget-object v0, p0, Lcom/c/b/ak$b;->d:Ljava/util/Map;

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$h;

    .line 2170
    if-eqz v0, :cond_8

    .line 2171
    iget-object v4, p0, Lcom/c/b/ak$b;->d:Ljava/util/Map;

    invoke-interface {v4, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2173
    invoke-virtual {p1}, Lcom/c/b/ak$h;->d()Lcom/c/b/ak$g;

    move-result-object v4

    invoke-virtual {v0}, Lcom/c/b/ak$h;->d()Lcom/c/b/ak$g;

    move-result-object v5

    if-ne v4, v5, :cond_7

    .line 2174
    const/4 v0, -0x1

    if-ne v3, v0, :cond_6

    .line 2175
    new-instance v0, Lcom/c/b/ak$c;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\" is already defined."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v2, v1}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 2178
    :cond_6
    new-instance v0, Lcom/c/b/ak$c;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\" is already defined in \""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\"."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, p1, v2, v1}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    .line 2184
    :cond_7
    new-instance v3, Lcom/c/b/ak$c;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\""

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\" is already defined in file \""

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/c/b/ak$h;->d()Lcom/c/b/ak$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\"."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, p1, v0, v1}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v3

    .line 2189
    :cond_8
    return-void
.end method

.method final a(Ljava/lang/String;Lcom/c/b/ak$g;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 2222
    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    .line 2224
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    move-object v1, p1

    .line 2231
    :goto_0
    iget-object v0, p0, Lcom/c/b/ak$b;->d:Ljava/util/Map;

    new-instance v2, Lcom/c/b/ak$b$b;

    invoke-direct {v2, v1, p1, p2}, Lcom/c/b/ak$b$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/c/b/ak$g;)V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/ak$h;

    .line 2234
    if-eqz v0, :cond_1

    .line 2235
    iget-object v2, p0, Lcom/c/b/ak$b;->d:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2236
    instance-of v2, v0, Lcom/c/b/ak$b$b;

    if-nez v2, :cond_1

    .line 2237
    new-instance v2, Lcom/c/b/ak$c;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\" is already defined (as something other than a package) in file \""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/c/b/ak$h;->d()Lcom/c/b/ak$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ak$g;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, p2, v0, v5}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$g;Ljava/lang/String;B)V

    throw v2

    .line 2227
    :cond_0
    invoke-virtual {p1, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, p2}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$g;)V

    .line 2228
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 2242
    :cond_1
    return-void
.end method
