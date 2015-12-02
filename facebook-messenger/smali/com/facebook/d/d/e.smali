.class public Lcom/facebook/d/d/e;
.super Ljava/lang/Object;
.source "SqlQueryBuilder.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    return-void
.end method

.method public static a()Lcom/facebook/d/d/f;
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lcom/facebook/d/d/f;

    invoke-direct {v0}, Lcom/facebook/d/d/f;-><init>()V

    return-object v0
.end method

.method public static varargs a([Lcom/facebook/d/d/j;)Lcom/facebook/d/d/f;
    .locals 4

    .prologue
    .line 23
    new-instance v1, Lcom/facebook/d/d/f;

    invoke-direct {v1}, Lcom/facebook/d/d/f;-><init>()V

    .line 24
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 25
    invoke-virtual {v1, v3}, Lcom/facebook/d/d/f;->a(Lcom/facebook/d/d/j;)V

    .line 24
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 27
    :cond_0
    return-object v1
.end method

.method public static a(Ljava/lang/String;)Lcom/facebook/d/d/j;
    .locals 1

    .prologue
    .line 75
    new-instance v0, Lcom/facebook/d/d/o;

    invoke-direct {v0, p0}, Lcom/facebook/d/d/o;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;
    .locals 1

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/d/d/i;

    invoke-direct {v0, p0, p1}, Lcom/facebook/d/d/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;
    .locals 1

    .prologue
    .line 51
    new-instance v0, Lcom/facebook/d/d/m;

    invoke-direct {v0, p0, p1}, Lcom/facebook/d/d/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static varargs b([Lcom/facebook/d/d/j;)Lcom/facebook/d/d/n;
    .locals 4

    .prologue
    .line 35
    new-instance v1, Lcom/facebook/d/d/n;

    invoke-direct {v1}, Lcom/facebook/d/d/n;-><init>()V

    .line 36
    array-length v2, p0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, p0, v0

    .line 37
    invoke-virtual {v1, v3}, Lcom/facebook/d/d/n;->a(Lcom/facebook/d/d/j;)V

    .line 36
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 39
    :cond_0
    return-object v1
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;
    .locals 1

    .prologue
    .line 55
    new-instance v0, Lcom/facebook/d/d/k;

    invoke-direct {v0, p0, p1}, Lcom/facebook/d/d/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;
    .locals 1

    .prologue
    .line 59
    new-instance v0, Lcom/facebook/d/d/l;

    invoke-direct {v0, p0, p1}, Lcom/facebook/d/d/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
