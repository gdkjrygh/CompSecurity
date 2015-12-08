.class final Lcom/google/android/gms/internal/au;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/rq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/rq",
        "<",
        "Lcom/google/android/gms/internal/bs;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lorg/json/JSONObject;

.field final synthetic b:Lcom/google/android/gms/internal/at;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/at;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/au;->b:Lcom/google/android/gms/internal/at;

    iput-object p2, p0, Lcom/google/android/gms/internal/au;->a:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/internal/au;->b:Lcom/google/android/gms/internal/at;

    iget-object v1, p0, Lcom/google/android/gms/internal/au;->a:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/at;->a(Lorg/json/JSONObject;)V

    .line 0
    return-void
.end method
