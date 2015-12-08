.class final Lcom/c/b/bo$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lcom/c/b/bo;

.field private final c:Lcom/c/b/bo$a;

.field private d:Lcom/c/b/f$a;


# direct methods
.method private constructor <init>(Lcom/c/b/bo;)V
    .locals 2

    .prologue
    .line 803
    iput-object p1, p0, Lcom/c/b/bo$b;->b:Lcom/c/b/bo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 804
    new-instance v0, Lcom/c/b/bo$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/bo$a;-><init>(Lcom/c/b/f;B)V

    iput-object v0, p0, Lcom/c/b/bo$b;->c:Lcom/c/b/bo$a;

    .line 805
    iget-object v0, p0, Lcom/c/b/bo$b;->c:Lcom/c/b/bo$a;

    invoke-virtual {v0}, Lcom/c/b/bo$a;->a()Lcom/c/b/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ba;->c()Lcom/c/b/f$a;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bo$b;->d:Lcom/c/b/f$a;

    .line 806
    invoke-virtual {p1}, Lcom/c/b/bo;->a()I

    move-result v0

    iput v0, p0, Lcom/c/b/bo$b;->a:I

    .line 807
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/bo;B)V
    .locals 0

    .prologue
    .line 797
    invoke-direct {p0, p1}, Lcom/c/b/bo$b;-><init>(Lcom/c/b/bo;)V

    return-void
.end method


# virtual methods
.method public final a()B
    .locals 1

    .prologue
    .line 818
    iget-object v0, p0, Lcom/c/b/bo$b;->d:Lcom/c/b/f$a;

    invoke-interface {v0}, Lcom/c/b/f$a;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 819
    iget-object v0, p0, Lcom/c/b/bo$b;->c:Lcom/c/b/bo$a;

    invoke-virtual {v0}, Lcom/c/b/bo$a;->a()Lcom/c/b/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/b/ba;->c()Lcom/c/b/f$a;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bo$b;->d:Lcom/c/b/f$a;

    .line 821
    :cond_0
    iget v0, p0, Lcom/c/b/bo$b;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/c/b/bo$b;->a:I

    .line 822
    iget-object v0, p0, Lcom/c/b/bo$b;->d:Lcom/c/b/f$a;

    invoke-interface {v0}, Lcom/c/b/f$a;->a()B

    move-result v0

    return v0
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 810
    iget v0, p0, Lcom/c/b/bo$b;->a:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 797
    invoke-virtual {p0}, Lcom/c/b/bo$b;->a()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 826
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
