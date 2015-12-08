.class public Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:[Lcom/google/android/gms/auth/firstparty/shared/ScopeDetail;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Ljava/lang/String;

.field private final f:Landroid/accounts/Account;

.field private final g:Z

.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/api/consent/a;

    invoke-direct {v0}, Lcom/google/android/gms/auth/api/consent/a;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;ILjava/lang/String;Landroid/accounts/Account;[Lcom/google/android/gms/auth/firstparty/shared/ScopeDetail;ZI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->b:I

    iput-object p2, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->c:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->d:I

    iput-object p4, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->e:Ljava/lang/String;

    invoke-static {p5}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/accounts/Account;

    iput-object v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->f:Landroid/accounts/Account;

    iput-object p6, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->a:[Lcom/google/android/gms/auth/firstparty/shared/ScopeDetail;

    iput-boolean p7, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->g:Z

    iput p8, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->h:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->b:I

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->d:I

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->e:Ljava/lang/String;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()Landroid/accounts/Account;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->f:Landroid/accounts/Account;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->g:Z

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;->h:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/api/consent/a;->a(Lcom/google/android/gms/auth/api/consent/GetConsentIntentRequest;Landroid/os/Parcel;I)V

    return-void
.end method
