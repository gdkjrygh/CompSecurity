.class public Lcom/flurry/sdk/ih;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final m:Ljava/lang/String;


# instance fields
.field public a:I

.field public b:J

.field public c:J

.field public d:Z

.field public e:I

.field public f:Lcom/flurry/sdk/ii;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:J

.field public j:Z

.field public k:J

.field public l:Lcom/flurry/sdk/ig;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/flurry/sdk/ih;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/ih;->m:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/flurry/sdk/ig;JJI)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/flurry/sdk/ih;->k:J

    .line 33
    iput-object p1, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    .line 34
    iput-wide p2, p0, Lcom/flurry/sdk/ih;->b:J

    .line 35
    iput-wide p4, p0, Lcom/flurry/sdk/ih;->c:J

    .line 36
    iput p6, p0, Lcom/flurry/sdk/ih;->a:I

    .line 38
    const/4 v0, 0x0

    iput v0, p0, Lcom/flurry/sdk/ih;->e:I

    .line 39
    sget-object v0, Lcom/flurry/sdk/ii;->d:Lcom/flurry/sdk/ii;

    iput-object v0, p0, Lcom/flurry/sdk/ih;->f:Lcom/flurry/sdk/ii;

    .line 40
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 43
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v0, p0}, Lcom/flurry/sdk/ig;->a(Lcom/flurry/sdk/ih;)V

    .line 46
    iget-boolean v0, p0, Lcom/flurry/sdk/ih;->d:Z

    if-eqz v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/ig;->a(Z)V

    .line 49
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 60
    if-gez p1, :cond_1

    .line 62
    iget-wide v0, p0, Lcom/flurry/sdk/ih;->k:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    .line 63
    iput-wide v2, p0, Lcom/flurry/sdk/ih;->k:J

    .line 69
    :cond_0
    :goto_0
    return-void

    .line 67
    :cond_1
    iget-wide v0, p0, Lcom/flurry/sdk/ih;->k:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/flurry/sdk/ih;->k:J

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v0, p1}, Lcom/flurry/sdk/ig;->c(Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->c()Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 2

    .prologue
    .line 56
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    iget v1, p0, Lcom/flurry/sdk/ih;->h:I

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/ig;->a(I)Z

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->t()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/flurry/sdk/ih;->l:Lcom/flurry/sdk/ig;

    invoke-virtual {v0}, Lcom/flurry/sdk/ig;->b()V

    .line 89
    return-void
.end method
