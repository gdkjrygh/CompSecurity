.class public Lcom/qihoo/security/ui/antivirus/list/e;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/list/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/qihoo/security/opti/trashclear/ui/i",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/qihoo/security/opti/trashclear/ui/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:I

.field private f:Z

.field private g:Z

.field private h:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->b:Ljava/util/List;

    .line 29
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->d:Z

    .line 30
    iput v1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->e:I

    .line 31
    iput-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->f:Z

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->g:Z

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->h:I

    .line 71
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->c:Ljava/lang/Object;

    .line 72
    iput p2, p0, Lcom/qihoo/security/ui/antivirus/list/e;->h:I

    .line 73
    return-void
.end method


# virtual methods
.method public a()Lcom/qihoo/security/opti/trashclear/ui/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 94
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    return-object v0
.end method

.method public a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 89
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 90
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 225
    iput-boolean p1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->f:Z

    .line 226
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<TT;>;>;"
        }
    .end annotation

    .prologue
    .line 118
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->b:Ljava/util/List;

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 99
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 220
    iget-boolean v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->f:Z

    return v0
.end method

.method public e()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 230
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-nez v1, :cond_2

    .line 231
    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->f:Z

    if-nez v1, :cond_1

    .line 236
    :cond_0
    :goto_0
    return v0

    .line 231
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 233
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/e;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->e()Z

    move-result v0

    goto :goto_0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 150
    return-void
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public i()Ljava/lang/Integer;
    .locals 2

    .prologue
    .line 77
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->h:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 78
    const/4 v0, 0x0

    .line 80
    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/ui/antivirus/list/e;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method
