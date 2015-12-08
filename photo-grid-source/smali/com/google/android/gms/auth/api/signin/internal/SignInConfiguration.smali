.class public final Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private static b:I


# instance fields
.field final a:I

.field private final c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

.field private f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

.field private g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

.field private h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1f

    sput v0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->b:I

    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/b;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/signin/internal/b;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->a:I

    invoke-static {p2}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

    iput-object p5, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

    iput-object p6, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

    iput-object p7, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 0
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    check-cast p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->c:Ljava/lang/String;

    .line 1000
    iget-object v2, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->c:Ljava/lang/String;

    .line 0
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->d:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2000
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->d:Ljava/lang/String;

    .line 0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->h:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 4000
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->h:Ljava/lang/String;

    .line 0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

    if-nez v1, :cond_4

    .line 6000
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

    .line 0
    if-nez v1, :cond_0

    :goto_3
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

    if-nez v1, :cond_5

    .line 8000
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

    .line 0
    if-nez v1, :cond_0

    :goto_4
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

    if-nez v1, :cond_6

    .line 10000
    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

    .line 0
    if-nez v1, :cond_0

    :goto_5
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->d:Ljava/lang/String;

    .line 3000
    iget-object v2, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->d:Ljava/lang/String;

    .line 0
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->h:Ljava/lang/String;

    .line 5000
    iget-object v2, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->h:Ljava/lang/String;

    .line 0
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

    .line 7000
    iget-object v2, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

    .line 0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

    .line 9000
    iget-object v2, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

    .line 0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

    .line 11000
    iget-object v2, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

    .line 0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_5

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/a;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/signin/internal/a;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/internal/a;->a(Ljava/lang/Object;)Lcom/google/android/gms/auth/api/signin/internal/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/internal/a;->a(Ljava/lang/Object;)Lcom/google/android/gms/auth/api/signin/internal/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/internal/a;->a(Ljava/lang/Object;)Lcom/google/android/gms/auth/api/signin/internal/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->e:Lcom/google/android/gms/auth/api/signin/EmailSignInConfig;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/internal/a;->a(Ljava/lang/Object;)Lcom/google/android/gms/auth/api/signin/internal/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->f:Lcom/google/android/gms/auth/api/signin/GoogleSignInConfig;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/internal/a;->a(Ljava/lang/Object;)Lcom/google/android/gms/auth/api/signin/internal/a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;->g:Lcom/google/android/gms/auth/api/signin/FacebookSignInConfig;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/auth/api/signin/internal/a;->a(Ljava/lang/Object;)Lcom/google/android/gms/auth/api/signin/internal/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/internal/a;->a()I

    move-result v0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/signin/internal/b;->a(Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;Landroid/os/Parcel;I)V

    return-void
.end method
