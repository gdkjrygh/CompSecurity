.class Lcom/google/android/gms/internal/ac$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/bc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ac;->b(Lcom/google/android/gms/internal/ae;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lM:Lcom/google/android/gms/internal/ac;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ac;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ac$4;->lM:Lcom/google/android/gms/internal/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/google/android/gms/internal/ex;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ex;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "pingType"

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "unloadPing"

    const-string v1, "pingType"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ac$4;->lM:Lcom/google/android/gms/internal/ac;

    iget-object v1, p0, Lcom/google/android/gms/internal/ac$4;->lM:Lcom/google/android/gms/internal/ac;

    invoke-static {v1}, Lcom/google/android/gms/internal/ac;->b(Lcom/google/android/gms/internal/ac;)Lcom/google/android/gms/internal/ae;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ac;->c(Lcom/google/android/gms/internal/ae;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unregistered GMSG handlers for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ac$4;->lM:Lcom/google/android/gms/internal/ac;

    invoke-static {v1}, Lcom/google/android/gms/internal/ac;->c(Lcom/google/android/gms/internal/ac;)Lcom/google/android/gms/internal/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/aa;->au()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->B(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
