.class final Lkik/a/g/an;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 1441
    iput-object p1, p0, Lkik/a/g/an;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1441
    iget-object v0, p0, Lkik/a/g/an;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->c(Lkik/a/g/v;)Lkik/a/e/f;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/f;->j()J

    move-result-wide v0

    iget-object v2, p0, Lkik/a/g/an;->a:Lkik/a/g/v;

    invoke-static {v2}, Lkik/a/g/v;->o(Lkik/a/g/v;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x2bf20

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lkik/a/g/an;->a:Lkik/a/g/v;

    invoke-virtual {v0}, Lkik/a/g/v;->j()V

    :cond_0
    return-void
.end method
