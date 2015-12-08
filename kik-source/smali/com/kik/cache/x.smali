.class public final Lcom/kik/cache/x;
.super Lcom/android/volley/n;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cache/au;


# instance fields
.field private a:Lcom/android/volley/r$b;

.field private b:Lcom/android/volley/n$a;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/kik/cache/x;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;B)V

    .line 32
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;B)V
    .locals 4

    .prologue
    .line 36
    invoke-direct {p0, p1, p3}, Lcom/android/volley/n;-><init>(Ljava/lang/String;Lcom/android/volley/r$a;)V

    .line 37
    new-instance v0, Lcom/android/volley/e;

    const/16 v1, 0x3e8

    const/4 v2, 0x2

    const/high16 v3, 0x40000000    # 2.0f

    invoke-direct {v0, v1, v2, v3}, Lcom/android/volley/e;-><init>(IIF)V

    invoke-virtual {p0, v0}, Lcom/kik/cache/x;->a(Lcom/android/volley/t;)V

    .line 38
    iput-object p2, p0, Lcom/kik/cache/x;->a:Lcom/android/volley/r$b;

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cache/x;->b:Lcom/android/volley/n$a;

    .line 40
    return-void
.end method


# virtual methods
.method protected final a(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 6

    .prologue
    const-wide/32 v4, 0x41353000

    .line 45
    invoke-static {p1}, Lcom/android/volley/toolbox/f;->a(Lcom/android/volley/k;)Lcom/android/volley/b$a;

    move-result-object v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    iget-wide v2, v0, Lcom/android/volley/b$a;->e:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/android/volley/b$a;->e:J

    .line 49
    iget-wide v2, v0, Lcom/android/volley/b$a;->d:J

    add-long/2addr v2, v4

    iput-wide v2, v0, Lcom/android/volley/b$a;->d:J

    .line 52
    :cond_0
    iget-object v1, p1, Lcom/android/volley/k;->b:[B

    invoke-static {v1, v0}, Lcom/android/volley/r;->a(Ljava/lang/Object;Lcom/android/volley/b$a;)Lcom/android/volley/r;

    move-result-object v0

    return-object v0
.end method

.method public final a_(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/kik/cache/x;->c:Ljava/lang/String;

    .line 74
    return-void
.end method

.method protected final synthetic b(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 10
    check-cast p1, [B

    iget-object v0, p0, Lcom/kik/cache/x;->a:Lcom/android/volley/r$b;

    invoke-interface {v0, p1}, Lcom/android/volley/r$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/kik/cache/x;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cache/x;->c:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/android/volley/n;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final o()Lcom/android/volley/n$a;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/kik/cache/x;->b:Lcom/android/volley/n$a;

    if-nez v0, :cond_0

    .line 65
    sget-object v0, Lcom/android/volley/n$a;->a:Lcom/android/volley/n$a;

    .line 67
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/kik/cache/x;->b:Lcom/android/volley/n$a;

    goto :goto_0
.end method

.method public final t()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    invoke-super {p0}, Lcom/android/volley/n;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
