.class public final Lkik/a/f/f/al;
.super Lkik/a/f/f/y;
.source "SourceFile"


# instance fields
.field private final a:Lkik/a/d/j;

.field private final b:[B

.field private final i:I

.field private final j:Ljava/lang/String;


# direct methods
.method public constructor <init>([BILjava/lang/String;Lkik/a/d/j;)V
    .locals 2

    .prologue
    .line 33
    const/4 v0, 0x0

    const-string v1, "set"

    invoke-direct {p0, v0, v1}, Lkik/a/f/f/y;-><init>(Lkik/a/f/j;Ljava/lang/String;)V

    .line 34
    iput-object p4, p0, Lkik/a/f/f/al;->a:Lkik/a/d/j;

    .line 35
    iput-object p1, p0, Lkik/a/f/f/al;->b:[B

    .line 36
    iput p2, p0, Lkik/a/f/f/al;->i:I

    .line 37
    iput-object p3, p0, Lkik/a/f/f/al;->j:Ljava/lang/String;

    .line 38
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/f/n;)V
    .locals 2

    .prologue
    .line 61
    const-string v0, "query"

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lkik/a/f/n;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string v0, "xmlns"

    const-string v1, "kik:iq:scan"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    return-void
.end method

.method protected final b(Lkik/a/f/o;)V
    .locals 3

    .prologue
    .line 43
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 44
    const-string v0, "xmlns"

    const-string v1, "kik:iq:scan"

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    const-string v0, "scan"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lkik/a/f/f/al;->a:Lkik/a/d/j;

    if-eqz v0, :cond_0

    .line 47
    const-string v0, "jid"

    iget-object v1, p0, Lkik/a/f/f/al;->a:Lkik/a/d/j;

    invoke-virtual {v1}, Lkik/a/d/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :cond_0
    iget-object v0, p0, Lkik/a/f/f/al;->j:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 50
    const-string v0, "data"

    iget-object v1, p0, Lkik/a/f/f/al;->j:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    :cond_1
    const-string v0, "bytes"

    iget-object v1, p0, Lkik/a/f/f/al;->b:[B

    invoke-static {v1}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    const-string v0, "nonce"

    iget v1, p0, Lkik/a/f/f/al;->i:I

    const v2, 0xffff

    and-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    const-string v0, "scan"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 55
    const-string v0, "query"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 56
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    return v0
.end method
