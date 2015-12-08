.class public Lcom/google/android/gms/auth/RecoveryDecision;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/auth/RecoveryDecisionCreator;


# instance fields
.field final iM:I

.field public isRecoveryInfoNeeded:Z

.field public isRecoveryInterstitialAllowed:Z

.field public recoveryIntent:Landroid/app/PendingIntent;

.field public recoveryIntentWithoutIntro:Landroid/app/PendingIntent;

.field public showRecoveryInterstitial:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/auth/RecoveryDecisionCreator;

    invoke-direct {v0}, Lcom/google/android/gms/auth/RecoveryDecisionCreator;-><init>()V

    sput-object v0, Lcom/google/android/gms/auth/RecoveryDecision;->CREATOR:Lcom/google/android/gms/auth/RecoveryDecisionCreator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/auth/RecoveryDecision;->iM:I

    return-void
.end method

.method constructor <init>(ILandroid/app/PendingIntent;ZZZLandroid/app/PendingIntent;)V
    .locals 0
    .param p1, "versionCode"    # I
    .param p2, "recoveryIntent"    # Landroid/app/PendingIntent;
    .param p3, "showRecoveryInterstitial"    # Z
    .param p4, "isRecoveryInfoNeeded"    # Z
    .param p5, "isRecoveryInterstitialAllowed"    # Z
    .param p6, "recoveryIntentWithoutIntro"    # Landroid/app/PendingIntent;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/auth/RecoveryDecision;->iM:I

    iput-object p2, p0, Lcom/google/android/gms/auth/RecoveryDecision;->recoveryIntent:Landroid/app/PendingIntent;

    iput-boolean p3, p0, Lcom/google/android/gms/auth/RecoveryDecision;->showRecoveryInterstitial:Z

    iput-boolean p4, p0, Lcom/google/android/gms/auth/RecoveryDecision;->isRecoveryInfoNeeded:Z

    iput-boolean p5, p0, Lcom/google/android/gms/auth/RecoveryDecision;->isRecoveryInterstitialAllowed:Z

    iput-object p6, p0, Lcom/google/android/gms/auth/RecoveryDecision;->recoveryIntentWithoutIntro:Landroid/app/PendingIntent;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getVersionCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/auth/RecoveryDecision;->iM:I

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/auth/RecoveryDecisionCreator;->a(Lcom/google/android/gms/auth/RecoveryDecision;Landroid/os/Parcel;I)V

    return-void
.end method
