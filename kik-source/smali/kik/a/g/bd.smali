.class final Lkik/a/g/bd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/a/g/az;


# direct methods
.method constructor <init>(Lkik/a/g/az;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lkik/a/g/bd;->b:Lkik/a/g/az;

    iput-object p2, p0, Lkik/a/g/bd;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 233
    check-cast p1, Lkik/a/f/f/ao;

    iget-object v0, p0, Lkik/a/g/bd;->b:Lkik/a/g/az;

    invoke-virtual {p1}, Lkik/a/f/f/ao;->d()Lkik/a/d/aa;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/a/g/az;->a(Lkik/a/d/aa;)V

    iget-object v0, p0, Lkik/a/g/bd;->b:Lkik/a/g/az;

    invoke-static {v0}, Lkik/a/g/az;->c(Lkik/a/g/az;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/bd;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/a/g/bd;->b:Lkik/a/g/az;

    invoke-virtual {v0}, Lkik/a/g/az;->d()Lkik/a/d/aa;

    move-result-object v0

    return-object v0
.end method
