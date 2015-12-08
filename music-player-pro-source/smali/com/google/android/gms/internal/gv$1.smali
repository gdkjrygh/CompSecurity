.class Lcom/google/android/gms/internal/gv$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gv;->cg()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic xl:Lcom/google/android/gms/internal/dp;

.field final synthetic xm:Lcom/google/android/gms/internal/gv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gv;Lcom/google/android/gms/internal/dp;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gv$1;->xm:Lcom/google/android/gms/internal/gv;

    iput-object p2, p0, Lcom/google/android/gms/internal/gv$1;->xl:Lcom/google/android/gms/internal/dp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gv$1;->xl:Lcom/google/android/gms/internal/dp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dp;->cg()V

    return-void
.end method
