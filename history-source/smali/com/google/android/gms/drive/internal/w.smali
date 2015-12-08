.class public final Lcom/google/android/gms/drive/internal/w;
.super Ljava/lang/Object;


# static fields
.field private static final Qp:Lcom/google/android/gms/internal/jp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/jp;

    const-string v1, "GmsDrive"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/jp;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/drive/internal/w;->Qp:Lcom/google/android/gms/internal/jp;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/w;->Qp:Lcom/google/android/gms/internal/jp;

    invoke-virtual {v0, p0, p2, p1}, Lcom/google/android/gms/internal/jp;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/drive/internal/w;->Qp:Lcom/google/android/gms/internal/jp;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/jp;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/w;->Qp:Lcom/google/android/gms/internal/jp;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/jp;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/w;->Qp:Lcom/google/android/gms/internal/jp;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/jp;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/internal/w;->Qp:Lcom/google/android/gms/internal/jp;

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/internal/jp;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
