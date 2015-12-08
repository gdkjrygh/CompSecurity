.class final Lorg/apache/cordova/facebook/ConnectPlugin$1;
.super Ljava/util/HashSet;
.source "ConnectPlugin.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/facebook/ConnectPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashSet",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 55
    const-string v0, "ads_management"

    invoke-virtual {p0, v0}, Lorg/apache/cordova/facebook/ConnectPlugin$1;->add(Ljava/lang/Object;)Z

    .line 56
    const-string v0, "create_event"

    invoke-virtual {p0, v0}, Lorg/apache/cordova/facebook/ConnectPlugin$1;->add(Ljava/lang/Object;)Z

    .line 57
    const-string v0, "rsvp_event"

    invoke-virtual {p0, v0}, Lorg/apache/cordova/facebook/ConnectPlugin$1;->add(Ljava/lang/Object;)Z

    .line 58
    return-void
.end method
