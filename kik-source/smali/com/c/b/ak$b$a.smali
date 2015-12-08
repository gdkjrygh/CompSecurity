.class final Lcom/c/b/ak$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/c/b/ak$h;

.field private final b:I


# direct methods
.method constructor <init>(Lcom/c/b/ak$h;I)V
    .locals 0

    .prologue
    .line 2249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2250
    iput-object p1, p0, Lcom/c/b/ak$b$a;->a:Lcom/c/b/ak$h;

    .line 2251
    iput p2, p0, Lcom/c/b/ak$b$a;->b:I

    .line 2252
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 2260
    instance-of v1, p1, Lcom/c/b/ak$b$a;

    if-nez v1, :cond_1

    .line 2264
    :cond_0
    :goto_0
    return v0

    .line 2263
    :cond_1
    check-cast p1, Lcom/c/b/ak$b$a;

    .line 2264
    iget-object v1, p0, Lcom/c/b/ak$b$a;->a:Lcom/c/b/ak$h;

    iget-object v2, p1, Lcom/c/b/ak$b$a;->a:Lcom/c/b/ak$h;

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/c/b/ak$b$a;->b:I

    iget v2, p1, Lcom/c/b/ak$b$a;->b:I

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 2256
    iget-object v0, p0, Lcom/c/b/ak$b$a;->a:Lcom/c/b/ak$h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xffff

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/c/b/ak$b$a;->b:I

    add-int/2addr v0, v1

    return v0
.end method
