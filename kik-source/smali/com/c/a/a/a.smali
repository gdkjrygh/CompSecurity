.class abstract Lcom/c/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/a/a$1;,
        Lcom/c/a/a/a$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget v0, Lcom/c/a/a/a$a;->b:I

    iput v0, p0, Lcom/c/a/a/a;->a:I

    .line 34
    return-void
.end method


# virtual methods
.method protected abstract a()Ljava/lang/Object;
.end method

.method protected final b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    sget v0, Lcom/c/a/a/a$a;->c:I

    iput v0, p0, Lcom/c/a/a/a;->a:I

    .line 46
    const/4 v0, 0x0

    return-object v0
.end method

.method public final hasNext()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 51
    iget v2, p0, Lcom/c/a/a/a;->a:I

    sget v3, Lcom/c/a/a/a$a;->d:I

    if-eq v2, v3, :cond_0

    move v2, v1

    :goto_0
    if-nez v2, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_0
    move v2, v0

    goto :goto_0

    .line 52
    :cond_1
    sget-object v2, Lcom/c/a/a/a$1;->a:[I

    iget v3, p0, Lcom/c/a/a/a;->a:I

    add-int/lit8 v3, v3, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 59
    sget v2, Lcom/c/a/a/a$a;->d:I

    iput v2, p0, Lcom/c/a/a/a;->a:I

    invoke-virtual {p0}, Lcom/c/a/a/a;->a()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/c/a/a/a;->b:Ljava/lang/Object;

    iget v2, p0, Lcom/c/a/a/a;->a:I

    sget v3, Lcom/c/a/a/a$a;->c:I

    if-eq v2, v3, :cond_2

    sget v0, Lcom/c/a/a/a$a;->a:I

    iput v0, p0, Lcom/c/a/a/a;->a:I

    move v0, v1

    :cond_2
    :goto_1
    :pswitch_0
    return v0

    :pswitch_1
    move v0, v1

    .line 56
    goto :goto_1

    .line 52
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 74
    invoke-virtual {p0}, Lcom/c/a/a/a;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 75
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 77
    :cond_0
    sget v0, Lcom/c/a/a/a$a;->b:I

    iput v0, p0, Lcom/c/a/a/a;->a:I

    .line 78
    iget-object v0, p0, Lcom/c/a/a/a;->b:Ljava/lang/Object;

    .line 79
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/c/a/a/a;->b:Ljava/lang/Object;

    .line 80
    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 84
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
