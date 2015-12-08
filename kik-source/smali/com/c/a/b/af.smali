.class final Lcom/c/a/b/af;
.super Lcom/c/a/b/i;
.source "SourceFile"


# instance fields
.field private final a:Lcom/c/a/b/k;

.field private final b:Lcom/c/a/b/m;


# direct methods
.method private constructor <init>(Lcom/c/a/b/k;Lcom/c/a/b/m;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/c/a/b/i;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/c/a/b/af;->a:Lcom/c/a/b/k;

    .line 36
    iput-object p2, p0, Lcom/c/a/b/af;->b:Lcom/c/a/b/m;

    .line 37
    return-void
.end method

.method constructor <init>(Lcom/c/a/b/k;[Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 40
    invoke-static {p2}, Lcom/c/a/b/m;->a([Ljava/lang/Object;)Lcom/c/a/b/m;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/c/a/b/af;-><init>(Lcom/c/a/b/k;Lcom/c/a/b/m;)V

    .line 41
    return-void
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/c/a/b/af;->b:Lcom/c/a/b/m;

    invoke-virtual {v0, p1, p2}, Lcom/c/a/b/m;->a([Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public final a(I)Lcom/c/a/b/ap;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/c/a/b/af;->b:Lcom/c/a/b/m;

    invoke-virtual {v0, p1}, Lcom/c/a/b/m;->a(I)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method

.method final d()Lcom/c/a/b/k;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/c/a/b/af;->a:Lcom/c/a/b/k;

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/c/a/b/af;->b:Lcom/c/a/b/m;

    invoke-virtual {v0, p1}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 28
    invoke-virtual {p0, p1}, Lcom/c/a/b/af;->a(I)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method
