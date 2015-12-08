.class final Lcom/c/b/bv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/bu$a;


# instance fields
.field final synthetic a:Lcom/c/b/f;


# direct methods
.method constructor <init>(Lcom/c/b/f;)V
    .locals 0

    .prologue
    .line 1695
    iput-object p1, p0, Lcom/c/b/bv;->a:Lcom/c/b/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)B
    .locals 1

    .prologue
    .line 1702
    iget-object v0, p0, Lcom/c/b/bv;->a:Lcom/c/b/f;

    invoke-virtual {v0, p1}, Lcom/c/b/f;->a(I)B

    move-result v0

    return v0
.end method

.method public final a()I
    .locals 1

    .prologue
    .line 1698
    iget-object v0, p0, Lcom/c/b/bv;->a:Lcom/c/b/f;

    invoke-virtual {v0}, Lcom/c/b/f;->a()I

    move-result v0

    return v0
.end method
