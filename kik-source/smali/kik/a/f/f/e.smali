.class public final Lkik/a/f/f/e;
.super Lkik/a/f/f/z;
.source "SourceFile"


# instance fields
.field protected final a:Ljava/lang/String;

.field protected final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 19
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/a/f/f/z;-><init>(Lkik/a/f/j;)V

    .line 20
    iput-object p1, p0, Lkik/a/f/f/e;->a:Ljava/lang/String;

    .line 21
    invoke-static {}, Lkik/a/f/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/a/f/f/e;->b:Ljava/lang/String;

    .line 22
    return-void
.end method


# virtual methods
.method public final a(Lkik/a/f/o;)V
    .locals 2

    .prologue
    .line 45
    const-string v0, "di"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->a(Ljava/lang/String;)V

    .line 46
    const-string v0, "id"

    iget-object v1, p0, Lkik/a/f/f/e;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lkik/a/f/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lkik/a/f/f/e;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lkik/a/f/o;->c(Ljava/lang/String;)Lorg/d/a/c;

    .line 48
    const-string v0, "di"

    invoke-virtual {p1, v0}, Lkik/a/f/o;->b(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1}, Lkik/a/f/o;->c()V

    .line 50
    return-void
.end method

.method public final a(J)Z
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    return v0
.end method

.method public final l_()Ljava/lang/String;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lkik/a/f/f/e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final m_()J
    .locals 2

    .prologue
    .line 39
    const-wide/16 v0, -0x1

    return-wide v0
.end method
