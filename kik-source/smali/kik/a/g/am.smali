.class final Lkik/a/g/am;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 1428
    iput-object p1, p0, Lkik/a/g/am;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1428
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x4f

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lkik/a/g/am;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->l(Lkik/a/g/v;)J

    iget-object v0, p0, Lkik/a/g/am;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->n(Lkik/a/g/v;)Lkik/a/e/v;

    move-result-object v0

    const-string v1, "ProfileManager.rosterTimeStamp"

    iget-object v2, p0, Lkik/a/g/am;->a:Lkik/a/g/v;

    invoke-static {v2}, Lkik/a/g/v;->m(Lkik/a/g/v;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    :cond_0
    return-void
.end method
