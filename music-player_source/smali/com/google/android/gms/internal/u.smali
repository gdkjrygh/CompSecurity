.class public final Lcom/google/android/gms/internal/u;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ah;


# instance fields
.field private final a:Lcom/google/android/gms/internal/v;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/u;->a:Lcom/google/android/gms/internal/v;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/em;Ljava/util/Map;)V
    .locals 3

    const-string v0, "name"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "App event with no name parameter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ek;->d(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/u;->a:Lcom/google/android/gms/internal/v;

    const-string v1, "info"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
