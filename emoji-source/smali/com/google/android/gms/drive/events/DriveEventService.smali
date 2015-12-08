.class public abstract Lcom/google/android/gms/drive/events/DriveEventService;
.super Landroid/app/IntentService;


# static fields
.field private static final Ih:Ljava/util/concurrent/LinkedBlockingDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingDeque",
            "<",
            "Lcom/google/android/gms/drive/events/DriveEvent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/events/DriveEventService;->Ih:Ljava/util/concurrent/LinkedBlockingDeque;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    const-string v0, "DriveEventService"

    invoke-direct {p0, v0}, Lcom/google/android/gms/drive/events/DriveEventService;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    invoke-direct {p0, p1}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;

    return-void
.end method

.method private a(Lcom/google/android/gms/drive/events/DriveEvent;)V
    .locals 5

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    iget-object v1, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unrecognized event: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :pswitch_0
    instance-of v1, p1, Lcom/google/android/gms/drive/events/ChangeEvent;

    const-string v2, "Unexpected event type: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/hm;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/events/ChangeEvent;

    move-object v1, v0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/drive/events/DriveEventService;->onChangeEvent(Lcom/google/android/gms/drive/events/ChangeEvent;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Service does not implement listener for type:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1}, Lcom/google/android/gms/drive/events/DriveEvent;->getType()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :pswitch_1
    :try_start_1
    instance-of v1, p1, Lcom/google/android/gms/drive/events/FileConflictEvent;

    const-string v2, "Unexpected event type: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/hm;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/drive/events/FileConflictEvent;

    move-object v1, v0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/drive/events/DriveEventService;->a(Lcom/google/android/gms/drive/events/FileConflictEvent;)V
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    iget-object v2, p0, Lcom/google/android/gms/drive/events/DriveEventService;->mName:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error handling event: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic gn()Ljava/util/concurrent/LinkedBlockingDeque;
    .locals 1

    sget-object v0, Lcom/google/android/gms/drive/events/DriveEventService;->Ih:Ljava/util/concurrent/LinkedBlockingDeque;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/drive/events/FileConflictEvent;)V
    .locals 3

    const-string v0, "DriveEventService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unhandled FileConflictEvent: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    new-instance v0, Lcom/google/android/gms/drive/events/DriveEventService$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/drive/events/DriveEventService$1;-><init>(Lcom/google/android/gms/drive/events/DriveEventService;)V

    return-object v0
.end method

.method public onChangeEvent(Lcom/google/android/gms/drive/events/ChangeEvent;)V
    .locals 3
    .param p1, "event"    # Lcom/google/android/gms/drive/events/ChangeEvent;

    .prologue
    const-string v0, "DriveEventService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unhandled ChangeEvent: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method protected final onHandleIntent(Landroid/content/Intent;)V
    .locals 2
    .param p1, "intent"    # Landroid/content/Intent;

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/drive/events/DriveEventService;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    const-string v0, "event"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/events/DriveEvent;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/drive/events/DriveEventService;->Ih:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/events/DriveEvent;

    :cond_0
    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lcom/google/android/gms/drive/events/DriveEventService;->a(Lcom/google/android/gms/drive/events/DriveEvent;)V

    :goto_0
    return-void

    :cond_1
    const-string v0, "DriveEventService"

    const-string v1, "The event queue is unexpectedly empty."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
