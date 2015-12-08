.class public final Lcom/kik/d/b/a$d$a;
.super Lcom/c/b/as$a;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/b/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/d/b/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 2053
    invoke-direct {p0}, Lcom/c/b/as$a;-><init>()V

    .line 2162
    const/16 v0, 0x12c

    iput v0, p0, Lcom/kik/d/b/a$d$a;->b:I

    .line 2198
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$d$a;->c:Ljava/lang/Object;

    .line 2054
    invoke-static {}, Lcom/kik/d/b/a$d;->n()Z

    .line 2055
    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 2036
    invoke-direct {p0}, Lcom/kik/d/b/a$d$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$b;)V
    .locals 1

    .prologue
    .line 2059
    invoke-direct {p0, p1}, Lcom/c/b/as$a;-><init>(Lcom/c/b/as$b;)V

    .line 2162
    const/16 v0, 0x12c

    iput v0, p0, Lcom/kik/d/b/a$d$a;->b:I

    .line 2198
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/d/b/a$d$a;->c:Ljava/lang/Object;

    .line 2060
    invoke-static {}, Lcom/kik/d/b/a$d;->n()Z

    .line 2061
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$b;B)V
    .locals 0

    .prologue
    .line 2036
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$d$a;-><init>(Lcom/c/b/as$b;)V

    return-void
.end method

.method private d(Lcom/c/b/bd;)Lcom/kik/d/b/a$d$a;
    .locals 1

    .prologue
    .line 2110
    instance-of v0, p1, Lcom/kik/d/b/a$d;

    if-eqz v0, :cond_0

    .line 2111
    check-cast p1, Lcom/kik/d/b/a$d;

    invoke-virtual {p0, p1}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;

    move-result-object p0

    .line 2114
    :goto_0
    return-object p0

    .line 2113
    :cond_0
    invoke-super {p0, p1}, Lcom/c/b/as$a;->a(Lcom/c/b/bd;)Lcom/c/b/a$a;

    goto :goto_0
.end method

.method private d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$d$a;
    .locals 4

    .prologue
    .line 2147
    const/4 v2, 0x0

    .line 2149
    :try_start_0
    sget-object v0, Lcom/kik/d/b/a$d;->c:Lcom/c/b/bk;

    invoke-interface {v0, p1, p2}, Lcom/c/b/bk;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$d;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2154
    if-eqz v0, :cond_0

    .line 2155
    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;

    .line 2158
    :cond_0
    return-object p0

    .line 2150
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 2151
    :try_start_1
    invoke-virtual {v1}, Lcom/c/b/av;->a()Lcom/c/b/be;

    move-result-object v0

    check-cast v0, Lcom/kik/d/b/a$d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2152
    :try_start_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2154
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    if-eqz v1, :cond_1

    .line 2155
    invoke-virtual {p0, v1}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;

    :cond_1
    throw v0

    .line 2154
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/bd;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 2036
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$d$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/a$a;
    .locals 1

    .prologue
    .line 2036
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$d$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$d$a;
    .locals 1

    .prologue
    .line 2119
    invoke-static {}, Lcom/kik/d/b/a$d;->m()Lcom/kik/d/b/a$d;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 2130
    :goto_0
    return-object p0

    .line 2120
    :cond_0
    invoke-virtual {p1}, Lcom/kik/d/b/a$d;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2121
    invoke-virtual {p1}, Lcom/kik/d/b/a$d;->i()Lcom/kik/d/b/a$f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$f;)Lcom/kik/d/b/a$d$a;

    .line 2123
    :cond_1
    invoke-virtual {p1}, Lcom/kik/d/b/a$d;->j()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2124
    iget v0, p0, Lcom/kik/d/b/a$d$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$d$a;->a:I

    .line 2125
    invoke-static {p1}, Lcom/kik/d/b/a$d;->b(Lcom/kik/d/b/a$d;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/d/b/a$d$a;->c:Ljava/lang/Object;

    .line 2126
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->q()V

    .line 2128
    :cond_2
    invoke-static {p1}, Lcom/kik/d/b/a$d;->c(Lcom/kik/d/b/a$d;)Lcom/c/b/by;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/kik/d/b/a$d$a;->d(Lcom/c/b/by;)Lcom/c/b/as$a;

    .line 2129
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->q()V

    goto :goto_0
.end method

.method public final a(Lcom/kik/d/b/a$f;)Lcom/kik/d/b/a$d$a;
    .locals 1

    .prologue
    .line 2180
    if-nez p1, :cond_0

    .line 2181
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 2183
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$d$a;->a:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/kik/d/b/a$d$a;->a:I

    .line 2184
    invoke-virtual {p1}, Lcom/kik/d/b/a$f;->a()I

    move-result v0

    iput v0, p0, Lcom/kik/d/b/a$d$a;->b:I

    .line 2185
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->q()V

    .line 2186
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lcom/kik/d/b/a$d$a;
    .locals 1

    .prologue
    .line 2259
    if-nez p1, :cond_0

    .line 2260
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 2262
    :cond_0
    iget v0, p0, Lcom/kik/d/b/a$d$a;->a:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/kik/d/b/a$d$a;->a:I

    .line 2263
    iput-object p1, p0, Lcom/kik/d/b/a$d$a;->c:Ljava/lang/Object;

    .line 2264
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->q()V

    .line 2265
    return-object p0
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 2134
    iget v2, p0, Lcom/kik/d/b/a$d$a;->a:I

    and-int/lit8 v2, v2, 0x1

    if-ne v2, v1, :cond_1

    move v2, v1

    :goto_0
    if-nez v2, :cond_2

    .line 2140
    :cond_0
    :goto_1
    return v0

    :cond_1
    move v2, v0

    .line 2134
    goto :goto_0

    .line 2137
    :cond_2
    iget v2, p0, Lcom/kik/d/b/a$d$a;->a:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_3

    move v2, v1

    :goto_2
    if-eqz v2, :cond_0

    move v0, v1

    .line 2140
    goto :goto_1

    :cond_3
    move v2, v0

    .line 2137
    goto :goto_2
.end method

.method public final synthetic b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/b$a;
    .locals 1

    .prologue
    .line 2036
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$d$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/bd;)Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 2036
    invoke-direct {p0, p1}, Lcom/kik/d/b/a$d$a;->d(Lcom/c/b/bd;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 2036
    invoke-direct {p0, p1, p2}, Lcom/kik/d/b/a$d$a;->d(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    return-object v0
.end method

.method protected final d()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 2047
    invoke-static {}, Lcom/kik/d/b/a;->d()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/d/b/a$d;

    const-class v2, Lcom/kik/d/b/a$d$a;

    .line 2048
    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lcom/c/b/ak$a;
    .locals 1

    .prologue
    .line 2077
    invoke-static {}, Lcom/kik/d/b/a;->c()Lcom/c/b/ak$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 2036
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->s()Lcom/kik/d/b/a$d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 2036
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->r()Lcom/kik/d/b/a$d;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic j()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 2036
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->r()Lcom/kik/d/b/a$d;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lcom/kik/d/b/a$d;
    .locals 2

    .prologue
    .line 2085
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->s()Lcom/kik/d/b/a$d;

    move-result-object v0

    .line 2086
    invoke-virtual {v0}, Lcom/kik/d/b/a$d;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2087
    invoke-static {v0}, Lcom/kik/d/b/a$d$a;->b(Lcom/c/b/bd;)Lcom/c/b/bx;

    move-result-object v0

    throw v0

    .line 2089
    :cond_0
    return-object v0
.end method

.method public final s()Lcom/kik/d/b/a$d;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2093
    new-instance v2, Lcom/kik/d/b/a$d;

    invoke-direct {v2, p0, v1}, Lcom/kik/d/b/a$d;-><init>(Lcom/c/b/as$a;B)V

    .line 2094
    iget v3, p0, Lcom/kik/d/b/a$d$a;->a:I

    .line 2096
    and-int/lit8 v4, v3, 0x1

    if-ne v4, v0, :cond_1

    .line 2099
    :goto_0
    iget v1, p0, Lcom/kik/d/b/a$d$a;->b:I

    invoke-static {v2, v1}, Lcom/kik/d/b/a$d;->a(Lcom/kik/d/b/a$d;I)I

    .line 2100
    and-int/lit8 v1, v3, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    .line 2101
    or-int/lit8 v0, v0, 0x2

    .line 2103
    :cond_0
    iget-object v1, p0, Lcom/kik/d/b/a$d$a;->c:Ljava/lang/Object;

    invoke-static {v2, v1}, Lcom/kik/d/b/a$d;->a(Lcom/kik/d/b/a$d;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2104
    invoke-static {v2, v0}, Lcom/kik/d/b/a$d;->b(Lcom/kik/d/b/a$d;I)I

    .line 2105
    invoke-virtual {p0}, Lcom/kik/d/b/a$d$a;->l()V

    .line 2106
    return-object v2

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public final synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 2036
    invoke-static {}, Lcom/kik/d/b/a$d;->m()Lcom/kik/d/b/a$d;

    move-result-object v0

    return-object v0
.end method
