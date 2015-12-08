.class Lcom/google/android/gms/wallet/fragment/WalletFragment$a;
.super Lcom/google/android/gms/internal/ll$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/fragment/WalletFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private akx:Lcom/google/android/gms/wallet/fragment/WalletFragment$OnStateChangedListener;

.field private final aky:Lcom/google/android/gms/wallet/fragment/WalletFragment;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wallet/fragment/WalletFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ll$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$a;->aky:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    return-void
.end method


# virtual methods
.method public a(IILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$a;->akx:Lcom/google/android/gms/wallet/fragment/WalletFragment$OnStateChangedListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$a;->akx:Lcom/google/android/gms/wallet/fragment/WalletFragment$OnStateChangedListener;

    iget-object v1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$a;->aky:Lcom/google/android/gms/wallet/fragment/WalletFragment;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/google/android/gms/wallet/fragment/WalletFragment$OnStateChangedListener;->onStateChanged(Lcom/google/android/gms/wallet/fragment/WalletFragment;IILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/wallet/fragment/WalletFragment$OnStateChangedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/fragment/WalletFragment$a;->akx:Lcom/google/android/gms/wallet/fragment/WalletFragment$OnStateChangedListener;

    return-void
.end method
