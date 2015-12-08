.class Lcom/google/android/gms/internal/im$c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im$c;->onApplicationDisconnected(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic HI:I

.field final synthetic HJ:Lcom/google/android/gms/internal/im$c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im$c;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$c$1;->HJ:Lcom/google/android/gms/internal/im$c;

    iput p2, p0, Lcom/google/android/gms/internal/im$c$1;->HI:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/im$c$1;->HJ:Lcom/google/android/gms/internal/im$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/im$c;->HG:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im;->e(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/cast/Cast$Listener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/im$c$1;->HJ:Lcom/google/android/gms/internal/im$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/im$c;->HG:Lcom/google/android/gms/internal/im;

    invoke-static {v0}, Lcom/google/android/gms/internal/im;->e(Lcom/google/android/gms/internal/im;)Lcom/google/android/gms/cast/Cast$Listener;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/im$c$1;->HI:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/Cast$Listener;->onApplicationDisconnected(I)V

    :cond_0
    return-void
.end method
