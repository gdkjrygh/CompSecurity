.class final Lcom/b/a/c/be;
.super Lcom/b/a/c/bj;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(JLjava/lang/String;[Lcom/b/a/c/bj;)V
    .locals 1

    .prologue
    .line 176
    const/16 v0, 0xa

    invoke-direct {p0, v0, p4}, Lcom/b/a/c/bj;-><init>(I[Lcom/b/a/c/bj;)V

    .line 177
    iput-wide p1, p0, Lcom/b/a/c/be;->a:J

    .line 178
    iput-object p3, p0, Lcom/b/a/c/be;->b:Ljava/lang/String;

    .line 179
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    .line 183
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/b/a/c/be;->a:J

    invoke-static {v0, v2, v3}, Lcom/b/a/c/f;->b(IJ)I

    move-result v0

    .line 184
    const/4 v1, 0x2

    iget-object v2, p0, Lcom/b/a/c/be;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/b/a/c/f;->b(ILcom/b/a/c/b;)I

    move-result v1

    .line 186
    add-int/2addr v0, v1

    return v0
.end method

.method public final a(Lcom/b/a/c/f;)V
    .locals 4

    .prologue
    .line 191
    const/4 v0, 0x1

    iget-wide v2, p0, Lcom/b/a/c/be;->a:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/b/a/c/f;->a(IJ)V

    .line 192
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/b/a/c/be;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/b/a/c/b;->a(Ljava/lang/String;)Lcom/b/a/c/b;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/b/a/c/f;->a(ILcom/b/a/c/b;)V

    .line 193
    return-void
.end method
