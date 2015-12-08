.class public Lcom/google/android/gms/internal/jd;
.super Lcom/google/android/gms/internal/jq$a;


# instance fields
.field private CR:Landroid/accounts/Account;


# direct methods
.method public constructor <init>(Landroid/accounts/Account;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/jq$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/jd;->CR:Landroid/accounts/Account;

    return-void
.end method

.method public static aT(Ljava/lang/String;)Lcom/google/android/gms/internal/jd;
    .locals 2

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    new-instance v1, Lcom/google/android/gms/internal/jd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/jd;-><init>(Landroid/accounts/Account;)V

    return-object v1

    :cond_0
    new-instance v0, Landroid/accounts/Account;

    const-string v1, "com.google"

    invoke-direct {v0, p0, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public hk()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jd;->CR:Landroid/accounts/Account;

    return-object v0
.end method
