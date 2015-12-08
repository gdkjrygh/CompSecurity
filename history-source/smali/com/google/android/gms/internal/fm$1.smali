.class Lcom/google/android/gms/internal/fm$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/fm;->cx()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic tG:Lcom/google/android/gms/internal/fy;

.field final synthetic uk:Lcom/google/android/gms/internal/fm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/fm;Lcom/google/android/gms/internal/fy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/fm$1;->uk:Lcom/google/android/gms/internal/fm;

    iput-object p2, p0, Lcom/google/android/gms/internal/fm$1;->tG:Lcom/google/android/gms/internal/fy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/fm$1;->uk:Lcom/google/android/gms/internal/fm;

    invoke-static {v0}, Lcom/google/android/gms/internal/fm;->a(Lcom/google/android/gms/internal/fm;)Lcom/google/android/gms/internal/fc$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/fm$1;->tG:Lcom/google/android/gms/internal/fy;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/fc$a;->a(Lcom/google/android/gms/internal/fy;)V

    return-void
.end method
