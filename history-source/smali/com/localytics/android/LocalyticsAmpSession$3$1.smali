.class Lcom/localytics/android/LocalyticsAmpSession$3$1;
.super Ljava/lang/Object;
.source "LocalyticsAmpSession.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/localytics/android/LocalyticsAmpSession$3;->getPushRegistrationID()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/localytics/android/LocalyticsAmpSession$3;


# direct methods
.method constructor <init>(Lcom/localytics/android/LocalyticsAmpSession$3;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Lcom/localytics/android/LocalyticsAmpSession$3$1;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 433
    const/4 v6, 0x0

    .line 435
    .local v6, "cursor":Landroid/database/Cursor;
    const/4 v7, 0x0

    .line 438
    .local v7, "pushRegId":Ljava/lang/String;
    :try_start_0
    iget-object v0, p0, Lcom/localytics/android/LocalyticsAmpSession$3$1;->this$1:Lcom/localytics/android/LocalyticsAmpSession$3;

    iget-object v0, v0, Lcom/localytics/android/LocalyticsAmpSession$3;->val$provider:Lcom/localytics/android/LocalyticsProvider;

    const-string v1, "info"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/localytics/android/LocalyticsProvider;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 440
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 442
    const-string v0, "registration_id"

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v7

    .line 447
    :cond_0
    if-eqz v6, :cond_1

    .line 449
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 450
    const/4 v6, 0x0

    .line 454
    :cond_1
    return-object v7

    .line 447
    :catchall_0
    move-exception v0

    if-eqz v6, :cond_2

    .line 449
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 450
    const/4 v6, 0x0

    :cond_2
    throw v0
.end method
