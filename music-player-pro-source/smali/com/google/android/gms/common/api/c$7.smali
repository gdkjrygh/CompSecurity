.class Lcom/google/android/gms/common/api/c$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/common/api/c;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/f;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic GB:Lcom/google/android/gms/common/api/GoogleApiClient;

.field final synthetic Kn:Lcom/google/android/gms/common/api/c;

.field final synthetic Kq:Lcom/google/android/gms/common/api/f;

.field final synthetic Kr:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/c;Lcom/google/android/gms/common/api/f;ZLcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/c$7;->Kn:Lcom/google/android/gms/common/api/c;

    iput-object p2, p0, Lcom/google/android/gms/common/api/c$7;->Kq:Lcom/google/android/gms/common/api/f;

    iput-boolean p3, p0, Lcom/google/android/gms/common/api/c$7;->Kr:Z

    iput-object p4, p0, Lcom/google/android/gms/common/api/c$7;->GB:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public j(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$7;->Kn:Lcom/google/android/gms/common/api/c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$7;->Kn:Lcom/google/android/gms/common/api/c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/c;->reconnect()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/c$7;->Kq:Lcom/google/android/gms/common/api/f;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/f;->b(Lcom/google/android/gms/common/api/Result;)V

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/c$7;->Kr:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$7;->GB:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    :cond_1
    return-void
.end method

.method public synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/common/api/Result;

    .prologue
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .end local p1    # "x0":Lcom/google/android/gms/common/api/Result;
    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/c$7;->j(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
