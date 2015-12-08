.class Lcom/google/android/gms/internal/gh$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gh$1;->b(Lcom/google/android/gms/internal/gj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ce:Lcom/google/android/gms/internal/gh$1;

.field final synthetic Cf:Lcom/google/android/gms/internal/gj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gh$1;Lcom/google/android/gms/internal/gj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gh$1$2;->Ce:Lcom/google/android/gms/internal/gh$1;

    iput-object p2, p0, Lcom/google/android/gms/internal/gh$1$2;->Cf:Lcom/google/android/gms/internal/gj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/gh$1$2;->Ce:Lcom/google/android/gms/internal/gh$1;

    iget-object v0, v0, Lcom/google/android/gms/internal/gh$1;->Cc:Lcom/google/android/gms/internal/gh;

    iget-object v1, p0, Lcom/google/android/gms/internal/gh$1$2;->Cf:Lcom/google/android/gms/internal/gj;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/gh;->a(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/gj;)V

    return-void
.end method
