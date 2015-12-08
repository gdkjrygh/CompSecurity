.class final Lkik/a/g/aj;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 1405
    iput-object p1, p0, Lkik/a/g/aj;->a:Lkik/a/g/v;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1405
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/a/g/aj;->a:Lkik/a/g/v;

    invoke-virtual {v0, v1, v1}, Lkik/a/g/v;->a(ZZ)V

    iget-object v0, p0, Lkik/a/g/aj;->a:Lkik/a/g/v;

    invoke-virtual {v0}, Lkik/a/g/v;->m()V

    iget-object v0, p0, Lkik/a/g/aj;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->k(Lkik/a/g/v;)V

    iget-object v0, p0, Lkik/a/g/aj;->a:Lkik/a/g/v;

    invoke-virtual {v0}, Lkik/a/g/v;->p()V

    :cond_0
    return-void
.end method
