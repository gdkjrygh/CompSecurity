.class public final Lcom/c/a/b/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Lcom/c/a/b/ap;

.field private static final b:Ljava/util/Iterator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 72
    new-instance v0, Lcom/c/a/b/x;

    invoke-direct {v0}, Lcom/c/a/b/x;-><init>()V

    sput-object v0, Lcom/c/a/b/w;->a:Lcom/c/a/b/ap;

    .line 127
    new-instance v0, Lcom/c/a/b/aa;

    invoke-direct {v0}, Lcom/c/a/b/aa;-><init>()V

    sput-object v0, Lcom/c/a/b/w;->b:Ljava/util/Iterator;

    return-void
.end method

.method public static a()Lcom/c/a/b/ao;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 112
    sget-object v0, Lcom/c/a/b/w;->a:Lcom/c/a/b/ap;

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lcom/c/a/b/ao;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 1073
    new-instance v0, Lcom/c/a/b/z;

    invoke-direct {v0, p0}, Lcom/c/a/b/z;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static varargs a([Ljava/lang/Object;)Lcom/c/a/b/ao;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1031
    array-length v0, p0

    invoke-static {p0, v1, v0, v1}, Lcom/c/a/b/w;->a([Ljava/lang/Object;III)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method

.method static a([Ljava/lang/Object;III)Lcom/c/a/b/ap;
    .locals 2

    .prologue
    .line 1043
    if-ltz p2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/c/a/a/u;->a(Z)V

    .line 1044
    add-int v0, p1, p2

    .line 1047
    array-length v1, p0

    invoke-static {p1, v0, v1}, Lcom/c/a/a/u;->a(III)V

    .line 1048
    invoke-static {p3, p2}, Lcom/c/a/a/u;->b(II)I

    .line 1049
    if-nez p2, :cond_1

    .line 1050
    sget-object v0, Lcom/c/a/b/w;->a:Lcom/c/a/b/ap;

    .line 1058
    :goto_1
    return-object v0

    .line 1043
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 1058
    :cond_1
    new-instance v0, Lcom/c/a/b/y;

    invoke-direct {v0, p2, p3, p0, p1}, Lcom/c/a/b/y;-><init>(II[Ljava/lang/Object;I)V

    goto :goto_1
.end method

.method public static a(Ljava/util/Iterator;Ljava/lang/Object;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 202
    invoke-static {p1}, Lcom/c/a/a/w;->a(Ljava/lang/Object;)Lcom/c/a/a/v;

    move-result-object v3

    const-string v0, "predicate"

    if-nez v3, :cond_0

    new-instance v1, Ljava/lang/NullPointerException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_0
    move v0, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/c/a/a/v;->a(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_1
    if-eq v0, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1
.end method

.method public static a(Ljava/util/Iterator;Ljava/util/Iterator;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 269
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 270
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    .line 279
    :cond_1
    :goto_0
    return v0

    .line 273
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 274
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 275
    invoke-static {v1, v2}, Lcom/c/a/a/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 279
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0
.end method
