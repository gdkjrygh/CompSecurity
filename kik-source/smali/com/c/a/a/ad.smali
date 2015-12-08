.class final Lcom/c/a/a/ad;
.super Lcom/c/a/a/ab$a;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/c/a/a/ac;


# direct methods
.method constructor <init>(Lcom/c/a/a/ac;Lcom/c/a/a/ab;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/c/a/a/ad;->a:Lcom/c/a/a/ac;

    invoke-direct {p0, p2, p3}, Lcom/c/a/a/ab$a;-><init>(Lcom/c/a/a/ab;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method final a(I)I
    .locals 2

    .prologue
    .line 151
    iget-object v0, p0, Lcom/c/a/a/ad;->a:Lcom/c/a/a/ac;

    iget-object v0, v0, Lcom/c/a/a/ac;->a:Lcom/c/a/a/c;

    iget-object v1, p0, Lcom/c/a/a/ad;->b:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, p1}, Lcom/c/a/a/c;->a(Ljava/lang/CharSequence;I)I

    move-result v0

    return v0
.end method

.method final b(I)I
    .locals 1

    .prologue
    .line 155
    add-int/lit8 v0, p1, 0x1

    return v0
.end method
