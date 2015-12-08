.class final Lcom/bumptech/glide/load/c/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/bumptech/glide/load/c/r",
            "<*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private b:I

.field private c:I

.field private d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/bumptech/glide/i/h;->a(I)Ljava/util/Queue;

    move-result-object v0

    sput-object v0, Lcom/bumptech/glide/load/c/r;->a:Ljava/util/Queue;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(Ljava/lang/Object;)Lcom/bumptech/glide/load/c/r;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">(TA;)",
            "Lcom/bumptech/glide/load/c/r",
            "<TA;>;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 73
    sget-object v0, Lcom/bumptech/glide/load/c/r;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/c/r;

    .line 74
    if-nez v0, :cond_0

    .line 75
    new-instance v0, Lcom/bumptech/glide/load/c/r;

    invoke-direct {v0}, Lcom/bumptech/glide/load/c/r;-><init>()V

    .line 1085
    :cond_0
    iput-object p0, v0, Lcom/bumptech/glide/load/c/r;->d:Ljava/lang/Object;

    .line 1086
    iput v1, v0, Lcom/bumptech/glide/load/c/r;->c:I

    .line 1087
    iput v1, v0, Lcom/bumptech/glide/load/c/r;->b:I

    .line 79
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 91
    sget-object v0, Lcom/bumptech/glide/load/c/r;->a:Ljava/util/Queue;

    invoke-interface {v0, p0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 92
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 96
    instance-of v1, p1, Lcom/bumptech/glide/load/c/r;

    if-eqz v1, :cond_0

    .line 97
    check-cast p1, Lcom/bumptech/glide/load/c/r;

    .line 98
    iget v1, p0, Lcom/bumptech/glide/load/c/r;->c:I

    iget v2, p1, Lcom/bumptech/glide/load/c/r;->c:I

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/bumptech/glide/load/c/r;->b:I

    iget v2, p1, Lcom/bumptech/glide/load/c/r;->b:I

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/load/c/r;->d:Ljava/lang/Object;

    iget-object v2, p1, Lcom/bumptech/glide/load/c/r;->d:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 100
    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 105
    iget v0, p0, Lcom/bumptech/glide/load/c/r;->b:I

    .line 106
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/bumptech/glide/load/c/r;->c:I

    add-int/2addr v0, v1

    .line 107
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/bumptech/glide/load/c/r;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 108
    return v0
.end method
