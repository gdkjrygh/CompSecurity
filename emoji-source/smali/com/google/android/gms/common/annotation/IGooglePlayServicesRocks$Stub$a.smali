.class Lcom/google/android/gms/common/annotation/IGooglePlayServicesRocks$Stub$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/annotation/IGooglePlayServicesRocks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/annotation/IGooglePlayServicesRocks$Stub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private kq:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/annotation/IGooglePlayServicesRocks$Stub$a;->kq:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/annotation/IGooglePlayServicesRocks$Stub$a;->kq:Landroid/os/IBinder;

    return-object v0
.end method
