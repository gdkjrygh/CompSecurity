.class public final Lcom/google/android/gms/appdatasearch/b;
.super Lcom/google/android/gms/internal/to;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/to",
        "<",
        "Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;",
        "Lcom/google/android/gms/internal/th;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Request;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Request;Lcom/google/android/gms/common/api/h;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/appdatasearch/e;->a:Lcom/google/android/gms/common/api/d;

    invoke-direct {p0, v0, p2}, Lcom/google/android/gms/internal/to;-><init>(Lcom/google/android/gms/common/api/d;Lcom/google/android/gms/common/api/h;)V

    iput-object p1, p0, Lcom/google/android/gms/appdatasearch/b;->b:Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Request;

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/r;
    .locals 1

    .prologue
    .line 3000
    new-instance v0, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;

    invoke-direct {v0}, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;-><init>()V

    iput-object p1, v0, Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Response;->a:Lcom/google/android/gms/common/api/Status;

    .line 0
    return-object v0
.end method

.method protected final synthetic a(Lcom/google/android/gms/common/api/c;)V
    .locals 3

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/th;

    .line 2000
    invoke-virtual {p1}, Lcom/google/android/gms/internal/th;->zzpc()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ta;

    .line 1000
    iget-object v1, p0, Lcom/google/android/gms/appdatasearch/b;->b:Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Request;

    new-instance v2, Lcom/google/android/gms/appdatasearch/c;

    invoke-direct {v2, p0, p0}, Lcom/google/android/gms/appdatasearch/c;-><init>(Lcom/google/android/gms/appdatasearch/b;Lcom/google/android/gms/internal/tp;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ta;->a(Lcom/google/android/gms/appdatasearch/GetRecentContextCall$Request;Lcom/google/android/gms/internal/td;)V

    .line 0
    return-void
.end method
