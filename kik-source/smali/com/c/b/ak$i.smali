.class public final Lcom/c/b/ak$i;
.super Lcom/c/b/ak$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field private final a:I

.field private b:Lcom/c/b/i$u;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/c/b/ak$g;

.field private final e:Lcom/c/b/ak$k;

.field private f:Lcom/c/b/ak$a;

.field private g:Lcom/c/b/ak$a;


# direct methods
.method private constructor <init>(Lcom/c/b/i$u;Lcom/c/b/ak$g;Lcom/c/b/ak$k;I)V
    .locals 2

    .prologue
    .line 1826
    invoke-direct {p0}, Lcom/c/b/ak$h;-><init>()V

    .line 1827
    iput p4, p0, Lcom/c/b/ak$i;->a:I

    .line 1828
    iput-object p1, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    .line 1829
    iput-object p2, p0, Lcom/c/b/ak$i;->d:Lcom/c/b/ak$g;

    .line 1830
    iput-object p3, p0, Lcom/c/b/ak$i;->e:Lcom/c/b/ak$k;

    .line 1832
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Lcom/c/b/ak$k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/c/b/i$u;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$i;->c:Ljava/lang/String;

    .line 1834
    invoke-static {p2}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/ak$b;->a(Lcom/c/b/ak$h;)V

    .line 1835
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/i$u;Lcom/c/b/ak$g;Lcom/c/b/ak$k;IB)V
    .locals 0

    .prologue
    .line 1776
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/c/b/ak$i;-><init>(Lcom/c/b/i$u;Lcom/c/b/ak$g;Lcom/c/b/ak$k;I)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$i;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1776
    iget-object v0, p0, Lcom/c/b/ak$i;->d:Lcom/c/b/ak$g;

    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    invoke-virtual {v1}, Lcom/c/b/i$u;->k()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/c/b/ak$b$c;->a:I

    invoke-virtual {v0, v1, p0, v2}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$h;I)Lcom/c/b/ak$h;

    move-result-object v0

    instance-of v1, v0, Lcom/c/b/ak$a;

    if-nez v1, :cond_0

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    invoke-virtual {v2}, Lcom/c/b/i$u;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not a message type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_0
    check-cast v0, Lcom/c/b/ak$a;

    iput-object v0, p0, Lcom/c/b/ak$i;->f:Lcom/c/b/ak$a;

    iget-object v0, p0, Lcom/c/b/ak$i;->d:Lcom/c/b/ak$g;

    invoke-static {v0}, Lcom/c/b/ak$g;->a(Lcom/c/b/ak$g;)Lcom/c/b/ak$b;

    move-result-object v0

    iget-object v1, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    invoke-virtual {v1}, Lcom/c/b/i$u;->m()Ljava/lang/String;

    move-result-object v1

    sget v2, Lcom/c/b/ak$b$c;->a:I

    invoke-virtual {v0, v1, p0, v2}, Lcom/c/b/ak$b;->a(Ljava/lang/String;Lcom/c/b/ak$h;I)Lcom/c/b/ak$h;

    move-result-object v0

    instance-of v1, v0, Lcom/c/b/ak$a;

    if-nez v1, :cond_1

    new-instance v0, Lcom/c/b/ak$c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    invoke-virtual {v2}, Lcom/c/b/i$u;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\" is not a message type."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1, v3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V

    throw v0

    :cond_1
    check-cast v0, Lcom/c/b/ak$a;

    iput-object v0, p0, Lcom/c/b/ak$i;->g:Lcom/c/b/ak$a;

    return-void
.end method

.method static synthetic a(Lcom/c/b/ak$i;Lcom/c/b/i$u;)V
    .locals 0

    .prologue
    .line 1776
    iput-object p1, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1787
    iget-object v0, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    invoke-virtual {v0}, Lcom/c/b/i$u;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1793
    iget-object v0, p0, Lcom/c/b/ak$i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/c/b/ak$g;
    .locals 1

    .prologue
    .line 1796
    iget-object v0, p0, Lcom/c/b/ak$i;->d:Lcom/c/b/ak$g;

    return-object v0
.end method

.method public final bridge synthetic i()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 1776
    iget-object v0, p0, Lcom/c/b/ak$i;->b:Lcom/c/b/i$u;

    return-object v0
.end method
