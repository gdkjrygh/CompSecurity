.class Lcom/google/android/gms/internal/ea$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ea;->aM()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic rG:Lcom/google/android/gms/internal/cc;

.field final synthetic rH:Lcom/google/android/gms/internal/ea;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ea;Lcom/google/android/gms/internal/cc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ea$1;->rH:Lcom/google/android/gms/internal/ea;

    iput-object p2, p0, Lcom/google/android/gms/internal/ea$1;->rG:Lcom/google/android/gms/internal/cc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ea$1;->rG:Lcom/google/android/gms/internal/cc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cc;->aM()V

    return-void
.end method
