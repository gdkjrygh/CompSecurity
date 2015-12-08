.class final Lcom/c/a/b/ah;
.super Lcom/c/a/b/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/b/ah$a;,
        Lcom/c/a/b/ah$b;
    }
.end annotation


# instance fields
.field private final transient a:[Lcom/c/a/b/p;

.field private final transient b:[Lcom/c/a/b/p;

.field private final transient c:I


# direct methods
.method constructor <init>(I[Lcom/c/a/b/p$a;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 53
    invoke-direct {p0}, Lcom/c/a/b/o;-><init>()V

    .line 54
    new-array v0, p1, [Lcom/c/a/b/p;

    iput-object v0, p0, Lcom/c/a/b/ah;->a:[Lcom/c/a/b/p;

    .line 55
    invoke-static {p1}, Lcom/c/a/b/h;->b(I)I

    move-result v0

    .line 56
    new-array v1, v0, [Lcom/c/a/b/p;

    iput-object v1, p0, Lcom/c/a/b/ah;->b:[Lcom/c/a/b/p;

    .line 57
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/c/a/b/ah;->c:I

    move v4, v2

    .line 58
    :goto_0
    if-ge v4, p1, :cond_4

    .line 60
    aget-object v0, p2, v4

    .line 61
    invoke-virtual {v0}, Lcom/c/a/b/p$a;->getKey()Ljava/lang/Object;

    move-result-object v5

    .line 62
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Lcom/c/a/b/h;->a(I)I

    move-result v1

    iget v3, p0, Lcom/c/a/b/ah;->c:I

    and-int v6, v1, v3

    .line 63
    iget-object v1, p0, Lcom/c/a/b/ah;->b:[Lcom/c/a/b/p;

    aget-object v3, v1, v6

    .line 65
    if-nez v3, :cond_0

    .line 68
    :goto_1
    iget-object v1, p0, Lcom/c/a/b/ah;->b:[Lcom/c/a/b/p;

    aput-object v0, v1, v6

    .line 69
    iget-object v1, p0, Lcom/c/a/b/ah;->a:[Lcom/c/a/b/p;

    aput-object v0, v1, v4

    .line 70
    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/c/a/b/p;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    :goto_3
    const-string v6, "key"

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x22

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v5, v6

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Multiple entries with same "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ": "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " and "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 65
    :cond_0
    new-instance v1, Lcom/c/a/b/ah$b;

    invoke-direct {v1, v0, v3}, Lcom/c/a/b/ah$b;-><init>(Lcom/c/a/b/p;Lcom/c/a/b/p;)V

    move-object v0, v1

    goto :goto_1

    :cond_1
    move v1, v2

    .line 70
    goto :goto_3

    :cond_2
    invoke-virtual {v3}, Lcom/c/a/b/p;->a()Lcom/c/a/b/p;

    move-result-object v1

    move-object v3, v1

    goto :goto_2

    .line 58
    :cond_3
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto/16 :goto_0

    .line 72
    :cond_4
    return-void
.end method

.method static synthetic a(Lcom/c/a/b/ah;)[Lcom/c/a/b/p;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/c/a/b/ah;->a:[Lcom/c/a/b/p;

    return-object v0
.end method


# virtual methods
.method final c()Lcom/c/a/b/v;
    .locals 2

    .prologue
    .line 185
    new-instance v0, Lcom/c/a/b/ah$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/a/b/ah$a;-><init>(Lcom/c/a/b/ah;B)V

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 152
    if-nez p1, :cond_1

    .line 171
    :cond_0
    :goto_0
    return-object v0

    .line 155
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Lcom/c/a/b/h;->a(I)I

    move-result v1

    iget v2, p0, Lcom/c/a/b/ah;->c:I

    and-int/2addr v1, v2

    .line 156
    iget-object v2, p0, Lcom/c/a/b/ah;->b:[Lcom/c/a/b/p;

    aget-object v1, v2, v1

    .line 157
    :goto_1
    if-eqz v1, :cond_0

    .line 159
    invoke-virtual {v1}, Lcom/c/a/b/p;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 167
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 168
    invoke-virtual {v1}, Lcom/c/a/b/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    .line 158
    :cond_2
    invoke-virtual {v1}, Lcom/c/a/b/p;->a()Lcom/c/a/b/p;

    move-result-object v1

    goto :goto_1
.end method

.method public final size()I
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/c/a/b/ah;->a:[Lcom/c/a/b/p;

    array-length v0, v0

    return v0
.end method
