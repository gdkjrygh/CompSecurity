.class public interface abstract Lcom/qihoo360/i/v1/main/pt/IPtManager;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/i/IModule;


# static fields
.field public static final ACTION_REQUEST_FINISH:Ljava/lang/String; = "com.qihoo360.mobilesafe.request_root_finish"


# virtual methods
.method public abstract bindRtService(Landroid/content/Context;Landroid/content/ServiceConnection;)Z
.end method

.method public abstract dismissConn(Landroid/content/Context;Landroid/os/IBinder;)V
.end method

.method public abstract exec(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)[B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation
.end method

.method public abstract execp(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/ArrayList;)[B
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation
.end method

.method public abstract execve(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation
.end method

.method public abstract execvp(Landroid/os/IBinder;Ljava/lang/String;Ljava/util/List;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation
.end method

.method public abstract getRtConn(Landroid/content/Context;)Landroid/os/IBinder;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public abstract isPhoneRted()Z
.end method

.method public abstract isRtServiceRunning()Z
.end method

.method public abstract requestRtAuth(Landroid/content/Context;)V
.end method

.method public abstract unBindRtService(Landroid/content/Context;Landroid/content/ServiceConnection;)V
.end method
