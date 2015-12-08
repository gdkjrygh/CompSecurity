.class final Lcom/google/a/ak;
.super Lcom/google/a/am;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/a/am",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/a/af;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/af",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/a/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/w",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/a/k;

.field private final d:Lcom/google/a/c/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/c/a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/a/an;

.field private f:Lcom/google/a/am;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/a/af;Lcom/google/a/w;Lcom/google/a/k;Lcom/google/a/c/a;Lcom/google/a/an;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/af",
            "<TT;>;",
            "Lcom/google/a/w",
            "<TT;>;",
            "Lcom/google/a/k;",
            "Lcom/google/a/c/a",
            "<TT;>;",
            "Lcom/google/a/an;",
            ")V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/google/a/am;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/google/a/ak;->a:Lcom/google/a/af;

    .line 44
    iput-object p2, p0, Lcom/google/a/ak;->b:Lcom/google/a/w;

    .line 45
    iput-object p3, p0, Lcom/google/a/ak;->c:Lcom/google/a/k;

    .line 46
    iput-object p4, p0, Lcom/google/a/ak;->d:Lcom/google/a/c/a;

    .line 47
    iput-object p5, p0, Lcom/google/a/ak;->e:Lcom/google/a/an;

    .line 48
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/a/af;Lcom/google/a/w;Lcom/google/a/k;Lcom/google/a/c/a;Lcom/google/a/an;B)V
    .locals 0

    .prologue
    .line 31
    invoke-direct/range {p0 .. p5}, Lcom/google/a/ak;-><init>(Lcom/google/a/af;Lcom/google/a/w;Lcom/google/a/k;Lcom/google/a/c/a;Lcom/google/a/an;)V

    return-void
.end method

.method private a()Lcom/google/a/am;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 75
    iget-object v0, p0, Lcom/google/a/ak;->f:Lcom/google/a/am;

    .line 76
    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/a/ak;->c:Lcom/google/a/k;

    iget-object v1, p0, Lcom/google/a/ak;->e:Lcom/google/a/an;

    iget-object v2, p0, Lcom/google/a/ak;->d:Lcom/google/a/c/a;

    invoke-virtual {v0, v1, v2}, Lcom/google/a/k;->a(Lcom/google/a/an;Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/ak;->f:Lcom/google/a/am;

    goto :goto_0
.end method

.method public static a(Lcom/google/a/c/a;Ljava/lang/Object;)Lcom/google/a/an;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/c/a",
            "<*>;",
            "Ljava/lang/Object;",
            ")",
            "Lcom/google/a/an;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 85
    new-instance v0, Lcom/google/a/al;

    invoke-direct {v0, p1, p0, v1, v1}, Lcom/google/a/al;-><init>(Ljava/lang/Object;Lcom/google/a/c/a;ZB)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/a/d/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/d/a;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 51
    iget-object v0, p0, Lcom/google/a/ak;->b:Lcom/google/a/w;

    if-nez v0, :cond_0

    .line 52
    invoke-direct {p0}, Lcom/google/a/ak;->a()Lcom/google/a/am;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;

    move-result-object v0

    .line 58
    :goto_0
    return-object v0

    .line 54
    :cond_0
    invoke-static {p1}, Lcom/google/a/b/u;->a(Lcom/google/a/d/a;)Lcom/google/a/x;

    move-result-object v0

    .line 1068
    instance-of v1, v0, Lcom/google/a/z;

    .line 55
    if-eqz v1, :cond_1

    .line 56
    const/4 v0, 0x0

    goto :goto_0

    .line 58
    :cond_1
    iget-object v1, p0, Lcom/google/a/ak;->b:Lcom/google/a/w;

    iget-object v2, p0, Lcom/google/a/ak;->d:Lcom/google/a/c/a;

    invoke-virtual {v2}, Lcom/google/a/c/a;->b()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/google/a/w;->a(Lcom/google/a/x;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/d/f;",
            "TT;)V"
        }
    .end annotation

    .prologue
    .line 62
    iget-object v0, p0, Lcom/google/a/ak;->a:Lcom/google/a/af;

    if-nez v0, :cond_0

    .line 63
    invoke-direct {p0}, Lcom/google/a/ak;->a()Lcom/google/a/am;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V

    .line 72
    :goto_0
    return-void

    .line 66
    :cond_0
    if-nez p2, :cond_1

    .line 67
    invoke-virtual {p1}, Lcom/google/a/d/f;->f()Lcom/google/a/d/f;

    goto :goto_0

    .line 70
    :cond_1
    iget-object v0, p0, Lcom/google/a/ak;->a:Lcom/google/a/af;

    invoke-interface {v0, p2}, Lcom/google/a/af;->a(Ljava/lang/Object;)Lcom/google/a/x;

    move-result-object v0

    .line 71
    invoke-static {v0, p1}, Lcom/google/a/b/u;->a(Lcom/google/a/x;Lcom/google/a/d/f;)V

    goto :goto_0
.end method
