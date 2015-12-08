.class public final Lcom/google/android/gms/internal/ax;
.super Ljava/lang/Object;


# instance fields
.field private mD:Ljava/lang/String;

.field private mE:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ax;->mD:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ax;->mE:Ljava/lang/String;

    const-string v0, "http://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html"

    iput-object v0, p0, Lcom/google/android/gms/internal/ax;->mD:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/gms/internal/ax;->mE:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public aH()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ax;->mD:Ljava/lang/String;

    return-object v0
.end method

.method public aI()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ax;->mE:Ljava/lang/String;

    return-object v0
.end method
