.class abstract Lcom/a/a/c/at$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "h"
.end annotation


# instance fields
.field private final a:I

.field private final b:[Lcom/a/a/c/at$h;


# direct methods
.method public varargs constructor <init>(I[Lcom/a/a/c/at$h;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput p1, p0, Lcom/a/a/c/at$h;->a:I

    .line 48
    iput-object p2, p0, Lcom/a/a/c/at$h;->b:[Lcom/a/a/c/at$h;

    .line 49
    return-void
.end method

.method private c()I
    .locals 5

    .prologue
    .line 69
    invoke-virtual {p0}, Lcom/a/a/c/at$h;->a()I

    move-result v1

    .line 70
    iget-object v2, p0, Lcom/a/a/c/at$h;->b:[Lcom/a/a/c/at$h;

    array-length v3, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 71
    invoke-virtual {v4}, Lcom/a/a/c/at$h;->b()I

    move-result v4

    add-int/2addr v1, v4

    .line 70
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 73
    :cond_0
    return v1
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 99
    const/4 v0, 0x0

    return v0
.end method

.method public a(Lcom/a/a/c/f;)V
    .locals 0

    .prologue
    .line 112
    return-void
.end method

.method public b()I
    .locals 2

    .prologue
    .line 57
    invoke-direct {p0}, Lcom/a/a/c/at$h;->c()I

    move-result v0

    .line 58
    invoke-static {v0}, Lcom/a/a/c/f;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 59
    iget v1, p0, Lcom/a/a/c/at$h;->a:I

    invoke-static {v1}, Lcom/a/a/c/f;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 60
    return v0
.end method

.method public b(Lcom/a/a/c/f;)V
    .locals 4

    .prologue
    .line 83
    iget v0, p0, Lcom/a/a/c/at$h;->a:I

    const/4 v1, 0x2

    invoke-virtual {p1, v0, v1}, Lcom/a/a/c/f;->e(II)V

    .line 84
    invoke-direct {p0}, Lcom/a/a/c/at$h;->c()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/a/a/c/f;->e(I)V

    .line 85
    invoke-virtual {p0, p1}, Lcom/a/a/c/at$h;->a(Lcom/a/a/c/f;)V

    .line 86
    iget-object v1, p0, Lcom/a/a/c/at$h;->b:[Lcom/a/a/c/at$h;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 87
    invoke-virtual {v3, p1}, Lcom/a/a/c/at$h;->b(Lcom/a/a/c/f;)V

    .line 86
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 89
    :cond_0
    return-void
.end method
