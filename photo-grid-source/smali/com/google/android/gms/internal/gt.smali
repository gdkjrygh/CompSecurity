.class public abstract Lcom/google/android/gms/internal/gt;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/q;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field protected a:Lcom/google/android/gms/internal/ry;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ry;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gt;->a:Lcom/google/android/gms/internal/ry;

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method protected final a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/ads/internal/util/client/zza;->zzJt:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/gv;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/internal/gv;-><init>(Lcom/google/android/gms/internal/gt;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    sget-object v6, Lcom/google/android/gms/ads/internal/util/client/zza;->zzJt:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/internal/gw;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/gw;-><init>(Lcom/google/android/gms/internal/gt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public abstract a(Ljava/lang/String;)Z
.end method

.method public final b()V
    .locals 0

    return-void
.end method
