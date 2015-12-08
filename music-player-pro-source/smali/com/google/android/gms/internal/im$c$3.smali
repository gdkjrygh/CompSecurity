.class Lcom/google/android/gms/internal/im$c$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/im$c;->b(Lcom/google/android/gms/internal/ij;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic HJ:Lcom/google/android/gms/internal/im$c;

.field final synthetic HL:Lcom/google/android/gms/internal/ij;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/im$c;Lcom/google/android/gms/internal/ij;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/im$c$3;->HJ:Lcom/google/android/gms/internal/im$c;

    iput-object p2, p0, Lcom/google/android/gms/internal/im$c$3;->HL:Lcom/google/android/gms/internal/ij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/im$c$3;->HJ:Lcom/google/android/gms/internal/im$c;

    iget-object v0, v0, Lcom/google/android/gms/internal/im$c;->HG:Lcom/google/android/gms/internal/im;

    iget-object v1, p0, Lcom/google/android/gms/internal/im$c$3;->HL:Lcom/google/android/gms/internal/ij;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/im;->a(Lcom/google/android/gms/internal/im;Lcom/google/android/gms/internal/ij;)V

    return-void
.end method
