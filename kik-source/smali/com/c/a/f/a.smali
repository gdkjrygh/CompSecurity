.class public final Lcom/c/a/f/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/c/a/a/c;

.field private static final b:Lcom/c/a/a/ab;

.field private static final c:Lcom/c/a/a/r;

.field private static final g:Lcom/c/a/a/c;

.field private static final h:Lcom/c/a/a/c;


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Lcom/c/a/b/m;

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 79
    const-string v0, ".\u3002\uff0e\uff61"

    invoke-static {v0}, Lcom/c/a/a/c;->a(Ljava/lang/CharSequence;)Lcom/c/a/a/c;

    move-result-object v0

    sput-object v0, Lcom/c/a/f/a;->a:Lcom/c/a/a/c;

    .line 81
    invoke-static {}, Lcom/c/a/a/ab;->a()Lcom/c/a/a/ab;

    move-result-object v0

    sput-object v0, Lcom/c/a/f/a;->b:Lcom/c/a/a/ab;

    .line 82
    const/16 v0, 0x2e

    invoke-static {v0}, Lcom/c/a/a/r;->a(C)Lcom/c/a/a/r;

    move-result-object v0

    sput-object v0, Lcom/c/a/f/a;->c:Lcom/c/a/a/r;

    .line 241
    const-string v0, "-_"

    invoke-static {v0}, Lcom/c/a/a/c;->a(Ljava/lang/CharSequence;)Lcom/c/a/a/c;

    move-result-object v0

    sput-object v0, Lcom/c/a/f/a;->g:Lcom/c/a/a/c;

    .line 243
    sget-object v0, Lcom/c/a/a/c;->f:Lcom/c/a/a/c;

    sget-object v1, Lcom/c/a/f/a;->g:Lcom/c/a/a/c;

    invoke-virtual {v0, v1}, Lcom/c/a/a/c;->a(Lcom/c/a/a/c;)Lcom/c/a/a/c;

    move-result-object v0

    sput-object v0, Lcom/c/a/f/a;->h:Lcom/c/a/a/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    sget-object v0, Lcom/c/a/f/a;->a:Lcom/c/a/a/c;

    invoke-virtual {v0, p1}, Lcom/c/a/a/c;->f(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 145
    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 146
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 149
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v4, 0xfd

    if-gt v1, v4, :cond_1

    move v1, v2

    :goto_0
    const-string v4, "Domain name too long: \'%s\':"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v0, v5, v3

    invoke-static {v1, v4, v5}, Lcom/c/a/a/u;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 151
    iput-object v0, p0, Lcom/c/a/f/a;->d:Ljava/lang/String;

    .line 153
    sget-object v1, Lcom/c/a/f/a;->b:Lcom/c/a/a/ab;

    invoke-virtual {v1, v0}, Lcom/c/a/a/ab;->a(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object v1

    invoke-static {v1}, Lcom/c/a/b/m;->a(Ljava/lang/Iterable;)Lcom/c/a/b/m;

    move-result-object v1

    iput-object v1, p0, Lcom/c/a/f/a;->e:Lcom/c/a/b/m;

    .line 154
    iget-object v1, p0, Lcom/c/a/f/a;->e:Lcom/c/a/b/m;

    invoke-virtual {v1}, Lcom/c/a/b/m;->size()I

    move-result v1

    const/16 v4, 0x7f

    if-gt v1, v4, :cond_2

    move v1, v2

    :goto_1
    const-string v4, "Domain has too many parts: \'%s\'"

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v0, v5, v3

    invoke-static {v1, v4, v5}, Lcom/c/a/a/u;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v1, p0, Lcom/c/a/f/a;->e:Lcom/c/a/b/m;

    invoke-static {v1}, Lcom/c/a/f/a;->a(Ljava/util/List;)Z

    move-result v1

    const-string v4, "Not a valid domain name: \'%s\'"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v3

    invoke-static {v1, v4, v2}, Lcom/c/a/a/u;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 158
    invoke-direct {p0}, Lcom/c/a/f/a;->b()I

    move-result v0

    iput v0, p0, Lcom/c/a/f/a;->f:I

    .line 159
    return-void

    :cond_1
    move v1, v3

    .line 149
    goto :goto_0

    :cond_2
    move v1, v3

    .line 154
    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)Lcom/c/a/f/a;
    .locals 2

    .prologue
    .line 213
    new-instance v1, Lcom/c/a/f/a;

    invoke-static {p0}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/c/a/f/a;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method private static a(Ljava/lang/String;Z)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 259
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x3f

    if-le v1, v2, :cond_1

    .line 298
    :cond_0
    :goto_0
    return v0

    .line 273
    :cond_1
    sget-object v1, Lcom/c/a/a/c;->b:Lcom/c/a/a/c;

    invoke-virtual {v1}, Lcom/c/a/a/c;->a()Lcom/c/a/a/c;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/c/a/a/c;->e(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .line 275
    sget-object v2, Lcom/c/a/f/a;->h:Lcom/c/a/a/c;

    invoke-virtual {v2, v1}, Lcom/c/a/a/c;->b(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 281
    sget-object v1, Lcom/c/a/f/a;->g:Lcom/c/a/a/c;

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Lcom/c/a/a/c;->c(C)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/c/a/f/a;->g:Lcom/c/a/a/c;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Lcom/c/a/a/c;->c(C)Z

    move-result v1

    if-nez v1, :cond_0

    .line 294
    if-eqz p1, :cond_2

    sget-object v1, Lcom/c/a/a/c;->c:Lcom/c/a/a/c;

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {v1, v2}, Lcom/c/a/a/c;->c(C)Z

    move-result v1

    if-nez v1, :cond_0

    .line 298
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static a(Ljava/util/List;)Z
    .locals 5

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 223
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 227
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/c/a/f/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 238
    :goto_0
    return v0

    :cond_0
    move v3, v1

    .line 231
    :goto_1
    if-ge v3, v4, :cond_2

    .line 232
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 233
    invoke-static {v0, v1}, Lcom/c/a/f/a;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    .line 234
    goto :goto_0

    .line 231
    :cond_1
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    :cond_2
    move v0, v2

    .line 238
    goto :goto_0
.end method

.method private b()I
    .locals 7

    .prologue
    const/4 v6, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 168
    iget-object v0, p0, Lcom/c/a/f/a;->e:Lcom/c/a/b/m;

    invoke-virtual {v0}, Lcom/c/a/b/m;->size()I

    move-result v4

    move v0, v3

    .line 170
    :goto_0
    if-ge v0, v4, :cond_4

    .line 171
    sget-object v1, Lcom/c/a/f/a;->c:Lcom/c/a/a/r;

    iget-object v5, p0, Lcom/c/a/f/a;->e:Lcom/c/a/b/m;

    invoke-virtual {v5, v0, v4}, Lcom/c/a/b/m;->a(II)Lcom/c/a/b/m;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/c/a/a/r;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    .line 173
    sget-object v5, Lcom/c/c/a/a;->a:Lcom/c/a/b/o;

    invoke-virtual {v5, v1}, Lcom/c/a/b/o;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 189
    :cond_0
    :goto_1
    return v0

    .line 180
    :cond_1
    sget-object v5, Lcom/c/c/a/a;->c:Lcom/c/a/b/o;

    invoke-virtual {v5, v1}, Lcom/c/a/b/o;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 181
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 184
    :cond_2
    const-string v5, "\\."

    invoke-virtual {v1, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    array-length v5, v1

    if-ne v5, v6, :cond_3

    sget-object v5, Lcom/c/c/a/a;->b:Lcom/c/a/b/o;

    aget-object v1, v1, v2

    invoke-virtual {v5, v1}, Lcom/c/a/b/o;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    :goto_2
    if-nez v1, :cond_0

    .line 170
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v1, v3

    .line 184
    goto :goto_2

    .line 189
    :cond_4
    const/4 v0, -0x1

    goto :goto_1
.end method


# virtual methods
.method public final a()Lcom/c/a/f/a;
    .locals 5

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 421
    iget v0, p0, Lcom/c/a/f/a;->f:I

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 425
    :goto_1
    return-object p0

    :cond_0
    move v0, v2

    .line 421
    goto :goto_0

    .line 424
    :cond_1
    iget v0, p0, Lcom/c/a/f/a;->f:I

    if-lez v0, :cond_2

    move v0, v1

    :goto_2
    const-string v3, "Not under a public suffix: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/c/a/f/a;->d:Ljava/lang/String;

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/c/a/a/u;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 425
    iget v0, p0, Lcom/c/a/f/a;->f:I

    add-int/lit8 v0, v0, -0x1

    sget-object v1, Lcom/c/a/f/a;->c:Lcom/c/a/a/r;

    iget-object v2, p0, Lcom/c/a/f/a;->e:Lcom/c/a/b/m;

    iget-object v3, p0, Lcom/c/a/f/a;->e:Lcom/c/a/b/m;

    invoke-virtual {v3}, Lcom/c/a/b/m;->size()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Lcom/c/a/b/m;->a(II)Lcom/c/a/b/m;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/c/a/a/r;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/f/a;->a(Ljava/lang/String;)Lcom/c/a/f/a;

    move-result-object p0

    goto :goto_1

    :cond_2
    move v0, v2

    .line 424
    goto :goto_2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 531
    if-ne p1, p0, :cond_0

    .line 532
    const/4 v0, 0x1

    .line 540
    :goto_0
    return v0

    .line 535
    :cond_0
    instance-of v0, p1, Lcom/c/a/f/a;

    if-eqz v0, :cond_1

    .line 536
    check-cast p1, Lcom/c/a/f/a;

    .line 537
    iget-object v0, p0, Lcom/c/a/f/a;->d:Ljava/lang/String;

    iget-object v1, p1, Lcom/c/a/f/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 540
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 545
    iget-object v0, p0, Lcom/c/a/f/a;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 519
    iget-object v0, p0, Lcom/c/a/f/a;->d:Ljava/lang/String;

    return-object v0
.end method
