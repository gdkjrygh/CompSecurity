.class abstract Lcom/google/android/gms/tagmanager/q;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/Set;


# virtual methods
.method public abstract a()Z
.end method

.method final a(Ljava/util/Set;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/q;->a:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public abstract b()Lcom/google/android/gms/internal/ej;
.end method

.method public final c()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/q;->a:Ljava/util/Set;

    return-object v0
.end method
