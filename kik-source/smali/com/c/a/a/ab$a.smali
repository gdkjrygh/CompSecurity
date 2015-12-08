.class abstract Lcom/c/a/a/ab$a;
.super Lcom/c/a/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/a/ab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "a"
.end annotation


# instance fields
.field final b:Ljava/lang/CharSequence;

.field final c:Lcom/c/a/a/c;

.field final d:Z

.field e:I

.field f:I


# direct methods
.method protected constructor <init>(Lcom/c/a/a/ab;Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 543
    invoke-direct {p0}, Lcom/c/a/a/a;-><init>()V

    .line 540
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/a/a/ab$a;->e:I

    .line 544
    invoke-static {p1}, Lcom/c/a/a/ab;->a(Lcom/c/a/a/ab;)Lcom/c/a/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/a/ab$a;->c:Lcom/c/a/a/c;

    .line 545
    invoke-static {p1}, Lcom/c/a/a/ab;->b(Lcom/c/a/a/ab;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/c/a/a/ab$a;->d:Z

    .line 546
    invoke-static {p1}, Lcom/c/a/a/ab;->c(Lcom/c/a/a/ab;)I

    move-result v0

    iput v0, p0, Lcom/c/a/a/ab$a;->f:I

    .line 547
    iput-object p2, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    .line 548
    return-void
.end method


# virtual methods
.method abstract a(I)I
.end method

.method protected final synthetic a()Ljava/lang/Object;
    .locals 6

    .prologue
    const/4 v5, -0x1

    .line 522
    iget v0, p0, Lcom/c/a/a/ab$a;->e:I

    :cond_0
    :goto_0
    iget v1, p0, Lcom/c/a/a/ab$a;->e:I

    if-eq v1, v5, :cond_6

    iget v1, p0, Lcom/c/a/a/ab$a;->e:I

    invoke-virtual {p0, v1}, Lcom/c/a/a/ab$a;->a(I)I

    move-result v1

    if-ne v1, v5, :cond_1

    iget-object v1, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iput v5, p0, Lcom/c/a/a/ab$a;->e:I

    :goto_1
    iget v2, p0, Lcom/c/a/a/ab$a;->e:I

    if-ne v2, v0, :cond_8

    iget v1, p0, Lcom/c/a/a/ab$a;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/c/a/a/ab$a;->e:I

    iget v1, p0, Lcom/c/a/a/ab$a;->e:I

    iget-object v2, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    iput v5, p0, Lcom/c/a/a/ab$a;->e:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Lcom/c/a/a/ab$a;->b(I)I

    move-result v2

    iput v2, p0, Lcom/c/a/a/ab$a;->e:I

    goto :goto_1

    :goto_2
    if-ge v2, v1, :cond_7

    iget-object v0, p0, Lcom/c/a/a/ab$a;->c:Lcom/c/a/a/c;

    iget-object v3, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    invoke-interface {v3, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Lcom/c/a/a/c;->c(C)Z

    move-result v0

    if-eqz v0, :cond_7

    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    :goto_3
    if-le v0, v2, :cond_2

    iget-object v1, p0, Lcom/c/a/a/ab$a;->c:Lcom/c/a/a/c;

    iget-object v3, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/c/a/a/c;->c(C)Z

    move-result v1

    if-eqz v1, :cond_2

    add-int/lit8 v1, v0, -0x1

    move v0, v1

    goto :goto_3

    :cond_2
    iget-boolean v1, p0, Lcom/c/a/a/ab$a;->d:Z

    if-eqz v1, :cond_3

    if-ne v2, v0, :cond_3

    iget v0, p0, Lcom/c/a/a/ab$a;->e:I

    goto :goto_0

    :cond_3
    iget v1, p0, Lcom/c/a/a/ab$a;->f:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    iget-object v0, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v5, p0, Lcom/c/a/a/ab$a;->e:I

    :goto_4
    if-le v0, v2, :cond_5

    iget-object v1, p0, Lcom/c/a/a/ab$a;->c:Lcom/c/a/a/c;

    iget-object v3, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v3, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Lcom/c/a/a/c;->c(C)Z

    move-result v1

    if-eqz v1, :cond_5

    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    :cond_4
    iget v1, p0, Lcom/c/a/a/ab$a;->f:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/c/a/a/ab$a;->f:I

    :cond_5
    iget-object v1, p0, Lcom/c/a/a/ab$a;->b:Ljava/lang/CharSequence;

    invoke-interface {v1, v2, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    return-object v0

    :cond_6
    invoke-virtual {p0}, Lcom/c/a/a/ab$a;->b()Ljava/lang/Object;

    const/4 v0, 0x0

    goto :goto_5

    :cond_7
    move v0, v1

    goto :goto_3

    :cond_8
    move v2, v0

    goto :goto_2
.end method

.method abstract b(I)I
.end method
