.class public Lcom/facebook/push/c2dm/ad;
.super Ljava/lang/Object;
.source "ReregisterPushTokenCallback.java"

# interfaces
.implements Lcom/facebook/device_id/a;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/push/c2dm/C2DMRegistrar;

.field private final c:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    const-class v0, Lcom/facebook/push/c2dm/ad;

    sput-object v0, Lcom/facebook/push/c2dm/ad;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/push/c2dm/C2DMRegistrar;Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/facebook/push/c2dm/ad;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    .line 20
    iput-object p2, p0, Lcom/facebook/push/c2dm/ad;->c:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    .line 21
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/device_id/i;Lcom/facebook/device_id/i;)V
    .locals 3

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/push/c2dm/ad;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "re-registering push token due to device id changing from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/device_id/i;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/facebook/device_id/i;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lcom/facebook/push/c2dm/ad;->c:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    iget-object v1, p0, Lcom/facebook/push/c2dm/ad;->b:Lcom/facebook/push/c2dm/C2DMRegistrar;

    iget-object v1, v1, Lcom/facebook/push/c2dm/C2DMRegistrar;->a:Lcom/facebook/push/c2dm/v;

    invoke-virtual {v0, v1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/v;)V

    .line 29
    return-void
.end method
