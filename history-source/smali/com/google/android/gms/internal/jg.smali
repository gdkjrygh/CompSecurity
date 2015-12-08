.class public final Lcom/google/android/gms/internal/jg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/jg$a;
    }
.end annotation


# instance fields
.field private final JJ:Landroid/view/View;

.field private final Mw:Lcom/google/android/gms/internal/jg$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Collection;ILandroid/view/View;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Landroid/view/View;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/jg$a;

    invoke-direct {v0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/jg$a;-><init>(Ljava/lang/String;Ljava/util/Collection;ILjava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/jg;->Mw:Lcom/google/android/gms/internal/jg$a;

    iput-object p4, p0, Lcom/google/android/gms/internal/jg;->JJ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public getAccountName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->Mw:Lcom/google/android/gms/internal/jg$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jg$a;->getAccountName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hm()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->Mw:Lcom/google/android/gms/internal/jg$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jg$a;->hm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hn()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->Mw:Lcom/google/android/gms/internal/jg$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jg$a;->hn()I

    move-result v0

    return v0
.end method

.method public ho()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->Mw:Lcom/google/android/gms/internal/jg$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jg$a;->ho()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hp()[Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->Mw:Lcom/google/android/gms/internal/jg$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jg$a;->ho()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public hq()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->Mw:Lcom/google/android/gms/internal/jg$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jg$a;->hq()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hr()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->JJ:Landroid/view/View;

    return-object v0
.end method
