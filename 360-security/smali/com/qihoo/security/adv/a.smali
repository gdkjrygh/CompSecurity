.class public Lcom/qihoo/security/adv/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:I

.field private b:J

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/e;",
            ">;"
        }
    .end annotation
.end field

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/a;->c:Ljava/util/List;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/a;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 24
    iget-wide v0, p0, Lcom/qihoo/security/adv/a;->e:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 36
    iput p1, p0, Lcom/qihoo/security/adv/a;->a:I

    .line 37
    return-void
.end method

.method public a(J)V
    .locals 1

    .prologue
    .line 28
    iput-wide p1, p0, Lcom/qihoo/security/adv/a;->e:J

    .line 29
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 52
    iput-object p1, p0, Lcom/qihoo/security/adv/a;->c:Ljava/util/List;

    .line 53
    return-void
.end method

.method public b()J
    .locals 2

    .prologue
    .line 40
    iget-wide v0, p0, Lcom/qihoo/security/adv/a;->b:J

    return-wide v0
.end method

.method public b(J)V
    .locals 1

    .prologue
    .line 44
    iput-wide p1, p0, Lcom/qihoo/security/adv/a;->b:J

    .line 45
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/e;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    iput-object p1, p0, Lcom/qihoo/security/adv/a;->d:Ljava/util/List;

    .line 61
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 48
    iget-object v0, p0, Lcom/qihoo/security/adv/a;->c:Ljava/util/List;

    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 15
    invoke-virtual {p0}, Lcom/qihoo/security/adv/a;->e()Lcom/qihoo/security/adv/a;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 56
    iget-object v0, p0, Lcom/qihoo/security/adv/a;->d:Ljava/util/List;

    return-object v0
.end method

.method public e()Lcom/qihoo/security/adv/a;
    .locals 4

    .prologue
    .line 65
    new-instance v1, Lcom/qihoo/security/adv/a;

    invoke-direct {v1}, Lcom/qihoo/security/adv/a;-><init>()V

    .line 66
    iget v0, p0, Lcom/qihoo/security/adv/a;->a:I

    iput v0, v1, Lcom/qihoo/security/adv/a;->a:I

    .line 67
    iget-wide v2, p0, Lcom/qihoo/security/adv/a;->b:J

    iput-wide v2, v1, Lcom/qihoo/security/adv/a;->b:J

    .line 68
    iget-wide v2, p0, Lcom/qihoo/security/adv/a;->e:J

    iput-wide v2, v1, Lcom/qihoo/security/adv/a;->e:J

    .line 69
    iget-object v0, p0, Lcom/qihoo/security/adv/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 70
    iget-object v3, v1, Lcom/qihoo/security/adv/a;->c:Ljava/util/List;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->j()Lcom/qihoo/security/adv/d;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/adv/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/e;

    .line 73
    iget-object v3, v1, Lcom/qihoo/security/adv/a;->d:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 75
    :cond_1
    return-object v1
.end method
