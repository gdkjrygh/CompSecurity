.class final Lcom/android/volley/toolbox/d$b;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/volley/toolbox/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private a:I


# direct methods
.method private constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .prologue
    .line 520
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 516
    const/4 v0, 0x0

    iput v0, p0, Lcom/android/volley/toolbox/d$b;->a:I

    .line 521
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/InputStream;B)V
    .locals 0

    .prologue
    .line 514
    invoke-direct {p0, p1}, Lcom/android/volley/toolbox/d$b;-><init>(Ljava/io/InputStream;)V

    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/d$b;)I
    .locals 1

    .prologue
    .line 514
    iget v0, p0, Lcom/android/volley/toolbox/d$b;->a:I

    return v0
.end method


# virtual methods
.method public final read()I
    .locals 2

    .prologue
    .line 526
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    .line 527
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 528
    iget v1, p0, Lcom/android/volley/toolbox/d$b;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/android/volley/toolbox/d$b;->a:I

    .line 530
    :cond_0
    return v0
.end method

.method public final read([BII)I
    .locals 2

    .prologue
    .line 536
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result v0

    .line 537
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 538
    iget v1, p0, Lcom/android/volley/toolbox/d$b;->a:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/android/volley/toolbox/d$b;->a:I

    .line 540
    :cond_0
    return v0
.end method
