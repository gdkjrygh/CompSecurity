.class final Lcom/c/b/bu$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/Appendable;

.field private final b:Ljava/lang/StringBuilder;

.field private c:Z


# direct methods
.method private constructor <init>(Ljava/lang/Appendable;)V
    .locals 1

    .prologue
    .line 517
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 514
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/c/b/bu$e;->b:Ljava/lang/StringBuilder;

    .line 515
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/bu$e;->c:Z

    .line 518
    iput-object p1, p0, Lcom/c/b/bu$e;->a:Ljava/lang/Appendable;

    .line 519
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Appendable;B)V
    .locals 0

    .prologue
    .line 512
    invoke-direct {p0, p1}, Lcom/c/b/bu$e;-><init>(Ljava/lang/Appendable;)V

    return-void
.end method

.method private b(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 561
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 569
    :goto_0
    return-void

    .line 564
    :cond_0
    iget-boolean v0, p0, Lcom/c/b/bu$e;->c:Z

    if-eqz v0, :cond_1

    .line 565
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/bu$e;->c:Z

    .line 566
    iget-object v0, p0, Lcom/c/b/bu$e;->a:Ljava/lang/Appendable;

    iget-object v1, p0, Lcom/c/b/bu$e;->b:Ljava/lang/StringBuilder;

    invoke-interface {v0, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 568
    :cond_1
    iget-object v0, p0, Lcom/c/b/bu$e;->a:Ljava/lang/Appendable;

    invoke-interface {v0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 527
    iget-object v0, p0, Lcom/c/b/bu$e;->b:Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 547
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    move v1, v0

    .line 550
    :goto_0
    if-ge v1, v2, :cond_1

    .line 551
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    if-ne v3, v4, :cond_0

    .line 552
    add-int/lit8 v3, v1, 0x1

    invoke-interface {p1, v0, v3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/c/b/bu$e;->b(Ljava/lang/CharSequence;)V

    .line 553
    add-int/lit8 v0, v1, 0x1

    .line 554
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/c/b/bu$e;->c:Z

    .line 550
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 557
    :cond_1
    invoke-interface {p1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/c/b/bu$e;->b(Ljava/lang/CharSequence;)V

    .line 558
    return-void
.end method

.method public final b()V
    .locals 3

    .prologue
    .line 535
    iget-object v0, p0, Lcom/c/b/bu$e;->b:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    .line 536
    if-nez v0, :cond_0

    .line 537
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " Outdent() without matching Indent()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 540
    :cond_0
    iget-object v1, p0, Lcom/c/b/bu$e;->b:Ljava/lang/StringBuilder;

    add-int/lit8 v2, v0, -0x2

    invoke-virtual {v1, v2, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 541
    return-void
.end method
