.class public final Lorg/a/a/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/a/a/b/b$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Comparator;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;

.field private transient d:I

.field private transient e:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 147
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 148
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Elements in a range must not be null: element1="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", element2="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 151
    :cond_1
    sget-object v0, Lorg/a/a/b/b$a;->a:Lorg/a/a/b/b$a;

    .line 154
    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gtz v1, :cond_2

    .line 155
    iput-object p1, p0, Lorg/a/a/b/b;->b:Ljava/lang/Object;

    .line 156
    iput-object p2, p0, Lorg/a/a/b/b;->c:Ljava/lang/Object;

    .line 161
    :goto_0
    iput-object v0, p0, Lorg/a/a/b/b;->a:Ljava/util/Comparator;

    .line 162
    return-void

    .line 158
    :cond_2
    iput-object p2, p0, Lorg/a/a/b/b;->b:Ljava/lang/Object;

    .line 159
    iput-object p1, p0, Lorg/a/a/b/b;->c:Ljava/lang/Object;

    goto :goto_0
.end method

.method public static a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lorg/a/a/b/b;
    .locals 1

    .prologue
    .line 114
    new-instance v0, Lorg/a/a/b/b;

    invoke-direct {v0, p0, p1}, Lorg/a/a/b/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 219
    if-nez p1, :cond_1

    .line 222
    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Lorg/a/a/b/b;->a:Ljava/util/Comparator;

    iget-object v2, p0, Lorg/a/a/b/b;->b:Ljava/lang/Object;

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-ltz v1, :cond_0

    iget-object v1, p0, Lorg/a/a/b/b;->a:Ljava/util/Comparator;

    iget-object v2, p0, Lorg/a/a/b/b;->c:Ljava/lang/Object;

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gtz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 408
    if-ne p1, p0, :cond_1

    .line 415
    :cond_0
    :goto_0
    return v0

    .line 410
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 411
    goto :goto_0

    .line 414
    :cond_3
    check-cast p1, Lorg/a/a/b/b;

    .line 415
    iget-object v2, p0, Lorg/a/a/b/b;->b:Ljava/lang/Object;

    iget-object v3, p1, Lorg/a/a/b/b;->b:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lorg/a/a/b/b;->c:Ljava/lang/Object;

    iget-object v3, p1, Lorg/a/a/b/b;->c:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 427
    iget v0, p0, Lorg/a/a/b/b;->d:I

    .line 428
    iget v1, p0, Lorg/a/a/b/b;->d:I

    if-nez v1, :cond_0

    .line 429
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x275

    .line 431
    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lorg/a/a/b/b;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 432
    mul-int/lit8 v0, v0, 0x25

    iget-object v1, p0, Lorg/a/a/b/b;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 433
    iput v0, p0, Lorg/a/a/b/b;->d:I

    .line 435
    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 447
    iget-object v0, p0, Lorg/a/a/b/b;->e:Ljava/lang/String;

    .line 448
    if-nez v0, :cond_0

    .line 449
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 450
    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 451
    iget-object v1, p0, Lorg/a/a/b/b;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 452
    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    iget-object v1, p0, Lorg/a/a/b/b;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 454
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 455
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 456
    iput-object v0, p0, Lorg/a/a/b/b;->e:Ljava/lang/String;

    .line 458
    :cond_0
    return-object v0
.end method
