.class abstract Lcom/c/a/c/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/a/c/k;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;)Lcom/c/a/c/k;
    .locals 3

    .prologue
    .line 40
    const/4 v0, 0x0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    .line 41
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, Lcom/c/a/c/a;->a(C)Lcom/c/a/c/k;

    .line 40
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 43
    :cond_0
    return-object p0
.end method

.method public synthetic b(Ljava/lang/CharSequence;)Lcom/c/a/c/n;
    .locals 1

    .prologue
    .line 26
    invoke-virtual {p0, p1}, Lcom/c/a/c/a;->a(Ljava/lang/CharSequence;)Lcom/c/a/c/k;

    move-result-object v0

    return-object v0
.end method
