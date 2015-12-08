.class public abstract Lcom/c/b/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bk;


# static fields
.field private static final a:Lcom/c/b/aq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 78
    invoke-static {}, Lcom/c/b/aq;->d()Lcom/c/b/aq;

    move-result-object v0

    sput-object v0, Lcom/c/b/c;->a:Lcom/c/b/aq;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/c/b/be;)Lcom/c/b/be;
    .locals 2

    .prologue
    .line 70
    if-eqz p0, :cond_1

    invoke-interface {p0}, Lcom/c/b/be;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 71
    instance-of v0, p0, Lcom/c/b/b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/c/b/b;

    invoke-virtual {v0}, Lcom/c/b/b;->c()Lcom/c/b/bx;

    move-result-object v0

    :goto_0
    new-instance v1, Lcom/c/b/av;

    invoke-virtual {v0}, Lcom/c/b/bx;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    throw v0

    :cond_0
    new-instance v0, Lcom/c/b/bx;

    invoke-direct {v0}, Lcom/c/b/bx;-><init>()V

    goto :goto_0

    .line 75
    :cond_1
    return-object p0
.end method

.method private a([BILcom/c/b/aq;)Lcom/c/b/be;
    .locals 3

    .prologue
    .line 136
    :try_start_0
    invoke-static {p1, p2}, Lcom/c/b/g;->a([BI)Lcom/c/b/g;

    move-result-object v1

    .line 137
    invoke-virtual {p0, v1, p3}, Lcom/c/b/c;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_1

    .line 139
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v1, v2}, Lcom/c/b/g;->a(I)V
    :try_end_1
    .catch Lcom/c/b/av; {:try_start_1 .. :try_end_1} :catch_0

    .line 143
    return-object v0

    .line 140
    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1, v0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    throw v0
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_1

    .line 144
    :catch_1
    move-exception v0

    throw v0
.end method

.method private b(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/be;
    .locals 3

    .prologue
    .line 103
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/f;->h()Lcom/c/b/g;

    move-result-object v1

    .line 104
    invoke-virtual {p0, v1, p2}, Lcom/c/b/c;->a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_1

    .line 106
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v1, v2}, Lcom/c/b/g;->a(I)V
    :try_end_1
    .catch Lcom/c/b/av; {:try_start_1 .. :try_end_1} :catch_0

    .line 110
    return-object v0

    .line 107
    :catch_0
    move-exception v1

    :try_start_2
    invoke-virtual {v1, v0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    throw v0
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_1

    .line 111
    :catch_1
    move-exception v0

    throw v0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/f;Lcom/c/b/aq;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Lcom/c/b/c;->b(Lcom/c/b/f;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/c;->a(Lcom/c/b/be;)Lcom/c/b/be;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a([B)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 49
    sget-object v0, Lcom/c/b/c;->a:Lcom/c/b/aq;

    array-length v1, p1

    invoke-direct {p0, p1, v1, v0}, Lcom/c/b/c;->a([BILcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v0

    invoke-static {v0}, Lcom/c/b/c;->a(Lcom/c/b/be;)Lcom/c/b/be;

    move-result-object v0

    return-object v0
.end method
