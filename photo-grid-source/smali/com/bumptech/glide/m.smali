.class final Lcom/bumptech/glide/m;
.super Lcom/bumptech/glide/g/b/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/g/b/a",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 301
    invoke-direct {p0}, Lcom/bumptech/glide/g/b/a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 301
    invoke-direct {p0}, Lcom/bumptech/glide/m;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/bumptech/glide/m;I)I
    .locals 0

    .prologue
    .line 301
    iput p1, p0, Lcom/bumptech/glide/m;->b:I

    return p1
.end method

.method static synthetic b(Lcom/bumptech/glide/m;I)I
    .locals 0

    .prologue
    .line 301
    iput p1, p0, Lcom/bumptech/glide/m;->a:I

    return p1
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/g/b/h;)V
    .locals 2

    .prologue
    .line 313
    iget v0, p0, Lcom/bumptech/glide/m;->b:I

    iget v1, p0, Lcom/bumptech/glide/m;->a:I

    invoke-interface {p1, v0, v1}, Lcom/bumptech/glide/g/b/h;->a(II)V

    .line 314
    return-void
.end method

.method public final a(Ljava/lang/Object;Lcom/bumptech/glide/g/a/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/g/a/d",
            "<-",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 309
    return-void
.end method
