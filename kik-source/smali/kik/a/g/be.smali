.class final Lkik/a/g/be;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/a/g/az;


# direct methods
.method constructor <init>(Lkik/a/g/az;Z)V
    .locals 0

    .prologue
    .line 250
    iput-object p1, p0, Lkik/a/g/be;->b:Lkik/a/g/az;

    iput-boolean p2, p0, Lkik/a/g/be;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 250
    check-cast p1, Lkik/a/f/f/ao;

    invoke-virtual {p1}, Lkik/a/f/f/ao;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-boolean v1, p0, Lkik/a/g/be;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lkik/a/d/aa;->h:Ljava/lang/Boolean;

    iget-object v1, p0, Lkik/a/g/be;->b:Lkik/a/g/az;

    invoke-virtual {v1, v0}, Lkik/a/g/az;->a(Lkik/a/d/aa;)V

    iget-object v0, p0, Lkik/a/g/be;->b:Lkik/a/g/az;

    invoke-virtual {v0}, Lkik/a/g/az;->d()Lkik/a/d/aa;

    move-result-object v0

    return-object v0
.end method
