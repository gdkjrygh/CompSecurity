.class final Lkik/android/util/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/util/a;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;


# direct methods
.method constructor <init>(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 514
    iput-object p1, p0, Lkik/android/util/a$a;->a:Lkik/android/util/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 510
    const/4 v0, 0x0

    iput v0, p0, Lkik/android/util/a$a;->g:I

    .line 515
    iput-object p2, p0, Lkik/android/util/a$a;->b:Ljava/lang/String;

    .line 516
    iput-object p4, p0, Lkik/android/util/a$a;->c:Ljava/lang/String;

    .line 517
    iput-object p5, p0, Lkik/android/util/a$a;->d:Ljava/lang/String;

    .line 518
    iput-object p3, p0, Lkik/android/util/a$a;->e:Ljava/lang/String;

    .line 519
    const/4 v0, -0x1

    iput v0, p0, Lkik/android/util/a$a;->f:I

    .line 520
    return-void
.end method

.method static synthetic a(Lkik/android/util/a$a;)I
    .locals 1

    .prologue
    .line 503
    iget v0, p0, Lkik/android/util/a$a;->f:I

    return v0
.end method

.method static synthetic a(Lkik/android/util/a$a;I)I
    .locals 0

    .prologue
    .line 503
    iput p1, p0, Lkik/android/util/a$a;->f:I

    return p1
.end method

.method static synthetic a(Lkik/android/util/a$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 503
    iput-object p1, p0, Lkik/android/util/a$a;->h:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lkik/android/util/a$a;)I
    .locals 1

    .prologue
    .line 503
    iget v0, p0, Lkik/android/util/a$a;->g:I

    return v0
.end method

.method static synthetic b(Lkik/android/util/a$a;I)I
    .locals 0

    .prologue
    .line 503
    iput p1, p0, Lkik/android/util/a$a;->g:I

    return p1
.end method

.method static synthetic c(Lkik/android/util/a$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lkik/android/util/a$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lkik/android/util/a$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lkik/android/util/a$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lkik/android/util/a$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lkik/android/util/a$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lkik/android/util/a$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lkik/android/util/a$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lkik/android/util/a$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 503
    iget-object v0, p0, Lkik/android/util/a$a;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method final a(I)V
    .locals 3

    .prologue
    .line 524
    iget v0, p0, Lkik/android/util/a$a;->f:I

    if-ne v0, p1, :cond_0

    .line 529
    :goto_0
    return-void

    .line 527
    :cond_0
    iget v0, p0, Lkik/android/util/a$a;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 528
    iput p1, p0, Lkik/android/util/a$a;->f:I

    .line 529
    iget-object v0, p0, Lkik/android/util/a$a;->a:Lkik/android/util/a;

    iget-object v1, p0, Lkik/android/util/a$a;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lkik/android/util/a;->a(Lkik/android/util/a;Ljava/lang/String;)V

    goto :goto_0

    .line 532
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Trying to set video descriptor file size to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " when it is already "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lkik/android/util/a$a;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " for uuid "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lkik/android/util/a$a;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final a()Z
    .locals 2

    .prologue
    .line 544
    iget v0, p0, Lkik/android/util/a$a;->g:I

    iget v1, p0, Lkik/android/util/a$a;->f:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final b()Lkik/android/util/a$a;
    .locals 6

    .prologue
    .line 549
    new-instance v0, Lkik/android/util/a$a;

    iget-object v1, p0, Lkik/android/util/a$a;->a:Lkik/android/util/a;

    iget-object v2, p0, Lkik/android/util/a$a;->b:Ljava/lang/String;

    iget-object v3, p0, Lkik/android/util/a$a;->e:Ljava/lang/String;

    iget-object v4, p0, Lkik/android/util/a$a;->c:Ljava/lang/String;

    iget-object v5, p0, Lkik/android/util/a$a;->d:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, Lkik/android/util/a$a;-><init>(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method final b(I)V
    .locals 2

    .prologue
    .line 538
    iput p1, p0, Lkik/android/util/a$a;->g:I

    .line 539
    iget-object v0, p0, Lkik/android/util/a$a;->a:Lkik/android/util/a;

    iget-object v1, p0, Lkik/android/util/a$a;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lkik/android/util/a;->b(Lkik/android/util/a;Ljava/lang/String;)V

    .line 540
    return-void
.end method
