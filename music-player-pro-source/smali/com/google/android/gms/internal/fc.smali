.class public final Lcom/google/android/gms/internal/fc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/fc$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/fy$a;Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/cy;Lcom/google/android/gms/internal/fc$a;)Lcom/google/android/gms/internal/gf;
    .locals 6

    iget-object v0, p2, Lcom/google/android/gms/internal/fy$a;->vK:Lcom/google/android/gms/internal/fj;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/fj;->ug:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/fm;

    new-instance v3, Lcom/google/android/gms/internal/ai;

    invoke-direct {v3}, Lcom/google/android/gms/internal/ai;-><init>()V

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fm;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/u;Lcom/google/android/gms/internal/ai;Lcom/google/android/gms/internal/fy$a;Lcom/google/android/gms/internal/fc$a;)V

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/gf;->start()V

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/fd;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/fd;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/fy$a;Lcom/google/android/gms/internal/gu;Lcom/google/android/gms/internal/cy;Lcom/google/android/gms/internal/fc$a;)V

    goto :goto_0
.end method
