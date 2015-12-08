.class public final Lcom/google/android/gms/internal/dq$a;
.super Lcom/google/android/gms/internal/dq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/dq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/dq;-><init>(Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/dq$a;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public bs()V
    .locals 0

    return-void
.end method

.method public bt()Lcom/google/android/gms/internal/dw;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/ay;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ay;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/dq$a;->mContext:Landroid/content/Context;

    new-instance v2, Lcom/google/android/gms/internal/bj;

    invoke-direct {v2}, Lcom/google/android/gms/internal/bj;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/ee;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ee;-><init>()V

    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/dx;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ay;Lcom/google/android/gms/internal/bi;Lcom/google/android/gms/internal/ed;)Lcom/google/android/gms/internal/dx;

    move-result-object v0

    return-object v0
.end method
