.class public final Lcom/c/a/b/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/a/b/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:[Lcom/c/a/b/p$a;

.field b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 184
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/c/a/b/o$a;-><init>(B)V

    .line 185
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    .line 188
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/c/a/b/p$a;

    iput-object v0, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    .line 190
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/a/b/o$a;->b:I

    .line 191
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/o$a;
    .locals 4

    .prologue
    .line 205
    iget v0, p0, Lcom/c/a/b/o$a;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    array-length v1, v1

    if-le v0, v1, :cond_0

    iget-object v1, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    iget-object v2, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    array-length v2, v2

    invoke-static {v2, v0}, Lcom/c/a/b/k$b;->a(II)I

    move-result v0

    invoke-static {v1, v0}, Lcom/c/a/b/ae;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/c/a/b/p$a;

    iput-object v0, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    .line 206
    :cond_0
    invoke-static {p1, p2}, Lcom/c/a/b/o;->c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/p$a;

    move-result-object v0

    .line 208
    iget-object v1, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    iget v2, p0, Lcom/c/a/b/o$a;->b:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/c/a/b/o$a;->b:I

    aput-object v0, v1, v2

    .line 209
    return-object p0
.end method

.method public final a()Lcom/c/a/b/o;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 248
    iget v0, p0, Lcom/c/a/b/o$a;->b:I

    packed-switch v0, :pswitch_data_0

    .line 254
    new-instance v0, Lcom/c/a/b/ah;

    iget v1, p0, Lcom/c/a/b/o$a;->b:I

    iget-object v2, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    invoke-direct {v0, v1, v2}, Lcom/c/a/b/ah;-><init>(I[Lcom/c/a/b/p$a;)V

    :goto_0
    return-object v0

    .line 250
    :pswitch_0
    invoke-static {}, Lcom/c/a/b/o;->g()Lcom/c/a/b/o;

    move-result-object v0

    goto :goto_0

    .line 252
    :pswitch_1
    iget-object v0, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/c/a/b/p$a;->getKey()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/c/a/b/o$a;->a:[Lcom/c/a/b/p$a;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lcom/c/a/b/p$a;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/c/a/b/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/o;

    move-result-object v0

    goto :goto_0

    .line 248
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
