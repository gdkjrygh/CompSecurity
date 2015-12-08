.class final Lcom/a/a/c/at$i;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation


# instance fields
.field private final a:[Lcom/a/a/c/at$h;


# direct methods
.method public varargs constructor <init>([Lcom/a/a/c/at$h;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 123
    new-array v0, v1, [Lcom/a/a/c/at$h;

    invoke-direct {p0, v1, v0}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 124
    iput-object p1, p0, Lcom/a/a/c/at$i;->a:[Lcom/a/a/c/at$h;

    .line 125
    return-void
.end method


# virtual methods
.method public final b()I
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 136
    .line 137
    iget-object v2, p0, Lcom/a/a/c/at$i;->a:[Lcom/a/a/c/at$h;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 138
    invoke-virtual {v4}, Lcom/a/a/c/at$h;->b()I

    move-result v4

    add-int/2addr v1, v4

    .line 137
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 140
    :cond_0
    return v1
.end method

.method public final b(Lcom/a/a/c/f;)V
    .locals 4

    .prologue
    .line 129
    iget-object v1, p0, Lcom/a/a/c/at$i;->a:[Lcom/a/a/c/at$h;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 130
    invoke-virtual {v3, p1}, Lcom/a/a/c/at$h;->b(Lcom/a/a/c/f;)V

    .line 129
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 132
    :cond_0
    return-void
.end method
