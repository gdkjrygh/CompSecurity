.class public final Lcom/c/b/ak$k;
.super Lcom/c/b/ak$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field private final a:I

.field private b:Lcom/c/b/i$aa;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/c/b/ak$g;

.field private e:[Lcom/c/b/ak$i;


# direct methods
.method private constructor <init>(Lcom/c/b/i$aa;Lcom/c/b/ak$g;I)V
    .locals 7

    .prologue
    const/4 v5, 0x0

    .line 1740
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 1741
    iput p3, p0, Lcom/c/b/ak$k;->a:I

    .line 1742
    iput-object p1, p0, Lcom/c/b/ak$k;->b:Lcom/c/b/i$aa;

    .line 1743
    const/4 v0, 0x0

    invoke-virtual {p1}, Lcom/c/b/i$aa;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v0, v1}, Lcom/c/b/ak;->a(Lcom/c/b/ak$g;Lcom/c/b/ak$a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$k;->c:Ljava/lang/String;

    .line 1744
    iput-object p2, p0, Lcom/c/b/ak$k;->d:Lcom/c/b/ak$g;

    .line 1746
    invoke-virtual {p1}, Lcom/c/b/i$aa;->j()I

    move-result v0

    new-array v0, v0, [Lcom/c/b/ak$i;

    iput-object v0, p0, Lcom/c/b/ak$k;->e:[Lcom/c/b/ak$i;

    move v4, v5

    .line 1747
    :goto_0
    invoke-virtual {p1}, Lcom/c/b/i$aa;->j()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 1748
    iget-object v6, p0, Lcom/c/b/ak$k;->e:[Lcom/c/b/ak$i;

    new-instance v0, Lcom/c/b/ak$i;

    invoke-virtual {p1, v4}, Lcom/c/b/i$aa;->a(I)Lcom/c/b/i$u;

    move-result-object v1

    move-object v2, p2

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/c/b/ak$i;-><init>(Lcom/c/b/i$u;Lcom/c/b/ak$g;Lcom/c/b/ak$k;IB)V

    aput-object v0, v6, v4

    .line 1747
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1752
    :cond_0
    invoke-static {p2}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$h;)V

    .line 1753
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/i$aa;Lcom/c/b/ak$g;IB)V
    .locals 0

    .prologue
    .line 1686
    invoke-direct {p0, p1, p2, p3}, Lcom/c/b/ak$k;-><init>(Lcom/c/b/i$aa;Lcom/c/b/ak$g;I)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$k;)V
    .locals 4

    .prologue
    .line 1686
    iget-object v1, p0, Lcom/c/b/ak$k;->e:[Lcom/c/b/ak$i;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    invoke-static {v3}, Lcom/c/b/ak$i;->a(Lcom/c/b/ak$i;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$k;Lcom/c/b/i$aa;)V
    .locals 3

    .prologue
    .line 1686
    iput-object p1, p0, Lcom/c/b/ak$k;->b:Lcom/c/b/i$aa;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/c/b/ak$k;->e:[Lcom/c/b/ak$i;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/c/b/ak$k;->e:[Lcom/c/b/ak$i;

    aget-object v1, v1, v0

    invoke-virtual {p1, v0}, Lcom/c/b/i$aa;->a(I)Lcom/c/b/i$u;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/b/ak$i;->a(Lcom/c/b/ak$i;Lcom/c/b/i$u;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1697
    iget-object v0, p0, Lcom/c/b/ak$k;->b:Lcom/c/b/i$aa;

    invoke-virtual {v0}, Lcom/c/b/i$aa;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1703
    iget-object v0, p0, Lcom/c/b/ak$k;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 1706
    iget-object v0, p0, Lcom/c/b/ak$k;->d:Lcom/c/b/ak$g;

    return-object v0
.end method

.method public final bridge synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1686
    iget-object v0, p0, Lcom/c/b/ak$k;->b:Lcom/c/b/i$aa;

    return-object v0
.end method
