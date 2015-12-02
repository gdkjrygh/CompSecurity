.class public Lcom/qihoo/security/adv/d;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:Lcom/qihoo/security/adv/e;

.field public b:Lcom/qihoo/security/appbox/core/c;

.field private c:I

.field private d:I

.field private e:I

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/c;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/d;->h:Ljava/util/List;

    .line 58
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/adv/d;->j:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 69
    iget v0, p0, Lcom/qihoo/security/adv/d;->j:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 77
    iput p1, p0, Lcom/qihoo/security/adv/d;->j:I

    .line 78
    return-void
.end method

.method public a(Lcom/qihoo/security/adv/e;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    .line 149
    return-void
.end method

.method public a(Lcom/qihoo/security/appbox/core/c;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    .line 93
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 124
    iput-object p1, p0, Lcom/qihoo/security/adv/d;->f:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/c;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 140
    iput-object p1, p0, Lcom/qihoo/security/adv/d;->h:Ljava/util/List;

    .line 141
    return-void
.end method

.method public b()Lcom/qihoo/security/appbox/core/c;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 100
    iput p1, p0, Lcom/qihoo/security/adv/d;->c:I

    .line 101
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lcom/qihoo/security/adv/d;->g:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public c()I
    .locals 1

    .prologue
    .line 96
    iget v0, p0, Lcom/qihoo/security/adv/d;->c:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 108
    iput p1, p0, Lcom/qihoo/security/adv/d;->d:I

    .line 109
    return-void
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 17
    invoke-virtual {p0}, Lcom/qihoo/security/adv/d;->j()Lcom/qihoo/security/adv/d;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 104
    iget v0, p0, Lcom/qihoo/security/adv/d;->d:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .prologue
    .line 116
    iput p1, p0, Lcom/qihoo/security/adv/d;->e:I

    .line 117
    return-void
.end method

.method public e()I
    .locals 1

    .prologue
    .line 112
    iget v0, p0, Lcom/qihoo/security/adv/d;->e:I

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/qihoo/security/adv/d;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/qihoo/security/adv/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 136
    iget-object v0, p0, Lcom/qihoo/security/adv/d;->h:Ljava/util/List;

    return-object v0
.end method

.method public i()Lcom/qihoo/security/adv/e;
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    return-object v0
.end method

.method public j()Lcom/qihoo/security/adv/d;
    .locals 2

    .prologue
    .line 160
    new-instance v0, Lcom/qihoo/security/adv/d;

    invoke-direct {v0}, Lcom/qihoo/security/adv/d;-><init>()V

    .line 161
    iget-object v1, p0, Lcom/qihoo/security/adv/d;->h:Ljava/util/List;

    iput-object v1, v0, Lcom/qihoo/security/adv/d;->h:Ljava/util/List;

    .line 162
    iget-object v1, p0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    iput-object v1, v0, Lcom/qihoo/security/adv/d;->a:Lcom/qihoo/security/adv/e;

    .line 163
    iget-object v1, p0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    iput-object v1, v0, Lcom/qihoo/security/adv/d;->b:Lcom/qihoo/security/appbox/core/c;

    .line 164
    iget-object v1, p0, Lcom/qihoo/security/adv/d;->f:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/adv/d;->f:Ljava/lang/String;

    .line 165
    iget-object v1, p0, Lcom/qihoo/security/adv/d;->g:Ljava/lang/String;

    iput-object v1, v0, Lcom/qihoo/security/adv/d;->g:Ljava/lang/String;

    .line 166
    iget v1, p0, Lcom/qihoo/security/adv/d;->c:I

    iput v1, v0, Lcom/qihoo/security/adv/d;->c:I

    .line 167
    iget v1, p0, Lcom/qihoo/security/adv/d;->i:I

    iput v1, v0, Lcom/qihoo/security/adv/d;->i:I

    .line 168
    iget v1, p0, Lcom/qihoo/security/adv/d;->e:I

    iput v1, v0, Lcom/qihoo/security/adv/d;->e:I

    .line 169
    iget v1, p0, Lcom/qihoo/security/adv/d;->d:I

    iput v1, v0, Lcom/qihoo/security/adv/d;->d:I

    .line 170
    iget v1, p0, Lcom/qihoo/security/adv/d;->j:I

    iput v1, v0, Lcom/qihoo/security/adv/d;->j:I

    .line 171
    return-object v0
.end method
