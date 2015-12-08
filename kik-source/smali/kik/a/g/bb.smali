.class final Lkik/a/g/bb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[B

.field final synthetic c:Lkik/a/g/az;


# direct methods
.method constructor <init>(Lkik/a/g/az;Ljava/lang/String;[B)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lkik/a/g/bb;->c:Lkik/a/g/az;

    iput-object p2, p0, Lkik/a/g/bb;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/a/g/bb;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 177
    check-cast p1, Lkik/a/f/f/ao;

    invoke-virtual {p1}, Lkik/a/f/f/ao;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v1, p0, Lkik/a/g/bb;->a:Ljava/lang/String;

    iput-object v1, v0, Lkik/a/d/aa;->a:Ljava/lang/String;

    iget-object v1, p0, Lkik/a/g/bb;->c:Lkik/a/g/az;

    invoke-virtual {v1, v0}, Lkik/a/g/az;->a(Lkik/a/d/aa;)V

    iget-object v0, p0, Lkik/a/g/bb;->b:[B

    iget-object v1, p0, Lkik/a/g/bb;->c:Lkik/a/g/az;

    invoke-static {v1}, Lkik/a/g/az;->b(Lkik/a/g/az;)Lkik/a/e/v;

    move-result-object v1

    const-string v2, "CredentialData.email_passkey"

    invoke-static {v0}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    iget-object v0, p0, Lkik/a/g/bb;->c:Lkik/a/g/az;

    invoke-virtual {v0}, Lkik/a/g/az;->d()Lkik/a/d/aa;

    move-result-object v0

    return-object v0
.end method
