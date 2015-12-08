.class public final Lcom/google/android/gms/internal/a;
.super Lcom/google/android/gms/internal/xm;


# instance fields
.field private b:Landroid/content/Intent;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/xm;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/pl;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/xm;-><init>(Lcom/google/android/gms/internal/pl;)V

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/a;->b:Landroid/content/Intent;

    if-eqz v0, :cond_0

    const-string v0, "User needs to (re)enter credentials."

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/xm;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
