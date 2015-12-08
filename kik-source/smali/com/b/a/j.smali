.class public final Lcom/b/a/j;
.super Lcom/b/a/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/b/a/j$a;
    }
.end annotation


# instance fields
.field private final b:Lcom/b/a/j$a;

.field private c:I


# direct methods
.method public constructor <init>(Lcom/b/a/t;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/b/a/e;-><init>(Lcom/b/a/o;)V

    .line 36
    const/4 v0, 0x0

    iput v0, p0, Lcom/b/a/j;->c:I

    .line 41
    new-instance v0, Lcom/b/a/j$a;

    invoke-direct {v0}, Lcom/b/a/j$a;-><init>()V

    iput-object v0, p0, Lcom/b/a/j;->b:Lcom/b/a/j$a;

    .line 42
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Lcom/b/a/u;Z)V
    .locals 4

    .prologue
    .line 53
    iget-object v0, p0, Lcom/b/a/j;->a:Lcom/b/a/o;

    check-cast v0, Lcom/b/a/t;

    .line 55
    iget-object v1, p0, Lcom/b/a/j;->b:Lcom/b/a/j$a;

    iget v2, p0, Lcom/b/a/j;->c:I

    invoke-virtual {v1, v2, p2, v0, p1}, Lcom/b/a/j$a;->a(ILjava/lang/Object;Lcom/b/a/z;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 57
    iget v1, p0, Lcom/b/a/j;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/b/a/j;->c:I

    .line 59
    iget-object v1, v0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    const/4 v2, 0x3

    invoke-static {p1, v2}, Lcom/b/a/y;->a(II)I

    move-result v2

    iget-object v3, v0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v1, v2, v0, v3}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    iput-object v1, v0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 64
    invoke-interface {p3, p0, p2}, Lcom/b/a/u;->a(Lcom/b/a/o;Ljava/lang/Object;)V

    .line 66
    iget-object v1, v0, Lcom/b/a/t;->f:Lcom/b/a/aa;

    const/4 v2, 0x4

    invoke-static {p1, v2}, Lcom/b/a/y;->a(II)I

    move-result v2

    iget-object v3, v0, Lcom/b/a/t;->b:Lcom/b/a/m;

    invoke-virtual {v1, v2, v0, v3}, Lcom/b/a/aa;->a(ILcom/b/a/z;Lcom/b/a/m;)Lcom/b/a/m;

    move-result-object v1

    iput-object v1, v0, Lcom/b/a/t;->b:Lcom/b/a/m;

    .line 71
    :cond_0
    return-void
.end method
