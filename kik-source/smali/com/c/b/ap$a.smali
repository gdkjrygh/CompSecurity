.class final Lcom/c/b/ap$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/c/b/ak$a;

.field private final b:I


# direct methods
.method constructor <init>(Lcom/c/b/ak$a;I)V
    .locals 0

    .prologue
    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 375
    iput-object p1, p0, Lcom/c/b/ap$a;->a:Lcom/c/b/ak$a;

    .line 376
    iput p2, p0, Lcom/c/b/ap$a;->b:I

    .line 377
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 385
    instance-of v1, p1, Lcom/c/b/ap$a;

    if-nez v1, :cond_1

    .line 389
    :cond_0
    :goto_0
    return v0

    .line 388
    :cond_1
    check-cast p1, Lcom/c/b/ap$a;

    .line 389
    iget-object v1, p0, Lcom/c/b/ap$a;->a:Lcom/c/b/ak$a;

    iget-object v2, p1, Lcom/c/b/ap$a;->a:Lcom/c/b/ak$a;

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/c/b/ap$a;->b:I

    iget v2, p1, Lcom/c/b/ap$a;->b:I

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 381
    iget-object v0, p0, Lcom/c/b/ap$a;->a:Lcom/c/b/ak$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xffff

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/c/b/ap$a;->b:I

    add-int/2addr v0, v1

    return v0
.end method
