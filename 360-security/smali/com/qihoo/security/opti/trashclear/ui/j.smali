.class public Lcom/qihoo/security/opti/trashclear/ui/j;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/j$a;
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

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->b:Ljava/util/List;

    .line 26
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->d:Z

    .line 27
    iput v1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->e:I

    .line 28
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->f:Z

    .line 29
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->g:Z

    .line 31
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->h:I

    .line 66
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->c:Ljava/lang/Object;

    .line 67
    iput p2, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->h:I

    .line 68
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
    .line 89
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

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
    .line 84
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 85
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 223
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->f:Z

    .line 224
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
    .line 113
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->b:Ljava/util/List;

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
    .line 94
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 218
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->f:Z

    return v0
.end method

.method public e()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 228
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    if-nez v1, :cond_2

    .line 229
    iget-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->f:Z

    if-nez v1, :cond_1

    .line 234
    :cond_0
    :goto_0
    return v0

    .line 229
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 231
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 234
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->e()Z

    move-result v0

    goto :goto_0
.end method

.method public f()V
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 148
    return-void
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->b:Ljava/util/List;

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
    .line 108
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

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
    .line 72
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->h:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 73
    const/4 v0, 0x0

    .line 75
    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/j;->h:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0
.end method
