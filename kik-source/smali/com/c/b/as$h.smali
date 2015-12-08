.class public final Lcom/c/b/as$h;
.super Lcom/c/b/an;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field private a:Lcom/c/b/as$f;

.field private final b:Ljava/lang/Class;

.field private final c:Lcom/c/b/bd;

.field private final d:Ljava/lang/reflect/Method;

.field private final e:Ljava/lang/reflect/Method;

.field private final f:I


# direct methods
.method constructor <init>(Ljava/lang/Class;Lcom/c/b/bd;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 1513
    invoke-direct {p0}, Lcom/c/b/an;-><init>()V

    .line 1514
    const-class v0, Lcom/c/b/bd;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1516
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bad messageDefaultInstance for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1519
    :cond_0
    iput-object v1, p0, Lcom/c/b/as$h;->a:Lcom/c/b/as$f;

    .line 1520
    iput-object p1, p0, Lcom/c/b/as$h;->b:Ljava/lang/Class;

    .line 1521
    iput-object p2, p0, Lcom/c/b/as$h;->c:Lcom/c/b/bd;

    .line 1523
    const-class v0, Lcom/c/b/bl;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1524
    const-string v0, "valueOf"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Lcom/c/b/ak$e;

    aput-object v2, v1, v3

    invoke-static {p1, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$h;->d:Ljava/lang/reflect/Method;

    .line 1526
    const-string v0, "getValueDescriptor"

    new-array v1, v3, [Ljava/lang/Class;

    invoke-static {p1, v0, v1}, Lcom/c/b/as;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/as$h;->e:Ljava/lang/reflect/Method;

    .line 1532
    :goto_0
    iput p3, p0, Lcom/c/b/as$h;->f:I

    .line 1533
    return-void

    .line 1529
    :cond_1
    iput-object v1, p0, Lcom/c/b/as$h;->d:Ljava/lang/reflect/Method;

    .line 1530
    iput-object v1, p0, Lcom/c/b/as$h;->e:Ljava/lang/reflect/Method;

    goto :goto_0
.end method


# virtual methods
.method public final a()Lcom/c/b/ak$f;
    .locals 2

    .prologue
    .line 1556
    iget-object v0, p0, Lcom/c/b/as$h;->a:Lcom/c/b/as$f;

    if-nez v0, :cond_0

    .line 1557
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getDescriptor() called before internalInit()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1560
    :cond_0
    iget-object v0, p0, Lcom/c/b/as$h;->a:Lcom/c/b/as$f;

    invoke-interface {v0}, Lcom/c/b/as$f;->a()Lcom/c/b/ak$f;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/c/b/ak$f;)V
    .locals 2

    .prologue
    .line 1537
    iget-object v0, p0, Lcom/c/b/as$h;->a:Lcom/c/b/as$f;

    if-eqz v0, :cond_0

    .line 1538
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already initialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1540
    :cond_0
    new-instance v0, Lcom/c/b/at;

    invoke-direct {v0, p0, p1}, Lcom/c/b/at;-><init>(Lcom/c/b/as$h;Lcom/c/b/ak$f;)V

    iput-object v0, p0, Lcom/c/b/as$h;->a:Lcom/c/b/as$f;

    .line 1546
    return-void
.end method

.method protected final b()I
    .locals 1

    .prologue
    .line 1572
    iget v0, p0, Lcom/c/b/as$h;->f:I

    return v0
.end method

.method public final bridge synthetic c()Lcom/c/b/be;
    .locals 1

    .prologue
    .line 1492
    iget-object v0, p0, Lcom/c/b/as$h;->c:Lcom/c/b/bd;

    return-object v0
.end method
