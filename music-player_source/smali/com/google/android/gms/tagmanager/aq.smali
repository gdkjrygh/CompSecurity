.class final Lcom/google/android/gms/tagmanager/aq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/ar;


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/ao;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/ao;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/aq;->a:Lcom/google/android/gms/tagmanager/ao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/tagmanager/am;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/aj;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->d()Ljava/util/List;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/aj;->e()Lcom/google/android/gms/tagmanager/ah;

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->c()Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->e()Ljava/util/List;

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/aj;->f()Lcom/google/android/gms/tagmanager/ah;

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->d()Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/tagmanager/am;->f()Ljava/util/List;

    return-void
.end method
