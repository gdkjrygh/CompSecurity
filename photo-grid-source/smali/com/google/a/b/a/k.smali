.class public final Lcom/google/a/b/a/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/a/an;


# instance fields
.field private final a:Lcom/google/a/b/f;

.field private final b:Z


# direct methods
.method public constructor <init>(Lcom/google/a/b/f;Z)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Lcom/google/a/b/a/k;->a:Lcom/google/a/b/f;

    .line 113
    iput-boolean p2, p0, Lcom/google/a/b/a/k;->b:Z

    .line 114
    return-void
.end method

.method static synthetic a(Lcom/google/a/b/a/k;)Z
    .locals 1

    .prologue
    .line 106
    iget-boolean v0, p0, Lcom/google/a/b/a/k;->b:Z

    return v0
.end method


# virtual methods
.method public final a(Lcom/google/a/k;Lcom/google/a/c/a;)Lcom/google/a/am;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/k;",
            "Lcom/google/a/c/a",
            "<TT;>;)",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v3, 0x0

    .line 117
    invoke-virtual {p2}, Lcom/google/a/c/a;->b()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 119
    invoke-virtual {p2}, Lcom/google/a/c/a;->a()Ljava/lang/Class;

    move-result-object v1

    .line 120
    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 121
    const/4 v0, 0x0

    .line 134
    :goto_0
    return-object v0

    .line 124
    :cond_0
    invoke-static {v0}, Lcom/google/a/b/b;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    .line 125
    invoke-static {v0, v1}, Lcom/google/a/b/b;->b(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object v1

    .line 126
    aget-object v0, v1, v3

    .line 1141
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v0, v2, :cond_1

    const-class v2, Ljava/lang/Boolean;

    if-ne v0, v2, :cond_2

    :cond_1
    sget-object v4, Lcom/google/a/b/a/y;->f:Lcom/google/a/am;

    .line 127
    :goto_1
    aget-object v0, v1, v5

    invoke-static {v0}, Lcom/google/a/c/a;->a(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/a/k;->a(Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v6

    .line 128
    iget-object v0, p0, Lcom/google/a/b/a/k;->a:Lcom/google/a/b/f;

    invoke-virtual {v0, p2}, Lcom/google/a/b/f;->a(Lcom/google/a/c/a;)Lcom/google/a/b/s;

    move-result-object v7

    .line 132
    new-instance v0, Lcom/google/a/b/a/l;

    aget-object v3, v1, v3

    aget-object v5, v1, v5

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lcom/google/a/b/a/l;-><init>(Lcom/google/a/b/a/k;Lcom/google/a/k;Ljava/lang/reflect/Type;Lcom/google/a/am;Ljava/lang/reflect/Type;Lcom/google/a/am;Lcom/google/a/b/s;)V

    goto :goto_0

    .line 1141
    :cond_2
    invoke-static {v0}, Lcom/google/a/c/a;->a(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/a/k;->a(Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v4

    goto :goto_1
.end method
