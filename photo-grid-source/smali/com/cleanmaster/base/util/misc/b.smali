.class final Lcom/cleanmaster/base/util/misc/b;
.super Lcom/cleanmaster/base/util/misc/d;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cleanmaster/base/util/misc/a;


# direct methods
.method constructor <init>(Lcom/cleanmaster/base/util/misc/a;)V
    .locals 0

    .prologue
    .line 576
    iput-object p1, p0, Lcom/cleanmaster/base/util/misc/b;->a:Lcom/cleanmaster/base/util/misc/a;

    invoke-direct {p0}, Lcom/cleanmaster/base/util/misc/d;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 579
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/b;->a:Lcom/cleanmaster/base/util/misc/a;

    iget v0, v0, Lcom/cleanmaster/base/util/misc/a;->g:I

    return v0
.end method

.method protected final a(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 589
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/b;->a:Lcom/cleanmaster/base/util/misc/a;

    invoke-static {v0}, Lcom/cleanmaster/base/util/misc/a;->a(Lcom/cleanmaster/base/util/misc/a;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/b;->a:Lcom/cleanmaster/base/util/misc/a;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v0, p1, v1}, Lcom/cleanmaster/base/util/misc/a;->a(Lcom/cleanmaster/base/util/misc/a;Ljava/lang/Object;I)I

    move-result v0

    goto :goto_0
.end method

.method protected final a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 584
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/b;->a:Lcom/cleanmaster/base/util/misc/a;

    iget-object v0, v0, Lcom/cleanmaster/base/util/misc/a;->f:[Ljava/lang/Object;

    aget-object v0, v0, p1

    return-object v0
.end method

.method protected final b()Ljava/util/Map;
    .locals 2

    .prologue
    .line 599
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final b(I)V
    .locals 1

    .prologue
    .line 614
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/b;->a:Lcom/cleanmaster/base/util/misc/a;

    invoke-virtual {v0, p1}, Lcom/cleanmaster/base/util/misc/a;->c(I)Ljava/lang/Object;

    .line 615
    return-void
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 619
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/b;->a:Lcom/cleanmaster/base/util/misc/a;

    invoke-virtual {v0}, Lcom/cleanmaster/base/util/misc/a;->clear()V

    .line 620
    return-void
.end method
