.class public final Lkik/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lkik/a/a/b;->a:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lkik/a/a/b;->b:[Ljava/lang/String;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lkik/a/a/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Lkik/a/a/a;
    .locals 6

    .prologue
    .line 31
    iget-object v1, p0, Lkik/a/a/b;->b:[Ljava/lang/String;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 33
    new-instance v0, Lkik/a/a/a;

    iget-object v1, p0, Lkik/a/a/b;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v3}, Lkik/a/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    :goto_1
    return-object v0

    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 36
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final b()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lkik/a/a/b;->b:[Ljava/lang/String;

    return-object v0
.end method
