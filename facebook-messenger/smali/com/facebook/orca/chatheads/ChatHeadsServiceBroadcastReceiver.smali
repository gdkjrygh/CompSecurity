.class public Lcom/facebook/orca/chatheads/ChatHeadsServiceBroadcastReceiver;
.super Lcom/facebook/c/k;
.source "ChatHeadsServiceBroadcastReceiver.java"


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
    .line 37
    const-class v0, Lcom/facebook/orca/chatheads/ChatHeadsServiceBroadcastReceiver;

    sput-object v0, Lcom/facebook/orca/chatheads/ChatHeadsServiceBroadcastReceiver;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 40
    invoke-static {}, Lcom/facebook/orca/chatheads/ChatHeadsServiceBroadcastReceiver;->a()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    .line 41
    return-void
.end method

.method private static a()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 44
    new-instance v0, Lcom/facebook/orca/chatheads/db;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/orca/chatheads/db;-><init>(Lcom/facebook/orca/chatheads/da;)V

    .line 45
    new-instance v1, Lcom/google/common/a/ew;

    invoke-direct {v1}, Lcom/google/common/a/ew;-><init>()V

    const-string v2, "com.facebook.orca.chatheads.ACTION_NEW_MESSAGE_NOTIFICATION"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_POPUP_CHAT_HEAD"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_OPEN_CHAT_HEAD"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_REMOVE_CHAT_HEAD"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_CLEAR_UNREAD_THREAD"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_CLEAR_ALL_UNREAD_THREADS"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_SHOW_CHATHEADS"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_HIDE_CHATHEADS"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_SET_CHATHEADS_POLICY"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v1

    const-string v2, "com.facebook.orca.chatheads.ACTION_QUERY_CHATHEADS_ENABLED"

    invoke-virtual {v1, v2, v0}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v0

    return-object v0
.end method
