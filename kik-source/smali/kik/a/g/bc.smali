.class final Lkik/a/g/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/a/g/az;


# direct methods
.method constructor <init>(Lkik/a/g/az;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lkik/a/g/bc;->c:Lkik/a/g/az;

    iput-object p2, p0, Lkik/a/g/bc;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/g/bc;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 198
    check-cast p1, Lkik/a/f/f/ao;

    invoke-virtual {p1}, Lkik/a/f/f/ao;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/bc;->a:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->d:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/g/bc;->b:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->e:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/g/bc;->c:Lkik/a/g/az;

    invoke-virtual {v1, v0}, Lkik/a/g/az;->a(Lkik/a/d/aa;)V

    iget-object v0, p0, Lkik/a/g/bc;->c:Lkik/a/g/az;

    invoke-virtual {v0}, Lkik/a/g/az;->d()Lkik/a/d/aa;

    move-result-object v0

    return-object v0
.end method
