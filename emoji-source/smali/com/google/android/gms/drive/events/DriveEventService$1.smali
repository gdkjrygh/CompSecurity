.class Lcom/google/android/gms/drive/events/DriveEventService$1;
.super Landroid/os/Binder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/events/DriveEventService;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ii:Lcom/google/android/gms/drive/events/DriveEventService;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/events/DriveEventService;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->Ii:Lcom/google/android/gms/drive/events/DriveEventService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method protected onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4
    .param p1, "code"    # I
    .param p2, "in"    # Landroid/os/Parcel;
    .param p3, "out"    # Landroid/os/Parcel;
    .param p4, "flags"    # I

    .prologue
    const-string v0, "DriveEventService"

    const-string v1, "onTransact"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->Ii:Lcom/google/android/gms/drive/events/DriveEventService;

    invoke-virtual {v0}, Lcom/google/android/gms/drive/events/DriveEventService;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/events/DriveEvent;

    invoke-static {}, Lcom/google/android/gms/drive/events/DriveEventService;->gn()Ljava/util/concurrent/LinkedBlockingDeque;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/concurrent/LinkedBlockingDeque;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->Ii:Lcom/google/android/gms/drive/events/DriveEventService;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->Ii:Lcom/google/android/gms/drive/events/DriveEventService;

    iget-object v3, p0, Lcom/google/android/gms/drive/events/DriveEventService$1;->Ii:Lcom/google/android/gms/drive/events/DriveEventService;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/events/DriveEventService;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const/4 v0, 0x1

    return v0
.end method
