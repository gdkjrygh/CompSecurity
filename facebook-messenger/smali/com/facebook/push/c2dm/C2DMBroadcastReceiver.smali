.class public Lcom/facebook/push/c2dm/C2DMBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "C2DMBroadcastReceiver.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/push/c2dm/C2DMBroadcastReceiver;

    sput-object v0, Lcom/facebook/push/c2dm/C2DMBroadcastReceiver;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 27
    new-instance v0, Lcom/google/common/a/ew;

    invoke-direct {v0}, Lcom/google/common/a/ew;-><init>()V

    const-string v1, "com.google.android.c2dm.intent.RECEIVE"

    new-instance v2, Lcom/facebook/push/c2dm/b;

    invoke-direct {v2, v3}, Lcom/facebook/push/c2dm/b;-><init>(Lcom/facebook/push/c2dm/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    const-string v1, "com.google.android.c2dm.intent.REGISTRATION"

    new-instance v2, Lcom/facebook/push/c2dm/b;

    invoke-direct {v2, v3}, Lcom/facebook/push/c2dm/b;-><init>(Lcom/facebook/push/c2dm/a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    .line 31
    return-void
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/facebook/push/c2dm/C2DMBroadcastReceiver;->a:Ljava/lang/Class;

    return-object v0
.end method
