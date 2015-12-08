.class Lorg/chromium/net/NetworkChangeNotifier$1;
.super Ljava/lang/Object;
.source "NetworkChangeNotifier.java"

# interfaces
.implements Lorg/chromium/net/NetworkChangeNotifierAutoDetect$Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/net/NetworkChangeNotifier;->setAutoDetectConnectivityStateInternal(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/net/NetworkChangeNotifier;


# direct methods
.method constructor <init>(Lorg/chromium/net/NetworkChangeNotifier;)V
    .locals 0

    .prologue
    .line 131
    iput-object p1, p0, Lorg/chromium/net/NetworkChangeNotifier$1;->this$0:Lorg/chromium/net/NetworkChangeNotifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionTypeChanged(I)V
    .locals 1
    .param p1, "newConnectionType"    # I

    .prologue
    .line 134
    iget-object v0, p0, Lorg/chromium/net/NetworkChangeNotifier$1;->this$0:Lorg/chromium/net/NetworkChangeNotifier;

    # invokes: Lorg/chromium/net/NetworkChangeNotifier;->updateCurrentConnectionType(I)V
    invoke-static {v0, p1}, Lorg/chromium/net/NetworkChangeNotifier;->access$000(Lorg/chromium/net/NetworkChangeNotifier;I)V

    .line 135
    return-void
.end method
