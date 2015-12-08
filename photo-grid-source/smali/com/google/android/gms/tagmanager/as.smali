.class final Lcom/google/android/gms/tagmanager/as;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/at;


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/aq;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/aq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/as;->a:Lcom/google/android/gms/tagmanager/aq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/xp;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/ao;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/xp;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/xo;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/internal/xo;",
            ">;",
            "Lcom/google/android/gms/tagmanager/ao;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/xp;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/xp;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/ao;->e()Lcom/google/android/gms/tagmanager/am;

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/ao;->f()Lcom/google/android/gms/tagmanager/am;

    return-void
.end method
