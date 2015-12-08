.class public Lcom/google/a/d/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:[Ljava/lang/String;


# instance fields
.field private final c:Ljava/io/Writer;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/a/d/d;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Z

.field private i:Ljava/lang/String;

.field private j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 139
    const/16 v0, 0x80

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    move v0, v1

    .line 140
    :goto_0
    const/16 v2, 0x1f

    if-gt v0, v2, :cond_0

    .line 141
    sget-object v2, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const-string v3, "\\u%04x"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 140
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 143
    :cond_0
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const/16 v1, 0x22

    const-string v2, "\\\""

    aput-object v2, v0, v1

    .line 144
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const/16 v1, 0x5c

    const-string v2, "\\\\"

    aput-object v2, v0, v1

    .line 145
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const/16 v1, 0x9

    const-string v2, "\\t"

    aput-object v2, v0, v1

    .line 146
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const/16 v1, 0x8

    const-string v2, "\\b"

    aput-object v2, v0, v1

    .line 147
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const/16 v1, 0xa

    const-string v2, "\\n"

    aput-object v2, v0, v1

    .line 148
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const/16 v1, 0xd

    const-string v2, "\\r"

    aput-object v2, v0, v1

    .line 149
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    const/16 v1, 0xc

    const-string v2, "\\f"

    aput-object v2, v0, v1

    .line 150
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 151
    sput-object v0, Lcom/google/a/d/f;->b:[Ljava/lang/String;

    const/16 v1, 0x3c

    const-string v2, "\\u003c"

    aput-object v2, v0, v1

    .line 152
    sget-object v0, Lcom/google/a/d/f;->b:[Ljava/lang/String;

    const/16 v1, 0x3e

    const-string v2, "\\u003e"

    aput-object v2, v0, v1

    .line 153
    sget-object v0, Lcom/google/a/d/f;->b:[Ljava/lang/String;

    const/16 v1, 0x26

    const-string v2, "\\u0026"

    aput-object v2, v0, v1

    .line 154
    sget-object v0, Lcom/google/a/d/f;->b:[Ljava/lang/String;

    const/16 v1, 0x3d

    const-string v2, "\\u003d"

    aput-object v2, v0, v1

    .line 155
    sget-object v0, Lcom/google/a/d/f;->b:[Ljava/lang/String;

    const/16 v1, 0x27

    const-string v2, "\\u0027"

    aput-object v2, v0, v1

    .line 156
    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;)V
    .locals 2

    .prologue
    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    .line 163
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    sget-object v1, Lcom/google/a/d/d;->f:Lcom/google/a/d/d;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    const-string v0, ":"

    iput-object v0, p0, Lcom/google/a/d/f;->f:Ljava/lang/String;

    .line 183
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/a/d/f;->j:Z

    .line 191
    if-nez p1, :cond_0

    .line 192
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "out == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 194
    :cond_0
    iput-object p1, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    .line 195
    return-void
.end method

.method private a()Lcom/google/a/d/d;
    .locals 2

    .prologue
    .line 350
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 351
    if-nez v0, :cond_0

    .line 352
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 354
    :cond_0
    iget-object v1, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/d/d;

    return-object v0
.end method

.method private a(Lcom/google/a/d/d;Lcom/google/a/d/d;Ljava/lang/String;)Lcom/google/a/d/f;
    .locals 3

    .prologue
    .line 330
    invoke-direct {p0}, Lcom/google/a/d/f;->a()Lcom/google/a/d/d;

    move-result-object v0

    .line 331
    if-eq v0, p2, :cond_0

    if-eq v0, p1, :cond_0

    .line 332
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Nesting problem: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 334
    :cond_0
    iget-object v1, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 335
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Dangling name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 338
    :cond_1
    iget-object v1, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    iget-object v2, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 339
    if-ne v0, p2, :cond_2

    .line 340
    invoke-direct {p0}, Lcom/google/a/d/f;->k()V

    .line 342
    :cond_2
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    invoke-virtual {v0, p3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 343
    return-object p0
.end method

.method private a(Lcom/google/a/d/d;Ljava/lang/String;)Lcom/google/a/d/f;
    .locals 1

    .prologue
    .line 318
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->e(Z)V

    .line 319
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 320
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 321
    return-object p0
.end method

.method private a(Lcom/google/a/d/d;)V
    .locals 2

    .prologue
    .line 361
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 362
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 518
    iget-boolean v0, p0, Lcom/google/a/d/f;->h:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/a/d/f;->b:[Ljava/lang/String;

    .line 519
    :goto_0
    iget-object v2, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 521
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    move v3, v1

    .line 522
    :goto_1
    if-ge v3, v4, :cond_6

    .line 523
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    .line 525
    const/16 v5, 0x80

    if-ge v2, v5, :cond_2

    .line 526
    aget-object v2, v0, v2

    .line 527
    if-nez v2, :cond_3

    .line 522
    :cond_0
    :goto_2
    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto :goto_1

    .line 518
    :cond_1
    sget-object v0, Lcom/google/a/d/f;->a:[Ljava/lang/String;

    goto :goto_0

    .line 530
    :cond_2
    const/16 v5, 0x2028

    if-ne v2, v5, :cond_5

    .line 531
    const-string v2, "\\u2028"

    .line 537
    :cond_3
    :goto_3
    if-ge v1, v3, :cond_4

    .line 538
    iget-object v5, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    sub-int v6, v3, v1

    invoke-virtual {v5, p1, v1, v6}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 540
    :cond_4
    iget-object v1, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 541
    add-int/lit8 v1, v3, 0x1

    goto :goto_2

    .line 532
    :cond_5
    const/16 v5, 0x2029

    if-ne v2, v5, :cond_0

    .line 533
    const-string v2, "\\u2029"

    goto :goto_3

    .line 543
    :cond_6
    if-ge v1, v4, :cond_7

    .line 544
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    sub-int v2, v4, v1

    invoke-virtual {v0, p1, v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;II)V

    .line 546
    :cond_7
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 547
    return-void
.end method

.method private e(Z)V
    .locals 3

    .prologue
    .line 585
    sget-object v0, Lcom/google/a/d/g;->a:[I

    invoke-direct {p0}, Lcom/google/a/d/f;->a()Lcom/google/a/d/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/a/d/d;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 616
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Nesting problem: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 587
    :pswitch_0
    iget-boolean v0, p0, Lcom/google/a/d/f;->g:Z

    if-nez v0, :cond_0

    .line 588
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JSON must have only one top-level value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 593
    :cond_0
    :pswitch_1
    iget-boolean v0, p0, Lcom/google/a/d/f;->g:Z

    if-nez v0, :cond_1

    if-nez p1, :cond_1

    .line 594
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JSON must start with an array or an object."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 597
    :cond_1
    sget-object v0, Lcom/google/a/d/d;->g:Lcom/google/a/d/d;

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;)V

    .line 613
    :goto_0
    return-void

    .line 601
    :pswitch_2
    sget-object v0, Lcom/google/a/d/d;->b:Lcom/google/a/d/d;

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;)V

    .line 602
    invoke-direct {p0}, Lcom/google/a/d/f;->k()V

    goto :goto_0

    .line 606
    :pswitch_3
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(C)Ljava/io/Writer;

    .line 607
    invoke-direct {p0}, Lcom/google/a/d/f;->k()V

    goto :goto_0

    .line 611
    :pswitch_4
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    iget-object v1, p0, Lcom/google/a/d/f;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    .line 612
    sget-object v0, Lcom/google/a/d/d;->e:Lcom/google/a/d/d;

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;)V

    goto :goto_0

    .line 585
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private j()V
    .locals 3

    .prologue
    .line 385
    iget-object v0, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1565
    invoke-direct {p0}, Lcom/google/a/d/f;->a()Lcom/google/a/d/d;

    move-result-object v0

    .line 1566
    sget-object v1, Lcom/google/a/d/d;->e:Lcom/google/a/d/d;

    if-ne v0, v1, :cond_2

    .line 1567
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    .line 1571
    :cond_0
    invoke-direct {p0}, Lcom/google/a/d/f;->k()V

    .line 1572
    sget-object v0, Lcom/google/a/d/d;->d:Lcom/google/a/d/d;

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;)V

    .line 387
    iget-object v0, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->d(Ljava/lang/String;)V

    .line 388
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    .line 390
    :cond_1
    return-void

    .line 1568
    :cond_2
    sget-object v1, Lcom/google/a/d/d;->c:Lcom/google/a/d/d;

    if-eq v0, v1, :cond_0

    .line 1569
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Nesting problem: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 550
    iget-object v0, p0, Lcom/google/a/d/f;->e:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 558
    :cond_0
    return-void

    .line 554
    :cond_1
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 555
    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 556
    iget-object v1, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    iget-object v2, p0, Lcom/google/a/d/f;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 555
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(J)Lcom/google/a/d/f;
    .locals 3

    .prologue
    .line 462
    invoke-direct {p0}, Lcom/google/a/d/f;->j()V

    .line 463
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->e(Z)V

    .line 464
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 465
    return-object p0
.end method

.method public a(Ljava/lang/Number;)Lcom/google/a/d/f;
    .locals 3

    .prologue
    .line 476
    if-nez p1, :cond_0

    .line 477
    invoke-virtual {p0}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    move-result-object p0

    .line 488
    :goto_0
    return-object p0

    .line 480
    :cond_0
    invoke-direct {p0}, Lcom/google/a/d/f;->j()V

    .line 481
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 482
    iget-boolean v1, p0, Lcom/google/a/d/f;->g:Z

    if-nez v1, :cond_2

    const-string v1, "-Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Infinity"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "NaN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 484
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Numeric values must be finite, but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 486
    :cond_2
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Lcom/google/a/d/f;->e(Z)V

    .line 487
    iget-object v1, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    invoke-virtual {v1, v0}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/google/a/d/f;
    .locals 2

    .prologue
    .line 371
    if-nez p1, :cond_0

    .line 372
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "name == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 374
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 375
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 377
    :cond_1
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 378
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 380
    :cond_2
    iput-object p1, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    .line 381
    return-object p0
.end method

.method public a(Z)Lcom/google/a/d/f;
    .locals 2

    .prologue
    .line 433
    invoke-direct {p0}, Lcom/google/a/d/f;->j()V

    .line 434
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->e(Z)V

    .line 435
    iget-object v1, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    if-eqz p1, :cond_0

    const-string v0, "true"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 436
    return-object p0

    .line 435
    :cond_0
    const-string v0, "false"

    goto :goto_0
.end method

.method public b()Lcom/google/a/d/f;
    .locals 2

    .prologue
    .line 280
    invoke-direct {p0}, Lcom/google/a/d/f;->j()V

    .line 281
    sget-object v0, Lcom/google/a/d/d;->a:Lcom/google/a/d/d;

    const-string v1, "["

    invoke-direct {p0, v0, v1}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;Ljava/lang/String;)Lcom/google/a/d/f;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/google/a/d/f;
    .locals 1

    .prologue
    .line 399
    if-nez p1, :cond_0

    .line 400
    invoke-virtual {p0}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    move-result-object p0

    .line 405
    :goto_0
    return-object p0

    .line 402
    :cond_0
    invoke-direct {p0}, Lcom/google/a/d/f;->j()V

    .line 403
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->e(Z)V

    .line 404
    invoke-direct {p0, p1}, Lcom/google/a/d/f;->d(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 228
    iput-boolean p1, p0, Lcom/google/a/d/f;->g:Z

    .line 229
    return-void
.end method

.method public c()Lcom/google/a/d/f;
    .locals 3

    .prologue
    .line 290
    sget-object v0, Lcom/google/a/d/d;->a:Lcom/google/a/d/d;

    sget-object v1, Lcom/google/a/d/d;->b:Lcom/google/a/d/d;

    const-string v2, "]"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;Lcom/google/a/d/d;Ljava/lang/String;)Lcom/google/a/d/f;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 206
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 207
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/a/d/f;->e:Ljava/lang/String;

    .line 208
    const-string v0, ":"

    iput-object v0, p0, Lcom/google/a/d/f;->f:Ljava/lang/String;

    .line 213
    :goto_0
    return-void

    .line 210
    :cond_0
    iput-object p1, p0, Lcom/google/a/d/f;->e:Ljava/lang/String;

    .line 211
    const-string v0, ": "

    iput-object v0, p0, Lcom/google/a/d/f;->f:Ljava/lang/String;

    goto :goto_0
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 246
    iput-boolean p1, p0, Lcom/google/a/d/f;->h:Z

    .line 247
    return-void
.end method

.method public close()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 508
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    .line 510
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 511
    if-gt v0, v1, :cond_0

    if-ne v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/google/a/d/d;->g:Lcom/google/a/d/d;

    if-eq v0, v1, :cond_1

    .line 512
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 514
    :cond_1
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 515
    return-void
.end method

.method public d()Lcom/google/a/d/f;
    .locals 2

    .prologue
    .line 300
    invoke-direct {p0}, Lcom/google/a/d/f;->j()V

    .line 301
    sget-object v0, Lcom/google/a/d/d;->c:Lcom/google/a/d/d;

    const-string v1, "{"

    invoke-direct {p0, v0, v1}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;Ljava/lang/String;)Lcom/google/a/d/f;

    move-result-object v0

    return-object v0
.end method

.method public final d(Z)V
    .locals 0

    .prologue
    .line 262
    iput-boolean p1, p0, Lcom/google/a/d/f;->j:Z

    .line 263
    return-void
.end method

.method public e()Lcom/google/a/d/f;
    .locals 3

    .prologue
    .line 310
    sget-object v0, Lcom/google/a/d/d;->c:Lcom/google/a/d/d;

    sget-object v1, Lcom/google/a/d/d;->e:Lcom/google/a/d/d;

    const-string v2, "}"

    invoke-direct {p0, v0, v1, v2}, Lcom/google/a/d/f;->a(Lcom/google/a/d/d;Lcom/google/a/d/d;Ljava/lang/String;)Lcom/google/a/d/f;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/a/d/f;
    .locals 2

    .prologue
    .line 414
    iget-object v0, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 415
    iget-boolean v0, p0, Lcom/google/a/d/f;->j:Z

    if-eqz v0, :cond_1

    .line 416
    invoke-direct {p0}, Lcom/google/a/d/f;->j()V

    .line 422
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/a/d/f;->e(Z)V

    .line 423
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 424
    :goto_0
    return-object p0

    .line 418
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/a/d/f;->i:Ljava/lang/String;

    goto :goto_0
.end method

.method public flush()V
    .locals 2

    .prologue
    .line 496
    iget-object v0, p0, Lcom/google/a/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonWriter is closed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 499
    :cond_0
    iget-object v0, p0, Lcom/google/a/d/f;->c:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V

    .line 500
    return-void
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 235
    iget-boolean v0, p0, Lcom/google/a/d/f;->g:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 254
    iget-boolean v0, p0, Lcom/google/a/d/f;->h:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 270
    iget-boolean v0, p0, Lcom/google/a/d/f;->j:Z

    return v0
.end method
