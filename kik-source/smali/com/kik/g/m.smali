.class final Lcom/kik/g/m;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/g/l$a;

.field final synthetic b:Lcom/kik/g/l;


# direct methods
.method constructor <init>(Lcom/kik/g/l;Lcom/kik/g/l$a;)V
    .locals 0

    .prologue
    .line 48
    iput-object p1, p0, Lcom/kik/g/m;->b:Lcom/kik/g/l;

    iput-object p2, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    sget v1, Lcom/kik/g/p$a;->d:I

    iput v1, v0, Lcom/kik/g/l$a;->b:I

    .line 60
    iget-object v0, p0, Lcom/kik/g/m;->b:Lcom/kik/g/l;

    invoke-static {v0}, Lcom/kik/g/l;->a(Lcom/kik/g/l;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 61
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 66
    iget-object v0, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    sget v1, Lcom/kik/g/p$a;->c:I

    iput v1, v0, Lcom/kik/g/l$a;->b:I

    .line 67
    iget-object v0, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/kik/g/l$a;->c:Ljava/lang/String;

    .line 68
    iget-object v0, p0, Lcom/kik/g/m;->b:Lcom/kik/g/l;

    invoke-static {v0}, Lcom/kik/g/l;->a(Lcom/kik/g/l;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 69
    return-void
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 52
    iget-object v0, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    sget v1, Lcom/kik/g/p$a;->b:I

    iput v1, v0, Lcom/kik/g/l$a;->b:I

    .line 53
    iget-object v0, p0, Lcom/kik/g/m;->b:Lcom/kik/g/l;

    invoke-static {v0}, Lcom/kik/g/l;->a(Lcom/kik/g/l;)Lcom/kik/g/k;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/g/m;->a:Lcom/kik/g/l$a;

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 54
    return-void
.end method
