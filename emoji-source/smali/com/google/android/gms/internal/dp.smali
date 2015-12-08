.class public final Lcom/google/android/gms/internal/dp;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/dp$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)Lcom/google/android/gms/internal/em;
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/internal/ds;->kQ:Lcom/google/android/gms/internal/ev;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ev;->sz:Z

    if-eqz v0, :cond_0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/dp;->b(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)Lcom/google/android/gms/internal/em;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/dp;->c(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)Lcom/google/android/gms/internal/em;

    move-result-object v0

    goto :goto_0
.end method

.method private static b(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)Lcom/google/android/gms/internal/em;
    .locals 1

    const-string v0, "Fetching ad response from local ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/dq$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/dq$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dq$a;->start()V

    return-object v0
.end method

.method private static c(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)Lcom/google/android/gms/internal/em;
    .locals 1

    const-string v0, "Fetching ad response from remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->z(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to connect to remote ad request service."

    invoke-static {v0}, Lcom/google/android/gms/internal/eu;->D(Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/dq$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/dq$b;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ds;Lcom/google/android/gms/internal/dp$a;)V

    goto :goto_0
.end method
